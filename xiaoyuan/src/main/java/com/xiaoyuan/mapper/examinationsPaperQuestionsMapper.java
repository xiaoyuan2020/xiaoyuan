package com.xiaoyuan.mapper;

import com.xiaoyuan.model.examinationsPaperQuestions;

public interface examinationsPaperQuestionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(examinationsPaperQuestions record);

    int insertSelective(examinationsPaperQuestions record);

    examinationsPaperQuestions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(examinationsPaperQuestions record);

    int updateByPrimaryKey(examinationsPaperQuestions record);
}