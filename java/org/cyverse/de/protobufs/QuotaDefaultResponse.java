// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: qms_plans.proto
// Protobuf Java Version: 4.31.1

package org.cyverse.de.protobufs;

/**
 * <pre>
 * *
 * A response type for quota default requests.
 * </pre>
 *
 * Protobuf type {@code qms.QuotaDefaultResponse}
 */
@com.google.protobuf.Generated
public final class QuotaDefaultResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:qms.QuotaDefaultResponse)
    QuotaDefaultResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
      /* patch= */ 1,
      /* suffix= */ "",
      QuotaDefaultResponse.class.getName());
  }
  // Use QuotaDefaultResponse.newBuilder() to construct.
  private QuotaDefaultResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private QuotaDefaultResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.cyverse.de.protobufs.QMSPlansProtobufs.internal_static_qms_QuotaDefaultResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.cyverse.de.protobufs.QMSPlansProtobufs.internal_static_qms_QuotaDefaultResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.cyverse.de.protobufs.QuotaDefaultResponse.class, org.cyverse.de.protobufs.QuotaDefaultResponse.Builder.class);
  }

  private int bitField0_;
  public static final int HEADER_FIELD_NUMBER = 1;
  private org.cyverse.de.protobufs.Header header_;
  /**
   * <pre>
   * Can contain telemetry data.
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
   * Can contain telemetry data.
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
   * Can contain telemetry data.
   * </pre>
   *
   * <code>.header.Header header = 1;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.HeaderOrBuilder getHeaderOrBuilder() {
    return header_ == null ? org.cyverse.de.protobufs.Header.getDefaultInstance() : header_;
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  private org.cyverse.de.protobufs.ServiceError error_;
  /**
   * <pre>
   * Contains error info from the request handler.
   * </pre>
   *
   * <code>.svcerror.ServiceError error = 2;</code>
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Contains error info from the request handler.
   * </pre>
   *
   * <code>.svcerror.ServiceError error = 2;</code>
   * @return The error.
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.ServiceError getError() {
    return error_ == null ? org.cyverse.de.protobufs.ServiceError.getDefaultInstance() : error_;
  }
  /**
   * <pre>
   * Contains error info from the request handler.
   * </pre>
   *
   * <code>.svcerror.ServiceError error = 2;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.ServiceErrorOrBuilder getErrorOrBuilder() {
    return error_ == null ? org.cyverse.de.protobufs.ServiceError.getDefaultInstance() : error_;
  }

  public static final int QUOTA_DEFAULT_FIELD_NUMBER = 3;
  private org.cyverse.de.protobufs.QuotaDefault quotaDefault_;
  /**
   * <pre>
   * The quota default object returned by the request handler.
   * </pre>
   *
   * <code>.qms.QuotaDefault quota_default = 3 [json_name = "quota_default"];</code>
   * @return Whether the quotaDefault field is set.
   */
  @java.lang.Override
  public boolean hasQuotaDefault() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The quota default object returned by the request handler.
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
   * The quota default object returned by the request handler.
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
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getError());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
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
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getError());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
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
    if (!(obj instanceof org.cyverse.de.protobufs.QuotaDefaultResponse)) {
      return super.equals(obj);
    }
    org.cyverse.de.protobufs.QuotaDefaultResponse other = (org.cyverse.de.protobufs.QuotaDefaultResponse) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (hasError() != other.hasError()) return false;
    if (hasError()) {
      if (!getError()
          .equals(other.getError())) return false;
    }
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
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    if (hasQuotaDefault()) {
      hash = (37 * hash) + QUOTA_DEFAULT_FIELD_NUMBER;
      hash = (53 * hash) + getQuotaDefault().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.cyverse.de.protobufs.QuotaDefaultResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.QuotaDefaultResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.QuotaDefaultResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.QuotaDefaultResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.QuotaDefaultResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.QuotaDefaultResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.QuotaDefaultResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.QuotaDefaultResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.cyverse.de.protobufs.QuotaDefaultResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.cyverse.de.protobufs.QuotaDefaultResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.QuotaDefaultResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.QuotaDefaultResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.cyverse.de.protobufs.QuotaDefaultResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * *
   * A response type for quota default requests.
   * </pre>
   *
   * Protobuf type {@code qms.QuotaDefaultResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qms.QuotaDefaultResponse)
      org.cyverse.de.protobufs.QuotaDefaultResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.cyverse.de.protobufs.QMSPlansProtobufs.internal_static_qms_QuotaDefaultResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.cyverse.de.protobufs.QMSPlansProtobufs.internal_static_qms_QuotaDefaultResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.cyverse.de.protobufs.QuotaDefaultResponse.class, org.cyverse.de.protobufs.QuotaDefaultResponse.Builder.class);
    }

    // Construct using org.cyverse.de.protobufs.QuotaDefaultResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        internalGetHeaderFieldBuilder();
        internalGetErrorFieldBuilder();
        internalGetQuotaDefaultFieldBuilder();
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
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
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
      return org.cyverse.de.protobufs.QMSPlansProtobufs.internal_static_qms_QuotaDefaultResponse_descriptor;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.QuotaDefaultResponse getDefaultInstanceForType() {
      return org.cyverse.de.protobufs.QuotaDefaultResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.QuotaDefaultResponse build() {
      org.cyverse.de.protobufs.QuotaDefaultResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.QuotaDefaultResponse buildPartial() {
      org.cyverse.de.protobufs.QuotaDefaultResponse result = new org.cyverse.de.protobufs.QuotaDefaultResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.cyverse.de.protobufs.QuotaDefaultResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.header_ = headerBuilder_ == null
            ? header_
            : headerBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.error_ = errorBuilder_ == null
            ? error_
            : errorBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.quotaDefault_ = quotaDefaultBuilder_ == null
            ? quotaDefault_
            : quotaDefaultBuilder_.build();
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.cyverse.de.protobufs.QuotaDefaultResponse) {
        return mergeFrom((org.cyverse.de.protobufs.QuotaDefaultResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.cyverse.de.protobufs.QuotaDefaultResponse other) {
      if (other == org.cyverse.de.protobufs.QuotaDefaultResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.hasError()) {
        mergeError(other.getError());
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
                  internalGetHeaderFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  internalGetErrorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  internalGetQuotaDefaultFieldBuilder().getBuilder(),
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
    private com.google.protobuf.SingleFieldBuilder<
        org.cyverse.de.protobufs.Header, org.cyverse.de.protobufs.Header.Builder, org.cyverse.de.protobufs.HeaderOrBuilder> headerBuilder_;
    /**
     * <pre>
     * Can contain telemetry data.
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
     * Can contain telemetry data.
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
     * Can contain telemetry data.
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
     * Can contain telemetry data.
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
     * Can contain telemetry data.
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
     * Can contain telemetry data.
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
     * Can contain telemetry data.
     * </pre>
     *
     * <code>.header.Header header = 1;</code>
     */
    public org.cyverse.de.protobufs.Header.Builder getHeaderBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return internalGetHeaderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Can contain telemetry data.
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
     * Can contain telemetry data.
     * </pre>
     *
     * <code>.header.Header header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.cyverse.de.protobufs.Header, org.cyverse.de.protobufs.Header.Builder, org.cyverse.de.protobufs.HeaderOrBuilder> 
        internalGetHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.cyverse.de.protobufs.Header, org.cyverse.de.protobufs.Header.Builder, org.cyverse.de.protobufs.HeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private org.cyverse.de.protobufs.ServiceError error_;
    private com.google.protobuf.SingleFieldBuilder<
        org.cyverse.de.protobufs.ServiceError, org.cyverse.de.protobufs.ServiceError.Builder, org.cyverse.de.protobufs.ServiceErrorOrBuilder> errorBuilder_;
    /**
     * <pre>
     * Contains error info from the request handler.
     * </pre>
     *
     * <code>.svcerror.ServiceError error = 2;</code>
     * @return Whether the error field is set.
     */
    public boolean hasError() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Contains error info from the request handler.
     * </pre>
     *
     * <code>.svcerror.ServiceError error = 2;</code>
     * @return The error.
     */
    public org.cyverse.de.protobufs.ServiceError getError() {
      if (errorBuilder_ == null) {
        return error_ == null ? org.cyverse.de.protobufs.ServiceError.getDefaultInstance() : error_;
      } else {
        return errorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Contains error info from the request handler.
     * </pre>
     *
     * <code>.svcerror.ServiceError error = 2;</code>
     */
    public Builder setError(org.cyverse.de.protobufs.ServiceError value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        error_ = value;
      } else {
        errorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains error info from the request handler.
     * </pre>
     *
     * <code>.svcerror.ServiceError error = 2;</code>
     */
    public Builder setError(
        org.cyverse.de.protobufs.ServiceError.Builder builderForValue) {
      if (errorBuilder_ == null) {
        error_ = builderForValue.build();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains error info from the request handler.
     * </pre>
     *
     * <code>.svcerror.ServiceError error = 2;</code>
     */
    public Builder mergeError(org.cyverse.de.protobufs.ServiceError value) {
      if (errorBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          error_ != null &&
          error_ != org.cyverse.de.protobufs.ServiceError.getDefaultInstance()) {
          getErrorBuilder().mergeFrom(value);
        } else {
          error_ = value;
        }
      } else {
        errorBuilder_.mergeFrom(value);
      }
      if (error_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Contains error info from the request handler.
     * </pre>
     *
     * <code>.svcerror.ServiceError error = 2;</code>
     */
    public Builder clearError() {
      bitField0_ = (bitField0_ & ~0x00000002);
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains error info from the request handler.
     * </pre>
     *
     * <code>.svcerror.ServiceError error = 2;</code>
     */
    public org.cyverse.de.protobufs.ServiceError.Builder getErrorBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return internalGetErrorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Contains error info from the request handler.
     * </pre>
     *
     * <code>.svcerror.ServiceError error = 2;</code>
     */
    public org.cyverse.de.protobufs.ServiceErrorOrBuilder getErrorOrBuilder() {
      if (errorBuilder_ != null) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        return error_ == null ?
            org.cyverse.de.protobufs.ServiceError.getDefaultInstance() : error_;
      }
    }
    /**
     * <pre>
     * Contains error info from the request handler.
     * </pre>
     *
     * <code>.svcerror.ServiceError error = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.cyverse.de.protobufs.ServiceError, org.cyverse.de.protobufs.ServiceError.Builder, org.cyverse.de.protobufs.ServiceErrorOrBuilder> 
        internalGetErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.cyverse.de.protobufs.ServiceError, org.cyverse.de.protobufs.ServiceError.Builder, org.cyverse.de.protobufs.ServiceErrorOrBuilder>(
                getError(),
                getParentForChildren(),
                isClean());
        error_ = null;
      }
      return errorBuilder_;
    }

    private org.cyverse.de.protobufs.QuotaDefault quotaDefault_;
    private com.google.protobuf.SingleFieldBuilder<
        org.cyverse.de.protobufs.QuotaDefault, org.cyverse.de.protobufs.QuotaDefault.Builder, org.cyverse.de.protobufs.QuotaDefaultOrBuilder> quotaDefaultBuilder_;
    /**
     * <pre>
     * The quota default object returned by the request handler.
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
     * The quota default object returned by the request handler.
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
     * The quota default object returned by the request handler.
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
     * The quota default object returned by the request handler.
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
     * The quota default object returned by the request handler.
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
     * The quota default object returned by the request handler.
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
     * The quota default object returned by the request handler.
     * </pre>
     *
     * <code>.qms.QuotaDefault quota_default = 3 [json_name = "quota_default"];</code>
     */
    public org.cyverse.de.protobufs.QuotaDefault.Builder getQuotaDefaultBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return internalGetQuotaDefaultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The quota default object returned by the request handler.
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
     * The quota default object returned by the request handler.
     * </pre>
     *
     * <code>.qms.QuotaDefault quota_default = 3 [json_name = "quota_default"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.cyverse.de.protobufs.QuotaDefault, org.cyverse.de.protobufs.QuotaDefault.Builder, org.cyverse.de.protobufs.QuotaDefaultOrBuilder> 
        internalGetQuotaDefaultFieldBuilder() {
      if (quotaDefaultBuilder_ == null) {
        quotaDefaultBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.cyverse.de.protobufs.QuotaDefault, org.cyverse.de.protobufs.QuotaDefault.Builder, org.cyverse.de.protobufs.QuotaDefaultOrBuilder>(
                getQuotaDefault(),
                getParentForChildren(),
                isClean());
        quotaDefault_ = null;
      }
      return quotaDefaultBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:qms.QuotaDefaultResponse)
  }

  // @@protoc_insertion_point(class_scope:qms.QuotaDefaultResponse)
  private static final org.cyverse.de.protobufs.QuotaDefaultResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.cyverse.de.protobufs.QuotaDefaultResponse();
  }

  public static org.cyverse.de.protobufs.QuotaDefaultResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuotaDefaultResponse>
      PARSER = new com.google.protobuf.AbstractParser<QuotaDefaultResponse>() {
    @java.lang.Override
    public QuotaDefaultResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QuotaDefaultResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuotaDefaultResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.cyverse.de.protobufs.QuotaDefaultResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

