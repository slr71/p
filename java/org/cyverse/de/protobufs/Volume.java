// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: containers.proto
// Protobuf Java Version: 4.31.1

package org.cyverse.de.protobufs;

/**
 * <pre>
 * *
 * A container volume. Used for mapping host paths into a container.
 *
 * Correlates to the 'container_volumes' table in the 'de' database.
 * </pre>
 *
 * Protobuf type {@code containers.Volume}
 */
@com.google.protobuf.Generated
public final class Volume extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:containers.Volume)
    VolumeOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
      /* patch= */ 1,
      /* suffix= */ "",
      Volume.class.getName());
  }
  // Use Volume.newBuilder() to construct.
  private Volume(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Volume() {
    hostPath_ = "";
    containerPath_ = "";
    mode_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.cyverse.de.protobufs.ContainersProtobufs.internal_static_containers_Volume_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.cyverse.de.protobufs.ContainersProtobufs.internal_static_containers_Volume_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.cyverse.de.protobufs.Volume.class, org.cyverse.de.protobufs.Volume.Builder.class);
  }

  public static final int HOST_PATH_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object hostPath_ = "";
  /**
   * <pre>
   * The absolute path to a file/directory on the container host/k8s node.
   * </pre>
   *
   * <code>string host_path = 1 [json_name = "host_path"];</code>
   * @return The hostPath.
   */
  @java.lang.Override
  public java.lang.String getHostPath() {
    java.lang.Object ref = hostPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The absolute path to a file/directory on the container host/k8s node.
   * </pre>
   *
   * <code>string host_path = 1 [json_name = "host_path"];</code>
   * @return The bytes for hostPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHostPathBytes() {
    java.lang.Object ref = hostPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTAINER_PATH_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object containerPath_ = "";
  /**
   * <pre>
   * The path to mount the host path to inside of the container.
   * </pre>
   *
   * <code>string container_path = 2 [json_name = "container_path"];</code>
   * @return The containerPath.
   */
  @java.lang.Override
  public java.lang.String getContainerPath() {
    java.lang.Object ref = containerPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      containerPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The path to mount the host path to inside of the container.
   * </pre>
   *
   * <code>string container_path = 2 [json_name = "container_path"];</code>
   * @return The bytes for containerPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContainerPathBytes() {
    java.lang.Object ref = containerPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      containerPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int READ_ONLY_FIELD_NUMBER = 3;
  private boolean readOnly_ = false;
  /**
   * <pre>
   * Whether the mount point in the container should be read only.
   * </pre>
   *
   * <code>bool read_only = 3 [json_name = "read_only"];</code>
   * @return The readOnly.
   */
  @java.lang.Override
  public boolean getReadOnly() {
    return readOnly_;
  }

  public static final int MODE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object mode_ = "";
  /**
   * <pre>
   * The mode the mount point should have once mounted.
   * </pre>
   *
   * <code>string mode = 4;</code>
   * @return The mode.
   */
  @java.lang.Override
  public java.lang.String getMode() {
    java.lang.Object ref = mode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The mode the mount point should have once mounted.
   * </pre>
   *
   * <code>string mode = 4;</code>
   * @return The bytes for mode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModeBytes() {
    java.lang.Object ref = mode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mode_ = b;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(hostPath_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, hostPath_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(containerPath_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, containerPath_);
    }
    if (readOnly_ != false) {
      output.writeBool(3, readOnly_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(mode_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, mode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(hostPath_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, hostPath_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(containerPath_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, containerPath_);
    }
    if (readOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, readOnly_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(mode_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, mode_);
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
    if (!(obj instanceof org.cyverse.de.protobufs.Volume)) {
      return super.equals(obj);
    }
    org.cyverse.de.protobufs.Volume other = (org.cyverse.de.protobufs.Volume) obj;

    if (!getHostPath()
        .equals(other.getHostPath())) return false;
    if (!getContainerPath()
        .equals(other.getContainerPath())) return false;
    if (getReadOnly()
        != other.getReadOnly()) return false;
    if (!getMode()
        .equals(other.getMode())) return false;
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
    hash = (37 * hash) + HOST_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getHostPath().hashCode();
    hash = (37 * hash) + CONTAINER_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getContainerPath().hashCode();
    hash = (37 * hash) + READ_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReadOnly());
    hash = (37 * hash) + MODE_FIELD_NUMBER;
    hash = (53 * hash) + getMode().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.cyverse.de.protobufs.Volume parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.Volume parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.Volume parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.Volume parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.Volume parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.Volume parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.Volume parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.Volume parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.cyverse.de.protobufs.Volume parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.cyverse.de.protobufs.Volume parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.Volume parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.Volume parseFrom(
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
  public static Builder newBuilder(org.cyverse.de.protobufs.Volume prototype) {
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
   * A container volume. Used for mapping host paths into a container.
   *
   * Correlates to the 'container_volumes' table in the 'de' database.
   * </pre>
   *
   * Protobuf type {@code containers.Volume}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:containers.Volume)
      org.cyverse.de.protobufs.VolumeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.cyverse.de.protobufs.ContainersProtobufs.internal_static_containers_Volume_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.cyverse.de.protobufs.ContainersProtobufs.internal_static_containers_Volume_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.cyverse.de.protobufs.Volume.class, org.cyverse.de.protobufs.Volume.Builder.class);
    }

    // Construct using org.cyverse.de.protobufs.Volume.newBuilder()
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
      hostPath_ = "";
      containerPath_ = "";
      readOnly_ = false;
      mode_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.cyverse.de.protobufs.ContainersProtobufs.internal_static_containers_Volume_descriptor;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.Volume getDefaultInstanceForType() {
      return org.cyverse.de.protobufs.Volume.getDefaultInstance();
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.Volume build() {
      org.cyverse.de.protobufs.Volume result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.Volume buildPartial() {
      org.cyverse.de.protobufs.Volume result = new org.cyverse.de.protobufs.Volume(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.cyverse.de.protobufs.Volume result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hostPath_ = hostPath_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.containerPath_ = containerPath_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.readOnly_ = readOnly_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.mode_ = mode_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.cyverse.de.protobufs.Volume) {
        return mergeFrom((org.cyverse.de.protobufs.Volume)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.cyverse.de.protobufs.Volume other) {
      if (other == org.cyverse.de.protobufs.Volume.getDefaultInstance()) return this;
      if (!other.getHostPath().isEmpty()) {
        hostPath_ = other.hostPath_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getContainerPath().isEmpty()) {
        containerPath_ = other.containerPath_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getReadOnly() != false) {
        setReadOnly(other.getReadOnly());
      }
      if (!other.getMode().isEmpty()) {
        mode_ = other.mode_;
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
              hostPath_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              containerPath_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              readOnly_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              mode_ = input.readStringRequireUtf8();
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

    private java.lang.Object hostPath_ = "";
    /**
     * <pre>
     * The absolute path to a file/directory on the container host/k8s node.
     * </pre>
     *
     * <code>string host_path = 1 [json_name = "host_path"];</code>
     * @return The hostPath.
     */
    public java.lang.String getHostPath() {
      java.lang.Object ref = hostPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The absolute path to a file/directory on the container host/k8s node.
     * </pre>
     *
     * <code>string host_path = 1 [json_name = "host_path"];</code>
     * @return The bytes for hostPath.
     */
    public com.google.protobuf.ByteString
        getHostPathBytes() {
      java.lang.Object ref = hostPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The absolute path to a file/directory on the container host/k8s node.
     * </pre>
     *
     * <code>string host_path = 1 [json_name = "host_path"];</code>
     * @param value The hostPath to set.
     * @return This builder for chaining.
     */
    public Builder setHostPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      hostPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The absolute path to a file/directory on the container host/k8s node.
     * </pre>
     *
     * <code>string host_path = 1 [json_name = "host_path"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHostPath() {
      hostPath_ = getDefaultInstance().getHostPath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The absolute path to a file/directory on the container host/k8s node.
     * </pre>
     *
     * <code>string host_path = 1 [json_name = "host_path"];</code>
     * @param value The bytes for hostPath to set.
     * @return This builder for chaining.
     */
    public Builder setHostPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      hostPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object containerPath_ = "";
    /**
     * <pre>
     * The path to mount the host path to inside of the container.
     * </pre>
     *
     * <code>string container_path = 2 [json_name = "container_path"];</code>
     * @return The containerPath.
     */
    public java.lang.String getContainerPath() {
      java.lang.Object ref = containerPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        containerPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The path to mount the host path to inside of the container.
     * </pre>
     *
     * <code>string container_path = 2 [json_name = "container_path"];</code>
     * @return The bytes for containerPath.
     */
    public com.google.protobuf.ByteString
        getContainerPathBytes() {
      java.lang.Object ref = containerPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        containerPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The path to mount the host path to inside of the container.
     * </pre>
     *
     * <code>string container_path = 2 [json_name = "container_path"];</code>
     * @param value The containerPath to set.
     * @return This builder for chaining.
     */
    public Builder setContainerPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      containerPath_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The path to mount the host path to inside of the container.
     * </pre>
     *
     * <code>string container_path = 2 [json_name = "container_path"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContainerPath() {
      containerPath_ = getDefaultInstance().getContainerPath();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The path to mount the host path to inside of the container.
     * </pre>
     *
     * <code>string container_path = 2 [json_name = "container_path"];</code>
     * @param value The bytes for containerPath to set.
     * @return This builder for chaining.
     */
    public Builder setContainerPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      containerPath_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean readOnly_ ;
    /**
     * <pre>
     * Whether the mount point in the container should be read only.
     * </pre>
     *
     * <code>bool read_only = 3 [json_name = "read_only"];</code>
     * @return The readOnly.
     */
    @java.lang.Override
    public boolean getReadOnly() {
      return readOnly_;
    }
    /**
     * <pre>
     * Whether the mount point in the container should be read only.
     * </pre>
     *
     * <code>bool read_only = 3 [json_name = "read_only"];</code>
     * @param value The readOnly to set.
     * @return This builder for chaining.
     */
    public Builder setReadOnly(boolean value) {

      readOnly_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the mount point in the container should be read only.
     * </pre>
     *
     * <code>bool read_only = 3 [json_name = "read_only"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReadOnly() {
      bitField0_ = (bitField0_ & ~0x00000004);
      readOnly_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object mode_ = "";
    /**
     * <pre>
     * The mode the mount point should have once mounted.
     * </pre>
     *
     * <code>string mode = 4;</code>
     * @return The mode.
     */
    public java.lang.String getMode() {
      java.lang.Object ref = mode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The mode the mount point should have once mounted.
     * </pre>
     *
     * <code>string mode = 4;</code>
     * @return The bytes for mode.
     */
    public com.google.protobuf.ByteString
        getModeBytes() {
      java.lang.Object ref = mode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The mode the mount point should have once mounted.
     * </pre>
     *
     * <code>string mode = 4;</code>
     * @param value The mode to set.
     * @return This builder for chaining.
     */
    public Builder setMode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      mode_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mode the mount point should have once mounted.
     * </pre>
     *
     * <code>string mode = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMode() {
      mode_ = getDefaultInstance().getMode();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mode the mount point should have once mounted.
     * </pre>
     *
     * <code>string mode = 4;</code>
     * @param value The bytes for mode to set.
     * @return This builder for chaining.
     */
    public Builder setModeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      mode_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:containers.Volume)
  }

  // @@protoc_insertion_point(class_scope:containers.Volume)
  private static final org.cyverse.de.protobufs.Volume DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.cyverse.de.protobufs.Volume();
  }

  public static org.cyverse.de.protobufs.Volume getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Volume>
      PARSER = new com.google.protobuf.AbstractParser<Volume>() {
    @java.lang.Override
    public Volume parsePartialFrom(
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

  public static com.google.protobuf.Parser<Volume> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Volume> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.cyverse.de.protobufs.Volume getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

