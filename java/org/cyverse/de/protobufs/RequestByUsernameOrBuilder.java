// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_requests.proto

package org.cyverse.de.protobufs;

public interface RequestByUsernameOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RequestByUsername)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <code>.Header header = 1;</code>
   * @return The header.
   */
  org.cyverse.de.protobufs.Header getHeader();
  /**
   * <code>.Header header = 1;</code>
   */
  org.cyverse.de.protobufs.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>string username = 2;</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 2;</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();
}
