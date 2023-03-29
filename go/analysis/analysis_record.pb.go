// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.30.0
// 	protoc        v3.21.12
// source: analysis_record.proto

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

type AnalysisRecord struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Header          *header.Header              `protobuf:"bytes,1,opt,name=header,proto3" json:"header,omitempty"`
	Id              string                      `protobuf:"bytes,2,opt,name=id,proto3" json:"id,omitempty"`
	Description     string                      `protobuf:"bytes,3,opt,name=description,proto3" json:"description,omitempty"`
	Name            string                      `protobuf:"bytes,4,opt,name=name,proto3" json:"name,omitempty"`
	CanShare        bool                        `protobuf:"varint,5,opt,name=can_share,proto3" json:"can_share,omitempty"`
	Username        string                      `protobuf:"bytes,6,opt,name=username,proto3" json:"username,omitempty"`
	AppId           string                      `protobuf:"bytes,7,opt,name=app_id,proto3" json:"app_id,omitempty"`
	BatchStatus     *AnalysisRecord_BatchStatus `protobuf:"bytes,8,opt,name=batch_status,proto3" json:"batch_status,omitempty"`
	SystemId        string                      `protobuf:"bytes,9,opt,name=system_id,proto3" json:"system_id,omitempty"`
	AppDisabled     bool                        `protobuf:"varint,10,opt,name=app_disabled,proto3" json:"app_disabled,omitempty"`
	Batch           bool                        `protobuf:"varint,11,opt,name=batch,proto3" json:"batch,omitempty"`
	Enddate         string                      `protobuf:"bytes,12,opt,name=enddate,proto3" json:"enddate,omitempty"`
	Startdate       string                      `protobuf:"bytes,13,opt,name=startdate,proto3" json:"startdate,omitempty"`
	AppDescription  string                      `protobuf:"bytes,14,opt,name=app_description,proto3" json:"app_description,omitempty"`
	InteractiveUrls []string                    `protobuf:"bytes,15,rep,name=interactive_urls,proto3" json:"interactive_urls,omitempty"`
	WikiUrl         string                      `protobuf:"bytes,16,opt,name=wiki_url,proto3" json:"wiki_url,omitempty"`
	Notify          bool                        `protobuf:"varint,17,opt,name=notify,proto3" json:"notify,omitempty"`
	ResultFolderId  string                      `protobuf:"bytes,18,opt,name=result_folder_id,json=resultfolderid,proto3" json:"result_folder_id,omitempty"`
	AppName         string                      `protobuf:"bytes,19,opt,name=app_name,proto3" json:"app_name,omitempty"`
}

func (x *AnalysisRecord) Reset() {
	*x = AnalysisRecord{}
	if protoimpl.UnsafeEnabled {
		mi := &file_analysis_record_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AnalysisRecord) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AnalysisRecord) ProtoMessage() {}

func (x *AnalysisRecord) ProtoReflect() protoreflect.Message {
	mi := &file_analysis_record_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AnalysisRecord.ProtoReflect.Descriptor instead.
func (*AnalysisRecord) Descriptor() ([]byte, []int) {
	return file_analysis_record_proto_rawDescGZIP(), []int{0}
}

func (x *AnalysisRecord) GetHeader() *header.Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *AnalysisRecord) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *AnalysisRecord) GetDescription() string {
	if x != nil {
		return x.Description
	}
	return ""
}

func (x *AnalysisRecord) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *AnalysisRecord) GetCanShare() bool {
	if x != nil {
		return x.CanShare
	}
	return false
}

func (x *AnalysisRecord) GetUsername() string {
	if x != nil {
		return x.Username
	}
	return ""
}

func (x *AnalysisRecord) GetAppId() string {
	if x != nil {
		return x.AppId
	}
	return ""
}

func (x *AnalysisRecord) GetBatchStatus() *AnalysisRecord_BatchStatus {
	if x != nil {
		return x.BatchStatus
	}
	return nil
}

func (x *AnalysisRecord) GetSystemId() string {
	if x != nil {
		return x.SystemId
	}
	return ""
}

func (x *AnalysisRecord) GetAppDisabled() bool {
	if x != nil {
		return x.AppDisabled
	}
	return false
}

func (x *AnalysisRecord) GetBatch() bool {
	if x != nil {
		return x.Batch
	}
	return false
}

func (x *AnalysisRecord) GetEnddate() string {
	if x != nil {
		return x.Enddate
	}
	return ""
}

func (x *AnalysisRecord) GetStartdate() string {
	if x != nil {
		return x.Startdate
	}
	return ""
}

func (x *AnalysisRecord) GetAppDescription() string {
	if x != nil {
		return x.AppDescription
	}
	return ""
}

func (x *AnalysisRecord) GetInteractiveUrls() []string {
	if x != nil {
		return x.InteractiveUrls
	}
	return nil
}

func (x *AnalysisRecord) GetWikiUrl() string {
	if x != nil {
		return x.WikiUrl
	}
	return ""
}

func (x *AnalysisRecord) GetNotify() bool {
	if x != nil {
		return x.Notify
	}
	return false
}

func (x *AnalysisRecord) GetResultFolderId() string {
	if x != nil {
		return x.ResultFolderId
	}
	return ""
}

func (x *AnalysisRecord) GetAppName() string {
	if x != nil {
		return x.AppName
	}
	return ""
}

type AnalysisRecord_BatchStatus struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Total     int64 `protobuf:"varint,1,opt,name=total,proto3" json:"total,omitempty"`
	Completed int64 `protobuf:"varint,2,opt,name=completed,proto3" json:"completed,omitempty"`
	Running   int64 `protobuf:"varint,3,opt,name=running,proto3" json:"running,omitempty"`
	Submitted int64 `protobuf:"varint,4,opt,name=submitted,proto3" json:"submitted,omitempty"`
}

func (x *AnalysisRecord_BatchStatus) Reset() {
	*x = AnalysisRecord_BatchStatus{}
	if protoimpl.UnsafeEnabled {
		mi := &file_analysis_record_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AnalysisRecord_BatchStatus) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AnalysisRecord_BatchStatus) ProtoMessage() {}

func (x *AnalysisRecord_BatchStatus) ProtoReflect() protoreflect.Message {
	mi := &file_analysis_record_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AnalysisRecord_BatchStatus.ProtoReflect.Descriptor instead.
func (*AnalysisRecord_BatchStatus) Descriptor() ([]byte, []int) {
	return file_analysis_record_proto_rawDescGZIP(), []int{0, 0}
}

func (x *AnalysisRecord_BatchStatus) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

func (x *AnalysisRecord_BatchStatus) GetCompleted() int64 {
	if x != nil {
		return x.Completed
	}
	return 0
}

func (x *AnalysisRecord_BatchStatus) GetRunning() int64 {
	if x != nil {
		return x.Running
	}
	return 0
}

func (x *AnalysisRecord_BatchStatus) GetSubmitted() int64 {
	if x != nil {
		return x.Submitted
	}
	return 0
}

var File_analysis_record_proto protoreflect.FileDescriptor

var file_analysis_record_proto_rawDesc = []byte{
	0x0a, 0x15, 0x61, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x69, 0x73, 0x5f, 0x72, 0x65, 0x63, 0x6f, 0x72,
	0x64, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x08, 0x61, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x69,
	0x73, 0x1a, 0x0c, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22,
	0xf5, 0x05, 0x0a, 0x0e, 0x41, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x69, 0x73, 0x52, 0x65, 0x63, 0x6f,
	0x72, 0x64, 0x12, 0x26, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x2e, 0x48, 0x65, 0x61, 0x64,
	0x65, 0x72, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x20, 0x0a, 0x0b, 0x64, 0x65,
	0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x0b, 0x64, 0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x12, 0x0a, 0x04,
	0x6e, 0x61, 0x6d, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65,
	0x12, 0x1c, 0x0a, 0x09, 0x63, 0x61, 0x6e, 0x5f, 0x73, 0x68, 0x61, 0x72, 0x65, 0x18, 0x05, 0x20,
	0x01, 0x28, 0x08, 0x52, 0x09, 0x63, 0x61, 0x6e, 0x5f, 0x73, 0x68, 0x61, 0x72, 0x65, 0x12, 0x1a,
	0x0a, 0x08, 0x75, 0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x08, 0x75, 0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x61, 0x70,
	0x70, 0x5f, 0x69, 0x64, 0x18, 0x07, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x61, 0x70, 0x70, 0x5f,
	0x69, 0x64, 0x12, 0x48, 0x0a, 0x0c, 0x62, 0x61, 0x74, 0x63, 0x68, 0x5f, 0x73, 0x74, 0x61, 0x74,
	0x75, 0x73, 0x18, 0x08, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x24, 0x2e, 0x61, 0x6e, 0x61, 0x6c, 0x79,
	0x73, 0x69, 0x73, 0x2e, 0x41, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x69, 0x73, 0x52, 0x65, 0x63, 0x6f,
	0x72, 0x64, 0x2e, 0x42, 0x61, 0x74, 0x63, 0x68, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x0c,
	0x62, 0x61, 0x74, 0x63, 0x68, 0x5f, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x1c, 0x0a, 0x09,
	0x73, 0x79, 0x73, 0x74, 0x65, 0x6d, 0x5f, 0x69, 0x64, 0x18, 0x09, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x09, 0x73, 0x79, 0x73, 0x74, 0x65, 0x6d, 0x5f, 0x69, 0x64, 0x12, 0x22, 0x0a, 0x0c, 0x61, 0x70,
	0x70, 0x5f, 0x64, 0x69, 0x73, 0x61, 0x62, 0x6c, 0x65, 0x64, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x08,
	0x52, 0x0c, 0x61, 0x70, 0x70, 0x5f, 0x64, 0x69, 0x73, 0x61, 0x62, 0x6c, 0x65, 0x64, 0x12, 0x14,
	0x0a, 0x05, 0x62, 0x61, 0x74, 0x63, 0x68, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x08, 0x52, 0x05, 0x62,
	0x61, 0x74, 0x63, 0x68, 0x12, 0x18, 0x0a, 0x07, 0x65, 0x6e, 0x64, 0x64, 0x61, 0x74, 0x65, 0x18,
	0x0c, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x65, 0x6e, 0x64, 0x64, 0x61, 0x74, 0x65, 0x12, 0x1c,
	0x0a, 0x09, 0x73, 0x74, 0x61, 0x72, 0x74, 0x64, 0x61, 0x74, 0x65, 0x18, 0x0d, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x09, 0x73, 0x74, 0x61, 0x72, 0x74, 0x64, 0x61, 0x74, 0x65, 0x12, 0x28, 0x0a, 0x0f,
	0x61, 0x70, 0x70, 0x5f, 0x64, 0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x18,
	0x0e, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0f, 0x61, 0x70, 0x70, 0x5f, 0x64, 0x65, 0x73, 0x63, 0x72,
	0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x2a, 0x0a, 0x10, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x61,
	0x63, 0x74, 0x69, 0x76, 0x65, 0x5f, 0x75, 0x72, 0x6c, 0x73, 0x18, 0x0f, 0x20, 0x03, 0x28, 0x09,
	0x52, 0x10, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x61, 0x63, 0x74, 0x69, 0x76, 0x65, 0x5f, 0x75, 0x72,
	0x6c, 0x73, 0x12, 0x1a, 0x0a, 0x08, 0x77, 0x69, 0x6b, 0x69, 0x5f, 0x75, 0x72, 0x6c, 0x18, 0x10,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x77, 0x69, 0x6b, 0x69, 0x5f, 0x75, 0x72, 0x6c, 0x12, 0x16,
	0x0a, 0x06, 0x6e, 0x6f, 0x74, 0x69, 0x66, 0x79, 0x18, 0x11, 0x20, 0x01, 0x28, 0x08, 0x52, 0x06,
	0x6e, 0x6f, 0x74, 0x69, 0x66, 0x79, 0x12, 0x28, 0x0a, 0x10, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74,
	0x5f, 0x66, 0x6f, 0x6c, 0x64, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x12, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x0e, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x66, 0x6f, 0x6c, 0x64, 0x65, 0x72, 0x69, 0x64,
	0x12, 0x1a, 0x0a, 0x08, 0x61, 0x70, 0x70, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x13, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x08, 0x61, 0x70, 0x70, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x1a, 0x79, 0x0a, 0x0b,
	0x42, 0x61, 0x74, 0x63, 0x68, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x14, 0x0a, 0x05, 0x74,
	0x6f, 0x74, 0x61, 0x6c, 0x18, 0x01, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x74, 0x6f, 0x74, 0x61,
	0x6c, 0x12, 0x1c, 0x0a, 0x09, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x74, 0x65, 0x64, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x03, 0x52, 0x09, 0x63, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x74, 0x65, 0x64, 0x12,
	0x18, 0x0a, 0x07, 0x72, 0x75, 0x6e, 0x6e, 0x69, 0x6e, 0x67, 0x18, 0x03, 0x20, 0x01, 0x28, 0x03,
	0x52, 0x07, 0x72, 0x75, 0x6e, 0x6e, 0x69, 0x6e, 0x67, 0x12, 0x1c, 0x0a, 0x09, 0x73, 0x75, 0x62,
	0x6d, 0x69, 0x74, 0x74, 0x65, 0x64, 0x18, 0x04, 0x20, 0x01, 0x28, 0x03, 0x52, 0x09, 0x73, 0x75,
	0x62, 0x6d, 0x69, 0x74, 0x74, 0x65, 0x64, 0x42, 0x5a, 0x0a, 0x18, 0x6f, 0x72, 0x67, 0x2e, 0x63,
	0x79, 0x76, 0x65, 0x72, 0x73, 0x65, 0x2e, 0x64, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62,
	0x75, 0x66, 0x73, 0x42, 0x17, 0x41, 0x6e, 0x61, 0x6c, 0x79, 0x73, 0x69, 0x73, 0x52, 0x65, 0x63,
	0x6f, 0x72, 0x64, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x73, 0x50, 0x01, 0x5a, 0x23,
	0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x63, 0x79, 0x76, 0x65, 0x72,
	0x73, 0x65, 0x2d, 0x64, 0x65, 0x2f, 0x70, 0x2f, 0x67, 0x6f, 0x2f, 0x61, 0x6e, 0x61, 0x6c, 0x79,
	0x73, 0x69, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_analysis_record_proto_rawDescOnce sync.Once
	file_analysis_record_proto_rawDescData = file_analysis_record_proto_rawDesc
)

func file_analysis_record_proto_rawDescGZIP() []byte {
	file_analysis_record_proto_rawDescOnce.Do(func() {
		file_analysis_record_proto_rawDescData = protoimpl.X.CompressGZIP(file_analysis_record_proto_rawDescData)
	})
	return file_analysis_record_proto_rawDescData
}

var file_analysis_record_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_analysis_record_proto_goTypes = []interface{}{
	(*AnalysisRecord)(nil),             // 0: analysis.AnalysisRecord
	(*AnalysisRecord_BatchStatus)(nil), // 1: analysis.AnalysisRecord.BatchStatus
	(*header.Header)(nil),              // 2: header.Header
}
var file_analysis_record_proto_depIdxs = []int32{
	2, // 0: analysis.AnalysisRecord.header:type_name -> header.Header
	1, // 1: analysis.AnalysisRecord.batch_status:type_name -> analysis.AnalysisRecord.BatchStatus
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_analysis_record_proto_init() }
func file_analysis_record_proto_init() {
	if File_analysis_record_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_analysis_record_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AnalysisRecord); i {
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
		file_analysis_record_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AnalysisRecord_BatchStatus); i {
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
			RawDescriptor: file_analysis_record_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_analysis_record_proto_goTypes,
		DependencyIndexes: file_analysis_record_proto_depIdxs,
		MessageInfos:      file_analysis_record_proto_msgTypes,
	}.Build()
	File_analysis_record_proto = out.File
	file_analysis_record_proto_rawDesc = nil
	file_analysis_record_proto_goTypes = nil
	file_analysis_record_proto_depIdxs = nil
}
