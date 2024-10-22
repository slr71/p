// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_subscriptions.proto

package org.cyverse.de.protobufs;

public interface SubscriptionListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:qms.SubscriptionList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Contains telemetry information
   * </pre>
   *
   * <code>.header.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   * Contains telemetry information
   * </pre>
   *
   * <code>.header.Header header = 1;</code>
   * @return The header.
   */
  org.cyverse.de.protobufs.Header getHeader();
  /**
   * <pre>
   * Contains telemetry information
   * </pre>
   *
   * <code>.header.Header header = 1;</code>
   */
  org.cyverse.de.protobufs.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * Error information returned by the request handler.
   * </pre>
   *
   * <code>.svcerror.ServiceError error = 2;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * Error information returned by the request handler.
   * </pre>
   *
   * <code>.svcerror.ServiceError error = 2;</code>
   * @return The error.
   */
  org.cyverse.de.protobufs.ServiceError getError();
  /**
   * <pre>
   * Error information returned by the request handler.
   * </pre>
   *
   * <code>.svcerror.ServiceError error = 2;</code>
   */
  org.cyverse.de.protobufs.ServiceErrorOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   * The subscription list returned by the request handler.
   * </pre>
   *
   * <code>repeated .qms.Subscription subscriptions = 3 [json_name = "subscriptions"];</code>
   */
  java.util.List<org.cyverse.de.protobufs.Subscription> 
      getSubscriptionsList();
  /**
   * <pre>
   * The subscription list returned by the request handler.
   * </pre>
   *
   * <code>repeated .qms.Subscription subscriptions = 3 [json_name = "subscriptions"];</code>
   */
  org.cyverse.de.protobufs.Subscription getSubscriptions(int index);
  /**
   * <pre>
   * The subscription list returned by the request handler.
   * </pre>
   *
   * <code>repeated .qms.Subscription subscriptions = 3 [json_name = "subscriptions"];</code>
   */
  int getSubscriptionsCount();
  /**
   * <pre>
   * The subscription list returned by the request handler.
   * </pre>
   *
   * <code>repeated .qms.Subscription subscriptions = 3 [json_name = "subscriptions"];</code>
   */
  java.util.List<? extends org.cyverse.de.protobufs.SubscriptionOrBuilder> 
      getSubscriptionsOrBuilderList();
  /**
   * <pre>
   * The subscription list returned by the request handler.
   * </pre>
   *
   * <code>repeated .qms.Subscription subscriptions = 3 [json_name = "subscriptions"];</code>
   */
  org.cyverse.de.protobufs.SubscriptionOrBuilder getSubscriptionsOrBuilder(
      int index);
}
