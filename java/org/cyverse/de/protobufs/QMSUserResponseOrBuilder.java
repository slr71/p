// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_users.proto

package org.cyverse.de.protobufs;

public interface QMSUserResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:qms.QMSUserResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Contains telemetry information
   * </pre>
   *
   * <code>.header.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   * Contains telemetry information
   * </pre>
   *
   * <code>.header.Header header = 1;</code>
   * @return The header.
   */
  org.cyverse.de.protobufs.Header getHeader();
  /**
   * <pre>
   * Contains telemetry information
   * </pre>
   *
   * <code>.header.Header header = 1;</code>
   */
  org.cyverse.de.protobufs.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * Error information generated by the request handler.
   * </pre>
   *
   * <code>.svcerror.ServiceError error = 2;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * Error information generated by the request handler.
   * </pre>
   *
   * <code>.svcerror.ServiceError error = 2;</code>
   * @return The error.
   */
  org.cyverse.de.protobufs.ServiceError getError();
  /**
   * <pre>
   * Error information generated by the request handler.
   * </pre>
   *
   * <code>.svcerror.ServiceError error = 2;</code>
   */
  org.cyverse.de.protobufs.ServiceErrorOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   * The user returned by the request handler.
   * </pre>
   *
   * <code>.qms.QMSUser user = 3;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <pre>
   * The user returned by the request handler.
   * </pre>
   *
   * <code>.qms.QMSUser user = 3;</code>
   * @return The user.
   */
  org.cyverse.de.protobufs.QMSUser getUser();
  /**
   * <pre>
   * The user returned by the request handler.
   * </pre>
   *
   * <code>.qms.QMSUser user = 3;</code>
   */
  org.cyverse.de.protobufs.QMSUserOrBuilder getUserOrBuilder();
}
