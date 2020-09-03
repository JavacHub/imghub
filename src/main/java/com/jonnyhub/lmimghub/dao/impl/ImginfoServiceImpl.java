package com.jonnyhub.lmimghub.dao.impl;

import java.util.List;

import com.jonnyhub.lmimghub.dao.ImginfoService;
import com.jonnyhub.lmimghub.mapper.ImginfoMapper;
import com.jonnyhub.lmimghub.model.Imginfo;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ImginfoServiceImpl extends ServiceImpl<ImginfoMapper, Imginfo> implements ImginfoService {

    @Override
    public int updateBatch(List<Imginfo> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Imginfo> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Imginfo> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Imginfo record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Imginfo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
