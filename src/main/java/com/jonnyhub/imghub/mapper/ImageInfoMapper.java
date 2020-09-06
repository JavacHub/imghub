package com.jonnyhub.imghub.mapper;

import com.jonnyhub.imghub.entity.ImageInfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ImageInfoMapper {
    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(ImageInfo record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    ImageInfo selectByPrimaryKey(Long id);

    int updateBatch(List<ImageInfo> list);

    int batchInsert(@Param("list") List<ImageInfo> list);
}