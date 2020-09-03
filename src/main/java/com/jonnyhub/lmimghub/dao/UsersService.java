package com.jonnyhub.lmimghub.dao;

import java.util.List;

import com.jonnyhub.lmimghub.model.Users;

import com.baomidou.mybatisplus.extension.service.IService;

public interface UsersService extends IService<Users> {

    int updateBatch(List<Users> list);

    int updateBatchSelective(List<Users> list);

    int batchInsert(List<Users> list);

    int insertOrUpdate(Users record);

    int insertOrUpdateSelective(Users record);

}
