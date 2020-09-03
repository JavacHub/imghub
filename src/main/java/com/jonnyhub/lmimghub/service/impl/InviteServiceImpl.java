package com.jonnyhub.lmimghub.service.impl;

import java.util.List;

import com.jonnyhub.lmimghub.entity.InviteEntity;
import com.jonnyhub.lmimghub.mapper.InviteMapper;
import com.jonnyhub.lmimghub.service.InviteService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class InviteServiceImpl extends ServiceImpl<InviteMapper, InviteEntity> implements InviteService {

    @Override
    public int updateBatch(List<InviteEntity> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<InviteEntity> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<InviteEntity> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(InviteEntity record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(InviteEntity record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
