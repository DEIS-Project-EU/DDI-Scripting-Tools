/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;


public enum TDDIAssertedRelationshipUnionType implements org.apache.thrift.TEnum {
  ARUTAssertedArtifactSupport(0),
  ARUTAssertedArtifactContext(1),
  ARUTAssertedInference(2),
  ARUTAssertedEvidence(3),
  ARUTAssertedContext(4);

  private final int value;

  private TDDIAssertedRelationshipUnionType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TDDIAssertedRelationshipUnionType findByValue(int value) { 
    switch (value) {
      case 0:
        return ARUTAssertedArtifactSupport;
      case 1:
        return ARUTAssertedArtifactContext;
      case 2:
        return ARUTAssertedInference;
      case 3:
        return ARUTAssertedEvidence;
      case 4:
        return ARUTAssertedContext;
      default:
        return null;
    }
  }
}
