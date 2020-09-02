package com.jonnyhub.lmimghub.dao;

import java.util.List;
import com.jonnyhub.lmimghub.model.Imginfo;
import com.baomidou.mybatisplus.extension.service.IService;
public interface ImginfoService extends IService<Imginfo>{


    int updateBatch(List<Imginfo> list);

    int updateBatchSelective(List<Imginfo> list);

    int batchInsert(List<Imginfo> list);

    int insertOrUpdate(Imginfo record);

    int insertOrUpdateSelective(Imginfo record);

}
