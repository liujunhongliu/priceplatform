package com.jk.service.bone;

import com.jk.mapper.bone.IssueMapper;
import com.jk.model.bone.EquipmentBean;
import com.jk.model.bone.ProductBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueServiceImpl implements IssueService{

    @Autowired
    private IssueMapper issueMapper;

    /**
     * 查询发布定制需求页面：定制需求的发布范围的下拉框
     * @return
     */
    /*@Override
    public List<IssueRangeBean> findIssueRangeSelect() {
        return issueMapper.findIssueRangeSelect();
    }*/

    /**
     * 查询发布定制需求页面：根据主键id，查询定制产品所属类目，共四级，第一级为发布范围的下拉框
     * @param id
     * @return
     */
    @Override
    public List<EquipmentBean> findEquipmentSelectGetById(String id) {
        return issueMapper.findEquipmentSelectGetById(id);
    }

    /**
     * 填写定制产品信息
     * @param productBean
     * @return void
     */
    @Override
    public void saveProduct(ProductBean productBean) {
        issueMapper.saveProduct(productBean);
    }
}
