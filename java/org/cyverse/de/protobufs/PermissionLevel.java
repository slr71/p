// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: groups.proto
// Protobuf Java Version: 4.29.3

package org.cyverse.de.protobufs;

/**
 * <pre>
 * *
 * A permission level name.
 * </pre>
 *
 * Protobuf enum {@code groups.PermissionLevel}
 */
public enum PermissionLevel
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>read = 0;</code>
   */
  read(0),
  /**
   * <code>admin = 1;</code>
   */
  admin(1),
  /**
   * <code>write = 2;</code>
   */
  write(2),
  /**
   * <code>own = 3;</code>
   */
  own(3),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      PermissionLevel.class.getName());
  }
  /**
   * <code>read = 0;</code>
   */
  public static final int read_VALUE = 0;
  /**
   * <code>admin = 1;</code>
   */
  public static final int admin_VALUE = 1;
  /**
   * <code>write = 2;</code>
   */
  public static final int write_VALUE = 2;
  /**
   * <code>own = 3;</code>
   */
  public static final int own_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PermissionLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PermissionLevel forNumber(int value) {
    switch (value) {
      case 0: return read;
      case 1: return admin;
      case 2: return write;
      case 3: return own;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PermissionLevel>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PermissionLevel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PermissionLevel>() {
          public PermissionLevel findValueByNumber(int number) {
            return PermissionLevel.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.cyverse.de.protobufs.GroupsProtobufs.getDescriptor().getEnumTypes().get(1);
  }

  private static final PermissionLevel[] VALUES = values();

  public static PermissionLevel valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PermissionLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:groups.PermissionLevel)
}

