// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_requests.proto

package org.cyverse.de.protobufs;

public final class QMSRequestProtobufs {
  private QMSRequestProtobufs() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AllUserOveragesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AllUserOveragesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserResourceOveragesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserResourceOveragesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IsOverageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IsOverageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddUsage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddUsage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetUsages_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetUsages_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestByUsername_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestByUsername_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestByUserID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestByUserID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022qms_requests.proto\032\014header.proto\"C\n\026Al" +
      "lUserOveragesRequest\022\027\n\006header\030\001 \001(\0132\007.H" +
      "eader\022\020\n\010username\030\002 \001(\t\"n\n\033UserResourceO" +
      "veragesRequest\022\027\n\006header\030\001 \001(\0132\007.Header\022" +
      "\020\n\010username\030\002 \001(\t\022$\n\rresource_name\030\003 \001(\t" +
      "R\rresource_name\"c\n\020IsOverageRequest\022\027\n\006h" +
      "eader\030\001 \001(\0132\007.Header\022\020\n\010username\030\002 \001(\t\022$" +
      "\n\rresource_name\030\003 \001(\tR\rresource_name\"\305\001\n" +
      "\010AddUsage\022\027\n\006header\030\001 \001(\0132\007.Header\022\020\n\010us" +
      "ername\030\002 \001(\t\022$\n\rresource_name\030\003 \001(\tR\rres" +
      "ource_name\022 \n\013update_type\030\004 \001(\tR\013update_" +
      "type\022 \n\013usage_value\030\005 \001(\001R\013usage_value\022$" +
      "\n\rresource_unit\030\006 \001(\tR\rresource_unit\"6\n\t" +
      "GetUsages\022\027\n\006header\030\001 \001(\0132\007.Header\022\020\n\010us" +
      "ername\030\002 \001(\t\">\n\021RequestByUsername\022\027\n\006hea" +
      "der\030\001 \001(\0132\007.Header\022\020\n\010username\030\002 \001(\t\"D\n\017" +
      "RequestByUserID\022\027\n\006header\030\001 \001(\0132\007.Header" +
      "\022\030\n\007user_id\030\002 \001(\tR\007user_idBQ\n\030org.cyvers" +
      "e.de.protobufsB\023QMSRequestProtobufsP\001Z\036g" +
      "ithub.com/cyverse-de/p/go/qmsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.cyverse.de.protobufs.HeaderProtobufs.getDescriptor(),
        });
    internal_static_AllUserOveragesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AllUserOveragesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AllUserOveragesRequest_descriptor,
        new java.lang.String[] { "Header", "Username", });
    internal_static_UserResourceOveragesRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_UserResourceOveragesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserResourceOveragesRequest_descriptor,
        new java.lang.String[] { "Header", "Username", "ResourceName", });
    internal_static_IsOverageRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_IsOverageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IsOverageRequest_descriptor,
        new java.lang.String[] { "Header", "Username", "ResourceName", });
    internal_static_AddUsage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_AddUsage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddUsage_descriptor,
        new java.lang.String[] { "Header", "Username", "ResourceName", "UpdateType", "UsageValue", "ResourceUnit", });
    internal_static_GetUsages_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_GetUsages_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetUsages_descriptor,
        new java.lang.String[] { "Header", "Username", });
    internal_static_RequestByUsername_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_RequestByUsername_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestByUsername_descriptor,
        new java.lang.String[] { "Header", "Username", });
    internal_static_RequestByUserID_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_RequestByUserID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestByUserID_descriptor,
        new java.lang.String[] { "Header", "UserId", });
    org.cyverse.de.protobufs.HeaderProtobufs.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
