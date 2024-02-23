// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: containers.proto

// Protobuf Java Version: 3.25.3
package org.cyverse.de.protobufs;

public interface VolumeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:containers.Volume)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The absolute path to a file/directory on the container host/k8s node.
   * </pre>
   *
   * <code>string host_path = 1 [json_name = "host_path"];</code>
   * @return The hostPath.
   */
  java.lang.String getHostPath();
  /**
   * <pre>
   * The absolute path to a file/directory on the container host/k8s node.
   * </pre>
   *
   * <code>string host_path = 1 [json_name = "host_path"];</code>
   * @return The bytes for hostPath.
   */
  com.google.protobuf.ByteString
      getHostPathBytes();

  /**
   * <pre>
   * The path to mount the host path to inside of the container.
   * </pre>
   *
   * <code>string container_path = 2 [json_name = "container_path"];</code>
   * @return The containerPath.
   */
  java.lang.String getContainerPath();
  /**
   * <pre>
   * The path to mount the host path to inside of the container.
   * </pre>
   *
   * <code>string container_path = 2 [json_name = "container_path"];</code>
   * @return The bytes for containerPath.
   */
  com.google.protobuf.ByteString
      getContainerPathBytes();

  /**
   * <pre>
   * Whether the mount point in the container should be read only.
   * </pre>
   *
   * <code>bool read_only = 3 [json_name = "read_only"];</code>
   * @return The readOnly.
   */
  boolean getReadOnly();

  /**
   * <pre>
   * The mode the mount point should have once mounted.
   * </pre>
   *
   * <code>string mode = 4;</code>
   * @return The mode.
   */
  java.lang.String getMode();
  /**
   * <pre>
   * The mode the mount point should have once mounted.
   * </pre>
   *
   * <code>string mode = 4;</code>
   * @return The bytes for mode.
   */
  com.google.protobuf.ByteString
      getModeBytes();
}
