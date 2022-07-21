// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_user_plans.proto

package org.cyverse.de.protobufs;

public interface UserPlanOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UserPlan)
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
   * <code>.google.protobuf.Timestamp effective_start_date = 2 [json_name = "effective_start_date"];</code>
   * @return Whether the effectiveStartDate field is set.
   */
  boolean hasEffectiveStartDate();
  /**
   * <code>.google.protobuf.Timestamp effective_start_date = 2 [json_name = "effective_start_date"];</code>
   * @return The effectiveStartDate.
   */
  com.google.protobuf.Timestamp getEffectiveStartDate();
  /**
   * <code>.google.protobuf.Timestamp effective_start_date = 2 [json_name = "effective_start_date"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEffectiveStartDateOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp effective_end_date = 3 [json_name = "effective_end_date"];</code>
   * @return Whether the effectiveEndDate field is set.
   */
  boolean hasEffectiveEndDate();
  /**
   * <code>.google.protobuf.Timestamp effective_end_date = 3 [json_name = "effective_end_date"];</code>
   * @return The effectiveEndDate.
   */
  com.google.protobuf.Timestamp getEffectiveEndDate();
  /**
   * <code>.google.protobuf.Timestamp effective_end_date = 3 [json_name = "effective_end_date"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEffectiveEndDateOrBuilder();

  /**
   * <code>.QMSUser user = 4;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>.QMSUser user = 4;</code>
   * @return The user.
   */
  org.cyverse.de.protobufs.QMSUser getUser();
  /**
   * <code>.QMSUser user = 4;</code>
   */
  org.cyverse.de.protobufs.QMSUserOrBuilder getUserOrBuilder();

  /**
   * <code>.Plan plan = 5;</code>
   * @return Whether the plan field is set.
   */
  boolean hasPlan();
  /**
   * <code>.Plan plan = 5;</code>
   * @return The plan.
   */
  org.cyverse.de.protobufs.Plan getPlan();
  /**
   * <code>.Plan plan = 5;</code>
   */
  org.cyverse.de.protobufs.PlanOrBuilder getPlanOrBuilder();

  /**
   * <code>repeated .Quota quotas = 6;</code>
   */
  java.util.List<org.cyverse.de.protobufs.Quota> 
      getQuotasList();
  /**
   * <code>repeated .Quota quotas = 6;</code>
   */
  org.cyverse.de.protobufs.Quota getQuotas(int index);
  /**
   * <code>repeated .Quota quotas = 6;</code>
   */
  int getQuotasCount();
  /**
   * <code>repeated .Quota quotas = 6;</code>
   */
  java.util.List<? extends org.cyverse.de.protobufs.QuotaOrBuilder> 
      getQuotasOrBuilderList();
  /**
   * <code>repeated .Quota quotas = 6;</code>
   */
  org.cyverse.de.protobufs.QuotaOrBuilder getQuotasOrBuilder(
      int index);

  /**
   * <code>repeated .Usage usages = 7;</code>
   */
  java.util.List<org.cyverse.de.protobufs.Usage> 
      getUsagesList();
  /**
   * <code>repeated .Usage usages = 7;</code>
   */
  org.cyverse.de.protobufs.Usage getUsages(int index);
  /**
   * <code>repeated .Usage usages = 7;</code>
   */
  int getUsagesCount();
  /**
   * <code>repeated .Usage usages = 7;</code>
   */
  java.util.List<? extends org.cyverse.de.protobufs.UsageOrBuilder> 
      getUsagesOrBuilderList();
  /**
   * <code>repeated .Usage usages = 7;</code>
   */
  org.cyverse.de.protobufs.UsageOrBuilder getUsagesOrBuilder(
      int index);
}
