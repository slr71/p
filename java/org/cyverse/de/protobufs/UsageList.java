// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_usages.proto

package org.cyverse.de.protobufs;

/**
 * <pre>
 **
 * A response to a request for usage info containing multiple usage records.
 * </pre>
 *
 * Protobuf type {@code qms.UsageList}
 */
public final class UsageList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qms.UsageList)
    UsageListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UsageList.newBuilder() to construct.
  private UsageList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UsageList() {
    usages_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UsageList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.cyverse.de.protobufs.QMSUsageProtobufs.internal_static_qms_UsageList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.cyverse.de.protobufs.QMSUsageProtobufs.internal_static_qms_UsageList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.cyverse.de.protobufs.UsageList.class, org.cyverse.de.protobufs.UsageList.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private org.cyverse.de.protobufs.Header header_;
  /**
   * <pre>
   * Contains telemetry information
   * </pre>
   *
   * <code>.header.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <pre>
   * Contains telemetry information
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
   * Contains telemetry information
   * </pre>
   *
   * <code>.header.Header header = 1;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.HeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  private org.cyverse.de.protobufs.ServiceError error_;
  /**
   * <pre>
   * Error information returned by the request handler.
   * </pre>
   *
   * <code>.svcerror.ServiceError error = 2;</code>
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return error_ != null;
  }
  /**
   * <pre>
   * Error information returned by the request handler.
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
   * Error information returned by the request handler.
   * </pre>
   *
   * <code>.svcerror.ServiceError error = 2;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.ServiceErrorOrBuilder getErrorOrBuilder() {
    return getError();
  }

  public static final int USAGES_FIELD_NUMBER = 3;
  private java.util.List<org.cyverse.de.protobufs.Usage> usages_;
  /**
   * <pre>
   * A list of usages returned by the request handler.
   * </pre>
   *
   * <code>repeated .qms.Usage usages = 3;</code>
   */
  @java.lang.Override
  public java.util.List<org.cyverse.de.protobufs.Usage> getUsagesList() {
    return usages_;
  }
  /**
   * <pre>
   * A list of usages returned by the request handler.
   * </pre>
   *
   * <code>repeated .qms.Usage usages = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.cyverse.de.protobufs.UsageOrBuilder> 
      getUsagesOrBuilderList() {
    return usages_;
  }
  /**
   * <pre>
   * A list of usages returned by the request handler.
   * </pre>
   *
   * <code>repeated .qms.Usage usages = 3;</code>
   */
  @java.lang.Override
  public int getUsagesCount() {
    return usages_.size();
  }
  /**
   * <pre>
   * A list of usages returned by the request handler.
   * </pre>
   *
   * <code>repeated .qms.Usage usages = 3;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.Usage getUsages(int index) {
    return usages_.get(index);
  }
  /**
   * <pre>
   * A list of usages returned by the request handler.
   * </pre>
   *
   * <code>repeated .qms.Usage usages = 3;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.UsageOrBuilder getUsagesOrBuilder(
      int index) {
    return usages_.get(index);
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
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (error_ != null) {
      output.writeMessage(2, getError());
    }
    for (int i = 0; i < usages_.size(); i++) {
      output.writeMessage(3, usages_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    if (error_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getError());
    }
    for (int i = 0; i < usages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, usages_.get(i));
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
    if (!(obj instanceof org.cyverse.de.protobufs.UsageList)) {
      return super.equals(obj);
    }
    org.cyverse.de.protobufs.UsageList other = (org.cyverse.de.protobufs.UsageList) obj;

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
    if (!getUsagesList()
        .equals(other.getUsagesList())) return false;
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
    if (getUsagesCount() > 0) {
      hash = (37 * hash) + USAGES_FIELD_NUMBER;
      hash = (53 * hash) + getUsagesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.cyverse.de.protobufs.UsageList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.UsageList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.UsageList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.UsageList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.UsageList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.UsageList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.UsageList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.UsageList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.UsageList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.UsageList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.UsageList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.UsageList parseFrom(
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
  public static Builder newBuilder(org.cyverse.de.protobufs.UsageList prototype) {
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
   * A response to a request for usage info containing multiple usage records.
   * </pre>
   *
   * Protobuf type {@code qms.UsageList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qms.UsageList)
      org.cyverse.de.protobufs.UsageListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.cyverse.de.protobufs.QMSUsageProtobufs.internal_static_qms_UsageList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.cyverse.de.protobufs.QMSUsageProtobufs.internal_static_qms_UsageList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.cyverse.de.protobufs.UsageList.class, org.cyverse.de.protobufs.UsageList.Builder.class);
    }

    // Construct using org.cyverse.de.protobufs.UsageList.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      if (errorBuilder_ == null) {
        error_ = null;
      } else {
        error_ = null;
        errorBuilder_ = null;
      }
      if (usagesBuilder_ == null) {
        usages_ = java.util.Collections.emptyList();
      } else {
        usages_ = null;
        usagesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.cyverse.de.protobufs.QMSUsageProtobufs.internal_static_qms_UsageList_descriptor;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.UsageList getDefaultInstanceForType() {
      return org.cyverse.de.protobufs.UsageList.getDefaultInstance();
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.UsageList build() {
      org.cyverse.de.protobufs.UsageList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.UsageList buildPartial() {
      org.cyverse.de.protobufs.UsageList result = new org.cyverse.de.protobufs.UsageList(this);
      int from_bitField0_ = bitField0_;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (errorBuilder_ == null) {
        result.error_ = error_;
      } else {
        result.error_ = errorBuilder_.build();
      }
      if (usagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          usages_ = java.util.Collections.unmodifiableList(usages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.usages_ = usages_;
      } else {
        result.usages_ = usagesBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof org.cyverse.de.protobufs.UsageList) {
        return mergeFrom((org.cyverse.de.protobufs.UsageList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.cyverse.de.protobufs.UsageList other) {
      if (other == org.cyverse.de.protobufs.UsageList.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.hasError()) {
        mergeError(other.getError());
      }
      if (usagesBuilder_ == null) {
        if (!other.usages_.isEmpty()) {
          if (usages_.isEmpty()) {
            usages_ = other.usages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUsagesIsMutable();
            usages_.addAll(other.usages_);
          }
          onChanged();
        }
      } else {
        if (!other.usages_.isEmpty()) {
          if (usagesBuilder_.isEmpty()) {
            usagesBuilder_.dispose();
            usagesBuilder_ = null;
            usages_ = other.usages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            usagesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUsagesFieldBuilder() : null;
          } else {
            usagesBuilder_.addAllMessages(other.usages_);
          }
        }
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

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getErrorFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              org.cyverse.de.protobufs.Usage m =
                  input.readMessage(
                      org.cyverse.de.protobufs.Usage.parser(),
                      extensionRegistry);
              if (usagesBuilder_ == null) {
                ensureUsagesIsMutable();
                usages_.add(m);
              } else {
                usagesBuilder_.addMessage(m);
              }
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
     * Contains telemetry information
     * </pre>
     *
     * <code>.header.Header header = 1;</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <pre>
     * Contains telemetry information
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
     * Contains telemetry information
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
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Contains telemetry information
     * </pre>
     *
     * <code>.header.Header header = 1;</code>
     */
    public Builder setHeader(
        org.cyverse.de.protobufs.Header.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Contains telemetry information
     * </pre>
     *
     * <code>.header.Header header = 1;</code>
     */
    public Builder mergeHeader(org.cyverse.de.protobufs.Header value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            org.cyverse.de.protobufs.Header.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Contains telemetry information
     * </pre>
     *
     * <code>.header.Header header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Contains telemetry information
     * </pre>
     *
     * <code>.header.Header header = 1;</code>
     */
    public org.cyverse.de.protobufs.Header.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Contains telemetry information
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
     * Contains telemetry information
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

    private org.cyverse.de.protobufs.ServiceError error_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.cyverse.de.protobufs.ServiceError, org.cyverse.de.protobufs.ServiceError.Builder, org.cyverse.de.protobufs.ServiceErrorOrBuilder> errorBuilder_;
    /**
     * <pre>
     * Error information returned by the request handler.
     * </pre>
     *
     * <code>.svcerror.ServiceError error = 2;</code>
     * @return Whether the error field is set.
     */
    public boolean hasError() {
      return errorBuilder_ != null || error_ != null;
    }
    /**
     * <pre>
     * Error information returned by the request handler.
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
     * Error information returned by the request handler.
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
        onChanged();
      } else {
        errorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Error information returned by the request handler.
     * </pre>
     *
     * <code>.svcerror.ServiceError error = 2;</code>
     */
    public Builder setError(
        org.cyverse.de.protobufs.ServiceError.Builder builderForValue) {
      if (errorBuilder_ == null) {
        error_ = builderForValue.build();
        onChanged();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Error information returned by the request handler.
     * </pre>
     *
     * <code>.svcerror.ServiceError error = 2;</code>
     */
    public Builder mergeError(org.cyverse.de.protobufs.ServiceError value) {
      if (errorBuilder_ == null) {
        if (error_ != null) {
          error_ =
            org.cyverse.de.protobufs.ServiceError.newBuilder(error_).mergeFrom(value).buildPartial();
        } else {
          error_ = value;
        }
        onChanged();
      } else {
        errorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Error information returned by the request handler.
     * </pre>
     *
     * <code>.svcerror.ServiceError error = 2;</code>
     */
    public Builder clearError() {
      if (errorBuilder_ == null) {
        error_ = null;
        onChanged();
      } else {
        error_ = null;
        errorBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Error information returned by the request handler.
     * </pre>
     *
     * <code>.svcerror.ServiceError error = 2;</code>
     */
    public org.cyverse.de.protobufs.ServiceError.Builder getErrorBuilder() {
      
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Error information returned by the request handler.
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
     * Error information returned by the request handler.
     * </pre>
     *
     * <code>.svcerror.ServiceError error = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.cyverse.de.protobufs.ServiceError, org.cyverse.de.protobufs.ServiceError.Builder, org.cyverse.de.protobufs.ServiceErrorOrBuilder> 
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.cyverse.de.protobufs.ServiceError, org.cyverse.de.protobufs.ServiceError.Builder, org.cyverse.de.protobufs.ServiceErrorOrBuilder>(
                getError(),
                getParentForChildren(),
                isClean());
        error_ = null;
      }
      return errorBuilder_;
    }

    private java.util.List<org.cyverse.de.protobufs.Usage> usages_ =
      java.util.Collections.emptyList();
    private void ensureUsagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        usages_ = new java.util.ArrayList<org.cyverse.de.protobufs.Usage>(usages_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.cyverse.de.protobufs.Usage, org.cyverse.de.protobufs.Usage.Builder, org.cyverse.de.protobufs.UsageOrBuilder> usagesBuilder_;

    /**
     * <pre>
     * A list of usages returned by the request handler.
     * </pre>
     *
     * <code>repeated .qms.Usage usages = 3;</code>
     */
    public java.util.List<org.cyverse.de.protobufs.Usage> getUsagesList() {
      if (usagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(usages_);
      } else {
        return usagesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of usages returned by the request handler.
     * </pre>
     *
     * <code>repeated .qms.Usage usages = 3;</code>
     */
    public int getUsagesCount() {
      if (usagesBuilder_ == null) {
        return usages_.size();
      } else {
        return usagesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of usages returned by the request handler.
     * </pre>
     *
     * <code>repeated .qms.Usage usages = 3;</code>
     */
    public org.cyverse.de.protobufs.Usage getUsages(int index) {
      if (usagesBuilder_ == null) {
        return usages_.get(index);
      } else {
        return usagesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of usages returned by the request handler.
     * </pre>
     *
     * <code>repeated .qms.Usage usages = 3;</code>
     */
    public Builder setUsages(
        int index, org.cyverse.de.protobufs.Usage value) {
      if (usagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsagesIsMutable();
        usages_.set(index, value);
        onChanged();
      } else {
        usagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of usages returned by the request handler.
     * </pre>
     *
     * <code>repeated .qms.Usage usages = 3;</code>
     */
    public Builder setUsages(
        int index, org.cyverse.de.protobufs.Usage.Builder builderForValue) {
      if (usagesBuilder_ == null) {
        ensureUsagesIsMutable();
        usages_.set(index, builderForValue.build());
        onChanged();
      } else {
        usagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of usages returned by the request handler.
     * </pre>
     *
     * <code>repeated .qms.Usage usages = 3;</code>
     */
    public Builder addUsages(org.cyverse.de.protobufs.Usage value) {
      if (usagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsagesIsMutable();
        usages_.add(value);
        onChanged();
      } else {
        usagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of usages returned by the request handler.
     * </pre>
     *
     * <code>repeated .qms.Usage usages = 3;</code>
     */
    public Builder addUsages(
        int index, org.cyverse.de.protobufs.Usage value) {
      if (usagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsagesIsMutable();
        usages_.add(index, value);
        onChanged();
      } else {
        usagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of usages returned by the request handler.
     * </pre>
     *
     * <code>repeated .qms.Usage usages = 3;</code>
     */
    public Builder addUsages(
        org.cyverse.de.protobufs.Usage.Builder builderForValue) {
      if (usagesBuilder_ == null) {
        ensureUsagesIsMutable();
        usages_.add(builderForValue.build());
        onChanged();
      } else {
        usagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of usages returned by the request handler.
     * </pre>
     *
     * <code>repeated .qms.Usage usages = 3;</code>
     */
    public Builder addUsages(
        int index, org.cyverse.de.protobufs.Usage.Builder builderForValue) {
      if (usagesBuilder_ == null) {
        ensureUsagesIsMutable();
        usages_.add(index, builderForValue.build());
        onChanged();
      } else {
        usagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of usages returned by the request handler.
     * </pre>
     *
     * <code>repeated .qms.Usage usages = 3;</code>
     */
    public Builder addAllUsages(
        java.lang.Iterable<? extends org.cyverse.de.protobufs.Usage> values) {
      if (usagesBuilder_ == null) {
        ensureUsagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, usages_);
        onChanged();
      } else {
        usagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of usages returned by the request handler.
     * </pre>
     *
     * <code>repeated .qms.Usage usages = 3;</code>
     */
    public Builder clearUsages() {
      if (usagesBuilder_ == null) {
        usages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        usagesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of usages returned by the request handler.
     * </pre>
     *
     * <code>repeated .qms.Usage usages = 3;</code>
     */
    public Builder removeUsages(int index) {
      if (usagesBuilder_ == null) {
        ensureUsagesIsMutable();
        usages_.remove(index);
        onChanged();
      } else {
        usagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of usages returned by the request handler.
     * </pre>
     *
     * <code>repeated .qms.Usage usages = 3;</code>
     */
    public org.cyverse.de.protobufs.Usage.Builder getUsagesBuilder(
        int index) {
      return getUsagesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of usages returned by the request handler.
     * </pre>
     *
     * <code>repeated .qms.Usage usages = 3;</code>
     */
    public org.cyverse.de.protobufs.UsageOrBuilder getUsagesOrBuilder(
        int index) {
      if (usagesBuilder_ == null) {
        return usages_.get(index);  } else {
        return usagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of usages returned by the request handler.
     * </pre>
     *
     * <code>repeated .qms.Usage usages = 3;</code>
     */
    public java.util.List<? extends org.cyverse.de.protobufs.UsageOrBuilder> 
         getUsagesOrBuilderList() {
      if (usagesBuilder_ != null) {
        return usagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(usages_);
      }
    }
    /**
     * <pre>
     * A list of usages returned by the request handler.
     * </pre>
     *
     * <code>repeated .qms.Usage usages = 3;</code>
     */
    public org.cyverse.de.protobufs.Usage.Builder addUsagesBuilder() {
      return getUsagesFieldBuilder().addBuilder(
          org.cyverse.de.protobufs.Usage.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of usages returned by the request handler.
     * </pre>
     *
     * <code>repeated .qms.Usage usages = 3;</code>
     */
    public org.cyverse.de.protobufs.Usage.Builder addUsagesBuilder(
        int index) {
      return getUsagesFieldBuilder().addBuilder(
          index, org.cyverse.de.protobufs.Usage.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of usages returned by the request handler.
     * </pre>
     *
     * <code>repeated .qms.Usage usages = 3;</code>
     */
    public java.util.List<org.cyverse.de.protobufs.Usage.Builder> 
         getUsagesBuilderList() {
      return getUsagesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.cyverse.de.protobufs.Usage, org.cyverse.de.protobufs.Usage.Builder, org.cyverse.de.protobufs.UsageOrBuilder> 
        getUsagesFieldBuilder() {
      if (usagesBuilder_ == null) {
        usagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.cyverse.de.protobufs.Usage, org.cyverse.de.protobufs.Usage.Builder, org.cyverse.de.protobufs.UsageOrBuilder>(
                usages_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        usages_ = null;
      }
      return usagesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:qms.UsageList)
  }

  // @@protoc_insertion_point(class_scope:qms.UsageList)
  private static final org.cyverse.de.protobufs.UsageList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.cyverse.de.protobufs.UsageList();
  }

  public static org.cyverse.de.protobufs.UsageList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UsageList>
      PARSER = new com.google.protobuf.AbstractParser<UsageList>() {
    @java.lang.Override
    public UsageList parsePartialFrom(
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

  public static com.google.protobuf.Parser<UsageList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UsageList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.cyverse.de.protobufs.UsageList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

