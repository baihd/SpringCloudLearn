package com.composite.consul.grpc.client.controller;

import com.composite.grpcInterface.service.UserReply;
import com.composite.grpcInterface.service.UserRequest;
import com.composite.grpcInterface.service.UserServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GrpcClient("grpc-server")
    private UserServiceGrpc.UserServiceBlockingStub userStub;

    @GetMapping(value = "/user")
    public String getUser() {
        try {
            UserReply userReply = userStub.getUser(UserRequest.newBuilder().setId(1).build());
            String name = userReply.getName();
            String sex = userReply.getSex();
            return name + ":" + sex;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return "";
        }
    }

}
