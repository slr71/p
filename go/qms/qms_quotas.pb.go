// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.35.1
// 	protoc        v5.29.3
// source: qms_quotas.proto

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

// *
// Represents a quota in the system, which is the currently configured limit on
// a resource type a user has associated with their plan. Overrides the quota
// default associated with the plan the user has.
type Quota struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The unique identifier.
	Uuid string `protobuf:"bytes,1,opt,name=uuid,proto3" json:"uuid,omitempty"`
	// The quota value (aka limit).
	Quota float64 `protobuf:"fixed64,2,opt,name=quota,proto3" json:"quota,omitempty"`
	// The resource type the quota value applies to.
	ResourceType *ResourceType `protobuf:"bytes,3,opt,name=resource_type,proto3" json:"resource_type,omitempty"`
	// A freeform text field containing info about who created the quota.
	CreatedBy string `protobuf:"bytes,4,opt,name=CreatedBy,json=created_by,proto3" json:"CreatedBy,omitempty"`
	// When the quota was created.
	CreatedAt *timestamppb.Timestamp `protobuf:"bytes,5,opt,name=CreatedAt,json=created_at,proto3" json:"CreatedAt,omitempty"`
	// A freeform text field containing info about who last modified the quota.
	LastModifiedBy string `protobuf:"bytes,6,opt,name=LastModifiedBy,json=last_modified_by,proto3" json:"LastModifiedBy,omitempty"`
	// When the quota was last modified.
	LastModifiedAt *timestamppb.Timestamp `protobuf:"bytes,7,opt,name=LastModifiedAt,json=last_modified_at,proto3" json:"LastModifiedAt,omitempty"`
	// The unique identifier of the subscription that the quota is associated with.
	SubscriptionId string `protobuf:"bytes,8,opt,name=subscription_id,proto3" json:"subscription_id,omitempty"`
}

func (x *Quota) Reset() {
	*x = Quota{}
	mi := &file_qms_quotas_proto_msgTypes[0]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *Quota) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Quota) ProtoMessage() {}

func (x *Quota) ProtoReflect() protoreflect.Message {
	mi := &file_qms_quotas_proto_msgTypes[0]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Quota.ProtoReflect.Descriptor instead.
func (*Quota) Descriptor() ([]byte, []int) {
	return file_qms_quotas_proto_rawDescGZIP(), []int{0}
}

func (x *Quota) GetUuid() string {
	if x != nil {
		return x.Uuid
	}
	return ""
}

func (x *Quota) GetQuota() float64 {
	if x != nil {
		return x.Quota
	}
	return 0
}

func (x *Quota) GetResourceType() *ResourceType {
	if x != nil {
		return x.ResourceType
	}
	return nil
}

func (x *Quota) GetCreatedBy() string {
	if x != nil {
		return x.CreatedBy
	}
	return ""
}

func (x *Quota) GetCreatedAt() *timestamppb.Timestamp {
	if x != nil {
		return x.CreatedAt
	}
	return nil
}

func (x *Quota) GetLastModifiedBy() string {
	if x != nil {
		return x.LastModifiedBy
	}
	return ""
}

func (x *Quota) GetLastModifiedAt() *timestamppb.Timestamp {
	if x != nil {
		return x.LastModifiedAt
	}
	return nil
}

func (x *Quota) GetSubscriptionId() string {
	if x != nil {
		return x.SubscriptionId
	}
	return ""
}

// *
// A response to a quota request. Contains a single quota object.
type QuotaResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Contains telemetry data.
	Header *header.Header `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	// Error information generated by the request handler.
	Error *svcerror.ServiceError `protobuf:"bytes,2,opt,name=error,proto3" json:"error,omitempty"`
	// The quota returned by the request handler.
	Quota *Quota `protobuf:"bytes,3,opt,name=quota,proto3" json:"quota,omitempty"`
}

func (x *QuotaResponse) Reset() {
	*x = QuotaResponse{}
	mi := &file_qms_quotas_proto_msgTypes[1]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *QuotaResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*QuotaResponse) ProtoMessage() {}

func (x *QuotaResponse) ProtoReflect() protoreflect.Message {
	mi := &file_qms_quotas_proto_msgTypes[1]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use QuotaResponse.ProtoReflect.Descriptor instead.
func (*QuotaResponse) Descriptor() ([]byte, []int) {
	return file_qms_quotas_proto_rawDescGZIP(), []int{1}
}

func (x *QuotaResponse) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *QuotaResponse) GetError() *svcerror.ServiceError {
	if x != nil {
		return x.Error
	}
	return nil
}

func (x *QuotaResponse) GetQuota() *Quota {
	if x != nil {
		return x.Quota
	}
	return nil
}

// *
// A response to a quota request containing a list of quotas.
type QuotaList struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Contains telemetry data.
	Header *header.Header `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	// Error information generated by the request handler.
	Error *svcerror.ServiceError `protobuf:"bytes,2,opt,name=error,proto3" json:"error,omitempty"`
	// A list of quotas returned by the request handler.
	Quotas []*Quota `protobuf:"bytes,3,rep,name=quotas,proto3" json:"quotas,omitempty"`
}

func (x *QuotaList) Reset() {
	*x = QuotaList{}
	mi := &file_qms_quotas_proto_msgTypes[2]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *QuotaList) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*QuotaList) ProtoMessage() {}

func (x *QuotaList) ProtoReflect() protoreflect.Message {
	mi := &file_qms_quotas_proto_msgTypes[2]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use QuotaList.ProtoReflect.Descriptor instead.
func (*QuotaList) Descriptor() ([]byte, []int) {
	return file_qms_quotas_proto_rawDescGZIP(), []int{2}
}

func (x *QuotaList) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *QuotaList) GetError() *svcerror.ServiceError {
	if x != nil {
		return x.Error
	}
	return nil
}

func (x *QuotaList) GetQuotas() []*Quota {
	if x != nil {
		return x.Quotas
	}
	return nil
}

// *
// A request to add a quota to a subscription.
type AddQuotaRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Contains telemetry data.
	Header *header.Header `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	// The quota to be added to the system.
	Quota *Quota `protobuf:"bytes,2,opt,name=quota,proto3" json:"quota,omitempty"`
}

func (x *AddQuotaRequest) Reset() {
	*x = AddQuotaRequest{}
	mi := &file_qms_quotas_proto_msgTypes[3]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *AddQuotaRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AddQuotaRequest) ProtoMessage() {}

func (x *AddQuotaRequest) ProtoReflect() protoreflect.Message {
	mi := &file_qms_quotas_proto_msgTypes[3]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AddQuotaRequest.ProtoReflect.Descriptor instead.
func (*AddQuotaRequest) Descriptor() ([]byte, []int) {
	return file_qms_quotas_proto_rawDescGZIP(), []int{3}
}

func (x *AddQuotaRequest) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *AddQuotaRequest) GetQuota() *Quota {
	if x != nil {
		return x.Quota
	}
	return nil
}

var File_qms_quotas_proto protoreflect.FileDescriptor

var file_qms_quotas_proto_rawDesc = []byte{
	0x0a, 0x10, 0x71, 0x6d, 0x73, 0x5f, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x73, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x03, 0x71, 0x6d, 0x73, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61,
	0x6d, 0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0c, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0e, 0x73, 0x76, 0x63, 0x65, 0x72, 0x72, 0x6f, 0x72,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x18, 0x71, 0x6d, 0x73, 0x5f, 0x72, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x22, 0xde, 0x02, 0x0a, 0x05, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x12, 0x12, 0x0a, 0x04, 0x75, 0x75,
	0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x75, 0x75, 0x69, 0x64, 0x12, 0x14,
	0x0a, 0x05, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x18, 0x02, 0x20, 0x01, 0x28, 0x01, 0x52, 0x05, 0x71,
	0x75, 0x6f, 0x74, 0x61, 0x12, 0x37, 0x0a, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x71, 0x6d,
	0x73, 0x2e, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x54, 0x79, 0x70, 0x65, 0x52, 0x0d,
	0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x12, 0x1d, 0x0a,
	0x09, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x42, 0x79, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x0a, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x5f, 0x62, 0x79, 0x12, 0x39, 0x0a, 0x09,
	0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x41, 0x74, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75,
	0x66, 0x2e, 0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x52, 0x0a, 0x63, 0x72, 0x65,
	0x61, 0x74, 0x65, 0x64, 0x5f, 0x61, 0x74, 0x12, 0x28, 0x0a, 0x0e, 0x4c, 0x61, 0x73, 0x74, 0x4d,
	0x6f, 0x64, 0x69, 0x66, 0x69, 0x65, 0x64, 0x42, 0x79, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x10, 0x6c, 0x61, 0x73, 0x74, 0x5f, 0x6d, 0x6f, 0x64, 0x69, 0x66, 0x69, 0x65, 0x64, 0x5f, 0x62,
	0x79, 0x12, 0x44, 0x0a, 0x0e, 0x4c, 0x61, 0x73, 0x74, 0x4d, 0x6f, 0x64, 0x69, 0x66, 0x69, 0x65,
	0x64, 0x41, 0x74, 0x18, 0x07, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x54, 0x69, 0x6d, 0x65,
	0x73, 0x74, 0x61, 0x6d, 0x70, 0x52, 0x10, 0x6c, 0x61, 0x73, 0x74, 0x5f, 0x6d, 0x6f, 0x64, 0x69,
	0x66, 0x69, 0x65, 0x64, 0x5f, 0x61, 0x74, 0x12, 0x28, 0x0a, 0x0f, 0x73, 0x75, 0x62, 0x73, 0x63,
	0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x69, 0x64, 0x18, 0x08, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x0f, 0x73, 0x75, 0x62, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x69,
	0x64, 0x22, 0x87, 0x01, 0x0a, 0x0d, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x12, 0x26, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x2e, 0x48, 0x65, 0x61,
	0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x2c, 0x0a, 0x05, 0x65,
	0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x16, 0x2e, 0x73, 0x76, 0x63,
	0x65, 0x72, 0x72, 0x6f, 0x72, 0x2e, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x45, 0x72, 0x72,
	0x6f, 0x72, 0x52, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x12, 0x20, 0x0a, 0x05, 0x71, 0x75, 0x6f,
	0x74, 0x61, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0a, 0x2e, 0x71, 0x6d, 0x73, 0x2e, 0x51,
	0x75, 0x6f, 0x74, 0x61, 0x52, 0x05, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x22, 0x85, 0x01, 0x0a, 0x09,
	0x51, 0x75, 0x6f, 0x74, 0x61, 0x4c, 0x69, 0x73, 0x74, 0x12, 0x26, 0x0a, 0x06, 0x68, 0x65, 0x61,
	0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x68, 0x65, 0x61, 0x64,
	0x65, 0x72, 0x2e, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65,
	0x72, 0x12, 0x2c, 0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x16, 0x2e, 0x73, 0x76, 0x63, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x2e, 0x53, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x52, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x12,
	0x22, 0x0a, 0x06, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x73, 0x18, 0x03, 0x20, 0x03, 0x28, 0x0b, 0x32,
	0x0a, 0x2e, 0x71, 0x6d, 0x73, 0x2e, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x52, 0x06, 0x71, 0x75, 0x6f,
	0x74, 0x61, 0x73, 0x22, 0x5b, 0x0a, 0x0f, 0x41, 0x64, 0x64, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x26, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x2e,
	0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x20,
	0x0a, 0x05, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0a, 0x2e,
	0x71, 0x6d, 0x73, 0x2e, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x52, 0x05, 0x71, 0x75, 0x6f, 0x74, 0x61,
	0x42, 0x4f, 0x0a, 0x18, 0x6f, 0x72, 0x67, 0x2e, 0x63, 0x79, 0x76, 0x65, 0x72, 0x73, 0x65, 0x2e,
	0x64, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x73, 0x42, 0x11, 0x51, 0x4d,
	0x53, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x73, 0x50,
	0x01, 0x5a, 0x1e, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x63, 0x79,
	0x76, 0x65, 0x72, 0x73, 0x65, 0x2d, 0x64, 0x65, 0x2f, 0x70, 0x2f, 0x67, 0x6f, 0x2f, 0x71, 0x6d,
	0x73, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_qms_quotas_proto_rawDescOnce sync.Once
	file_qms_quotas_proto_rawDescData = file_qms_quotas_proto_rawDesc
)

func file_qms_quotas_proto_rawDescGZIP() []byte {
	file_qms_quotas_proto_rawDescOnce.Do(func() {
		file_qms_quotas_proto_rawDescData = protoimpl.X.CompressGZIP(file_qms_quotas_proto_rawDescData)
	})
	return file_qms_quotas_proto_rawDescData
}

var file_qms_quotas_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_qms_quotas_proto_goTypes = []any{
	(*Quota)(nil),                 // 0: qms.Quota
	(*QuotaResponse)(nil),         // 1: qms.QuotaResponse
	(*QuotaList)(nil),             // 2: qms.QuotaList
	(*AddQuotaRequest)(nil),       // 3: qms.AddQuotaRequest
	(*ResourceType)(nil),          // 4: qms.ResourceType
	(*timestamppb.Timestamp)(nil), // 5: google.protobuf.Timestamp
	(*header.Header)(nil),         // 6: header.Header
	(*svcerror.ServiceError)(nil), // 7: svcerror.ServiceError
}
var file_qms_quotas_proto_depIdxs = []int32{
	4,  // 0: qms.Quota.resource_type:type_name -> qms.ResourceType
	5,  // 1: qms.Quota.CreatedAt:type_name -> google.protobuf.Timestamp
	5,  // 2: qms.Quota.LastModifiedAt:type_name -> google.protobuf.Timestamp
	6,  // 3: qms.QuotaResponse.header:type_name -> header.Header
	7,  // 4: qms.QuotaResponse.error:type_name -> svcerror.ServiceError
	0,  // 5: qms.QuotaResponse.quota:type_name -> qms.Quota
	6,  // 6: qms.QuotaList.header:type_name -> header.Header
	7,  // 7: qms.QuotaList.error:type_name -> svcerror.ServiceError
	0,  // 8: qms.QuotaList.quotas:type_name -> qms.Quota
	6,  // 9: qms.AddQuotaRequest.header:type_name -> header.Header
	0,  // 10: qms.AddQuotaRequest.quota:type_name -> qms.Quota
	11, // [11:11] is the sub-list for method output_type
	11, // [11:11] is the sub-list for method input_type
	11, // [11:11] is the sub-list for extension type_name
	11, // [11:11] is the sub-list for extension extendee
	0,  // [0:11] is the sub-list for field type_name
}

func init() { file_qms_quotas_proto_init() }
func file_qms_quotas_proto_init() {
	if File_qms_quotas_proto != nil {
		return
	}
	file_qms_resource_types_proto_init()
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_qms_quotas_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_qms_quotas_proto_goTypes,
		DependencyIndexes: file_qms_quotas_proto_depIdxs,
		MessageInfos:      file_qms_quotas_proto_msgTypes,
	}.Build()
	File_qms_quotas_proto = out.File
	file_qms_quotas_proto_rawDesc = nil
	file_qms_quotas_proto_goTypes = nil
	file_qms_quotas_proto_depIdxs = nil
}
