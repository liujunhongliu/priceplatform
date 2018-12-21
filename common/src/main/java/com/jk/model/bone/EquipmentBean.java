package com.jk.model.bone;

/**
 * 定制产品所属类目的实体类
 */
public class EquipmentBean {

    /**
     * 主键id
     */
    private String id;

    /**
     * 类目名称
     */
    private String name;

    /**
     * 父级id
     */
    private String pid;

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

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "EquipmentBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pid='" + pid + '\'' +
                '}';
    }
}
