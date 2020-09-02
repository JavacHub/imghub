package com.jonnyhub.lmimghub.dao;

import java.util.List;
import com.jonnyhub.lmimghub.model.Invite;
import com.baomidou.mybatisplus.extension.service.IService;
public interface InviteService extends IService<Invite>{


    int updateBatch(List<Invite> list);

    int updateBatchSelective(List<Invite> list);

    int batchInsert(List<Invite> list);

    int insertOrUpdate(Invite record);

    int insertOrUpdateSelective(Invite record);

}
