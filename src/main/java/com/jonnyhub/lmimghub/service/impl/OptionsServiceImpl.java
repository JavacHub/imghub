package com.jonnyhub.lmimghub.service.impl;

import java.util.List;

import com.jonnyhub.lmimghub.entity.OptionsEntity;
import com.jonnyhub.lmimghub.mapper.OptionsMapper;
import com.jonnyhub.lmimghub.service.OptionsService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OptionsServiceImpl extends ServiceImpl<OptionsMapper, OptionsEntity> implements OptionsService {

    @Override
    public int updateBatch(List<OptionsEntity> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<OptionsEntity> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<OptionsEntity> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(OptionsEntity record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OptionsEntity record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
