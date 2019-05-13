package com.composite.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.composite.dubbo.interfaces.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ConsumerController {

    @Reference
    private UserService userService;

    @GetMapping(value = "/getUserList")
    public void getUerList() {
        List<Map<String, Object>> mapList = userService.getUserList("zhangsan");
        System.out.println(mapList.size());
    }
}
