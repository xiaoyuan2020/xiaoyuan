package com.xiaoyuan.model;

public class ExaminationsClassesRelations {
    private Integer id;

    private Integer examinationsId;

    private Integer classesId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExaminationsId() {
        return examinationsId;
    }

    public void setExaminationsId(Integer examinationsId) {
        this.examinationsId = examinationsId;
    }

    public Integer getClassesId() {
        return classesId;
    }

    public void setClassesId(Integer classesId) {
        this.classesId = classesId;
    }
}