// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: header.proto

package org.cyverse.de.protobufs;

public interface HeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Header)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .Header.Value&gt; map = 1;</code>
   */
  int getMapCount();
  /**
   * <code>map&lt;string, .Header.Value&gt; map = 1;</code>
   */
  boolean containsMap(
      java.lang.String key);
  /**
   * Use {@link #getMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.cyverse.de.protobufs.Header.Value>
  getMap();
  /**
   * <code>map&lt;string, .Header.Value&gt; map = 1;</code>
   */
  java.util.Map<java.lang.String, org.cyverse.de.protobufs.Header.Value>
  getMapMap();
  /**
   * <code>map&lt;string, .Header.Value&gt; map = 1;</code>
   */

  org.cyverse.de.protobufs.Header.Value getMapOrDefault(
      java.lang.String key,
      org.cyverse.de.protobufs.Header.Value defaultValue);
  /**
   * <code>map&lt;string, .Header.Value&gt; map = 1;</code>
   */

  org.cyverse.de.protobufs.Header.Value getMapOrThrow(
      java.lang.String key);
}
