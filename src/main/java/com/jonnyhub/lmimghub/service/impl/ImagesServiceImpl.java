package com.jonnyhub.lmimghub.service.impl;

import java.util.List;

import com.jonnyhub.lmimghub.entity.ImagesEntity;
import com.jonnyhub.lmimghub.mapper.ImagesMapper;
import com.jonnyhub.lmimghub.service.ImagesService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ImagesServiceImpl extends ServiceImpl<ImagesMapper, ImagesEntity> implements ImagesService {

    @Override
    public int updateBatch(List<ImagesEntity> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<ImagesEntity> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(ImagesEntity record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(ImagesEntity record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
