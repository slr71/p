// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_requests.proto

package org.cyverse.de.protobufs;

/**
 * Protobuf type {@code AddUsage}
 */
public final class AddUsage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AddUsage)
    AddUsageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddUsage.newBuilder() to construct.
  private AddUsage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddUsage() {
    username_ = "";
    resourceName_ = "";
    updateType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddUsage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddUsage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            java.lang.String s = input.readStringRequireUtf8();

            username_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            resourceName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            updateType_ = s;
            break;
          }
          case 41: {

            usageValue_ = input.readDouble();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.cyverse.de.protobufs.QMSRequestProtobufs.internal_static_AddUsage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.cyverse.de.protobufs.QMSRequestProtobufs.internal_static_AddUsage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.cyverse.de.protobufs.AddUsage.class, org.cyverse.de.protobufs.AddUsage.Builder.class);
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

  public static final int USERNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object username_;
  /**
   * <code>string username = 2;</code>
   * @return The username.
   */
  @java.lang.Override
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <code>string username = 2;</code>
   * @return The bytes for username.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object resourceName_;
  /**
   * <code>string resource_name = 3 [json_name = "resource_name"];</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <code>string resource_name = 3 [json_name = "resource_name"];</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UPDATE_TYPE_FIELD_NUMBER = 4;
  private volatile java.lang.Object updateType_;
  /**
   * <pre>
   * Possible values are defined in the database, so we can't use an enum here
   * </pre>
   *
   * <code>string update_type = 4 [json_name = "update_type"];</code>
   * @return The updateType.
   */
  @java.lang.Override
  public java.lang.String getUpdateType() {
    java.lang.Object ref = updateType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      updateType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Possible values are defined in the database, so we can't use an enum here
   * </pre>
   *
   * <code>string update_type = 4 [json_name = "update_type"];</code>
   * @return The bytes for updateType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUpdateTypeBytes() {
    java.lang.Object ref = updateType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      updateType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USAGE_VALUE_FIELD_NUMBER = 5;
  private double usageValue_;
  /**
   * <code>double usage_value = 5 [json_name = "usage_value"];</code>
   * @return The usageValue.
   */
  @java.lang.Override
  public double getUsageValue() {
    return usageValue_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, resourceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(updateType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, updateType_);
    }
    if (java.lang.Double.doubleToRawLongBits(usageValue_) != 0) {
      output.writeDouble(5, usageValue_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, resourceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(updateType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, updateType_);
    }
    if (java.lang.Double.doubleToRawLongBits(usageValue_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, usageValue_);
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
    if (!(obj instanceof org.cyverse.de.protobufs.AddUsage)) {
      return super.equals(obj);
    }
    org.cyverse.de.protobufs.AddUsage other = (org.cyverse.de.protobufs.AddUsage) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (!getUsername()
        .equals(other.getUsername())) return false;
    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (!getUpdateType()
        .equals(other.getUpdateType())) return false;
    if (java.lang.Double.doubleToLongBits(getUsageValue())
        != java.lang.Double.doubleToLongBits(
            other.getUsageValue())) return false;
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
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    hash = (37 * hash) + UPDATE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getUpdateType().hashCode();
    hash = (37 * hash) + USAGE_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getUsageValue()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.cyverse.de.protobufs.AddUsage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.AddUsage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.AddUsage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.AddUsage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.AddUsage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.AddUsage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.AddUsage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.AddUsage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.AddUsage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.AddUsage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.AddUsage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.AddUsage parseFrom(
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
  public static Builder newBuilder(org.cyverse.de.protobufs.AddUsage prototype) {
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
   * Protobuf type {@code AddUsage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AddUsage)
      org.cyverse.de.protobufs.AddUsageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.cyverse.de.protobufs.QMSRequestProtobufs.internal_static_AddUsage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.cyverse.de.protobufs.QMSRequestProtobufs.internal_static_AddUsage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.cyverse.de.protobufs.AddUsage.class, org.cyverse.de.protobufs.AddUsage.Builder.class);
    }

    // Construct using org.cyverse.de.protobufs.AddUsage.newBuilder()
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
      username_ = "";

      resourceName_ = "";

      updateType_ = "";

      usageValue_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.cyverse.de.protobufs.QMSRequestProtobufs.internal_static_AddUsage_descriptor;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.AddUsage getDefaultInstanceForType() {
      return org.cyverse.de.protobufs.AddUsage.getDefaultInstance();
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.AddUsage build() {
      org.cyverse.de.protobufs.AddUsage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.AddUsage buildPartial() {
      org.cyverse.de.protobufs.AddUsage result = new org.cyverse.de.protobufs.AddUsage(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      result.username_ = username_;
      result.resourceName_ = resourceName_;
      result.updateType_ = updateType_;
      result.usageValue_ = usageValue_;
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
      if (other instanceof org.cyverse.de.protobufs.AddUsage) {
        return mergeFrom((org.cyverse.de.protobufs.AddUsage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.cyverse.de.protobufs.AddUsage other) {
      if (other == org.cyverse.de.protobufs.AddUsage.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        onChanged();
      }
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (!other.getUpdateType().isEmpty()) {
        updateType_ = other.updateType_;
        onChanged();
      }
      if (other.getUsageValue() != 0D) {
        setUsageValue(other.getUsageValue());
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
      org.cyverse.de.protobufs.AddUsage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.cyverse.de.protobufs.AddUsage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private java.lang.Object username_ = "";
    /**
     * <code>string username = 2;</code>
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string username = 2;</code>
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string username = 2;</code>
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      username_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string username = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
      onChanged();
      return this;
    }
    /**
     * <code>string username = 2;</code>
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      username_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resourceName_ = "";
    /**
     * <code>string resource_name = 3 [json_name = "resource_name"];</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string resource_name = 3 [json_name = "resource_name"];</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string resource_name = 3 [json_name = "resource_name"];</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string resource_name = 3 [json_name = "resource_name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <code>string resource_name = 3 [json_name = "resource_name"];</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object updateType_ = "";
    /**
     * <pre>
     * Possible values are defined in the database, so we can't use an enum here
     * </pre>
     *
     * <code>string update_type = 4 [json_name = "update_type"];</code>
     * @return The updateType.
     */
    public java.lang.String getUpdateType() {
      java.lang.Object ref = updateType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        updateType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Possible values are defined in the database, so we can't use an enum here
     * </pre>
     *
     * <code>string update_type = 4 [json_name = "update_type"];</code>
     * @return The bytes for updateType.
     */
    public com.google.protobuf.ByteString
        getUpdateTypeBytes() {
      java.lang.Object ref = updateType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        updateType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Possible values are defined in the database, so we can't use an enum here
     * </pre>
     *
     * <code>string update_type = 4 [json_name = "update_type"];</code>
     * @param value The updateType to set.
     * @return This builder for chaining.
     */
    public Builder setUpdateType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      updateType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Possible values are defined in the database, so we can't use an enum here
     * </pre>
     *
     * <code>string update_type = 4 [json_name = "update_type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUpdateType() {
      
      updateType_ = getDefaultInstance().getUpdateType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Possible values are defined in the database, so we can't use an enum here
     * </pre>
     *
     * <code>string update_type = 4 [json_name = "update_type"];</code>
     * @param value The bytes for updateType to set.
     * @return This builder for chaining.
     */
    public Builder setUpdateTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      updateType_ = value;
      onChanged();
      return this;
    }

    private double usageValue_ ;
    /**
     * <code>double usage_value = 5 [json_name = "usage_value"];</code>
     * @return The usageValue.
     */
    @java.lang.Override
    public double getUsageValue() {
      return usageValue_;
    }
    /**
     * <code>double usage_value = 5 [json_name = "usage_value"];</code>
     * @param value The usageValue to set.
     * @return This builder for chaining.
     */
    public Builder setUsageValue(double value) {
      
      usageValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double usage_value = 5 [json_name = "usage_value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUsageValue() {
      
      usageValue_ = 0D;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:AddUsage)
  }

  // @@protoc_insertion_point(class_scope:AddUsage)
  private static final org.cyverse.de.protobufs.AddUsage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.cyverse.de.protobufs.AddUsage();
  }

  public static org.cyverse.de.protobufs.AddUsage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddUsage>
      PARSER = new com.google.protobuf.AbstractParser<AddUsage>() {
    @java.lang.Override
    public AddUsage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddUsage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddUsage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddUsage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.cyverse.de.protobufs.AddUsage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

