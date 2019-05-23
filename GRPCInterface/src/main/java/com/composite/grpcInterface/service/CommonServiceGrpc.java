package com.composite.grpcInterface.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: common.proto")
public final class CommonServiceGrpc {

  private CommonServiceGrpc() {}

  public static final String SERVICE_NAME = "com.composite.grpcInterface.service.CommonService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.composite.grpcInterface.base.Request,
      com.composite.grpcInterface.base.Response> getCommonRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "commonRequest",
      requestType = com.composite.grpcInterface.base.Request.class,
      responseType = com.composite.grpcInterface.base.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.composite.grpcInterface.base.Request,
      com.composite.grpcInterface.base.Response> getCommonRequestMethod() {
    io.grpc.MethodDescriptor<com.composite.grpcInterface.base.Request, com.composite.grpcInterface.base.Response> getCommonRequestMethod;
    if ((getCommonRequestMethod = CommonServiceGrpc.getCommonRequestMethod) == null) {
      synchronized (CommonServiceGrpc.class) {
        if ((getCommonRequestMethod = CommonServiceGrpc.getCommonRequestMethod) == null) {
          CommonServiceGrpc.getCommonRequestMethod = getCommonRequestMethod = 
              io.grpc.MethodDescriptor.<com.composite.grpcInterface.base.Request, com.composite.grpcInterface.base.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.composite.grpcInterface.service.CommonService", "commonRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.composite.grpcInterface.base.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.composite.grpcInterface.base.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new CommonServiceMethodDescriptorSupplier("commonRequest"))
                  .build();
          }
        }
     }
     return getCommonRequestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommonServiceStub newStub(io.grpc.Channel channel) {
    return new CommonServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommonServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CommonServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommonServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CommonServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CommonServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void commonRequest(com.composite.grpcInterface.base.Request request,
        io.grpc.stub.StreamObserver<com.composite.grpcInterface.base.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getCommonRequestMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCommonRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.composite.grpcInterface.base.Request,
                com.composite.grpcInterface.base.Response>(
                  this, METHODID_COMMON_REQUEST)))
          .build();
    }
  }

  /**
   */
  public static final class CommonServiceStub extends io.grpc.stub.AbstractStub<CommonServiceStub> {
    private CommonServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommonServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CommonServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommonServiceStub(channel, callOptions);
    }

    /**
     */
    public void commonRequest(com.composite.grpcInterface.base.Request request,
        io.grpc.stub.StreamObserver<com.composite.grpcInterface.base.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommonRequestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CommonServiceBlockingStub extends io.grpc.stub.AbstractStub<CommonServiceBlockingStub> {
    private CommonServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommonServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CommonServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommonServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.composite.grpcInterface.base.Response commonRequest(com.composite.grpcInterface.base.Request request) {
      return blockingUnaryCall(
          getChannel(), getCommonRequestMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CommonServiceFutureStub extends io.grpc.stub.AbstractStub<CommonServiceFutureStub> {
    private CommonServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommonServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CommonServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommonServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.composite.grpcInterface.base.Response> commonRequest(
        com.composite.grpcInterface.base.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getCommonRequestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMMON_REQUEST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommonServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommonServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMMON_REQUEST:
          serviceImpl.commonRequest((com.composite.grpcInterface.base.Request) request,
              (io.grpc.stub.StreamObserver<com.composite.grpcInterface.base.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CommonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommonServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.composite.grpcInterface.service.CommonServiceProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommonService");
    }
  }

  private static final class CommonServiceFileDescriptorSupplier
      extends CommonServiceBaseDescriptorSupplier {
    CommonServiceFileDescriptorSupplier() {}
  }

  private static final class CommonServiceMethodDescriptorSupplier
      extends CommonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommonServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CommonServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommonServiceFileDescriptorSupplier())
              .addMethod(getCommonRequestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
