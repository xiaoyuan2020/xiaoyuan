package com.xiaoyuan.mapper;

import com.xiaoyuan.model.ExaminationsPaper;

public interface ExaminationsPaperMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExaminationsPaper record);

    int insertSelective(ExaminationsPaper record);

    ExaminationsPaper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExaminationsPaper record);

    int updateByPrimaryKey(ExaminationsPaper record);
}