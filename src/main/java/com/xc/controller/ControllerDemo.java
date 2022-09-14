package com.xc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {

    @GetMapping("/hello")
    public String text()
    {
        return "你好，我是最后一个hello 测试版本了";
    }
}
