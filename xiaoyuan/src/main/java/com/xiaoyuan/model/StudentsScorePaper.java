package com.xiaoyuan.model;

public class StudentsScorePaper {
    private Integer id;

    private Integer paperId;

    private Integer studentsId;

    private Float paperScore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getStudentsId() {
        return studentsId;
    }

    public void setStudentsId(Integer studentsId) {
        this.studentsId = studentsId;
    }

    public Float getPaperScore() {
        return paperScore;
    }

    public void setPaperScore(Float paperScore) {
        this.paperScore = paperScore;
    }
}