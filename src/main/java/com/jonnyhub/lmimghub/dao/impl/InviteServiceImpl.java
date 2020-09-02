package com.jonnyhub.lmimghub.dao.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.jonnyhub.lmimghub.model.Invite;
import com.jonnyhub.lmimghub.mapper.InviteMapper;
import com.jonnyhub.lmimghub.dao.InviteService;
@Service
public class InviteServiceImpl extends ServiceImpl<InviteMapper, Invite> implements InviteService{

    @Override
    public int updateBatch(List<Invite> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Invite> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Invite> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Invite record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Invite record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
