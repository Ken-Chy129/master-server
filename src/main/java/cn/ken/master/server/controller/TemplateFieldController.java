package cn.ken.master.server.controller;

import cn.ken.master.server.entity.TemplateFieldDO;
import cn.ken.master.server.service.RecordService;
import cn.ken.master.server.service.TemplateFieldService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("templateField")
public class TemplateFieldController {

    @Resource
    private TemplateFieldService templateFieldService;

    @PostMapping("insert")
    public int insert(@RequestBody TemplateFieldDO templateFieldDO) {
        return templateFieldService.insert(templateFieldDO);
    }
}
