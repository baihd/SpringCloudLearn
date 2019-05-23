package com.composite.consul.grpc.server.service;

import com.alibaba.csp.sentinel.EntryType;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.composite.grpcInterface.service.UserReply;
import com.composite.grpcInterface.service.UserRequest;
import com.composite.grpcInterface.service.UserServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    @SentinelResource(value = "getUser",
            //流量类型，IN和OUT
            //IN：指进入系统的入口流量，比如http请求或者是其他的rpc之类的请求。为了统计整个系统的流量水平，用以自我保护的一种方式。
            //OUT：是指系统调用其他第三方服务的出口流量。一方面是为了保护第三方系统，另一方面也可以保护自己的系统。
            //入口、出口流量只有在配置了系统规则时才有效。
            entryType = EntryType.IN,
            //处理BlockException
//            blockHandler = "getUserBlockHandler")
            //仅针对降级功能生效
            fallback = "fallbackException")
    @Override
    public void getUser(UserRequest request, StreamObserver<UserReply> responseObserver) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        UserReply reply = UserReply.newBuilder()
                .setName("zhangsan")
                .setSex("20")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    public void getUserBlockHandler(UserRequest request, StreamObserver<UserReply> responseObserver, BlockException e) {
        System.out.println("blockHandler:===");
        UserReply reply = UserReply.newBuilder()
                .setName("empty")
                .setSex("empty")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    public void fallbackException(UserRequest request, StreamObserver<UserReply> responseObserver) {
        System.out.println("fallback:===");
        UserReply reply = UserReply.newBuilder()
                .setName("empty")
                .setSex("empty")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
