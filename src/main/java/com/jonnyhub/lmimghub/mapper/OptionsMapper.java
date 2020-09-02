package com.jonnyhub.lmimghub.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jonnyhub.lmimghub.model.Options;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OptionsMapper{
    int updateBatch(List<Options> list);

    int updateBatchSelective(List<Options> list);

    int batchInsert(@Param("list") List<Options> list);

    int insertOrUpdate(Options record);

    int insertOrUpdateSelective(Options record);
}