package com.jonnyhub.lmimghub.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jonnyhub.lmimghub.model.Users;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersMapper extends BaseMapper<Users> {
    int updateBatch(List<Users> list);

    int updateBatchSelective(List<Users> list);

    int batchInsert(@Param("list") List<Users> list);

    int insertOrUpdate(Users record);

    int insertOrUpdateSelective(Users record);
}