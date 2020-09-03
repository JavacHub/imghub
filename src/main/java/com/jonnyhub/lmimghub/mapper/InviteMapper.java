package com.jonnyhub.lmimghub.mapper;

import java.util.List;

import com.jonnyhub.lmimghub.entity.InviteEntity;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InviteMapper extends BaseMapper<InviteEntity> {
    int updateBatch(List<InviteEntity> list);

    int updateBatchSelective(List<InviteEntity> list);

    int batchInsert(@Param("list") List<InviteEntity> list);

    int insertOrUpdate(InviteEntity record);

    int insertOrUpdateSelective(InviteEntity record);
}