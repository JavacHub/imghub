package com.jonnyhub.lmimghub.service;

import java.util.List;

import com.jonnyhub.lmimghub.entity.UsersEntity;

import com.baomidou.mybatisplus.extension.service.IService;

public interface UsersService extends IService<UsersEntity> {

    int updateBatch(List<UsersEntity> list);

    int updateBatchSelective(List<UsersEntity> list);

    int batchInsert(List<UsersEntity> list);

    int insertOrUpdate(UsersEntity record);

    int insertOrUpdateSelective(UsersEntity record);

}
