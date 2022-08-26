// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        v3.21.5
// source: qms_plans.proto

package qms

import (
	header "github.com/cyverse-de/p/go/header"
	svcerror "github.com/cyverse-de/p/go/svcerror"
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

type QuotaDefault struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Uuid         string        `protobuf:"bytes,1,opt,name=uuid,proto3" json:"uuid,omitempty"`
	QuotaValue   float32       `protobuf:"fixed32,2,opt,name=quota_value,proto3" json:"quota_value,omitempty"`
	ResourceType *ResourceType `protobuf:"bytes,3,opt,name=resource_type,proto3" json:"resource_type,omitempty"`
}

func (x *QuotaDefault) Reset() {
	*x = QuotaDefault{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_plans_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *QuotaDefault) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*QuotaDefault) ProtoMessage() {}

func (x *QuotaDefault) ProtoReflect() protoreflect.Message {
	mi := &file_qms_plans_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use QuotaDefault.ProtoReflect.Descriptor instead.
func (*QuotaDefault) Descriptor() ([]byte, []int) {
	return file_qms_plans_proto_rawDescGZIP(), []int{0}
}

func (x *QuotaDefault) GetUuid() string {
	if x != nil {
		return x.Uuid
	}
	return ""
}

func (x *QuotaDefault) GetQuotaValue() float32 {
	if x != nil {
		return x.QuotaValue
	}
	return 0
}

func (x *QuotaDefault) GetResourceType() *ResourceType {
	if x != nil {
		return x.ResourceType
	}
	return nil
}

type QuotaDefaultResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Header       *header.Header         `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	Error        *svcerror.ServiceError `protobuf:"bytes,2,opt,name=error,proto3" json:"error,omitempty"`
	QuotaDefault *QuotaDefault          `protobuf:"bytes,3,opt,name=quota_default,proto3" json:"quota_default,omitempty"`
}

func (x *QuotaDefaultResponse) Reset() {
	*x = QuotaDefaultResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_plans_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *QuotaDefaultResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*QuotaDefaultResponse) ProtoMessage() {}

func (x *QuotaDefaultResponse) ProtoReflect() protoreflect.Message {
	mi := &file_qms_plans_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use QuotaDefaultResponse.ProtoReflect.Descriptor instead.
func (*QuotaDefaultResponse) Descriptor() ([]byte, []int) {
	return file_qms_plans_proto_rawDescGZIP(), []int{1}
}

func (x *QuotaDefaultResponse) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *QuotaDefaultResponse) GetError() *svcerror.ServiceError {
	if x != nil {
		return x.Error
	}
	return nil
}

func (x *QuotaDefaultResponse) GetQuotaDefault() *QuotaDefault {
	if x != nil {
		return x.QuotaDefault
	}
	return nil
}

type QuotaDefaultList struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Header        *header.Header         `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	Error         *svcerror.ServiceError `protobuf:"bytes,2,opt,name=error,proto3" json:"error,omitempty"`
	QuotaDefaults []*QuotaDefault        `protobuf:"bytes,3,rep,name=quota_defaults,proto3" json:"quota_defaults,omitempty"`
}

func (x *QuotaDefaultList) Reset() {
	*x = QuotaDefaultList{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_plans_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *QuotaDefaultList) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*QuotaDefaultList) ProtoMessage() {}

func (x *QuotaDefaultList) ProtoReflect() protoreflect.Message {
	mi := &file_qms_plans_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use QuotaDefaultList.ProtoReflect.Descriptor instead.
func (*QuotaDefaultList) Descriptor() ([]byte, []int) {
	return file_qms_plans_proto_rawDescGZIP(), []int{2}
}

func (x *QuotaDefaultList) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *QuotaDefaultList) GetError() *svcerror.ServiceError {
	if x != nil {
		return x.Error
	}
	return nil
}

func (x *QuotaDefaultList) GetQuotaDefaults() []*QuotaDefault {
	if x != nil {
		return x.QuotaDefaults
	}
	return nil
}

type Plan struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Uuid              string          `protobuf:"bytes,1,opt,name=uuid,proto3" json:"uuid,omitempty"`
	Name              string          `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
	Description       string          `protobuf:"bytes,3,opt,name=description,proto3" json:"description,omitempty"`
	PlanQuotaDefaults []*QuotaDefault `protobuf:"bytes,4,rep,name=plan_quota_defaults,proto3" json:"plan_quota_defaults,omitempty"`
}

func (x *Plan) Reset() {
	*x = Plan{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_plans_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Plan) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Plan) ProtoMessage() {}

func (x *Plan) ProtoReflect() protoreflect.Message {
	mi := &file_qms_plans_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Plan.ProtoReflect.Descriptor instead.
func (*Plan) Descriptor() ([]byte, []int) {
	return file_qms_plans_proto_rawDescGZIP(), []int{3}
}

func (x *Plan) GetUuid() string {
	if x != nil {
		return x.Uuid
	}
	return ""
}

func (x *Plan) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Plan) GetDescription() string {
	if x != nil {
		return x.Description
	}
	return ""
}

func (x *Plan) GetPlanQuotaDefaults() []*QuotaDefault {
	if x != nil {
		return x.PlanQuotaDefaults
	}
	return nil
}

type PlanResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Header *header.Header         `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	Error  *svcerror.ServiceError `protobuf:"bytes,2,opt,name=error,proto3" json:"error,omitempty"`
	Plan   *Plan                  `protobuf:"bytes,3,opt,name=plan,proto3" json:"plan,omitempty"`
}

func (x *PlanResponse) Reset() {
	*x = PlanResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_plans_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PlanResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PlanResponse) ProtoMessage() {}

func (x *PlanResponse) ProtoReflect() protoreflect.Message {
	mi := &file_qms_plans_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PlanResponse.ProtoReflect.Descriptor instead.
func (*PlanResponse) Descriptor() ([]byte, []int) {
	return file_qms_plans_proto_rawDescGZIP(), []int{4}
}

func (x *PlanResponse) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *PlanResponse) GetError() *svcerror.ServiceError {
	if x != nil {
		return x.Error
	}
	return nil
}

func (x *PlanResponse) GetPlan() *Plan {
	if x != nil {
		return x.Plan
	}
	return nil
}

type PlanList struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Header *header.Header         `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	Error  *svcerror.ServiceError `protobuf:"bytes,2,opt,name=error,proto3" json:"error,omitempty"`
	Plans  []*Plan                `protobuf:"bytes,3,rep,name=plans,proto3" json:"plans,omitempty"`
}

func (x *PlanList) Reset() {
	*x = PlanList{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_plans_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PlanList) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PlanList) ProtoMessage() {}

func (x *PlanList) ProtoReflect() protoreflect.Message {
	mi := &file_qms_plans_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PlanList.ProtoReflect.Descriptor instead.
func (*PlanList) Descriptor() ([]byte, []int) {
	return file_qms_plans_proto_rawDescGZIP(), []int{5}
}

func (x *PlanList) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *PlanList) GetError() *svcerror.ServiceError {
	if x != nil {
		return x.Error
	}
	return nil
}

func (x *PlanList) GetPlans() []*Plan {
	if x != nil {
		return x.Plans
	}
	return nil
}

var File_qms_plans_proto protoreflect.FileDescriptor

var file_qms_plans_proto_rawDesc = []byte{
	0x0a, 0x0f, 0x71, 0x6d, 0x73, 0x5f, 0x70, 0x6c, 0x61, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x0c, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x0e, 0x73, 0x76, 0x63, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x18, 0x71, 0x6d, 0x73, 0x5f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x74, 0x79,
	0x70, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x79, 0x0a, 0x0c, 0x51, 0x75, 0x6f,
	0x74, 0x61, 0x44, 0x65, 0x66, 0x61, 0x75, 0x6c, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x75, 0x75, 0x69,
	0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x75, 0x75, 0x69, 0x64, 0x12, 0x20, 0x0a,
	0x0b, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x5f, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x02, 0x52, 0x0b, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x5f, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x12,
	0x33, 0x0a, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x74, 0x79, 0x70, 0x65,
	0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0d, 0x2e, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x54, 0x79, 0x70, 0x65, 0x52, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f,
	0x74, 0x79, 0x70, 0x65, 0x22, 0x91, 0x01, 0x0a, 0x14, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x44, 0x65,
	0x66, 0x61, 0x75, 0x6c, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x1f, 0x0a,
	0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x07, 0x2e,
	0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x23,
	0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0d, 0x2e,
	0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x52, 0x05, 0x65, 0x72,
	0x72, 0x6f, 0x72, 0x12, 0x33, 0x0a, 0x0d, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x5f, 0x64, 0x65, 0x66,
	0x61, 0x75, 0x6c, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0d, 0x2e, 0x51, 0x75, 0x6f,
	0x74, 0x61, 0x44, 0x65, 0x66, 0x61, 0x75, 0x6c, 0x74, 0x52, 0x0d, 0x71, 0x75, 0x6f, 0x74, 0x61,
	0x5f, 0x64, 0x65, 0x66, 0x61, 0x75, 0x6c, 0x74, 0x22, 0x8f, 0x01, 0x0a, 0x10, 0x51, 0x75, 0x6f,
	0x74, 0x61, 0x44, 0x65, 0x66, 0x61, 0x75, 0x6c, 0x74, 0x4c, 0x69, 0x73, 0x74, 0x12, 0x1f, 0x0a,
	0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x07, 0x2e,
	0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x23,
	0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0d, 0x2e,
	0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x52, 0x05, 0x65, 0x72,
	0x72, 0x6f, 0x72, 0x12, 0x35, 0x0a, 0x0e, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x5f, 0x64, 0x65, 0x66,
	0x61, 0x75, 0x6c, 0x74, 0x73, 0x18, 0x03, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x0d, 0x2e, 0x51, 0x75,
	0x6f, 0x74, 0x61, 0x44, 0x65, 0x66, 0x61, 0x75, 0x6c, 0x74, 0x52, 0x0e, 0x71, 0x75, 0x6f, 0x74,
	0x61, 0x5f, 0x64, 0x65, 0x66, 0x61, 0x75, 0x6c, 0x74, 0x73, 0x22, 0x91, 0x01, 0x0a, 0x04, 0x50,
	0x6c, 0x61, 0x6e, 0x12, 0x12, 0x0a, 0x04, 0x75, 0x75, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x04, 0x75, 0x75, 0x69, 0x64, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x20, 0x0a, 0x0b, 0x64,
	0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x0b, 0x64, 0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x3f, 0x0a,
	0x13, 0x70, 0x6c, 0x61, 0x6e, 0x5f, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x5f, 0x64, 0x65, 0x66, 0x61,
	0x75, 0x6c, 0x74, 0x73, 0x18, 0x04, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x0d, 0x2e, 0x51, 0x75, 0x6f,
	0x74, 0x61, 0x44, 0x65, 0x66, 0x61, 0x75, 0x6c, 0x74, 0x52, 0x13, 0x70, 0x6c, 0x61, 0x6e, 0x5f,
	0x71, 0x75, 0x6f, 0x74, 0x61, 0x5f, 0x64, 0x65, 0x66, 0x61, 0x75, 0x6c, 0x74, 0x73, 0x22, 0x6f,
	0x0a, 0x0c, 0x50, 0x6c, 0x61, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x1f,
	0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x07,
	0x2e, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12,
	0x23, 0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0d,
	0x2e, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x52, 0x05, 0x65,
	0x72, 0x72, 0x6f, 0x72, 0x12, 0x19, 0x0a, 0x04, 0x70, 0x6c, 0x61, 0x6e, 0x18, 0x03, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x05, 0x2e, 0x50, 0x6c, 0x61, 0x6e, 0x52, 0x04, 0x70, 0x6c, 0x61, 0x6e, 0x22,
	0x6d, 0x0a, 0x08, 0x50, 0x6c, 0x61, 0x6e, 0x4c, 0x69, 0x73, 0x74, 0x12, 0x1f, 0x0a, 0x06, 0x68,
	0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x07, 0x2e, 0x48, 0x65,
	0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x23, 0x0a, 0x05,
	0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0d, 0x2e, 0x53, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x52, 0x05, 0x65, 0x72, 0x72, 0x6f,
	0x72, 0x12, 0x1b, 0x0a, 0x05, 0x70, 0x6c, 0x61, 0x6e, 0x73, 0x18, 0x03, 0x20, 0x03, 0x28, 0x0b,
	0x32, 0x05, 0x2e, 0x50, 0x6c, 0x61, 0x6e, 0x52, 0x05, 0x70, 0x6c, 0x61, 0x6e, 0x73, 0x42, 0x4f,
	0x0a, 0x18, 0x6f, 0x72, 0x67, 0x2e, 0x63, 0x79, 0x76, 0x65, 0x72, 0x73, 0x65, 0x2e, 0x64, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x73, 0x42, 0x11, 0x51, 0x4d, 0x53, 0x50,
	0x6c, 0x61, 0x6e, 0x73, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x73, 0x50, 0x01, 0x5a,
	0x1e, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x63, 0x79, 0x76, 0x65,
	0x72, 0x73, 0x65, 0x2d, 0x64, 0x65, 0x2f, 0x70, 0x2f, 0x67, 0x6f, 0x2f, 0x71, 0x6d, 0x73, 0x62,
	0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_qms_plans_proto_rawDescOnce sync.Once
	file_qms_plans_proto_rawDescData = file_qms_plans_proto_rawDesc
)

func file_qms_plans_proto_rawDescGZIP() []byte {
	file_qms_plans_proto_rawDescOnce.Do(func() {
		file_qms_plans_proto_rawDescData = protoimpl.X.CompressGZIP(file_qms_plans_proto_rawDescData)
	})
	return file_qms_plans_proto_rawDescData
}

var file_qms_plans_proto_msgTypes = make([]protoimpl.MessageInfo, 6)
var file_qms_plans_proto_goTypes = []interface{}{
	(*QuotaDefault)(nil),          // 0: QuotaDefault
	(*QuotaDefaultResponse)(nil),  // 1: QuotaDefaultResponse
	(*QuotaDefaultList)(nil),      // 2: QuotaDefaultList
	(*Plan)(nil),                  // 3: Plan
	(*PlanResponse)(nil),          // 4: PlanResponse
	(*PlanList)(nil),              // 5: PlanList
	(*ResourceType)(nil),          // 6: ResourceType
	(*header.Header)(nil),         // 7: Header
	(*svcerror.ServiceError)(nil), // 8: ServiceError
}
var file_qms_plans_proto_depIdxs = []int32{
	6,  // 0: QuotaDefault.resource_type:type_name -> ResourceType
	7,  // 1: QuotaDefaultResponse.header:type_name -> Header
	8,  // 2: QuotaDefaultResponse.error:type_name -> ServiceError
	0,  // 3: QuotaDefaultResponse.quota_default:type_name -> QuotaDefault
	7,  // 4: QuotaDefaultList.header:type_name -> Header
	8,  // 5: QuotaDefaultList.error:type_name -> ServiceError
	0,  // 6: QuotaDefaultList.quota_defaults:type_name -> QuotaDefault
	0,  // 7: Plan.plan_quota_defaults:type_name -> QuotaDefault
	7,  // 8: PlanResponse.header:type_name -> Header
	8,  // 9: PlanResponse.error:type_name -> ServiceError
	3,  // 10: PlanResponse.plan:type_name -> Plan
	7,  // 11: PlanList.header:type_name -> Header
	8,  // 12: PlanList.error:type_name -> ServiceError
	3,  // 13: PlanList.plans:type_name -> Plan
	14, // [14:14] is the sub-list for method output_type
	14, // [14:14] is the sub-list for method input_type
	14, // [14:14] is the sub-list for extension type_name
	14, // [14:14] is the sub-list for extension extendee
	0,  // [0:14] is the sub-list for field type_name
}

func init() { file_qms_plans_proto_init() }
func file_qms_plans_proto_init() {
	if File_qms_plans_proto != nil {
		return
	}
	file_qms_resource_types_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_qms_plans_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*QuotaDefault); i {
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
		file_qms_plans_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*QuotaDefaultResponse); i {
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
		file_qms_plans_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*QuotaDefaultList); i {
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
		file_qms_plans_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Plan); i {
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
		file_qms_plans_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PlanResponse); i {
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
		file_qms_plans_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PlanList); i {
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
			RawDescriptor: file_qms_plans_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   6,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_qms_plans_proto_goTypes,
		DependencyIndexes: file_qms_plans_proto_depIdxs,
		MessageInfos:      file_qms_plans_proto_msgTypes,
	}.Build()
	File_qms_plans_proto = out.File
	file_qms_plans_proto_rawDesc = nil
	file_qms_plans_proto_goTypes = nil
	file_qms_plans_proto_depIdxs = nil
}
