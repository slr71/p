// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: containers.proto
// Protobuf Java Version: 4.31.1

package org.cyverse.de.protobufs;

@com.google.protobuf.Generated
public interface ContainerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:containers.Container)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>repeated .containers.Volume volumes = 2 [json_name = "container_volumes"];</code>
   */
  java.util.List<org.cyverse.de.protobufs.Volume> 
      getVolumesList();
  /**
   * <code>repeated .containers.Volume volumes = 2 [json_name = "container_volumes"];</code>
   */
  org.cyverse.de.protobufs.Volume getVolumes(int index);
  /**
   * <code>repeated .containers.Volume volumes = 2 [json_name = "container_volumes"];</code>
   */
  int getVolumesCount();
  /**
   * <code>repeated .containers.Volume volumes = 2 [json_name = "container_volumes"];</code>
   */
  java.util.List<? extends org.cyverse.de.protobufs.VolumeOrBuilder> 
      getVolumesOrBuilderList();
  /**
   * <code>repeated .containers.Volume volumes = 2 [json_name = "container_volumes"];</code>
   */
  org.cyverse.de.protobufs.VolumeOrBuilder getVolumesOrBuilder(
      int index);

  /**
   * <code>repeated .containers.Device devices = 3 [json_name = "container_devices"];</code>
   */
  java.util.List<org.cyverse.de.protobufs.Device> 
      getDevicesList();
  /**
   * <code>repeated .containers.Device devices = 3 [json_name = "container_devices"];</code>
   */
  org.cyverse.de.protobufs.Device getDevices(int index);
  /**
   * <code>repeated .containers.Device devices = 3 [json_name = "container_devices"];</code>
   */
  int getDevicesCount();
  /**
   * <code>repeated .containers.Device devices = 3 [json_name = "container_devices"];</code>
   */
  java.util.List<? extends org.cyverse.de.protobufs.DeviceOrBuilder> 
      getDevicesOrBuilderList();
  /**
   * <code>repeated .containers.Device devices = 3 [json_name = "container_devices"];</code>
   */
  org.cyverse.de.protobufs.DeviceOrBuilder getDevicesOrBuilder(
      int index);

  /**
   * <code>repeated .containers.VolumesFrom volumes_from = 4 [json_name = "container_volumes_from"];</code>
   */
  java.util.List<org.cyverse.de.protobufs.VolumesFrom> 
      getVolumesFromList();
  /**
   * <code>repeated .containers.VolumesFrom volumes_from = 4 [json_name = "container_volumes_from"];</code>
   */
  org.cyverse.de.protobufs.VolumesFrom getVolumesFrom(int index);
  /**
   * <code>repeated .containers.VolumesFrom volumes_from = 4 [json_name = "container_volumes_from"];</code>
   */
  int getVolumesFromCount();
  /**
   * <code>repeated .containers.VolumesFrom volumes_from = 4 [json_name = "container_volumes_from"];</code>
   */
  java.util.List<? extends org.cyverse.de.protobufs.VolumesFromOrBuilder> 
      getVolumesFromOrBuilderList();
  /**
   * <code>repeated .containers.VolumesFrom volumes_from = 4 [json_name = "container_volumes_from"];</code>
   */
  org.cyverse.de.protobufs.VolumesFromOrBuilder getVolumesFromOrBuilder(
      int index);

  /**
   * <code>string name = 5;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 5;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string network_mode = 6 [json_name = "network_mode"];</code>
   * @return The networkMode.
   */
  java.lang.String getNetworkMode();
  /**
   * <code>string network_mode = 6 [json_name = "network_mode"];</code>
   * @return The bytes for networkMode.
   */
  com.google.protobuf.ByteString
      getNetworkModeBytes();

  /**
   * <code>int64 cpu_shares = 7 [json_name = "cpu_shares"];</code>
   * @return The cpuShares.
   */
  long getCpuShares();

  /**
   * <code>.containers.InteractiveApps interactive_apps = 8 [json_name = "interactive_apps"];</code>
   * @return Whether the interactiveApps field is set.
   */
  boolean hasInteractiveApps();
  /**
   * <code>.containers.InteractiveApps interactive_apps = 8 [json_name = "interactive_apps"];</code>
   * @return The interactiveApps.
   */
  org.cyverse.de.protobufs.InteractiveApps getInteractiveApps();
  /**
   * <code>.containers.InteractiveApps interactive_apps = 8 [json_name = "interactive_apps"];</code>
   */
  org.cyverse.de.protobufs.InteractiveAppsOrBuilder getInteractiveAppsOrBuilder();

  /**
   * <code>int64 memory_limit = 9 [json_name = "memory_limit"];</code>
   * @return The memoryLimit.
   */
  long getMemoryLimit();

  /**
   * <code>int64 min_memory_limit = 10 [json_name = "min_memory_limit"];</code>
   * @return The minMemoryLimit.
   */
  long getMinMemoryLimit();

  /**
   * <code>float max_cpu_cores = 11 [json_name = "max_cpu_cores"];</code>
   * @return The maxCpuCores.
   */
  float getMaxCpuCores();

  /**
   * <code>float min_cpu_cores = 12 [json_name = "min_cpu_cores"];</code>
   * @return The minCpuCores.
   */
  float getMinCpuCores();

  /**
   * <code>int64 min_disk_space = 13 [json_name = "min_disk_space"];</code>
   * @return The minDiskSpace.
   */
  long getMinDiskSpace();

  /**
   * <code>int64 pids_limit = 14 [json_name = "pids_limit"];</code>
   * @return The pidsLimit.
   */
  long getPidsLimit();

  /**
   * <code>.containers.Image image = 15;</code>
   * @return Whether the image field is set.
   */
  boolean hasImage();
  /**
   * <code>.containers.Image image = 15;</code>
   * @return The image.
   */
  org.cyverse.de.protobufs.Image getImage();
  /**
   * <code>.containers.Image image = 15;</code>
   */
  org.cyverse.de.protobufs.ImageOrBuilder getImageOrBuilder();

  /**
   * <code>string entry_point = 16 [json_name = "entrypoint"];</code>
   * @return The entryPoint.
   */
  java.lang.String getEntryPoint();
  /**
   * <code>string entry_point = 16 [json_name = "entrypoint"];</code>
   * @return The bytes for entryPoint.
   */
  com.google.protobuf.ByteString
      getEntryPointBytes();

  /**
   * <code>string working_dir = 17 [json_name = "working_directory"];</code>
   * @return The workingDir.
   */
  java.lang.String getWorkingDir();
  /**
   * <code>string working_dir = 17 [json_name = "working_directory"];</code>
   * @return The bytes for workingDir.
   */
  com.google.protobuf.ByteString
      getWorkingDirBytes();

  /**
   * <code>repeated .containers.Port ports = 18;</code>
   */
  java.util.List<org.cyverse.de.protobufs.Port> 
      getPortsList();
  /**
   * <code>repeated .containers.Port ports = 18;</code>
   */
  org.cyverse.de.protobufs.Port getPorts(int index);
  /**
   * <code>repeated .containers.Port ports = 18;</code>
   */
  int getPortsCount();
  /**
   * <code>repeated .containers.Port ports = 18;</code>
   */
  java.util.List<? extends org.cyverse.de.protobufs.PortOrBuilder> 
      getPortsOrBuilderList();
  /**
   * <code>repeated .containers.Port ports = 18;</code>
   */
  org.cyverse.de.protobufs.PortOrBuilder getPortsOrBuilder(
      int index);

  /**
   * <code>bool skip_tmp_mount = 19 [json_name = "skip_tmp_mount"];</code>
   * @return The skipTmpMount.
   */
  boolean getSkipTmpMount();

  /**
   * <code>int32 uid = 20 [json_name = "uid"];</code>
   * @return The uid.
   */
  int getUid();
}
