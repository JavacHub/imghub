package com.jonnyhub.lmimghub.service.impl;

import java.util.List;

import com.jonnyhub.lmimghub.entity.StorageEntity;
import com.jonnyhub.lmimghub.mapper.StorageMapper;
import com.jonnyhub.lmimghub.service.StorageService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class StorageServiceImpl extends ServiceImpl<StorageMapper, StorageEntity> implements StorageService {

    @Override
    public int updateBatch(List<StorageEntity> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<StorageEntity> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<StorageEntity> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(StorageEntity record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(StorageEntity record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
