package com.jk.service.bone;

import com.jk.model.bone.EquipmentBean;
import com.jk.model.bone.ProductBean;

import java.util.List;

public interface IssueService {

    /**
     * 查询发布定制需求页面：定制需求的发布范围的下拉框
     * @return
     */
    /*List<IssueRangeBean> findIssueRangeSelect();*/

    /**
     * 查询发布定制需求页面：根据主键id，查询定制产品所属类目，共四级，第一级为发布范围的下拉框
     * @param id
     * @return List<EquipmentBean>
     */
    List<EquipmentBean> findEquipmentSelectGetById(String id);

    /**
     * 填写定制产品信息
     * @param productBean
     * @return void
     */
    void saveProduct(ProductBean productBean);
}
