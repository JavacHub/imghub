package com.jonnyhub.lmimghub.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jonnyhub.lmimghub.model.Storage;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageMapper extends BaseMapper<Storage>, BaseMapper {
    int updateBatch(List<Storage> list);

    int updateBatchSelective(List<Storage> list);

    int batchInsert(@Param("list") List<Storage> list);

    int insertOrUpdate(Storage record);

    int insertOrUpdateSelective(Storage record);
}