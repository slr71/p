// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_quotas.proto

package org.cyverse.de.protobufs;

public interface AddQuotaRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AddQuotaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <code>.Header header = 1;</code>
   * @return The header.
   */
  org.cyverse.de.protobufs.Header getHeader();
  /**
   * <code>.Header header = 1;</code>
   */
  org.cyverse.de.protobufs.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>.Quota quota = 2;</code>
   * @return Whether the quota field is set.
   */
  boolean hasQuota();
  /**
   * <code>.Quota quota = 2;</code>
   * @return The quota.
   */
  org.cyverse.de.protobufs.Quota getQuota();
  /**
   * <code>.Quota quota = 2;</code>
   */
  org.cyverse.de.protobufs.QuotaOrBuilder getQuotaOrBuilder();
}