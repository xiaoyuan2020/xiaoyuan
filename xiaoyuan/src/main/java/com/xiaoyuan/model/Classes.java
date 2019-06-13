package com.xiaoyuan.model;

import java.util.Date;

public class Classes {
    private Integer id;

    private String name;

    private Integer schoolsid;

    private Integer schoolyear;

    private Integer grade;

    private Date createtime;

    private Integer createuid;

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

    public Integer getSchoolsid() {
        return schoolsid;
    }

    public void setSchoolsid(Integer schoolsid) {
        this.schoolsid = schoolsid;
    }

    public Integer getSchoolyear() {
        return schoolyear;
    }

    public void setSchoolyear(Integer schoolyear) {
        this.schoolyear = schoolyear;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCreateuid() {
        return createuid;
    }

    public void setCreateuid(Integer createuid) {
        this.createuid = createuid;
    }
}