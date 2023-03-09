// @generated
#[derive(validator::Validate)]
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct DnsLookup {
    #[prost(string, tag="1")]
    pub host: ::prost::alloc::string::String,
    #[prost(string, repeated, tag="2")]
    pub addresses: ::prost::alloc::vec::Vec<::prost::alloc::string::String>,
    #[prost(string, tag="3")]
    pub r#type: ::prost::alloc::string::String,
    #[prost(string, tag="4")]
    pub error: ::prost::alloc::string::String,
}
#[derive(validator::Validate)]
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct DnsCheckResult {
    #[prost(message, optional, tag="1")]
    pub header: ::core::option::Option<super::header::Header>,
    #[prost(message, optional, tag="2")]
    pub error: ::core::option::Option<super::svcerror::ServiceError>,
    #[prost(message, repeated, tag="3")]
    pub lookups: ::prost::alloc::vec::Vec<DnsLookup>,
    #[prost(string, tag="4")]
    pub node: ::prost::alloc::string::String,
    #[prost(string, tag="5")]
    pub date_sent: ::prost::alloc::string::String,
}
#[derive(Clone, Copy, Debug, PartialEq, Eq, Hash, PartialOrd, Ord, ::prost::Enumeration)]
#[repr(i32)]
pub enum LookupType {
    UnsetLookup = 0,
    InternalLookup = 1,
    ExternalLookup = 2,
}
impl LookupType {
    /// String value of the enum field names used in the ProtoBuf definition.
    ///
    /// The values are not transformed in any way and thus are considered stable
    /// (if the ProtoBuf definition does not change) and safe for programmatic use.
    pub fn as_str_name(&self) -> &'static str {
        match self {
            LookupType::UnsetLookup => "UNSET_LOOKUP",
            LookupType::InternalLookup => "INTERNAL_LOOKUP",
            LookupType::ExternalLookup => "EXTERNAL_LOOKUP",
        }
    }
    /// Creates an enum from field names used in the ProtoBuf definition.
    pub fn from_str_name(value: &str) -> ::core::option::Option<Self> {
        match value {
            "UNSET_LOOKUP" => Some(Self::UnsetLookup),
            "INTERNAL_LOOKUP" => Some(Self::InternalLookup),
            "EXTERNAL_LOOKUP" => Some(Self::ExternalLookup),
            _ => None,
        }
    }
}
#[derive(validator::Validate)]
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct Heartbeat {
    #[prost(message, optional, tag="1")]
    pub header: ::core::option::Option<super::header::Header>,
    #[prost(message, optional, tag="2")]
    pub error: ::core::option::Option<super::svcerror::ServiceError>,
    #[prost(string, tag="3")]
    pub node: ::prost::alloc::string::String,
    #[prost(string, tag="4")]
    pub date_sent: ::prost::alloc::string::String,
}
include!("monitoring.serde.rs");
// @@protoc_insertion_point(module)
