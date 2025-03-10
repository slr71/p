// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: containers.proto
// Protobuf Java Version: 4.29.3

package org.cyverse.de.protobufs;

public interface VolumesFromOrBuilder extends
    // @@protoc_insertion_point(interface_extends:containers.VolumesFrom)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The image tag for the mountee container.
   * </pre>
   *
   * <code>string tag = 1;</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <pre>
   * The image tag for the mountee container.
   * </pre>
   *
   * <code>string tag = 1;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <pre>
   * The name of the mountee container.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the mountee container.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Authentication information needed to pull the mountee container image.
   * </pre>
   *
   * <code>string auth = 3;</code>
   * @return The auth.
   */
  java.lang.String getAuth();
  /**
   * <pre>
   * Authentication information needed to pull the mountee container image.
   * </pre>
   *
   * <code>string auth = 3;</code>
   * @return The bytes for auth.
   */
  com.google.protobuf.ByteString
      getAuthBytes();

  /**
   * <pre>
   * The prefix that should be given to the name of the container.
   * </pre>
   *
   * <code>string name_prefix = 4 [json_name = "name_prefix"];</code>
   * @return The namePrefix.
   */
  java.lang.String getNamePrefix();
  /**
   * <pre>
   * The prefix that should be given to the name of the container.
   * </pre>
   *
   * <code>string name_prefix = 4 [json_name = "name_prefix"];</code>
   * @return The bytes for namePrefix.
   */
  com.google.protobuf.ByteString
      getNamePrefixBytes();

  /**
   * <pre>
   * The URL to the mountee container image.
   * </pre>
   *
   * <code>string url = 5;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * The URL to the mountee container image.
   * </pre>
   *
   * <code>string url = 5;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * The path inside the mountee container that should be mounted.
   * </pre>
   *
   * <code>string host_path = 6 [json_name = "host_path"];</code>
   * @return The hostPath.
   */
  java.lang.String getHostPath();
  /**
   * <pre>
   * The path inside the mountee container that should be mounted.
   * </pre>
   *
   * <code>string host_path = 6 [json_name = "host_path"];</code>
   * @return The bytes for hostPath.
   */
  com.google.protobuf.ByteString
      getHostPathBytes();

  /**
   * <pre>
   * The path to the mount point inside the mounting container.
   * </pre>
   *
   * <code>string container_path = 7 [json_name = "container_path"];</code>
   * @return The containerPath.
   */
  java.lang.String getContainerPath();
  /**
   * <pre>
   * The path to the mount point inside the mounting container.
   * </pre>
   *
   * <code>string container_path = 7 [json_name = "container_path"];</code>
   * @return The bytes for containerPath.
   */
  com.google.protobuf.ByteString
      getContainerPathBytes();

  /**
   * <pre>
   * Whether the mount point is read only.
   * </pre>
   *
   * <code>bool read_only = 8 [json_name = "read_only"];</code>
   * @return The readOnly.
   */
  boolean getReadOnly();
}
