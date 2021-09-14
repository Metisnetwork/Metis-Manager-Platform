// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lib/common/base.proto

package com.platon.rosettanet.admin.grpc.service;

/**
 * <pre>
 * 元数据的状态 (0: 未知; 1: 还未发布的新表; 2: 已发布的表; 3: 已撤销的表)
 * </pre>
 *
 * Protobuf enum {@code api.protobuf.MetadataState}
 */
public enum MetadataState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MetadataState_Unknown = 0;</code>
   */
  MetadataState_Unknown(0),
  /**
   * <code>MetadataState_Created = 1;</code>
   */
  MetadataState_Created(1),
  /**
   * <code>MetadataState_Released = 2;</code>
   */
  MetadataState_Released(2),
  /**
   * <code>MetadataState_Revoked = 3;</code>
   */
  MetadataState_Revoked(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MetadataState_Unknown = 0;</code>
   */
  public static final int MetadataState_Unknown_VALUE = 0;
  /**
   * <code>MetadataState_Created = 1;</code>
   */
  public static final int MetadataState_Created_VALUE = 1;
  /**
   * <code>MetadataState_Released = 2;</code>
   */
  public static final int MetadataState_Released_VALUE = 2;
  /**
   * <code>MetadataState_Revoked = 3;</code>
   */
  public static final int MetadataState_Revoked_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MetadataState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MetadataState forNumber(int value) {
    switch (value) {
      case 0: return MetadataState_Unknown;
      case 1: return MetadataState_Created;
      case 2: return MetadataState_Released;
      case 3: return MetadataState_Revoked;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MetadataState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MetadataState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MetadataState>() {
          public MetadataState findValueByNumber(int number) {
            return MetadataState.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.platon.rosettanet.admin.grpc.service.Base.getDescriptor().getEnumTypes().get(5);
  }

  private static final MetadataState[] VALUES = values();

  public static MetadataState valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MetadataState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.protobuf.MetadataState)
}

