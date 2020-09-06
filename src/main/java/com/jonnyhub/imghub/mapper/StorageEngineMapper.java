package com.jonnyhub.imghub.mapper;

import com.jonnyhub.imghub.entity.StorageEngine;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageEngineMapper {
    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(StorageEngine record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    StorageEngine selectByPrimaryKey(Long id);

    int updateBatch(List<StorageEngine> list);

    int batchInsert(@Param("list") List<StorageEngine> list);
}