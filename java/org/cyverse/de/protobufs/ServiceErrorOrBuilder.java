// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: svcerror.proto
// Protobuf Java Version: 4.31.1

package org.cyverse.de.protobufs;

@com.google.protobuf.Generated
public interface ServiceErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:svcerror.ServiceError)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The numeric error code from the error code enum.
   * </pre>
   *
   * <code>.svcerror.ErrorCode error_code = 2 [json_name = "error_code"];</code>
   * @return The enum numeric value on the wire for errorCode.
   */
  int getErrorCodeValue();
  /**
   * <pre>
   * The numeric error code from the error code enum.
   * </pre>
   *
   * <code>.svcerror.ErrorCode error_code = 2 [json_name = "error_code"];</code>
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
