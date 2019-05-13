package com.compsite.sentinel.controller;

import com.compsite.sentinel.config.TestConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        String value = TestConfig.getId();
        return "hello" + value;
    }
}
