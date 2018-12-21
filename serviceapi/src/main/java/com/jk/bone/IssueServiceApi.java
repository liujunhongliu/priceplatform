package com.jk.bone;

import com.jk.model.bone.EquipmentBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface IssueServiceApi {

    /**
     * 查询发布定制需求页面：定制需求的发布范围的下拉框
     *
     * @return
     */
    /*@GetMapping("findIssueRangeSelect")
    List<IssueRangeBean> findIssueRangeSelect();*/

    /**
     * 查询发布定制需求页面：根据主键id，查询定制产品所属类目，共四级，第一级为发布范围的下拉框
     * @param id
     */
    @GetMapping("findEquipmentSelectGetById")
    List<EquipmentBean> findEquipmentSelectGetById(@RequestParam(value="id") String id);
}
