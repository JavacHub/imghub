package com.jonnyhub.lmimghub.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jonnyhub.lmimghub.model.Imginfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ImginfoMapper extends BaseMapper<Imginfo>, BaseMapper {
    int updateBatch(List<Imginfo> list);

    int updateBatchSelective(List<Imginfo> list);

    int batchInsert(@Param("list") List<Imginfo> list);

    int insertOrUpdate(Imginfo record);

    int insertOrUpdateSelective(Imginfo record);
}