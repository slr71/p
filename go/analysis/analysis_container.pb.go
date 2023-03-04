// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        v3.21.11
// source: analysis_container.proto

package analysis

import (
	header "github.com/cyverse-de/p/go/header"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type InteractiveApps struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	ProxyImage     string         `protobuf:"bytes,1,opt,name=proxy_image,json=proxyImage,proto3" json:"proxy_image,omitempty"`
	ProxyName      string         `protobuf:"bytes,2,opt,name=proxy_name,json=proxyName,proto3" json:"proxy_name,omitempty"`
	FrontendUrl    string         `protobuf:"bytes,3,opt,name=frontend_url,json=frontendUrl,proto3" json:"frontend_url,omitempty"`
	CasUrl         string         `protobuf:"bytes,4,opt,name=cas_url,json=casUrl,proto3" json:"cas_url,omitempty"`
	CasValidate    string         `protobuf:"bytes,5,opt,name=cas_validate,json=casValidate,proto3" json:"cas_validate,omitempty"`
	SslCertPath    string         `protobuf:"bytes,6,opt,name=ssl_cert_path,json=sslCertPath,proto3" json:"ssl_cert_path,omitempty"`
	SslKeyPath     string         `protobuf:"bytes,7,opt,name=ssl_key_path,json=sslKeyPath,proto3" json:"ssl_key_path,omitempty"`
	WebsocketPath  string         `protobuf:"bytes,8,opt,name=websocket_path,json=websocketPath,proto3" json:"websocket_path,omitempty"`
	WebsocketPort  string         `protobuf:"bytes,9,opt,name=websocket_port,json=websocketPort,proto3" json:"websocket_port,omitempty"`
	WebsocketProto string         `protobuf:"bytes,10,opt,name=websocket_proto,json=websocketProto,proto3" json:"websocket_proto,omitempty"`
	BackendUrl     string         `protobuf:"bytes,11,opt,name=backend_url,json=backendUrl,proto3" json:"backend_url,omitempty"`
	Header         *header.Header `protobuf:"bytes,12,opt,name=header,proto3" json:"header,omitempty"`
}

func (x *InteractiveApps) Reset() {
	*x = InteractiveApps{}
	if protoimpl.UnsafeEnabled {
		mi := &file_analysis_container_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *InteractiveApps) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*InteractiveApps) ProtoMessage() {}

func (x *InteractiveApps) ProtoReflect() protoreflect.Message {
	mi := &file_analysis_container_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use InteractiveApps.ProtoReflect.Descriptor instead.
func (*InteractiveApps) Descriptor() ([]byte, []int) {
	return file_analysis_container_proto_rawDescGZIP(), []int{0}
}

func (x *InteractiveApps) GetProxyImage() string {
	if x != nil {
		return x.ProxyImage
	}
	return ""
}

func (x *InteractiveApps) GetProxyName() string {
	if x != nil {
		return x.ProxyName
	}
	return ""
}

func (x *InteractiveApps) GetFrontendUrl() string {
	if x != nil {
		return x.FrontendUrl
	}
	return ""
}

func (x *InteractiveApps) GetCasUrl() string {
	if x != nil {
		return x.CasUrl
	}
	return ""
}

func (x *InteractiveApps) GetCasValidate() string {
	if x != nil {
		return x.CasValidate
	}
	return ""
}

func (x *InteractiveApps) GetSslCertPath() string {
	if x != nil {
		return x.SslCertPath
	}
	return ""
}

func (x *InteractiveApps) GetSslKeyPath() string {
	if x != nil {
		return x.SslKeyPath
	}
	return ""
}

func (x *InteractiveApps) GetWebsocketPath() string {
	if x != nil {
		return x.WebsocketPath
	}
	return ""
}

func (x *InteractiveApps) GetWebsocketPort() string {
	if x != nil {
		return x.WebsocketPort
	}
	return ""
}

func (x *InteractiveApps) GetWebsocketProto() string {
	if x != nil {
		return x.WebsocketProto
	}
	return ""
}

func (x *InteractiveApps) GetBackendUrl() string {
	if x != nil {
		return x.BackendUrl
	}
	return ""
}

func (x *InteractiveApps) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

type Container struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id              string                   `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Volumes         []*Container_Volume      `protobuf:"bytes,2,rep,name=volumes,json=container_volumes,proto3" json:"volumes,omitempty"`
	Devices         []*Container_Device      `protobuf:"bytes,3,rep,name=devices,json=container_devices,proto3" json:"devices,omitempty"`
	VolumesFrom     []*Container_VolumesFrom `protobuf:"bytes,4,rep,name=volumes_from,json=container_volumes_from,proto3" json:"volumes_from,omitempty"`
	Name            string                   `protobuf:"bytes,5,opt,name=name,proto3" json:"name,omitempty"`
	NetworkMode     string                   `protobuf:"bytes,6,opt,name=network_mode,proto3" json:"network_mode,omitempty"`
	CpuShares       int64                    `protobuf:"varint,7,opt,name=cpu_shares,proto3" json:"cpu_shares,omitempty"`
	InteractiveApps *InteractiveApps         `protobuf:"bytes,8,opt,name=interactive_apps,proto3" json:"interactive_apps,omitempty"`
	MemoryLimit     int64                    `protobuf:"varint,9,opt,name=memory_limit,proto3" json:"memory_limit,omitempty"`
	MinMemoryLimit  int64                    `protobuf:"varint,10,opt,name=min_memory_limit,proto3" json:"min_memory_limit,omitempty"`
	MaxCpuCores     float32                  `protobuf:"fixed32,11,opt,name=max_cpu_cores,proto3" json:"max_cpu_cores,omitempty"`
	MinCpuCores     float32                  `protobuf:"fixed32,12,opt,name=min_cpu_cores,proto3" json:"min_cpu_cores,omitempty"`
	MinDiskSpace    int64                    `protobuf:"varint,13,opt,name=min_disk_space,proto3" json:"min_disk_space,omitempty"`
	PidsLimit       int64                    `protobuf:"varint,14,opt,name=pids_limit,proto3" json:"pids_limit,omitempty"`
	Image           *Container_Image         `protobuf:"bytes,15,opt,name=image,proto3" json:"image,omitempty"`
	EntryPoint      string                   `protobuf:"bytes,16,opt,name=entry_point,json=entrypoint,proto3" json:"entry_point,omitempty"`
	WorkingDir      string                   `protobuf:"bytes,17,opt,name=working_dir,json=working_directory,proto3" json:"working_dir,omitempty"`
	Ports           []*Container_Port        `protobuf:"bytes,18,rep,name=ports,proto3" json:"ports,omitempty"`
	SkipTmpMount    bool                     `protobuf:"varint,19,opt,name=skip_tmp_mount,proto3" json:"skip_tmp_mount,omitempty"`
	Uid             int32                    `protobuf:"varint,20,opt,name=uid,proto3" json:"uid,omitempty"`
	Header          *header.Header           `protobuf:"bytes,21,opt,name=header,proto3" json:"header,omitempty"`
}

func (x *Container) Reset() {
	*x = Container{}
	if protoimpl.UnsafeEnabled {
		mi := &file_analysis_container_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Container) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Container) ProtoMessage() {}

func (x *Container) ProtoReflect() protoreflect.Message {
	mi := &file_analysis_container_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Container.ProtoReflect.Descriptor instead.
func (*Container) Descriptor() ([]byte, []int) {
	return file_analysis_container_proto_rawDescGZIP(), []int{1}
}

func (x *Container) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *Container) GetVolumes() []*Container_Volume {
	if x != nil {
		return x.Volumes
	}
	return nil
}

func (x *Container) GetDevices() []*Container_Device {
	if x != nil {
		return x.Devices
	}
	return nil
}

func (x *Container) GetVolumesFrom() []*Container_VolumesFrom {
	if x != nil {
		return x.VolumesFrom
	}
	return nil
}

func (x *Container) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Container) GetNetworkMode() string {
	if x != nil {
		return x.NetworkMode
	}
	return ""
}

func (x *Container) GetCpuShares() int64 {
	if x != nil {
		return x.CpuShares
	}
	return 0
}

func (x *Container) GetInteractiveApps() *InteractiveApps {
	if x != nil {
		return x.InteractiveApps
	}
	return nil
}

func (x *Container) GetMemoryLimit() int64 {
	if x != nil {
		return x.MemoryLimit
	}
	return 0
}

func (x *Container) GetMinMemoryLimit() int64 {
	if x != nil {
		return x.MinMemoryLimit
	}
	return 0
}

func (x *Container) GetMaxCpuCores() float32 {
	if x != nil {
		return x.MaxCpuCores
	}
	return 0
}

func (x *Container) GetMinCpuCores() float32 {
	if x != nil {
		return x.MinCpuCores
	}
	return 0
}

func (x *Container) GetMinDiskSpace() int64 {
	if x != nil {
		return x.MinDiskSpace
	}
	return 0
}

func (x *Container) GetPidsLimit() int64 {
	if x != nil {
		return x.PidsLimit
	}
	return 0
}

func (x *Container) GetImage() *Container_Image {
	if x != nil {
		return x.Image
	}
	return nil
}

func (x *Container) GetEntryPoint() string {
	if x != nil {
		return x.EntryPoint
	}
	return ""
}

func (x *Container) GetWorkingDir() string {
	if x != nil {
		return x.WorkingDir
	}
	return ""
}

func (x *Container) GetPorts() []*Container_Port {
	if x != nil {
		return x.Ports
	}
	return nil
}

func (x *Container) GetSkipTmpMount() bool {
	if x != nil {
		return x.SkipTmpMount
	}
	return false
}

func (x *Container) GetUid() int32 {
	if x != nil {
		return x.Uid
	}
	return 0
}

func (x *Container) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

type Container_Volume struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	HostPath      string `protobuf:"bytes,1,opt,name=host_path,proto3" json:"host_path,omitempty"`
	ContainerPath string `protobuf:"bytes,2,opt,name=container_path,proto3" json:"container_path,omitempty"`
	ReadOnly      bool   `protobuf:"varint,3,opt,name=read_only,proto3" json:"read_only,omitempty"`
	Mode          string `protobuf:"bytes,4,opt,name=mode,proto3" json:"mode,omitempty"`
}

func (x *Container_Volume) Reset() {
	*x = Container_Volume{}
	if protoimpl.UnsafeEnabled {
		mi := &file_analysis_container_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Container_Volume) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Container_Volume) ProtoMessage() {}

func (x *Container_Volume) ProtoReflect() protoreflect.Message {
	mi := &file_analysis_container_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Container_Volume.ProtoReflect.Descriptor instead.
func (*Container_Volume) Descriptor() ([]byte, []int) {
	return file_analysis_container_proto_rawDescGZIP(), []int{1, 0}
}

func (x *Container_Volume) GetHostPath() string {
	if x != nil {
		return x.HostPath
	}
	return ""
}

func (x *Container_Volume) GetContainerPath() string {
	if x != nil {
		return x.ContainerPath
	}
	return ""
}

func (x *Container_Volume) GetReadOnly() bool {
	if x != nil {
		return x.ReadOnly
	}
	return false
}

func (x *Container_Volume) GetMode() string {
	if x != nil {
		return x.Mode
	}
	return ""
}

type Container_Port struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	HostPort      int32 `protobuf:"varint,1,opt,name=host_port,proto3" json:"host_port,omitempty"`
	ContainerPort int32 `protobuf:"varint,2,opt,name=container_port,proto3" json:"container_port,omitempty"`
	BindToHost    bool  `protobuf:"varint,3,opt,name=bind_to_host,proto3" json:"bind_to_host,omitempty"`
}

func (x *Container_Port) Reset() {
	*x = Container_Port{}
	if protoimpl.UnsafeEnabled {
		mi := &file_analysis_container_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Container_Port) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Container_Port) ProtoMessage() {}

func (x *Container_Port) ProtoReflect() protoreflect.Message {
	mi := &file_analysis_container_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Container_Port.ProtoReflect.Descriptor instead.
func (*Container_Port) Descriptor() ([]byte, []int) {
	return file_analysis_container_proto_rawDescGZIP(), []int{1, 1}
}

func (x *Container_Port) GetHostPort() int32 {
	if x != nil {
		return x.HostPort
	}
	return 0
}

func (x *Container_Port) GetContainerPort() int32 {
	if x != nil {
		return x.ContainerPort
	}
	return 0
}

func (x *Container_Port) GetBindToHost() bool {
	if x != nil {
		return x.BindToHost
	}
	return false
}

type Container_Device struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	HostPath          string `protobuf:"bytes,1,opt,name=host_path,proto3" json:"host_path,omitempty"`
	ContainerPath     string `protobuf:"bytes,2,opt,name=container_path,proto3" json:"container_path,omitempty"`
	CgroupPermissions string `protobuf:"bytes,3,opt,name=cgroup_permissions,proto3" json:"cgroup_permissions,omitempty"`
}

func (x *Container_Device) Reset() {
	*x = Container_Device{}
	if protoimpl.UnsafeEnabled {
		mi := &file_analysis_container_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Container_Device) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Container_Device) ProtoMessage() {}

func (x *Container_Device) ProtoReflect() protoreflect.Message {
	mi := &file_analysis_container_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Container_Device.ProtoReflect.Descriptor instead.
func (*Container_Device) Descriptor() ([]byte, []int) {
	return file_analysis_container_proto_rawDescGZIP(), []int{1, 2}
}

func (x *Container_Device) GetHostPath() string {
	if x != nil {
		return x.HostPath
	}
	return ""
}

func (x *Container_Device) GetContainerPath() string {
	if x != nil {
		return x.ContainerPath
	}
	return ""
}

func (x *Container_Device) GetCgroupPermissions() string {
	if x != nil {
		return x.CgroupPermissions
	}
	return ""
}

type Container_VolumesFrom struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Tag           string `protobuf:"bytes,1,opt,name=tag,proto3" json:"tag,omitempty"`
	Name          string `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
	Auth          string `protobuf:"bytes,3,opt,name=auth,proto3" json:"auth,omitempty"`
	NamePrefix    string `protobuf:"bytes,4,opt,name=name_prefix,proto3" json:"name_prefix,omitempty"`
	Url           string `protobuf:"bytes,5,opt,name=url,proto3" json:"url,omitempty"`
	HostPath      string `protobuf:"bytes,6,opt,name=host_path,proto3" json:"host_path,omitempty"`
	ContainerPath string `protobuf:"bytes,7,opt,name=container_path,proto3" json:"container_path,omitempty"`
	ReadOnly      bool   `protobuf:"varint,8,opt,name=read_only,proto3" json:"read_only,omitempty"`
}

func (x *Container_VolumesFrom) Reset() {
	*x = Container_VolumesFrom{}
	if protoimpl.UnsafeEnabled {
		mi := &file_analysis_container_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Container_VolumesFrom) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Container_VolumesFrom) ProtoMessage() {}

func (x *Container_VolumesFrom) ProtoReflect() protoreflect.Message {
	mi := &file_analysis_container_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Container_VolumesFrom.ProtoReflect.Descriptor instead.
func (*Container_VolumesFrom) Descriptor() ([]byte, []int) {
	return file_analysis_container_proto_rawDescGZIP(), []int{1, 3}
}

func (x *Container_VolumesFrom) GetTag() string {
	if x != nil {
		return x.Tag
	}
	return ""
}

func (x *Container_VolumesFrom) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Container_VolumesFrom) GetAuth() string {
	if x != nil {
		return x.Auth
	}
	return ""
}

func (x *Container_VolumesFrom) GetNamePrefix() string {
	if x != nil {
		return x.NamePrefix
	}
	return ""
}

func (x *Container_VolumesFrom) GetUrl() string {
	if x != nil {
		return x.Url
	}
	return ""
}

func (x *Container_VolumesFrom) GetHostPath() string {
	if x != nil {
		return x.HostPath
	}
	return ""
}

func (x *Container_VolumesFrom) GetContainerPath() string {
	if x != nil {
		return x.ContainerPath
	}
	return ""
}

func (x *Container_VolumesFrom) GetReadOnly() bool {
	if x != nil {
		return x.ReadOnly
	}
	return false
}

type Container_Image struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id           string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Name         string `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
	Tag          string `protobuf:"bytes,3,opt,name=tag,proto3" json:"tag,omitempty"`
	Auth         string `protobuf:"bytes,4,opt,name=auth,proto3" json:"auth,omitempty"`
	Url          string `protobuf:"bytes,5,opt,name=url,proto3" json:"url,omitempty"`
	OsgImagePath string `protobuf:"bytes,6,opt,name=osg_image_path,proto3" json:"osg_image_path,omitempty"`
}

func (x *Container_Image) Reset() {
	*x = Container_Image{}
	if protoimpl.UnsafeEnabled {
		mi := &file_analysis_container_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Container_Image) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Container_Image) ProtoMessage() {}

func (x *Container_Image) ProtoReflect() protoreflect.Message {
	mi := &file_analysis_container_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Container_Image.ProtoReflect.Descriptor instead.
func (*Container_Image) Descriptor() ([]byte, []int) {
	return file_analysis_container_proto_rawDescGZIP(), []int{1, 4}
}

func (x *Container_Image) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *Container_Image) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Container_Image) GetTag() string {
	if x != nil {
		return x.Tag
	}
	return ""
}

func (x *Container_Image) GetAuth() string {
	if x != nil {
		return x.Auth
	}
	return ""
}

func (x *Container_Image) GetUrl() string {
	if x != nil {
		return x.Url
	}
	return ""
}

func (x *Container_Image) GetOsgImagePath() string {
	if x != nil {
		return x.OsgImagePath
	}
	return ""
}

var File_analysis_container_proto protoreflect.FileDescriptor

var file_analysis_container_proto_rawDesc = []byte{
	0x0a, 0x18, 0x61, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x69, 0x73, 0x5f, 0x63, 0x6f, 0x6e, 0x74, 0x61,
	0x69, 0x6e, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x06, 0x64, 0x65, 0x62, 0x75,
	0x66, 0x66, 0x1a, 0x0c, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x22, 0xb6, 0x03, 0x0a, 0x0f, 0x49, 0x6e, 0x74, 0x65, 0x72, 0x61, 0x63, 0x74, 0x69, 0x76, 0x65,
	0x41, 0x70, 0x70, 0x73, 0x12, 0x1f, 0x0a, 0x0b, 0x70, 0x72, 0x6f, 0x78, 0x79, 0x5f, 0x69, 0x6d,
	0x61, 0x67, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x70, 0x72, 0x6f, 0x78, 0x79,
	0x49, 0x6d, 0x61, 0x67, 0x65, 0x12, 0x1d, 0x0a, 0x0a, 0x70, 0x72, 0x6f, 0x78, 0x79, 0x5f, 0x6e,
	0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x70, 0x72, 0x6f, 0x78, 0x79,
	0x4e, 0x61, 0x6d, 0x65, 0x12, 0x21, 0x0a, 0x0c, 0x66, 0x72, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x64,
	0x5f, 0x75, 0x72, 0x6c, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x66, 0x72, 0x6f, 0x6e,
	0x74, 0x65, 0x6e, 0x64, 0x55, 0x72, 0x6c, 0x12, 0x17, 0x0a, 0x07, 0x63, 0x61, 0x73, 0x5f, 0x75,
	0x72, 0x6c, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x63, 0x61, 0x73, 0x55, 0x72, 0x6c,
	0x12, 0x21, 0x0a, 0x0c, 0x63, 0x61, 0x73, 0x5f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65,
	0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x63, 0x61, 0x73, 0x56, 0x61, 0x6c, 0x69, 0x64,
	0x61, 0x74, 0x65, 0x12, 0x22, 0x0a, 0x0d, 0x73, 0x73, 0x6c, 0x5f, 0x63, 0x65, 0x72, 0x74, 0x5f,
	0x70, 0x61, 0x74, 0x68, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x73, 0x73, 0x6c, 0x43,
	0x65, 0x72, 0x74, 0x50, 0x61, 0x74, 0x68, 0x12, 0x20, 0x0a, 0x0c, 0x73, 0x73, 0x6c, 0x5f, 0x6b,
	0x65, 0x79, 0x5f, 0x70, 0x61, 0x74, 0x68, 0x18, 0x07, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x73,
	0x73, 0x6c, 0x4b, 0x65, 0x79, 0x50, 0x61, 0x74, 0x68, 0x12, 0x25, 0x0a, 0x0e, 0x77, 0x65, 0x62,
	0x73, 0x6f, 0x63, 0x6b, 0x65, 0x74, 0x5f, 0x70, 0x61, 0x74, 0x68, 0x18, 0x08, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0d, 0x77, 0x65, 0x62, 0x73, 0x6f, 0x63, 0x6b, 0x65, 0x74, 0x50, 0x61, 0x74, 0x68,
	0x12, 0x25, 0x0a, 0x0e, 0x77, 0x65, 0x62, 0x73, 0x6f, 0x63, 0x6b, 0x65, 0x74, 0x5f, 0x70, 0x6f,
	0x72, 0x74, 0x18, 0x09, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0d, 0x77, 0x65, 0x62, 0x73, 0x6f, 0x63,
	0x6b, 0x65, 0x74, 0x50, 0x6f, 0x72, 0x74, 0x12, 0x27, 0x0a, 0x0f, 0x77, 0x65, 0x62, 0x73, 0x6f,
	0x63, 0x6b, 0x65, 0x74, 0x5f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x0e, 0x77, 0x65, 0x62, 0x73, 0x6f, 0x63, 0x6b, 0x65, 0x74, 0x50, 0x72, 0x6f, 0x74, 0x6f,
	0x12, 0x1f, 0x0a, 0x0b, 0x62, 0x61, 0x63, 0x6b, 0x65, 0x6e, 0x64, 0x5f, 0x75, 0x72, 0x6c, 0x18,
	0x0b, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x62, 0x61, 0x63, 0x6b, 0x65, 0x6e, 0x64, 0x55, 0x72,
	0x6c, 0x12, 0x26, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x0c, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x0e, 0x2e, 0x64, 0x65, 0x62, 0x75, 0x66, 0x66, 0x2e, 0x48, 0x65, 0x61, 0x64, 0x65,
	0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x22, 0xd2, 0x0c, 0x0a, 0x09, 0x43, 0x6f,
	0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x3c, 0x0a, 0x07, 0x76, 0x6f, 0x6c, 0x75, 0x6d,
	0x65, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x18, 0x2e, 0x64, 0x65, 0x62, 0x75, 0x66,
	0x66, 0x2e, 0x43, 0x6f, 0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x2e, 0x56, 0x6f, 0x6c, 0x75,
	0x6d, 0x65, 0x52, 0x11, 0x63, 0x6f, 0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x5f, 0x76, 0x6f,
	0x6c, 0x75, 0x6d, 0x65, 0x73, 0x12, 0x3c, 0x0a, 0x07, 0x64, 0x65, 0x76, 0x69, 0x63, 0x65, 0x73,
	0x18, 0x03, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x18, 0x2e, 0x64, 0x65, 0x62, 0x75, 0x66, 0x66, 0x2e,
	0x43, 0x6f, 0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x2e, 0x44, 0x65, 0x76, 0x69, 0x63, 0x65,
	0x52, 0x11, 0x63, 0x6f, 0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x5f, 0x64, 0x65, 0x76, 0x69,
	0x63, 0x65, 0x73, 0x12, 0x4b, 0x0a, 0x0c, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x5f, 0x66,
	0x72, 0x6f, 0x6d, 0x18, 0x04, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x64, 0x65, 0x62, 0x75,
	0x66, 0x66, 0x2e, 0x43, 0x6f, 0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x2e, 0x56, 0x6f, 0x6c,
	0x75, 0x6d, 0x65, 0x73, 0x46, 0x72, 0x6f, 0x6d, 0x52, 0x16, 0x63, 0x6f, 0x6e, 0x74, 0x61, 0x69,
	0x6e, 0x65, 0x72, 0x5f, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x5f, 0x66, 0x72, 0x6f, 0x6d,
	0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04,
	0x6e, 0x61, 0x6d, 0x65, 0x12, 0x22, 0x0a, 0x0c, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x5f,
	0x6d, 0x6f, 0x64, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x6e, 0x65, 0x74, 0x77,
	0x6f, 0x72, 0x6b, 0x5f, 0x6d, 0x6f, 0x64, 0x65, 0x12, 0x1e, 0x0a, 0x0a, 0x63, 0x70, 0x75, 0x5f,
	0x73, 0x68, 0x61, 0x72, 0x65, 0x73, 0x18, 0x07, 0x20, 0x01, 0x28, 0x03, 0x52, 0x0a, 0x63, 0x70,
	0x75, 0x5f, 0x73, 0x68, 0x61, 0x72, 0x65, 0x73, 0x12, 0x43, 0x0a, 0x10, 0x69, 0x6e, 0x74, 0x65,
	0x72, 0x61, 0x63, 0x74, 0x69, 0x76, 0x65, 0x5f, 0x61, 0x70, 0x70, 0x73, 0x18, 0x08, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x17, 0x2e, 0x64, 0x65, 0x62, 0x75, 0x66, 0x66, 0x2e, 0x49, 0x6e, 0x74, 0x65,
	0x72, 0x61, 0x63, 0x74, 0x69, 0x76, 0x65, 0x41, 0x70, 0x70, 0x73, 0x52, 0x10, 0x69, 0x6e, 0x74,
	0x65, 0x72, 0x61, 0x63, 0x74, 0x69, 0x76, 0x65, 0x5f, 0x61, 0x70, 0x70, 0x73, 0x12, 0x22, 0x0a,
	0x0c, 0x6d, 0x65, 0x6d, 0x6f, 0x72, 0x79, 0x5f, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x09, 0x20,
	0x01, 0x28, 0x03, 0x52, 0x0c, 0x6d, 0x65, 0x6d, 0x6f, 0x72, 0x79, 0x5f, 0x6c, 0x69, 0x6d, 0x69,
	0x74, 0x12, 0x2a, 0x0a, 0x10, 0x6d, 0x69, 0x6e, 0x5f, 0x6d, 0x65, 0x6d, 0x6f, 0x72, 0x79, 0x5f,
	0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x03, 0x52, 0x10, 0x6d, 0x69, 0x6e,
	0x5f, 0x6d, 0x65, 0x6d, 0x6f, 0x72, 0x79, 0x5f, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x12, 0x24, 0x0a,
	0x0d, 0x6d, 0x61, 0x78, 0x5f, 0x63, 0x70, 0x75, 0x5f, 0x63, 0x6f, 0x72, 0x65, 0x73, 0x18, 0x0b,
	0x20, 0x01, 0x28, 0x02, 0x52, 0x0d, 0x6d, 0x61, 0x78, 0x5f, 0x63, 0x70, 0x75, 0x5f, 0x63, 0x6f,
	0x72, 0x65, 0x73, 0x12, 0x24, 0x0a, 0x0d, 0x6d, 0x69, 0x6e, 0x5f, 0x63, 0x70, 0x75, 0x5f, 0x63,
	0x6f, 0x72, 0x65, 0x73, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x02, 0x52, 0x0d, 0x6d, 0x69, 0x6e, 0x5f,
	0x63, 0x70, 0x75, 0x5f, 0x63, 0x6f, 0x72, 0x65, 0x73, 0x12, 0x26, 0x0a, 0x0e, 0x6d, 0x69, 0x6e,
	0x5f, 0x64, 0x69, 0x73, 0x6b, 0x5f, 0x73, 0x70, 0x61, 0x63, 0x65, 0x18, 0x0d, 0x20, 0x01, 0x28,
	0x03, 0x52, 0x0e, 0x6d, 0x69, 0x6e, 0x5f, 0x64, 0x69, 0x73, 0x6b, 0x5f, 0x73, 0x70, 0x61, 0x63,
	0x65, 0x12, 0x1e, 0x0a, 0x0a, 0x70, 0x69, 0x64, 0x73, 0x5f, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18,
	0x0e, 0x20, 0x01, 0x28, 0x03, 0x52, 0x0a, 0x70, 0x69, 0x64, 0x73, 0x5f, 0x6c, 0x69, 0x6d, 0x69,
	0x74, 0x12, 0x2d, 0x0a, 0x05, 0x69, 0x6d, 0x61, 0x67, 0x65, 0x18, 0x0f, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x17, 0x2e, 0x64, 0x65, 0x62, 0x75, 0x66, 0x66, 0x2e, 0x43, 0x6f, 0x6e, 0x74, 0x61, 0x69,
	0x6e, 0x65, 0x72, 0x2e, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x52, 0x05, 0x69, 0x6d, 0x61, 0x67, 0x65,
	0x12, 0x1f, 0x0a, 0x0b, 0x65, 0x6e, 0x74, 0x72, 0x79, 0x5f, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x18,
	0x10, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x65, 0x6e, 0x74, 0x72, 0x79, 0x70, 0x6f, 0x69, 0x6e,
	0x74, 0x12, 0x26, 0x0a, 0x0b, 0x77, 0x6f, 0x72, 0x6b, 0x69, 0x6e, 0x67, 0x5f, 0x64, 0x69, 0x72,
	0x18, 0x11, 0x20, 0x01, 0x28, 0x09, 0x52, 0x11, 0x77, 0x6f, 0x72, 0x6b, 0x69, 0x6e, 0x67, 0x5f,
	0x64, 0x69, 0x72, 0x65, 0x63, 0x74, 0x6f, 0x72, 0x79, 0x12, 0x2c, 0x0a, 0x05, 0x70, 0x6f, 0x72,
	0x74, 0x73, 0x18, 0x12, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x16, 0x2e, 0x64, 0x65, 0x62, 0x75, 0x66,
	0x66, 0x2e, 0x43, 0x6f, 0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x2e, 0x50, 0x6f, 0x72, 0x74,
	0x52, 0x05, 0x70, 0x6f, 0x72, 0x74, 0x73, 0x12, 0x26, 0x0a, 0x0e, 0x73, 0x6b, 0x69, 0x70, 0x5f,
	0x74, 0x6d, 0x70, 0x5f, 0x6d, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x13, 0x20, 0x01, 0x28, 0x08, 0x52,
	0x0e, 0x73, 0x6b, 0x69, 0x70, 0x5f, 0x74, 0x6d, 0x70, 0x5f, 0x6d, 0x6f, 0x75, 0x6e, 0x74, 0x12,
	0x10, 0x0a, 0x03, 0x75, 0x69, 0x64, 0x18, 0x14, 0x20, 0x01, 0x28, 0x05, 0x52, 0x03, 0x75, 0x69,
	0x64, 0x12, 0x26, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x15, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x0e, 0x2e, 0x64, 0x65, 0x62, 0x75, 0x66, 0x66, 0x2e, 0x48, 0x65, 0x61, 0x64, 0x65,
	0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x1a, 0x80, 0x01, 0x0a, 0x06, 0x56, 0x6f,
	0x6c, 0x75, 0x6d, 0x65, 0x12, 0x1c, 0x0a, 0x09, 0x68, 0x6f, 0x73, 0x74, 0x5f, 0x70, 0x61, 0x74,
	0x68, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x68, 0x6f, 0x73, 0x74, 0x5f, 0x70, 0x61,
	0x74, 0x68, 0x12, 0x26, 0x0a, 0x0e, 0x63, 0x6f, 0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x5f,
	0x70, 0x61, 0x74, 0x68, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e, 0x63, 0x6f, 0x6e, 0x74,
	0x61, 0x69, 0x6e, 0x65, 0x72, 0x5f, 0x70, 0x61, 0x74, 0x68, 0x12, 0x1c, 0x0a, 0x09, 0x72, 0x65,
	0x61, 0x64, 0x5f, 0x6f, 0x6e, 0x6c, 0x79, 0x18, 0x03, 0x20, 0x01, 0x28, 0x08, 0x52, 0x09, 0x72,
	0x65, 0x61, 0x64, 0x5f, 0x6f, 0x6e, 0x6c, 0x79, 0x12, 0x12, 0x0a, 0x04, 0x6d, 0x6f, 0x64, 0x65,
	0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6d, 0x6f, 0x64, 0x65, 0x1a, 0x70, 0x0a, 0x04,
	0x50, 0x6f, 0x72, 0x74, 0x12, 0x1c, 0x0a, 0x09, 0x68, 0x6f, 0x73, 0x74, 0x5f, 0x70, 0x6f, 0x72,
	0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x52, 0x09, 0x68, 0x6f, 0x73, 0x74, 0x5f, 0x70, 0x6f,
	0x72, 0x74, 0x12, 0x26, 0x0a, 0x0e, 0x63, 0x6f, 0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x5f,
	0x70, 0x6f, 0x72, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x52, 0x0e, 0x63, 0x6f, 0x6e, 0x74,
	0x61, 0x69, 0x6e, 0x65, 0x72, 0x5f, 0x70, 0x6f, 0x72, 0x74, 0x12, 0x22, 0x0a, 0x0c, 0x62, 0x69,
	0x6e, 0x64, 0x5f, 0x74, 0x6f, 0x5f, 0x68, 0x6f, 0x73, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x08,
	0x52, 0x0c, 0x62, 0x69, 0x6e, 0x64, 0x5f, 0x74, 0x6f, 0x5f, 0x68, 0x6f, 0x73, 0x74, 0x1a, 0x7e,
	0x0a, 0x06, 0x44, 0x65, 0x76, 0x69, 0x63, 0x65, 0x12, 0x1c, 0x0a, 0x09, 0x68, 0x6f, 0x73, 0x74,
	0x5f, 0x70, 0x61, 0x74, 0x68, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x68, 0x6f, 0x73,
	0x74, 0x5f, 0x70, 0x61, 0x74, 0x68, 0x12, 0x26, 0x0a, 0x0e, 0x63, 0x6f, 0x6e, 0x74, 0x61, 0x69,
	0x6e, 0x65, 0x72, 0x5f, 0x70, 0x61, 0x74, 0x68, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e,
	0x63, 0x6f, 0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x5f, 0x70, 0x61, 0x74, 0x68, 0x12, 0x2e,
	0x0a, 0x12, 0x63, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x5f, 0x70, 0x65, 0x72, 0x6d, 0x69, 0x73, 0x73,
	0x69, 0x6f, 0x6e, 0x73, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x12, 0x63, 0x67, 0x72, 0x6f,
	0x75, 0x70, 0x5f, 0x70, 0x65, 0x72, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x1a, 0xdf,
	0x01, 0x0a, 0x0b, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x46, 0x72, 0x6f, 0x6d, 0x12, 0x10,
	0x0a, 0x03, 0x74, 0x61, 0x67, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x74, 0x61, 0x67,
	0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04,
	0x6e, 0x61, 0x6d, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x61, 0x75, 0x74, 0x68, 0x18, 0x03, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x04, 0x61, 0x75, 0x74, 0x68, 0x12, 0x20, 0x0a, 0x0b, 0x6e, 0x61, 0x6d, 0x65,
	0x5f, 0x70, 0x72, 0x65, 0x66, 0x69, 0x78, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x6e,
	0x61, 0x6d, 0x65, 0x5f, 0x70, 0x72, 0x65, 0x66, 0x69, 0x78, 0x12, 0x10, 0x0a, 0x03, 0x75, 0x72,
	0x6c, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x75, 0x72, 0x6c, 0x12, 0x1c, 0x0a, 0x09,
	0x68, 0x6f, 0x73, 0x74, 0x5f, 0x70, 0x61, 0x74, 0x68, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x09, 0x68, 0x6f, 0x73, 0x74, 0x5f, 0x70, 0x61, 0x74, 0x68, 0x12, 0x26, 0x0a, 0x0e, 0x63, 0x6f,
	0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x5f, 0x70, 0x61, 0x74, 0x68, 0x18, 0x07, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x0e, 0x63, 0x6f, 0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x5f, 0x70, 0x61,
	0x74, 0x68, 0x12, 0x1c, 0x0a, 0x09, 0x72, 0x65, 0x61, 0x64, 0x5f, 0x6f, 0x6e, 0x6c, 0x79, 0x18,
	0x08, 0x20, 0x01, 0x28, 0x08, 0x52, 0x09, 0x72, 0x65, 0x61, 0x64, 0x5f, 0x6f, 0x6e, 0x6c, 0x79,
	0x1a, 0x8b, 0x01, 0x0a, 0x05, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61,
	0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x10,
	0x0a, 0x03, 0x74, 0x61, 0x67, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x74, 0x61, 0x67,
	0x12, 0x12, 0x0a, 0x04, 0x61, 0x75, 0x74, 0x68, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04,
	0x61, 0x75, 0x74, 0x68, 0x12, 0x10, 0x0a, 0x03, 0x75, 0x72, 0x6c, 0x18, 0x05, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x03, 0x75, 0x72, 0x6c, 0x12, 0x26, 0x0a, 0x0e, 0x6f, 0x73, 0x67, 0x5f, 0x69, 0x6d,
	0x61, 0x67, 0x65, 0x5f, 0x70, 0x61, 0x74, 0x68, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e,
	0x6f, 0x73, 0x67, 0x5f, 0x69, 0x6d, 0x61, 0x67, 0x65, 0x5f, 0x70, 0x61, 0x74, 0x68, 0x42, 0x5d,
	0x0a, 0x18, 0x6f, 0x72, 0x67, 0x2e, 0x63, 0x79, 0x76, 0x65, 0x72, 0x73, 0x65, 0x2e, 0x64, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x73, 0x42, 0x1a, 0x41, 0x6e, 0x61, 0x6c,
	0x79, 0x73, 0x69, 0x73, 0x43, 0x6f, 0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x50, 0x72, 0x6f,
	0x74, 0x6f, 0x62, 0x75, 0x66, 0x73, 0x50, 0x01, 0x5a, 0x23, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62,
	0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x63, 0x79, 0x76, 0x65, 0x72, 0x73, 0x65, 0x2d, 0x64, 0x65, 0x2f,
	0x70, 0x2f, 0x67, 0x6f, 0x2f, 0x61, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x69, 0x73, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_analysis_container_proto_rawDescOnce sync.Once
	file_analysis_container_proto_rawDescData = file_analysis_container_proto_rawDesc
)

func file_analysis_container_proto_rawDescGZIP() []byte {
	file_analysis_container_proto_rawDescOnce.Do(func() {
		file_analysis_container_proto_rawDescData = protoimpl.X.CompressGZIP(file_analysis_container_proto_rawDescData)
	})
	return file_analysis_container_proto_rawDescData
}

var file_analysis_container_proto_msgTypes = make([]protoimpl.MessageInfo, 7)
var file_analysis_container_proto_goTypes = []interface{}{
	(*InteractiveApps)(nil),       // 0: debuff.InteractiveApps
	(*Container)(nil),             // 1: debuff.Container
	(*Container_Volume)(nil),      // 2: debuff.Container.Volume
	(*Container_Port)(nil),        // 3: debuff.Container.Port
	(*Container_Device)(nil),      // 4: debuff.Container.Device
	(*Container_VolumesFrom)(nil), // 5: debuff.Container.VolumesFrom
	(*Container_Image)(nil),       // 6: debuff.Container.Image
	(*header.Header)(nil),         // 7: debuff.Header
}
var file_analysis_container_proto_depIdxs = []int32{
	7, // 0: debuff.InteractiveApps.header:type_name -> debuff.Header
	2, // 1: debuff.Container.volumes:type_name -> debuff.Container.Volume
	4, // 2: debuff.Container.devices:type_name -> debuff.Container.Device
	5, // 3: debuff.Container.volumes_from:type_name -> debuff.Container.VolumesFrom
	0, // 4: debuff.Container.interactive_apps:type_name -> debuff.InteractiveApps
	6, // 5: debuff.Container.image:type_name -> debuff.Container.Image
	3, // 6: debuff.Container.ports:type_name -> debuff.Container.Port
	7, // 7: debuff.Container.header:type_name -> debuff.Header
	8, // [8:8] is the sub-list for method output_type
	8, // [8:8] is the sub-list for method input_type
	8, // [8:8] is the sub-list for extension type_name
	8, // [8:8] is the sub-list for extension extendee
	0, // [0:8] is the sub-list for field type_name
}

func init() { file_analysis_container_proto_init() }
func file_analysis_container_proto_init() {
	if File_analysis_container_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_analysis_container_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*InteractiveApps); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_analysis_container_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Container); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_analysis_container_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Container_Volume); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_analysis_container_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Container_Port); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_analysis_container_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Container_Device); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_analysis_container_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Container_VolumesFrom); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_analysis_container_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Container_Image); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_analysis_container_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   7,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_analysis_container_proto_goTypes,
		DependencyIndexes: file_analysis_container_proto_depIdxs,
		MessageInfos:      file_analysis_container_proto_msgTypes,
	}.Build()
	File_analysis_container_proto = out.File
	file_analysis_container_proto_rawDesc = nil
	file_analysis_container_proto_goTypes = nil
	file_analysis_container_proto_depIdxs = nil
}
