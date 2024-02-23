// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: groups.proto

// Protobuf Java Version: 3.25.3
package org.cyverse.de.protobufs;

/**
 * <pre>
 **
 * An outgoing subject.
 * </pre>
 *
 * Protobuf type {@code groups.SubjectOut}
 */
public final class SubjectOut extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:groups.SubjectOut)
    SubjectOutOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubjectOut.newBuilder() to construct.
  private SubjectOut(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubjectOut() {
    id_ = "";
    subjectId_ = "";
    subjectType_ = "";
    subjectSourceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubjectOut();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.cyverse.de.protobufs.GroupsProtobufs.internal_static_groups_SubjectOut_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.cyverse.de.protobufs.GroupsProtobufs.internal_static_groups_SubjectOut_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.cyverse.de.protobufs.SubjectOut.class, org.cyverse.de.protobufs.SubjectOut.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <pre>
   *The internal subject id.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *The internal subject id.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBJECT_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subjectId_ = "";
  /**
   * <pre>
   * The external subject id.
   * </pre>
   *
   * <code>string subject_id = 2 [json_name = "subject_id"];</code>
   * @return The subjectId.
   */
  @java.lang.Override
  public java.lang.String getSubjectId() {
    java.lang.Object ref = subjectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subjectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The external subject id.
   * </pre>
   *
   * <code>string subject_id = 2 [json_name = "subject_id"];</code>
   * @return The bytes for subjectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubjectIdBytes() {
    java.lang.Object ref = subjectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subjectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBJECT_TYPE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subjectType_ = "";
  /**
   * <pre>
   * The subject type.
   * </pre>
   *
   * <code>string subject_type = 3 [json_name = "subject_type"];</code>
   * @return The subjectType.
   */
  @java.lang.Override
  public java.lang.String getSubjectType() {
    java.lang.Object ref = subjectType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subjectType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The subject type.
   * </pre>
   *
   * <code>string subject_type = 3 [json_name = "subject_type"];</code>
   * @return The bytes for subjectType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubjectTypeBytes() {
    java.lang.Object ref = subjectType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subjectType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBJECT_SOURCE_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subjectSourceId_ = "";
  /**
   * <pre>
   * The subject source ID.
   * </pre>
   *
   * <code>string subject_source_id = 4 [json_name = "subject_source_id"];</code>
   * @return The subjectSourceId.
   */
  @java.lang.Override
  public java.lang.String getSubjectSourceId() {
    java.lang.Object ref = subjectSourceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subjectSourceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The subject source ID.
   * </pre>
   *
   * <code>string subject_source_id = 4 [json_name = "subject_source_id"];</code>
   * @return The bytes for subjectSourceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubjectSourceIdBytes() {
    java.lang.Object ref = subjectSourceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subjectSourceId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subjectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, subjectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subjectType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, subjectType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subjectSourceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, subjectSourceId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subjectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, subjectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subjectType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, subjectType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subjectSourceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, subjectSourceId_);
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
    if (!(obj instanceof org.cyverse.de.protobufs.SubjectOut)) {
      return super.equals(obj);
    }
    org.cyverse.de.protobufs.SubjectOut other = (org.cyverse.de.protobufs.SubjectOut) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getSubjectId()
        .equals(other.getSubjectId())) return false;
    if (!getSubjectType()
        .equals(other.getSubjectType())) return false;
    if (!getSubjectSourceId()
        .equals(other.getSubjectSourceId())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + SUBJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSubjectId().hashCode();
    hash = (37 * hash) + SUBJECT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getSubjectType().hashCode();
    hash = (37 * hash) + SUBJECT_SOURCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSubjectSourceId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.cyverse.de.protobufs.SubjectOut parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.SubjectOut parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.SubjectOut parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.SubjectOut parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.SubjectOut parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.SubjectOut parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.SubjectOut parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.SubjectOut parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.cyverse.de.protobufs.SubjectOut parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.cyverse.de.protobufs.SubjectOut parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.SubjectOut parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.SubjectOut parseFrom(
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
  public static Builder newBuilder(org.cyverse.de.protobufs.SubjectOut prototype) {
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
   * An outgoing subject.
   * </pre>
   *
   * Protobuf type {@code groups.SubjectOut}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:groups.SubjectOut)
      org.cyverse.de.protobufs.SubjectOutOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.cyverse.de.protobufs.GroupsProtobufs.internal_static_groups_SubjectOut_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.cyverse.de.protobufs.GroupsProtobufs.internal_static_groups_SubjectOut_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.cyverse.de.protobufs.SubjectOut.class, org.cyverse.de.protobufs.SubjectOut.Builder.class);
    }

    // Construct using org.cyverse.de.protobufs.SubjectOut.newBuilder()
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
      id_ = "";
      subjectId_ = "";
      subjectType_ = "";
      subjectSourceId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.cyverse.de.protobufs.GroupsProtobufs.internal_static_groups_SubjectOut_descriptor;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.SubjectOut getDefaultInstanceForType() {
      return org.cyverse.de.protobufs.SubjectOut.getDefaultInstance();
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.SubjectOut build() {
      org.cyverse.de.protobufs.SubjectOut result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.SubjectOut buildPartial() {
      org.cyverse.de.protobufs.SubjectOut result = new org.cyverse.de.protobufs.SubjectOut(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.cyverse.de.protobufs.SubjectOut result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.subjectId_ = subjectId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.subjectType_ = subjectType_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.subjectSourceId_ = subjectSourceId_;
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
      if (other instanceof org.cyverse.de.protobufs.SubjectOut) {
        return mergeFrom((org.cyverse.de.protobufs.SubjectOut)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.cyverse.de.protobufs.SubjectOut other) {
      if (other == org.cyverse.de.protobufs.SubjectOut.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSubjectId().isEmpty()) {
        subjectId_ = other.subjectId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getSubjectType().isEmpty()) {
        subjectType_ = other.subjectType_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getSubjectSourceId().isEmpty()) {
        subjectSourceId_ = other.subjectSourceId_;
        bitField0_ |= 0x00000008;
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
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              subjectId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              subjectType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              subjectSourceId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object id_ = "";
    /**
     * <pre>
     *The internal subject id.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *The internal subject id.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *The internal subject id.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *The internal subject id.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *The internal subject id.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object subjectId_ = "";
    /**
     * <pre>
     * The external subject id.
     * </pre>
     *
     * <code>string subject_id = 2 [json_name = "subject_id"];</code>
     * @return The subjectId.
     */
    public java.lang.String getSubjectId() {
      java.lang.Object ref = subjectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subjectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The external subject id.
     * </pre>
     *
     * <code>string subject_id = 2 [json_name = "subject_id"];</code>
     * @return The bytes for subjectId.
     */
    public com.google.protobuf.ByteString
        getSubjectIdBytes() {
      java.lang.Object ref = subjectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subjectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The external subject id.
     * </pre>
     *
     * <code>string subject_id = 2 [json_name = "subject_id"];</code>
     * @param value The subjectId to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subjectId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The external subject id.
     * </pre>
     *
     * <code>string subject_id = 2 [json_name = "subject_id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubjectId() {
      subjectId_ = getDefaultInstance().getSubjectId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The external subject id.
     * </pre>
     *
     * <code>string subject_id = 2 [json_name = "subject_id"];</code>
     * @param value The bytes for subjectId to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subjectId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object subjectType_ = "";
    /**
     * <pre>
     * The subject type.
     * </pre>
     *
     * <code>string subject_type = 3 [json_name = "subject_type"];</code>
     * @return The subjectType.
     */
    public java.lang.String getSubjectType() {
      java.lang.Object ref = subjectType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subjectType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The subject type.
     * </pre>
     *
     * <code>string subject_type = 3 [json_name = "subject_type"];</code>
     * @return The bytes for subjectType.
     */
    public com.google.protobuf.ByteString
        getSubjectTypeBytes() {
      java.lang.Object ref = subjectType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subjectType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The subject type.
     * </pre>
     *
     * <code>string subject_type = 3 [json_name = "subject_type"];</code>
     * @param value The subjectType to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subjectType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The subject type.
     * </pre>
     *
     * <code>string subject_type = 3 [json_name = "subject_type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubjectType() {
      subjectType_ = getDefaultInstance().getSubjectType();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The subject type.
     * </pre>
     *
     * <code>string subject_type = 3 [json_name = "subject_type"];</code>
     * @param value The bytes for subjectType to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subjectType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object subjectSourceId_ = "";
    /**
     * <pre>
     * The subject source ID.
     * </pre>
     *
     * <code>string subject_source_id = 4 [json_name = "subject_source_id"];</code>
     * @return The subjectSourceId.
     */
    public java.lang.String getSubjectSourceId() {
      java.lang.Object ref = subjectSourceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subjectSourceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The subject source ID.
     * </pre>
     *
     * <code>string subject_source_id = 4 [json_name = "subject_source_id"];</code>
     * @return The bytes for subjectSourceId.
     */
    public com.google.protobuf.ByteString
        getSubjectSourceIdBytes() {
      java.lang.Object ref = subjectSourceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subjectSourceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The subject source ID.
     * </pre>
     *
     * <code>string subject_source_id = 4 [json_name = "subject_source_id"];</code>
     * @param value The subjectSourceId to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectSourceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subjectSourceId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The subject source ID.
     * </pre>
     *
     * <code>string subject_source_id = 4 [json_name = "subject_source_id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubjectSourceId() {
      subjectSourceId_ = getDefaultInstance().getSubjectSourceId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The subject source ID.
     * </pre>
     *
     * <code>string subject_source_id = 4 [json_name = "subject_source_id"];</code>
     * @param value The bytes for subjectSourceId to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectSourceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subjectSourceId_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:groups.SubjectOut)
  }

  // @@protoc_insertion_point(class_scope:groups.SubjectOut)
  private static final org.cyverse.de.protobufs.SubjectOut DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.cyverse.de.protobufs.SubjectOut();
  }

  public static org.cyverse.de.protobufs.SubjectOut getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubjectOut>
      PARSER = new com.google.protobuf.AbstractParser<SubjectOut>() {
    @java.lang.Override
    public SubjectOut parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubjectOut> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubjectOut> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.cyverse.de.protobufs.SubjectOut getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

