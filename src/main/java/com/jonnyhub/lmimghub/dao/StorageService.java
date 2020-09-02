package com.jonnyhub.lmimghub.dao;

import java.util.List;
import com.jonnyhub.lmimghub.model.Storage;
import com.baomidou.mybatisplus.extension.service.IService;
public interface StorageService extends IService<Storage>{


    int updateBatch(List<Storage> list);

    int updateBatchSelective(List<Storage> list);

    int batchInsert(List<Storage> list);

    int insertOrUpdate(Storage record);

    int insertOrUpdateSelective(Storage record);

}
