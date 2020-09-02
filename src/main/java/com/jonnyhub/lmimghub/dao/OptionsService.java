package com.jonnyhub.lmimghub.dao;

import java.util.List;
import com.jonnyhub.lmimghub.model.Options;
import com.baomidou.mybatisplus.extension.service.IService;
public interface OptionsService extends IService<Options>{


    int updateBatch(List<Options> list);

    int updateBatchSelective(List<Options> list);

    int batchInsert(List<Options> list);

    int insertOrUpdate(Options record);

    int insertOrUpdateSelective(Options record);

}
