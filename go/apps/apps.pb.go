// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.36.5
// 	protoc        v5.29.3
// source: apps.proto

package apps

import (
	user "github.com/cyverse-de/p/go/user"
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
// An app in the system.
//
// An app is a collection of one or more tools that run in an environment to produce outputs.
type App struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The UUID for the app.
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// The name of the app.
	Name string `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
	// The description of the app.
	Description string `protobuf:"bytes,3,opt,name=description,proto3" json:"description,omitempty"`
	// The wiki URL of the app.
	WikiUrl       string `protobuf:"bytes,4,opt,name=wiki_url,proto3" json:"wiki_url,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *App) Reset() {
	*x = App{}
	mi := &file_apps_proto_msgTypes[0]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *App) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*App) ProtoMessage() {}

func (x *App) ProtoReflect() protoreflect.Message {
	mi := &file_apps_proto_msgTypes[0]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use App.ProtoReflect.Descriptor instead.
func (*App) Descriptor() ([]byte, []int) {
	return file_apps_proto_rawDescGZIP(), []int{0}
}

func (x *App) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *App) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *App) GetDescription() string {
	if x != nil {
		return x.Description
	}
	return ""
}

func (x *App) GetWikiUrl() string {
	if x != nil {
		return x.WikiUrl
	}
	return ""
}

// *
// Information about when something was integrated.
type IntegrationData struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The UUID of the integration data.
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// The name of the person that integrated stuff.
	IntegratorName string `protobuf:"bytes,2,opt,name=integrator_name,proto3" json:"integrator_name,omitempty"`
	// The email of the person that integrated stuff.
	IntegratorEmail string `protobuf:"bytes,3,opt,name=integrator_email,proto3" json:"integrator_email,omitempty"`
	// The user information of the integrator.
	User          *user.User `protobuf:"bytes,4,opt,name=user,proto3" json:"user,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *IntegrationData) Reset() {
	*x = IntegrationData{}
	mi := &file_apps_proto_msgTypes[1]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *IntegrationData) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*IntegrationData) ProtoMessage() {}

func (x *IntegrationData) ProtoReflect() protoreflect.Message {
	mi := &file_apps_proto_msgTypes[1]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use IntegrationData.ProtoReflect.Descriptor instead.
func (*IntegrationData) Descriptor() ([]byte, []int) {
	return file_apps_proto_rawDescGZIP(), []int{1}
}

func (x *IntegrationData) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *IntegrationData) GetIntegratorName() string {
	if x != nil {
		return x.IntegratorName
	}
	return ""
}

func (x *IntegrationData) GetIntegratorEmail() string {
	if x != nil {
		return x.IntegratorEmail
	}
	return ""
}

func (x *IntegrationData) GetUser() *user.User {
	if x != nil {
		return x.User
	}
	return nil
}

// *
// App version information.
type AppVersion struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The UUID for the app version information.
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// The UUID of the app the version information applies to.
	AppId string `protobuf:"bytes,2,opt,name=app_id,proto3" json:"app_id,omitempty"`
	// The string representation of the version.
	Version string `protobuf:"bytes,3,opt,name=version,proto3" json:"version,omitempty"`
	// The ordering of the version.
	VersionOrder int64 `protobuf:"varint,4,opt,name=version_order,proto3" json:"version_order,omitempty"`
	// Whether the version is deleted.
	Deleted bool `protobuf:"varint,5,opt,name=deleted,proto3" json:"deleted,omitempty"`
	// Whether the version is disabled.
	Disabled bool `protobuf:"varint,6,opt,name=disabled,proto3" json:"disabled,omitempty"`
	// Integration information for this version.
	Integration *IntegrationData `protobuf:"bytes,7,opt,name=integration,proto3" json:"integration,omitempty"`
	// The date the version was integrated.
	IntegrationDate *timestamppb.Timestamp `protobuf:"bytes,8,opt,name=integration_date,proto3" json:"integration_date,omitempty"`
	// The date the app version was last edited.
	EditedDate    *timestamppb.Timestamp `protobuf:"bytes,9,opt,name=edited_date,proto3" json:"edited_date,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *AppVersion) Reset() {
	*x = AppVersion{}
	mi := &file_apps_proto_msgTypes[2]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *AppVersion) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AppVersion) ProtoMessage() {}

func (x *AppVersion) ProtoReflect() protoreflect.Message {
	mi := &file_apps_proto_msgTypes[2]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AppVersion.ProtoReflect.Descriptor instead.
func (*AppVersion) Descriptor() ([]byte, []int) {
	return file_apps_proto_rawDescGZIP(), []int{2}
}

func (x *AppVersion) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *AppVersion) GetAppId() string {
	if x != nil {
		return x.AppId
	}
	return ""
}

func (x *AppVersion) GetVersion() string {
	if x != nil {
		return x.Version
	}
	return ""
}

func (x *AppVersion) GetVersionOrder() int64 {
	if x != nil {
		return x.VersionOrder
	}
	return 0
}

func (x *AppVersion) GetDeleted() bool {
	if x != nil {
		return x.Deleted
	}
	return false
}

func (x *AppVersion) GetDisabled() bool {
	if x != nil {
		return x.Disabled
	}
	return false
}

func (x *AppVersion) GetIntegration() *IntegrationData {
	if x != nil {
		return x.Integration
	}
	return nil
}

func (x *AppVersion) GetIntegrationDate() *timestamppb.Timestamp {
	if x != nil {
		return x.IntegrationDate
	}
	return nil
}

func (x *AppVersion) GetEditedDate() *timestamppb.Timestamp {
	if x != nil {
		return x.EditedDate
	}
	return nil
}

var File_apps_proto protoreflect.FileDescriptor

var file_apps_proto_rawDesc = string([]byte{
	0x0a, 0x0a, 0x61, 0x70, 0x70, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x04, 0x61, 0x70,
	0x70, 0x73, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x62, 0x75, 0x66, 0x2f, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x0a, 0x75, 0x73, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22,
	0x67, 0x0a, 0x03, 0x41, 0x70, 0x70, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x20, 0x0a, 0x0b, 0x64, 0x65,
	0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x0b, 0x64, 0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x1a, 0x0a, 0x08,
	0x77, 0x69, 0x6b, 0x69, 0x5f, 0x75, 0x72, 0x6c, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08,
	0x77, 0x69, 0x6b, 0x69, 0x5f, 0x75, 0x72, 0x6c, 0x22, 0x97, 0x01, 0x0a, 0x0f, 0x49, 0x6e, 0x74,
	0x65, 0x67, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x44, 0x61, 0x74, 0x61, 0x12, 0x0e, 0x0a, 0x02,
	0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x28, 0x0a, 0x0f,
	0x69, 0x6e, 0x74, 0x65, 0x67, 0x72, 0x61, 0x74, 0x6f, 0x72, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0f, 0x69, 0x6e, 0x74, 0x65, 0x67, 0x72, 0x61, 0x74, 0x6f,
	0x72, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x2a, 0x0a, 0x10, 0x69, 0x6e, 0x74, 0x65, 0x67, 0x72,
	0x61, 0x74, 0x6f, 0x72, 0x5f, 0x65, 0x6d, 0x61, 0x69, 0x6c, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x10, 0x69, 0x6e, 0x74, 0x65, 0x67, 0x72, 0x61, 0x74, 0x6f, 0x72, 0x5f, 0x65, 0x6d, 0x61,
	0x69, 0x6c, 0x12, 0x1e, 0x0a, 0x04, 0x75, 0x73, 0x65, 0x72, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x0a, 0x2e, 0x75, 0x73, 0x65, 0x72, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x52, 0x04, 0x75, 0x73,
	0x65, 0x72, 0x22, 0xe9, 0x02, 0x0a, 0x0a, 0x41, 0x70, 0x70, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f,
	0x6e, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69,
	0x64, 0x12, 0x16, 0x0a, 0x06, 0x61, 0x70, 0x70, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x06, 0x61, 0x70, 0x70, 0x5f, 0x69, 0x64, 0x12, 0x18, 0x0a, 0x07, 0x76, 0x65, 0x72,
	0x73, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x76, 0x65, 0x72, 0x73,
	0x69, 0x6f, 0x6e, 0x12, 0x24, 0x0a, 0x0d, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x5f, 0x6f,
	0x72, 0x64, 0x65, 0x72, 0x18, 0x04, 0x20, 0x01, 0x28, 0x03, 0x52, 0x0d, 0x76, 0x65, 0x72, 0x73,
	0x69, 0x6f, 0x6e, 0x5f, 0x6f, 0x72, 0x64, 0x65, 0x72, 0x12, 0x18, 0x0a, 0x07, 0x64, 0x65, 0x6c,
	0x65, 0x74, 0x65, 0x64, 0x18, 0x05, 0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x64, 0x65, 0x6c, 0x65,
	0x74, 0x65, 0x64, 0x12, 0x1a, 0x0a, 0x08, 0x64, 0x69, 0x73, 0x61, 0x62, 0x6c, 0x65, 0x64, 0x18,
	0x06, 0x20, 0x01, 0x28, 0x08, 0x52, 0x08, 0x64, 0x69, 0x73, 0x61, 0x62, 0x6c, 0x65, 0x64, 0x12,
	0x37, 0x0a, 0x0b, 0x69, 0x6e, 0x74, 0x65, 0x67, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x07,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x15, 0x2e, 0x61, 0x70, 0x70, 0x73, 0x2e, 0x49, 0x6e, 0x74, 0x65,
	0x67, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x44, 0x61, 0x74, 0x61, 0x52, 0x0b, 0x69, 0x6e, 0x74,
	0x65, 0x67, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x46, 0x0a, 0x10, 0x69, 0x6e, 0x74, 0x65,
	0x67, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x64, 0x61, 0x74, 0x65, 0x18, 0x08, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x62, 0x75, 0x66, 0x2e, 0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x52, 0x10,
	0x69, 0x6e, 0x74, 0x65, 0x67, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x64, 0x61, 0x74, 0x65,
	0x12, 0x3c, 0x0a, 0x0b, 0x65, 0x64, 0x69, 0x74, 0x65, 0x64, 0x5f, 0x64, 0x61, 0x74, 0x65, 0x18,
	0x09, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d,
	0x70, 0x52, 0x0b, 0x65, 0x64, 0x69, 0x74, 0x65, 0x64, 0x5f, 0x64, 0x61, 0x74, 0x65, 0x42, 0x4c,
	0x0a, 0x18, 0x6f, 0x72, 0x67, 0x2e, 0x63, 0x79, 0x76, 0x65, 0x72, 0x73, 0x65, 0x2e, 0x64, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x73, 0x42, 0x0d, 0x41, 0x70, 0x70, 0x73,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x73, 0x50, 0x01, 0x5a, 0x1f, 0x67, 0x69, 0x74,
	0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x63, 0x79, 0x76, 0x65, 0x72, 0x73, 0x65, 0x2d,
	0x64, 0x65, 0x2f, 0x70, 0x2f, 0x67, 0x6f, 0x2f, 0x61, 0x70, 0x70, 0x73, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
})

var (
	file_apps_proto_rawDescOnce sync.Once
	file_apps_proto_rawDescData []byte
)

func file_apps_proto_rawDescGZIP() []byte {
	file_apps_proto_rawDescOnce.Do(func() {
		file_apps_proto_rawDescData = protoimpl.X.CompressGZIP(unsafe.Slice(unsafe.StringData(file_apps_proto_rawDesc), len(file_apps_proto_rawDesc)))
	})
	return file_apps_proto_rawDescData
}

var file_apps_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_apps_proto_goTypes = []any{
	(*App)(nil),                   // 0: apps.App
	(*IntegrationData)(nil),       // 1: apps.IntegrationData
	(*AppVersion)(nil),            // 2: apps.AppVersion
	(*user.User)(nil),             // 3: user.User
	(*timestamppb.Timestamp)(nil), // 4: google.protobuf.Timestamp
}
var file_apps_proto_depIdxs = []int32{
	3, // 0: apps.IntegrationData.user:type_name -> user.User
	1, // 1: apps.AppVersion.integration:type_name -> apps.IntegrationData
	4, // 2: apps.AppVersion.integration_date:type_name -> google.protobuf.Timestamp
	4, // 3: apps.AppVersion.edited_date:type_name -> google.protobuf.Timestamp
	4, // [4:4] is the sub-list for method output_type
	4, // [4:4] is the sub-list for method input_type
	4, // [4:4] is the sub-list for extension type_name
	4, // [4:4] is the sub-list for extension extendee
	0, // [0:4] is the sub-list for field type_name
}

func init() { file_apps_proto_init() }
func file_apps_proto_init() {
	if File_apps_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: unsafe.Slice(unsafe.StringData(file_apps_proto_rawDesc), len(file_apps_proto_rawDesc)),
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_apps_proto_goTypes,
		DependencyIndexes: file_apps_proto_depIdxs,
		MessageInfos:      file_apps_proto_msgTypes,
	}.Build()
	File_apps_proto = out.File
	file_apps_proto_goTypes = nil
	file_apps_proto_depIdxs = nil
}
