/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;


public enum TDDIFTAPackageUnionType implements org.apache.thrift.TEnum {
  FTAPUTPackage(0),
  FTAPUTPackageInterface(1),
  FTAPUTPackageBinding(2);

  private final int value;

  private TDDIFTAPackageUnionType(int value) {
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
  public static TDDIFTAPackageUnionType findByValue(int value) { 
    switch (value) {
      case 0:
        return FTAPUTPackage;
      case 1:
        return FTAPUTPackageInterface;
      case 2:
        return FTAPUTPackageBinding;
      default:
        return null;
    }
  }
}
