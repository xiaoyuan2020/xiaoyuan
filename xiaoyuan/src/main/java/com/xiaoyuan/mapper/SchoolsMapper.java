package com.xiaoyuan.mapper;

import com.xiaoyuan.model.Schools;

public interface SchoolsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Schools record);

    int insertSelective(Schools record);

    Schools selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Schools record);

    int updateByPrimaryKeyWithBLOBs(Schools record);

    int updateByPrimaryKey(Schools record);
}