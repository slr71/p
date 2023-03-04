// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_plans.proto

package org.cyverse.de.protobufs;

public final class QMSPlansProtobufs {
  private QMSPlansProtobufs() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_QuotaDefault_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_QuotaDefault_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_QuotaDefaultResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_QuotaDefaultResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_QuotaDefaultList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_QuotaDefaultList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_Plan_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_Plan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_PlanResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_PlanResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_PlanList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_PlanList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_PlanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_PlanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_AddPlanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_AddPlanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_AddPlanQuotaDefaultRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_AddPlanQuotaDefaultRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017qms_plans.proto\022\006debuff\032\014header.proto\032" +
      "\016svcerror.proto\032\030qms_resource_types.prot" +
      "o\"z\n\014QuotaDefault\022\014\n\004uuid\030\001 \001(\t\022 \n\013quota" +
      "_value\030\002 \001(\002R\013quota_value\022:\n\rresource_ty" +
      "pe\030\003 \001(\0132\024.debuff.ResourceTypeR\rresource" +
      "_type\"\227\001\n\024QuotaDefaultResponse\022\036\n\006header" +
      "\030\001 \001(\0132\016.debuff.Header\022#\n\005error\030\002 \001(\0132\024." +
      "debuff.ServiceError\022:\n\rquota_default\030\003 \001" +
      "(\0132\024.debuff.QuotaDefaultR\rquota_default\"" +
      "\225\001\n\020QuotaDefaultList\022\036\n\006header\030\001 \001(\0132\016.d" +
      "ebuff.Header\022#\n\005error\030\002 \001(\0132\024.debuff.Ser" +
      "viceError\022<\n\016quota_defaults\030\003 \003(\0132\024.debu" +
      "ff.QuotaDefaultR\016quota_defaults\"\177\n\004Plan\022" +
      "\014\n\004uuid\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\023\n\013descripti" +
      "on\030\003 \001(\t\022F\n\023plan_quota_defaults\030\004 \003(\0132\024." +
      "debuff.QuotaDefaultR\023plan_quota_defaults" +
      "\"o\n\014PlanResponse\022\036\n\006header\030\001 \001(\0132\016.debuf" +
      "f.Header\022#\n\005error\030\002 \001(\0132\024.debuff.Service" +
      "Error\022\032\n\004plan\030\003 \001(\0132\014.debuff.Plan\"l\n\010Pla" +
      "nList\022\036\n\006header\030\001 \001(\0132\016.debuff.Header\022#\n" +
      "\005error\030\002 \001(\0132\024.debuff.ServiceError\022\033\n\005pl" +
      "ans\030\003 \003(\0132\014.debuff.Plan\"G\n\013PlanRequest\022\036" +
      "\n\006header\030\001 \001(\0132\016.debuff.Header\022\030\n\007plan_i" +
      "d\030\002 \001(\tR\007plan_id\"L\n\016AddPlanRequest\022\036\n\006he" +
      "ader\030\001 \001(\0132\016.debuff.Header\022\032\n\004plan\030\002 \001(\013" +
      "2\014.debuff.Plan\"\226\001\n\032AddPlanQuotaDefaultRe" +
      "quest\022\036\n\006header\030\001 \001(\0132\016.debuff.Header\022\034\n" +
      "\tplan_name\030\002 \001(\tR\tplan_name\022:\n\rquota_def" +
      "ault\030\003 \001(\0132\024.debuff.QuotaDefaultR\rquota_" +
      "defaultBO\n\030org.cyverse.de.protobufsB\021QMS" +
      "PlansProtobufsP\001Z\036github.com/cyverse-de/" +
      "p/go/qmsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.cyverse.de.protobufs.HeaderProtobufs.getDescriptor(),
          org.cyverse.de.protobufs.ServiceErrorProtobufs.getDescriptor(),
          org.cyverse.de.protobufs.QMSResourceTypeProtobufs.getDescriptor(),
        });
    internal_static_debuff_QuotaDefault_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_debuff_QuotaDefault_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_QuotaDefault_descriptor,
        new java.lang.String[] { "Uuid", "QuotaValue", "ResourceType", });
    internal_static_debuff_QuotaDefaultResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_debuff_QuotaDefaultResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_QuotaDefaultResponse_descriptor,
        new java.lang.String[] { "Header", "Error", "QuotaDefault", });
    internal_static_debuff_QuotaDefaultList_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_debuff_QuotaDefaultList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_QuotaDefaultList_descriptor,
        new java.lang.String[] { "Header", "Error", "QuotaDefaults", });
    internal_static_debuff_Plan_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_debuff_Plan_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_Plan_descriptor,
        new java.lang.String[] { "Uuid", "Name", "Description", "PlanQuotaDefaults", });
    internal_static_debuff_PlanResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_debuff_PlanResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_PlanResponse_descriptor,
        new java.lang.String[] { "Header", "Error", "Plan", });
    internal_static_debuff_PlanList_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_debuff_PlanList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_PlanList_descriptor,
        new java.lang.String[] { "Header", "Error", "Plans", });
    internal_static_debuff_PlanRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_debuff_PlanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_PlanRequest_descriptor,
        new java.lang.String[] { "Header", "PlanId", });
    internal_static_debuff_AddPlanRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_debuff_AddPlanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_AddPlanRequest_descriptor,
        new java.lang.String[] { "Header", "Plan", });
    internal_static_debuff_AddPlanQuotaDefaultRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_debuff_AddPlanQuotaDefaultRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_AddPlanQuotaDefaultRequest_descriptor,
        new java.lang.String[] { "Header", "PlanName", "QuotaDefault", });
    org.cyverse.de.protobufs.HeaderProtobufs.getDescriptor();
    org.cyverse.de.protobufs.ServiceErrorProtobufs.getDescriptor();
    org.cyverse.de.protobufs.QMSResourceTypeProtobufs.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
