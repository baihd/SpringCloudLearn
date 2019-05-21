package com.composite.consul.grpc.server.service;

import com.composite.grpcInterface.service.UserReply;
import com.composite.grpcInterface.service.UserRequest;
import com.composite.grpcInterface.service.UserServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;


@GrpcService
public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    @Override
    public void getUser(UserRequest request, StreamObserver<UserReply> responseObserver) {
        UserReply reply = UserReply.newBuilder()
                .setName("zhangsan")
                .setSex("20")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
