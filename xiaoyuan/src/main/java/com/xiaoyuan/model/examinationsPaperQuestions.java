package com.xiaoyuan.model;

public class examinationsPaperQuestions {
    private Integer id;

    private Integer paperid;

    private String title;

    private String questioncode;

    private String answer;

    private Double questionscore;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getQuestioncode() {
        return questioncode;
    }

    public void setQuestioncode(String questioncode) {
        this.questioncode = questioncode == null ? null : questioncode.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Double getQuestionscore() {
        return questionscore;
    }

    public void setQuestionscore(Double questionscore) {
        this.questionscore = questionscore;
    }
}