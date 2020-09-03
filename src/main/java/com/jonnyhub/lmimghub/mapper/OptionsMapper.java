package com.jonnyhub.lmimghub.mapper;

import java.util.List;

import com.jonnyhub.lmimghub.entity.OptionsEntity;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OptionsMapper extends BaseMapper<OptionsEntity> {
    int updateBatch(List<OptionsEntity> list);

    int updateBatchSelective(List<OptionsEntity> list);

    int batchInsert(@Param("list") List<OptionsEntity> list);

    int insertOrUpdate(OptionsEntity record);

    int insertOrUpdateSelective(OptionsEntity record);
}