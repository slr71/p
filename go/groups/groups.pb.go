// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.36.6
// 	protoc        v6.31.1
// source: groups.proto

package groups

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
	unsafe "unsafe"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// *
// The subject type.
type SubjectType int32

const (
	SubjectType_user  SubjectType = 0
	SubjectType_group SubjectType = 1
)

// Enum value maps for SubjectType.
var (
	SubjectType_name = map[int32]string{
		0: "user",
		1: "group",
	}
	SubjectType_value = map[string]int32{
		"user":  0,
		"group": 1,
	}
)

func (x SubjectType) Enum() *SubjectType {
	p := new(SubjectType)
	*p = x
	return p
}

func (x SubjectType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (SubjectType) Descriptor() protoreflect.EnumDescriptor {
	return file_groups_proto_enumTypes[0].Descriptor()
}

func (SubjectType) Type() protoreflect.EnumType {
	return &file_groups_proto_enumTypes[0]
}

func (x SubjectType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use SubjectType.Descriptor instead.
func (SubjectType) EnumDescriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{0}
}

// *
// A permission level name.
type PermissionLevel int32

const (
	PermissionLevel_read  PermissionLevel = 0
	PermissionLevel_admin PermissionLevel = 1
	PermissionLevel_write PermissionLevel = 2
	PermissionLevel_own   PermissionLevel = 3
)

// Enum value maps for PermissionLevel.
var (
	PermissionLevel_name = map[int32]string{
		0: "read",
		1: "admin",
		2: "write",
		3: "own",
	}
	PermissionLevel_value = map[string]int32{
		"read":  0,
		"admin": 1,
		"write": 2,
		"own":   3,
	}
)

func (x PermissionLevel) Enum() *PermissionLevel {
	p := new(PermissionLevel)
	*p = x
	return p
}

func (x PermissionLevel) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (PermissionLevel) Descriptor() protoreflect.EnumDescriptor {
	return file_groups_proto_enumTypes[1].Descriptor()
}

func (PermissionLevel) Type() protoreflect.EnumType {
	return &file_groups_proto_enumTypes[1]
}

func (x PermissionLevel) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use PermissionLevel.Descriptor instead.
func (PermissionLevel) EnumDescriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{1}
}

type GroupInfo struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	Id            string                 `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Name          string                 `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *GroupInfo) Reset() {
	*x = GroupInfo{}
	mi := &file_groups_proto_msgTypes[0]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *GroupInfo) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GroupInfo) ProtoMessage() {}

func (x *GroupInfo) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[0]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GroupInfo.ProtoReflect.Descriptor instead.
func (*GroupInfo) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{0}
}

func (x *GroupInfo) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *GroupInfo) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

// *
// Information about a service.
type ServiceInfo struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// A brief description of the service.
	Description string `protobuf:"bytes,1,opt,name=description,proto3" json:"description,omitempty"`
	// The name of the service.
	Service string `protobuf:"bytes,2,opt,name=service,proto3" json:"service,omitempty"`
	// The service's version number.
	Version       string `protobuf:"bytes,3,opt,name=version,proto3" json:"version,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *ServiceInfo) Reset() {
	*x = ServiceInfo{}
	mi := &file_groups_proto_msgTypes[1]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *ServiceInfo) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ServiceInfo) ProtoMessage() {}

func (x *ServiceInfo) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[1]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ServiceInfo.ProtoReflect.Descriptor instead.
func (*ServiceInfo) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{1}
}

func (x *ServiceInfo) GetDescription() string {
	if x != nil {
		return x.Description
	}
	return ""
}

func (x *ServiceInfo) GetService() string {
	if x != nil {
		return x.Service
	}
	return ""
}

func (x *ServiceInfo) GetVersion() string {
	if x != nil {
		return x.Version
	}
	return ""
}

// *
// An incoming resource type.
type ResourceTypeIn struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The name of the resource type.
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// A brief description of the resource type.
	Description   string `protobuf:"bytes,2,opt,name=description,proto3" json:"description,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *ResourceTypeIn) Reset() {
	*x = ResourceTypeIn{}
	mi := &file_groups_proto_msgTypes[2]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *ResourceTypeIn) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ResourceTypeIn) ProtoMessage() {}

func (x *ResourceTypeIn) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[2]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ResourceTypeIn.ProtoReflect.Descriptor instead.
func (*ResourceTypeIn) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{2}
}

func (x *ResourceTypeIn) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *ResourceTypeIn) GetDescription() string {
	if x != nil {
		return x.Description
	}
	return ""
}

// *
// An outgoing resource type.
type ResourceTypeOut struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The resource type identifier.
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// The name of the resource type.
	Name string `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
	// A brief description of the resource type.
	Description   string `protobuf:"bytes,3,opt,name=description,proto3" json:"description,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *ResourceTypeOut) Reset() {
	*x = ResourceTypeOut{}
	mi := &file_groups_proto_msgTypes[3]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *ResourceTypeOut) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ResourceTypeOut) ProtoMessage() {}

func (x *ResourceTypeOut) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[3]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ResourceTypeOut.ProtoReflect.Descriptor instead.
func (*ResourceTypeOut) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{3}
}

func (x *ResourceTypeOut) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *ResourceTypeOut) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *ResourceTypeOut) GetDescription() string {
	if x != nil {
		return x.Description
	}
	return ""
}

// *
// A list of resource types.
type ResourceTypesOut struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The list of resource types.
	ResourceTypes []*ResourceTypeOut `protobuf:"bytes,1,rep,name=resource_types,proto3" json:"resource_types,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *ResourceTypesOut) Reset() {
	*x = ResourceTypesOut{}
	mi := &file_groups_proto_msgTypes[4]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *ResourceTypesOut) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ResourceTypesOut) ProtoMessage() {}

func (x *ResourceTypesOut) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[4]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ResourceTypesOut.ProtoReflect.Descriptor instead.
func (*ResourceTypesOut) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{4}
}

func (x *ResourceTypesOut) GetResourceTypes() []*ResourceTypeOut {
	if x != nil {
		return x.ResourceTypes
	}
	return nil
}

// *
// An incoming resource.
type ResourceIn struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The resource name.
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// The resource type name.
	ResourceType  string `protobuf:"bytes,2,opt,name=resource_type,proto3" json:"resource_type,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *ResourceIn) Reset() {
	*x = ResourceIn{}
	mi := &file_groups_proto_msgTypes[5]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *ResourceIn) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ResourceIn) ProtoMessage() {}

func (x *ResourceIn) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[5]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ResourceIn.ProtoReflect.Descriptor instead.
func (*ResourceIn) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{5}
}

func (x *ResourceIn) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *ResourceIn) GetResourceType() string {
	if x != nil {
		return x.ResourceType
	}
	return ""
}

// *
// A modification to a resource.
type ResourceUpdate struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The new resource name.
	Name          string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *ResourceUpdate) Reset() {
	*x = ResourceUpdate{}
	mi := &file_groups_proto_msgTypes[6]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *ResourceUpdate) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ResourceUpdate) ProtoMessage() {}

func (x *ResourceUpdate) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[6]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ResourceUpdate.ProtoReflect.Descriptor instead.
func (*ResourceUpdate) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{6}
}

func (x *ResourceUpdate) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

// *
// An outgoing resource.
type ResourceOut struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The resource identifier.
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// The resource name.
	Name string `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
	// The resource type name.
	ResourceType  string `protobuf:"bytes,3,opt,name=resource_type,proto3" json:"resource_type,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *ResourceOut) Reset() {
	*x = ResourceOut{}
	mi := &file_groups_proto_msgTypes[7]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *ResourceOut) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ResourceOut) ProtoMessage() {}

func (x *ResourceOut) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[7]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ResourceOut.ProtoReflect.Descriptor instead.
func (*ResourceOut) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{7}
}

func (x *ResourceOut) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *ResourceOut) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *ResourceOut) GetResourceType() string {
	if x != nil {
		return x.ResourceType
	}
	return ""
}

// *
// A list of resource.
type ResourcesOut struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The list of resources.
	Resources     []*ResourceOut `protobuf:"bytes,1,rep,name=resources,proto3" json:"resources,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *ResourcesOut) Reset() {
	*x = ResourcesOut{}
	mi := &file_groups_proto_msgTypes[8]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *ResourcesOut) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ResourcesOut) ProtoMessage() {}

func (x *ResourcesOut) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[8]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ResourcesOut.ProtoReflect.Descriptor instead.
func (*ResourcesOut) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{8}
}

func (x *ResourcesOut) GetResources() []*ResourceOut {
	if x != nil {
		return x.Resources
	}
	return nil
}

// *
// An incoming subject.
type SubjectIn struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The external subject identifier.
	SubjectId string `protobuf:"bytes,1,opt,name=subject_id,proto3" json:"subject_id,omitempty"`
	// The subject type.
	SubjectType   string `protobuf:"bytes,2,opt,name=subject_type,proto3" json:"subject_type,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *SubjectIn) Reset() {
	*x = SubjectIn{}
	mi := &file_groups_proto_msgTypes[9]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *SubjectIn) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SubjectIn) ProtoMessage() {}

func (x *SubjectIn) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[9]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SubjectIn.ProtoReflect.Descriptor instead.
func (*SubjectIn) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{9}
}

func (x *SubjectIn) GetSubjectId() string {
	if x != nil {
		return x.SubjectId
	}
	return ""
}

func (x *SubjectIn) GetSubjectType() string {
	if x != nil {
		return x.SubjectType
	}
	return ""
}

// *
// A list of incoming subjects.
type SubjectsIn struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The list of subjects.
	Subjects      []*SubjectIn `protobuf:"bytes,1,rep,name=subjects,proto3" json:"subjects,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *SubjectsIn) Reset() {
	*x = SubjectsIn{}
	mi := &file_groups_proto_msgTypes[10]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *SubjectsIn) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SubjectsIn) ProtoMessage() {}

func (x *SubjectsIn) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[10]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SubjectsIn.ProtoReflect.Descriptor instead.
func (*SubjectsIn) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{10}
}

func (x *SubjectsIn) GetSubjects() []*SubjectIn {
	if x != nil {
		return x.Subjects
	}
	return nil
}

// *
// An outgoing subject.
type SubjectOut struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The internal subject id.
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// The external subject id.
	SubjectId string `protobuf:"bytes,2,opt,name=subject_id,proto3" json:"subject_id,omitempty"`
	// The subject type.
	SubjectType string `protobuf:"bytes,3,opt,name=subject_type,proto3" json:"subject_type,omitempty"`
	// The subject source ID.
	SubjectSourceId string `protobuf:"bytes,4,opt,name=subject_source_id,proto3" json:"subject_source_id,omitempty"`
	unknownFields   protoimpl.UnknownFields
	sizeCache       protoimpl.SizeCache
}

func (x *SubjectOut) Reset() {
	*x = SubjectOut{}
	mi := &file_groups_proto_msgTypes[11]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *SubjectOut) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SubjectOut) ProtoMessage() {}

func (x *SubjectOut) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[11]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SubjectOut.ProtoReflect.Descriptor instead.
func (*SubjectOut) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{11}
}

func (x *SubjectOut) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *SubjectOut) GetSubjectId() string {
	if x != nil {
		return x.SubjectId
	}
	return ""
}

func (x *SubjectOut) GetSubjectType() string {
	if x != nil {
		return x.SubjectType
	}
	return ""
}

func (x *SubjectOut) GetSubjectSourceId() string {
	if x != nil {
		return x.SubjectSourceId
	}
	return ""
}

// *
// A list of outgoing subjects.
type SubjectsOut struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The list of subjects.
	Subjects      []*SubjectOut `protobuf:"bytes,1,rep,name=subjects,proto3" json:"subjects,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *SubjectsOut) Reset() {
	*x = SubjectsOut{}
	mi := &file_groups_proto_msgTypes[12]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *SubjectsOut) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SubjectsOut) ProtoMessage() {}

func (x *SubjectsOut) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[12]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SubjectsOut.ProtoReflect.Descriptor instead.
func (*SubjectsOut) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{12}
}

func (x *SubjectsOut) GetSubjects() []*SubjectOut {
	if x != nil {
		return x.Subjects
	}
	return nil
}

// *
// Information for granting permission to a user.
type PermissionGrantRequest struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The incoming subject.
	Subject *SubjectIn `protobuf:"bytes,1,opt,name=subject,proto3" json:"subject,omitempty"`
	// The incoming resource.
	Resource *ResourceIn `protobuf:"bytes,2,opt,name=resource,proto3" json:"resource,omitempty"`
	// The permission level.
	PermissionLevel PermissionLevel `protobuf:"varint,3,opt,name=permission_level,proto3,enum=groups.PermissionLevel" json:"permission_level,omitempty"`
	unknownFields   protoimpl.UnknownFields
	sizeCache       protoimpl.SizeCache
}

func (x *PermissionGrantRequest) Reset() {
	*x = PermissionGrantRequest{}
	mi := &file_groups_proto_msgTypes[13]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *PermissionGrantRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PermissionGrantRequest) ProtoMessage() {}

func (x *PermissionGrantRequest) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[13]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PermissionGrantRequest.ProtoReflect.Descriptor instead.
func (*PermissionGrantRequest) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{13}
}

func (x *PermissionGrantRequest) GetSubject() *SubjectIn {
	if x != nil {
		return x.Subject
	}
	return nil
}

func (x *PermissionGrantRequest) GetResource() *ResourceIn {
	if x != nil {
		return x.Resource
	}
	return nil
}

func (x *PermissionGrantRequest) GetPermissionLevel() PermissionLevel {
	if x != nil {
		return x.PermissionLevel
	}
	return PermissionLevel_read
}

// *
// Specifies the permission level to assign.
type PermissionPutRequest struct {
	state           protoimpl.MessageState `protogen:"open.v1"`
	PermissionLevel PermissionLevel        `protobuf:"varint,1,opt,name=permission_level,proto3,enum=groups.PermissionLevel" json:"permission_level,omitempty"`
	unknownFields   protoimpl.UnknownFields
	sizeCache       protoimpl.SizeCache
}

func (x *PermissionPutRequest) Reset() {
	*x = PermissionPutRequest{}
	mi := &file_groups_proto_msgTypes[14]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *PermissionPutRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PermissionPutRequest) ProtoMessage() {}

func (x *PermissionPutRequest) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[14]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PermissionPutRequest.ProtoReflect.Descriptor instead.
func (*PermissionPutRequest) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{14}
}

func (x *PermissionPutRequest) GetPermissionLevel() PermissionLevel {
	if x != nil {
		return x.PermissionLevel
	}
	return PermissionLevel_read
}

// *
// Information about permissions granted to a user.
type Permission struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The permission id.
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// The outgoing subject.
	Subject *SubjectOut `protobuf:"bytes,2,opt,name=subject,proto3" json:"subject,omitempty"`
	// The outgoing resource.
	Resource *ResourceOut `protobuf:"bytes,3,opt,name=resource,proto3" json:"resource,omitempty"`
	// The permission level.
	PermissionLevel PermissionLevel `protobuf:"varint,4,opt,name=permission_level,proto3,enum=groups.PermissionLevel" json:"permission_level,omitempty"`
	unknownFields   protoimpl.UnknownFields
	sizeCache       protoimpl.SizeCache
}

func (x *Permission) Reset() {
	*x = Permission{}
	mi := &file_groups_proto_msgTypes[15]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *Permission) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Permission) ProtoMessage() {}

func (x *Permission) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[15]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Permission.ProtoReflect.Descriptor instead.
func (*Permission) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{15}
}

func (x *Permission) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *Permission) GetSubject() *SubjectOut {
	if x != nil {
		return x.Subject
	}
	return nil
}

func (x *Permission) GetResource() *ResourceOut {
	if x != nil {
		return x.Resource
	}
	return nil
}

func (x *Permission) GetPermissionLevel() PermissionLevel {
	if x != nil {
		return x.PermissionLevel
	}
	return PermissionLevel_read
}

// *
// A list of matching permissions.
type PermissionList struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// A list of matching permissions.
	Permissions   []*Permission `protobuf:"bytes,1,rep,name=permissions,proto3" json:"permissions,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *PermissionList) Reset() {
	*x = PermissionList{}
	mi := &file_groups_proto_msgTypes[16]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *PermissionList) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PermissionList) ProtoMessage() {}

func (x *PermissionList) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[16]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PermissionList.ProtoReflect.Descriptor instead.
func (*PermissionList) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{16}
}

func (x *PermissionList) GetPermissions() []*Permission {
	if x != nil {
		return x.Permissions
	}
	return nil
}

// *
// Abbreviated information about permissions granted to a user.
type AbbreviatedPermission struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The permission identifier.
	PermissionId string `protobuf:"bytes,1,opt,name=permission_id,proto3" json:"permission_id,omitempty"`
	// The name of the resource.
	ResourceName string `protobuf:"bytes,2,opt,name=resource_name,proto3" json:"resource_name,omitempty"`
	// The type of the resource.
	ResourceType string `protobuf:"bytes,3,opt,name=resource_type,proto3" json:"resource_type,omitempty"`
	// The permission level.
	PermissionLevel PermissionLevel `protobuf:"varint,4,opt,name=permission_level,proto3,enum=groups.PermissionLevel" json:"permission_level,omitempty"`
	unknownFields   protoimpl.UnknownFields
	sizeCache       protoimpl.SizeCache
}

func (x *AbbreviatedPermission) Reset() {
	*x = AbbreviatedPermission{}
	mi := &file_groups_proto_msgTypes[17]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *AbbreviatedPermission) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AbbreviatedPermission) ProtoMessage() {}

func (x *AbbreviatedPermission) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[17]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AbbreviatedPermission.ProtoReflect.Descriptor instead.
func (*AbbreviatedPermission) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{17}
}

func (x *AbbreviatedPermission) GetPermissionId() string {
	if x != nil {
		return x.PermissionId
	}
	return ""
}

func (x *AbbreviatedPermission) GetResourceName() string {
	if x != nil {
		return x.ResourceName
	}
	return ""
}

func (x *AbbreviatedPermission) GetResourceType() string {
	if x != nil {
		return x.ResourceType
	}
	return ""
}

func (x *AbbreviatedPermission) GetPermissionLevel() PermissionLevel {
	if x != nil {
		return x.PermissionLevel
	}
	return PermissionLevel_read
}

// *
// A list of abbreviated permissions granted to a user.
type AbbreviatedPermissionList struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The list of permissions.
	Permissions   []*AbbreviatedPermission `protobuf:"bytes,1,rep,name=permissions,proto3" json:"permissions,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *AbbreviatedPermissionList) Reset() {
	*x = AbbreviatedPermissionList{}
	mi := &file_groups_proto_msgTypes[18]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *AbbreviatedPermissionList) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AbbreviatedPermissionList) ProtoMessage() {}

func (x *AbbreviatedPermissionList) ProtoReflect() protoreflect.Message {
	mi := &file_groups_proto_msgTypes[18]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AbbreviatedPermissionList.ProtoReflect.Descriptor instead.
func (*AbbreviatedPermissionList) Descriptor() ([]byte, []int) {
	return file_groups_proto_rawDescGZIP(), []int{18}
}

func (x *AbbreviatedPermissionList) GetPermissions() []*AbbreviatedPermission {
	if x != nil {
		return x.Permissions
	}
	return nil
}

var File_groups_proto protoreflect.FileDescriptor

const file_groups_proto_rawDesc = "" +
	"\n" +
	"\fgroups.proto\x12\x06groups\"/\n" +
	"\tGroupInfo\x12\x0e\n" +
	"\x02id\x18\x01 \x01(\tR\x02id\x12\x12\n" +
	"\x04name\x18\x02 \x01(\tR\x04name\"c\n" +
	"\vServiceInfo\x12 \n" +
	"\vdescription\x18\x01 \x01(\tR\vdescription\x12\x18\n" +
	"\aservice\x18\x02 \x01(\tR\aservice\x12\x18\n" +
	"\aversion\x18\x03 \x01(\tR\aversion\"F\n" +
	"\x0eResourceTypeIn\x12\x12\n" +
	"\x04name\x18\x01 \x01(\tR\x04name\x12 \n" +
	"\vdescription\x18\x02 \x01(\tR\vdescription\"W\n" +
	"\x0fResourceTypeOut\x12\x0e\n" +
	"\x02id\x18\x01 \x01(\tR\x02id\x12\x12\n" +
	"\x04name\x18\x02 \x01(\tR\x04name\x12 \n" +
	"\vdescription\x18\x03 \x01(\tR\vdescription\"S\n" +
	"\x10ResourceTypesOut\x12?\n" +
	"\x0eresource_types\x18\x01 \x03(\v2\x17.groups.ResourceTypeOutR\x0eresource_types\"F\n" +
	"\n" +
	"ResourceIn\x12\x12\n" +
	"\x04name\x18\x01 \x01(\tR\x04name\x12$\n" +
	"\rresource_type\x18\x02 \x01(\tR\rresource_type\"$\n" +
	"\x0eResourceUpdate\x12\x12\n" +
	"\x04name\x18\x01 \x01(\tR\x04name\"W\n" +
	"\vResourceOut\x12\x0e\n" +
	"\x02id\x18\x01 \x01(\tR\x02id\x12\x12\n" +
	"\x04name\x18\x02 \x01(\tR\x04name\x12$\n" +
	"\rresource_type\x18\x03 \x01(\tR\rresource_type\"A\n" +
	"\fResourcesOut\x121\n" +
	"\tresources\x18\x01 \x03(\v2\x13.groups.ResourceOutR\tresources\"O\n" +
	"\tSubjectIn\x12\x1e\n" +
	"\n" +
	"subject_id\x18\x01 \x01(\tR\n" +
	"subject_id\x12\"\n" +
	"\fsubject_type\x18\x02 \x01(\tR\fsubject_type\";\n" +
	"\n" +
	"SubjectsIn\x12-\n" +
	"\bsubjects\x18\x01 \x03(\v2\x11.groups.SubjectInR\bsubjects\"\x8e\x01\n" +
	"\n" +
	"SubjectOut\x12\x0e\n" +
	"\x02id\x18\x01 \x01(\tR\x02id\x12\x1e\n" +
	"\n" +
	"subject_id\x18\x02 \x01(\tR\n" +
	"subject_id\x12\"\n" +
	"\fsubject_type\x18\x03 \x01(\tR\fsubject_type\x12,\n" +
	"\x11subject_source_id\x18\x04 \x01(\tR\x11subject_source_id\"=\n" +
	"\vSubjectsOut\x12.\n" +
	"\bsubjects\x18\x01 \x03(\v2\x12.groups.SubjectOutR\bsubjects\"\xba\x01\n" +
	"\x16PermissionGrantRequest\x12+\n" +
	"\asubject\x18\x01 \x01(\v2\x11.groups.SubjectInR\asubject\x12.\n" +
	"\bresource\x18\x02 \x01(\v2\x12.groups.ResourceInR\bresource\x12C\n" +
	"\x10permission_level\x18\x03 \x01(\x0e2\x17.groups.PermissionLevelR\x10permission_level\"[\n" +
	"\x14PermissionPutRequest\x12C\n" +
	"\x10permission_level\x18\x01 \x01(\x0e2\x17.groups.PermissionLevelR\x10permission_level\"\xc0\x01\n" +
	"\n" +
	"Permission\x12\x0e\n" +
	"\x02id\x18\x01 \x01(\tR\x02id\x12,\n" +
	"\asubject\x18\x02 \x01(\v2\x12.groups.SubjectOutR\asubject\x12/\n" +
	"\bresource\x18\x03 \x01(\v2\x13.groups.ResourceOutR\bresource\x12C\n" +
	"\x10permission_level\x18\x04 \x01(\x0e2\x17.groups.PermissionLevelR\x10permission_level\"F\n" +
	"\x0ePermissionList\x124\n" +
	"\vpermissions\x18\x01 \x03(\v2\x12.groups.PermissionR\vpermissions\"\xce\x01\n" +
	"\x15AbbreviatedPermission\x12$\n" +
	"\rpermission_id\x18\x01 \x01(\tR\rpermission_id\x12$\n" +
	"\rresource_name\x18\x02 \x01(\tR\rresource_name\x12$\n" +
	"\rresource_type\x18\x03 \x01(\tR\rresource_type\x12C\n" +
	"\x10permission_level\x18\x04 \x01(\x0e2\x17.groups.PermissionLevelR\x10permission_level\"\\\n" +
	"\x19AbbreviatedPermissionList\x12?\n" +
	"\vpermissions\x18\x01 \x03(\v2\x1d.groups.AbbreviatedPermissionR\vpermissions*\"\n" +
	"\vSubjectType\x12\b\n" +
	"\x04user\x10\x00\x12\t\n" +
	"\x05group\x10\x01*:\n" +
	"\x0fPermissionLevel\x12\b\n" +
	"\x04read\x10\x00\x12\t\n" +
	"\x05admin\x10\x01\x12\t\n" +
	"\x05write\x10\x02\x12\a\n" +
	"\x03own\x10\x03BP\n" +
	"\x18org.cyverse.de.protobufsB\x0fGroupsProtobufsP\x01Z!github.com/cyverse-de/p/go/groupsb\x06proto3"

var (
	file_groups_proto_rawDescOnce sync.Once
	file_groups_proto_rawDescData []byte
)

func file_groups_proto_rawDescGZIP() []byte {
	file_groups_proto_rawDescOnce.Do(func() {
		file_groups_proto_rawDescData = protoimpl.X.CompressGZIP(unsafe.Slice(unsafe.StringData(file_groups_proto_rawDesc), len(file_groups_proto_rawDesc)))
	})
	return file_groups_proto_rawDescData
}

var file_groups_proto_enumTypes = make([]protoimpl.EnumInfo, 2)
var file_groups_proto_msgTypes = make([]protoimpl.MessageInfo, 19)
var file_groups_proto_goTypes = []any{
	(SubjectType)(0),                  // 0: groups.SubjectType
	(PermissionLevel)(0),              // 1: groups.PermissionLevel
	(*GroupInfo)(nil),                 // 2: groups.GroupInfo
	(*ServiceInfo)(nil),               // 3: groups.ServiceInfo
	(*ResourceTypeIn)(nil),            // 4: groups.ResourceTypeIn
	(*ResourceTypeOut)(nil),           // 5: groups.ResourceTypeOut
	(*ResourceTypesOut)(nil),          // 6: groups.ResourceTypesOut
	(*ResourceIn)(nil),                // 7: groups.ResourceIn
	(*ResourceUpdate)(nil),            // 8: groups.ResourceUpdate
	(*ResourceOut)(nil),               // 9: groups.ResourceOut
	(*ResourcesOut)(nil),              // 10: groups.ResourcesOut
	(*SubjectIn)(nil),                 // 11: groups.SubjectIn
	(*SubjectsIn)(nil),                // 12: groups.SubjectsIn
	(*SubjectOut)(nil),                // 13: groups.SubjectOut
	(*SubjectsOut)(nil),               // 14: groups.SubjectsOut
	(*PermissionGrantRequest)(nil),    // 15: groups.PermissionGrantRequest
	(*PermissionPutRequest)(nil),      // 16: groups.PermissionPutRequest
	(*Permission)(nil),                // 17: groups.Permission
	(*PermissionList)(nil),            // 18: groups.PermissionList
	(*AbbreviatedPermission)(nil),     // 19: groups.AbbreviatedPermission
	(*AbbreviatedPermissionList)(nil), // 20: groups.AbbreviatedPermissionList
}
var file_groups_proto_depIdxs = []int32{
	5,  // 0: groups.ResourceTypesOut.resource_types:type_name -> groups.ResourceTypeOut
	9,  // 1: groups.ResourcesOut.resources:type_name -> groups.ResourceOut
	11, // 2: groups.SubjectsIn.subjects:type_name -> groups.SubjectIn
	13, // 3: groups.SubjectsOut.subjects:type_name -> groups.SubjectOut
	11, // 4: groups.PermissionGrantRequest.subject:type_name -> groups.SubjectIn
	7,  // 5: groups.PermissionGrantRequest.resource:type_name -> groups.ResourceIn
	1,  // 6: groups.PermissionGrantRequest.permission_level:type_name -> groups.PermissionLevel
	1,  // 7: groups.PermissionPutRequest.permission_level:type_name -> groups.PermissionLevel
	13, // 8: groups.Permission.subject:type_name -> groups.SubjectOut
	9,  // 9: groups.Permission.resource:type_name -> groups.ResourceOut
	1,  // 10: groups.Permission.permission_level:type_name -> groups.PermissionLevel
	17, // 11: groups.PermissionList.permissions:type_name -> groups.Permission
	1,  // 12: groups.AbbreviatedPermission.permission_level:type_name -> groups.PermissionLevel
	19, // 13: groups.AbbreviatedPermissionList.permissions:type_name -> groups.AbbreviatedPermission
	14, // [14:14] is the sub-list for method output_type
	14, // [14:14] is the sub-list for method input_type
	14, // [14:14] is the sub-list for extension type_name
	14, // [14:14] is the sub-list for extension extendee
	0,  // [0:14] is the sub-list for field type_name
}

func init() { file_groups_proto_init() }
func file_groups_proto_init() {
	if File_groups_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: unsafe.Slice(unsafe.StringData(file_groups_proto_rawDesc), len(file_groups_proto_rawDesc)),
			NumEnums:      2,
			NumMessages:   19,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_groups_proto_goTypes,
		DependencyIndexes: file_groups_proto_depIdxs,
		EnumInfos:         file_groups_proto_enumTypes,
		MessageInfos:      file_groups_proto_msgTypes,
	}.Build()
	File_groups_proto = out.File
	file_groups_proto_goTypes = nil
	file_groups_proto_depIdxs = nil
}
