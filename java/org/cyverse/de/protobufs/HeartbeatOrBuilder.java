// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: monitoring_heartbeat.proto

package org.cyverse.de.protobufs;

public interface HeartbeatOrBuilder extends
    // @@protoc_insertion_point(interface_extends:monitoring.Heartbeat)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.header.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <code>.header.Header header = 1;</code>
   * @return The header.
   */
  org.cyverse.de.protobufs.Header getHeader();
  /**
   * <code>.header.Header header = 1;</code>
   */
  org.cyverse.de.protobufs.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>.svcerror.ServiceError error = 2;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <code>.svcerror.ServiceError error = 2;</code>
   * @return The error.
   */
  org.cyverse.de.protobufs.ServiceError getError();
  /**
   * <code>.svcerror.ServiceError error = 2;</code>
   */
  org.cyverse.de.protobufs.ServiceErrorOrBuilder getErrorOrBuilder();

  /**
   * <code>string node = 3;</code>
   * @return The node.
   */
  java.lang.String getNode();
  /**
   * <code>string node = 3;</code>
   * @return The bytes for node.
   */
  com.google.protobuf.ByteString
      getNodeBytes();

  /**
   * <code>string date_sent = 4 [json_name = "date_sent"];</code>
   * @return The dateSent.
   */
  java.lang.String getDateSent();
  /**
   * <code>string date_sent = 4 [json_name = "date_sent"];</code>
   * @return The bytes for dateSent.
   */
  com.google.protobuf.ByteString
      getDateSentBytes();
}
