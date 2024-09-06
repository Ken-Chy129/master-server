package cn.ken.master.server.service.impl;

import cn.ken.master.server.mapper.TemplateFieldMapper;
import cn.ken.master.server.service.TemplateFieldService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TemplateFieldServiceImpl implements TemplateFieldService {

    @Resource
    private TemplateFieldMapper templateFieldMapper;

}
