// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package com.composite.grpcInterface.service;

public final class CommonServiceProto {
  private CommonServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\014common.proto\022#com.composite.grpcInterf" +
      "ace.service\032\rrequest.proto\032\016response.pro" +
      "to2y\n\rCommonService\022h\n\rcommonRequest\022).c" +
      "om.composite.grpcInterface.base.Request\032" +
      "*.com.composite.grpcInterface.base.Respo" +
      "nse\"\000B\026B\022CommonServiceProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.composite.grpcInterface.base.ResultProto.getDescriptor(),
          com.composite.grpcInterface.base.ResponseProto.getDescriptor(),
        }, assigner);
    com.composite.grpcInterface.base.ResultProto.getDescriptor();
    com.composite.grpcInterface.base.ResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}