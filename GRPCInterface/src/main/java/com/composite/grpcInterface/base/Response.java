// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: response.proto

package com.composite.grpcInterface.base;

/**
 * Protobuf type {@code com.composite.grpcInterface.base.Response}
 */
public  final class Response extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.composite.grpcInterface.base.Response)
    ResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Response.newBuilder() to construct.
  private Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Response() {
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Response(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              responseData_ = com.google.protobuf.MapField.newMapField(
                  ResponseDataDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<String, String>
            responseData__ = input.readMessage(
                ResponseDataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            responseData_.getMutableMap().put(
                responseData__.getKey(), responseData__.getValue());
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.composite.grpcInterface.base.ResponseProto.internal_static_com_composite_grpcInterface_base_Response_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetResponseData();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.composite.grpcInterface.base.ResponseProto.internal_static_com_composite_grpcInterface_base_Response_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Response.class, Builder.class);
  }

  public static final int RESPONSEDATA_FIELD_NUMBER = 1;
  private static final class ResponseDataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        String, String> defaultEntry =
            com.google.protobuf.MapEntry
            .<String, String>newDefaultInstance(
                com.composite.grpcInterface.base.ResponseProto.internal_static_com_composite_grpcInterface_base_Response_ResponseDataEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      String, String> responseData_;
  private com.google.protobuf.MapField<String, String>
  internalGetResponseData() {
    if (responseData_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ResponseDataDefaultEntryHolder.defaultEntry);
    }
    return responseData_;
  }

  public int getResponseDataCount() {
    return internalGetResponseData().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; responseData = 1;</code>
   */

  public boolean containsResponseData(
      String key) {
    if (key == null) { throw new NullPointerException(); }
    return internalGetResponseData().getMap().containsKey(key);
  }
  /**
   * Use {@link #getResponseDataMap()} instead.
   */
  @Deprecated
  public java.util.Map<String, String> getResponseData() {
    return getResponseDataMap();
  }
  /**
   * <code>map&lt;string, string&gt; responseData = 1;</code>
   */

  public java.util.Map<String, String> getResponseDataMap() {
    return internalGetResponseData().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; responseData = 1;</code>
   */

  public String getResponseDataOrDefault(
      String key,
      String defaultValue) {
    if (key == null) { throw new NullPointerException(); }
    java.util.Map<String, String> map =
        internalGetResponseData().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; responseData = 1;</code>
   */

  public String getResponseDataOrThrow(
      String key) {
    if (key == null) { throw new NullPointerException(); }
    java.util.Map<String, String> map =
        internalGetResponseData().getMap();
    if (!map.containsKey(key)) {
      throw new IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetResponseData(),
        ResponseDataDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<String, String> entry
         : internalGetResponseData().getMap().entrySet()) {
      com.google.protobuf.MapEntry<String, String>
      responseData__ = ResponseDataDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, responseData__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Response)) {
      return super.equals(obj);
    }
    Response other = (Response) obj;

    if (!internalGetResponseData().equals(
        other.internalGetResponseData())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetResponseData().getMap().isEmpty()) {
      hash = (37 * hash) + RESPONSEDATA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetResponseData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Response parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Response parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Response parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Response parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Response parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Response parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Response parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Response parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Response parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Response parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Response parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Response parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Response prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.composite.grpcInterface.base.Response}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.composite.grpcInterface.base.Response)
      com.composite.grpcInterface.base.ResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.composite.grpcInterface.base.ResponseProto.internal_static_com_composite_grpcInterface_base_Response_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetResponseData();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableResponseData();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.composite.grpcInterface.base.ResponseProto.internal_static_com_composite_grpcInterface_base_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Response.class, Builder.class);
    }

    // Construct using com.composite.grpcInterface.base.Response.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      internalGetMutableResponseData().clear();
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.composite.grpcInterface.base.ResponseProto.internal_static_com_composite_grpcInterface_base_Response_descriptor;
    }

    @Override
    public Response getDefaultInstanceForType() {
      return Response.getDefaultInstance();
    }

    @Override
    public Response build() {
      Response result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Response buildPartial() {
      Response result = new Response(this);
      int from_bitField0_ = bitField0_;
      result.responseData_ = internalGetResponseData();
      result.responseData_.makeImmutable();
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Response) {
        return mergeFrom((Response)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Response other) {
      if (other == Response.getDefaultInstance()) return this;
      internalGetMutableResponseData().mergeFrom(
          other.internalGetResponseData());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Response parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Response) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        String, String> responseData_;
    private com.google.protobuf.MapField<String, String>
    internalGetResponseData() {
      if (responseData_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ResponseDataDefaultEntryHolder.defaultEntry);
      }
      return responseData_;
    }
    private com.google.protobuf.MapField<String, String>
    internalGetMutableResponseData() {
      onChanged();;
      if (responseData_ == null) {
        responseData_ = com.google.protobuf.MapField.newMapField(
            ResponseDataDefaultEntryHolder.defaultEntry);
      }
      if (!responseData_.isMutable()) {
        responseData_ = responseData_.copy();
      }
      return responseData_;
    }

    public int getResponseDataCount() {
      return internalGetResponseData().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; responseData = 1;</code>
     */

    public boolean containsResponseData(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      return internalGetResponseData().getMap().containsKey(key);
    }
    /**
     * Use {@link #getResponseDataMap()} instead.
     */
    @Deprecated
    public java.util.Map<String, String> getResponseData() {
      return getResponseDataMap();
    }
    /**
     * <code>map&lt;string, string&gt; responseData = 1;</code>
     */

    public java.util.Map<String, String> getResponseDataMap() {
      return internalGetResponseData().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; responseData = 1;</code>
     */

    public String getResponseDataOrDefault(
        String key,
        String defaultValue) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, String> map =
          internalGetResponseData().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; responseData = 1;</code>
     */

    public String getResponseDataOrThrow(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, String> map =
          internalGetResponseData().getMap();
      if (!map.containsKey(key)) {
        throw new IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearResponseData() {
      internalGetMutableResponseData().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; responseData = 1;</code>
     */

    public Builder removeResponseData(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      internalGetMutableResponseData().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @Deprecated
    public java.util.Map<String, String>
    getMutableResponseData() {
      return internalGetMutableResponseData().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; responseData = 1;</code>
     */
    public Builder putResponseData(
        String key,
        String value) {
      if (key == null) { throw new NullPointerException(); }
      if (value == null) { throw new NullPointerException(); }
      internalGetMutableResponseData().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; responseData = 1;</code>
     */

    public Builder putAllResponseData(
        java.util.Map<String, String> values) {
      internalGetMutableResponseData().getMutableMap()
          .putAll(values);
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.composite.grpcInterface.base.Response)
  }

  // @@protoc_insertion_point(class_scope:com.composite.grpcInterface.base.Response)
  private static final Response DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Response();
  }

  public static Response getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Response>
      PARSER = new com.google.protobuf.AbstractParser<Response>() {
    @Override
    public Response parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Response(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Response> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Response> getParserForType() {
    return PARSER;
  }

  @Override
  public Response getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

