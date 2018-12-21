package com.jk.model.customprice;

import lombok.Data;

@Data
public class CustomPriceBean {
    /**
     * 主键id
     */
    private Integer id;
    /**
     *项目编码
     */
    private String projectNumber;
    /**
     *项目名称
     */
    private String projectName;
    /**
     *采购商名称
     */
    private String buyerName;
    /**
     *供应商名称
     */
    private String providerName;
    /**
     *参与数/总数
     */
    private String sumNumber;
    /**
     *平均结算价
     */
    private Double avgJsprice;
    /**
     *成交结算价
     */
    private Double chjJsprice;
    /**
     *平均交易价
     */
    private Double avgJyprice;
    /**
     *成交交易价
     */
    private Double chjJyprice;
    /**
     *发布时间
     */
    private String fbDate;
    /**
     * 项目状态
     */
    private Integer xmStatus;
    /**
     *一级类目
     */
    private Integer firstType;
    /**
     *二级类目
     */
    private Integer secondType;
    /**
     *三级类目
     */
    private Integer threeType;
    /**
     * 分页的页数
     */
    private Integer page;
    /**
     * 分页的每页条数
     */
    private Integer rows;




}
