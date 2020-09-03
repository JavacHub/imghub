package com.jonnyhub.lmimghub.mapper;

import java.util.List;

import com.jonnyhub.lmimghub.model.Invite;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InviteMapper extends BaseMapper<Invite> {
    int updateBatch(List<Invite> list);

    int updateBatchSelective(List<Invite> list);

    int batchInsert(@Param("list") List<Invite> list);

    int insertOrUpdate(Invite record);

    int insertOrUpdateSelective(Invite record);
}