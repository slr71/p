// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: apps.proto
// Protobuf Java Version: 4.31.1

package org.cyverse.de.protobufs;

@com.google.protobuf.Generated
public final class AppsProtobufs {
  private AppsProtobufs() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
      /* patch= */ 1,
      /* suffix= */ "",
      AppsProtobufs.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apps_App_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_apps_App_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apps_IntegrationData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_apps_IntegrationData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apps_AppVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_apps_AppVersion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\napps.proto\022\004apps\032\037google/protobuf/time" +
      "stamp.proto\032\nuser.proto\"P\n\003App\022\n\n\002id\030\001 \001" +
      "(\t\022\014\n\004name\030\002 \001(\t\022\023\n\013description\030\003 \001(\t\022\032\n" +
      "\010wiki_url\030\004 \001(\tR\010wiki_url\"\215\001\n\017Integratio" +
      "nData\022\n\n\002id\030\001 \001(\t\022(\n\017integrator_name\030\002 \001" +
      "(\tR\017integrator_name\022*\n\020integrator_email\030" +
      "\003 \001(\tR\020integrator_email\022\030\n\004user\030\004 \001(\0132\n." +
      "user.User\"\274\002\n\nAppVersion\022\n\n\002id\030\001 \001(\t\022\026\n\006" +
      "app_id\030\002 \001(\tR\006app_id\022\017\n\007version\030\003 \001(\t\022$\n" +
      "\rversion_order\030\004 \001(\003R\rversion_order\022\017\n\007d" +
      "eleted\030\005 \001(\010\022\020\n\010disabled\030\006 \001(\010\022*\n\013integr" +
      "ation\030\007 \001(\0132\025.apps.IntegrationData\022F\n\020in" +
      "tegration_date\030\010 \001(\0132\032.google.protobuf.T" +
      "imestampR\020integration_date\022<\n\013edited_dat" +
      "e\030\t \001(\0132\032.google.protobuf.TimestampR\013edi" +
      "ted_dateBL\n\030org.cyverse.de.protobufsB\rAp" +
      "psProtobufsP\001Z\037github.com/cyverse-de/p/g" +
      "o/appsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          org.cyverse.de.protobufs.UserProtobufs.getDescriptor(),
        });
    internal_static_apps_App_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_apps_App_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_apps_App_descriptor,
        new java.lang.String[] { "Id", "Name", "Description", "WikiUrl", });
    internal_static_apps_IntegrationData_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_apps_IntegrationData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_apps_IntegrationData_descriptor,
        new java.lang.String[] { "Id", "IntegratorName", "IntegratorEmail", "User", });
    internal_static_apps_AppVersion_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_apps_AppVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_apps_AppVersion_descriptor,
        new java.lang.String[] { "Id", "AppId", "Version", "VersionOrder", "Deleted", "Disabled", "Integration", "IntegrationDate", "EditedDate", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.TimestampProto.getDescriptor();
    org.cyverse.de.protobufs.UserProtobufs.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
