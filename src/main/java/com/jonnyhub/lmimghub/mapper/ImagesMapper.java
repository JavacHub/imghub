package com.jonnyhub.lmimghub.mapper;

import java.util.List;

import com.jonnyhub.lmimghub.model.Images;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ImagesMapper extends BaseMapper<Images> {
    int updateBatch(List<Images> list);

    int batchInsert(@Param("list") List<Images> list);

    int insertOrUpdate(Images record);

    int insertOrUpdateSelective(Images record);
}