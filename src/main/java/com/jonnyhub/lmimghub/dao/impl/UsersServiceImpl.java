package com.jonnyhub.lmimghub.dao.impl;

import java.util.List;

import com.jonnyhub.lmimghub.dao.UsersService;
import com.jonnyhub.lmimghub.mapper.UsersMapper;
import com.jonnyhub.lmimghub.model.Users;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

    @Override
    public int updateBatch(List<Users> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Users> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Users> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Users record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Users record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}