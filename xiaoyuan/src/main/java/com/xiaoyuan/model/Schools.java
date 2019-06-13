package com.xiaoyuan.model;

import java.util.Date;

public class Schools {
    private Integer id;

    private Date creatTime;

    private byte[] name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public byte[] getName() {
        return name;
    }

    public void setName(byte[] name) {
        this.name = name;
    }
}