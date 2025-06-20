// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: analysis_requests.proto
// Protobuf Java Version: 4.31.1

package org.cyverse.de.protobufs;

/**
 * Protobuf type {@code analysis.AnalysisRecordList}
 */
@com.google.protobuf.Generated
public final class AnalysisRecordList extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:analysis.AnalysisRecordList)
    AnalysisRecordListOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
      /* patch= */ 1,
      /* suffix= */ "",
      AnalysisRecordList.class.getName());
  }
  // Use AnalysisRecordList.newBuilder() to construct.
  private AnalysisRecordList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AnalysisRecordList() {
    analyses_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.cyverse.de.protobufs.AnalysisRequestProtobufs.internal_static_analysis_AnalysisRecordList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.cyverse.de.protobufs.AnalysisRequestProtobufs.internal_static_analysis_AnalysisRecordList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.cyverse.de.protobufs.AnalysisRecordList.class, org.cyverse.de.protobufs.AnalysisRecordList.Builder.class);
  }

  private int bitField0_;
  public static final int HEADER_FIELD_NUMBER = 1;
  private org.cyverse.de.protobufs.Header header_;
  /**
   * <code>.header.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.header.Header header = 1;</code>
   * @return The header.
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.Header getHeader() {
    return header_ == null ? org.cyverse.de.protobufs.Header.getDefaultInstance() : header_;
  }
  /**
   * <code>.header.Header header = 1;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.HeaderOrBuilder getHeaderOrBuilder() {
    return header_ == null ? org.cyverse.de.protobufs.Header.getDefaultInstance() : header_;
  }

  public static final int ANALYSES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<org.cyverse.de.protobufs.Analysis> analyses_;
  /**
   * <code>repeated .analysis.Analysis analyses = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.cyverse.de.protobufs.Analysis> getAnalysesList() {
    return analyses_;
  }
  /**
   * <code>repeated .analysis.Analysis analyses = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.cyverse.de.protobufs.AnalysisOrBuilder> 
      getAnalysesOrBuilderList() {
    return analyses_;
  }
  /**
   * <code>repeated .analysis.Analysis analyses = 2;</code>
   */
  @java.lang.Override
  public int getAnalysesCount() {
    return analyses_.size();
  }
  /**
   * <code>repeated .analysis.Analysis analyses = 2;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.Analysis getAnalyses(int index) {
    return analyses_.get(index);
  }
  /**
   * <code>repeated .analysis.Analysis analyses = 2;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.AnalysisOrBuilder getAnalysesOrBuilder(
      int index) {
    return analyses_.get(index);
  }

  public static final int ERROR_FIELD_NUMBER = 7;
  private org.cyverse.de.protobufs.ServiceError error_;
  /**
   * <code>.svcerror.ServiceError error = 7;</code>
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.svcerror.ServiceError error = 7;</code>
   * @return The error.
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.ServiceError getError() {
    return error_ == null ? org.cyverse.de.protobufs.ServiceError.getDefaultInstance() : error_;
  }
  /**
   * <code>.svcerror.ServiceError error = 7;</code>
   */
  @java.lang.Override
  public org.cyverse.de.protobufs.ServiceErrorOrBuilder getErrorOrBuilder() {
    return error_ == null ? org.cyverse.de.protobufs.ServiceError.getDefaultInstance() : error_;
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
    for (int i = 0; i < analyses_.size(); i++) {
      output.writeMessage(2, analyses_.get(i));
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(7, getError());
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
    for (int i = 0; i < analyses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, analyses_.get(i));
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getError());
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
    if (!(obj instanceof org.cyverse.de.protobufs.AnalysisRecordList)) {
      return super.equals(obj);
    }
    org.cyverse.de.protobufs.AnalysisRecordList other = (org.cyverse.de.protobufs.AnalysisRecordList) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (!getAnalysesList()
        .equals(other.getAnalysesList())) return false;
    if (hasError() != other.hasError()) return false;
    if (hasError()) {
      if (!getError()
          .equals(other.getError())) return false;
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (getAnalysesCount() > 0) {
      hash = (37 * hash) + ANALYSES_FIELD_NUMBER;
      hash = (53 * hash) + getAnalysesList().hashCode();
    }
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.cyverse.de.protobufs.AnalysisRecordList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.AnalysisRecordList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.AnalysisRecordList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.AnalysisRecordList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.AnalysisRecordList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cyverse.de.protobufs.AnalysisRecordList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.AnalysisRecordList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.AnalysisRecordList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.cyverse.de.protobufs.AnalysisRecordList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.cyverse.de.protobufs.AnalysisRecordList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cyverse.de.protobufs.AnalysisRecordList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.cyverse.de.protobufs.AnalysisRecordList parseFrom(
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
  public static Builder newBuilder(org.cyverse.de.protobufs.AnalysisRecordList prototype) {
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
   * Protobuf type {@code analysis.AnalysisRecordList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:analysis.AnalysisRecordList)
      org.cyverse.de.protobufs.AnalysisRecordListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.cyverse.de.protobufs.AnalysisRequestProtobufs.internal_static_analysis_AnalysisRecordList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.cyverse.de.protobufs.AnalysisRequestProtobufs.internal_static_analysis_AnalysisRecordList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.cyverse.de.protobufs.AnalysisRecordList.class, org.cyverse.de.protobufs.AnalysisRecordList.Builder.class);
    }

    // Construct using org.cyverse.de.protobufs.AnalysisRecordList.newBuilder()
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
        internalGetAnalysesFieldBuilder();
        internalGetErrorFieldBuilder();
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
      if (analysesBuilder_ == null) {
        analyses_ = java.util.Collections.emptyList();
      } else {
        analyses_ = null;
        analysesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.cyverse.de.protobufs.AnalysisRequestProtobufs.internal_static_analysis_AnalysisRecordList_descriptor;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.AnalysisRecordList getDefaultInstanceForType() {
      return org.cyverse.de.protobufs.AnalysisRecordList.getDefaultInstance();
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.AnalysisRecordList build() {
      org.cyverse.de.protobufs.AnalysisRecordList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.cyverse.de.protobufs.AnalysisRecordList buildPartial() {
      org.cyverse.de.protobufs.AnalysisRecordList result = new org.cyverse.de.protobufs.AnalysisRecordList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.cyverse.de.protobufs.AnalysisRecordList result) {
      if (analysesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          analyses_ = java.util.Collections.unmodifiableList(analyses_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.analyses_ = analyses_;
      } else {
        result.analyses_ = analysesBuilder_.build();
      }
    }

    private void buildPartial0(org.cyverse.de.protobufs.AnalysisRecordList result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.header_ = headerBuilder_ == null
            ? header_
            : headerBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.error_ = errorBuilder_ == null
            ? error_
            : errorBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.cyverse.de.protobufs.AnalysisRecordList) {
        return mergeFrom((org.cyverse.de.protobufs.AnalysisRecordList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.cyverse.de.protobufs.AnalysisRecordList other) {
      if (other == org.cyverse.de.protobufs.AnalysisRecordList.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (analysesBuilder_ == null) {
        if (!other.analyses_.isEmpty()) {
          if (analyses_.isEmpty()) {
            analyses_ = other.analyses_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAnalysesIsMutable();
            analyses_.addAll(other.analyses_);
          }
          onChanged();
        }
      } else {
        if (!other.analyses_.isEmpty()) {
          if (analysesBuilder_.isEmpty()) {
            analysesBuilder_.dispose();
            analysesBuilder_ = null;
            analyses_ = other.analyses_;
            bitField0_ = (bitField0_ & ~0x00000002);
            analysesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 internalGetAnalysesFieldBuilder() : null;
          } else {
            analysesBuilder_.addAllMessages(other.analyses_);
          }
        }
      }
      if (other.hasError()) {
        mergeError(other.getError());
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
              org.cyverse.de.protobufs.Analysis m =
                  input.readMessage(
                      org.cyverse.de.protobufs.Analysis.parser(),
                      extensionRegistry);
              if (analysesBuilder_ == null) {
                ensureAnalysesIsMutable();
                analyses_.add(m);
              } else {
                analysesBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 58: {
              input.readMessage(
                  internalGetErrorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 58
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
     * <code>.header.Header header = 1;</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
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
     * <code>.header.Header header = 1;</code>
     */
    public org.cyverse.de.protobufs.Header.Builder getHeaderBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return internalGetHeaderFieldBuilder().getBuilder();
    }
    /**
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

    private java.util.List<org.cyverse.de.protobufs.Analysis> analyses_ =
      java.util.Collections.emptyList();
    private void ensureAnalysesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        analyses_ = new java.util.ArrayList<org.cyverse.de.protobufs.Analysis>(analyses_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        org.cyverse.de.protobufs.Analysis, org.cyverse.de.protobufs.Analysis.Builder, org.cyverse.de.protobufs.AnalysisOrBuilder> analysesBuilder_;

    /**
     * <code>repeated .analysis.Analysis analyses = 2;</code>
     */
    public java.util.List<org.cyverse.de.protobufs.Analysis> getAnalysesList() {
      if (analysesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(analyses_);
      } else {
        return analysesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .analysis.Analysis analyses = 2;</code>
     */
    public int getAnalysesCount() {
      if (analysesBuilder_ == null) {
        return analyses_.size();
      } else {
        return analysesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .analysis.Analysis analyses = 2;</code>
     */
    public org.cyverse.de.protobufs.Analysis getAnalyses(int index) {
      if (analysesBuilder_ == null) {
        return analyses_.get(index);
      } else {
        return analysesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .analysis.Analysis analyses = 2;</code>
     */
    public Builder setAnalyses(
        int index, org.cyverse.de.protobufs.Analysis value) {
      if (analysesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnalysesIsMutable();
        analyses_.set(index, value);
        onChanged();
      } else {
        analysesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .analysis.Analysis analyses = 2;</code>
     */
    public Builder setAnalyses(
        int index, org.cyverse.de.protobufs.Analysis.Builder builderForValue) {
      if (analysesBuilder_ == null) {
        ensureAnalysesIsMutable();
        analyses_.set(index, builderForValue.build());
        onChanged();
      } else {
        analysesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .analysis.Analysis analyses = 2;</code>
     */
    public Builder addAnalyses(org.cyverse.de.protobufs.Analysis value) {
      if (analysesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnalysesIsMutable();
        analyses_.add(value);
        onChanged();
      } else {
        analysesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .analysis.Analysis analyses = 2;</code>
     */
    public Builder addAnalyses(
        int index, org.cyverse.de.protobufs.Analysis value) {
      if (analysesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnalysesIsMutable();
        analyses_.add(index, value);
        onChanged();
      } else {
        analysesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .analysis.Analysis analyses = 2;</code>
     */
    public Builder addAnalyses(
        org.cyverse.de.protobufs.Analysis.Builder builderForValue) {
      if (analysesBuilder_ == null) {
        ensureAnalysesIsMutable();
        analyses_.add(builderForValue.build());
        onChanged();
      } else {
        analysesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .analysis.Analysis analyses = 2;</code>
     */
    public Builder addAnalyses(
        int index, org.cyverse.de.protobufs.Analysis.Builder builderForValue) {
      if (analysesBuilder_ == null) {
        ensureAnalysesIsMutable();
        analyses_.add(index, builderForValue.build());
        onChanged();
      } else {
        analysesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .analysis.Analysis analyses = 2;</code>
     */
    public Builder addAllAnalyses(
        java.lang.Iterable<? extends org.cyverse.de.protobufs.Analysis> values) {
      if (analysesBuilder_ == null) {
        ensureAnalysesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, analyses_);
        onChanged();
      } else {
        analysesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .analysis.Analysis analyses = 2;</code>
     */
    public Builder clearAnalyses() {
      if (analysesBuilder_ == null) {
        analyses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        analysesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .analysis.Analysis analyses = 2;</code>
     */
    public Builder removeAnalyses(int index) {
      if (analysesBuilder_ == null) {
        ensureAnalysesIsMutable();
        analyses_.remove(index);
        onChanged();
      } else {
        analysesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .analysis.Analysis analyses = 2;</code>
     */
    public org.cyverse.de.protobufs.Analysis.Builder getAnalysesBuilder(
        int index) {
      return internalGetAnalysesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .analysis.Analysis analyses = 2;</code>
     */
    public org.cyverse.de.protobufs.AnalysisOrBuilder getAnalysesOrBuilder(
        int index) {
      if (analysesBuilder_ == null) {
        return analyses_.get(index);  } else {
        return analysesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .analysis.Analysis analyses = 2;</code>
     */
    public java.util.List<? extends org.cyverse.de.protobufs.AnalysisOrBuilder> 
         getAnalysesOrBuilderList() {
      if (analysesBuilder_ != null) {
        return analysesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(analyses_);
      }
    }
    /**
     * <code>repeated .analysis.Analysis analyses = 2;</code>
     */
    public org.cyverse.de.protobufs.Analysis.Builder addAnalysesBuilder() {
      return internalGetAnalysesFieldBuilder().addBuilder(
          org.cyverse.de.protobufs.Analysis.getDefaultInstance());
    }
    /**
     * <code>repeated .analysis.Analysis analyses = 2;</code>
     */
    public org.cyverse.de.protobufs.Analysis.Builder addAnalysesBuilder(
        int index) {
      return internalGetAnalysesFieldBuilder().addBuilder(
          index, org.cyverse.de.protobufs.Analysis.getDefaultInstance());
    }
    /**
     * <code>repeated .analysis.Analysis analyses = 2;</code>
     */
    public java.util.List<org.cyverse.de.protobufs.Analysis.Builder> 
         getAnalysesBuilderList() {
      return internalGetAnalysesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        org.cyverse.de.protobufs.Analysis, org.cyverse.de.protobufs.Analysis.Builder, org.cyverse.de.protobufs.AnalysisOrBuilder> 
        internalGetAnalysesFieldBuilder() {
      if (analysesBuilder_ == null) {
        analysesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            org.cyverse.de.protobufs.Analysis, org.cyverse.de.protobufs.Analysis.Builder, org.cyverse.de.protobufs.AnalysisOrBuilder>(
                analyses_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        analyses_ = null;
      }
      return analysesBuilder_;
    }

    private org.cyverse.de.protobufs.ServiceError error_;
    private com.google.protobuf.SingleFieldBuilder<
        org.cyverse.de.protobufs.ServiceError, org.cyverse.de.protobufs.ServiceError.Builder, org.cyverse.de.protobufs.ServiceErrorOrBuilder> errorBuilder_;
    /**
     * <code>.svcerror.ServiceError error = 7;</code>
     * @return Whether the error field is set.
     */
    public boolean hasError() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.svcerror.ServiceError error = 7;</code>
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
     * <code>.svcerror.ServiceError error = 7;</code>
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
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.svcerror.ServiceError error = 7;</code>
     */
    public Builder setError(
        org.cyverse.de.protobufs.ServiceError.Builder builderForValue) {
      if (errorBuilder_ == null) {
        error_ = builderForValue.build();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.svcerror.ServiceError error = 7;</code>
     */
    public Builder mergeError(org.cyverse.de.protobufs.ServiceError value) {
      if (errorBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          error_ != null &&
          error_ != org.cyverse.de.protobufs.ServiceError.getDefaultInstance()) {
          getErrorBuilder().mergeFrom(value);
        } else {
          error_ = value;
        }
      } else {
        errorBuilder_.mergeFrom(value);
      }
      if (error_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.svcerror.ServiceError error = 7;</code>
     */
    public Builder clearError() {
      bitField0_ = (bitField0_ & ~0x00000004);
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.svcerror.ServiceError error = 7;</code>
     */
    public org.cyverse.de.protobufs.ServiceError.Builder getErrorBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return internalGetErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>.svcerror.ServiceError error = 7;</code>
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
     * <code>.svcerror.ServiceError error = 7;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.cyverse.de.protobufs.ServiceError, org.cyverse.de.protobufs.ServiceError.Builder, org.cyverse.de.protobufs.ServiceErrorOrBuilder> 
        internalGetErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.cyverse.de.protobufs.ServiceError, org.cyverse.de.protobufs.ServiceError.Builder, org.cyverse.de.protobufs.ServiceErrorOrBuilder>(
                getError(),
                getParentForChildren(),
                isClean());
        error_ = null;
      }
      return errorBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:analysis.AnalysisRecordList)
  }

  // @@protoc_insertion_point(class_scope:analysis.AnalysisRecordList)
  private static final org.cyverse.de.protobufs.AnalysisRecordList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.cyverse.de.protobufs.AnalysisRecordList();
  }

  public static org.cyverse.de.protobufs.AnalysisRecordList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnalysisRecordList>
      PARSER = new com.google.protobuf.AbstractParser<AnalysisRecordList>() {
    @java.lang.Override
    public AnalysisRecordList parsePartialFrom(
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

  public static com.google.protobuf.Parser<AnalysisRecordList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnalysisRecordList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.cyverse.de.protobufs.AnalysisRecordList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

