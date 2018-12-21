package com.jk.controller.bone;

import com.alibaba.fastjson.JSON;
import com.jk.bone.IssueServiceApi;
import com.jk.model.bone.EquipmentBean;
import com.jk.model.bone.ProductBean;
import com.jk.service.bone.IssueService;
import net.sf.json.JSONObject;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class IssueController implements IssueServiceApi {

    @Autowired
    private IssueService issueService;

    /**
     * 查询发布定制需求页面：定制需求的发布范围的下拉框
     * @return
     */
    /*@Override
    public List<IssueRangeBean> findIssueRangeSelect() {
        return issueService.findIssueRangeSelect();
    }*/

    /**
     * 查询发布定制需求页面：根据主键id，查询定制产品所属类目，共四级，第一级为发布范围的下拉框
     * @param id
     * @return
     */
    @Override
    public List<EquipmentBean> findEquipmentSelectGetById(String id) {
        return issueService.findEquipmentSelectGetById(id);
    }

    /**
     * 填写定制产品信息
     * @param message
     * @return void
     */
    @RabbitListener(queues = "myqueue")
    public void saveProduct(String message){
        JSONObject jsonObject = JSONObject.fromObject(message);
        ProductBean productBean = (ProductBean)JSONObject.toBean(jsonObject, ProductBean.class);
        //ProductBean productBean = JSON.parseObject(message, ProductBean.class);
        issueService.saveProduct(productBean);
    }
}
