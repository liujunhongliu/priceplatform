package com.jk.model.bone;

/**
 * 定制需求的发布范围实体类
 */
public class IssueRangeBean {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 发布范围
     */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IssueRangeBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
