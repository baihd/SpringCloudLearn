package com.composite.consul.grpc.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsulGrpcServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulGrpcServerApplication.class, args);
	}

}