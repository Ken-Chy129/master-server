package cn.ken.master.server.controller;

import cn.ken.master.server.service.RecordService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {

    @Resource
    private RecordService recordService;
}
