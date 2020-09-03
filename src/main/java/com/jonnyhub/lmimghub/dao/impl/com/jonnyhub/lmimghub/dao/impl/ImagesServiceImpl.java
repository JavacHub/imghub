package com.jonnyhub.lmimghub.dao.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.jonnyhub.lmimghub.model.Images;
import com.jonnyhub.lmimghub.mapper.ImagesMapper;
import com.jonnyhub.lmimghub.dao.impl.ImagesService;
@Service
public class ImagesServiceImpl extends ServiceImpl<ImagesMapper, Images> implements ImagesService{

    @Override
    public int updateBatch(List<Images> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<Images> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Images record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Images record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}