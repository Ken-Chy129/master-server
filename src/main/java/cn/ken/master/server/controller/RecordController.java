package cn.ken.master.server.controller;

import cn.ken.master.server.entity.RecordDO;
import cn.ken.master.server.service.RecordService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("record")
public class RecordController {

    @Resource
    private RecordService recordService;

    @PostMapping("insert")
    public int insert(@RequestBody RecordDO recordDO) {
        return recordService.insert(recordDO);
    }
}
