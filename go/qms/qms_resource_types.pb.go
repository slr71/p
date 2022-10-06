// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.19.4
// source: qms_resource_types.proto

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

type ResourceType struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Uuid string `protobuf:"bytes,1,opt,name=uuid,proto3" json:"uuid,omitempty"`
	Name string `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
	Unit string `protobuf:"bytes,3,opt,name=unit,proto3" json:"unit,omitempty"`
}

func (x *ResourceType) Reset() {
	*x = ResourceType{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_resource_types_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ResourceType) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ResourceType) ProtoMessage() {}

func (x *ResourceType) ProtoReflect() protoreflect.Message {
	mi := &file_qms_resource_types_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ResourceType.ProtoReflect.Descriptor instead.
func (*ResourceType) Descriptor() ([]byte, []int) {
	return file_qms_resource_types_proto_rawDescGZIP(), []int{0}
}

func (x *ResourceType) GetUuid() string {
	if x != nil {
		return x.Uuid
	}
	return ""
}

func (x *ResourceType) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *ResourceType) GetUnit() string {
	if x != nil {
		return x.Unit
	}
	return ""
}

type ResourceTypeResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Header       *header.Header         `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	Error        *svcerror.ServiceError `protobuf:"bytes,2,opt,name=error,proto3" json:"error,omitempty"`
	ResourceType *ResourceType          `protobuf:"bytes,3,opt,name=resource_type,proto3" json:"resource_type,omitempty"`
}

func (x *ResourceTypeResponse) Reset() {
	*x = ResourceTypeResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_resource_types_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ResourceTypeResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ResourceTypeResponse) ProtoMessage() {}

func (x *ResourceTypeResponse) ProtoReflect() protoreflect.Message {
	mi := &file_qms_resource_types_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ResourceTypeResponse.ProtoReflect.Descriptor instead.
func (*ResourceTypeResponse) Descriptor() ([]byte, []int) {
	return file_qms_resource_types_proto_rawDescGZIP(), []int{1}
}

func (x *ResourceTypeResponse) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *ResourceTypeResponse) GetError() *svcerror.ServiceError {
	if x != nil {
		return x.Error
	}
	return nil
}

func (x *ResourceTypeResponse) GetResourceType() *ResourceType {
	if x != nil {
		return x.ResourceType
	}
	return nil
}

type ResourceTypeList struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Header        *header.Header         `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	Error         *svcerror.ServiceError `protobuf:"bytes,2,opt,name=error,proto3" json:"error,omitempty"`
	ResourceTypes []*ResourceType        `protobuf:"bytes,3,rep,name=resource_types,proto3" json:"resource_types,omitempty"`
}

func (x *ResourceTypeList) Reset() {
	*x = ResourceTypeList{}
	if protoimpl.UnsafeEnabled {
		mi := &file_qms_resource_types_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ResourceTypeList) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ResourceTypeList) ProtoMessage() {}

func (x *ResourceTypeList) ProtoReflect() protoreflect.Message {
	mi := &file_qms_resource_types_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ResourceTypeList.ProtoReflect.Descriptor instead.
func (*ResourceTypeList) Descriptor() ([]byte, []int) {
	return file_qms_resource_types_proto_rawDescGZIP(), []int{2}
}

func (x *ResourceTypeList) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *ResourceTypeList) GetError() *svcerror.ServiceError {
	if x != nil {
		return x.Error
	}
	return nil
}

func (x *ResourceTypeList) GetResourceTypes() []*ResourceType {
	if x != nil {
		return x.ResourceTypes
	}
	return nil
}

var File_qms_resource_types_proto protoreflect.FileDescriptor

var file_qms_resource_types_proto_rawDesc = []byte{
	0x0a, 0x18, 0x71, 0x6d, 0x73, 0x5f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x74,
	0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0c, 0x68, 0x65, 0x61, 0x64,
	0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0e, 0x73, 0x76, 0x63, 0x65, 0x72, 0x72,
	0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x4a, 0x0a, 0x0c, 0x52, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x54, 0x79, 0x70, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x75, 0x75, 0x69, 0x64,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x75, 0x75, 0x69, 0x64, 0x12, 0x12, 0x0a, 0x04,
	0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65,
	0x12, 0x12, 0x0a, 0x04, 0x75, 0x6e, 0x69, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04,
	0x75, 0x6e, 0x69, 0x74, 0x22, 0x91, 0x01, 0x0a, 0x14, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x54, 0x79, 0x70, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x1f, 0x0a,
	0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x07, 0x2e,
	0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x23,
	0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0d, 0x2e,
	0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x52, 0x05, 0x65, 0x72,
	0x72, 0x6f, 0x72, 0x12, 0x33, 0x0a, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f,
	0x74, 0x79, 0x70, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0d, 0x2e, 0x52, 0x65, 0x73,
	0x6f, 0x75, 0x72, 0x63, 0x65, 0x54, 0x79, 0x70, 0x65, 0x52, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75,
	0x72, 0x63, 0x65, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x22, 0x8f, 0x01, 0x0a, 0x10, 0x52, 0x65, 0x73,
	0x6f, 0x75, 0x72, 0x63, 0x65, 0x54, 0x79, 0x70, 0x65, 0x4c, 0x69, 0x73, 0x74, 0x12, 0x1f, 0x0a,
	0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x07, 0x2e,
	0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x23,
	0x0a, 0x05, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0d, 0x2e,
	0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x52, 0x05, 0x65, 0x72,
	0x72, 0x6f, 0x72, 0x12, 0x35, 0x0a, 0x0e, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f,
	0x74, 0x79, 0x70, 0x65, 0x73, 0x18, 0x03, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x0d, 0x2e, 0x52, 0x65,
	0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x54, 0x79, 0x70, 0x65, 0x52, 0x0e, 0x72, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x42, 0x56, 0x0a, 0x18, 0x6f, 0x72,
	0x67, 0x2e, 0x63, 0x79, 0x76, 0x65, 0x72, 0x73, 0x65, 0x2e, 0x64, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x62, 0x75, 0x66, 0x73, 0x42, 0x18, 0x51, 0x4d, 0x53, 0x52, 0x65, 0x73, 0x6f, 0x75,
	0x72, 0x63, 0x65, 0x54, 0x79, 0x70, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x73,
	0x50, 0x01, 0x5a, 0x1e, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x63,
	0x79, 0x76, 0x65, 0x72, 0x73, 0x65, 0x2d, 0x64, 0x65, 0x2f, 0x70, 0x2f, 0x67, 0x6f, 0x2f, 0x71,
	0x6d, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_qms_resource_types_proto_rawDescOnce sync.Once
	file_qms_resource_types_proto_rawDescData = file_qms_resource_types_proto_rawDesc
)

func file_qms_resource_types_proto_rawDescGZIP() []byte {
	file_qms_resource_types_proto_rawDescOnce.Do(func() {
		file_qms_resource_types_proto_rawDescData = protoimpl.X.CompressGZIP(file_qms_resource_types_proto_rawDescData)
	})
	return file_qms_resource_types_proto_rawDescData
}

var file_qms_resource_types_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_qms_resource_types_proto_goTypes = []interface{}{
	(*ResourceType)(nil),          // 0: ResourceType
	(*ResourceTypeResponse)(nil),  // 1: ResourceTypeResponse
	(*ResourceTypeList)(nil),      // 2: ResourceTypeList
	(*header.Header)(nil),         // 3: Header
	(*svcerror.ServiceError)(nil), // 4: ServiceError
}
var file_qms_resource_types_proto_depIdxs = []int32{
	3, // 0: ResourceTypeResponse.header:type_name -> Header
	4, // 1: ResourceTypeResponse.error:type_name -> ServiceError
	0, // 2: ResourceTypeResponse.resource_type:type_name -> ResourceType
	3, // 3: ResourceTypeList.header:type_name -> Header
	4, // 4: ResourceTypeList.error:type_name -> ServiceError
	0, // 5: ResourceTypeList.resource_types:type_name -> ResourceType
	6, // [6:6] is the sub-list for method output_type
	6, // [6:6] is the sub-list for method input_type
	6, // [6:6] is the sub-list for extension type_name
	6, // [6:6] is the sub-list for extension extendee
	0, // [0:6] is the sub-list for field type_name
}

func init() { file_qms_resource_types_proto_init() }
func file_qms_resource_types_proto_init() {
	if File_qms_resource_types_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_qms_resource_types_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ResourceType); i {
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
		file_qms_resource_types_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ResourceTypeResponse); i {
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
		file_qms_resource_types_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ResourceTypeList); i {
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
			RawDescriptor: file_qms_resource_types_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_qms_resource_types_proto_goTypes,
		DependencyIndexes: file_qms_resource_types_proto_depIdxs,
		MessageInfos:      file_qms_resource_types_proto_msgTypes,
	}.Build()
	File_qms_resource_types_proto = out.File
	file_qms_resource_types_proto_rawDesc = nil
	file_qms_resource_types_proto_goTypes = nil
	file_qms_resource_types_proto_depIdxs = nil
}
