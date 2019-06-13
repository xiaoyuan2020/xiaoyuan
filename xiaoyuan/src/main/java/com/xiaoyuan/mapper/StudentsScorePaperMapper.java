package com.xiaoyuan.mapper;

import com.xiaoyuan.model.StudentsScorePaper;

public interface StudentsScorePaperMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentsScorePaper record);

    int insertSelective(StudentsScorePaper record);

    StudentsScorePaper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentsScorePaper record);

    int updateByPrimaryKey(StudentsScorePaper record);
}