// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: qms_resource_types.proto
// Protobuf Java Version: 4.31.1

package org.cyverse.de.protobufs;

/**
 * <pre>
 * *
 * Representation of a resource type.
 * </pre>
 *
 * Protobuf type {@code qms.ResourceType}
 */
@com.google.protobuf.Generated
public final class ResourceType extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:qms.ResourceType)
    ResourceTypeOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
      /* patch= */ 1,
      /* suffix= */ "",
      ResourceType.class.getName());
  }
  // Use ResourceType.newBuilder() to construct.
  private ResourceType(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ResourceType() {
    uuid_ = "";
    name_ = "";
    unit_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.cyverse.de.protobufs.QMSResourceTypeProtobufs.internal_static_qms_ResourceType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.cyverse.de.protobufs.QMSResourceTypeProtobufs.internal_static_qms_ResourceType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.cyverse.de.protobufs.ResourceType.class, org.cyverse.de.protobufs.ResourceType.Builder.class);
  }

  public static final int UUID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uuid_ = "";
  /**
   * <pre>
   * The unique identifier.
   * </pre>
   *
   * <code>string uuid = 1;</code>
   * @return The uuid.
   */
  @java.lang.Override
  public java.lang.String getUuid() {
    java.lang.Object ref = uuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uuid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The unique identifier.
   * </pre>
   *
   * <code>string uuid = 1;</code>
   * @return The bytes for uuid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUuidBytes() {
    java.lang.Object ref = uuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The name of the resource. Will usually be "data.size" and "cpu.hours".
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the resource. Will usually be "data.size" and "cpu.hours".
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UNIT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object unit_ = "";
  /**
   * <pre>
   * The units used for the resource. Usually "bytes" or "cpu hours".
   * </pre>
   *
   * <code>string unit = 3;</code>
   * @return The unit.
   */
  @java.lang.Override
  public java.lang.String getUnit() {
    java.lang.Object ref = unit_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      unit_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The units used for the resource. Usually "bytes" or "cpu hours".
   * </pre>
   *
   * <code>string unit = 3;</code>
   * @return The bytes for unit.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUnitBytes() {
    java.lang.Object ref = unit_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      unit_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONSUMABLE_FIELD_NUMBER = 4;
  private boolean consumable_ = false;
  /**
   * <pre>
   * Whether or not using the resource consumes a portion of the allocation permanently.
   * </pre>
   *
   * <code>bool consumable = 4;</code>
   * @return The consumable.
   */
  @java.lang.Override
  public boolean getConsumable() {
    return consumable_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(uuid_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, uuid_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, name_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(unit_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, unit_);
    }
    if (consumable_ != false) {
      output.writeBool(4, consumable_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(uuid_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, uuid_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, name_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(unit_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, unit_);
    }
    if (consumable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, consumable_);
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
    if (!(obj instanceof org.cyverse.de.protobufs.ResourceType)) {
      return super.equals(obj);
    }
    org.cyverse.de.protobufs.ResourceType other = (org.cyverse.de.protobufs.ResourceType) obj;

    if (!getUuid()
        .equals(other.getUuid())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getUnit()
        .equals(other.getUnit())) return false;
    if (getConsumable()
        != other.getConsumable()) return false;
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
    hash = (37 * hash) + UUID_FIELD_NUMBER;
    hash = (53 * hash) + getUuid().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + UNIT_FIELD_NUMBER;
    hash = (53 * hash) + getUnit().hashCode();
    hash = (37 * hash) + CONSUMABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getConsumable());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.cyverse.de.protobufs.ResourceType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.ResourceType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.ResourceType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.ResourceType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.ResourceType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.ResourceType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.ResourceType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.ResourceType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.cyverse.de.protobufs.ResourceType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.cyverse.de.protobufs.ResourceType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.ResourceType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.ResourceType parseFrom(
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
  public static Builder newBuilder(org.cyverse.de.protobufs.ResourceType prototype) {
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
   * Representation of a resource type.
   * </pre>
   *
   * Protobuf type {@code qms.ResourceType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qms.ResourceType)
      org.cyverse.de.protobufs.ResourceTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.cyverse.de.protobufs.QMSResourceTypeProtobufs.internal_static_qms_ResourceType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.cyverse.de.protobufs.QMSResourceTypeProtobufs.internal_static_qms_ResourceType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.cyverse.de.protobufs.ResourceType.class, org.cyverse.de.protobufs.ResourceType.Builder.class);
    }

    // Construct using org.cyverse.de.protobufs.ResourceType.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      uuid_ = "";
      name_ = "";
      unit_ = "";
      consumable_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.cyverse.de.protobufs.QMSResourceTypeProtobufs.internal_static_qms_ResourceType_descriptor;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.ResourceType getDefaultInstanceForType() {
      return org.cyverse.de.protobufs.ResourceType.getDefaultInstance();
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.ResourceType build() {
      org.cyverse.de.protobufs.ResourceType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.ResourceType buildPartial() {
      org.cyverse.de.protobufs.ResourceType result = new org.cyverse.de.protobufs.ResourceType(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.cyverse.de.protobufs.ResourceType result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uuid_ = uuid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.unit_ = unit_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.consumable_ = consumable_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.cyverse.de.protobufs.ResourceType) {
        return mergeFrom((org.cyverse.de.protobufs.ResourceType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.cyverse.de.protobufs.ResourceType other) {
      if (other == org.cyverse.de.protobufs.ResourceType.getDefaultInstance()) return this;
      if (!other.getUuid().isEmpty()) {
        uuid_ = other.uuid_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getUnit().isEmpty()) {
        unit_ = other.unit_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getConsumable() != false) {
        setConsumable(other.getConsumable());
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
              uuid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              unit_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              consumable_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object uuid_ = "";
    /**
     * <pre>
     * The unique identifier.
     * </pre>
     *
     * <code>string uuid = 1;</code>
     * @return The uuid.
     */
    public java.lang.String getUuid() {
      java.lang.Object ref = uuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The unique identifier.
     * </pre>
     *
     * <code>string uuid = 1;</code>
     * @return The bytes for uuid.
     */
    public com.google.protobuf.ByteString
        getUuidBytes() {
      java.lang.Object ref = uuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The unique identifier.
     * </pre>
     *
     * <code>string uuid = 1;</code>
     * @param value The uuid to set.
     * @return This builder for chaining.
     */
    public Builder setUuid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uuid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique identifier.
     * </pre>
     *
     * <code>string uuid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUuid() {
      uuid_ = getDefaultInstance().getUuid();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique identifier.
     * </pre>
     *
     * <code>string uuid = 1;</code>
     * @param value The bytes for uuid to set.
     * @return This builder for chaining.
     */
    public Builder setUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uuid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The name of the resource. Will usually be "data.size" and "cpu.hours".
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the resource. Will usually be "data.size" and "cpu.hours".
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the resource. Will usually be "data.size" and "cpu.hours".
     * </pre>
     *
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the resource. Will usually be "data.size" and "cpu.hours".
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the resource. Will usually be "data.size" and "cpu.hours".
     * </pre>
     *
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object unit_ = "";
    /**
     * <pre>
     * The units used for the resource. Usually "bytes" or "cpu hours".
     * </pre>
     *
     * <code>string unit = 3;</code>
     * @return The unit.
     */
    public java.lang.String getUnit() {
      java.lang.Object ref = unit_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unit_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The units used for the resource. Usually "bytes" or "cpu hours".
     * </pre>
     *
     * <code>string unit = 3;</code>
     * @return The bytes for unit.
     */
    public com.google.protobuf.ByteString
        getUnitBytes() {
      java.lang.Object ref = unit_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unit_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The units used for the resource. Usually "bytes" or "cpu hours".
     * </pre>
     *
     * <code>string unit = 3;</code>
     * @param value The unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnit(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      unit_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The units used for the resource. Usually "bytes" or "cpu hours".
     * </pre>
     *
     * <code>string unit = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnit() {
      unit_ = getDefaultInstance().getUnit();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The units used for the resource. Usually "bytes" or "cpu hours".
     * </pre>
     *
     * <code>string unit = 3;</code>
     * @param value The bytes for unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnitBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      unit_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean consumable_ ;
    /**
     * <pre>
     * Whether or not using the resource consumes a portion of the allocation permanently.
     * </pre>
     *
     * <code>bool consumable = 4;</code>
     * @return The consumable.
     */
    @java.lang.Override
    public boolean getConsumable() {
      return consumable_;
    }
    /**
     * <pre>
     * Whether or not using the resource consumes a portion of the allocation permanently.
     * </pre>
     *
     * <code>bool consumable = 4;</code>
     * @param value The consumable to set.
     * @return This builder for chaining.
     */
    public Builder setConsumable(boolean value) {

      consumable_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether or not using the resource consumes a portion of the allocation permanently.
     * </pre>
     *
     * <code>bool consumable = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearConsumable() {
      bitField0_ = (bitField0_ & ~0x00000008);
      consumable_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:qms.ResourceType)
  }

  // @@protoc_insertion_point(class_scope:qms.ResourceType)
  private static final org.cyverse.de.protobufs.ResourceType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.cyverse.de.protobufs.ResourceType();
  }

  public static org.cyverse.de.protobufs.ResourceType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceType>
      PARSER = new com.google.protobuf.AbstractParser<ResourceType>() {
    @java.lang.Override
    public ResourceType parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourceType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.cyverse.de.protobufs.ResourceType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

