package com.xiaoyuan.model;

public class StudentsScorePaper {
    private Integer id;

    private Integer paperid;

    private Integer studentid;

    private Float paperscore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPaperid() {
        return paperid;
    }

    public void setPaperid(Integer paperid) {
        this.paperid = paperid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Float getPaperscore() {
        return paperscore;
    }

    public void setPaperscore(Float paperscore) {
        this.paperscore = paperscore;
    }
}