package com.jonnyhub.lmimghub.service;

import java.util.List;

import com.jonnyhub.lmimghub.entity.ImagesEntity;

import com.baomidou.mybatisplus.extension.service.IService;

public interface ImagesService extends IService<ImagesEntity> {

    int updateBatch(List<ImagesEntity> list);

    int batchInsert(List<ImagesEntity> list);

    int insertOrUpdate(ImagesEntity record);

    int insertOrUpdateSelective(ImagesEntity record);

}
