package cn.ken.master.server.service.impl;

import cn.ken.master.server.entity.AppDO;
import cn.ken.master.server.mapper.AppMapper;
import cn.ken.master.server.service.AppService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AppServiceImpl implements AppService {

    @Resource
    private AppMapper appMapper;

    @Override
    public void insert(AppDO appDO) {
        appMapper.insert(appDO);
    }

    @Override
    public List<AppDO> selectAll() {
        return appMapper.selectList(new QueryWrapper<>());
    }
}
