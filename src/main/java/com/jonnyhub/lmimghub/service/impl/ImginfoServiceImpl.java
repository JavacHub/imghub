package com.jonnyhub.lmimghub.service.impl;

import java.util.List;

import com.jonnyhub.lmimghub.entity.ImginfoEntity;
import com.jonnyhub.lmimghub.mapper.ImginfoMapper;
import com.jonnyhub.lmimghub.service.ImginfoService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ImginfoServiceImpl extends ServiceImpl<ImginfoMapper, ImginfoEntity> implements ImginfoService {

    @Override
    public int updateBatch(List<ImginfoEntity> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<ImginfoEntity> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<ImginfoEntity> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(ImginfoEntity record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(ImginfoEntity record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
