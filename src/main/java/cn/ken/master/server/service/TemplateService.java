package cn.ken.master.server.service;


import cn.ken.master.server.entity.TemplateDO;

import java.util.List;

public interface TemplateService {

    int insert(TemplateDO templateDO);

    List<TemplateDO> selectAll();
}
