/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;


public enum TDDIGateType implements org.apache.thrift.TEnum {
  GTOR(0),
  GTAND(1),
  GTNOT(2),
  GTXOR(3),
  GTVOTE(4),
  GTPAND(5),
  GTPOR(6),
  GTSAND(7);

  private final int value;

  private TDDIGateType(int value) {
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
  public static TDDIGateType findByValue(int value) { 
    switch (value) {
      case 0:
        return GTOR;
      case 1:
        return GTAND;
      case 2:
        return GTNOT;
      case 3:
        return GTXOR;
      case 4:
        return GTVOTE;
      case 5:
        return GTPAND;
      case 6:
        return GTPOR;
      case 7:
        return GTSAND;
      default:
        return null;
    }
  }
}
