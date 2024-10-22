// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: monitoring_dns_check.proto

package org.cyverse.de.protobufs;

public final class MonitoringDNSCheck {
  private MonitoringDNSCheck() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_monitoring_DNSLookup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_monitoring_DNSLookup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_monitoring_DNSCheckResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_monitoring_DNSCheckResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032monitoring_dns_check.proto\022\nmonitoring" +
      "\032\014header.proto\032\016svcerror.proto\"I\n\tDNSLoo" +
      "kup\022\014\n\004host\030\001 \001(\t\022\021\n\taddresses\030\002 \003(\t\022\014\n\004" +
      "type\030\003 \001(\t\022\r\n\005error\030\004 \001(\t\"\253\001\n\016DNSCheckRe" +
      "sult\022\036\n\006header\030\001 \001(\0132\016.header.Header\022%\n\005" +
      "error\030\002 \001(\0132\026.svcerror.ServiceError\022&\n\007l" +
      "ookups\030\003 \003(\0132\025.monitoring.DNSLookup\022\014\n\004n" +
      "ode\030\004 \001(\t\022\034\n\tdate_sent\030\005 \001(\tR\tdate_sent*" +
      "H\n\nLookupType\022\020\n\014UNSET_LOOKUP\020\000\022\023\n\017INTER" +
      "NAL_LOOKUP\020\001\022\023\n\017EXTERNAL_LOOKUP\020\002BW\n\030org" +
      ".cyverse.de.protobufsB\022MonitoringDNSChec" +
      "kP\001Z%github.com/cyverse-de/p/go/monitori" +
      "ngb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.cyverse.de.protobufs.HeaderProtobufs.getDescriptor(),
          org.cyverse.de.protobufs.ServiceErrorProtobufs.getDescriptor(),
        });
    internal_static_monitoring_DNSLookup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_monitoring_DNSLookup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_monitoring_DNSLookup_descriptor,
        new java.lang.String[] { "Host", "Addresses", "Type", "Error", });
    internal_static_monitoring_DNSCheckResult_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_monitoring_DNSCheckResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_monitoring_DNSCheckResult_descriptor,
        new java.lang.String[] { "Header", "Error", "Lookups", "Node", "DateSent", });
    org.cyverse.de.protobufs.HeaderProtobufs.getDescriptor();
    org.cyverse.de.protobufs.ServiceErrorProtobufs.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
