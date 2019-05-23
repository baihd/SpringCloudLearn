package com.composite.consul.grpc.server.config;

import com.alibaba.csp.sentinel.adapter.grpc.SentinelGrpcServerInterceptor;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;

@GrpcGlobalServerInterceptor
public class SelfInterceptor extends SentinelGrpcServerInterceptor {

}
