// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: analysis_record.proto

package org.cyverse.de.protobufs;

public final class AnalysisRecordProtobufs {
  private AnalysisRecordProtobufs() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnalysisRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnalysisRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnalysisRecord_BatchStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnalysisRecord_BatchStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025analysis_record.proto\032\014header.proto\"\363\004" +
      "\n\016AnalysisRecord\022\027\n\006header\030\001 \001(\0132\007.Heade" +
      "r\022\n\n\002id\030\002 \001(\t\022\023\n\013description\030\003 \001(\t\022\014\n\004na" +
      "me\030\004 \001(\t\022\034\n\tcan_share\030\005 \001(\010R\tcan_share\022\020" +
      "\n\010username\030\006 \001(\t\022\026\n\006app_id\030\007 \001(\tR\006app_id" +
      "\022?\n\014batch_status\030\010 \001(\0132\033.AnalysisRecord." +
      "BatchStatusR\014batch_status\022\034\n\tsystem_id\030\t" +
      " \001(\tR\tsystem_id\022\"\n\014app_disabled\030\n \001(\010R\014a" +
      "pp_disabled\022\r\n\005batch\030\013 \001(\010\022\017\n\007enddate\030\014 " +
      "\001(\t\022\021\n\tstartdate\030\r \001(\t\022(\n\017app_descriptio" +
      "n\030\016 \001(\tR\017app_description\022*\n\020interactive_" +
      "urls\030\017 \003(\tR\020interactive_urls\022\032\n\010wiki_url" +
      "\030\020 \001(\tR\010wiki_url\022\016\n\006notify\030\021 \001(\010\022(\n\020resu" +
      "lt_folder_id\030\022 \001(\tR\016resultfolderid\022\032\n\010ap" +
      "p_name\030\023 \001(\tR\010app_name\032S\n\013BatchStatus\022\r\n" +
      "\005total\030\001 \001(\003\022\021\n\tcompleted\030\002 \001(\003\022\017\n\007runni" +
      "ng\030\003 \001(\003\022\021\n\tsubmitted\030\004 \001(\003BZ\n\030org.cyver" +
      "se.de.protobufsB\027AnalysisRecordProtobufs" +
      "P\001Z#github.com/cyverse-de/p/go/analysisb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.cyverse.de.protobufs.HeaderProtobufs.getDescriptor(),
        });
    internal_static_AnalysisRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AnalysisRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnalysisRecord_descriptor,
        new java.lang.String[] { "Header", "Id", "Description", "Name", "CanShare", "Username", "AppId", "BatchStatus", "SystemId", "AppDisabled", "Batch", "Enddate", "Startdate", "AppDescription", "InteractiveUrls", "WikiUrl", "Notify", "ResultFolderId", "AppName", });
    internal_static_AnalysisRecord_BatchStatus_descriptor =
      internal_static_AnalysisRecord_descriptor.getNestedTypes().get(0);
    internal_static_AnalysisRecord_BatchStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnalysisRecord_BatchStatus_descriptor,
        new java.lang.String[] { "Total", "Completed", "Running", "Submitted", });
    org.cyverse.de.protobufs.HeaderProtobufs.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}