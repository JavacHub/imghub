package com.jonnyhub.lmimghub.mapper;

import java.util.List;

import com.jonnyhub.lmimghub.model.Imginfo;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ImginfoMapper extends BaseMapper<Imginfo> {
    int updateBatch(List<Imginfo> list);

    int updateBatchSelective(List<Imginfo> list);

    int batchInsert(@Param("list") List<Imginfo> list);

    int insertOrUpdate(Imginfo record);

    int insertOrUpdateSelective(Imginfo record);
}