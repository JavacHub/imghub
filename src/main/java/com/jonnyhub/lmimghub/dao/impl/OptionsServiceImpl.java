package com.jonnyhub.lmimghub.dao.impl;

import java.util.List;

import com.jonnyhub.lmimghub.dao.OptionsService;
import com.jonnyhub.lmimghub.mapper.OptionsMapper;
import com.jonnyhub.lmimghub.model.Options;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OptionsServiceImpl extends ServiceImpl<OptionsMapper, Options> implements OptionsService {

    @Override
    public int updateBatch(List<Options> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Options> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Options> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Options record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Options record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
