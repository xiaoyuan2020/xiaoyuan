package com.xiaoyuan.model;

public class StudentsScoreQuestions {
    private Integer id;

    private Integer studentsId;

    private Integer paperId;

    private Integer questionsId;

    private Double questionsScore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentsId() {
        return studentsId;
    }

    public void setStudentsId(Integer studentsId) {
        this.studentsId = studentsId;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getQuestionsId() {
        return questionsId;
    }

    public void setQuestionsId(Integer questionsId) {
        this.questionsId = questionsId;
    }

    public Double getQuestionsScore() {
        return questionsScore;
    }

    public void setQuestionsScore(Double questionsScore) {
        this.questionsScore = questionsScore;
    }
}