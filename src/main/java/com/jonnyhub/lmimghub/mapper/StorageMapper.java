package com.jonnyhub.lmimghub.mapper;

import java.util.List;

import com.jonnyhub.lmimghub.entity.StorageEntity;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageMapper extends BaseMapper<StorageEntity> {
    int updateBatch(List<StorageEntity> list);

    int updateBatchSelective(List<StorageEntity> list);

    int batchInsert(@Param("list") List<StorageEntity> list);

    int insertOrUpdate(StorageEntity record);

    int insertOrUpdateSelective(StorageEntity record);
}