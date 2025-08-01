// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: qms_addons.proto
// Protobuf Java Version: 4.31.1

package org.cyverse.de.protobufs;

@com.google.protobuf.Generated
public interface AddonResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:qms.AddonResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Contains telemetry data.
   * </pre>
   *
   * <code>.header.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   * Contains telemetry data.
   * </pre>
   *
   * <code>.header.Header header = 1;</code>
   * @return The header.
   */
  org.cyverse.de.protobufs.Header getHeader();
  /**
   * <pre>
   * Contains telemetry data.
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
   * The add-on returned by the request handler.
   * </pre>
   *
   * <code>.qms.Addon addon = 3;</code>
   * @return Whether the addon field is set.
   */
  boolean hasAddon();
  /**
   * <pre>
   * The add-on returned by the request handler.
   * </pre>
   *
   * <code>.qms.Addon addon = 3;</code>
   * @return The addon.
   */
  org.cyverse.de.protobufs.Addon getAddon();
  /**
   * <pre>
   * The add-on returned by the request handler.
   * </pre>
   *
   * <code>.qms.Addon addon = 3;</code>
   */
  org.cyverse.de.protobufs.AddonOrBuilder getAddonOrBuilder();
}
