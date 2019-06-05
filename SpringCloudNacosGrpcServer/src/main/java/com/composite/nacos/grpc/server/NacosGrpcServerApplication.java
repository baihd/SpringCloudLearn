package com.composite.nacos.grpc.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosGrpcServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosGrpcServerApplication.class, args);
    }

}
