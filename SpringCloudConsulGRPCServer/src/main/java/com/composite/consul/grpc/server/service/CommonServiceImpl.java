package com.composite.consul.grpc.server.service;

import com.composite.grpcInterface.base.Request;
import com.composite.grpcInterface.base.Response;
import com.composite.grpcInterface.service.CommonServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Map;

@GrpcService
public class CommonServiceImpl extends CommonServiceGrpc.CommonServiceImplBase {
    @Override
    public void commonRequest(Request request, StreamObserver<Response> responseObserver) {
        Map<String, String> requestMap = request.getRequestDataMap();
        String value = requestMap.get("name");
        System.out.println("request:" + value);
        Response response = Response.newBuilder().putResponseData("name", "lisi").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
