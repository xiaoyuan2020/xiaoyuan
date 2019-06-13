package com.xiaoyuan.mapper;

import com.xiaoyuan.model.StudentsScoreQuestions;

public interface StudentsScoreQuestionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentsScoreQuestions record);

    int insertSelective(StudentsScoreQuestions record);

    StudentsScoreQuestions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentsScoreQuestions record);

    int updateByPrimaryKey(StudentsScoreQuestions record);
}