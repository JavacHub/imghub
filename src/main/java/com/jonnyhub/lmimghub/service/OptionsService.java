package com.jonnyhub.lmimghub.service;

import java.util.List;

import com.jonnyhub.lmimghub.entity.OptionsEntity;

import com.baomidou.mybatisplus.extension.service.IService;

public interface OptionsService extends IService<OptionsEntity> {

    int updateBatch(List<OptionsEntity> list);

    int updateBatchSelective(List<OptionsEntity> list);

    int batchInsert(List<OptionsEntity> list);

    int insertOrUpdate(OptionsEntity record);

    int insertOrUpdateSelective(OptionsEntity record);

}
