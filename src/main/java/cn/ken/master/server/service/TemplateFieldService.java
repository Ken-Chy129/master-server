package cn.ken.master.server.service;

import cn.ken.master.server.entity.TemplateFieldDO;

import java.util.List;

public interface TemplateFieldService {

    int insert(TemplateFieldDO templateFieldDO);

    List<TemplateFieldDO> selectAll();
}
