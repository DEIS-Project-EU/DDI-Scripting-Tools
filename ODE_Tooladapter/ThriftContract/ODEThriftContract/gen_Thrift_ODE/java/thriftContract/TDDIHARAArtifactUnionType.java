/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;


public enum TDDIHARAArtifactUnionType implements org.apache.thrift.TEnum {
  HAUTAbstractHARAPackage(0),
  HAUTHazardTypeSystem(1),
  HAUTAbstractRiskParameter(2),
  HAUTRiskAssessment(3),
  HAUTHazardType(4),
  HAUTMalFunction(5),
  HAUTHazard(6);

  private final int value;

  private TDDIHARAArtifactUnionType(int value) {
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
  public static TDDIHARAArtifactUnionType findByValue(int value) { 
    switch (value) {
      case 0:
        return HAUTAbstractHARAPackage;
      case 1:
        return HAUTHazardTypeSystem;
      case 2:
        return HAUTAbstractRiskParameter;
      case 3:
        return HAUTRiskAssessment;
      case 4:
        return HAUTHazardType;
      case 5:
        return HAUTMalFunction;
      case 6:
        return HAUTHazard;
      default:
        return null;
    }
  }
}
