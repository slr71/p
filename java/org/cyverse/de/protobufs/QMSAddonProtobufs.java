// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_addons.proto

package org.cyverse.de.protobufs;

public final class QMSAddonProtobufs {
  private QMSAddonProtobufs() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Addon_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Addon_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddonResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddonListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddonListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddAddonRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddAddonRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddonLookupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddonLookupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdateAddonRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdateAddonRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SubscriptionAddon_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SubscriptionAddon_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdateSubscriptionAddonRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdateSubscriptionAddonRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SubscriptionAddonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SubscriptionAddonResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SubscriptionAddonListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SubscriptionAddonListResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020qms_addons.proto\032\014header.proto\032\016svcerr" +
      "or.proto\032\030qms_resource_types.proto\032\027qms_" +
      "subscriptions.proto\"\271\001\n\005Addon\022\014\n\004uuid\030\001 " +
      "\001(\t\022\014\n\004name\030\002 \001(\t\022\023\n\013description\030\003 \001(\t\0223" +
      "\n\rresource_type\030\004 \001(\0132\r.ResourceTypeR\rre" +
      "source_type\022&\n\016default_amount\030\005 \001(\002R\016def" +
      "ault_amount\022\"\n\014default_paid\030\006 \001(\010R\014defau" +
      "lt_paid\"]\n\rAddonResponse\022\027\n\006header\030\001 \001(\013" +
      "2\007.Header\022\034\n\005error\030\002 \001(\0132\r.ServiceError\022" +
      "\025\n\005addon\030\003 \001(\0132\006.Addon\"b\n\021AddonListRespo" +
      "nse\022\027\n\006header\030\001 \001(\0132\007.Header\022\034\n\005error\030\002 " +
      "\001(\0132\r.ServiceError\022\026\n\006addons\030\003 \003(\0132\006.Add" +
      "on\"A\n\017AddAddonRequest\022\027\n\006header\030\001 \001(\0132\007." +
      "Header\022\025\n\005addon\030\002 \001(\0132\006.Addon\"V\n\022AddonLo" +
      "okupRequest\022\027\n\006header\030\001 \001(\0132\007.Header\022\016\n\004" +
      "uuid\030\002 \001(\tH\000\022\016\n\004name\030\003 \001(\tH\000B\007\n\005addon\"\317\001" +
      "\n\022UpdateAddonRequest\022\027\n\006header\030\001 \001(\0132\007.H" +
      "eader\022\025\n\005addon\030\002 \001(\0132\006.Addon\022\023\n\013update_n" +
      "ame\030\003 \001(\010\022\032\n\022update_description\030\004 \001(\010\022\034\n" +
      "\024update_resource_type\030\005 \001(\010\022\035\n\025update_de" +
      "fault_amount\030\006 \001(\010\022\033\n\023update_default_pai" +
      "d\030\007 \001(\010\"{\n\021SubscriptionAddon\022\014\n\004uuid\030\001 \001" +
      "(\t\022\025\n\005addon\030\002 \001(\0132\006.Addon\022#\n\014subscriptio" +
      "n\030\003 \001(\0132\r.Subscription\022\016\n\006amount\030\004 \001(\002\022\014" +
      "\n\004paid\030\005 \001(\010\"\247\002\n\036UpdateSubscriptionAddon" +
      "Request\022\027\n\006header\030\001 \001(\0132\007.Header\022B\n\022subs" +
      "cription_addon\030\002 \001(\0132\022.SubscriptionAddon" +
      "R\022subscription_addon\022(\n\017update_addon_id\030" +
      "\003 \001(\010R\017update_addon_id\0226\n\026update_subscri" +
      "ption_id\030\004 \001(\010R\026update_subscription_id\022$" +
      "\n\rupdate_amount\030\005 \001(\010R\rupdate_amount\022 \n\013" +
      "update_paid\030\006 \001(\010R\013update_paid\"\226\001\n\031Subsc" +
      "riptionAddonResponse\022\027\n\006header\030\001 \001(\0132\007.H" +
      "eader\022\034\n\005error\030\002 \001(\0132\r.ServiceError\022B\n\022s" +
      "ubscription_addon\030\003 \001(\0132\022.SubscriptionAd" +
      "donR\022subscription_addon\"\234\001\n\035Subscription" +
      "AddonListResponse\022\027\n\006header\030\001 \001(\0132\007.Head" +
      "er\022\034\n\005error\030\002 \001(\0132\r.ServiceError\022D\n\023subs" +
      "cription_addons\030\003 \003(\0132\022.SubscriptionAddo" +
      "nR\023subscription_addonsBO\n\030org.cyverse.de" +
      ".protobufsB\021QMSAddonProtobufsP\001Z\036github." +
      "com/cyverse-de/p/go/qmsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.cyverse.de.protobufs.HeaderProtobufs.getDescriptor(),
          org.cyverse.de.protobufs.ServiceErrorProtobufs.getDescriptor(),
          org.cyverse.de.protobufs.QMSResourceTypeProtobufs.getDescriptor(),
          org.cyverse.de.protobufs.QMSSubscriptionProtobufs.getDescriptor(),
        });
    internal_static_Addon_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Addon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Addon_descriptor,
        new java.lang.String[] { "Uuid", "Name", "Description", "ResourceType", "DefaultAmount", "DefaultPaid", });
    internal_static_AddonResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AddonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddonResponse_descriptor,
        new java.lang.String[] { "Header", "Error", "Addon", });
    internal_static_AddonListResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_AddonListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddonListResponse_descriptor,
        new java.lang.String[] { "Header", "Error", "Addons", });
    internal_static_AddAddonRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_AddAddonRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddAddonRequest_descriptor,
        new java.lang.String[] { "Header", "Addon", });
    internal_static_AddonLookupRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_AddonLookupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddonLookupRequest_descriptor,
        new java.lang.String[] { "Header", "Uuid", "Name", "Addon", });
    internal_static_UpdateAddonRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_UpdateAddonRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdateAddonRequest_descriptor,
        new java.lang.String[] { "Header", "Addon", "UpdateName", "UpdateDescription", "UpdateResourceType", "UpdateDefaultAmount", "UpdateDefaultPaid", });
    internal_static_SubscriptionAddon_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_SubscriptionAddon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SubscriptionAddon_descriptor,
        new java.lang.String[] { "Uuid", "Addon", "Subscription", "Amount", "Paid", });
    internal_static_UpdateSubscriptionAddonRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_UpdateSubscriptionAddonRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdateSubscriptionAddonRequest_descriptor,
        new java.lang.String[] { "Header", "SubscriptionAddon", "UpdateAddonId", "UpdateSubscriptionId", "UpdateAmount", "UpdatePaid", });
    internal_static_SubscriptionAddonResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_SubscriptionAddonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SubscriptionAddonResponse_descriptor,
        new java.lang.String[] { "Header", "Error", "SubscriptionAddon", });
    internal_static_SubscriptionAddonListResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_SubscriptionAddonListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SubscriptionAddonListResponse_descriptor,
        new java.lang.String[] { "Header", "Error", "SubscriptionAddons", });
    org.cyverse.de.protobufs.HeaderProtobufs.getDescriptor();
    org.cyverse.de.protobufs.ServiceErrorProtobufs.getDescriptor();
    org.cyverse.de.protobufs.QMSResourceTypeProtobufs.getDescriptor();
    org.cyverse.de.protobufs.QMSSubscriptionProtobufs.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
