package com.jonnyhub.lmimghub.mapper;

import java.util.List;

import com.jonnyhub.lmimghub.entity.ImginfoEntity;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ImginfoMapper extends BaseMapper<ImginfoEntity> {
    int updateBatch(List<ImginfoEntity> list);

    int updateBatchSelective(List<ImginfoEntity> list);

    int batchInsert(@Param("list") List<ImginfoEntity> list);

    int insertOrUpdate(ImginfoEntity record);

    int insertOrUpdateSelective(ImginfoEntity record);
}