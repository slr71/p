// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: monitoring_dns_check.proto

package org.cyverse.de.protobufs;

public interface DNSLookupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:debuff.DNSLookup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string host = 1;</code>
   * @return The host.
   */
  java.lang.String getHost();
  /**
   * <code>string host = 1;</code>
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString
      getHostBytes();

  /**
   * <code>repeated string addresses = 2;</code>
   * @return A list containing the addresses.
   */
  java.util.List<java.lang.String>
      getAddressesList();
  /**
   * <code>repeated string addresses = 2;</code>
   * @return The count of addresses.
   */
  int getAddressesCount();
  /**
   * <code>repeated string addresses = 2;</code>
   * @param index The index of the element to return.
   * @return The addresses at the given index.
   */
  java.lang.String getAddresses(int index);
  /**
   * <code>repeated string addresses = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the addresses at the given index.
   */
  com.google.protobuf.ByteString
      getAddressesBytes(int index);

  /**
   * <code>string type = 3;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 3;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string error = 4;</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <code>string error = 4;</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();
}
