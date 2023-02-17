// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qms_addons.proto

package org.cyverse.de.protobufs;

public interface SubscriptionAddonListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SubscriptionAddonListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Contains telemetry information
   * </pre>
   *
   * <code>.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   * Contains telemetry information
   * </pre>
   *
   * <code>.Header header = 1;</code>
   * @return The header.
   */
  org.cyverse.de.protobufs.Header getHeader();
  /**
   * <pre>
   * Contains telemetry information
   * </pre>
   *
   * <code>.Header header = 1;</code>
   */
  org.cyverse.de.protobufs.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * Error information generated by the request handler.
   * </pre>
   *
   * <code>.ServiceError error = 2;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * Error information generated by the request handler.
   * </pre>
   *
   * <code>.ServiceError error = 2;</code>
   * @return The error.
   */
  org.cyverse.de.protobufs.ServiceError getError();
  /**
   * <pre>
   * Error information generated by the request handler.
   * </pre>
   *
   * <code>.ServiceError error = 2;</code>
   */
  org.cyverse.de.protobufs.ServiceErrorOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   * The list of subscription add-ons returned by the request handler.
   * </pre>
   *
   * <code>repeated .SubscriptionAddon subscription_addons = 3 [json_name = "subscription_addons"];</code>
   */
  java.util.List<org.cyverse.de.protobufs.SubscriptionAddon> 
      getSubscriptionAddonsList();
  /**
   * <pre>
   * The list of subscription add-ons returned by the request handler.
   * </pre>
   *
   * <code>repeated .SubscriptionAddon subscription_addons = 3 [json_name = "subscription_addons"];</code>
   */
  org.cyverse.de.protobufs.SubscriptionAddon getSubscriptionAddons(int index);
  /**
   * <pre>
   * The list of subscription add-ons returned by the request handler.
   * </pre>
   *
   * <code>repeated .SubscriptionAddon subscription_addons = 3 [json_name = "subscription_addons"];</code>
   */
  int getSubscriptionAddonsCount();
  /**
   * <pre>
   * The list of subscription add-ons returned by the request handler.
   * </pre>
   *
   * <code>repeated .SubscriptionAddon subscription_addons = 3 [json_name = "subscription_addons"];</code>
   */
  java.util.List<? extends org.cyverse.de.protobufs.SubscriptionAddonOrBuilder> 
      getSubscriptionAddonsOrBuilderList();
  /**
   * <pre>
   * The list of subscription add-ons returned by the request handler.
   * </pre>
   *
   * <code>repeated .SubscriptionAddon subscription_addons = 3 [json_name = "subscription_addons"];</code>
   */
  org.cyverse.de.protobufs.SubscriptionAddonOrBuilder getSubscriptionAddonsOrBuilder(
      int index);
}
