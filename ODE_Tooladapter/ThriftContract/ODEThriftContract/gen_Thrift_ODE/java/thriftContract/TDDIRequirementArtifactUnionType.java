/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;


public enum TDDIRequirementArtifactUnionType implements org.apache.thrift.TEnum {
  RAUTAbstractRequirementPackage(0),
  RAUTAbstractRequirementSource(1),
  RAUTAbstractDependabilityRequirement(2);

  private final int value;

  private TDDIRequirementArtifactUnionType(int value) {
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
  public static TDDIRequirementArtifactUnionType findByValue(int value) { 
    switch (value) {
      case 0:
        return RAUTAbstractRequirementPackage;
      case 1:
        return RAUTAbstractRequirementSource;
      case 2:
        return RAUTAbstractDependabilityRequirement;
      default:
        return null;
    }
  }
}
