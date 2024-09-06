package cn.ken.master.server.controller;

import cn.ken.master.server.entity.TemplateDO;
import cn.ken.master.server.service.TemplateService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("template")
public class TemplateController {

    @Resource
    private TemplateService templateService;

    @PostMapping("insert")
    public int insert(@RequestBody TemplateDO templateDO) {
        return templateService.insert(templateDO);
    }
}
