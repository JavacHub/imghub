package com.jonnyhub.lmimghub.service;

import java.util.List;

import com.jonnyhub.lmimghub.entity.ImginfoEntity;

import com.baomidou.mybatisplus.extension.service.IService;

public interface ImginfoService extends IService<ImginfoEntity> {

    int updateBatch(List<ImginfoEntity> list);

    int updateBatchSelective(List<ImginfoEntity> list);

    int batchInsert(List<ImginfoEntity> list);

    int insertOrUpdate(ImginfoEntity record);

    int insertOrUpdateSelective(ImginfoEntity record);

}
