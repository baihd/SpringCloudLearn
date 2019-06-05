package com.composite.nacos.grpc.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosGrpcClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosGrpcClientApplication.class, args);
    }

}
