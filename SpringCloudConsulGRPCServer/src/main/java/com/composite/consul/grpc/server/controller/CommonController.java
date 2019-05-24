package com.composite.consul.grpc.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @Value("${grpc.server.port}")
    private String port;

    @GetMapping("/getConsulValue")
    public String getConsulValue(){
        return port;
    }
}
