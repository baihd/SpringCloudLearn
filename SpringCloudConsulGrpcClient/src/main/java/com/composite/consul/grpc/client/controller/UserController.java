package com.composite.consul.grpc.client.controller;

import com.composite.grpcInterface.service.UserReply;
import com.composite.grpcInterface.service.UserRequest;
import com.composite.grpcInterface.service.UserServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private DiscoveryClient discoveryClient;

    @GrpcClient("grpc-server")
    private UserServiceGrpc.UserServiceBlockingStub userStub;

    @GetMapping(value = "/user")
    public String getUser() {
        try {
            for (int i = 0; i < 10; i++) {
                UserReply userReply = userStub.getUser(UserRequest.newBuilder().setId(1).build());
                String name = userReply.getName();
                String sex = userReply.getSex();
                System.out.println(name + sex);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return "";
    }

    /**
     * 获取所有服务
     */
    @RequestMapping("/services")
    public Object services() {
        return discoveryClient.getInstances("grpc-server");
    }

    /**
     * 从所有服务中选择一个服务（轮询）
     */
    @RequestMapping("/discover")
    public Object discover() {
        return loadBalancerClient.choose("grpc-server").getUri().toString();
    }

}
