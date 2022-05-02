// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.19.4
// source: analysis/requests.proto

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

type AnalysisRecordLookupRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Types that are assignable to LookupIds:
	//	*AnalysisRecordLookupRequest_AnalysisId
	//	*AnalysisRecordLookupRequest_ExternalId
	//	*AnalysisRecordLookupRequest_UserId
	//	*AnalysisRecordLookupRequest_Username
	LookupIds      isAnalysisRecordLookupRequest_LookupIds `protobuf_oneof:"lookup_ids"`
	Header         *header.Header                          `protobuf:"bytes,5,opt,name=header,proto3" json:"header,omitempty"`
	RequestingUser string                                  `protobuf:"bytes,6,opt,name=requesting_user,json=requestingUser,proto3" json:"requesting_user,omitempty"`
}

func (x *AnalysisRecordLookupRequest) Reset() {
	*x = AnalysisRecordLookupRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_analysis_requests_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AnalysisRecordLookupRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AnalysisRecordLookupRequest) ProtoMessage() {}

func (x *AnalysisRecordLookupRequest) ProtoReflect() protoreflect.Message {
	mi := &file_analysis_requests_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AnalysisRecordLookupRequest.ProtoReflect.Descriptor instead.
func (*AnalysisRecordLookupRequest) Descriptor() ([]byte, []int) {
	return file_analysis_requests_proto_rawDescGZIP(), []int{0}
}

func (m *AnalysisRecordLookupRequest) GetLookupIds() isAnalysisRecordLookupRequest_LookupIds {
	if m != nil {
		return m.LookupIds
	}
	return nil
}

func (x *AnalysisRecordLookupRequest) GetAnalysisId() string {
	if x, ok := x.GetLookupIds().(*AnalysisRecordLookupRequest_AnalysisId); ok {
		return x.AnalysisId
	}
	return ""
}

func (x *AnalysisRecordLookupRequest) GetExternalId() string {
	if x, ok := x.GetLookupIds().(*AnalysisRecordLookupRequest_ExternalId); ok {
		return x.ExternalId
	}
	return ""
}

func (x *AnalysisRecordLookupRequest) GetUserId() string {
	if x, ok := x.GetLookupIds().(*AnalysisRecordLookupRequest_UserId); ok {
		return x.UserId
	}
	return ""
}

func (x *AnalysisRecordLookupRequest) GetUsername() string {
	if x, ok := x.GetLookupIds().(*AnalysisRecordLookupRequest_Username); ok {
		return x.Username
	}
	return ""
}

func (x *AnalysisRecordLookupRequest) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *AnalysisRecordLookupRequest) GetRequestingUser() string {
	if x != nil {
		return x.RequestingUser
	}
	return ""
}

type isAnalysisRecordLookupRequest_LookupIds interface {
	isAnalysisRecordLookupRequest_LookupIds()
}

type AnalysisRecordLookupRequest_AnalysisId struct {
	AnalysisId string `protobuf:"bytes,1,opt,name=analysis_id,json=analysisId,proto3,oneof"`
}

type AnalysisRecordLookupRequest_ExternalId struct {
	ExternalId string `protobuf:"bytes,2,opt,name=external_id,json=externalId,proto3,oneof"`
}

type AnalysisRecordLookupRequest_UserId struct {
	UserId string `protobuf:"bytes,3,opt,name=user_id,json=userId,proto3,oneof"`
}

type AnalysisRecordLookupRequest_Username struct {
	Username string `protobuf:"bytes,4,opt,name=username,proto3,oneof"`
}

func (*AnalysisRecordLookupRequest_AnalysisId) isAnalysisRecordLookupRequest_LookupIds() {}

func (*AnalysisRecordLookupRequest_ExternalId) isAnalysisRecordLookupRequest_LookupIds() {}

func (*AnalysisRecordLookupRequest_UserId) isAnalysisRecordLookupRequest_LookupIds() {}

func (*AnalysisRecordLookupRequest_Username) isAnalysisRecordLookupRequest_LookupIds() {}

type AnalysisRecordResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Header      *header.Header                              `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	Analyses    []*AnalysisRecord                           `protobuf:"bytes,2,rep,name=Analyses,proto3" json:"Analyses,omitempty"`
	Timestamp   string                                      `protobuf:"bytes,3,opt,name=Timestamp,proto3" json:"Timestamp,omitempty"`
	Total       int64                                       `protobuf:"varint,4,opt,name=Total,proto3" json:"Total,omitempty"`
	StatusCount []*AnalysisRecordResponse_StatusCountRecord `protobuf:"bytes,5,rep,name=StatusCount,json=status-count,proto3" json:"StatusCount,omitempty"`
}

func (x *AnalysisRecordResponse) Reset() {
	*x = AnalysisRecordResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_analysis_requests_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AnalysisRecordResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AnalysisRecordResponse) ProtoMessage() {}

func (x *AnalysisRecordResponse) ProtoReflect() protoreflect.Message {
	mi := &file_analysis_requests_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AnalysisRecordResponse.ProtoReflect.Descriptor instead.
func (*AnalysisRecordResponse) Descriptor() ([]byte, []int) {
	return file_analysis_requests_proto_rawDescGZIP(), []int{1}
}

func (x *AnalysisRecordResponse) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *AnalysisRecordResponse) GetAnalyses() []*AnalysisRecord {
	if x != nil {
		return x.Analyses
	}
	return nil
}

func (x *AnalysisRecordResponse) GetTimestamp() string {
	if x != nil {
		return x.Timestamp
	}
	return ""
}

func (x *AnalysisRecordResponse) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

func (x *AnalysisRecordResponse) GetStatusCount() []*AnalysisRecordResponse_StatusCountRecord {
	if x != nil {
		return x.StatusCount
	}
	return nil
}

type AnalysisRecordResponse_StatusCountRecord struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Count  int64  `protobuf:"varint,1,opt,name=Count,proto3" json:"Count,omitempty"`
	Status string `protobuf:"bytes,2,opt,name=Status,proto3" json:"Status,omitempty"`
}

func (x *AnalysisRecordResponse_StatusCountRecord) Reset() {
	*x = AnalysisRecordResponse_StatusCountRecord{}
	if protoimpl.UnsafeEnabled {
		mi := &file_analysis_requests_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AnalysisRecordResponse_StatusCountRecord) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AnalysisRecordResponse_StatusCountRecord) ProtoMessage() {}

func (x *AnalysisRecordResponse_StatusCountRecord) ProtoReflect() protoreflect.Message {
	mi := &file_analysis_requests_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AnalysisRecordResponse_StatusCountRecord.ProtoReflect.Descriptor instead.
func (*AnalysisRecordResponse_StatusCountRecord) Descriptor() ([]byte, []int) {
	return file_analysis_requests_proto_rawDescGZIP(), []int{1, 0}
}

func (x *AnalysisRecordResponse_StatusCountRecord) GetCount() int64 {
	if x != nil {
		return x.Count
	}
	return 0
}

func (x *AnalysisRecordResponse_StatusCountRecord) GetStatus() string {
	if x != nil {
		return x.Status
	}
	return ""
}

var File_analysis_requests_proto protoreflect.FileDescriptor

var file_analysis_requests_proto_rawDesc = []byte{
	0x0a, 0x17, 0x61, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x69, 0x73, 0x2f, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x13, 0x68, 0x65, 0x61, 0x64, 0x65,
	0x72, 0x2f, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1e,
	0x61, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x69, 0x73, 0x2f, 0x61, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x69,
	0x73, 0x5f, 0x72, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xf4,
	0x01, 0x0a, 0x1b, 0x41, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x69, 0x73, 0x52, 0x65, 0x63, 0x6f, 0x72,
	0x64, 0x4c, 0x6f, 0x6f, 0x6b, 0x75, 0x70, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x21,
	0x0a, 0x0b, 0x61, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x69, 0x73, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x0a, 0x61, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x69, 0x73, 0x49,
	0x64, 0x12, 0x21, 0x0a, 0x0b, 0x65, 0x78, 0x74, 0x65, 0x72, 0x6e, 0x61, 0x6c, 0x5f, 0x69, 0x64,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x0a, 0x65, 0x78, 0x74, 0x65, 0x72, 0x6e,
	0x61, 0x6c, 0x49, 0x64, 0x12, 0x19, 0x0a, 0x07, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x06, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x12,
	0x1c, 0x0a, 0x08, 0x75, 0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28,
	0x09, 0x48, 0x00, 0x52, 0x08, 0x75, 0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x1f, 0x0a,
	0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x07, 0x2e,
	0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x27,
	0x0a, 0x0f, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x69, 0x6e, 0x67, 0x5f, 0x75, 0x73, 0x65,
	0x72, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x69, 0x6e, 0x67, 0x55, 0x73, 0x65, 0x72, 0x42, 0x0c, 0x0a, 0x0a, 0x6c, 0x6f, 0x6f, 0x6b, 0x75,
	0x70, 0x5f, 0x69, 0x64, 0x73, 0x22, 0xab, 0x02, 0x0a, 0x16, 0x41, 0x6e, 0x61, 0x6c, 0x79, 0x73,
	0x69, 0x73, 0x52, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x12, 0x1f, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x07, 0x2e, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65,
	0x72, 0x12, 0x2b, 0x0a, 0x08, 0x41, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x65, 0x73, 0x18, 0x02, 0x20,
	0x03, 0x28, 0x0b, 0x32, 0x0f, 0x2e, 0x41, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x69, 0x73, 0x52, 0x65,
	0x63, 0x6f, 0x72, 0x64, 0x52, 0x08, 0x41, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x65, 0x73, 0x12, 0x1c,
	0x0a, 0x09, 0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x09, 0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x12, 0x14, 0x0a, 0x05,
	0x54, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x04, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x54, 0x6f, 0x74,
	0x61, 0x6c, 0x12, 0x4c, 0x0a, 0x0b, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x43, 0x6f, 0x75, 0x6e,
	0x74, 0x18, 0x05, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x29, 0x2e, 0x41, 0x6e, 0x61, 0x6c, 0x79, 0x73,
	0x69, 0x73, 0x52, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x2e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x43, 0x6f, 0x75, 0x6e, 0x74, 0x52, 0x65, 0x63, 0x6f,
	0x72, 0x64, 0x52, 0x0c, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2d, 0x63, 0x6f, 0x75, 0x6e, 0x74,
	0x1a, 0x41, 0x0a, 0x11, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x43, 0x6f, 0x75, 0x6e, 0x74, 0x52,
	0x65, 0x63, 0x6f, 0x72, 0x64, 0x12, 0x14, 0x0a, 0x05, 0x43, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x43, 0x6f, 0x75, 0x6e, 0x74, 0x12, 0x16, 0x0a, 0x06, 0x53,
	0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x53, 0x74, 0x61,
	0x74, 0x75, 0x73, 0x42, 0x25, 0x5a, 0x23, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f,
	0x6d, 0x2f, 0x63, 0x79, 0x76, 0x65, 0x72, 0x73, 0x65, 0x2d, 0x64, 0x65, 0x2f, 0x70, 0x2f, 0x67,
	0x6f, 0x2f, 0x61, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x69, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
}

var (
	file_analysis_requests_proto_rawDescOnce sync.Once
	file_analysis_requests_proto_rawDescData = file_analysis_requests_proto_rawDesc
)

func file_analysis_requests_proto_rawDescGZIP() []byte {
	file_analysis_requests_proto_rawDescOnce.Do(func() {
		file_analysis_requests_proto_rawDescData = protoimpl.X.CompressGZIP(file_analysis_requests_proto_rawDescData)
	})
	return file_analysis_requests_proto_rawDescData
}

var file_analysis_requests_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_analysis_requests_proto_goTypes = []interface{}{
	(*AnalysisRecordLookupRequest)(nil),              // 0: AnalysisRecordLookupRequest
	(*AnalysisRecordResponse)(nil),                   // 1: AnalysisRecordResponse
	(*AnalysisRecordResponse_StatusCountRecord)(nil), // 2: AnalysisRecordResponse.StatusCountRecord
	(*header.Header)(nil),                            // 3: Header
	(*AnalysisRecord)(nil),                           // 4: AnalysisRecord
}
var file_analysis_requests_proto_depIdxs = []int32{
	3, // 0: AnalysisRecordLookupRequest.header:type_name -> Header
	3, // 1: AnalysisRecordResponse.header:type_name -> Header
	4, // 2: AnalysisRecordResponse.Analyses:type_name -> AnalysisRecord
	2, // 3: AnalysisRecordResponse.StatusCount:type_name -> AnalysisRecordResponse.StatusCountRecord
	4, // [4:4] is the sub-list for method output_type
	4, // [4:4] is the sub-list for method input_type
	4, // [4:4] is the sub-list for extension type_name
	4, // [4:4] is the sub-list for extension extendee
	0, // [0:4] is the sub-list for field type_name
}

func init() { file_analysis_requests_proto_init() }
func file_analysis_requests_proto_init() {
	if File_analysis_requests_proto != nil {
		return
	}
	file_analysis_analysis_record_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_analysis_requests_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AnalysisRecordLookupRequest); i {
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
		file_analysis_requests_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AnalysisRecordResponse); i {
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
		file_analysis_requests_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AnalysisRecordResponse_StatusCountRecord); i {
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
	file_analysis_requests_proto_msgTypes[0].OneofWrappers = []interface{}{
		(*AnalysisRecordLookupRequest_AnalysisId)(nil),
		(*AnalysisRecordLookupRequest_ExternalId)(nil),
		(*AnalysisRecordLookupRequest_UserId)(nil),
		(*AnalysisRecordLookupRequest_Username)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_analysis_requests_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_analysis_requests_proto_goTypes,
		DependencyIndexes: file_analysis_requests_proto_depIdxs,
		MessageInfos:      file_analysis_requests_proto_msgTypes,
	}.Build()
	File_analysis_requests_proto = out.File
	file_analysis_requests_proto_rawDesc = nil
	file_analysis_requests_proto_goTypes = nil
	file_analysis_requests_proto_depIdxs = nil
}
