package cn.ken.master.server.service;

import cn.ken.master.server.entity.RecordDO;

import java.util.List;

public interface RecordService {

    int insert(RecordDO recordDO);

    List<RecordDO> selectAll();
}
