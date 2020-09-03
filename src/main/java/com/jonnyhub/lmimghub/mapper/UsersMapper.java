package com.jonnyhub.lmimghub.mapper;

import java.util.List;

import com.jonnyhub.lmimghub.entity.UsersEntity;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersMapper extends BaseMapper<UsersEntity> {
    int updateBatch(List<UsersEntity> list);

    int updateBatchSelective(List<UsersEntity> list);

    int batchInsert(@Param("list") List<UsersEntity> list);

    int insertOrUpdate(UsersEntity record);

    int insertOrUpdateSelective(UsersEntity record);
}