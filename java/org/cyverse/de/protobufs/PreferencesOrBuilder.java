// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: user.proto
// Protobuf Java Version: 4.31.1

package org.cyverse.de.protobufs;

@com.google.protobuf.Generated
public interface PreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:user.Preferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string uuid = 1;</code>
   * @return The uuid.
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 1;</code>
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <pre>
   * should come across as JSON.
   * </pre>
   *
   * <code>string preferences = 2;</code>
   * @return The preferences.
   */
  java.lang.String getPreferences();
  /**
   * <pre>
   * should come across as JSON.
   * </pre>
   *
   * <code>string preferences = 2;</code>
   * @return The bytes for preferences.
   */
  com.google.protobuf.ByteString
      getPreferencesBytes();
}
