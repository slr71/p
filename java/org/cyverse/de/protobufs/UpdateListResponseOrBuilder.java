// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: qms_updates.proto
// Protobuf Java Version: 4.29.3

package org.cyverse.de.protobufs;

public interface UpdateListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:qms.UpdateListResponse)
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
   * Error information returned by the request handler.
   * </pre>
   *
   * <code>.svcerror.ServiceError error = 2;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * Error information returned by the request handler.
   * </pre>
   *
   * <code>.svcerror.ServiceError error = 2;</code>
   * @return The error.
   */
  org.cyverse.de.protobufs.ServiceError getError();
  /**
   * <pre>
   * Error information returned by the request handler.
   * </pre>
   *
   * <code>.svcerror.ServiceError error = 2;</code>
   */
  org.cyverse.de.protobufs.ServiceErrorOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   * The list of updates returned by the request handler.
   * </pre>
   *
   * <code>repeated .qms.Update updates = 3;</code>
   */
  java.util.List<org.cyverse.de.protobufs.Update> 
      getUpdatesList();
  /**
   * <pre>
   * The list of updates returned by the request handler.
   * </pre>
   *
   * <code>repeated .qms.Update updates = 3;</code>
   */
  org.cyverse.de.protobufs.Update getUpdates(int index);
  /**
   * <pre>
   * The list of updates returned by the request handler.
   * </pre>
   *
   * <code>repeated .qms.Update updates = 3;</code>
   */
  int getUpdatesCount();
  /**
   * <pre>
   * The list of updates returned by the request handler.
   * </pre>
   *
   * <code>repeated .qms.Update updates = 3;</code>
   */
  java.util.List<? extends org.cyverse.de.protobufs.UpdateOrBuilder> 
      getUpdatesOrBuilderList();
  /**
   * <pre>
   * The list of updates returned by the request handler.
   * </pre>
   *
   * <code>repeated .qms.Update updates = 3;</code>
   */
  org.cyverse.de.protobufs.UpdateOrBuilder getUpdatesOrBuilder(
      int index);
}
