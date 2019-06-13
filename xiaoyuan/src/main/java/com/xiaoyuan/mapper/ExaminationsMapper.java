package com.xiaoyuan.mapper;

import com.xiaoyuan.model.Examinations;

public interface ExaminationsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Examinations record);

    int insertSelective(Examinations record);

    Examinations selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Examinations record);

    int updateByPrimaryKey(Examinations record);
}