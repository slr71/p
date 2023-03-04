// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: svcerror.proto

package org.cyverse.de.protobufs;

public interface ServiceErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:debuff.ServiceError)
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
   * <pre>
   * The numeric error code from the error code enum.
   * </pre>
   *
   * <code>.debuff.ErrorCode error_code = 2 [json_name = "error_code"];</code>
   * @return The enum numeric value on the wire for errorCode.
   */
  int getErrorCodeValue();
  /**
   * <pre>
   * The numeric error code from the error code enum.
   * </pre>
   *
   * <code>.debuff.ErrorCode error_code = 2 [json_name = "error_code"];</code>
   * @return The errorCode.
   */
  org.cyverse.de.protobufs.ErrorCode getErrorCode();

  /**
   * <pre>
   * The status code for the error.
   * </pre>
   *
   * <code>int32 status_code = 3 [json_name = "status_code"];</code>
   * @return The statusCode.
   */
  int getStatusCode();

  /**
   * <pre>
   * The error's message.
   * </pre>
   *
   * <code>string message = 4;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * The error's message.
   * </pre>
   *
   * <code>string message = 4;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
