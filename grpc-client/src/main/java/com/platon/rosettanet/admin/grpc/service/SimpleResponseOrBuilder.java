// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lib/common/base.proto

package com.platon.rosettanet.admin.grpc.service;

public interface SimpleResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.protobuf.SimpleResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the code for response
   * </pre>
   *
   * <code>int32 status = 1;</code>
   * @return The status.
   */
  int getStatus();

  /**
   * <pre>
   * the message for response
   * </pre>
   *
   * <code>string msg = 2;</code>
   * @return The msg.
   */
  java.lang.String getMsg();
  /**
   * <pre>
   * the message for response
   * </pre>
   *
   * <code>string msg = 2;</code>
   * @return The bytes for msg.
   */
  com.google.protobuf.ByteString
      getMsgBytes();
}
