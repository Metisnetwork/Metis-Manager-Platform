// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lib/types/metadata.proto

package com.platon.rosettanet.admin.grpc.service;

public interface MetadataUsageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:types.MetadataUsage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 元数据的使用方式 (0: 未定义; 1: 按照时间段来使用; 2: 按照次数来使用)
   * </pre>
   *
   * <code>.api.protobuf.MetadataUsageType usage_type = 1;</code>
   * @return The enum numeric value on the wire for usageType.
   */
  int getUsageTypeValue();
  /**
   * <pre>
   * 元数据的使用方式 (0: 未定义; 1: 按照时间段来使用; 2: 按照次数来使用)
   * </pre>
   *
   * <code>.api.protobuf.MetadataUsageType usage_type = 1;</code>
   * @return The usageType.
   */
  com.platon.rosettanet.admin.grpc.service.MetadataUsageType getUsageType();

  /**
   * <pre>
   * 使用开始时间 (当 usage_type 为 1 时才需要的字段)
   * </pre>
   *
   * <code>uint64 start_at = 2;</code>
   * @return The startAt.
   */
  long getStartAt();

  /**
   * <pre>
   * 使用结束时间 (当 usage_type 为 1 时才需要的字段)
   * </pre>
   *
   * <code>uint64 end_at = 3;</code>
   * @return The endAt.
   */
  long getEndAt();

  /**
   * <pre>
   * 使用次数 (当 usage_type 为 2 时才需要的字段)
   * </pre>
   *
   * <code>uint32 times = 4;</code>
   * @return The times.
   */
  int getTimes();
}
