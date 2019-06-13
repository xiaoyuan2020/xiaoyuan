package com.xiaoyuan.model;

public class ExaminationsPaper {
    private Integer id;

    private String paperName;

    private Integer paperScore;

    private Integer examinationsId;

    private Integer subjectsId;

    private String imageUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName == null ? null : paperName.trim();
    }

    public Integer getPaperScore() {
        return paperScore;
    }

    public void setPaperScore(Integer paperScore) {
        this.paperScore = paperScore;
    }

    public Integer getExaminationsId() {
        return examinationsId;
    }

    public void setExaminationsId(Integer examinationsId) {
        this.examinationsId = examinationsId;
    }

    public Integer getSubjectsId() {
        return subjectsId;
    }

    public void setSubjectsId(Integer subjectsId) {
        this.subjectsId = subjectsId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }
}