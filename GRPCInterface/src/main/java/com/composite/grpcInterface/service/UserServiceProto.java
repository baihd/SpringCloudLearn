// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.composite.grpcInterface.service;

public final class UserServiceProto {
  private UserServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_composite_grpcInterface_service_UserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_composite_grpcInterface_service_UserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_composite_grpcInterface_service_UserReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_composite_grpcInterface_service_UserReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\nuser.proto\022#com.composite.grpcInterfac" +
      "e.service\"\031\n\013UserRequest\022\n\n\002id\030\001 \001(\005\"&\n\t" +
      "UserReply\022\014\n\004name\030\001 \001(\t\022\013\n\003sex\030\002 \001(\t2|\n\013" +
      "UserService\022m\n\007getUser\0220.com.composite.g" +
      "rpcInterface.service.UserRequest\032..com.c" +
      "omposite.grpcInterface.service.UserReply" +
      "\"\000B\024B\020UserServiceProtoP\001b\006proto3"
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
    internal_static_com_composite_grpcInterface_service_UserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_composite_grpcInterface_service_UserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_composite_grpcInterface_service_UserRequest_descriptor,
        new String[] { "Id", });
    internal_static_com_composite_grpcInterface_service_UserReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_composite_grpcInterface_service_UserReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_composite_grpcInterface_service_UserReply_descriptor,
        new String[] { "Name", "Sex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
