package com.composite.consul.grpc.client.controller;

import com.composite.grpcInterface.base.Request;
import com.composite.grpcInterface.base.Response;
import com.composite.grpcInterface.service.*;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CommonController {

    @GrpcClient("grpc-server")
    private CommonServiceGrpc.CommonServiceBlockingStub commonStub;

    @GetMapping(value = "/common")
    public String commonRequest() {
        try {
            Request request = Request.newBuilder().putRequestData("name", "zhang").build();
            Response response = commonStub.commonRequest(request);
            Map<String, String> resultMap = response.getResponseDataMap();
            String value = resultMap.get("name");
            return value;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "";
        }
    }


}
