// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package org.cyverse.de.protobufs;

public final class UserProtobufs {
  private UserProtobufs() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_User_Preferences_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_User_Preferences_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_User_Login_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_User_Login_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_debuff_User_SavedSearches_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_debuff_User_SavedSearches_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\022\006debuff\032\037google/protobuf/ti" +
      "mestamp.proto\032\014header.proto\032\016svcerror.pr" +
      "oto\"\235\004\n\004User\022\014\n\004uuid\030\001 \001(\t\022\020\n\010username\030\002" +
      " \001(\t\022-\n\013preferences\030\003 \001(\0132\030.debuff.User." +
      "Preferences\022\"\n\006logins\030\004 \003(\0132\022.debuff.Use" +
      "r.Login\022\023\n\013login_count\030\007 \001(\r\0222\n\016saved_se" +
      "arches\030\010 \001(\0132\032.debuff.User.SavedSearches" +
      "\022\036\n\006header\030\t \001(\0132\016.debuff.Header\022#\n\005erro" +
      "r\030\n \001(\0132\024.debuff.ServiceError\0320\n\013Prefere" +
      "nces\022\014\n\004uuid\030\001 \001(\t\022\023\n\013preferences\030\002 \001(\t\032" +
      "\236\001\n\005Login\022\014\n\004uuid\030\001 \001(\t\022\022\n\nip_address\030\002 " +
      "\001(\t\022\022\n\nuser_agent\030\003 \001(\t\022.\n\nlogin_time\030\004 " +
      "\001(\0132\032.google.protobuf.Timestamp\022/\n\013logou" +
      "t_time\030\005 \001(\0132\032.google.protobuf.Timestamp" +
      "\0325\n\rSavedSearches\022\014\n\004uuid\030\001 \001(\t\022\026\n\016saved" +
      "_searches\030\002 \001(\tJ\004\010\005\020\006J\004\010\006\020\007BL\n\030org.cyver" +
      "se.de.protobufsB\rUserProtobufsP\001Z\037github" +
      ".com/cyverse-de/p/go/userb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          org.cyverse.de.protobufs.HeaderProtobufs.getDescriptor(),
          org.cyverse.de.protobufs.ServiceErrorProtobufs.getDescriptor(),
        });
    internal_static_debuff_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_debuff_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_User_descriptor,
        new java.lang.String[] { "Uuid", "Username", "Preferences", "Logins", "LoginCount", "SavedSearches", "Header", "Error", });
    internal_static_debuff_User_Preferences_descriptor =
      internal_static_debuff_User_descriptor.getNestedTypes().get(0);
    internal_static_debuff_User_Preferences_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_User_Preferences_descriptor,
        new java.lang.String[] { "Uuid", "Preferences", });
    internal_static_debuff_User_Login_descriptor =
      internal_static_debuff_User_descriptor.getNestedTypes().get(1);
    internal_static_debuff_User_Login_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_User_Login_descriptor,
        new java.lang.String[] { "Uuid", "IpAddress", "UserAgent", "LoginTime", "LogoutTime", });
    internal_static_debuff_User_SavedSearches_descriptor =
      internal_static_debuff_User_descriptor.getNestedTypes().get(2);
    internal_static_debuff_User_SavedSearches_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_debuff_User_SavedSearches_descriptor,
        new java.lang.String[] { "Uuid", "SavedSearches", });
    com.google.protobuf.TimestampProto.getDescriptor();
    org.cyverse.de.protobufs.HeaderProtobufs.getDescriptor();
    org.cyverse.de.protobufs.ServiceErrorProtobufs.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
