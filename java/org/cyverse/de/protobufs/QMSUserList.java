// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_users.proto

package org.cyverse.de.protobufs;

/**
 * Protobuf type {@code QMSUserList}
 */
public final class QMSUserList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:QMSUserList)
    QMSUserListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QMSUserList.newBuilder() to construct.
  private QMSUserList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QMSUserList() {
    users_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QMSUserList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.cyverse.de.protobufs.QMSUSerProtobufs.internal_static_QMSUserList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.cyverse.de.protobufs.QMSUSerProtobufs.internal_static_QMSUserList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.cyverse.de.protobufs.QMSUserList.class, org.cyverse.de.protobufs.QMSUserList.Builder.class);
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
    return header_ == null ? org.cyverse.de.protobufs.Header.getDefaultInstance() : header_;
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
    return error_ == null ? org.cyverse.de.protobufs.ServiceError.getDefaultInstance() : error_;
  }

  public static final int USERS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<org.cyverse.de.protobufs.QMSUser> users_;
  /**
   * <code>repeated .QMSUser users = 3;</code>
   */
  @java.lang.Override
  public java.util.List<org.cyverse.de.protobufs.QMSUser> getUsersList() {
    return users_;
  }
  /**
   * <code>repeated .QMSUser users = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.cyverse.de.protobufs.QMSUserOrBuilder> 
      getUsersOrBuilderList() {
    return users_;
  }
  /**
   * <code>repeated .QMSUser users = 3;</code>
   */
  @java.lang.Override
  public int getUsersCount() {
    return users_.size();
  }
  /**
   * <code>repeated .QMSUser users = 3;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.QMSUser getUsers(int index) {
    return users_.get(index);
  }
  /**
   * <code>repeated .QMSUser users = 3;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.QMSUserOrBuilder getUsersOrBuilder(
      int index) {
    return users_.get(index);
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
    for (int i = 0; i < users_.size(); i++) {
      output.writeMessage(3, users_.get(i));
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
    for (int i = 0; i < users_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, users_.get(i));
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
    if (!(obj instanceof org.cyverse.de.protobufs.QMSUserList)) {
      return super.equals(obj);
    }
    org.cyverse.de.protobufs.QMSUserList other = (org.cyverse.de.protobufs.QMSUserList) obj;

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
    if (!getUsersList()
        .equals(other.getUsersList())) return false;
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
    if (getUsersCount() > 0) {
      hash = (37 * hash) + USERS_FIELD_NUMBER;
      hash = (53 * hash) + getUsersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.cyverse.de.protobufs.QMSUserList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.QMSUserList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.QMSUserList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.QMSUserList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.QMSUserList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.QMSUserList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.QMSUserList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.QMSUserList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.QMSUserList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.QMSUserList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.QMSUserList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.QMSUserList parseFrom(
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
  public static Builder newBuilder(org.cyverse.de.protobufs.QMSUserList prototype) {
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
   * Protobuf type {@code QMSUserList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:QMSUserList)
      org.cyverse.de.protobufs.QMSUserListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.cyverse.de.protobufs.QMSUSerProtobufs.internal_static_QMSUserList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.cyverse.de.protobufs.QMSUSerProtobufs.internal_static_QMSUserList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.cyverse.de.protobufs.QMSUserList.class, org.cyverse.de.protobufs.QMSUserList.Builder.class);
    }

    // Construct using org.cyverse.de.protobufs.QMSUserList.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

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
      if (usersBuilder_ == null) {
        users_ = java.util.Collections.emptyList();
      } else {
        users_ = null;
        usersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.cyverse.de.protobufs.QMSUSerProtobufs.internal_static_QMSUserList_descriptor;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.QMSUserList getDefaultInstanceForType() {
      return org.cyverse.de.protobufs.QMSUserList.getDefaultInstance();
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.QMSUserList build() {
      org.cyverse.de.protobufs.QMSUserList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.QMSUserList buildPartial() {
      org.cyverse.de.protobufs.QMSUserList result = new org.cyverse.de.protobufs.QMSUserList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.cyverse.de.protobufs.QMSUserList result) {
      if (usersBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          users_ = java.util.Collections.unmodifiableList(users_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.users_ = users_;
      } else {
        result.users_ = usersBuilder_.build();
      }
    }

    private void buildPartial0(org.cyverse.de.protobufs.QMSUserList result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.header_ = headerBuilder_ == null
            ? header_
            : headerBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.error_ = errorBuilder_ == null
            ? error_
            : errorBuilder_.build();
      }
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
      if (other instanceof org.cyverse.de.protobufs.QMSUserList) {
        return mergeFrom((org.cyverse.de.protobufs.QMSUserList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.cyverse.de.protobufs.QMSUserList other) {
      if (other == org.cyverse.de.protobufs.QMSUserList.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.hasError()) {
        mergeError(other.getError());
      }
      if (usersBuilder_ == null) {
        if (!other.users_.isEmpty()) {
          if (users_.isEmpty()) {
            users_ = other.users_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureUsersIsMutable();
            users_.addAll(other.users_);
          }
          onChanged();
        }
      } else {
        if (!other.users_.isEmpty()) {
          if (usersBuilder_.isEmpty()) {
            usersBuilder_.dispose();
            usersBuilder_ = null;
            users_ = other.users_;
            bitField0_ = (bitField0_ & ~0x00000004);
            usersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUsersFieldBuilder() : null;
          } else {
            usersBuilder_.addAllMessages(other.users_);
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
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getErrorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              org.cyverse.de.protobufs.QMSUser m =
                  input.readMessage(
                      org.cyverse.de.protobufs.QMSUser.parser(),
                      extensionRegistry);
              if (usersBuilder_ == null) {
                ensureUsersIsMutable();
                users_.add(m);
              } else {
                usersBuilder_.addMessage(m);
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
     * <code>.Header header = 1;</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) != 0);
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
      } else {
        headerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.Header header = 1;</code>
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
     * <code>.Header header = 1;</code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.Header header = 1;</code>
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
     * <code>.Header header = 1;</code>
     */
    public org.cyverse.de.protobufs.Header.Builder getHeaderBuilder() {
      bitField0_ |= 0x00000001;
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
      return ((bitField0_ & 0x00000002) != 0);
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
      } else {
        errorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ServiceError error = 2;</code>
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
     * <code>.ServiceError error = 2;</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ServiceError error = 2;</code>
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
     * <code>.ServiceError error = 2;</code>
     */
    public org.cyverse.de.protobufs.ServiceError.Builder getErrorBuilder() {
      bitField0_ |= 0x00000002;
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

    private java.util.List<org.cyverse.de.protobufs.QMSUser> users_ =
      java.util.Collections.emptyList();
    private void ensureUsersIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        users_ = new java.util.ArrayList<org.cyverse.de.protobufs.QMSUser>(users_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.cyverse.de.protobufs.QMSUser, org.cyverse.de.protobufs.QMSUser.Builder, org.cyverse.de.protobufs.QMSUserOrBuilder> usersBuilder_;

    /**
     * <code>repeated .QMSUser users = 3;</code>
     */
    public java.util.List<org.cyverse.de.protobufs.QMSUser> getUsersList() {
      if (usersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(users_);
      } else {
        return usersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .QMSUser users = 3;</code>
     */
    public int getUsersCount() {
      if (usersBuilder_ == null) {
        return users_.size();
      } else {
        return usersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .QMSUser users = 3;</code>
     */
    public org.cyverse.de.protobufs.QMSUser getUsers(int index) {
      if (usersBuilder_ == null) {
        return users_.get(index);
      } else {
        return usersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .QMSUser users = 3;</code>
     */
    public Builder setUsers(
        int index, org.cyverse.de.protobufs.QMSUser value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.set(index, value);
        onChanged();
      } else {
        usersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .QMSUser users = 3;</code>
     */
    public Builder setUsers(
        int index, org.cyverse.de.protobufs.QMSUser.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.set(index, builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .QMSUser users = 3;</code>
     */
    public Builder addUsers(org.cyverse.de.protobufs.QMSUser value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.add(value);
        onChanged();
      } else {
        usersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .QMSUser users = 3;</code>
     */
    public Builder addUsers(
        int index, org.cyverse.de.protobufs.QMSUser value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.add(index, value);
        onChanged();
      } else {
        usersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .QMSUser users = 3;</code>
     */
    public Builder addUsers(
        org.cyverse.de.protobufs.QMSUser.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.add(builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .QMSUser users = 3;</code>
     */
    public Builder addUsers(
        int index, org.cyverse.de.protobufs.QMSUser.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.add(index, builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .QMSUser users = 3;</code>
     */
    public Builder addAllUsers(
        java.lang.Iterable<? extends org.cyverse.de.protobufs.QMSUser> values) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, users_);
        onChanged();
      } else {
        usersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .QMSUser users = 3;</code>
     */
    public Builder clearUsers() {
      if (usersBuilder_ == null) {
        users_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        usersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .QMSUser users = 3;</code>
     */
    public Builder removeUsers(int index) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.remove(index);
        onChanged();
      } else {
        usersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .QMSUser users = 3;</code>
     */
    public org.cyverse.de.protobufs.QMSUser.Builder getUsersBuilder(
        int index) {
      return getUsersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .QMSUser users = 3;</code>
     */
    public org.cyverse.de.protobufs.QMSUserOrBuilder getUsersOrBuilder(
        int index) {
      if (usersBuilder_ == null) {
        return users_.get(index);  } else {
        return usersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .QMSUser users = 3;</code>
     */
    public java.util.List<? extends org.cyverse.de.protobufs.QMSUserOrBuilder> 
         getUsersOrBuilderList() {
      if (usersBuilder_ != null) {
        return usersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(users_);
      }
    }
    /**
     * <code>repeated .QMSUser users = 3;</code>
     */
    public org.cyverse.de.protobufs.QMSUser.Builder addUsersBuilder() {
      return getUsersFieldBuilder().addBuilder(
          org.cyverse.de.protobufs.QMSUser.getDefaultInstance());
    }
    /**
     * <code>repeated .QMSUser users = 3;</code>
     */
    public org.cyverse.de.protobufs.QMSUser.Builder addUsersBuilder(
        int index) {
      return getUsersFieldBuilder().addBuilder(
          index, org.cyverse.de.protobufs.QMSUser.getDefaultInstance());
    }
    /**
     * <code>repeated .QMSUser users = 3;</code>
     */
    public java.util.List<org.cyverse.de.protobufs.QMSUser.Builder> 
         getUsersBuilderList() {
      return getUsersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.cyverse.de.protobufs.QMSUser, org.cyverse.de.protobufs.QMSUser.Builder, org.cyverse.de.protobufs.QMSUserOrBuilder> 
        getUsersFieldBuilder() {
      if (usersBuilder_ == null) {
        usersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.cyverse.de.protobufs.QMSUser, org.cyverse.de.protobufs.QMSUser.Builder, org.cyverse.de.protobufs.QMSUserOrBuilder>(
                users_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        users_ = null;
      }
      return usersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:QMSUserList)
  }

  // @@protoc_insertion_point(class_scope:QMSUserList)
  private static final org.cyverse.de.protobufs.QMSUserList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.cyverse.de.protobufs.QMSUserList();
  }

  public static org.cyverse.de.protobufs.QMSUserList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QMSUserList>
      PARSER = new com.google.protobuf.AbstractParser<QMSUserList>() {
    @java.lang.Override
    public QMSUserList parsePartialFrom(
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

  public static com.google.protobuf.Parser<QMSUserList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QMSUserList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.cyverse.de.protobufs.QMSUserList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

