/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;


public enum TDDIFunctionUnionType implements org.apache.thrift.TEnum {
  FUTFunction(0),
  FUTSafetyFunction(1);

  private final int value;

  private TDDIFunctionUnionType(int value) {
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
  public static TDDIFunctionUnionType findByValue(int value) { 
    switch (value) {
      case 0:
        return FUTFunction;
      case 1:
        return FUTSafetyFunction;
      default:
        return null;
    }
  }
}
