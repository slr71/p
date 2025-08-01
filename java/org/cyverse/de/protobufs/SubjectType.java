// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: groups.proto
// Protobuf Java Version: 4.31.1

package org.cyverse.de.protobufs;

/**
 * <pre>
 * *
 * The subject type.
 * </pre>
 *
 * Protobuf enum {@code groups.SubjectType}
 */
@com.google.protobuf.Generated
public enum SubjectType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>user = 0;</code>
   */
  user(0),
  /**
   * <code>group = 1;</code>
   */
  group(1),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
      /* patch= */ 1,
      /* suffix= */ "",
      SubjectType.class.getName());
  }
  /**
   * <code>user = 0;</code>
   */
  public static final int user_VALUE = 0;
  /**
   * <code>group = 1;</code>
   */
  public static final int group_VALUE = 1;


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
  public static SubjectType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SubjectType forNumber(int value) {
    switch (value) {
      case 0: return user;
      case 1: return group;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SubjectType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SubjectType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SubjectType>() {
          public SubjectType findValueByNumber(int number) {
            return SubjectType.forNumber(number);
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
  public static com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.cyverse.de.protobufs.GroupsProtobufs.getDescriptor().getEnumTypes().get(0);
  }

  private static final SubjectType[] VALUES = values();

  public static SubjectType valueOf(
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

  private SubjectType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:groups.SubjectType)
}

