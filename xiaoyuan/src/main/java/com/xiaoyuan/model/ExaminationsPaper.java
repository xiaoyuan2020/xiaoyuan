package com.xiaoyuan.model;

public class ExaminationsPaper {
    private Integer id;

    private String papername;

    private Integer paperscore;

    private Integer examinationsid;

    private Integer subjectsid;

    private String imageurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPapername() {
        return papername;
    }

    public void setPapername(String papername) {
        this.papername = papername == null ? null : papername.trim();
    }

    public Integer getPaperscore() {
        return paperscore;
    }

    public void setPaperscore(Integer paperscore) {
        this.paperscore = paperscore;
    }

    public Integer getExaminationsid() {
        return examinationsid;
    }

    public void setExaminationsid(Integer examinationsid) {
        this.examinationsid = examinationsid;
    }

    public Integer getSubjectsid() {
        return subjectsid;
    }

    public void setSubjectsid(Integer subjectsid) {
        this.subjectsid = subjectsid;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }
}