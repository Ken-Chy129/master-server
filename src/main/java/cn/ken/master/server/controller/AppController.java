package cn.ken.master.server.controller;

import cn.ken.master.core.model.Result;
import cn.ken.master.server.entity.AppDO;
import cn.ken.master.server.service.AppService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 应用控制器
 * @author Ken-Chy129
 * @date 2024/8/28
 */
@RestController
@RequestMapping("app")
public class AppController {

    @Resource
    private AppService appService;

    @GetMapping("list")
    public Result<List<AppDO>> list() {
        return appService.selectAll();
    }

    @PostMapping("insert")
    public void insert(@RequestBody AppDO appDO) {
        appService.insert(appDO);
    }
}
