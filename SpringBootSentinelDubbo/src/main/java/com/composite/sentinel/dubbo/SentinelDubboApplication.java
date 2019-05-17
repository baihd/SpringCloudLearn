package com.composite.sentinel.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan("com.composite.sentinel.dubbo.service.impl")
public class SentinelDubboApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelDubboApplication.class, args);
    }

}
