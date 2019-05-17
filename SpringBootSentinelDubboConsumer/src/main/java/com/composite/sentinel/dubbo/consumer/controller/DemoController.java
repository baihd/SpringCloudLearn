package com.composite.sentinel.dubbo.consumer.controller;

import com.alibaba.csp.sentinel.slots.block.SentinelRpcException;
import com.alibaba.dubbo.config.annotation.Reference;
import com.composite.dubbo.interfaces.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Reference
    private DemoService demoService;

    @GetMapping(value = "hello")
    public String hello(String name) {
        for (int i = 0; i < 20000; i++) {
            try {
                String value = demoService.hello(name + i);
                System.out.println(value);
            } catch (SentinelRpcException ex) {
                System.out.println("Blocked:" + name + i);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return "hello";
    }

}
