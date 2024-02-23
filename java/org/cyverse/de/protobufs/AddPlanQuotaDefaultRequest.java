// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_plans.proto

// Protobuf Java Version: 3.25.3
package org.cyverse.de.protobufs;

/**
 * <pre>
 **
 * A request to add a quota default to an existing plan.
 * </pre>
 *
 * Protobuf type {@code qms.AddPlanQuotaDefaultRequest}
 */
public final class AddPlanQuotaDefaultRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qms.AddPlanQuotaDefaultRequest)
    AddPlanQuotaDefaultRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddPlanQuotaDefaultRequest.newBuilder() to construct.
  private AddPlanQuotaDefaultRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddPlanQuotaDefaultRequest() {
    planName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddPlanQuotaDefaultRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.cyverse.de.protobufs.QMSPlansProtobufs.internal_static_qms_AddPlanQuotaDefaultRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.cyverse.de.protobufs.QMSPlansProtobufs.internal_static_qms_AddPlanQuotaDefaultRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest.class, org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest.Builder.class);
  }

  private int bitField0_;
  public static final int HEADER_FIELD_NUMBER = 1;
  private org.cyverse.de.protobufs.Header header_;
  /**
   * <pre>
   * Contains telemetry data.
   * </pre>
   *
   * <code>.header.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Contains telemetry data.
   * </pre>
   *
   * <code>.header.Header header = 1;</code>
   * @return The header.
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.Header getHeader() {
    return header_ == null ? org.cyverse.de.protobufs.Header.getDefaultInstance() : header_;
  }
  /**
   * <pre>
   * Contains telemetry data.
   * </pre>
   *
   * <code>.header.Header header = 1;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.HeaderOrBuilder getHeaderOrBuilder() {
    return header_ == null ? org.cyverse.de.protobufs.Header.getDefaultInstance() : header_;
  }

  public static final int PLAN_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object planName_ = "";
  /**
   * <pre>
   * The name of the plan to add the quota default to.
   * </pre>
   *
   * <code>string plan_name = 2 [json_name = "plan_name"];</code>
   * @return The planName.
   */
  @java.lang.Override
  public java.lang.String getPlanName() {
    java.lang.Object ref = planName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      planName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the plan to add the quota default to.
   * </pre>
   *
   * <code>string plan_name = 2 [json_name = "plan_name"];</code>
   * @return The bytes for planName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlanNameBytes() {
    java.lang.Object ref = planName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      planName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUOTA_DEFAULT_FIELD_NUMBER = 3;
  private org.cyverse.de.protobufs.QuotaDefault quotaDefault_;
  /**
   * <pre>
   * The quota default to add to the plan specified by the plan_name field.
   * </pre>
   *
   * <code>.qms.QuotaDefault quota_default = 3 [json_name = "quota_default"];</code>
   * @return Whether the quotaDefault field is set.
   */
  @java.lang.Override
  public boolean hasQuotaDefault() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The quota default to add to the plan specified by the plan_name field.
   * </pre>
   *
   * <code>.qms.QuotaDefault quota_default = 3 [json_name = "quota_default"];</code>
   * @return The quotaDefault.
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.QuotaDefault getQuotaDefault() {
    return quotaDefault_ == null ? org.cyverse.de.protobufs.QuotaDefault.getDefaultInstance() : quotaDefault_;
  }
  /**
   * <pre>
   * The quota default to add to the plan specified by the plan_name field.
   * </pre>
   *
   * <code>.qms.QuotaDefault quota_default = 3 [json_name = "quota_default"];</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.QuotaDefaultOrBuilder getQuotaDefaultOrBuilder() {
    return quotaDefault_ == null ? org.cyverse.de.protobufs.QuotaDefault.getDefaultInstance() : quotaDefault_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getHeader());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(planName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, planName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getQuotaDefault());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(planName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, planName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getQuotaDefault());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest)) {
      return super.equals(obj);
    }
    org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest other = (org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (!getPlanName()
        .equals(other.getPlanName())) return false;
    if (hasQuotaDefault() != other.hasQuotaDefault()) return false;
    if (hasQuotaDefault()) {
      if (!getQuotaDefault()
          .equals(other.getQuotaDefault())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    hash = (37 * hash) + PLAN_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPlanName().hashCode();
    if (hasQuotaDefault()) {
      hash = (37 * hash) + QUOTA_DEFAULT_FIELD_NUMBER;
      hash = (53 * hash) + getQuotaDefault().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   **
   * A request to add a quota default to an existing plan.
   * </pre>
   *
   * Protobuf type {@code qms.AddPlanQuotaDefaultRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qms.AddPlanQuotaDefaultRequest)
      org.cyverse.de.protobufs.AddPlanQuotaDefaultRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.cyverse.de.protobufs.QMSPlansProtobufs.internal_static_qms_AddPlanQuotaDefaultRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.cyverse.de.protobufs.QMSPlansProtobufs.internal_static_qms_AddPlanQuotaDefaultRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest.class, org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest.Builder.class);
    }

    // Construct using org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getHeaderFieldBuilder();
        getQuotaDefaultFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      header_ = null;
      if (headerBuilder_ != null) {
        headerBuilder_.dispose();
        headerBuilder_ = null;
      }
      planName_ = "";
      quotaDefault_ = null;
      if (quotaDefaultBuilder_ != null) {
        quotaDefaultBuilder_.dispose();
        quotaDefaultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.cyverse.de.protobufs.QMSPlansProtobufs.internal_static_qms_AddPlanQuotaDefaultRequest_descriptor;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest getDefaultInstanceForType() {
      return org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest build() {
      org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest buildPartial() {
      org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest result = new org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.header_ = headerBuilder_ == null
            ? header_
            : headerBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.planName_ = planName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.quotaDefault_ = quotaDefaultBuilder_ == null
            ? quotaDefault_
            : quotaDefaultBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest) {
        return mergeFrom((org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest other) {
      if (other == org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (!other.getPlanName().isEmpty()) {
        planName_ = other.planName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasQuotaDefault()) {
        mergeQuotaDefault(other.getQuotaDefault());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getHeaderFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              planName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getQuotaDefaultFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private org.cyverse.de.protobufs.Header header_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.cyverse.de.protobufs.Header, org.cyverse.de.protobufs.Header.Builder, org.cyverse.de.protobufs.HeaderOrBuilder> headerBuilder_;
    /**
     * <pre>
     * Contains telemetry data.
     * </pre>
     *
     * <code>.header.Header header = 1;</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Contains telemetry data.
     * </pre>
     *
     * <code>.header.Header header = 1;</code>
     * @return The header.
     */
    public org.cyverse.de.protobufs.Header getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? org.cyverse.de.protobufs.Header.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Contains telemetry data.
     * </pre>
     *
     * <code>.header.Header header = 1;</code>
     */
    public Builder setHeader(org.cyverse.de.protobufs.Header value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
      } else {
        headerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains telemetry data.
     * </pre>
     *
     * <code>.header.Header header = 1;</code>
     */
    public Builder setHeader(
        org.cyverse.de.protobufs.Header.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains telemetry data.
     * </pre>
     *
     * <code>.header.Header header = 1;</code>
     */
    public Builder mergeHeader(org.cyverse.de.protobufs.Header value) {
      if (headerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          header_ != null &&
          header_ != org.cyverse.de.protobufs.Header.getDefaultInstance()) {
          getHeaderBuilder().mergeFrom(value);
        } else {
          header_ = value;
        }
      } else {
        headerBuilder_.mergeFrom(value);
      }
      if (header_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Contains telemetry data.
     * </pre>
     *
     * <code>.header.Header header = 1;</code>
     */
    public Builder clearHeader() {
      bitField0_ = (bitField0_ & ~0x00000001);
      header_ = null;
      if (headerBuilder_ != null) {
        headerBuilder_.dispose();
        headerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains telemetry data.
     * </pre>
     *
     * <code>.header.Header header = 1;</code>
     */
    public org.cyverse.de.protobufs.Header.Builder getHeaderBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Contains telemetry data.
     * </pre>
     *
     * <code>.header.Header header = 1;</code>
     */
    public org.cyverse.de.protobufs.HeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            org.cyverse.de.protobufs.Header.getDefaultInstance() : header_;
      }
    }
    /**
     * <pre>
     * Contains telemetry data.
     * </pre>
     *
     * <code>.header.Header header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.cyverse.de.protobufs.Header, org.cyverse.de.protobufs.Header.Builder, org.cyverse.de.protobufs.HeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.cyverse.de.protobufs.Header, org.cyverse.de.protobufs.Header.Builder, org.cyverse.de.protobufs.HeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private java.lang.Object planName_ = "";
    /**
     * <pre>
     * The name of the plan to add the quota default to.
     * </pre>
     *
     * <code>string plan_name = 2 [json_name = "plan_name"];</code>
     * @return The planName.
     */
    public java.lang.String getPlanName() {
      java.lang.Object ref = planName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        planName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the plan to add the quota default to.
     * </pre>
     *
     * <code>string plan_name = 2 [json_name = "plan_name"];</code>
     * @return The bytes for planName.
     */
    public com.google.protobuf.ByteString
        getPlanNameBytes() {
      java.lang.Object ref = planName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        planName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the plan to add the quota default to.
     * </pre>
     *
     * <code>string plan_name = 2 [json_name = "plan_name"];</code>
     * @param value The planName to set.
     * @return This builder for chaining.
     */
    public Builder setPlanName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      planName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the plan to add the quota default to.
     * </pre>
     *
     * <code>string plan_name = 2 [json_name = "plan_name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPlanName() {
      planName_ = getDefaultInstance().getPlanName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the plan to add the quota default to.
     * </pre>
     *
     * <code>string plan_name = 2 [json_name = "plan_name"];</code>
     * @param value The bytes for planName to set.
     * @return This builder for chaining.
     */
    public Builder setPlanNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      planName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private org.cyverse.de.protobufs.QuotaDefault quotaDefault_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.cyverse.de.protobufs.QuotaDefault, org.cyverse.de.protobufs.QuotaDefault.Builder, org.cyverse.de.protobufs.QuotaDefaultOrBuilder> quotaDefaultBuilder_;
    /**
     * <pre>
     * The quota default to add to the plan specified by the plan_name field.
     * </pre>
     *
     * <code>.qms.QuotaDefault quota_default = 3 [json_name = "quota_default"];</code>
     * @return Whether the quotaDefault field is set.
     */
    public boolean hasQuotaDefault() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The quota default to add to the plan specified by the plan_name field.
     * </pre>
     *
     * <code>.qms.QuotaDefault quota_default = 3 [json_name = "quota_default"];</code>
     * @return The quotaDefault.
     */
    public org.cyverse.de.protobufs.QuotaDefault getQuotaDefault() {
      if (quotaDefaultBuilder_ == null) {
        return quotaDefault_ == null ? org.cyverse.de.protobufs.QuotaDefault.getDefaultInstance() : quotaDefault_;
      } else {
        return quotaDefaultBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The quota default to add to the plan specified by the plan_name field.
     * </pre>
     *
     * <code>.qms.QuotaDefault quota_default = 3 [json_name = "quota_default"];</code>
     */
    public Builder setQuotaDefault(org.cyverse.de.protobufs.QuotaDefault value) {
      if (quotaDefaultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        quotaDefault_ = value;
      } else {
        quotaDefaultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The quota default to add to the plan specified by the plan_name field.
     * </pre>
     *
     * <code>.qms.QuotaDefault quota_default = 3 [json_name = "quota_default"];</code>
     */
    public Builder setQuotaDefault(
        org.cyverse.de.protobufs.QuotaDefault.Builder builderForValue) {
      if (quotaDefaultBuilder_ == null) {
        quotaDefault_ = builderForValue.build();
      } else {
        quotaDefaultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The quota default to add to the plan specified by the plan_name field.
     * </pre>
     *
     * <code>.qms.QuotaDefault quota_default = 3 [json_name = "quota_default"];</code>
     */
    public Builder mergeQuotaDefault(org.cyverse.de.protobufs.QuotaDefault value) {
      if (quotaDefaultBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          quotaDefault_ != null &&
          quotaDefault_ != org.cyverse.de.protobufs.QuotaDefault.getDefaultInstance()) {
          getQuotaDefaultBuilder().mergeFrom(value);
        } else {
          quotaDefault_ = value;
        }
      } else {
        quotaDefaultBuilder_.mergeFrom(value);
      }
      if (quotaDefault_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The quota default to add to the plan specified by the plan_name field.
     * </pre>
     *
     * <code>.qms.QuotaDefault quota_default = 3 [json_name = "quota_default"];</code>
     */
    public Builder clearQuotaDefault() {
      bitField0_ = (bitField0_ & ~0x00000004);
      quotaDefault_ = null;
      if (quotaDefaultBuilder_ != null) {
        quotaDefaultBuilder_.dispose();
        quotaDefaultBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The quota default to add to the plan specified by the plan_name field.
     * </pre>
     *
     * <code>.qms.QuotaDefault quota_default = 3 [json_name = "quota_default"];</code>
     */
    public org.cyverse.de.protobufs.QuotaDefault.Builder getQuotaDefaultBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getQuotaDefaultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The quota default to add to the plan specified by the plan_name field.
     * </pre>
     *
     * <code>.qms.QuotaDefault quota_default = 3 [json_name = "quota_default"];</code>
     */
    public org.cyverse.de.protobufs.QuotaDefaultOrBuilder getQuotaDefaultOrBuilder() {
      if (quotaDefaultBuilder_ != null) {
        return quotaDefaultBuilder_.getMessageOrBuilder();
      } else {
        return quotaDefault_ == null ?
            org.cyverse.de.protobufs.QuotaDefault.getDefaultInstance() : quotaDefault_;
      }
    }
    /**
     * <pre>
     * The quota default to add to the plan specified by the plan_name field.
     * </pre>
     *
     * <code>.qms.QuotaDefault quota_default = 3 [json_name = "quota_default"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.cyverse.de.protobufs.QuotaDefault, org.cyverse.de.protobufs.QuotaDefault.Builder, org.cyverse.de.protobufs.QuotaDefaultOrBuilder> 
        getQuotaDefaultFieldBuilder() {
      if (quotaDefaultBuilder_ == null) {
        quotaDefaultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.cyverse.de.protobufs.QuotaDefault, org.cyverse.de.protobufs.QuotaDefault.Builder, org.cyverse.de.protobufs.QuotaDefaultOrBuilder>(
                getQuotaDefault(),
                getParentForChildren(),
                isClean());
        quotaDefault_ = null;
      }
      return quotaDefaultBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:qms.AddPlanQuotaDefaultRequest)
  }

  // @@protoc_insertion_point(class_scope:qms.AddPlanQuotaDefaultRequest)
  private static final org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest();
  }

  public static org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddPlanQuotaDefaultRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddPlanQuotaDefaultRequest>() {
    @java.lang.Override
    public AddPlanQuotaDefaultRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AddPlanQuotaDefaultRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddPlanQuotaDefaultRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.cyverse.de.protobufs.AddPlanQuotaDefaultRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

