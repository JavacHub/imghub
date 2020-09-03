package com.jonnyhub.lmimghub.dao.impl;

import java.util.List;
import com.jonnyhub.lmimghub.model.Images;
import com.baomidou.mybatisplus.extension.service.IService;
public interface ImagesService extends IService<Images>{


    int updateBatch(List<Images> list);

    int batchInsert(List<Images> list);

    int insertOrUpdate(Images record);

    int insertOrUpdateSelective(Images record);

}
