/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;


public enum TDDIFailureOriginType implements org.apache.thrift.TEnum {
  FOTInput(0),
  FOTOutput(1),
  FOTInternal(2);

  private final int value;

  private TDDIFailureOriginType(int value) {
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
  public static TDDIFailureOriginType findByValue(int value) { 
    switch (value) {
      case 0:
        return FOTInput;
      case 1:
        return FOTOutput;
      case 2:
        return FOTInternal;
      default:
        return null;
    }
  }
}
