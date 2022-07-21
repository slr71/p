// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_overages.proto

package org.cyverse.de.protobufs;

/**
 * Protobuf type {@code OverageList}
 */
public final class OverageList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:OverageList)
    OverageListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OverageList.newBuilder() to construct.
  private OverageList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OverageList() {
    overages_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OverageList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OverageList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            org.cyverse.de.protobufs.Header.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(org.cyverse.de.protobufs.Header.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            org.cyverse.de.protobufs.ServiceError.Builder subBuilder = null;
            if (error_ != null) {
              subBuilder = error_.toBuilder();
            }
            error_ = input.readMessage(org.cyverse.de.protobufs.ServiceError.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(error_);
              error_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              overages_ = new java.util.ArrayList<org.cyverse.de.protobufs.Overage>();
              mutable_bitField0_ |= 0x00000001;
            }
            overages_.add(
                input.readMessage(org.cyverse.de.protobufs.Overage.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        overages_ = java.util.Collections.unmodifiableList(overages_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.cyverse.de.protobufs.QMSOveragesProtobufs.internal_static_OverageList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.cyverse.de.protobufs.QMSOveragesProtobufs.internal_static_OverageList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.cyverse.de.protobufs.OverageList.class, org.cyverse.de.protobufs.OverageList.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private org.cyverse.de.protobufs.Header header_;
  /**
   * <code>.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.Header header = 1;</code>
   * @return The header.
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.Header getHeader() {
    return header_ == null ? org.cyverse.de.protobufs.Header.getDefaultInstance() : header_;
  }
  /**
   * <code>.Header header = 1;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.HeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  private org.cyverse.de.protobufs.ServiceError error_;
  /**
   * <code>.ServiceError error = 2;</code>
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return error_ != null;
  }
  /**
   * <code>.ServiceError error = 2;</code>
   * @return The error.
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.ServiceError getError() {
    return error_ == null ? org.cyverse.de.protobufs.ServiceError.getDefaultInstance() : error_;
  }
  /**
   * <code>.ServiceError error = 2;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.ServiceErrorOrBuilder getErrorOrBuilder() {
    return getError();
  }

  public static final int OVERAGES_FIELD_NUMBER = 3;
  private java.util.List<org.cyverse.de.protobufs.Overage> overages_;
  /**
   * <code>repeated .Overage overages = 3;</code>
   */
  @java.lang.Override
  public java.util.List<org.cyverse.de.protobufs.Overage> getOveragesList() {
    return overages_;
  }
  /**
   * <code>repeated .Overage overages = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.cyverse.de.protobufs.OverageOrBuilder> 
      getOveragesOrBuilderList() {
    return overages_;
  }
  /**
   * <code>repeated .Overage overages = 3;</code>
   */
  @java.lang.Override
  public int getOveragesCount() {
    return overages_.size();
  }
  /**
   * <code>repeated .Overage overages = 3;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.Overage getOverages(int index) {
    return overages_.get(index);
  }
  /**
   * <code>repeated .Overage overages = 3;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.OverageOrBuilder getOveragesOrBuilder(
      int index) {
    return overages_.get(index);
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
    for (int i = 0; i < overages_.size(); i++) {
      output.writeMessage(3, overages_.get(i));
    }
    unknownFields.writeTo(output);
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
    for (int i = 0; i < overages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, overages_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.cyverse.de.protobufs.OverageList)) {
      return super.equals(obj);
    }
    org.cyverse.de.protobufs.OverageList other = (org.cyverse.de.protobufs.OverageList) obj;

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
    if (!getOveragesList()
        .equals(other.getOveragesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
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
    if (getOveragesCount() > 0) {
      hash = (37 * hash) + OVERAGES_FIELD_NUMBER;
      hash = (53 * hash) + getOveragesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.cyverse.de.protobufs.OverageList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.OverageList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.OverageList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.OverageList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.OverageList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.OverageList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.OverageList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.OverageList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.OverageList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.OverageList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.OverageList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.OverageList parseFrom(
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
  public static Builder newBuilder(org.cyverse.de.protobufs.OverageList prototype) {
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
   * Protobuf type {@code OverageList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:OverageList)
      org.cyverse.de.protobufs.OverageListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.cyverse.de.protobufs.QMSOveragesProtobufs.internal_static_OverageList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.cyverse.de.protobufs.QMSOveragesProtobufs.internal_static_OverageList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.cyverse.de.protobufs.OverageList.class, org.cyverse.de.protobufs.OverageList.Builder.class);
    }

    // Construct using org.cyverse.de.protobufs.OverageList.newBuilder()
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
        getOveragesFieldBuilder();
      }
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
      if (overagesBuilder_ == null) {
        overages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        overagesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.cyverse.de.protobufs.QMSOveragesProtobufs.internal_static_OverageList_descriptor;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.OverageList getDefaultInstanceForType() {
      return org.cyverse.de.protobufs.OverageList.getDefaultInstance();
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.OverageList build() {
      org.cyverse.de.protobufs.OverageList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.OverageList buildPartial() {
      org.cyverse.de.protobufs.OverageList result = new org.cyverse.de.protobufs.OverageList(this);
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
      if (overagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          overages_ = java.util.Collections.unmodifiableList(overages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.overages_ = overages_;
      } else {
        result.overages_ = overagesBuilder_.build();
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
      if (other instanceof org.cyverse.de.protobufs.OverageList) {
        return mergeFrom((org.cyverse.de.protobufs.OverageList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.cyverse.de.protobufs.OverageList other) {
      if (other == org.cyverse.de.protobufs.OverageList.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.hasError()) {
        mergeError(other.getError());
      }
      if (overagesBuilder_ == null) {
        if (!other.overages_.isEmpty()) {
          if (overages_.isEmpty()) {
            overages_ = other.overages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOveragesIsMutable();
            overages_.addAll(other.overages_);
          }
          onChanged();
        }
      } else {
        if (!other.overages_.isEmpty()) {
          if (overagesBuilder_.isEmpty()) {
            overagesBuilder_.dispose();
            overagesBuilder_ = null;
            overages_ = other.overages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            overagesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOveragesFieldBuilder() : null;
          } else {
            overagesBuilder_.addAllMessages(other.overages_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      org.cyverse.de.protobufs.OverageList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.cyverse.de.protobufs.OverageList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.cyverse.de.protobufs.Header header_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.cyverse.de.protobufs.Header, org.cyverse.de.protobufs.Header.Builder, org.cyverse.de.protobufs.HeaderOrBuilder> headerBuilder_;
    /**
     * <code>.Header header = 1;</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <code>.Header header = 1;</code>
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
     * <code>.Header header = 1;</code>
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
     * <code>.Header header = 1;</code>
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
     * <code>.Header header = 1;</code>
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
     * <code>.Header header = 1;</code>
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
     * <code>.Header header = 1;</code>
     */
    public org.cyverse.de.protobufs.Header.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.Header header = 1;</code>
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
     * <code>.Header header = 1;</code>
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
     * <code>.ServiceError error = 2;</code>
     * @return Whether the error field is set.
     */
    public boolean hasError() {
      return errorBuilder_ != null || error_ != null;
    }
    /**
     * <code>.ServiceError error = 2;</code>
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
     * <code>.ServiceError error = 2;</code>
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
     * <code>.ServiceError error = 2;</code>
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
     * <code>.ServiceError error = 2;</code>
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
     * <code>.ServiceError error = 2;</code>
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
     * <code>.ServiceError error = 2;</code>
     */
    public org.cyverse.de.protobufs.ServiceError.Builder getErrorBuilder() {
      
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>.ServiceError error = 2;</code>
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
     * <code>.ServiceError error = 2;</code>
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

    private java.util.List<org.cyverse.de.protobufs.Overage> overages_ =
      java.util.Collections.emptyList();
    private void ensureOveragesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        overages_ = new java.util.ArrayList<org.cyverse.de.protobufs.Overage>(overages_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.cyverse.de.protobufs.Overage, org.cyverse.de.protobufs.Overage.Builder, org.cyverse.de.protobufs.OverageOrBuilder> overagesBuilder_;

    /**
     * <code>repeated .Overage overages = 3;</code>
     */
    public java.util.List<org.cyverse.de.protobufs.Overage> getOveragesList() {
      if (overagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(overages_);
      } else {
        return overagesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Overage overages = 3;</code>
     */
    public int getOveragesCount() {
      if (overagesBuilder_ == null) {
        return overages_.size();
      } else {
        return overagesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Overage overages = 3;</code>
     */
    public org.cyverse.de.protobufs.Overage getOverages(int index) {
      if (overagesBuilder_ == null) {
        return overages_.get(index);
      } else {
        return overagesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Overage overages = 3;</code>
     */
    public Builder setOverages(
        int index, org.cyverse.de.protobufs.Overage value) {
      if (overagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOveragesIsMutable();
        overages_.set(index, value);
        onChanged();
      } else {
        overagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Overage overages = 3;</code>
     */
    public Builder setOverages(
        int index, org.cyverse.de.protobufs.Overage.Builder builderForValue) {
      if (overagesBuilder_ == null) {
        ensureOveragesIsMutable();
        overages_.set(index, builderForValue.build());
        onChanged();
      } else {
        overagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Overage overages = 3;</code>
     */
    public Builder addOverages(org.cyverse.de.protobufs.Overage value) {
      if (overagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOveragesIsMutable();
        overages_.add(value);
        onChanged();
      } else {
        overagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Overage overages = 3;</code>
     */
    public Builder addOverages(
        int index, org.cyverse.de.protobufs.Overage value) {
      if (overagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOveragesIsMutable();
        overages_.add(index, value);
        onChanged();
      } else {
        overagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Overage overages = 3;</code>
     */
    public Builder addOverages(
        org.cyverse.de.protobufs.Overage.Builder builderForValue) {
      if (overagesBuilder_ == null) {
        ensureOveragesIsMutable();
        overages_.add(builderForValue.build());
        onChanged();
      } else {
        overagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Overage overages = 3;</code>
     */
    public Builder addOverages(
        int index, org.cyverse.de.protobufs.Overage.Builder builderForValue) {
      if (overagesBuilder_ == null) {
        ensureOveragesIsMutable();
        overages_.add(index, builderForValue.build());
        onChanged();
      } else {
        overagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Overage overages = 3;</code>
     */
    public Builder addAllOverages(
        java.lang.Iterable<? extends org.cyverse.de.protobufs.Overage> values) {
      if (overagesBuilder_ == null) {
        ensureOveragesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, overages_);
        onChanged();
      } else {
        overagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Overage overages = 3;</code>
     */
    public Builder clearOverages() {
      if (overagesBuilder_ == null) {
        overages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        overagesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Overage overages = 3;</code>
     */
    public Builder removeOverages(int index) {
      if (overagesBuilder_ == null) {
        ensureOveragesIsMutable();
        overages_.remove(index);
        onChanged();
      } else {
        overagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Overage overages = 3;</code>
     */
    public org.cyverse.de.protobufs.Overage.Builder getOveragesBuilder(
        int index) {
      return getOveragesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Overage overages = 3;</code>
     */
    public org.cyverse.de.protobufs.OverageOrBuilder getOveragesOrBuilder(
        int index) {
      if (overagesBuilder_ == null) {
        return overages_.get(index);  } else {
        return overagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Overage overages = 3;</code>
     */
    public java.util.List<? extends org.cyverse.de.protobufs.OverageOrBuilder> 
         getOveragesOrBuilderList() {
      if (overagesBuilder_ != null) {
        return overagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(overages_);
      }
    }
    /**
     * <code>repeated .Overage overages = 3;</code>
     */
    public org.cyverse.de.protobufs.Overage.Builder addOveragesBuilder() {
      return getOveragesFieldBuilder().addBuilder(
          org.cyverse.de.protobufs.Overage.getDefaultInstance());
    }
    /**
     * <code>repeated .Overage overages = 3;</code>
     */
    public org.cyverse.de.protobufs.Overage.Builder addOveragesBuilder(
        int index) {
      return getOveragesFieldBuilder().addBuilder(
          index, org.cyverse.de.protobufs.Overage.getDefaultInstance());
    }
    /**
     * <code>repeated .Overage overages = 3;</code>
     */
    public java.util.List<org.cyverse.de.protobufs.Overage.Builder> 
         getOveragesBuilderList() {
      return getOveragesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.cyverse.de.protobufs.Overage, org.cyverse.de.protobufs.Overage.Builder, org.cyverse.de.protobufs.OverageOrBuilder> 
        getOveragesFieldBuilder() {
      if (overagesBuilder_ == null) {
        overagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.cyverse.de.protobufs.Overage, org.cyverse.de.protobufs.Overage.Builder, org.cyverse.de.protobufs.OverageOrBuilder>(
                overages_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        overages_ = null;
      }
      return overagesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:OverageList)
  }

  // @@protoc_insertion_point(class_scope:OverageList)
  private static final org.cyverse.de.protobufs.OverageList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.cyverse.de.protobufs.OverageList();
  }

  public static org.cyverse.de.protobufs.OverageList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OverageList>
      PARSER = new com.google.protobuf.AbstractParser<OverageList>() {
    @java.lang.Override
    public OverageList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OverageList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OverageList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OverageList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.cyverse.de.protobufs.OverageList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
