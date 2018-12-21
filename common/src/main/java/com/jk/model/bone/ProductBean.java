package com.jk.model.bone;


public class ProductBean{

    /**
     * 主键id
     */
    private String id;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 所属渠道及类目id
     */
    private String equipmentId;

    /**
     * 采购数量
     */
    private Integer count;

    /**
     * 产品类别(value值为String类型)
     */
    private String type;

    /**
     * 进口压力最小值
     */
    private String inletMin;

    /**
     * 进口压力最大值
     */
    private String inletMax;

    /**
     * 出口压力最小值
     */
    private String outletMin;

    /**
     * 出口压力最大值
     */
    private String outletMax;

    /**
     * 压力单位(1:kpa 2:mpa)
     */
    private Integer unit;

    /**
     * 流量计长度
     */
    private String flowmeter;

    /**
     * 调压器
     */
    private String voltageRegulator;

    /**
     * 外箱(1:有 2:无)
     */
    private Integer outerBox;

    /**
     * 外箱材质
     */
    private String outeBoxTexture;

    /**
     * 备注
     */
    private String detail;

    /**
     * 附件
     */
    private String file;

    /**
     * 需求类型(1:产品询价 2:询设计方案)
     */
    private Integer demandType;

    /**
     * 登录用户id
     */
    private String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInletMin() {
        return inletMin;
    }

    public void setInletMin(String inletMin) {
        this.inletMin = inletMin;
    }

    public String getInletMax() {
        return inletMax;
    }

    public void setInletMax(String inletMax) {
        this.inletMax = inletMax;
    }

    public String getOutletMin() {
        return outletMin;
    }

    public void setOutletMin(String outletMin) {
        this.outletMin = outletMin;
    }

    public String getOutletMax() {
        return outletMax;
    }

    public void setOutletMax(String outletMax) {
        this.outletMax = outletMax;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public String getFlowmeter() {
        return flowmeter;
    }

    public void setFlowmeter(String flowmeter) {
        this.flowmeter = flowmeter;
    }

    public String getVoltageRegulator() {
        return voltageRegulator;
    }

    public void setVoltageRegulator(String voltageRegulator) {
        this.voltageRegulator = voltageRegulator;
    }

    public Integer getOuterBox() {
        return outerBox;
    }

    public void setOuterBox(Integer outerBox) {
        this.outerBox = outerBox;
    }

    public String getOuteBoxTexture() {
        return outeBoxTexture;
    }

    public void setOuteBoxTexture(String outeBoxTexture) {
        this.outeBoxTexture = outeBoxTexture;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Integer getDemandType() {
        return demandType;
    }

    public void setDemandType(Integer demandType) {
        this.demandType = demandType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ProductBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", equipmentId='" + equipmentId + '\'' +
                ", count=" + count +
                ", type='" + type + '\'' +
                ", inletMin='" + inletMin + '\'' +
                ", inletMax='" + inletMax + '\'' +
                ", outletMin='" + outletMin + '\'' +
                ", outletMax='" + outletMax + '\'' +
                ", unit=" + unit +
                ", flowmeter='" + flowmeter + '\'' +
                ", voltageRegulator='" + voltageRegulator + '\'' +
                ", outerBox=" + outerBox +
                ", outeBoxTexture='" + outeBoxTexture + '\'' +
                ", detail='" + detail + '\'' +
                ", file='" + file + '\'' +
                ", demandType=" + demandType +
                ", userId='" + userId + '\'' +
                '}';
    }
}
