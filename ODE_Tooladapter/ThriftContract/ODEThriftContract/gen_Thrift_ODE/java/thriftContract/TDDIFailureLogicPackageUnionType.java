/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;


public enum TDDIFailureLogicPackageUnionType implements org.apache.thrift.TEnum {
  FLPUTFailureLogicPackage(0),
  FLPUTFailureLogicPackageInterface(1),
  FLPUTFailureLogicPackageBinding(2),
  FLPUTAbstractFTAPackage(3),
  FLPUTAbstractFMEAPackage(4),
  FLPUTAbstractMarkovChainPackage(5);

  private final int value;

  private TDDIFailureLogicPackageUnionType(int value) {
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
  public static TDDIFailureLogicPackageUnionType findByValue(int value) { 
    switch (value) {
      case 0:
        return FLPUTFailureLogicPackage;
      case 1:
        return FLPUTFailureLogicPackageInterface;
      case 2:
        return FLPUTFailureLogicPackageBinding;
      case 3:
        return FLPUTAbstractFTAPackage;
      case 4:
        return FLPUTAbstractFMEAPackage;
      case 5:
        return FLPUTAbstractMarkovChainPackage;
      default:
        return null;
    }
  }
}
