// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package com.composite.grpc.service;

public final class HelloServiceProto {
  private HelloServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_composite_grpc_service_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_composite_grpc_service_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_composite_grpc_service_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_composite_grpc_service_HelloReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\013hello.proto\022\032com.composite.grpc.servic" +
      "e\"\034\n\014HelloRequest\022\014\n\004name\030\001 \001(\t\"\035\n\nHello" +
      "Reply\022\017\n\007message\030\001 \001(\t2k\n\014HelloService\022[" +
      "\n\005hello\022(.com.composite.grpc.service.Hel" +
      "loRequest\032&.com.composite.grpc.service.H" +
      "elloReply\"\000B\025B\021HelloServiceProtoP\001b\006prot" +
      "o3"
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
        }, assigner);
    internal_static_com_composite_grpc_service_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_composite_grpc_service_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_composite_grpc_service_HelloRequest_descriptor,
        new String[] { "Name", });
    internal_static_com_composite_grpc_service_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_composite_grpc_service_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_composite_grpc_service_HelloReply_descriptor,
        new String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
