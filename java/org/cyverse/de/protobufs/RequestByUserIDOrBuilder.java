// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_requests.proto

package org.cyverse.de.protobufs;

public interface RequestByUserIDOrBuilder extends
    // @@protoc_insertion_point(interface_extends:debuff.RequestByUserID)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Contains telemetry information
   * </pre>
   *
   * <code>.debuff.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   * Contains telemetry information
   * </pre>
   *
   * <code>.debuff.Header header = 1;</code>
   * @return The header.
   */
  org.cyverse.de.protobufs.Header getHeader();
  /**
   * <pre>
   * Contains telemetry information
   * </pre>
   *
   * <code>.debuff.Header header = 1;</code>
   */
  org.cyverse.de.protobufs.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>string user_id = 2 [json_name = "user_id"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 2 [json_name = "user_id"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();
}
