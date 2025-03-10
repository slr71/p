// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.36.5
// 	protoc        v5.29.3
// source: qms_subscriptions.proto

package qms

import (
	header "github.com/cyverse-de/p/go/header"
	svcerror "github.com/cyverse-de/p/go/svcerror"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	timestamppb "google.golang.org/protobuf/types/known/timestamppb"
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
// Representation of a subscription.
type Subscription struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The unique identifier
	Uuid string `protobuf:"bytes,1,opt,name=uuid,proto3" json:"uuid,omitempty"`
	// The date the subscription activates.
	EffectiveStartDate *timestamppb.Timestamp `protobuf:"bytes,2,opt,name=effective_start_date,proto3" json:"effective_start_date,omitempty"`
	// The date the subscription deactivates/expires.
	EffectiveEndDate *timestamppb.Timestamp `protobuf:"bytes,3,opt,name=effective_end_date,proto3" json:"effective_end_date,omitempty"`
	// The user in the QMS system that the subscription is for.
	User *QMSUser `protobuf:"bytes,4,opt,name=user,proto3" json:"user,omitempty"`
	// The plan the user is subscribed to.
	Plan *Plan `protobuf:"bytes,5,opt,name=plan,proto3" json:"plan,omitempty"`
	// The list of quotas applied to the subscription. Initially populated
	// by quota defaults, but can be overridden.
	Quotas []*Quota `protobuf:"bytes,6,rep,name=quotas,proto3" json:"quotas,omitempty"`
	// The list of resource usages that the user has generated while this plan was active.
	Usages []*Usage `protobuf:"bytes,7,rep,name=usages,proto3" json:"usages,omitempty"`
	// A flag indicating whether or not the user paid for the subscription.
	Paid bool `protobuf:"varint,8,opt,name=paid,proto3" json:"paid,omitempty"`
	// Information about the rate that was active when the subscription was purchased. Note that this rate is recorded
	// whether or not the user paid for the subscription directly.
	PlanRate      *PlanRate `protobuf:"bytes,9,opt,name=plan_rate,proto3" json:"plan_rate,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *Subscription) Reset() {
	*x = Subscription{}
	mi := &file_qms_subscriptions_proto_msgTypes[0]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *Subscription) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Subscription) ProtoMessage() {}

func (x *Subscription) ProtoReflect() protoreflect.Message {
	mi := &file_qms_subscriptions_proto_msgTypes[0]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Subscription.ProtoReflect.Descriptor instead.
func (*Subscription) Descriptor() ([]byte, []int) {
	return file_qms_subscriptions_proto_rawDescGZIP(), []int{0}
}

func (x *Subscription) GetUuid() string {
	if x != nil {
		return x.Uuid
	}
	return ""
}

func (x *Subscription) GetEffectiveStartDate() *timestamppb.Timestamp {
	if x != nil {
		return x.EffectiveStartDate
	}
	return nil
}

func (x *Subscription) GetEffectiveEndDate() *timestamppb.Timestamp {
	if x != nil {
		return x.EffectiveEndDate
	}
	return nil
}

func (x *Subscription) GetUser() *QMSUser {
	if x != nil {
		return x.User
	}
	return nil
}

func (x *Subscription) GetPlan() *Plan {
	if x != nil {
		return x.Plan
	}
	return nil
}

func (x *Subscription) GetQuotas() []*Quota {
	if x != nil {
		return x.Quotas
	}
	return nil
}

func (x *Subscription) GetUsages() []*Usage {
	if x != nil {
		return x.Usages
	}
	return nil
}

func (x *Subscription) GetPaid() bool {
	if x != nil {
		return x.Paid
	}
	return false
}

func (x *Subscription) GetPlanRate() *PlanRate {
	if x != nil {
		return x.PlanRate
	}
	return nil
}

// *
// A response to a request for a subscription.
type SubscriptionResponse struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// Contains telemetry information
	Header *header.Header `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	// Error information returned by the request handler.
	Error *svcerror.ServiceError `protobuf:"bytes,2,opt,name=error,proto3" json:"error,omitempty"`
	// The subscription returned by the request handler.
	Subscription  *Subscription `protobuf:"bytes,3,opt,name=subscription,proto3" json:"subscription,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *SubscriptionResponse) Reset() {
	*x = SubscriptionResponse{}
	mi := &file_qms_subscriptions_proto_msgTypes[1]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *SubscriptionResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SubscriptionResponse) ProtoMessage() {}

func (x *SubscriptionResponse) ProtoReflect() protoreflect.Message {
	mi := &file_qms_subscriptions_proto_msgTypes[1]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SubscriptionResponse.ProtoReflect.Descriptor instead.
func (*SubscriptionResponse) Descriptor() ([]byte, []int) {
	return file_qms_subscriptions_proto_rawDescGZIP(), []int{1}
}

func (x *SubscriptionResponse) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *SubscriptionResponse) GetError() *svcerror.ServiceError {
	if x != nil {
		return x.Error
	}
	return nil
}

func (x *SubscriptionResponse) GetSubscription() *Subscription {
	if x != nil {
		return x.Subscription
	}
	return nil
}

// *
// A response to a request for a list of subscriptions.
type SubscriptionList struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// Contains telemetry information
	Header *header.Header `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	// Error information returned by the request handler.
	Error *svcerror.ServiceError `protobuf:"bytes,2,opt,name=error,proto3" json:"error,omitempty"`
	// The subscription list returned by the request handler.
	Subscriptions []*Subscription `protobuf:"bytes,3,rep,name=subscriptions,proto3" json:"subscriptions,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *SubscriptionList) Reset() {
	*x = SubscriptionList{}
	mi := &file_qms_subscriptions_proto_msgTypes[2]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *SubscriptionList) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SubscriptionList) ProtoMessage() {}

func (x *SubscriptionList) ProtoReflect() protoreflect.Message {
	mi := &file_qms_subscriptions_proto_msgTypes[2]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SubscriptionList.ProtoReflect.Descriptor instead.
func (*SubscriptionList) Descriptor() ([]byte, []int) {
	return file_qms_subscriptions_proto_rawDescGZIP(), []int{2}
}

func (x *SubscriptionList) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *SubscriptionList) GetError() *svcerror.ServiceError {
	if x != nil {
		return x.Error
	}
	return nil
}

func (x *SubscriptionList) GetSubscriptions() []*Subscription {
	if x != nil {
		return x.Subscriptions
	}
	return nil
}

// *
// A request to change a subscription.
type ChangeSubscriptionRequest struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// Contains telemetry information
	Header *header.Header `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	// A username for the user whose subscription is being changed.
	Username string `protobuf:"bytes,2,opt,name=username,proto3" json:"username,omitempty"`
	// Either a plan's unique identifier or name.
	//
	// Types that are valid to be assigned to Plan:
	//
	//	*ChangeSubscriptionRequest_Uuid
	//	*ChangeSubscriptionRequest_Name
	Plan isChangeSubscriptionRequest_Plan `protobuf_oneof:"plan"`
	// The number of subscription periods that the subscription will be good for. The subscription period is one year,
	// so purchasing a subscription for 3 periods will create a subscription for 3 years. Consumable resources are also
	// allocated based on the number of periods, so if a subscription plan comes with 2000 CPU Hours, for example, then
	// a user who purchases 3 subscription periods will get 6000 CPU hours to use over the course of three years.
	Periods int32 `protobuf:"varint,5,opt,name=periods,proto3" json:"periods,omitempty"`
	// The end-date of the subscription. Accepted formats are `YYYY-MM-DD`, `YYYY-MM-DDThh:mm:ss`,
	// `YYYY-MM-DDThh:mm:ssZ` and `YYYY-MM-DDThh:mm:ss+hh:mm`. Date and tiestamps without time zones are assumed to
	// be in the time zone used by the CyVerse Discovery Environment itself.
	EndDate       string `protobuf:"bytes,6,opt,name=end_date,json=endDate,proto3" json:"end_date,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *ChangeSubscriptionRequest) Reset() {
	*x = ChangeSubscriptionRequest{}
	mi := &file_qms_subscriptions_proto_msgTypes[3]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *ChangeSubscriptionRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ChangeSubscriptionRequest) ProtoMessage() {}

func (x *ChangeSubscriptionRequest) ProtoReflect() protoreflect.Message {
	mi := &file_qms_subscriptions_proto_msgTypes[3]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ChangeSubscriptionRequest.ProtoReflect.Descriptor instead.
func (*ChangeSubscriptionRequest) Descriptor() ([]byte, []int) {
	return file_qms_subscriptions_proto_rawDescGZIP(), []int{3}
}

func (x *ChangeSubscriptionRequest) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *ChangeSubscriptionRequest) GetUsername() string {
	if x != nil {
		return x.Username
	}
	return ""
}

func (x *ChangeSubscriptionRequest) GetPlan() isChangeSubscriptionRequest_Plan {
	if x != nil {
		return x.Plan
	}
	return nil
}

func (x *ChangeSubscriptionRequest) GetUuid() string {
	if x != nil {
		if x, ok := x.Plan.(*ChangeSubscriptionRequest_Uuid); ok {
			return x.Uuid
		}
	}
	return ""
}

func (x *ChangeSubscriptionRequest) GetName() string {
	if x != nil {
		if x, ok := x.Plan.(*ChangeSubscriptionRequest_Name); ok {
			return x.Name
		}
	}
	return ""
}

func (x *ChangeSubscriptionRequest) GetPeriods() int32 {
	if x != nil {
		return x.Periods
	}
	return 0
}

func (x *ChangeSubscriptionRequest) GetEndDate() string {
	if x != nil {
		return x.EndDate
	}
	return ""
}

type isChangeSubscriptionRequest_Plan interface {
	isChangeSubscriptionRequest_Plan()
}

type ChangeSubscriptionRequest_Uuid struct {
	Uuid string `protobuf:"bytes,3,opt,name=uuid,proto3,oneof"`
}

type ChangeSubscriptionRequest_Name struct {
	Name string `protobuf:"bytes,4,opt,name=name,proto3,oneof"`
}

func (*ChangeSubscriptionRequest_Uuid) isChangeSubscriptionRequest_Plan() {}

func (*ChangeSubscriptionRequest_Name) isChangeSubscriptionRequest_Plan() {}

var File_qms_subscriptions_proto protoreflect.FileDescriptor

var file_qms_subscriptions_proto_rawDesc = string([]byte{
	0x0a, 0x17, 0x71, 0x6d, 0x73, 0x5f, 0x73, 0x75, 0x62, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69,
	0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x03, 0x71, 0x6d, 0x73, 0x1a, 0x1f,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f,
	0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x0c, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0e, 0x73,
	0x76, 0x63, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0f, 0x71,
	0x6d, 0x73, 0x5f, 0x75, 0x73, 0x65, 0x72, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0f,
	0x71, 0x6d, 0x73, 0x5f, 0x70, 0x6c, 0x61, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x10, 0x71, 0x6d, 0x73, 0x5f, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x10, 0x71, 0x6d, 0x73, 0x5f, 0x75, 0x73, 0x61, 0x67, 0x65, 0x73, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x22, 0x88, 0x03, 0x0a, 0x0c, 0x53, 0x75, 0x62, 0x73, 0x63, 0x72, 0x69, 0x70,
	0x74, 0x69, 0x6f, 0x6e, 0x12, 0x12, 0x0a, 0x04, 0x75, 0x75, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x04, 0x75, 0x75, 0x69, 0x64, 0x12, 0x4e, 0x0a, 0x14, 0x65, 0x66, 0x66, 0x65,
	0x63, 0x74, 0x69, 0x76, 0x65, 0x5f, 0x73, 0x74, 0x61, 0x72, 0x74, 0x5f, 0x64, 0x61, 0x74, 0x65,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61,
	0x6d, 0x70, 0x52, 0x14, 0x65, 0x66, 0x66, 0x65, 0x63, 0x74, 0x69, 0x76, 0x65, 0x5f, 0x73, 0x74,
	0x61, 0x72, 0x74, 0x5f, 0x64, 0x61, 0x74, 0x65, 0x12, 0x4a, 0x0a, 0x12, 0x65, 0x66, 0x66, 0x65,
	0x63, 0x74, 0x69, 0x76, 0x65, 0x5f, 0x65, 0x6e, 0x64, 0x5f, 0x64, 0x61, 0x74, 0x65, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70,
	0x52, 0x12, 0x65, 0x66, 0x66, 0x65, 0x63, 0x74, 0x69, 0x76, 0x65, 0x5f, 0x65, 0x6e, 0x64, 0x5f,
	0x64, 0x61, 0x74, 0x65, 0x12, 0x20, 0x0a, 0x04, 0x75, 0x73, 0x65, 0x72, 0x18, 0x04, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x0c, 0x2e, 0x71, 0x6d, 0x73, 0x2e, 0x51, 0x4d, 0x53, 0x55, 0x73, 0x65, 0x72,
	0x52, 0x04, 0x75, 0x73, 0x65, 0x72, 0x12, 0x1d, 0x0a, 0x04, 0x70, 0x6c, 0x61, 0x6e, 0x18, 0x05,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x09, 0x2e, 0x71, 0x6d, 0x73, 0x2e, 0x50, 0x6c, 0x61, 0x6e, 0x52,
	0x04, 0x70, 0x6c, 0x61, 0x6e, 0x12, 0x22, 0x0a, 0x06, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x73, 0x18,
	0x06, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x0a, 0x2e, 0x71, 0x6d, 0x73, 0x2e, 0x51, 0x75, 0x6f, 0x74,
	0x61, 0x52, 0x06, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x73, 0x12, 0x22, 0x0a, 0x06, 0x75, 0x73, 0x61,
	0x67, 0x65, 0x73, 0x18, 0x07, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x0a, 0x2e, 0x71, 0x6d, 0x73, 0x2e,
	0x55, 0x73, 0x61, 0x67, 0x65, 0x52, 0x06, 0x75, 0x73, 0x61, 0x67, 0x65, 0x73, 0x12, 0x12, 0x0a,
	0x04, 0x70, 0x61, 0x69, 0x64, 0x18, 0x08, 0x20, 0x01, 0x28, 0x08, 0x52, 0x04, 0x70, 0x61, 0x69,
	0x64, 0x12, 0x2b, 0x0a, 0x09, 0x70, 0x6c, 0x61, 0x6e, 0x5f, 0x72, 0x61, 0x74, 0x65, 0x18, 0x09,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x0d, 0x2e, 0x71, 0x6d, 0x73, 0x2e, 0x50, 0x6c, 0x61, 0x6e, 0x52,
	0x61, 0x74, 0x65, 0x52, 0x09, 0x70, 0x6c, 0x61, 0x6e, 0x5f, 0x72, 0x61, 0x74, 0x65, 0x22, 0xa3,
	0x01, 0x0a, 0x14, 0x53, 0x75, 0x62, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x26, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65,
	0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72,
	0x2e, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12,
	0x2c, 0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x16,
	0x2e, 0x73, 0x76, 0x63, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x2e, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x52, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x12, 0x35, 0x0a,
	0x0c, 0x73, 0x75, 0x62, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x71, 0x6d, 0x73, 0x2e, 0x53, 0x75, 0x62, 0x73, 0x63, 0x72,
	0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0c, 0x73, 0x75, 0x62, 0x73, 0x63, 0x72, 0x69, 0x70,
	0x74, 0x69, 0x6f, 0x6e, 0x22, 0xa1, 0x01, 0x0a, 0x10, 0x53, 0x75, 0x62, 0x73, 0x63, 0x72, 0x69,
	0x70, 0x74, 0x69, 0x6f, 0x6e, 0x4c, 0x69, 0x73, 0x74, 0x12, 0x26, 0x0a, 0x06, 0x68, 0x65, 0x61,
	0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x68, 0x65, 0x61, 0x64,
	0x65, 0x72, 0x2e, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65,
	0x72, 0x12, 0x2c, 0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x16, 0x2e, 0x73, 0x76, 0x63, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x2e, 0x53, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x52, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x12,
	0x37, 0x0a, 0x0d, 0x73, 0x75, 0x62, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73,
	0x18, 0x03, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x71, 0x6d, 0x73, 0x2e, 0x53, 0x75, 0x62,
	0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0d, 0x73, 0x75, 0x62, 0x73, 0x63,
	0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x22, 0xc8, 0x01, 0x0a, 0x19, 0x43, 0x68, 0x61,
	0x6e, 0x67, 0x65, 0x53, 0x75, 0x62, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x26, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x2e,
	0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x1a,
	0x0a, 0x08, 0x75, 0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x08, 0x75, 0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x14, 0x0a, 0x04, 0x75, 0x75,
	0x69, 0x64, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x04, 0x75, 0x75, 0x69, 0x64,
	0x12, 0x14, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00,
	0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x70, 0x65, 0x72, 0x69, 0x6f, 0x64,
	0x73, 0x18, 0x05, 0x20, 0x01, 0x28, 0x05, 0x52, 0x07, 0x70, 0x65, 0x72, 0x69, 0x6f, 0x64, 0x73,
	0x12, 0x19, 0x0a, 0x08, 0x65, 0x6e, 0x64, 0x5f, 0x64, 0x61, 0x74, 0x65, 0x18, 0x06, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x07, 0x65, 0x6e, 0x64, 0x44, 0x61, 0x74, 0x65, 0x42, 0x06, 0x0a, 0x04, 0x70,
	0x6c, 0x61, 0x6e, 0x42, 0x56, 0x0a, 0x18, 0x6f, 0x72, 0x67, 0x2e, 0x63, 0x79, 0x76, 0x65, 0x72,
	0x73, 0x65, 0x2e, 0x64, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x73, 0x42,
	0x18, 0x51, 0x4d, 0x53, 0x53, 0x75, 0x62, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x73, 0x50, 0x01, 0x5a, 0x1e, 0x67, 0x69, 0x74,
	0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x63, 0x79, 0x76, 0x65, 0x72, 0x73, 0x65, 0x2d,
	0x64, 0x65, 0x2f, 0x70, 0x2f, 0x67, 0x6f, 0x2f, 0x71, 0x6d, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x33,
})

var (
	file_qms_subscriptions_proto_rawDescOnce sync.Once
	file_qms_subscriptions_proto_rawDescData []byte
)

func file_qms_subscriptions_proto_rawDescGZIP() []byte {
	file_qms_subscriptions_proto_rawDescOnce.Do(func() {
		file_qms_subscriptions_proto_rawDescData = protoimpl.X.CompressGZIP(unsafe.Slice(unsafe.StringData(file_qms_subscriptions_proto_rawDesc), len(file_qms_subscriptions_proto_rawDesc)))
	})
	return file_qms_subscriptions_proto_rawDescData
}

var file_qms_subscriptions_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_qms_subscriptions_proto_goTypes = []any{
	(*Subscription)(nil),              // 0: qms.Subscription
	(*SubscriptionResponse)(nil),      // 1: qms.SubscriptionResponse
	(*SubscriptionList)(nil),          // 2: qms.SubscriptionList
	(*ChangeSubscriptionRequest)(nil), // 3: qms.ChangeSubscriptionRequest
	(*timestamppb.Timestamp)(nil),     // 4: google.protobuf.Timestamp
	(*QMSUser)(nil),                   // 5: qms.QMSUser
	(*Plan)(nil),                      // 6: qms.Plan
	(*Quota)(nil),                     // 7: qms.Quota
	(*Usage)(nil),                     // 8: qms.Usage
	(*PlanRate)(nil),                  // 9: qms.PlanRate
	(*header.Header)(nil),             // 10: header.Header
	(*svcerror.ServiceError)(nil),     // 11: svcerror.ServiceError
}
var file_qms_subscriptions_proto_depIdxs = []int32{
	4,  // 0: qms.Subscription.effective_start_date:type_name -> google.protobuf.Timestamp
	4,  // 1: qms.Subscription.effective_end_date:type_name -> google.protobuf.Timestamp
	5,  // 2: qms.Subscription.user:type_name -> qms.QMSUser
	6,  // 3: qms.Subscription.plan:type_name -> qms.Plan
	7,  // 4: qms.Subscription.quotas:type_name -> qms.Quota
	8,  // 5: qms.Subscription.usages:type_name -> qms.Usage
	9,  // 6: qms.Subscription.plan_rate:type_name -> qms.PlanRate
	10, // 7: qms.SubscriptionResponse.header:type_name -> header.Header
	11, // 8: qms.SubscriptionResponse.error:type_name -> svcerror.ServiceError
	0,  // 9: qms.SubscriptionResponse.subscription:type_name -> qms.Subscription
	10, // 10: qms.SubscriptionList.header:type_name -> header.Header
	11, // 11: qms.SubscriptionList.error:type_name -> svcerror.ServiceError
	0,  // 12: qms.SubscriptionList.subscriptions:type_name -> qms.Subscription
	10, // 13: qms.ChangeSubscriptionRequest.header:type_name -> header.Header
	14, // [14:14] is the sub-list for method output_type
	14, // [14:14] is the sub-list for method input_type
	14, // [14:14] is the sub-list for extension type_name
	14, // [14:14] is the sub-list for extension extendee
	0,  // [0:14] is the sub-list for field type_name
}

func init() { file_qms_subscriptions_proto_init() }
func file_qms_subscriptions_proto_init() {
	if File_qms_subscriptions_proto != nil {
		return
	}
	file_qms_users_proto_init()
	file_qms_plans_proto_init()
	file_qms_quotas_proto_init()
	file_qms_usages_proto_init()
	file_qms_subscriptions_proto_msgTypes[3].OneofWrappers = []any{
		(*ChangeSubscriptionRequest_Uuid)(nil),
		(*ChangeSubscriptionRequest_Name)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: unsafe.Slice(unsafe.StringData(file_qms_subscriptions_proto_rawDesc), len(file_qms_subscriptions_proto_rawDesc)),
			NumEnums:      0,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_qms_subscriptions_proto_goTypes,
		DependencyIndexes: file_qms_subscriptions_proto_depIdxs,
		MessageInfos:      file_qms_subscriptions_proto_msgTypes,
	}.Build()
	File_qms_subscriptions_proto = out.File
	file_qms_subscriptions_proto_goTypes = nil
	file_qms_subscriptions_proto_depIdxs = nil
}
