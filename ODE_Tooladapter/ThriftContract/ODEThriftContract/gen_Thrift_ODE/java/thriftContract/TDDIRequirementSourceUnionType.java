/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;


public enum TDDIRequirementSourceUnionType implements org.apache.thrift.TEnum {
  RSUTLegalContract(0);

  private final int value;

  private TDDIRequirementSourceUnionType(int value) {
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
  public static TDDIRequirementSourceUnionType findByValue(int value) { 
    switch (value) {
      case 0:
        return RSUTLegalContract;
      default:
        return null;
    }
  }
}
