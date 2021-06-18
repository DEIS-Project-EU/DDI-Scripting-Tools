/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;


public enum TDDIDesignArtifactUnionType implements org.apache.thrift.TEnum {
  DAUTAbstractSystem(0),
  DAUTAbstractFunction(1),
  DAUTConfiguration(2),
  DAUTSignal(3),
  DAUTSystemBoundary(4),
  DAUTContext(5),
  DAUTLifecycleCondition(6),
  DAUTPort(7),
  DAUTPerfChars(8),
  DAUTAbstractArchitecturePackage(9);

  private final int value;

  private TDDIDesignArtifactUnionType(int value) {
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
  public static TDDIDesignArtifactUnionType findByValue(int value) { 
    switch (value) {
      case 0:
        return DAUTAbstractSystem;
      case 1:
        return DAUTAbstractFunction;
      case 2:
        return DAUTConfiguration;
      case 3:
        return DAUTSignal;
      case 4:
        return DAUTSystemBoundary;
      case 5:
        return DAUTContext;
      case 6:
        return DAUTLifecycleCondition;
      case 7:
        return DAUTPort;
      case 8:
        return DAUTPerfChars;
      case 9:
        return DAUTAbstractArchitecturePackage;
      default:
        return null;
    }
  }
}