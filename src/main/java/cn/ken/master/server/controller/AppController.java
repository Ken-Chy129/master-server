package cn.ken.master.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 应用控制器
 * @author Ken-Chy129
 * @date 2024/8/28
 */
@RestController("app")
public class AppController {

    @GetMapping("list")
    public void list() {

    }
}
