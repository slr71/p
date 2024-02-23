// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.32.0
// 	protoc        v4.25.3
// source: qms_requests.proto

package qms

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

// *
// A request for all of a user's current resource type overages.
type AllUserOveragesRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Contains telemetry data.
	Header *header.Header `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	// The user's username in the QMS system.
	Username string `protobuf:"bytes,2,opt,name=username,proto3" json:"username,omitempty"`
}

func (x *AllUserOveragesRequest) Reset() {
	*x = AllUserOveragesRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_requests_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AllUserOveragesRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AllUserOveragesRequest) ProtoMessage() {}

func (x *AllUserOveragesRequest) ProtoReflect() protoreflect.Message {
	mi := &file_qms_requests_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AllUserOveragesRequest.ProtoReflect.Descriptor instead.
func (*AllUserOveragesRequest) Descriptor() ([]byte, []int) {
	return file_qms_requests_proto_rawDescGZIP(), []int{0}
}

func (x *AllUserOveragesRequest) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *AllUserOveragesRequest) GetUsername() string {
	if x != nil {
		return x.Username
	}
	return ""
}

// *
// A request for a user's overages specific to a particular resource type.
type UserResourceOveragesRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Contains telemetry data.
	Header *header.Header `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	// A user's username.
	Username string `protobuf:"bytes,2,opt,name=username,proto3" json:"username,omitempty"`
	// The name of the resource type to look up overages for.
	ResourceName string `protobuf:"bytes,3,opt,name=resource_name,proto3" json:"resource_name,omitempty"`
}

func (x *UserResourceOveragesRequest) Reset() {
	*x = UserResourceOveragesRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_requests_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UserResourceOveragesRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UserResourceOveragesRequest) ProtoMessage() {}

func (x *UserResourceOveragesRequest) ProtoReflect() protoreflect.Message {
	mi := &file_qms_requests_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UserResourceOveragesRequest.ProtoReflect.Descriptor instead.
func (*UserResourceOveragesRequest) Descriptor() ([]byte, []int) {
	return file_qms_requests_proto_rawDescGZIP(), []int{1}
}

func (x *UserResourceOveragesRequest) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *UserResourceOveragesRequest) GetUsername() string {
	if x != nil {
		return x.Username
	}
	return ""
}

func (x *UserResourceOveragesRequest) GetResourceName() string {
	if x != nil {
		return x.ResourceName
	}
	return ""
}

// *
// A request to check if a user is in overage for a particular resource.
type IsOverageRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Contains telemetry information
	Header *header.Header `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	// A username.
	Username string `protobuf:"bytes,2,opt,name=username,proto3" json:"username,omitempty"`
	// The name of the resource type to check for usage overages by the user.
	ResourceName string `protobuf:"bytes,3,opt,name=resource_name,proto3" json:"resource_name,omitempty"`
}

func (x *IsOverageRequest) Reset() {
	*x = IsOverageRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_requests_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *IsOverageRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*IsOverageRequest) ProtoMessage() {}

func (x *IsOverageRequest) ProtoReflect() protoreflect.Message {
	mi := &file_qms_requests_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use IsOverageRequest.ProtoReflect.Descriptor instead.
func (*IsOverageRequest) Descriptor() ([]byte, []int) {
	return file_qms_requests_proto_rawDescGZIP(), []int{2}
}

func (x *IsOverageRequest) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *IsOverageRequest) GetUsername() string {
	if x != nil {
		return x.Username
	}
	return ""
}

func (x *IsOverageRequest) GetResourceName() string {
	if x != nil {
		return x.ResourceName
	}
	return ""
}

// *
// A request to add a usage to the system for a resource type consumed by the
// specified user.
type AddUsage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Contains telemetry information
	Header       *header.Header `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	Username     string         `protobuf:"bytes,2,opt,name=username,proto3" json:"username,omitempty"`
	ResourceName string         `protobuf:"bytes,3,opt,name=resource_name,proto3" json:"resource_name,omitempty"`
	// Possible values are defined in the database, so we can't use an enum here
	UpdateType   string  `protobuf:"bytes,4,opt,name=update_type,proto3" json:"update_type,omitempty"`
	UsageValue   float64 `protobuf:"fixed64,5,opt,name=usage_value,proto3" json:"usage_value,omitempty"`
	ResourceUnit string  `protobuf:"bytes,6,opt,name=resource_unit,proto3" json:"resource_unit,omitempty"`
}

func (x *AddUsage) Reset() {
	*x = AddUsage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_requests_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AddUsage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AddUsage) ProtoMessage() {}

func (x *AddUsage) ProtoReflect() protoreflect.Message {
	mi := &file_qms_requests_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AddUsage.ProtoReflect.Descriptor instead.
func (*AddUsage) Descriptor() ([]byte, []int) {
	return file_qms_requests_proto_rawDescGZIP(), []int{3}
}

func (x *AddUsage) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *AddUsage) GetUsername() string {
	if x != nil {
		return x.Username
	}
	return ""
}

func (x *AddUsage) GetResourceName() string {
	if x != nil {
		return x.ResourceName
	}
	return ""
}

func (x *AddUsage) GetUpdateType() string {
	if x != nil {
		return x.UpdateType
	}
	return ""
}

func (x *AddUsage) GetUsageValue() float64 {
	if x != nil {
		return x.UsageValue
	}
	return 0
}

func (x *AddUsage) GetResourceUnit() string {
	if x != nil {
		return x.ResourceUnit
	}
	return ""
}

type GetUsages struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Contains telemetry information
	Header   *header.Header `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	Username string         `protobuf:"bytes,2,opt,name=username,proto3" json:"username,omitempty"`
}

func (x *GetUsages) Reset() {
	*x = GetUsages{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_requests_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetUsages) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetUsages) ProtoMessage() {}

func (x *GetUsages) ProtoReflect() protoreflect.Message {
	mi := &file_qms_requests_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetUsages.ProtoReflect.Descriptor instead.
func (*GetUsages) Descriptor() ([]byte, []int) {
	return file_qms_requests_proto_rawDescGZIP(), []int{4}
}

func (x *GetUsages) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *GetUsages) GetUsername() string {
	if x != nil {
		return x.Username
	}
	return ""
}

type RequestByUsername struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Contains telemetry information
	Header   *header.Header `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	Username string         `protobuf:"bytes,2,opt,name=username,proto3" json:"username,omitempty"`
}

func (x *RequestByUsername) Reset() {
	*x = RequestByUsername{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_requests_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *RequestByUsername) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*RequestByUsername) ProtoMessage() {}

func (x *RequestByUsername) ProtoReflect() protoreflect.Message {
	mi := &file_qms_requests_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use RequestByUsername.ProtoReflect.Descriptor instead.
func (*RequestByUsername) Descriptor() ([]byte, []int) {
	return file_qms_requests_proto_rawDescGZIP(), []int{5}
}

func (x *RequestByUsername) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *RequestByUsername) GetUsername() string {
	if x != nil {
		return x.Username
	}
	return ""
}

type RequestByUserID struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Contains telemetry information
	Header *header.Header `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	UserId string         `protobuf:"bytes,2,opt,name=user_id,proto3" json:"user_id,omitempty"`
}

func (x *RequestByUserID) Reset() {
	*x = RequestByUserID{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_requests_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *RequestByUserID) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*RequestByUserID) ProtoMessage() {}

func (x *RequestByUserID) ProtoReflect() protoreflect.Message {
	mi := &file_qms_requests_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use RequestByUserID.ProtoReflect.Descriptor instead.
func (*RequestByUserID) Descriptor() ([]byte, []int) {
	return file_qms_requests_proto_rawDescGZIP(), []int{6}
}

func (x *RequestByUserID) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *RequestByUserID) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

type NoParamsRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Contains telemetry information
	Header *header.Header `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
}

func (x *NoParamsRequest) Reset() {
	*x = NoParamsRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_requests_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *NoParamsRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*NoParamsRequest) ProtoMessage() {}

func (x *NoParamsRequest) ProtoReflect() protoreflect.Message {
	mi := &file_qms_requests_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use NoParamsRequest.ProtoReflect.Descriptor instead.
func (*NoParamsRequest) Descriptor() ([]byte, []int) {
	return file_qms_requests_proto_rawDescGZIP(), []int{7}
}

func (x *NoParamsRequest) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

var File_qms_requests_proto protoreflect.FileDescriptor

var file_qms_requests_proto_rawDesc = []byte{
	0x0a, 0x12, 0x71, 0x6d, 0x73, 0x5f, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x73, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x03, 0x71, 0x6d, 0x73, 0x1a, 0x0c, 0x68, 0x65, 0x61, 0x64, 0x65,
	0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x5c, 0x0a, 0x16, 0x41, 0x6c, 0x6c, 0x55, 0x73,
	0x65, 0x72, 0x4f, 0x76, 0x65, 0x72, 0x61, 0x67, 0x65, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x12, 0x26, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x0e, 0x2e, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x2e, 0x48, 0x65, 0x61, 0x64, 0x65,
	0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x1a, 0x0a, 0x08, 0x75, 0x73, 0x65,
	0x72, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x75, 0x73, 0x65,
	0x72, 0x6e, 0x61, 0x6d, 0x65, 0x22, 0x87, 0x01, 0x0a, 0x1b, 0x55, 0x73, 0x65, 0x72, 0x52, 0x65,
	0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x4f, 0x76, 0x65, 0x72, 0x61, 0x67, 0x65, 0x73, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x26, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x2e, 0x48,
	0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x1a, 0x0a,
	0x08, 0x75, 0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x08, 0x75, 0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x24, 0x0a, 0x0d, 0x72, 0x65, 0x73,
	0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x22,
	0x7c, 0x0a, 0x10, 0x49, 0x73, 0x4f, 0x76, 0x65, 0x72, 0x61, 0x67, 0x65, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x12, 0x26, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x2e, 0x48, 0x65, 0x61,
	0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x1a, 0x0a, 0x08, 0x75,
	0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x75,
	0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x24, 0x0a, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75,
	0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0d,
	0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x22, 0xde, 0x01,
	0x0a, 0x08, 0x41, 0x64, 0x64, 0x55, 0x73, 0x61, 0x67, 0x65, 0x12, 0x26, 0x0a, 0x06, 0x68, 0x65,
	0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x68, 0x65, 0x61,
	0x64, 0x65, 0x72, 0x2e, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64,
	0x65, 0x72, 0x12, 0x1a, 0x0a, 0x08, 0x75, 0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x75, 0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x24,
	0x0a, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f,
	0x6e, 0x61, 0x6d, 0x65, 0x12, 0x20, 0x0a, 0x0b, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x5f, 0x74,
	0x79, 0x70, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x75, 0x70, 0x64, 0x61, 0x74,
	0x65, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x12, 0x20, 0x0a, 0x0b, 0x75, 0x73, 0x61, 0x67, 0x65, 0x5f,
	0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x01, 0x52, 0x0b, 0x75, 0x73, 0x61,
	0x67, 0x65, 0x5f, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x12, 0x24, 0x0a, 0x0d, 0x72, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x5f, 0x75, 0x6e, 0x69, 0x74, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x75, 0x6e, 0x69, 0x74, 0x22, 0x4f,
	0x0a, 0x09, 0x47, 0x65, 0x74, 0x55, 0x73, 0x61, 0x67, 0x65, 0x73, 0x12, 0x26, 0x0a, 0x06, 0x68,
	0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x68, 0x65,
	0x61, 0x64, 0x65, 0x72, 0x2e, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61,
	0x64, 0x65, 0x72, 0x12, 0x1a, 0x0a, 0x08, 0x75, 0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x75, 0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x22,
	0x57, 0x0a, 0x11, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x42, 0x79, 0x55, 0x73, 0x65, 0x72,
	0x6e, 0x61, 0x6d, 0x65, 0x12, 0x26, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x2e, 0x48, 0x65,
	0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x1a, 0x0a, 0x08,
	0x75, 0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08,
	0x75, 0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x22, 0x53, 0x0a, 0x0f, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x42, 0x79, 0x55, 0x73, 0x65, 0x72, 0x49, 0x44, 0x12, 0x26, 0x0a, 0x06, 0x68,
	0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x68, 0x65,
	0x61, 0x64, 0x65, 0x72, 0x2e, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61,
	0x64, 0x65, 0x72, 0x12, 0x18, 0x0a, 0x07, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x22, 0x39, 0x0a,
	0x0f, 0x4e, 0x6f, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x12, 0x26, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x0e, 0x2e, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x2e, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72,
	0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x42, 0x51, 0x0a, 0x18, 0x6f, 0x72, 0x67, 0x2e,
	0x63, 0x79, 0x76, 0x65, 0x72, 0x73, 0x65, 0x2e, 0x64, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x62, 0x75, 0x66, 0x73, 0x42, 0x13, 0x51, 0x4d, 0x53, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x73, 0x50, 0x01, 0x5a, 0x1e, 0x67, 0x69, 0x74,
	0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x63, 0x79, 0x76, 0x65, 0x72, 0x73, 0x65, 0x2d,
	0x64, 0x65, 0x2f, 0x70, 0x2f, 0x67, 0x6f, 0x2f, 0x71, 0x6d, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x33,
}

var (
	file_qms_requests_proto_rawDescOnce sync.Once
	file_qms_requests_proto_rawDescData = file_qms_requests_proto_rawDesc
)

func file_qms_requests_proto_rawDescGZIP() []byte {
	file_qms_requests_proto_rawDescOnce.Do(func() {
		file_qms_requests_proto_rawDescData = protoimpl.X.CompressGZIP(file_qms_requests_proto_rawDescData)
	})
	return file_qms_requests_proto_rawDescData
}

var file_qms_requests_proto_msgTypes = make([]protoimpl.MessageInfo, 8)
var file_qms_requests_proto_goTypes = []interface{}{
	(*AllUserOveragesRequest)(nil),      // 0: qms.AllUserOveragesRequest
	(*UserResourceOveragesRequest)(nil), // 1: qms.UserResourceOveragesRequest
	(*IsOverageRequest)(nil),            // 2: qms.IsOverageRequest
	(*AddUsage)(nil),                    // 3: qms.AddUsage
	(*GetUsages)(nil),                   // 4: qms.GetUsages
	(*RequestByUsername)(nil),           // 5: qms.RequestByUsername
	(*RequestByUserID)(nil),             // 6: qms.RequestByUserID
	(*NoParamsRequest)(nil),             // 7: qms.NoParamsRequest
	(*header.Header)(nil),               // 8: header.Header
}
var file_qms_requests_proto_depIdxs = []int32{
	8, // 0: qms.AllUserOveragesRequest.header:type_name -> header.Header
	8, // 1: qms.UserResourceOveragesRequest.header:type_name -> header.Header
	8, // 2: qms.IsOverageRequest.header:type_name -> header.Header
	8, // 3: qms.AddUsage.header:type_name -> header.Header
	8, // 4: qms.GetUsages.header:type_name -> header.Header
	8, // 5: qms.RequestByUsername.header:type_name -> header.Header
	8, // 6: qms.RequestByUserID.header:type_name -> header.Header
	8, // 7: qms.NoParamsRequest.header:type_name -> header.Header
	8, // [8:8] is the sub-list for method output_type
	8, // [8:8] is the sub-list for method input_type
	8, // [8:8] is the sub-list for extension type_name
	8, // [8:8] is the sub-list for extension extendee
	0, // [0:8] is the sub-list for field type_name
}

func init() { file_qms_requests_proto_init() }
func file_qms_requests_proto_init() {
	if File_qms_requests_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_qms_requests_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AllUserOveragesRequest); i {
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
		file_qms_requests_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UserResourceOveragesRequest); i {
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
		file_qms_requests_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*IsOverageRequest); i {
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
		file_qms_requests_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AddUsage); i {
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
		file_qms_requests_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetUsages); i {
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
		file_qms_requests_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*RequestByUsername); i {
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
		file_qms_requests_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*RequestByUserID); i {
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
		file_qms_requests_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*NoParamsRequest); i {
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
			RawDescriptor: file_qms_requests_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   8,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_qms_requests_proto_goTypes,
		DependencyIndexes: file_qms_requests_proto_depIdxs,
		MessageInfos:      file_qms_requests_proto_msgTypes,
	}.Build()
	File_qms_requests_proto = out.File
	file_qms_requests_proto_rawDesc = nil
	file_qms_requests_proto_goTypes = nil
	file_qms_requests_proto_depIdxs = nil
}
