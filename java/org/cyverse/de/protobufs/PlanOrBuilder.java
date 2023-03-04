// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_plans.proto

package org.cyverse.de.protobufs;

public interface PlanOrBuilder extends
    // @@protoc_insertion_point(interface_extends:debuff.Plan)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique identifier for the plan.
   * </pre>
   *
   * <code>string uuid = 1;</code>
   * @return The uuid.
   */
  java.lang.String getUuid();
  /**
   * <pre>
   * Unique identifier for the plan.
   * </pre>
   *
   * <code>string uuid = 1;</code>
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <pre>
   * The name of the plan.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the plan.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A description of the plan.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A description of the plan.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * A list of quota defaults associated with the plan.
   * </pre>
   *
   * <code>repeated .debuff.QuotaDefault plan_quota_defaults = 4 [json_name = "plan_quota_defaults"];</code>
   */
  java.util.List<org.cyverse.de.protobufs.QuotaDefault> 
      getPlanQuotaDefaultsList();
  /**
   * <pre>
   * A list of quota defaults associated with the plan.
   * </pre>
   *
   * <code>repeated .debuff.QuotaDefault plan_quota_defaults = 4 [json_name = "plan_quota_defaults"];</code>
   */
  org.cyverse.de.protobufs.QuotaDefault getPlanQuotaDefaults(int index);
  /**
   * <pre>
   * A list of quota defaults associated with the plan.
   * </pre>
   *
   * <code>repeated .debuff.QuotaDefault plan_quota_defaults = 4 [json_name = "plan_quota_defaults"];</code>
   */
  int getPlanQuotaDefaultsCount();
  /**
   * <pre>
   * A list of quota defaults associated with the plan.
   * </pre>
   *
   * <code>repeated .debuff.QuotaDefault plan_quota_defaults = 4 [json_name = "plan_quota_defaults"];</code>
   */
  java.util.List<? extends org.cyverse.de.protobufs.QuotaDefaultOrBuilder> 
      getPlanQuotaDefaultsOrBuilderList();
  /**
   * <pre>
   * A list of quota defaults associated with the plan.
   * </pre>
   *
   * <code>repeated .debuff.QuotaDefault plan_quota_defaults = 4 [json_name = "plan_quota_defaults"];</code>
   */
  org.cyverse.de.protobufs.QuotaDefaultOrBuilder getPlanQuotaDefaultsOrBuilder(
      int index);
}
