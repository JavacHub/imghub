package com.jonnyhub.imghub.mapper;

import com.jonnyhub.imghub.entity.Images;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ImagesMapper {
    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Images record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Images selectByPrimaryKey(@Param("id") Long id, @Param("imageUid") String imageUid);

    int updateBatch(List<Images> list);

    int batchInsert(@Param("list") List<Images> list);
}