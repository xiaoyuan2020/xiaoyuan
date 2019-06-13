package com.xiaoyuan.mapper;

import com.xiaoyuan.model.ExaminationsClassesRelations;

public interface ExaminationsClassesRelationsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExaminationsClassesRelations record);

    int insertSelective(ExaminationsClassesRelations record);

    ExaminationsClassesRelations selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExaminationsClassesRelations record);

    int updateByPrimaryKey(ExaminationsClassesRelations record);
}