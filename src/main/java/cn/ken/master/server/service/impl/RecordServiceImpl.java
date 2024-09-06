package cn.ken.master.server.service.impl;

import cn.ken.master.server.mapper.RecordMapper;
import cn.ken.master.server.service.RecordService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RecordServiceImpl implements RecordService {

    @Resource
    private RecordMapper recordMapper;

}
