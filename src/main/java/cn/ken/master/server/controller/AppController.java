package cn.ken.master.server.controller;

import cn.ken.master.server.entity.AppDO;
import cn.ken.master.server.service.AppService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 应用控制器
 * @author Ken-Chy129
 * @date 2024/8/28
 */
@RestController("app")
public class AppController {

    @Resource
    private AppService appService;

    @GetMapping("list")
    public void list() {

    }

    @PostMapping("insert")
    public void insert(@RequestBody AppDO appDO) {
        appService.insert(appDO);
    }
}
