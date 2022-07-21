// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_plans.proto

package org.cyverse.de.protobufs;

public interface PlanOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Plan)
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
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated .QuotaDefault plan_quota_defaults = 4 [json_name = "plan_quota_defaults"];</code>
   */
  java.util.List<org.cyverse.de.protobufs.QuotaDefault> 
      getPlanQuotaDefaultsList();
  /**
   * <code>repeated .QuotaDefault plan_quota_defaults = 4 [json_name = "plan_quota_defaults"];</code>
   */
  org.cyverse.de.protobufs.QuotaDefault getPlanQuotaDefaults(int index);
  /**
   * <code>repeated .QuotaDefault plan_quota_defaults = 4 [json_name = "plan_quota_defaults"];</code>
   */
  int getPlanQuotaDefaultsCount();
  /**
   * <code>repeated .QuotaDefault plan_quota_defaults = 4 [json_name = "plan_quota_defaults"];</code>
   */
  java.util.List<? extends org.cyverse.de.protobufs.QuotaDefaultOrBuilder> 
      getPlanQuotaDefaultsOrBuilderList();
  /**
   * <code>repeated .QuotaDefault plan_quota_defaults = 4 [json_name = "plan_quota_defaults"];</code>
   */
  org.cyverse.de.protobufs.QuotaDefaultOrBuilder getPlanQuotaDefaultsOrBuilder(
      int index);
}