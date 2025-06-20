// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: analysis_record.proto
// Protobuf Java Version: 4.31.1

package org.cyverse.de.protobufs;

@com.google.protobuf.Generated
public final class AnalysisRecordProtobufs {
  private AnalysisRecordProtobufs() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
      /* patch= */ 1,
      /* suffix= */ "",
      AnalysisRecordProtobufs.class.getName());
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
    internal_static_analysis_BatchStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_analysis_BatchStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_analysis_AnalysisType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_analysis_AnalysisType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_analysis_Analysis_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_analysis_Analysis_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025analysis_record.proto\022\010analysis\032\037googl" +
      "e/protobuf/timestamp.proto\032\nuser.proto\032\n" +
      "apps.proto\"S\n\013BatchStatus\022\r\n\005total\030\001 \001(\003" +
      "\022\021\n\tcompleted\030\002 \001(\003\022\017\n\007running\030\003 \001(\003\022\021\n\t" +
      "submitted\030\004 \001(\003\"F\n\014AnalysisType\022\n\n\002id\030\001 " +
      "\001(\t\022\014\n\004name\030\002 \001(\t\022\034\n\tsystem_id\030\003 \001(\tR\tsy" +
      "stem_id\"\312\004\n\010Analysis\022\n\n\002id\030\001 \001(\t\022\023\n\013desc" +
      "ription\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\026\n\003app\030\004 \001(\013" +
      "2\t.apps.App\0222\n\013app_version\030\005 \001(\0132\020.apps." +
      "AppVersionR\013app_version\022*\n\004kind\030\006 \001(\0132\026." +
      "analysis.AnalysisTypeR\004type\022.\n\022result_fo" +
      "lder_path\030\007 \001(\tR\022result_folder_path\022:\n\ns" +
      "tart_date\030\010 \001(\0132\032.google.protobuf.Timest" +
      "ampR\nstart_date\0226\n\010end_date\030\t \001(\0132\032.goog" +
      "le.protobuf.TimestampR\010end_date\022F\n\020plann" +
      "ed_end_date\030\n \001(\0132\032.google.protobuf.Time" +
      "stampR\020planned_end_date\022\016\n\006status\030\013 \001(\t\022" +
      "\017\n\007deleted\030\014 \001(\010\022\016\n\006notify\030\r \001(\010\022\030\n\004user" +
      "\030\016 \001(\0132\n.user.User\022\021\n\tsubdomain\030\017 \001(\t\022\034\n" +
      "\tparent_id\030\020 \001(\tR\tparent_id\022/\n\023millicore" +
      "s_reserved\030\021 \001(\001R\022millicore_reservedBZ\n\030" +
      "org.cyverse.de.protobufsB\027AnalysisRecord" +
      "ProtobufsP\001Z#github.com/cyverse-de/p/go/" +
      "analysisb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          org.cyverse.de.protobufs.UserProtobufs.getDescriptor(),
          org.cyverse.de.protobufs.AppsProtobufs.getDescriptor(),
        });
    internal_static_analysis_BatchStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_analysis_BatchStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_analysis_BatchStatus_descriptor,
        new java.lang.String[] { "Total", "Completed", "Running", "Submitted", });
    internal_static_analysis_AnalysisType_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_analysis_AnalysisType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_analysis_AnalysisType_descriptor,
        new java.lang.String[] { "Id", "Name", "SystemId", });
    internal_static_analysis_Analysis_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_analysis_Analysis_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_analysis_Analysis_descriptor,
        new java.lang.String[] { "Id", "Description", "Name", "App", "AppVersion", "Kind", "ResultFolderPath", "StartDate", "EndDate", "PlannedEndDate", "Status", "Deleted", "Notify", "User", "Subdomain", "ParentId", "MillicoresReserved", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.TimestampProto.getDescriptor();
    org.cyverse.de.protobufs.UserProtobufs.getDescriptor();
    org.cyverse.de.protobufs.AppsProtobufs.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
