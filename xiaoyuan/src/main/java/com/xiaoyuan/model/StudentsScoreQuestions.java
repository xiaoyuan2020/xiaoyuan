package com.xiaoyuan.model;

public class StudentsScoreQuestions {
    private Integer id;

    private Integer studentid;

    private Integer paperid;

    private Integer questionid;

    private Double questionscore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getPaperid() {
        return paperid;
    }

    public void setPaperid(Integer paperid) {
        this.paperid = paperid;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public Double getQuestionscore() {
        return questionscore;
    }

    public void setQuestionscore(Double questionscore) {
        this.questionscore = questionscore;
    }
}