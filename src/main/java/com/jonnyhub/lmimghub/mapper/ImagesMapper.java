package com.jonnyhub.lmimghub.mapper;

import java.util.List;

import com.jonnyhub.lmimghub.entity.ImagesEntity;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ImagesMapper extends BaseMapper<ImagesEntity> {
    int updateBatch(List<ImagesEntity> list);

    int batchInsert(@Param("list") List<ImagesEntity> list);

    int insertOrUpdate(ImagesEntity record);

    int insertOrUpdateSelective(ImagesEntity record);
}