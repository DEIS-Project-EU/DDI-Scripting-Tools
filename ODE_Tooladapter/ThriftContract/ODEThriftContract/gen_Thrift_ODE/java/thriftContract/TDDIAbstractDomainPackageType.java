/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;


public enum TDDIAbstractDomainPackageType implements org.apache.thrift.TEnum {
  ADPTDomainPackage(0),
  ADPTDomainPackageInterface(1),
  ADPTDomainPackageBinding(2);

  private final int value;

  private TDDIAbstractDomainPackageType(int value) {
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
  public static TDDIAbstractDomainPackageType findByValue(int value) { 
    switch (value) {
      case 0:
        return ADPTDomainPackage;
      case 1:
        return ADPTDomainPackageInterface;
      case 2:
        return ADPTDomainPackageBinding;
      default:
        return null;
    }
  }
}
