package cn.ken.master.server.service.impl;

import cn.ken.master.server.entity.TemplateDO;
import cn.ken.master.server.mapper.TemplateMapper;
import cn.ken.master.server.service.TemplateService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TemplateServiceImpl implements TemplateService {

    @Resource
    private TemplateMapper templateMapper;

    @Override
    public int insert(TemplateDO templateDO) {
        return templateMapper.insert(templateDO);
    }

    @Override
    public List<TemplateDO> selectAll() {
        return List.of();
    }
}
