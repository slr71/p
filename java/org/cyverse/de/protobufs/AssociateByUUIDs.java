// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: requests.proto
// Protobuf Java Version: 4.31.1

package org.cyverse.de.protobufs;

/**
 * <pre>
 * *
 * Request that two resources be associated.
 * </pre>
 *
 * Protobuf type {@code requests.AssociateByUUIDs}
 */
@com.google.protobuf.Generated
public final class AssociateByUUIDs extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:requests.AssociateByUUIDs)
    AssociateByUUIDsOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
      /* patch= */ 1,
      /* suffix= */ "",
      AssociateByUUIDs.class.getName());
  }
  // Use AssociateByUUIDs.newBuilder() to construct.
  private AssociateByUUIDs(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AssociateByUUIDs() {
    parentUuid_ = "";
    childUuid_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.cyverse.de.protobufs.Requests.internal_static_requests_AssociateByUUIDs_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.cyverse.de.protobufs.Requests.internal_static_requests_AssociateByUUIDs_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.cyverse.de.protobufs.AssociateByUUIDs.class, org.cyverse.de.protobufs.AssociateByUUIDs.Builder.class);
  }

  private int bitField0_;
  public static final int HEADER_FIELD_NUMBER = 1;
  private org.cyverse.de.protobufs.Header header_;
  /**
   * <pre>
   * Contains telemetry information.
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
   * Contains telemetry information.
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
   * Contains telemetry information.
   * </pre>
   *
   * <code>.header.Header header = 1;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.HeaderOrBuilder getHeaderOrBuilder() {
    return header_ == null ? org.cyverse.de.protobufs.Header.getDefaultInstance() : header_;
  }

  public static final int PARENT_UUID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parentUuid_ = "";
  /**
   * <pre>
   * The UUID of the parent/owner/primary resource.
   * </pre>
   *
   * <code>string parent_uuid = 2 [json_name = "parent_uuid"];</code>
   * @return The parentUuid.
   */
  @java.lang.Override
  public java.lang.String getParentUuid() {
    java.lang.Object ref = parentUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parentUuid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The UUID of the parent/owner/primary resource.
   * </pre>
   *
   * <code>string parent_uuid = 2 [json_name = "parent_uuid"];</code>
   * @return The bytes for parentUuid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentUuidBytes() {
    java.lang.Object ref = parentUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parentUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHILD_UUID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object childUuid_ = "";
  /**
   * <pre>
   * The UUID of the child/object/secondary resource.
   * </pre>
   *
   * <code>string child_uuid = 3 [json_name = "child_uuid"];</code>
   * @return The childUuid.
   */
  @java.lang.Override
  public java.lang.String getChildUuid() {
    java.lang.Object ref = childUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      childUuid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The UUID of the child/object/secondary resource.
   * </pre>
   *
   * <code>string child_uuid = 3 [json_name = "child_uuid"];</code>
   * @return The bytes for childUuid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChildUuidBytes() {
    java.lang.Object ref = childUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      childUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(parentUuid_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, parentUuid_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(childUuid_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, childUuid_);
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(parentUuid_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, parentUuid_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(childUuid_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, childUuid_);
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
    if (!(obj instanceof org.cyverse.de.protobufs.AssociateByUUIDs)) {
      return super.equals(obj);
    }
    org.cyverse.de.protobufs.AssociateByUUIDs other = (org.cyverse.de.protobufs.AssociateByUUIDs) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (!getParentUuid()
        .equals(other.getParentUuid())) return false;
    if (!getChildUuid()
        .equals(other.getChildUuid())) return false;
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
    hash = (37 * hash) + PARENT_UUID_FIELD_NUMBER;
    hash = (53 * hash) + getParentUuid().hashCode();
    hash = (37 * hash) + CHILD_UUID_FIELD_NUMBER;
    hash = (53 * hash) + getChildUuid().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.cyverse.de.protobufs.AssociateByUUIDs parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.AssociateByUUIDs parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.AssociateByUUIDs parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.AssociateByUUIDs parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.AssociateByUUIDs parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.AssociateByUUIDs parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.AssociateByUUIDs parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.AssociateByUUIDs parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.cyverse.de.protobufs.AssociateByUUIDs parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.cyverse.de.protobufs.AssociateByUUIDs parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.AssociateByUUIDs parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.AssociateByUUIDs parseFrom(
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
  public static Builder newBuilder(org.cyverse.de.protobufs.AssociateByUUIDs prototype) {
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
   * Request that two resources be associated.
   * </pre>
   *
   * Protobuf type {@code requests.AssociateByUUIDs}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:requests.AssociateByUUIDs)
      org.cyverse.de.protobufs.AssociateByUUIDsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.cyverse.de.protobufs.Requests.internal_static_requests_AssociateByUUIDs_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.cyverse.de.protobufs.Requests.internal_static_requests_AssociateByUUIDs_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.cyverse.de.protobufs.AssociateByUUIDs.class, org.cyverse.de.protobufs.AssociateByUUIDs.Builder.class);
    }

    // Construct using org.cyverse.de.protobufs.AssociateByUUIDs.newBuilder()
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
      parentUuid_ = "";
      childUuid_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.cyverse.de.protobufs.Requests.internal_static_requests_AssociateByUUIDs_descriptor;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.AssociateByUUIDs getDefaultInstanceForType() {
      return org.cyverse.de.protobufs.AssociateByUUIDs.getDefaultInstance();
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.AssociateByUUIDs build() {
      org.cyverse.de.protobufs.AssociateByUUIDs result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.AssociateByUUIDs buildPartial() {
      org.cyverse.de.protobufs.AssociateByUUIDs result = new org.cyverse.de.protobufs.AssociateByUUIDs(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.cyverse.de.protobufs.AssociateByUUIDs result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.header_ = headerBuilder_ == null
            ? header_
            : headerBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.parentUuid_ = parentUuid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.childUuid_ = childUuid_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.cyverse.de.protobufs.AssociateByUUIDs) {
        return mergeFrom((org.cyverse.de.protobufs.AssociateByUUIDs)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.cyverse.de.protobufs.AssociateByUUIDs other) {
      if (other == org.cyverse.de.protobufs.AssociateByUUIDs.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (!other.getParentUuid().isEmpty()) {
        parentUuid_ = other.parentUuid_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getChildUuid().isEmpty()) {
        childUuid_ = other.childUuid_;
        bitField0_ |= 0x00000004;
        onChanged();
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
              parentUuid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              childUuid_ = input.readStringRequireUtf8();
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
     * Contains telemetry information.
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
     * Contains telemetry information.
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
     * Contains telemetry information.
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
     * Contains telemetry information.
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
     * Contains telemetry information.
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
     * Contains telemetry information.
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
     * Contains telemetry information.
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
     * Contains telemetry information.
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
     * Contains telemetry information.
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

    private java.lang.Object parentUuid_ = "";
    /**
     * <pre>
     * The UUID of the parent/owner/primary resource.
     * </pre>
     *
     * <code>string parent_uuid = 2 [json_name = "parent_uuid"];</code>
     * @return The parentUuid.
     */
    public java.lang.String getParentUuid() {
      java.lang.Object ref = parentUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parentUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The UUID of the parent/owner/primary resource.
     * </pre>
     *
     * <code>string parent_uuid = 2 [json_name = "parent_uuid"];</code>
     * @return The bytes for parentUuid.
     */
    public com.google.protobuf.ByteString
        getParentUuidBytes() {
      java.lang.Object ref = parentUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parentUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The UUID of the parent/owner/primary resource.
     * </pre>
     *
     * <code>string parent_uuid = 2 [json_name = "parent_uuid"];</code>
     * @param value The parentUuid to set.
     * @return This builder for chaining.
     */
    public Builder setParentUuid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parentUuid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The UUID of the parent/owner/primary resource.
     * </pre>
     *
     * <code>string parent_uuid = 2 [json_name = "parent_uuid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearParentUuid() {
      parentUuid_ = getDefaultInstance().getParentUuid();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The UUID of the parent/owner/primary resource.
     * </pre>
     *
     * <code>string parent_uuid = 2 [json_name = "parent_uuid"];</code>
     * @param value The bytes for parentUuid to set.
     * @return This builder for chaining.
     */
    public Builder setParentUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parentUuid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object childUuid_ = "";
    /**
     * <pre>
     * The UUID of the child/object/secondary resource.
     * </pre>
     *
     * <code>string child_uuid = 3 [json_name = "child_uuid"];</code>
     * @return The childUuid.
     */
    public java.lang.String getChildUuid() {
      java.lang.Object ref = childUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        childUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The UUID of the child/object/secondary resource.
     * </pre>
     *
     * <code>string child_uuid = 3 [json_name = "child_uuid"];</code>
     * @return The bytes for childUuid.
     */
    public com.google.protobuf.ByteString
        getChildUuidBytes() {
      java.lang.Object ref = childUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        childUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The UUID of the child/object/secondary resource.
     * </pre>
     *
     * <code>string child_uuid = 3 [json_name = "child_uuid"];</code>
     * @param value The childUuid to set.
     * @return This builder for chaining.
     */
    public Builder setChildUuid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      childUuid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The UUID of the child/object/secondary resource.
     * </pre>
     *
     * <code>string child_uuid = 3 [json_name = "child_uuid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChildUuid() {
      childUuid_ = getDefaultInstance().getChildUuid();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The UUID of the child/object/secondary resource.
     * </pre>
     *
     * <code>string child_uuid = 3 [json_name = "child_uuid"];</code>
     * @param value The bytes for childUuid to set.
     * @return This builder for chaining.
     */
    public Builder setChildUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      childUuid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:requests.AssociateByUUIDs)
  }

  // @@protoc_insertion_point(class_scope:requests.AssociateByUUIDs)
  private static final org.cyverse.de.protobufs.AssociateByUUIDs DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.cyverse.de.protobufs.AssociateByUUIDs();
  }

  public static org.cyverse.de.protobufs.AssociateByUUIDs getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssociateByUUIDs>
      PARSER = new com.google.protobuf.AbstractParser<AssociateByUUIDs>() {
    @java.lang.Override
    public AssociateByUUIDs parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssociateByUUIDs> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssociateByUUIDs> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.cyverse.de.protobufs.AssociateByUUIDs getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

