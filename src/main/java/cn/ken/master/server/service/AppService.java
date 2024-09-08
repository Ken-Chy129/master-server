package cn.ken.master.server.service;

import cn.ken.master.core.model.Result;
import cn.ken.master.server.entity.AppDO;

import java.util.List;

public interface AppService {

    void insert(AppDO appDO);

    Result<List<AppDO>> selectAll();
}
