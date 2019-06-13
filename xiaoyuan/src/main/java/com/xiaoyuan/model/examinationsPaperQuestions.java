package com.xiaoyuan.model;

public class examinationsPaperQuestions {
    private Integer id;

    private Integer paperId;

    private String title;

    private String questionCode;

    private String answer;

    private Double questionScore;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getQuestionCode() {
        return questionCode;
    }

    public void setQuestionCode(String questionCode) {
        this.questionCode = questionCode == null ? null : questionCode.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Double getQuestionScore() {
        return questionScore;
    }

    public void setQuestionScore(Double questionScore) {
        this.questionScore = questionScore;
    }
}