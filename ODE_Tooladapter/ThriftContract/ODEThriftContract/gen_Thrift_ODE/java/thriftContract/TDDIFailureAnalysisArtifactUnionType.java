/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;


public enum TDDIFailureAnalysisArtifactUnionType implements org.apache.thrift.TEnum {
  AAUTAbstractFailureLogicPackage(0),
  AAUTMinimalCutset(1),
  AAUTInterfaceFailurePropagation(2),
  AAUTAbstractFailure(3),
  AAUTFailureMode(4),
  AAUTProbabilityDistribution(5),
  AAUTProbDistParam(6),
  AAUTAbstractFTAArtifact(7),
  AAUTAbstractFMEAArtifact(8),
  AAUTAbstractMarkovArtifact(9);

  private final int value;

  private TDDIFailureAnalysisArtifactUnionType(int value) {
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
  public static TDDIFailureAnalysisArtifactUnionType findByValue(int value) { 
    switch (value) {
      case 0:
        return AAUTAbstractFailureLogicPackage;
      case 1:
        return AAUTMinimalCutset;
      case 2:
        return AAUTInterfaceFailurePropagation;
      case 3:
        return AAUTAbstractFailure;
      case 4:
        return AAUTFailureMode;
      case 5:
        return AAUTProbabilityDistribution;
      case 6:
        return AAUTProbDistParam;
      case 7:
        return AAUTAbstractFTAArtifact;
      case 8:
        return AAUTAbstractFMEAArtifact;
      case 9:
        return AAUTAbstractMarkovArtifact;
      default:
        return null;
    }
  }
}
