# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [qms_overages.proto](#qms_overages-proto)
    - [IsOverage](#-IsOverage)
    - [Overage](#-Overage)
    - [OverageList](#-OverageList)
    - [OverageResponse](#-OverageResponse)
  
- [qms_plans.proto](#qms_plans-proto)
    - [AddPlanQuotaDefaultRequest](#-AddPlanQuotaDefaultRequest)
    - [AddPlanRequest](#-AddPlanRequest)
    - [Plan](#-Plan)
    - [PlanList](#-PlanList)
    - [PlanRequest](#-PlanRequest)
    - [PlanResponse](#-PlanResponse)
    - [QuotaDefault](#-QuotaDefault)
    - [QuotaDefaultList](#-QuotaDefaultList)
    - [QuotaDefaultResponse](#-QuotaDefaultResponse)
  
- [qms_quotas.proto](#qms_quotas-proto)
    - [AddQuotaRequest](#-AddQuotaRequest)
    - [Quota](#-Quota)
    - [QuotaList](#-QuotaList)
    - [QuotaResponse](#-QuotaResponse)
  
- [qms_requests.proto](#qms_requests-proto)
    - [AddUsage](#-AddUsage)
    - [AllUserOveragesRequest](#-AllUserOveragesRequest)
    - [GetUsages](#-GetUsages)
    - [IsOverageRequest](#-IsOverageRequest)
    - [NoParamsRequest](#-NoParamsRequest)
    - [RequestByUserID](#-RequestByUserID)
    - [RequestByUsername](#-RequestByUsername)
    - [UserResourceOveragesRequest](#-UserResourceOveragesRequest)
  
- [qms_resource_types.proto](#qms_resource_types-proto)
    - [ResourceType](#-ResourceType)
    - [ResourceTypeList](#-ResourceTypeList)
    - [ResourceTypeResponse](#-ResourceTypeResponse)
  
- [qms_updates.proto](#qms_updates-proto)
    - [AddUpdateRequest](#-AddUpdateRequest)
    - [AddUpdateResponse](#-AddUpdateResponse)
    - [Update](#-Update)
    - [UpdateListRequest](#-UpdateListRequest)
    - [UpdateListResponse](#-UpdateListResponse)
    - [UpdateOperation](#-UpdateOperation)
  
- [qms_usages.proto](#qms_usages-proto)
    - [Usage](#-Usage)
    - [UsageList](#-UsageList)
    - [UsageResponse](#-UsageResponse)
  
- [qms_user_plans.proto](#qms_user_plans-proto)
    - [ChangeUserPlanRequest](#-ChangeUserPlanRequest)
    - [UserPlan](#-UserPlan)
    - [UserPlanList](#-UserPlanList)
    - [UserPlanResponse](#-UserPlanResponse)
  
- [qms_users.proto](#qms_users-proto)
    - [AddUserRequest](#-AddUserRequest)
    - [AddUserResponse](#-AddUserResponse)
    - [QMSUser](#-QMSUser)
    - [QMSUserList](#-QMSUserList)
    - [QMSUserResponse](#-QMSUserResponse)
  
- [Scalar Value Types](#scalar-value-types)



<a name="qms_overages-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## qms_overages.proto



<a name="-IsOverage"></a>

### IsOverage



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| is_overage | [bool](#bool) |  |  |






<a name="-Overage"></a>

### Overage



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| resource_name | [string](#string) |  |  |
| quota | [float](#float) |  |  |
| usage | [float](#float) |  |  |






<a name="-OverageList"></a>

### OverageList



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| overages | [Overage](#Overage) | repeated |  |






<a name="-OverageResponse"></a>

### OverageResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| overage | [Overage](#Overage) |  |  |





 

 

 

 



<a name="qms_plans-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## qms_plans.proto



<a name="-AddPlanQuotaDefaultRequest"></a>

### AddPlanQuotaDefaultRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| plan_name | [string](#string) |  |  |
| quota_default | [QuotaDefault](#QuotaDefault) |  |  |






<a name="-AddPlanRequest"></a>

### AddPlanRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| plan | [Plan](#Plan) |  |  |






<a name="-Plan"></a>

### Plan



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uuid | [string](#string) |  |  |
| name | [string](#string) |  |  |
| description | [string](#string) |  |  |
| plan_quota_defaults | [QuotaDefault](#QuotaDefault) | repeated |  |






<a name="-PlanList"></a>

### PlanList



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| plans | [Plan](#Plan) | repeated |  |






<a name="-PlanRequest"></a>

### PlanRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| plan_id | [string](#string) |  |  |






<a name="-PlanResponse"></a>

### PlanResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| plan | [Plan](#Plan) |  |  |






<a name="-QuotaDefault"></a>

### QuotaDefault



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uuid | [string](#string) |  |  |
| quota_value | [float](#float) |  |  |
| resource_type | [ResourceType](#ResourceType) |  |  |






<a name="-QuotaDefaultList"></a>

### QuotaDefaultList



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| quota_defaults | [QuotaDefault](#QuotaDefault) | repeated |  |






<a name="-QuotaDefaultResponse"></a>

### QuotaDefaultResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| quota_default | [QuotaDefault](#QuotaDefault) |  |  |





 

 

 

 



<a name="qms_quotas-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## qms_quotas.proto



<a name="-AddQuotaRequest"></a>

### AddQuotaRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| quota | [Quota](#Quota) |  |  |






<a name="-Quota"></a>

### Quota



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uuid | [string](#string) |  |  |
| quota | [float](#float) |  |  |
| resource_type | [ResourceType](#ResourceType) |  |  |
| CreatedBy | [string](#string) |  |  |
| CreatedAt | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  |  |
| LastModifiedBy | [string](#string) |  |  |
| LastModifiedAt | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  |  |
| user_plan_id | [string](#string) |  |  |






<a name="-QuotaList"></a>

### QuotaList



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| quotas | [Quota](#Quota) | repeated |  |






<a name="-QuotaResponse"></a>

### QuotaResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| quota | [Quota](#Quota) |  |  |





 

 

 

 



<a name="qms_requests-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## qms_requests.proto



<a name="-AddUsage"></a>

### AddUsage



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| username | [string](#string) |  |  |
| resource_name | [string](#string) |  |  |
| update_type | [string](#string) |  | Possible values are defined in the database, so we can&#39;t use an enum here |
| usage_value | [double](#double) |  |  |
| resource_unit | [string](#string) |  |  |






<a name="-AllUserOveragesRequest"></a>

### AllUserOveragesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| username | [string](#string) |  |  |






<a name="-GetUsages"></a>

### GetUsages



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| username | [string](#string) |  |  |






<a name="-IsOverageRequest"></a>

### IsOverageRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| username | [string](#string) |  |  |
| resource_name | [string](#string) |  |  |






<a name="-NoParamsRequest"></a>

### NoParamsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |






<a name="-RequestByUserID"></a>

### RequestByUserID



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| user_id | [string](#string) |  |  |






<a name="-RequestByUsername"></a>

### RequestByUsername



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| username | [string](#string) |  |  |






<a name="-UserResourceOveragesRequest"></a>

### UserResourceOveragesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| username | [string](#string) |  |  |
| resource_name | [string](#string) |  |  |





 

 

 

 



<a name="qms_resource_types-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## qms_resource_types.proto



<a name="-ResourceType"></a>

### ResourceType



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uuid | [string](#string) |  |  |
| name | [string](#string) |  |  |
| unit | [string](#string) |  |  |






<a name="-ResourceTypeList"></a>

### ResourceTypeList



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| resource_types | [ResourceType](#ResourceType) | repeated |  |






<a name="-ResourceTypeResponse"></a>

### ResourceTypeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| resource_type | [ResourceType](#ResourceType) |  |  |





 

 

 

 



<a name="qms_updates-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## qms_updates.proto



<a name="-AddUpdateRequest"></a>

### AddUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| update | [Update](#Update) |  |  |






<a name="-AddUpdateResponse"></a>

### AddUpdateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| update | [Update](#Update) |  |  |






<a name="-Update"></a>

### Update



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uuid | [string](#string) |  |  |
| value_type | [string](#string) |  |  |
| value | [double](#double) |  |  |
| effective_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  |  |
| operation | [UpdateOperation](#UpdateOperation) |  |  |
| resource_type | [ResourceType](#ResourceType) |  |  |
| user | [QMSUser](#QMSUser) |  |  |






<a name="-UpdateListRequest"></a>

### UpdateListRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| user | [QMSUser](#QMSUser) |  |  |






<a name="-UpdateListResponse"></a>

### UpdateListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| updates | [Update](#Update) | repeated |  |






<a name="-UpdateOperation"></a>

### UpdateOperation



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uuid | [string](#string) |  |  |
| name | [string](#string) |  |  |





 

 

 

 



<a name="qms_usages-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## qms_usages.proto



<a name="-Usage"></a>

### Usage



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uuid | [string](#string) |  |  |
| usage | [double](#double) |  |  |
| user_plan_id | [string](#string) |  |  |
| resource_type | [ResourceType](#ResourceType) |  |  |
| CreatedBy | [string](#string) |  |  |
| CreatedAt | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  |  |
| LastModifiedBy | [string](#string) |  |  |
| LastModifiedAt | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  |  |






<a name="-UsageList"></a>

### UsageList



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| usages | [Usage](#Usage) | repeated |  |






<a name="-UsageResponse"></a>

### UsageResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| usage | [Usage](#Usage) |  |  |





 

 

 

 



<a name="qms_user_plans-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## qms_user_plans.proto



<a name="-ChangeUserPlanRequest"></a>

### ChangeUserPlanRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| username | [string](#string) |  |  |
| uuid | [string](#string) |  |  |
| name | [string](#string) |  |  |






<a name="-UserPlan"></a>

### UserPlan



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uuid | [string](#string) |  |  |
| effective_start_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  |  |
| effective_end_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  |  |
| user | [QMSUser](#QMSUser) |  |  |
| plan | [Plan](#Plan) |  |  |
| quotas | [Quota](#Quota) | repeated |  |
| usages | [Usage](#Usage) | repeated |  |






<a name="-UserPlanList"></a>

### UserPlanList



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| user_plans | [UserPlan](#UserPlan) | repeated |  |






<a name="-UserPlanResponse"></a>

### UserPlanResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| user_plan | [UserPlan](#UserPlan) |  |  |





 

 

 

 



<a name="qms_users-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## qms_users.proto



<a name="-AddUserRequest"></a>

### AddUserRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| username | [string](#string) |  |  |
| plan_name | [string](#string) |  |  |






<a name="-AddUserResponse"></a>

### AddUserResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| uuid | [string](#string) |  |  |
| username | [string](#string) |  |  |
| plan_name | [string](#string) |  |  |
| plan_uuid | [string](#string) |  |  |






<a name="-QMSUser"></a>

### QMSUser



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uuid | [string](#string) |  |  |
| username | [string](#string) |  |  |






<a name="-QMSUserList"></a>

### QMSUserList



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| users | [QMSUser](#QMSUser) | repeated |  |






<a name="-QMSUserResponse"></a>

### QMSUserResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [Header](#Header) |  |  |
| error | [ServiceError](#ServiceError) |  |  |
| user | [QMSUser](#QMSUser) |  |  |





 

 

 

 



## Scalar Value Types

| .proto Type | Notes | C++ | Java | Python | Go | C# | PHP | Ruby |
| ----------- | ----- | --- | ---- | ------ | -- | -- | --- | ---- |
| <a name="double" /> double |  | double | double | float | float64 | double | float | Float |
| <a name="float" /> float |  | float | float | float | float32 | float | float | Float |
| <a name="int32" /> int32 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint32 instead. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="int64" /> int64 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint64 instead. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="uint32" /> uint32 | Uses variable-length encoding. | uint32 | int | int/long | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="uint64" /> uint64 | Uses variable-length encoding. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum or Fixnum (as required) |
| <a name="sint32" /> sint32 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int32s. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sint64" /> sint64 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int64s. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="fixed32" /> fixed32 | Always four bytes. More efficient than uint32 if values are often greater than 2^28. | uint32 | int | int | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="fixed64" /> fixed64 | Always eight bytes. More efficient than uint64 if values are often greater than 2^56. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum |
| <a name="sfixed32" /> sfixed32 | Always four bytes. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sfixed64" /> sfixed64 | Always eight bytes. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="bool" /> bool |  | bool | boolean | boolean | bool | bool | boolean | TrueClass/FalseClass |
| <a name="string" /> string | A string must always contain UTF-8 encoded or 7-bit ASCII text. | string | String | str/unicode | string | string | string | String (UTF-8) |
| <a name="bytes" /> bytes | May contain any arbitrary sequence of bytes. | string | ByteString | str | []byte | ByteString | string | String (ASCII-8BIT) |
