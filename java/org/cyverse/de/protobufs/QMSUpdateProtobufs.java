// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_updates.proto

// Protobuf Java Version: 3.25.3
package org.cyverse.de.protobufs;

public final class QMSUpdateProtobufs {
  private QMSUpdateProtobufs() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qms_UpdateOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qms_UpdateOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qms_Update_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qms_Update_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qms_AddUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qms_AddUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qms_AddUpdateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qms_AddUpdateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qms_UpdateListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qms_UpdateListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qms_UpdateListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qms_UpdateListResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021qms_updates.proto\022\003qms\032\037google/protobu" +
      "f/timestamp.proto\032\014header.proto\032\016svcerro" +
      "r.proto\032\030qms_resource_types.proto\032\017qms_u" +
      "sers.proto\"-\n\017UpdateOperation\022\014\n\004uuid\030\001 " +
      "\001(\t\022\014\n\004name\030\002 \001(\t\"\207\002\n\006Update\022\014\n\004uuid\030\001 \001" +
      "(\t\022\036\n\nvalue_type\030\002 \001(\tR\nvalue_type\022\r\n\005va" +
      "lue\030\003 \001(\001\022B\n\016effective_date\030\004 \001(\0132\032.goog" +
      "le.protobuf.TimestampR\016effective_date\022\'\n" +
      "\toperation\030\005 \001(\0132\024.qms.UpdateOperation\0227" +
      "\n\rresource_type\030\006 \001(\0132\021.qms.ResourceType" +
      "R\rresource_type\022\032\n\004user\030\007 \001(\0132\014.qms.QMSU" +
      "ser\"O\n\020AddUpdateRequest\022\036\n\006header\030\001 \001(\0132" +
      "\016.header.Header\022\033\n\006update\030\002 \001(\0132\013.qms.Up" +
      "date\"w\n\021AddUpdateResponse\022\036\n\006header\030\001 \001(" +
      "\0132\016.header.Header\022%\n\005error\030\002 \001(\0132\026.svcer" +
      "ror.ServiceError\022\033\n\006update\030\003 \001(\0132\013.qms.U" +
      "pdate\"O\n\021UpdateListRequest\022\036\n\006header\030\001 \001" +
      "(\0132\016.header.Header\022\032\n\004user\030\002 \001(\0132\014.qms.Q" +
      "MSUser\"y\n\022UpdateListResponse\022\036\n\006header\030\001" +
      " \001(\0132\016.header.Header\022%\n\005error\030\002 \001(\0132\026.sv" +
      "cerror.ServiceError\022\034\n\007updates\030\003 \003(\0132\013.q" +
      "ms.UpdateBP\n\030org.cyverse.de.protobufsB\022Q" +
      "MSUpdateProtobufsP\001Z\036github.com/cyverse-" +
      "de/p/go/qmsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          org.cyverse.de.protobufs.HeaderProtobufs.getDescriptor(),
          org.cyverse.de.protobufs.ServiceErrorProtobufs.getDescriptor(),
          org.cyverse.de.protobufs.QMSResourceTypeProtobufs.getDescriptor(),
          org.cyverse.de.protobufs.QMSUSerProtobufs.getDescriptor(),
        });
    internal_static_qms_UpdateOperation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_qms_UpdateOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qms_UpdateOperation_descriptor,
        new java.lang.String[] { "Uuid", "Name", });
    internal_static_qms_Update_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_qms_Update_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qms_Update_descriptor,
        new java.lang.String[] { "Uuid", "ValueType", "Value", "EffectiveDate", "Operation", "ResourceType", "User", });
    internal_static_qms_AddUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_qms_AddUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qms_AddUpdateRequest_descriptor,
        new java.lang.String[] { "Header", "Update", });
    internal_static_qms_AddUpdateResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_qms_AddUpdateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qms_AddUpdateResponse_descriptor,
        new java.lang.String[] { "Header", "Error", "Update", });
    internal_static_qms_UpdateListRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_qms_UpdateListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qms_UpdateListRequest_descriptor,
        new java.lang.String[] { "Header", "User", });
    internal_static_qms_UpdateListResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_qms_UpdateListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qms_UpdateListResponse_descriptor,
        new java.lang.String[] { "Header", "Error", "Updates", });
    com.google.protobuf.TimestampProto.getDescriptor();
    org.cyverse.de.protobufs.HeaderProtobufs.getDescriptor();
    org.cyverse.de.protobufs.ServiceErrorProtobufs.getDescriptor();
    org.cyverse.de.protobufs.QMSResourceTypeProtobufs.getDescriptor();
    org.cyverse.de.protobufs.QMSUSerProtobufs.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
