// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: analysis_submission.proto

package org.cyverse.de.protobufs;

/**
 * Protobuf type {@code analysis.Extra}
 */
public final class Extra extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:analysis.Extra)
    ExtraOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Extra.newBuilder() to construct.
  private Extra(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Extra() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Extra();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.cyverse.de.protobufs.AnalysisSubmissionProtobufs.internal_static_analysis_Extra_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.cyverse.de.protobufs.AnalysisSubmissionProtobufs.internal_static_analysis_Extra_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.cyverse.de.protobufs.Extra.class, org.cyverse.de.protobufs.Extra.Builder.class);
  }

  public static final int HT_CONDOR_FIELD_NUMBER = 1;
  private org.cyverse.de.protobufs.HTCondorExtraInfo htCondor_;
  /**
   * <code>.analysis.HTCondorExtraInfo ht_condor = 1;</code>
   * @return Whether the htCondor field is set.
   */
  @java.lang.Override
  public boolean hasHtCondor() {
    return htCondor_ != null;
  }
  /**
   * <code>.analysis.HTCondorExtraInfo ht_condor = 1;</code>
   * @return The htCondor.
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.HTCondorExtraInfo getHtCondor() {
    return htCondor_ == null ? org.cyverse.de.protobufs.HTCondorExtraInfo.getDefaultInstance() : htCondor_;
  }
  /**
   * <code>.analysis.HTCondorExtraInfo ht_condor = 1;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.HTCondorExtraInfoOrBuilder getHtCondorOrBuilder() {
    return getHtCondor();
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
    if (htCondor_ != null) {
      output.writeMessage(1, getHtCondor());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (htCondor_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHtCondor());
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
    if (!(obj instanceof org.cyverse.de.protobufs.Extra)) {
      return super.equals(obj);
    }
    org.cyverse.de.protobufs.Extra other = (org.cyverse.de.protobufs.Extra) obj;

    if (hasHtCondor() != other.hasHtCondor()) return false;
    if (hasHtCondor()) {
      if (!getHtCondor()
          .equals(other.getHtCondor())) return false;
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
    if (hasHtCondor()) {
      hash = (37 * hash) + HT_CONDOR_FIELD_NUMBER;
      hash = (53 * hash) + getHtCondor().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.cyverse.de.protobufs.Extra parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.Extra parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.Extra parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.Extra parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.Extra parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.Extra parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.Extra parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.Extra parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.Extra parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.Extra parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.Extra parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.Extra parseFrom(
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
  public static Builder newBuilder(org.cyverse.de.protobufs.Extra prototype) {
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
   * Protobuf type {@code analysis.Extra}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:analysis.Extra)
      org.cyverse.de.protobufs.ExtraOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.cyverse.de.protobufs.AnalysisSubmissionProtobufs.internal_static_analysis_Extra_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.cyverse.de.protobufs.AnalysisSubmissionProtobufs.internal_static_analysis_Extra_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.cyverse.de.protobufs.Extra.class, org.cyverse.de.protobufs.Extra.Builder.class);
    }

    // Construct using org.cyverse.de.protobufs.Extra.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (htCondorBuilder_ == null) {
        htCondor_ = null;
      } else {
        htCondor_ = null;
        htCondorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.cyverse.de.protobufs.AnalysisSubmissionProtobufs.internal_static_analysis_Extra_descriptor;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.Extra getDefaultInstanceForType() {
      return org.cyverse.de.protobufs.Extra.getDefaultInstance();
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.Extra build() {
      org.cyverse.de.protobufs.Extra result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.Extra buildPartial() {
      org.cyverse.de.protobufs.Extra result = new org.cyverse.de.protobufs.Extra(this);
      if (htCondorBuilder_ == null) {
        result.htCondor_ = htCondor_;
      } else {
        result.htCondor_ = htCondorBuilder_.build();
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
      if (other instanceof org.cyverse.de.protobufs.Extra) {
        return mergeFrom((org.cyverse.de.protobufs.Extra)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.cyverse.de.protobufs.Extra other) {
      if (other == org.cyverse.de.protobufs.Extra.getDefaultInstance()) return this;
      if (other.hasHtCondor()) {
        mergeHtCondor(other.getHtCondor());
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
                  getHtCondorFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private org.cyverse.de.protobufs.HTCondorExtraInfo htCondor_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.cyverse.de.protobufs.HTCondorExtraInfo, org.cyverse.de.protobufs.HTCondorExtraInfo.Builder, org.cyverse.de.protobufs.HTCondorExtraInfoOrBuilder> htCondorBuilder_;
    /**
     * <code>.analysis.HTCondorExtraInfo ht_condor = 1;</code>
     * @return Whether the htCondor field is set.
     */
    public boolean hasHtCondor() {
      return htCondorBuilder_ != null || htCondor_ != null;
    }
    /**
     * <code>.analysis.HTCondorExtraInfo ht_condor = 1;</code>
     * @return The htCondor.
     */
    public org.cyverse.de.protobufs.HTCondorExtraInfo getHtCondor() {
      if (htCondorBuilder_ == null) {
        return htCondor_ == null ? org.cyverse.de.protobufs.HTCondorExtraInfo.getDefaultInstance() : htCondor_;
      } else {
        return htCondorBuilder_.getMessage();
      }
    }
    /**
     * <code>.analysis.HTCondorExtraInfo ht_condor = 1;</code>
     */
    public Builder setHtCondor(org.cyverse.de.protobufs.HTCondorExtraInfo value) {
      if (htCondorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        htCondor_ = value;
        onChanged();
      } else {
        htCondorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.analysis.HTCondorExtraInfo ht_condor = 1;</code>
     */
    public Builder setHtCondor(
        org.cyverse.de.protobufs.HTCondorExtraInfo.Builder builderForValue) {
      if (htCondorBuilder_ == null) {
        htCondor_ = builderForValue.build();
        onChanged();
      } else {
        htCondorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.analysis.HTCondorExtraInfo ht_condor = 1;</code>
     */
    public Builder mergeHtCondor(org.cyverse.de.protobufs.HTCondorExtraInfo value) {
      if (htCondorBuilder_ == null) {
        if (htCondor_ != null) {
          htCondor_ =
            org.cyverse.de.protobufs.HTCondorExtraInfo.newBuilder(htCondor_).mergeFrom(value).buildPartial();
        } else {
          htCondor_ = value;
        }
        onChanged();
      } else {
        htCondorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.analysis.HTCondorExtraInfo ht_condor = 1;</code>
     */
    public Builder clearHtCondor() {
      if (htCondorBuilder_ == null) {
        htCondor_ = null;
        onChanged();
      } else {
        htCondor_ = null;
        htCondorBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.analysis.HTCondorExtraInfo ht_condor = 1;</code>
     */
    public org.cyverse.de.protobufs.HTCondorExtraInfo.Builder getHtCondorBuilder() {
      
      onChanged();
      return getHtCondorFieldBuilder().getBuilder();
    }
    /**
     * <code>.analysis.HTCondorExtraInfo ht_condor = 1;</code>
     */
    public org.cyverse.de.protobufs.HTCondorExtraInfoOrBuilder getHtCondorOrBuilder() {
      if (htCondorBuilder_ != null) {
        return htCondorBuilder_.getMessageOrBuilder();
      } else {
        return htCondor_ == null ?
            org.cyverse.de.protobufs.HTCondorExtraInfo.getDefaultInstance() : htCondor_;
      }
    }
    /**
     * <code>.analysis.HTCondorExtraInfo ht_condor = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.cyverse.de.protobufs.HTCondorExtraInfo, org.cyverse.de.protobufs.HTCondorExtraInfo.Builder, org.cyverse.de.protobufs.HTCondorExtraInfoOrBuilder> 
        getHtCondorFieldBuilder() {
      if (htCondorBuilder_ == null) {
        htCondorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.cyverse.de.protobufs.HTCondorExtraInfo, org.cyverse.de.protobufs.HTCondorExtraInfo.Builder, org.cyverse.de.protobufs.HTCondorExtraInfoOrBuilder>(
                getHtCondor(),
                getParentForChildren(),
                isClean());
        htCondor_ = null;
      }
      return htCondorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:analysis.Extra)
  }

  // @@protoc_insertion_point(class_scope:analysis.Extra)
  private static final org.cyverse.de.protobufs.Extra DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.cyverse.de.protobufs.Extra();
  }

  public static org.cyverse.de.protobufs.Extra getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Extra>
      PARSER = new com.google.protobuf.AbstractParser<Extra>() {
    @java.lang.Override
    public Extra parsePartialFrom(
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

  public static com.google.protobuf.Parser<Extra> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Extra> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.cyverse.de.protobufs.Extra getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

