package com.xiaoyuan.mapper;

import com.xiaoyuan.model.Subjects;

public interface SubjectsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Subjects record);

    int insertSelective(Subjects record);

    Subjects selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Subjects record);

    int updateByPrimaryKey(Subjects record);
}