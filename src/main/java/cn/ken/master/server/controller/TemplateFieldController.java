package cn.ken.master.server.controller;

import cn.ken.master.server.service.RecordService;
import cn.ken.master.server.service.TemplateFieldService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateFieldController {

    @Resource
    private TemplateFieldService templateFieldService;
}
