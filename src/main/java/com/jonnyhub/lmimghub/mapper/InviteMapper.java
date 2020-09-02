package com.jonnyhub.lmimghub.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jonnyhub.lmimghub.model.Invite;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InviteMapper extends BaseMapper<Invite>, BaseMapper {
    int updateBatch(List<Invite> list);

    int updateBatchSelective(List<Invite> list);

    int batchInsert(@Param("list") List<Invite> list);

    int insertOrUpdate(Invite record);

    int insertOrUpdateSelective(Invite record);
}