// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lib/types/metadata.proto

package com.platon.rosettanet.admin.grpc.service;

/**
 * <pre>
 * 元数据中的列描述
 * </pre>
 *
 * Protobuf type {@code types.MetadataColumn}
 */
public final class MetadataColumn extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:types.MetadataColumn)
    MetadataColumnOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MetadataColumn.newBuilder() to construct.
  private MetadataColumn(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetadataColumn() {
    cName_ = "";
    cType_ = "";
    cComment_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MetadataColumn();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MetadataColumn(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            cIndex_ = input.readUInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            cName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            cType_ = s;
            break;
          }
          case 32: {

            cSize_ = input.readUInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            cComment_ = s;
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
    return com.platon.rosettanet.admin.grpc.service.MetaDataProto.internal_static_types_MetadataColumn_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.platon.rosettanet.admin.grpc.service.MetaDataProto.internal_static_types_MetadataColumn_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.platon.rosettanet.admin.grpc.service.MetadataColumn.class, com.platon.rosettanet.admin.grpc.service.MetadataColumn.Builder.class);
  }

  public static final int C_INDEX_FIELD_NUMBER = 1;
  private int cIndex_;
  /**
   * <pre>
   * 列所在原始文件中的索引值
   * </pre>
   *
   * <code>uint32 c_index = 1;</code>
   * @return The cIndex.
   */
  @java.lang.Override
  public int getCIndex() {
    return cIndex_;
  }

  public static final int C_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object cName_;
  /**
   * <pre>
   * 列名称
   * </pre>
   *
   * <code>string c_name = 2;</code>
   * @return The cName.
   */
  @java.lang.Override
  public java.lang.String getCName() {
    java.lang.Object ref = cName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 列名称
   * </pre>
   *
   * <code>string c_name = 2;</code>
   * @return The bytes for cName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCNameBytes() {
    java.lang.Object ref = cName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int C_TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object cType_;
  /**
   * <pre>
   * 列的数据类型
   * </pre>
   *
   * <code>string c_type = 3;</code>
   * @return The cType.
   */
  @java.lang.Override
  public java.lang.String getCType() {
    java.lang.Object ref = cType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 列的数据类型
   * </pre>
   *
   * <code>string c_type = 3;</code>
   * @return The bytes for cType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCTypeBytes() {
    java.lang.Object ref = cType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int C_SIZE_FIELD_NUMBER = 4;
  private int cSize_;
  /**
   * <pre>
   * 列的大小 (单位: byte)
   * </pre>
   *
   * <code>uint32 c_size = 4;</code>
   * @return The cSize.
   */
  @java.lang.Override
  public int getCSize() {
    return cSize_;
  }

  public static final int C_COMMENT_FIELD_NUMBER = 5;
  private volatile java.lang.Object cComment_;
  /**
   * <pre>
   * 列的描述
   * </pre>
   *
   * <code>string c_comment = 5;</code>
   * @return The cComment.
   */
  @java.lang.Override
  public java.lang.String getCComment() {
    java.lang.Object ref = cComment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cComment_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 列的描述
   * </pre>
   *
   * <code>string c_comment = 5;</code>
   * @return The bytes for cComment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCCommentBytes() {
    java.lang.Object ref = cComment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cComment_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (cIndex_ != 0) {
      output.writeUInt32(1, cIndex_);
    }
    if (!getCNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cName_);
    }
    if (!getCTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, cType_);
    }
    if (cSize_ != 0) {
      output.writeUInt32(4, cSize_);
    }
    if (!getCCommentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, cComment_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, cIndex_);
    }
    if (!getCNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cName_);
    }
    if (!getCTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, cType_);
    }
    if (cSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, cSize_);
    }
    if (!getCCommentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, cComment_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.platon.rosettanet.admin.grpc.service.MetadataColumn)) {
      return super.equals(obj);
    }
    com.platon.rosettanet.admin.grpc.service.MetadataColumn other = (com.platon.rosettanet.admin.grpc.service.MetadataColumn) obj;

    if (getCIndex()
        != other.getCIndex()) return false;
    if (!getCName()
        .equals(other.getCName())) return false;
    if (!getCType()
        .equals(other.getCType())) return false;
    if (getCSize()
        != other.getCSize()) return false;
    if (!getCComment()
        .equals(other.getCComment())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + C_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getCIndex();
    hash = (37 * hash) + C_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getCName().hashCode();
    hash = (37 * hash) + C_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getCType().hashCode();
    hash = (37 * hash) + C_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getCSize();
    hash = (37 * hash) + C_COMMENT_FIELD_NUMBER;
    hash = (53 * hash) + getCComment().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.platon.rosettanet.admin.grpc.service.MetadataColumn parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.platon.rosettanet.admin.grpc.service.MetadataColumn parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.platon.rosettanet.admin.grpc.service.MetadataColumn parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.platon.rosettanet.admin.grpc.service.MetadataColumn parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.platon.rosettanet.admin.grpc.service.MetadataColumn parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.platon.rosettanet.admin.grpc.service.MetadataColumn parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.platon.rosettanet.admin.grpc.service.MetadataColumn parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.platon.rosettanet.admin.grpc.service.MetadataColumn parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.platon.rosettanet.admin.grpc.service.MetadataColumn parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.platon.rosettanet.admin.grpc.service.MetadataColumn parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.platon.rosettanet.admin.grpc.service.MetadataColumn parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.platon.rosettanet.admin.grpc.service.MetadataColumn parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.platon.rosettanet.admin.grpc.service.MetadataColumn prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 元数据中的列描述
   * </pre>
   *
   * Protobuf type {@code types.MetadataColumn}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:types.MetadataColumn)
      com.platon.rosettanet.admin.grpc.service.MetadataColumnOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.platon.rosettanet.admin.grpc.service.MetaDataProto.internal_static_types_MetadataColumn_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.platon.rosettanet.admin.grpc.service.MetaDataProto.internal_static_types_MetadataColumn_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.platon.rosettanet.admin.grpc.service.MetadataColumn.class, com.platon.rosettanet.admin.grpc.service.MetadataColumn.Builder.class);
    }

    // Construct using com.platon.rosettanet.admin.grpc.service.MetadataColumn.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      cIndex_ = 0;

      cName_ = "";

      cType_ = "";

      cSize_ = 0;

      cComment_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.platon.rosettanet.admin.grpc.service.MetaDataProto.internal_static_types_MetadataColumn_descriptor;
    }

    @java.lang.Override
    public com.platon.rosettanet.admin.grpc.service.MetadataColumn getDefaultInstanceForType() {
      return com.platon.rosettanet.admin.grpc.service.MetadataColumn.getDefaultInstance();
    }

    @java.lang.Override
    public com.platon.rosettanet.admin.grpc.service.MetadataColumn build() {
      com.platon.rosettanet.admin.grpc.service.MetadataColumn result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.platon.rosettanet.admin.grpc.service.MetadataColumn buildPartial() {
      com.platon.rosettanet.admin.grpc.service.MetadataColumn result = new com.platon.rosettanet.admin.grpc.service.MetadataColumn(this);
      result.cIndex_ = cIndex_;
      result.cName_ = cName_;
      result.cType_ = cType_;
      result.cSize_ = cSize_;
      result.cComment_ = cComment_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.platon.rosettanet.admin.grpc.service.MetadataColumn) {
        return mergeFrom((com.platon.rosettanet.admin.grpc.service.MetadataColumn)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.platon.rosettanet.admin.grpc.service.MetadataColumn other) {
      if (other == com.platon.rosettanet.admin.grpc.service.MetadataColumn.getDefaultInstance()) return this;
      if (other.getCIndex() != 0) {
        setCIndex(other.getCIndex());
      }
      if (!other.getCName().isEmpty()) {
        cName_ = other.cName_;
        onChanged();
      }
      if (!other.getCType().isEmpty()) {
        cType_ = other.cType_;
        onChanged();
      }
      if (other.getCSize() != 0) {
        setCSize(other.getCSize());
      }
      if (!other.getCComment().isEmpty()) {
        cComment_ = other.cComment_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.platon.rosettanet.admin.grpc.service.MetadataColumn parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.platon.rosettanet.admin.grpc.service.MetadataColumn) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int cIndex_ ;
    /**
     * <pre>
     * 列所在原始文件中的索引值
     * </pre>
     *
     * <code>uint32 c_index = 1;</code>
     * @return The cIndex.
     */
    @java.lang.Override
    public int getCIndex() {
      return cIndex_;
    }
    /**
     * <pre>
     * 列所在原始文件中的索引值
     * </pre>
     *
     * <code>uint32 c_index = 1;</code>
     * @param value The cIndex to set.
     * @return This builder for chaining.
     */
    public Builder setCIndex(int value) {
      
      cIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 列所在原始文件中的索引值
     * </pre>
     *
     * <code>uint32 c_index = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCIndex() {
      
      cIndex_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object cName_ = "";
    /**
     * <pre>
     * 列名称
     * </pre>
     *
     * <code>string c_name = 2;</code>
     * @return The cName.
     */
    public java.lang.String getCName() {
      java.lang.Object ref = cName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 列名称
     * </pre>
     *
     * <code>string c_name = 2;</code>
     * @return The bytes for cName.
     */
    public com.google.protobuf.ByteString
        getCNameBytes() {
      java.lang.Object ref = cName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 列名称
     * </pre>
     *
     * <code>string c_name = 2;</code>
     * @param value The cName to set.
     * @return This builder for chaining.
     */
    public Builder setCName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 列名称
     * </pre>
     *
     * <code>string c_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCName() {
      
      cName_ = getDefaultInstance().getCName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 列名称
     * </pre>
     *
     * <code>string c_name = 2;</code>
     * @param value The bytes for cName to set.
     * @return This builder for chaining.
     */
    public Builder setCNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cType_ = "";
    /**
     * <pre>
     * 列的数据类型
     * </pre>
     *
     * <code>string c_type = 3;</code>
     * @return The cType.
     */
    public java.lang.String getCType() {
      java.lang.Object ref = cType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 列的数据类型
     * </pre>
     *
     * <code>string c_type = 3;</code>
     * @return The bytes for cType.
     */
    public com.google.protobuf.ByteString
        getCTypeBytes() {
      java.lang.Object ref = cType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 列的数据类型
     * </pre>
     *
     * <code>string c_type = 3;</code>
     * @param value The cType to set.
     * @return This builder for chaining.
     */
    public Builder setCType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 列的数据类型
     * </pre>
     *
     * <code>string c_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCType() {
      
      cType_ = getDefaultInstance().getCType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 列的数据类型
     * </pre>
     *
     * <code>string c_type = 3;</code>
     * @param value The bytes for cType to set.
     * @return This builder for chaining.
     */
    public Builder setCTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cType_ = value;
      onChanged();
      return this;
    }

    private int cSize_ ;
    /**
     * <pre>
     * 列的大小 (单位: byte)
     * </pre>
     *
     * <code>uint32 c_size = 4;</code>
     * @return The cSize.
     */
    @java.lang.Override
    public int getCSize() {
      return cSize_;
    }
    /**
     * <pre>
     * 列的大小 (单位: byte)
     * </pre>
     *
     * <code>uint32 c_size = 4;</code>
     * @param value The cSize to set.
     * @return This builder for chaining.
     */
    public Builder setCSize(int value) {
      
      cSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 列的大小 (单位: byte)
     * </pre>
     *
     * <code>uint32 c_size = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCSize() {
      
      cSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object cComment_ = "";
    /**
     * <pre>
     * 列的描述
     * </pre>
     *
     * <code>string c_comment = 5;</code>
     * @return The cComment.
     */
    public java.lang.String getCComment() {
      java.lang.Object ref = cComment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cComment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 列的描述
     * </pre>
     *
     * <code>string c_comment = 5;</code>
     * @return The bytes for cComment.
     */
    public com.google.protobuf.ByteString
        getCCommentBytes() {
      java.lang.Object ref = cComment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cComment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 列的描述
     * </pre>
     *
     * <code>string c_comment = 5;</code>
     * @param value The cComment to set.
     * @return This builder for chaining.
     */
    public Builder setCComment(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cComment_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 列的描述
     * </pre>
     *
     * <code>string c_comment = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCComment() {
      
      cComment_ = getDefaultInstance().getCComment();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 列的描述
     * </pre>
     *
     * <code>string c_comment = 5;</code>
     * @param value The bytes for cComment to set.
     * @return This builder for chaining.
     */
    public Builder setCCommentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cComment_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:types.MetadataColumn)
  }

  // @@protoc_insertion_point(class_scope:types.MetadataColumn)
  private static final com.platon.rosettanet.admin.grpc.service.MetadataColumn DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.platon.rosettanet.admin.grpc.service.MetadataColumn();
  }

  public static com.platon.rosettanet.admin.grpc.service.MetadataColumn getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetadataColumn>
      PARSER = new com.google.protobuf.AbstractParser<MetadataColumn>() {
    @java.lang.Override
    public MetadataColumn parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MetadataColumn(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MetadataColumn> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetadataColumn> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.platon.rosettanet.admin.grpc.service.MetadataColumn getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

