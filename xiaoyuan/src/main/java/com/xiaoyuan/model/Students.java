package com.xiaoyuan.model;

public class Students {
    private Integer id;

    private String name;

    private String chsi;

    private Integer classid;

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
        this.name = name == null ? null : name.trim();
    }

    public String getChsi() {
        return chsi;
    }

    public void setChsi(String chsi) {
        this.chsi = chsi == null ? null : chsi.trim();
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }
}