// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: tools.proto
// Protobuf Java Version: 4.29.3

package org.cyverse.de.protobufs;

public interface ToolOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tools.Tool)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The UUID for the tool.
   * </pre>
   *
   * <code>string uuid = 1;</code>
   * @return The uuid.
   */
  java.lang.String getUuid();
  /**
   * <pre>
   * The UUID for the tool.
   * </pre>
   *
   * <code>string uuid = 1;</code>
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <pre>
   * The name of the tool.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the tool.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The version of the tool.
   * </pre>
   *
   * <code>string version = 3;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * The version of the tool.
   * </pre>
   *
   * <code>string version = 3;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * Attribution information for the tool.
   * </pre>
   *
   * <code>string attribution = 4;</code>
   * @return The attribution.
   */
  java.lang.String getAttribution();
  /**
   * <pre>
   * Attribution information for the tool.
   * </pre>
   *
   * <code>string attribution = 4;</code>
   * @return The bytes for attribution.
   */
  com.google.protobuf.ByteString
      getAttributionBytes();

  /**
   * <pre>
   * The description of the tool.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description of the tool.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The time limit the tool is allowed to run for by default. Unit is seconds.
   * </pre>
   *
   * <code>int32 time_limit_seconds = 6 [json_name = "time_limit_seconds"];</code>
   * @return The timeLimitSeconds.
   */
  int getTimeLimitSeconds();

  /**
   * <pre>
   * Whether the tool is restricted.
   * </pre>
   *
   * <code>bool restricted = 7;</code>
   * @return The restricted.
   */
  boolean getRestricted();

  /**
   * <pre>
   * Whether the tool is interactive (i.e. whether it is intended for use in VICE).
   * </pre>
   *
   * <code>bool interactive = 8;</code>
   * @return The interactive.
   */
  boolean getInteractive();

  /**
   * <pre>
   * Whether the tool requires a GPU.
   * </pre>
   *
   * <code>bool gpu_enabled = 9 [json_name = "gpu_enabled"];</code>
   * @return The gpuEnabled.
   */
  boolean getGpuEnabled();

  /**
   * <pre>
   * Integration data associated with the tool.
   * </pre>
   *
   * <code>.apps.IntegrationData integration_data = 10 [json_name = "integration_data"];</code>
   * @return Whether the integrationData field is set.
   */
  boolean hasIntegrationData();
  /**
   * <pre>
   * Integration data associated with the tool.
   * </pre>
   *
   * <code>.apps.IntegrationData integration_data = 10 [json_name = "integration_data"];</code>
   * @return The integrationData.
   */
  org.cyverse.de.protobufs.IntegrationData getIntegrationData();
  /**
   * <pre>
   * Integration data associated with the tool.
   * </pre>
   *
   * <code>.apps.IntegrationData integration_data = 10 [json_name = "integration_data"];</code>
   */
  org.cyverse.de.protobufs.IntegrationDataOrBuilder getIntegrationDataOrBuilder();

  /**
   * <pre>
   * The container image to use when running the tool.
   * </pre>
   *
   * <code>.containers.Image container_image = 11 [json_name = "container_image"];</code>
   * @return Whether the containerImage field is set.
   */
  boolean hasContainerImage();
  /**
   * <pre>
   * The container image to use when running the tool.
   * </pre>
   *
   * <code>.containers.Image container_image = 11 [json_name = "container_image"];</code>
   * @return The containerImage.
   */
  org.cyverse.de.protobufs.Image getContainerImage();
  /**
   * <pre>
   * The container image to use when running the tool.
   * </pre>
   *
   * <code>.containers.Image container_image = 11 [json_name = "container_image"];</code>
   */
  org.cyverse.de.protobufs.ImageOrBuilder getContainerImageOrBuilder();
}
