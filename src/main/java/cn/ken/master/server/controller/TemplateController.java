package cn.ken.master.server.controller;

import cn.ken.master.server.service.TemplateService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {

    @Resource
    private TemplateService templateService;
}
