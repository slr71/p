// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_plans.proto

package org.cyverse.de.protobufs;

public interface QuotaDefaultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:QuotaDefault)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string uuid = 1;</code>
   * @return The uuid.
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 1;</code>
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <code>float quota_value = 2 [json_name = "quota_value"];</code>
   * @return The quotaValue.
   */
  float getQuotaValue();

  /**
   * <code>.ResourceType resource_type = 3 [json_name = "resource_type"];</code>
   * @return Whether the resourceType field is set.
   */
  boolean hasResourceType();
  /**
   * <code>.ResourceType resource_type = 3 [json_name = "resource_type"];</code>
   * @return The resourceType.
   */
  org.cyverse.de.protobufs.ResourceType getResourceType();
  /**
   * <code>.ResourceType resource_type = 3 [json_name = "resource_type"];</code>
   */
  org.cyverse.de.protobufs.ResourceTypeOrBuilder getResourceTypeOrBuilder();
}
