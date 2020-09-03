package com.jonnyhub.lmimghub.service;

import java.util.List;

import com.jonnyhub.lmimghub.entity.InviteEntity;

import com.baomidou.mybatisplus.extension.service.IService;

public interface InviteService extends IService<InviteEntity> {

    int updateBatch(List<InviteEntity> list);

    int updateBatchSelective(List<InviteEntity> list);

    int batchInsert(List<InviteEntity> list);

    int insertOrUpdate(InviteEntity record);

    int insertOrUpdateSelective(InviteEntity record);

}
