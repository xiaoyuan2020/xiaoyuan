package com.xiaoyuan.model;

public class Teachers {
    private Integer id;

    private String name;

    private Integer type;

    private Integer subjectsId;

    private Integer schoolsId;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSubjectsId() {
        return subjectsId;
    }

    public void setSubjectsId(Integer subjectsId) {
        this.subjectsId = subjectsId;
    }

    public Integer getSchoolsId() {
        return schoolsId;
    }

    public void setSchoolsId(Integer schoolsId) {
        this.schoolsId = schoolsId;
    }
}