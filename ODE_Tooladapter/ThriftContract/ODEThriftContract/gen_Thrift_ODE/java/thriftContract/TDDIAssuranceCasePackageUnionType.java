/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;


public enum TDDIAssuranceCasePackageUnionType implements org.apache.thrift.TEnum {
  ACPUTAssuranceCasePackage(0),
  ACPUTAssuranceCasePackageInterface(1),
  ACPUTAssuranceCasePackageBinding(2);

  private final int value;

  private TDDIAssuranceCasePackageUnionType(int value) {
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
  public static TDDIAssuranceCasePackageUnionType findByValue(int value) { 
    switch (value) {
      case 0:
        return ACPUTAssuranceCasePackage;
      case 1:
        return ACPUTAssuranceCasePackageInterface;
      case 2:
        return ACPUTAssuranceCasePackageBinding;
      default:
        return null;
    }
  }
}
