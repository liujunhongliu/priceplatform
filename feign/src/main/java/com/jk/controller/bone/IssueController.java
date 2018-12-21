package com.jk.controller.bone;

import com.alibaba.fastjson.JSON;
import com.jk.model.bone.EquipmentBean;
import com.jk.model.bone.IssueRangeBean;
import com.jk.model.bone.ProductBean;
import com.jk.service.bone.IssueServiceFeign;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("bone")
public class IssueController {

    @Autowired
    private IssueServiceFeign issueServiceFeign;

    //注入rabbitMq工具类
    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 查询发布定制需求页面：定制需求的发布范围的下拉框
     * @return issueRangeSelect
     */
    /*@RequestMapping("findIssueRangeSelect")
    @ResponseBody
    public List<IssueRangeBean> findIssueRangeSelect(){
        List<IssueRangeBean> issueRangeSelect = issueServiceFeign.findIssueRangeSelect();
        return issueRangeSelect;
    }*/

    /**
     * 查询发布定制需求页面：根据主键id，查询定制产品所属类目，共四级，第一级为发布范围的下拉框
     * @param id
     * @return List<EquipmentBean>
     */
    @RequestMapping("findEquipmentSelectGetById")
    @ResponseBody
    public List<EquipmentBean> findEquipmentSelectGetById(String id){
        List<EquipmentBean> equipmentSelectGetById = issueServiceFeign.findEquipmentSelectGetById(id);
        return equipmentSelectGetById;
    }

    /**
     * 填写定制产品信息
     * @param productBean
     * @return void
     */
    @RequestMapping("saveProduct")
    @ResponseBody
    public void saveProduct(ProductBean productBean){
        String productString = JSON.toJSONString(productBean);
        amqpTemplate.convertAndSend("myqueue",productString);
    }
}
