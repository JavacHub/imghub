package com.jonnyhub.lmimghub.service;

import java.util.List;

import com.jonnyhub.lmimghub.entity.StorageEntity;

import com.baomidou.mybatisplus.extension.service.IService;

public interface StorageService extends IService<StorageEntity> {

    int updateBatch(List<StorageEntity> list);

    int updateBatchSelective(List<StorageEntity> list);

    int batchInsert(List<StorageEntity> list);

    int insertOrUpdate(StorageEntity record);

    int insertOrUpdateSelective(StorageEntity record);

}
