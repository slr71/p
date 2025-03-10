// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: containers.proto
// Protobuf Java Version: 4.29.3

package org.cyverse.de.protobufs;

public final class ContainersProtobufs {
  private ContainersProtobufs() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      ContainersProtobufs.class.getName());
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
    internal_static_containers_Volume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_containers_Volume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_containers_Port_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_containers_Port_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_containers_Device_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_containers_Device_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_containers_VolumesFrom_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_containers_VolumesFrom_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_containers_Image_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_containers_Image_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_containers_InteractiveApps_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_containers_InteractiveApps_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_containers_Container_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_containers_Container_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020containers.proto\022\ncontainers\"z\n\006Volume" +
      "\022\034\n\thost_path\030\001 \001(\tR\thost_path\022&\n\016contai" +
      "ner_path\030\002 \001(\tR\016container_path\022\034\n\tread_o" +
      "nly\030\003 \001(\010R\tread_only\022\014\n\004mode\030\004 \001(\t\"p\n\004Po" +
      "rt\022\034\n\thost_port\030\001 \001(\005R\thost_port\022&\n\016cont" +
      "ainer_port\030\002 \001(\005R\016container_port\022\"\n\014bind" +
      "_to_host\030\003 \001(\010R\014bind_to_host\"~\n\006Device\022\034" +
      "\n\thost_path\030\001 \001(\tR\thost_path\022&\n\016containe" +
      "r_path\030\002 \001(\tR\016container_path\022.\n\022cgroup_p" +
      "ermissions\030\003 \001(\tR\022cgroup_permissions\"\311\001\n" +
      "\013VolumesFrom\022\013\n\003tag\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022" +
      "\014\n\004auth\030\003 \001(\t\022 \n\013name_prefix\030\004 \001(\tR\013name" +
      "_prefix\022\013\n\003url\030\005 \001(\t\022\034\n\thost_path\030\006 \001(\tR" +
      "\thost_path\022&\n\016container_path\030\007 \001(\tR\016cont" +
      "ainer_path\022\034\n\tread_only\030\010 \001(\010R\tread_only" +
      "\"i\n\005Image\022\n\n\002id\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\013\n\003t" +
      "ag\030\003 \001(\t\022\013\n\003url\030\005 \001(\t\022&\n\016osg_image_path\030" +
      "\006 \001(\tR\016osg_image_pathJ\004\010\004\020\005\"\202\002\n\017Interact" +
      "iveApps\022\023\n\013proxy_image\030\001 \001(\t\022\022\n\nproxy_na" +
      "me\030\002 \001(\t\022\024\n\014frontend_url\030\003 \001(\t\022\017\n\007cas_ur" +
      "l\030\004 \001(\t\022\024\n\014cas_validate\030\005 \001(\t\022\025\n\rssl_cer" +
      "t_path\030\006 \001(\t\022\024\n\014ssl_key_path\030\007 \001(\t\022\026\n\016we" +
      "bsocket_path\030\010 \001(\t\022\026\n\016websocket_port\030\t \001" +
      "(\t\022\027\n\017websocket_proto\030\n \001(\t\022\023\n\013backend_u" +
      "rl\030\013 \001(\t\"\223\006\n\tContainer\022\n\n\002id\030\001 \001(\t\0226\n\007vo" +
      "lumes\030\002 \003(\0132\022.containers.VolumeR\021contain" +
      "er_volumes\0226\n\007devices\030\003 \003(\0132\022.containers" +
      ".DeviceR\021container_devices\022E\n\014volumes_fr" +
      "om\030\004 \003(\0132\027.containers.VolumesFromR\026conta" +
      "iner_volumes_from\022\014\n\004name\030\005 \001(\t\022\"\n\014netwo" +
      "rk_mode\030\006 \001(\tR\014network_mode\022\036\n\ncpu_share" +
      "s\030\007 \001(\003R\ncpu_shares\022G\n\020interactive_apps\030" +
      "\010 \001(\0132\033.containers.InteractiveAppsR\020inte" +
      "ractive_apps\022\"\n\014memory_limit\030\t \001(\003R\014memo" +
      "ry_limit\022*\n\020min_memory_limit\030\n \001(\003R\020min_" +
      "memory_limit\022$\n\rmax_cpu_cores\030\013 \001(\002R\rmax" +
      "_cpu_cores\022$\n\rmin_cpu_cores\030\014 \001(\002R\rmin_c" +
      "pu_cores\022&\n\016min_disk_space\030\r \001(\003R\016min_di" +
      "sk_space\022\036\n\npids_limit\030\016 \001(\003R\npids_limit" +
      "\022 \n\005image\030\017 \001(\0132\021.containers.Image\022\037\n\013en" +
      "try_point\030\020 \001(\tR\nentrypoint\022&\n\013working_d" +
      "ir\030\021 \001(\tR\021working_directory\022\037\n\005ports\030\022 \003" +
      "(\0132\020.containers.Port\022&\n\016skip_tmp_mount\030\023" +
      " \001(\010R\016skip_tmp_mount\022\020\n\003uid\030\024 \001(\005R\003uidBX" +
      "\n\030org.cyverse.de.protobufsB\023ContainersPr" +
      "otobufsP\001Z%github.com/cyverse-de/p/go/co" +
      "ntainersb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_containers_Volume_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_containers_Volume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_containers_Volume_descriptor,
        new java.lang.String[] { "HostPath", "ContainerPath", "ReadOnly", "Mode", });
    internal_static_containers_Port_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_containers_Port_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_containers_Port_descriptor,
        new java.lang.String[] { "HostPort", "ContainerPort", "BindToHost", });
    internal_static_containers_Device_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_containers_Device_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_containers_Device_descriptor,
        new java.lang.String[] { "HostPath", "ContainerPath", "CgroupPermissions", });
    internal_static_containers_VolumesFrom_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_containers_VolumesFrom_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_containers_VolumesFrom_descriptor,
        new java.lang.String[] { "Tag", "Name", "Auth", "NamePrefix", "Url", "HostPath", "ContainerPath", "ReadOnly", });
    internal_static_containers_Image_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_containers_Image_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_containers_Image_descriptor,
        new java.lang.String[] { "Id", "Name", "Tag", "Url", "OsgImagePath", });
    internal_static_containers_InteractiveApps_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_containers_InteractiveApps_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_containers_InteractiveApps_descriptor,
        new java.lang.String[] { "ProxyImage", "ProxyName", "FrontendUrl", "CasUrl", "CasValidate", "SslCertPath", "SslKeyPath", "WebsocketPath", "WebsocketPort", "WebsocketProto", "BackendUrl", });
    internal_static_containers_Container_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_containers_Container_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_containers_Container_descriptor,
        new java.lang.String[] { "Id", "Volumes", "Devices", "VolumesFrom", "Name", "NetworkMode", "CpuShares", "InteractiveApps", "MemoryLimit", "MinMemoryLimit", "MaxCpuCores", "MinCpuCores", "MinDiskSpace", "PidsLimit", "Image", "EntryPoint", "WorkingDir", "Ports", "SkipTmpMount", "Uid", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
