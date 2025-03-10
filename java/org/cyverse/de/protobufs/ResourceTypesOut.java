// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: groups.proto
// Protobuf Java Version: 4.29.3

package org.cyverse.de.protobufs;

/**
 * <pre>
 * *
 * A list of resource types.
 * </pre>
 *
 * Protobuf type {@code groups.ResourceTypesOut}
 */
public final class ResourceTypesOut extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:groups.ResourceTypesOut)
    ResourceTypesOutOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      ResourceTypesOut.class.getName());
  }
  // Use ResourceTypesOut.newBuilder() to construct.
  private ResourceTypesOut(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ResourceTypesOut() {
    resourceTypes_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.cyverse.de.protobufs.GroupsProtobufs.internal_static_groups_ResourceTypesOut_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.cyverse.de.protobufs.GroupsProtobufs.internal_static_groups_ResourceTypesOut_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.cyverse.de.protobufs.ResourceTypesOut.class, org.cyverse.de.protobufs.ResourceTypesOut.Builder.class);
  }

  public static final int RESOURCE_TYPES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<org.cyverse.de.protobufs.ResourceTypeOut> resourceTypes_;
  /**
   * <pre>
   * The list of resource types.
   * </pre>
   *
   * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
   */
  @java.lang.Override
  public java.util.List<org.cyverse.de.protobufs.ResourceTypeOut> getResourceTypesList() {
    return resourceTypes_;
  }
  /**
   * <pre>
   * The list of resource types.
   * </pre>
   *
   * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.cyverse.de.protobufs.ResourceTypeOutOrBuilder> 
      getResourceTypesOrBuilderList() {
    return resourceTypes_;
  }
  /**
   * <pre>
   * The list of resource types.
   * </pre>
   *
   * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
   */
  @java.lang.Override
  public int getResourceTypesCount() {
    return resourceTypes_.size();
  }
  /**
   * <pre>
   * The list of resource types.
   * </pre>
   *
   * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.ResourceTypeOut getResourceTypes(int index) {
    return resourceTypes_.get(index);
  }
  /**
   * <pre>
   * The list of resource types.
   * </pre>
   *
   * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.ResourceTypeOutOrBuilder getResourceTypesOrBuilder(
      int index) {
    return resourceTypes_.get(index);
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
    for (int i = 0; i < resourceTypes_.size(); i++) {
      output.writeMessage(1, resourceTypes_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < resourceTypes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, resourceTypes_.get(i));
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
    if (!(obj instanceof org.cyverse.de.protobufs.ResourceTypesOut)) {
      return super.equals(obj);
    }
    org.cyverse.de.protobufs.ResourceTypesOut other = (org.cyverse.de.protobufs.ResourceTypesOut) obj;

    if (!getResourceTypesList()
        .equals(other.getResourceTypesList())) return false;
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
    if (getResourceTypesCount() > 0) {
      hash = (37 * hash) + RESOURCE_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getResourceTypesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.cyverse.de.protobufs.ResourceTypesOut parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.ResourceTypesOut parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.ResourceTypesOut parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.ResourceTypesOut parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.ResourceTypesOut parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.ResourceTypesOut parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.ResourceTypesOut parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.ResourceTypesOut parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.cyverse.de.protobufs.ResourceTypesOut parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.cyverse.de.protobufs.ResourceTypesOut parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.ResourceTypesOut parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.ResourceTypesOut parseFrom(
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
  public static Builder newBuilder(org.cyverse.de.protobufs.ResourceTypesOut prototype) {
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
   * A list of resource types.
   * </pre>
   *
   * Protobuf type {@code groups.ResourceTypesOut}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:groups.ResourceTypesOut)
      org.cyverse.de.protobufs.ResourceTypesOutOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.cyverse.de.protobufs.GroupsProtobufs.internal_static_groups_ResourceTypesOut_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.cyverse.de.protobufs.GroupsProtobufs.internal_static_groups_ResourceTypesOut_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.cyverse.de.protobufs.ResourceTypesOut.class, org.cyverse.de.protobufs.ResourceTypesOut.Builder.class);
    }

    // Construct using org.cyverse.de.protobufs.ResourceTypesOut.newBuilder()
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
      if (resourceTypesBuilder_ == null) {
        resourceTypes_ = java.util.Collections.emptyList();
      } else {
        resourceTypes_ = null;
        resourceTypesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.cyverse.de.protobufs.GroupsProtobufs.internal_static_groups_ResourceTypesOut_descriptor;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.ResourceTypesOut getDefaultInstanceForType() {
      return org.cyverse.de.protobufs.ResourceTypesOut.getDefaultInstance();
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.ResourceTypesOut build() {
      org.cyverse.de.protobufs.ResourceTypesOut result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.ResourceTypesOut buildPartial() {
      org.cyverse.de.protobufs.ResourceTypesOut result = new org.cyverse.de.protobufs.ResourceTypesOut(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.cyverse.de.protobufs.ResourceTypesOut result) {
      if (resourceTypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          resourceTypes_ = java.util.Collections.unmodifiableList(resourceTypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.resourceTypes_ = resourceTypes_;
      } else {
        result.resourceTypes_ = resourceTypesBuilder_.build();
      }
    }

    private void buildPartial0(org.cyverse.de.protobufs.ResourceTypesOut result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.cyverse.de.protobufs.ResourceTypesOut) {
        return mergeFrom((org.cyverse.de.protobufs.ResourceTypesOut)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.cyverse.de.protobufs.ResourceTypesOut other) {
      if (other == org.cyverse.de.protobufs.ResourceTypesOut.getDefaultInstance()) return this;
      if (resourceTypesBuilder_ == null) {
        if (!other.resourceTypes_.isEmpty()) {
          if (resourceTypes_.isEmpty()) {
            resourceTypes_ = other.resourceTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResourceTypesIsMutable();
            resourceTypes_.addAll(other.resourceTypes_);
          }
          onChanged();
        }
      } else {
        if (!other.resourceTypes_.isEmpty()) {
          if (resourceTypesBuilder_.isEmpty()) {
            resourceTypesBuilder_.dispose();
            resourceTypesBuilder_ = null;
            resourceTypes_ = other.resourceTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resourceTypesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getResourceTypesFieldBuilder() : null;
          } else {
            resourceTypesBuilder_.addAllMessages(other.resourceTypes_);
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
              org.cyverse.de.protobufs.ResourceTypeOut m =
                  input.readMessage(
                      org.cyverse.de.protobufs.ResourceTypeOut.parser(),
                      extensionRegistry);
              if (resourceTypesBuilder_ == null) {
                ensureResourceTypesIsMutable();
                resourceTypes_.add(m);
              } else {
                resourceTypesBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<org.cyverse.de.protobufs.ResourceTypeOut> resourceTypes_ =
      java.util.Collections.emptyList();
    private void ensureResourceTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        resourceTypes_ = new java.util.ArrayList<org.cyverse.de.protobufs.ResourceTypeOut>(resourceTypes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        org.cyverse.de.protobufs.ResourceTypeOut, org.cyverse.de.protobufs.ResourceTypeOut.Builder, org.cyverse.de.protobufs.ResourceTypeOutOrBuilder> resourceTypesBuilder_;

    /**
     * <pre>
     * The list of resource types.
     * </pre>
     *
     * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
     */
    public java.util.List<org.cyverse.de.protobufs.ResourceTypeOut> getResourceTypesList() {
      if (resourceTypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(resourceTypes_);
      } else {
        return resourceTypesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of resource types.
     * </pre>
     *
     * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
     */
    public int getResourceTypesCount() {
      if (resourceTypesBuilder_ == null) {
        return resourceTypes_.size();
      } else {
        return resourceTypesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of resource types.
     * </pre>
     *
     * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
     */
    public org.cyverse.de.protobufs.ResourceTypeOut getResourceTypes(int index) {
      if (resourceTypesBuilder_ == null) {
        return resourceTypes_.get(index);
      } else {
        return resourceTypesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of resource types.
     * </pre>
     *
     * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
     */
    public Builder setResourceTypes(
        int index, org.cyverse.de.protobufs.ResourceTypeOut value) {
      if (resourceTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceTypesIsMutable();
        resourceTypes_.set(index, value);
        onChanged();
      } else {
        resourceTypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of resource types.
     * </pre>
     *
     * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
     */
    public Builder setResourceTypes(
        int index, org.cyverse.de.protobufs.ResourceTypeOut.Builder builderForValue) {
      if (resourceTypesBuilder_ == null) {
        ensureResourceTypesIsMutable();
        resourceTypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        resourceTypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of resource types.
     * </pre>
     *
     * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
     */
    public Builder addResourceTypes(org.cyverse.de.protobufs.ResourceTypeOut value) {
      if (resourceTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceTypesIsMutable();
        resourceTypes_.add(value);
        onChanged();
      } else {
        resourceTypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of resource types.
     * </pre>
     *
     * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
     */
    public Builder addResourceTypes(
        int index, org.cyverse.de.protobufs.ResourceTypeOut value) {
      if (resourceTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceTypesIsMutable();
        resourceTypes_.add(index, value);
        onChanged();
      } else {
        resourceTypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of resource types.
     * </pre>
     *
     * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
     */
    public Builder addResourceTypes(
        org.cyverse.de.protobufs.ResourceTypeOut.Builder builderForValue) {
      if (resourceTypesBuilder_ == null) {
        ensureResourceTypesIsMutable();
        resourceTypes_.add(builderForValue.build());
        onChanged();
      } else {
        resourceTypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of resource types.
     * </pre>
     *
     * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
     */
    public Builder addResourceTypes(
        int index, org.cyverse.de.protobufs.ResourceTypeOut.Builder builderForValue) {
      if (resourceTypesBuilder_ == null) {
        ensureResourceTypesIsMutable();
        resourceTypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        resourceTypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of resource types.
     * </pre>
     *
     * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
     */
    public Builder addAllResourceTypes(
        java.lang.Iterable<? extends org.cyverse.de.protobufs.ResourceTypeOut> values) {
      if (resourceTypesBuilder_ == null) {
        ensureResourceTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, resourceTypes_);
        onChanged();
      } else {
        resourceTypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of resource types.
     * </pre>
     *
     * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
     */
    public Builder clearResourceTypes() {
      if (resourceTypesBuilder_ == null) {
        resourceTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resourceTypesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of resource types.
     * </pre>
     *
     * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
     */
    public Builder removeResourceTypes(int index) {
      if (resourceTypesBuilder_ == null) {
        ensureResourceTypesIsMutable();
        resourceTypes_.remove(index);
        onChanged();
      } else {
        resourceTypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of resource types.
     * </pre>
     *
     * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
     */
    public org.cyverse.de.protobufs.ResourceTypeOut.Builder getResourceTypesBuilder(
        int index) {
      return getResourceTypesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of resource types.
     * </pre>
     *
     * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
     */
    public org.cyverse.de.protobufs.ResourceTypeOutOrBuilder getResourceTypesOrBuilder(
        int index) {
      if (resourceTypesBuilder_ == null) {
        return resourceTypes_.get(index);  } else {
        return resourceTypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of resource types.
     * </pre>
     *
     * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
     */
    public java.util.List<? extends org.cyverse.de.protobufs.ResourceTypeOutOrBuilder> 
         getResourceTypesOrBuilderList() {
      if (resourceTypesBuilder_ != null) {
        return resourceTypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(resourceTypes_);
      }
    }
    /**
     * <pre>
     * The list of resource types.
     * </pre>
     *
     * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
     */
    public org.cyverse.de.protobufs.ResourceTypeOut.Builder addResourceTypesBuilder() {
      return getResourceTypesFieldBuilder().addBuilder(
          org.cyverse.de.protobufs.ResourceTypeOut.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of resource types.
     * </pre>
     *
     * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
     */
    public org.cyverse.de.protobufs.ResourceTypeOut.Builder addResourceTypesBuilder(
        int index) {
      return getResourceTypesFieldBuilder().addBuilder(
          index, org.cyverse.de.protobufs.ResourceTypeOut.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of resource types.
     * </pre>
     *
     * <code>repeated .groups.ResourceTypeOut resource_types = 1 [json_name = "resource_types"];</code>
     */
    public java.util.List<org.cyverse.de.protobufs.ResourceTypeOut.Builder> 
         getResourceTypesBuilderList() {
      return getResourceTypesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        org.cyverse.de.protobufs.ResourceTypeOut, org.cyverse.de.protobufs.ResourceTypeOut.Builder, org.cyverse.de.protobufs.ResourceTypeOutOrBuilder> 
        getResourceTypesFieldBuilder() {
      if (resourceTypesBuilder_ == null) {
        resourceTypesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            org.cyverse.de.protobufs.ResourceTypeOut, org.cyverse.de.protobufs.ResourceTypeOut.Builder, org.cyverse.de.protobufs.ResourceTypeOutOrBuilder>(
                resourceTypes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        resourceTypes_ = null;
      }
      return resourceTypesBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:groups.ResourceTypesOut)
  }

  // @@protoc_insertion_point(class_scope:groups.ResourceTypesOut)
  private static final org.cyverse.de.protobufs.ResourceTypesOut DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.cyverse.de.protobufs.ResourceTypesOut();
  }

  public static org.cyverse.de.protobufs.ResourceTypesOut getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceTypesOut>
      PARSER = new com.google.protobuf.AbstractParser<ResourceTypesOut>() {
    @java.lang.Override
    public ResourceTypesOut parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourceTypesOut> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceTypesOut> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.cyverse.de.protobufs.ResourceTypesOut getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

