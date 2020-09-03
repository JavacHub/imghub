package com.jonnyhub.lmimghub.service.impl;

import java.util.List;

import com.jonnyhub.lmimghub.entity.UsersEntity;
import com.jonnyhub.lmimghub.mapper.UsersMapper;
import com.jonnyhub.lmimghub.service.UsersService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, UsersEntity> implements UsersService {

    @Override
    public int updateBatch(List<UsersEntity> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<UsersEntity> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<UsersEntity> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(UsersEntity record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UsersEntity record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
