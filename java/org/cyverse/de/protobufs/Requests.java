// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: requests.proto

package org.cyverse.de.protobufs;

public final class Requests {
  private Requests() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_ByUsername_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_ByUsername_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_ByUserID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_ByUserID_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_NoParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_NoParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_ByUUID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_ByUUID_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_ByUUIDAndUsername_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_ByUUIDAndUsername_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_ByUUIDAndUserID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_ByUUIDAndUserID_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_AssociateByUUIDs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_AssociateByUUIDs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016requests.proto\022\006debuff\032\014header.proto\">" +
      "\n\nByUsername\022\036\n\006header\030\001 \001(\0132\016.debuff.He" +
      "ader\022\020\n\010username\030\002 \001(\t\"D\n\010ByUserID\022\036\n\006he" +
      "ader\030\001 \001(\0132\016.debuff.Header\022\030\n\007user_id\030\002 " +
      "\001(\tR\007user_id\"*\n\010NoParams\022\036\n\006header\030\001 \001(\013" +
      "2\016.debuff.Header\"6\n\006ByUUID\022\036\n\006header\030\001 \001" +
      "(\0132\016.debuff.Header\022\014\n\004uuid\030\002 \001(\t\"S\n\021ByUU" +
      "IDAndUsername\022\036\n\006header\030\001 \001(\0132\016.debuff.H" +
      "eader\022\014\n\004uuid\030\002 \001(\t\022\020\n\010username\030\003 \001(\t\"Y\n" +
      "\017ByUUIDAndUserID\022\036\n\006header\030\001 \001(\0132\016.debuf" +
      "f.Header\022\014\n\004uuid\030\002 \001(\t\022\030\n\007user_id\030\003 \001(\tR" +
      "\007user_id\"t\n\020AssociateByUUIDs\022\036\n\006header\030\001" +
      " \001(\0132\016.debuff.Header\022 \n\013parent_uuid\030\002 \001(" +
      "\tR\013parent_uuid\022\036\n\nchild_uuid\030\003 \001(\tR\nchil" +
      "d_uuidBK\n\030org.cyverse.de.protobufsB\010Requ" +
      "estsP\001Z#github.com/cyverse-de/p/go/reque" +
      "stsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.cyverse.de.protobufs.HeaderProtobufs.getDescriptor(),
        });
    internal_static_debuff_ByUsername_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_debuff_ByUsername_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_ByUsername_descriptor,
        new java.lang.String[] { "Header", "Username", });
    internal_static_debuff_ByUserID_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_debuff_ByUserID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_ByUserID_descriptor,
        new java.lang.String[] { "Header", "UserId", });
    internal_static_debuff_NoParams_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_debuff_NoParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_NoParams_descriptor,
        new java.lang.String[] { "Header", });
    internal_static_debuff_ByUUID_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_debuff_ByUUID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_ByUUID_descriptor,
        new java.lang.String[] { "Header", "Uuid", });
    internal_static_debuff_ByUUIDAndUsername_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_debuff_ByUUIDAndUsername_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_ByUUIDAndUsername_descriptor,
        new java.lang.String[] { "Header", "Uuid", "Username", });
    internal_static_debuff_ByUUIDAndUserID_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_debuff_ByUUIDAndUserID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_ByUUIDAndUserID_descriptor,
        new java.lang.String[] { "Header", "Uuid", "UserId", });
    internal_static_debuff_AssociateByUUIDs_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_debuff_AssociateByUUIDs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_AssociateByUUIDs_descriptor,
        new java.lang.String[] { "Header", "ParentUuid", "ChildUuid", });
    org.cyverse.de.protobufs.HeaderProtobufs.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
