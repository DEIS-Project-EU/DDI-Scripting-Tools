/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;


public enum TDDIFMEAType implements org.apache.thrift.TEnum {
  FMEA(0),
  FMEDA(1);

  private final int value;

  private TDDIFMEAType(int value) {
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
  public static TDDIFMEAType findByValue(int value) { 
    switch (value) {
      case 0:
        return FMEA;
      case 1:
        return FMEDA;
      default:
        return null;
    }
  }
}
