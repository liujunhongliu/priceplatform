package com.jk.model;

public class PrizeBean {

    private Integer prizeId;
    private String prizeName;
    private Integer prizeNumber;

    public Integer getPrizeId() {
        return prizeId;
    }

    public void setPrizeId(Integer prizeId) {
        this.prizeId = prizeId;
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public Integer getPrizeNumber() {
        return prizeNumber;
    }

    public void setPrizeNumber(Integer prizeNumber) {
        this.prizeNumber = prizeNumber;
    }

    @Override
    public String toString() {
        return "PrizeBean{" +
                "prizeId=" + prizeId +
                ", prizeName='" + prizeName + '\'' +
                ", prizeNumber=" + prizeNumber +
                '}';
    }
}
