package cn.ken.master.server.service.impl;

import cn.ken.master.server.entity.RecordDO;
import cn.ken.master.server.mapper.RecordMapper;
import cn.ken.master.server.service.RecordService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class RecordServiceImpl implements RecordService {

    @Resource
    private RecordMapper recordMapper;

    @Override
    public int insert(RecordDO recordDO) {
        return recordMapper.insert(recordDO);
    }

    @Override
    public List<RecordDO> selectAll() {
        return List.of();
    }
}
