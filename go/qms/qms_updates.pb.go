// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.19.4
// source: qms_updates.proto

package qms

import (
	header "github.com/cyverse-de/p/go/header"
	svcerror "github.com/cyverse-de/p/go/svcerror"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	timestamppb "google.golang.org/protobuf/types/known/timestamppb"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type UpdateOperation struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Uuid string `protobuf:"bytes,1,opt,name=uuid,proto3" json:"uuid,omitempty"`
	Name string `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
}

func (x *UpdateOperation) Reset() {
	*x = UpdateOperation{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_updates_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateOperation) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateOperation) ProtoMessage() {}

func (x *UpdateOperation) ProtoReflect() protoreflect.Message {
	mi := &file_qms_updates_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateOperation.ProtoReflect.Descriptor instead.
func (*UpdateOperation) Descriptor() ([]byte, []int) {
	return file_qms_updates_proto_rawDescGZIP(), []int{0}
}

func (x *UpdateOperation) GetUuid() string {
	if x != nil {
		return x.Uuid
	}
	return ""
}

func (x *UpdateOperation) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

type Update struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Uuid          string                 `protobuf:"bytes,1,opt,name=uuid,proto3" json:"uuid,omitempty"`
	ValueType     string                 `protobuf:"bytes,2,opt,name=value_type,proto3" json:"value_type,omitempty"`
	Value         float64                `protobuf:"fixed64,3,opt,name=value,proto3" json:"value,omitempty"`
	EffectiveDate *timestamppb.Timestamp `protobuf:"bytes,4,opt,name=effective_date,proto3" json:"effective_date,omitempty"`
	Operation     *UpdateOperation       `protobuf:"bytes,5,opt,name=operation,proto3" json:"operation,omitempty"`
	ResourceType  *ResourceType          `protobuf:"bytes,6,opt,name=resource_type,proto3" json:"resource_type,omitempty"`
	User          *QMSUser               `protobuf:"bytes,7,opt,name=user,proto3" json:"user,omitempty"`
}

func (x *Update) Reset() {
	*x = Update{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_updates_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Update) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Update) ProtoMessage() {}

func (x *Update) ProtoReflect() protoreflect.Message {
	mi := &file_qms_updates_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Update.ProtoReflect.Descriptor instead.
func (*Update) Descriptor() ([]byte, []int) {
	return file_qms_updates_proto_rawDescGZIP(), []int{1}
}

func (x *Update) GetUuid() string {
	if x != nil {
		return x.Uuid
	}
	return ""
}

func (x *Update) GetValueType() string {
	if x != nil {
		return x.ValueType
	}
	return ""
}

func (x *Update) GetValue() float64 {
	if x != nil {
		return x.Value
	}
	return 0
}

func (x *Update) GetEffectiveDate() *timestamppb.Timestamp {
	if x != nil {
		return x.EffectiveDate
	}
	return nil
}

func (x *Update) GetOperation() *UpdateOperation {
	if x != nil {
		return x.Operation
	}
	return nil
}

func (x *Update) GetResourceType() *ResourceType {
	if x != nil {
		return x.ResourceType
	}
	return nil
}

func (x *Update) GetUser() *QMSUser {
	if x != nil {
		return x.User
	}
	return nil
}

type AddUpdateRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Header *header.Header `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	Update *Update        `protobuf:"bytes,2,opt,name=update,proto3" json:"update,omitempty"`
}

func (x *AddUpdateRequest) Reset() {
	*x = AddUpdateRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_updates_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AddUpdateRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AddUpdateRequest) ProtoMessage() {}

func (x *AddUpdateRequest) ProtoReflect() protoreflect.Message {
	mi := &file_qms_updates_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AddUpdateRequest.ProtoReflect.Descriptor instead.
func (*AddUpdateRequest) Descriptor() ([]byte, []int) {
	return file_qms_updates_proto_rawDescGZIP(), []int{2}
}

func (x *AddUpdateRequest) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *AddUpdateRequest) GetUpdate() *Update {
	if x != nil {
		return x.Update
	}
	return nil
}

type AddUpdateResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Header *header.Header         `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	Error  *svcerror.ServiceError `protobuf:"bytes,2,opt,name=error,proto3" json:"error,omitempty"`
	Update *Update                `protobuf:"bytes,3,opt,name=update,proto3" json:"update,omitempty"`
}

func (x *AddUpdateResponse) Reset() {
	*x = AddUpdateResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_updates_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AddUpdateResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AddUpdateResponse) ProtoMessage() {}

func (x *AddUpdateResponse) ProtoReflect() protoreflect.Message {
	mi := &file_qms_updates_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AddUpdateResponse.ProtoReflect.Descriptor instead.
func (*AddUpdateResponse) Descriptor() ([]byte, []int) {
	return file_qms_updates_proto_rawDescGZIP(), []int{3}
}

func (x *AddUpdateResponse) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *AddUpdateResponse) GetError() *svcerror.ServiceError {
	if x != nil {
		return x.Error
	}
	return nil
}

func (x *AddUpdateResponse) GetUpdate() *Update {
	if x != nil {
		return x.Update
	}
	return nil
}

type UpdateListRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Header *header.Header `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	User   *QMSUser       `protobuf:"bytes,2,opt,name=user,proto3" json:"user,omitempty"`
}

func (x *UpdateListRequest) Reset() {
	*x = UpdateListRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_updates_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateListRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateListRequest) ProtoMessage() {}

func (x *UpdateListRequest) ProtoReflect() protoreflect.Message {
	mi := &file_qms_updates_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateListRequest.ProtoReflect.Descriptor instead.
func (*UpdateListRequest) Descriptor() ([]byte, []int) {
	return file_qms_updates_proto_rawDescGZIP(), []int{4}
}

func (x *UpdateListRequest) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *UpdateListRequest) GetUser() *QMSUser {
	if x != nil {
		return x.User
	}
	return nil
}

type UpdateListResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Header  *header.Header         `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	Error   *svcerror.ServiceError `protobuf:"bytes,2,opt,name=error,proto3" json:"error,omitempty"`
	Updates []*Update              `protobuf:"bytes,3,rep,name=updates,proto3" json:"updates,omitempty"`
}

func (x *UpdateListResponse) Reset() {
	*x = UpdateListResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_updates_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateListResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateListResponse) ProtoMessage() {}

func (x *UpdateListResponse) ProtoReflect() protoreflect.Message {
	mi := &file_qms_updates_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateListResponse.ProtoReflect.Descriptor instead.
func (*UpdateListResponse) Descriptor() ([]byte, []int) {
	return file_qms_updates_proto_rawDescGZIP(), []int{5}
}

func (x *UpdateListResponse) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *UpdateListResponse) GetError() *svcerror.ServiceError {
	if x != nil {
		return x.Error
	}
	return nil
}

func (x *UpdateListResponse) GetUpdates() []*Update {
	if x != nil {
		return x.Updates
	}
	return nil
}

var File_qms_updates_proto protoreflect.FileDescriptor

var file_qms_updates_proto_rawDesc = []byte{
	0x0a, 0x11, 0x71, 0x6d, 0x73, 0x5f, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x73, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x62, 0x75, 0x66, 0x2f, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0c, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x1a, 0x0e, 0x73, 0x76, 0x63, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x1a, 0x18, 0x71, 0x6d, 0x73, 0x5f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x5f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0f, 0x71, 0x6d,
	0x73, 0x5f, 0x75, 0x73, 0x65, 0x72, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x39, 0x0a,
	0x0f, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x12, 0x12, 0x0a, 0x04, 0x75, 0x75, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04,
	0x75, 0x75, 0x69, 0x64, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x22, 0x99, 0x02, 0x0a, 0x06, 0x55, 0x70, 0x64,
	0x61, 0x74, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x75, 0x75, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x04, 0x75, 0x75, 0x69, 0x64, 0x12, 0x1e, 0x0a, 0x0a, 0x76, 0x61, 0x6c, 0x75, 0x65,
	0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x76, 0x61, 0x6c,
	0x75, 0x65, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65,
	0x18, 0x03, 0x20, 0x01, 0x28, 0x01, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x12, 0x42, 0x0a,
	0x0e, 0x65, 0x66, 0x66, 0x65, 0x63, 0x74, 0x69, 0x76, 0x65, 0x5f, 0x64, 0x61, 0x74, 0x65, 0x18,
	0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d,
	0x70, 0x52, 0x0e, 0x65, 0x66, 0x66, 0x65, 0x63, 0x74, 0x69, 0x76, 0x65, 0x5f, 0x64, 0x61, 0x74,
	0x65, 0x12, 0x2e, 0x0a, 0x09, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x05,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x4f, 0x70, 0x65,
	0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x09, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x12, 0x33, 0x0a, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x74, 0x79,
	0x70, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0d, 0x2e, 0x52, 0x65, 0x73, 0x6f, 0x75,
	0x72, 0x63, 0x65, 0x54, 0x79, 0x70, 0x65, 0x52, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x12, 0x1c, 0x0a, 0x04, 0x75, 0x73, 0x65, 0x72, 0x18, 0x07,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x08, 0x2e, 0x51, 0x4d, 0x53, 0x55, 0x73, 0x65, 0x72, 0x52, 0x04,
	0x75, 0x73, 0x65, 0x72, 0x22, 0x54, 0x0a, 0x10, 0x41, 0x64, 0x64, 0x55, 0x70, 0x64, 0x61, 0x74,
	0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x1f, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64,
	0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x07, 0x2e, 0x48, 0x65, 0x61, 0x64, 0x65,
	0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x1f, 0x0a, 0x06, 0x75, 0x70, 0x64,
	0x61, 0x74, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x07, 0x2e, 0x55, 0x70, 0x64, 0x61,
	0x74, 0x65, 0x52, 0x06, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x22, 0x7a, 0x0a, 0x11, 0x41, 0x64,
	0x64, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12,
	0x1f, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x07, 0x2e, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72,
	0x12, 0x23, 0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x0d, 0x2e, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x52, 0x05,
	0x65, 0x72, 0x72, 0x6f, 0x72, 0x12, 0x1f, 0x0a, 0x06, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x07, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x52, 0x06,
	0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x22, 0x52, 0x0a, 0x11, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65,
	0x4c, 0x69, 0x73, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x1f, 0x0a, 0x06, 0x68,
	0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x07, 0x2e, 0x48, 0x65,
	0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x1c, 0x0a, 0x04,
	0x75, 0x73, 0x65, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x08, 0x2e, 0x51, 0x4d, 0x53,
	0x55, 0x73, 0x65, 0x72, 0x52, 0x04, 0x75, 0x73, 0x65, 0x72, 0x22, 0x7d, 0x0a, 0x12, 0x55, 0x70,
	0x64, 0x61, 0x74, 0x65, 0x4c, 0x69, 0x73, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x12, 0x1f, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x07, 0x2e, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65,
	0x72, 0x12, 0x23, 0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x0d, 0x2e, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x52,
	0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x12, 0x21, 0x0a, 0x07, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65,
	0x73, 0x18, 0x03, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x07, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65,
	0x52, 0x07, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x73, 0x42, 0x50, 0x0a, 0x18, 0x6f, 0x72, 0x67,
	0x2e, 0x63, 0x79, 0x76, 0x65, 0x72, 0x73, 0x65, 0x2e, 0x64, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x62, 0x75, 0x66, 0x73, 0x42, 0x12, 0x51, 0x4d, 0x53, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x73, 0x50, 0x01, 0x5a, 0x1e, 0x67, 0x69, 0x74,
	0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x63, 0x79, 0x76, 0x65, 0x72, 0x73, 0x65, 0x2d,
	0x64, 0x65, 0x2f, 0x70, 0x2f, 0x67, 0x6f, 0x2f, 0x71, 0x6d, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x33,
}

var (
	file_qms_updates_proto_rawDescOnce sync.Once
	file_qms_updates_proto_rawDescData = file_qms_updates_proto_rawDesc
)

func file_qms_updates_proto_rawDescGZIP() []byte {
	file_qms_updates_proto_rawDescOnce.Do(func() {
		file_qms_updates_proto_rawDescData = protoimpl.X.CompressGZIP(file_qms_updates_proto_rawDescData)
	})
	return file_qms_updates_proto_rawDescData
}

var file_qms_updates_proto_msgTypes = make([]protoimpl.MessageInfo, 6)
var file_qms_updates_proto_goTypes = []interface{}{
	(*UpdateOperation)(nil),       // 0: UpdateOperation
	(*Update)(nil),                // 1: Update
	(*AddUpdateRequest)(nil),      // 2: AddUpdateRequest
	(*AddUpdateResponse)(nil),     // 3: AddUpdateResponse
	(*UpdateListRequest)(nil),     // 4: UpdateListRequest
	(*UpdateListResponse)(nil),    // 5: UpdateListResponse
	(*timestamppb.Timestamp)(nil), // 6: google.protobuf.Timestamp
	(*ResourceType)(nil),          // 7: ResourceType
	(*QMSUser)(nil),               // 8: QMSUser
	(*header.Header)(nil),         // 9: Header
	(*svcerror.ServiceError)(nil), // 10: ServiceError
}
var file_qms_updates_proto_depIdxs = []int32{
	6,  // 0: Update.effective_date:type_name -> google.protobuf.Timestamp
	0,  // 1: Update.operation:type_name -> UpdateOperation
	7,  // 2: Update.resource_type:type_name -> ResourceType
	8,  // 3: Update.user:type_name -> QMSUser
	9,  // 4: AddUpdateRequest.header:type_name -> Header
	1,  // 5: AddUpdateRequest.update:type_name -> Update
	9,  // 6: AddUpdateResponse.header:type_name -> Header
	10, // 7: AddUpdateResponse.error:type_name -> ServiceError
	1,  // 8: AddUpdateResponse.update:type_name -> Update
	9,  // 9: UpdateListRequest.header:type_name -> Header
	8,  // 10: UpdateListRequest.user:type_name -> QMSUser
	9,  // 11: UpdateListResponse.header:type_name -> Header
	10, // 12: UpdateListResponse.error:type_name -> ServiceError
	1,  // 13: UpdateListResponse.updates:type_name -> Update
	14, // [14:14] is the sub-list for method output_type
	14, // [14:14] is the sub-list for method input_type
	14, // [14:14] is the sub-list for extension type_name
	14, // [14:14] is the sub-list for extension extendee
	0,  // [0:14] is the sub-list for field type_name
}

func init() { file_qms_updates_proto_init() }
func file_qms_updates_proto_init() {
	if File_qms_updates_proto != nil {
		return
	}
	file_qms_resource_types_proto_init()
	file_qms_users_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_qms_updates_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateOperation); i {
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
		file_qms_updates_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Update); i {
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
		file_qms_updates_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AddUpdateRequest); i {
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
		file_qms_updates_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AddUpdateResponse); i {
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
		file_qms_updates_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateListRequest); i {
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
		file_qms_updates_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateListResponse); i {
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
			RawDescriptor: file_qms_updates_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   6,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_qms_updates_proto_goTypes,
		DependencyIndexes: file_qms_updates_proto_depIdxs,
		MessageInfos:      file_qms_updates_proto_msgTypes,
	}.Build()
	File_qms_updates_proto = out.File
	file_qms_updates_proto_rawDesc = nil
	file_qms_updates_proto_goTypes = nil
	file_qms_updates_proto_depIdxs = nil
}
