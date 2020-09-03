package com.jonnyhub.lmimghub.dao.impl;

import java.util.List;

import com.jonnyhub.lmimghub.dao.StorageService;
import com.jonnyhub.lmimghub.mapper.StorageMapper;
import com.jonnyhub.lmimghub.model.Storage;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements StorageService {

    @Override
    public int updateBatch(List<Storage> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Storage> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Storage> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Storage record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Storage record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
