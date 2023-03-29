// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.30.0
// 	protoc        v3.21.12
// source: user_requests.proto

package user

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
// A request for user information.
type UserLookupRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// How to uniquely identify the user being looked up.
	//
	// Types that are assignable to LookupIds:
	//
	//	*UserLookupRequest_Username
	//	*UserLookupRequest_UserId
	//	*UserLookupRequest_AnalysisId
	LookupIds isUserLookupRequest_LookupIds `protobuf_oneof:"lookup_ids"`
	// Whether to include user logins in the response.
	IncludeLogins bool `protobuf:"varint,5,opt,name=include_logins,json=includeLogins,proto3" json:"include_logins,omitempty"`
	// Whether to include user preferences in the response.
	IncludePreferences bool `protobuf:"varint,6,opt,name=include_preferences,json=includePreferences,proto3" json:"include_preferences,omitempty"`
	// Whether to include saved searches in the response.
	IncludeSavedSearches bool `protobuf:"varint,7,opt,name=include_saved_searches,json=includeSavedSearches,proto3" json:"include_saved_searches,omitempty"`
	// Paging limit.
	LoginLimit uint32 `protobuf:"varint,8,opt,name=login_limit,json=loginLimit,proto3" json:"login_limit,omitempty"`
	// Paging offset
	LoginOffset uint32 `protobuf:"varint,9,opt,name=login_offset,json=loginOffset,proto3" json:"login_offset,omitempty"`
	// Contains telemetry information
	Header *header.Header `protobuf:"bytes,10,opt,name=header,proto3" json:"header,omitempty"`
}

func (x *UserLookupRequest) Reset() {
	*x = UserLookupRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_user_requests_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UserLookupRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UserLookupRequest) ProtoMessage() {}

func (x *UserLookupRequest) ProtoReflect() protoreflect.Message {
	mi := &file_user_requests_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UserLookupRequest.ProtoReflect.Descriptor instead.
func (*UserLookupRequest) Descriptor() ([]byte, []int) {
	return file_user_requests_proto_rawDescGZIP(), []int{0}
}

func (m *UserLookupRequest) GetLookupIds() isUserLookupRequest_LookupIds {
	if m != nil {
		return m.LookupIds
	}
	return nil
}

func (x *UserLookupRequest) GetUsername() string {
	if x, ok := x.GetLookupIds().(*UserLookupRequest_Username); ok {
		return x.Username
	}
	return ""
}

func (x *UserLookupRequest) GetUserId() string {
	if x, ok := x.GetLookupIds().(*UserLookupRequest_UserId); ok {
		return x.UserId
	}
	return ""
}

func (x *UserLookupRequest) GetAnalysisId() string {
	if x, ok := x.GetLookupIds().(*UserLookupRequest_AnalysisId); ok {
		return x.AnalysisId
	}
	return ""
}

func (x *UserLookupRequest) GetIncludeLogins() bool {
	if x != nil {
		return x.IncludeLogins
	}
	return false
}

func (x *UserLookupRequest) GetIncludePreferences() bool {
	if x != nil {
		return x.IncludePreferences
	}
	return false
}

func (x *UserLookupRequest) GetIncludeSavedSearches() bool {
	if x != nil {
		return x.IncludeSavedSearches
	}
	return false
}

func (x *UserLookupRequest) GetLoginLimit() uint32 {
	if x != nil {
		return x.LoginLimit
	}
	return 0
}

func (x *UserLookupRequest) GetLoginOffset() uint32 {
	if x != nil {
		return x.LoginOffset
	}
	return 0
}

func (x *UserLookupRequest) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

type isUserLookupRequest_LookupIds interface {
	isUserLookupRequest_LookupIds()
}

type UserLookupRequest_Username struct {
	Username string `protobuf:"bytes,1,opt,name=username,proto3,oneof"`
}

type UserLookupRequest_UserId struct {
	UserId string `protobuf:"bytes,2,opt,name=user_id,json=userId,proto3,oneof"`
}

type UserLookupRequest_AnalysisId struct {
	AnalysisId string `protobuf:"bytes,3,opt,name=analysis_id,json=analysisId,proto3,oneof"`
}

func (*UserLookupRequest_Username) isUserLookupRequest_LookupIds() {}

func (*UserLookupRequest_UserId) isUserLookupRequest_LookupIds() {}

func (*UserLookupRequest_AnalysisId) isUserLookupRequest_LookupIds() {}

var File_user_requests_proto protoreflect.FileDescriptor

var file_user_requests_proto_rawDesc = []byte{
	0x0a, 0x13, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x73, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0d, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x72, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x73, 0x1a, 0x0c, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x22, 0xfd, 0x02, 0x0a, 0x11, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x6f, 0x6f, 0x6b, 0x75,
	0x70, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x1c, 0x0a, 0x08, 0x75, 0x73, 0x65, 0x72,
	0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x08, 0x75, 0x73,
	0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x19, 0x0a, 0x07, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x69,
	0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x06, 0x75, 0x73, 0x65, 0x72, 0x49,
	0x64, 0x12, 0x21, 0x0a, 0x0b, 0x61, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x69, 0x73, 0x5f, 0x69, 0x64,
	0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x0a, 0x61, 0x6e, 0x61, 0x6c, 0x79, 0x73,
	0x69, 0x73, 0x49, 0x64, 0x12, 0x25, 0x0a, 0x0e, 0x69, 0x6e, 0x63, 0x6c, 0x75, 0x64, 0x65, 0x5f,
	0x6c, 0x6f, 0x67, 0x69, 0x6e, 0x73, 0x18, 0x05, 0x20, 0x01, 0x28, 0x08, 0x52, 0x0d, 0x69, 0x6e,
	0x63, 0x6c, 0x75, 0x64, 0x65, 0x4c, 0x6f, 0x67, 0x69, 0x6e, 0x73, 0x12, 0x2f, 0x0a, 0x13, 0x69,
	0x6e, 0x63, 0x6c, 0x75, 0x64, 0x65, 0x5f, 0x70, 0x72, 0x65, 0x66, 0x65, 0x72, 0x65, 0x6e, 0x63,
	0x65, 0x73, 0x18, 0x06, 0x20, 0x01, 0x28, 0x08, 0x52, 0x12, 0x69, 0x6e, 0x63, 0x6c, 0x75, 0x64,
	0x65, 0x50, 0x72, 0x65, 0x66, 0x65, 0x72, 0x65, 0x6e, 0x63, 0x65, 0x73, 0x12, 0x34, 0x0a, 0x16,
	0x69, 0x6e, 0x63, 0x6c, 0x75, 0x64, 0x65, 0x5f, 0x73, 0x61, 0x76, 0x65, 0x64, 0x5f, 0x73, 0x65,
	0x61, 0x72, 0x63, 0x68, 0x65, 0x73, 0x18, 0x07, 0x20, 0x01, 0x28, 0x08, 0x52, 0x14, 0x69, 0x6e,
	0x63, 0x6c, 0x75, 0x64, 0x65, 0x53, 0x61, 0x76, 0x65, 0x64, 0x53, 0x65, 0x61, 0x72, 0x63, 0x68,
	0x65, 0x73, 0x12, 0x1f, 0x0a, 0x0b, 0x6c, 0x6f, 0x67, 0x69, 0x6e, 0x5f, 0x6c, 0x69, 0x6d, 0x69,
	0x74, 0x18, 0x08, 0x20, 0x01, 0x28, 0x0d, 0x52, 0x0a, 0x6c, 0x6f, 0x67, 0x69, 0x6e, 0x4c, 0x69,
	0x6d, 0x69, 0x74, 0x12, 0x21, 0x0a, 0x0c, 0x6c, 0x6f, 0x67, 0x69, 0x6e, 0x5f, 0x6f, 0x66, 0x66,
	0x73, 0x65, 0x74, 0x18, 0x09, 0x20, 0x01, 0x28, 0x0d, 0x52, 0x0b, 0x6c, 0x6f, 0x67, 0x69, 0x6e,
	0x4f, 0x66, 0x66, 0x73, 0x65, 0x74, 0x12, 0x26, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72,
	0x18, 0x0a, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x2e,
	0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x42, 0x0c,
	0x0a, 0x0a, 0x6c, 0x6f, 0x6f, 0x6b, 0x75, 0x70, 0x5f, 0x69, 0x64, 0x73, 0x4a, 0x04, 0x08, 0x04,
	0x10, 0x05, 0x42, 0x54, 0x0a, 0x18, 0x6f, 0x72, 0x67, 0x2e, 0x63, 0x79, 0x76, 0x65, 0x72, 0x73,
	0x65, 0x2e, 0x64, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x73, 0x42, 0x15,
	0x55, 0x73, 0x65, 0x72, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x73, 0x50, 0x72, 0x6f, 0x74,
	0x6f, 0x62, 0x75, 0x66, 0x73, 0x50, 0x01, 0x5a, 0x1f, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e,
	0x63, 0x6f, 0x6d, 0x2f, 0x63, 0x79, 0x76, 0x65, 0x72, 0x73, 0x65, 0x2d, 0x64, 0x65, 0x2f, 0x70,
	0x2f, 0x67, 0x6f, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_user_requests_proto_rawDescOnce sync.Once
	file_user_requests_proto_rawDescData = file_user_requests_proto_rawDesc
)

func file_user_requests_proto_rawDescGZIP() []byte {
	file_user_requests_proto_rawDescOnce.Do(func() {
		file_user_requests_proto_rawDescData = protoimpl.X.CompressGZIP(file_user_requests_proto_rawDescData)
	})
	return file_user_requests_proto_rawDescData
}

var file_user_requests_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_user_requests_proto_goTypes = []interface{}{
	(*UserLookupRequest)(nil), // 0: user_requests.UserLookupRequest
	(*header.Header)(nil),     // 1: header.Header
}
var file_user_requests_proto_depIdxs = []int32{
	1, // 0: user_requests.UserLookupRequest.header:type_name -> header.Header
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_user_requests_proto_init() }
func file_user_requests_proto_init() {
	if File_user_requests_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_user_requests_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UserLookupRequest); i {
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
	file_user_requests_proto_msgTypes[0].OneofWrappers = []interface{}{
		(*UserLookupRequest_Username)(nil),
		(*UserLookupRequest_UserId)(nil),
		(*UserLookupRequest_AnalysisId)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_user_requests_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_user_requests_proto_goTypes,
		DependencyIndexes: file_user_requests_proto_depIdxs,
		MessageInfos:      file_user_requests_proto_msgTypes,
	}.Build()
	File_user_requests_proto = out.File
	file_user_requests_proto_rawDesc = nil
	file_user_requests_proto_goTypes = nil
	file_user_requests_proto_depIdxs = nil
}
