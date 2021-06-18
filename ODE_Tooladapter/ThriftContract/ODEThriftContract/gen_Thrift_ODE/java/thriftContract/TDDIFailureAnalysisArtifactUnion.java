/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TDDIFailureAnalysisArtifactUnion extends org.apache.thrift.TUnion<TDDIFailureAnalysisArtifactUnion, TDDIFailureAnalysisArtifactUnion._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIFailureAnalysisArtifactUnion");
  private static final org.apache.thrift.protocol.TField FAILURE_LOGIC_PACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("FailureLogicPackage", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField MINIMAL_CUTSET_FIELD_DESC = new org.apache.thrift.protocol.TField("MinimalCutset", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField INTERFACE_FAILURE_PROPAGATION_FIELD_DESC = new org.apache.thrift.protocol.TField("InterfaceFailurePropagation", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField FAILURE_FIELD_DESC = new org.apache.thrift.protocol.TField("Failure", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField FAILURE_MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("FailureMode", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField PROBABILITY_DISTRIBUTION_FIELD_DESC = new org.apache.thrift.protocol.TField("ProbabilityDistribution", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField PROB_DIST_PARAM_FIELD_DESC = new org.apache.thrift.protocol.TField("ProbDistParam", org.apache.thrift.protocol.TType.STRUCT, (short)7);
  private static final org.apache.thrift.protocol.TField FTAARTIFACT_FIELD_DESC = new org.apache.thrift.protocol.TField("FTAArtifact", org.apache.thrift.protocol.TType.STRUCT, (short)8);
  private static final org.apache.thrift.protocol.TField FMEAARTIFACT_FIELD_DESC = new org.apache.thrift.protocol.TField("FMEAArtifact", org.apache.thrift.protocol.TType.STRUCT, (short)9);
  private static final org.apache.thrift.protocol.TField MARKOV_ARTIFACT_FIELD_DESC = new org.apache.thrift.protocol.TField("MarkovArtifact", org.apache.thrift.protocol.TType.STRUCT, (short)10);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FAILURE_LOGIC_PACKAGE((short)1, "FailureLogicPackage"),
    MINIMAL_CUTSET((short)2, "MinimalCutset"),
    INTERFACE_FAILURE_PROPAGATION((short)3, "InterfaceFailurePropagation"),
    FAILURE((short)4, "Failure"),
    FAILURE_MODE((short)5, "FailureMode"),
    PROBABILITY_DISTRIBUTION((short)6, "ProbabilityDistribution"),
    PROB_DIST_PARAM((short)7, "ProbDistParam"),
    FTAARTIFACT((short)8, "FTAArtifact"),
    FMEAARTIFACT((short)9, "FMEAArtifact"),
    MARKOV_ARTIFACT((short)10, "MarkovArtifact");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FAILURE_LOGIC_PACKAGE
          return FAILURE_LOGIC_PACKAGE;
        case 2: // MINIMAL_CUTSET
          return MINIMAL_CUTSET;
        case 3: // INTERFACE_FAILURE_PROPAGATION
          return INTERFACE_FAILURE_PROPAGATION;
        case 4: // FAILURE
          return FAILURE;
        case 5: // FAILURE_MODE
          return FAILURE_MODE;
        case 6: // PROBABILITY_DISTRIBUTION
          return PROBABILITY_DISTRIBUTION;
        case 7: // PROB_DIST_PARAM
          return PROB_DIST_PARAM;
        case 8: // FTAARTIFACT
          return FTAARTIFACT;
        case 9: // FMEAARTIFACT
          return FMEAARTIFACT;
        case 10: // MARKOV_ARTIFACT
          return MARKOV_ARTIFACT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FAILURE_LOGIC_PACKAGE, new org.apache.thrift.meta_data.FieldMetaData("FailureLogicPackage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIAbstractFailureLogicPackage")));
    tmpMap.put(_Fields.MINIMAL_CUTSET, new org.apache.thrift.meta_data.FieldMetaData("MinimalCutset", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIMinimalCutset.class)));
    tmpMap.put(_Fields.INTERFACE_FAILURE_PROPAGATION, new org.apache.thrift.meta_data.FieldMetaData("InterfaceFailurePropagation", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIInterfaceFailurePropagation.class)));
    tmpMap.put(_Fields.FAILURE, new org.apache.thrift.meta_data.FieldMetaData("Failure", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIAbstractFailure.class)));
    tmpMap.put(_Fields.FAILURE_MODE, new org.apache.thrift.meta_data.FieldMetaData("FailureMode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIFailureMode.class)));
    tmpMap.put(_Fields.PROBABILITY_DISTRIBUTION, new org.apache.thrift.meta_data.FieldMetaData("ProbabilityDistribution", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIProbabilityDistribution.class)));
    tmpMap.put(_Fields.PROB_DIST_PARAM, new org.apache.thrift.meta_data.FieldMetaData("ProbDistParam", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIProbDistParam.class)));
    tmpMap.put(_Fields.FTAARTIFACT, new org.apache.thrift.meta_data.FieldMetaData("FTAArtifact", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIAbstractFTAArtifact")));
    tmpMap.put(_Fields.FMEAARTIFACT, new org.apache.thrift.meta_data.FieldMetaData("FMEAArtifact", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIAbstractFMEAArtifact")));
    tmpMap.put(_Fields.MARKOV_ARTIFACT, new org.apache.thrift.meta_data.FieldMetaData("MarkovArtifact", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIAbstractMarkovArtifact")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIFailureAnalysisArtifactUnion.class, metaDataMap);
  }

  public TDDIFailureAnalysisArtifactUnion() {
    super();
  }

  public TDDIFailureAnalysisArtifactUnion(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public TDDIFailureAnalysisArtifactUnion(TDDIFailureAnalysisArtifactUnion other) {
    super(other);
  }
  public TDDIFailureAnalysisArtifactUnion deepCopy() {
    return new TDDIFailureAnalysisArtifactUnion(this);
  }

  public static TDDIFailureAnalysisArtifactUnion FailureLogicPackage(TDDIAbstractFailureLogicPackage value) {
    TDDIFailureAnalysisArtifactUnion x = new TDDIFailureAnalysisArtifactUnion();
    x.setFailureLogicPackage(value);
    return x;
  }

  public static TDDIFailureAnalysisArtifactUnion MinimalCutset(TDDIMinimalCutset value) {
    TDDIFailureAnalysisArtifactUnion x = new TDDIFailureAnalysisArtifactUnion();
    x.setMinimalCutset(value);
    return x;
  }

  public static TDDIFailureAnalysisArtifactUnion InterfaceFailurePropagation(TDDIInterfaceFailurePropagation value) {
    TDDIFailureAnalysisArtifactUnion x = new TDDIFailureAnalysisArtifactUnion();
    x.setInterfaceFailurePropagation(value);
    return x;
  }

  public static TDDIFailureAnalysisArtifactUnion Failure(TDDIAbstractFailure value) {
    TDDIFailureAnalysisArtifactUnion x = new TDDIFailureAnalysisArtifactUnion();
    x.setFailure(value);
    return x;
  }

  public static TDDIFailureAnalysisArtifactUnion FailureMode(TDDIFailureMode value) {
    TDDIFailureAnalysisArtifactUnion x = new TDDIFailureAnalysisArtifactUnion();
    x.setFailureMode(value);
    return x;
  }

  public static TDDIFailureAnalysisArtifactUnion ProbabilityDistribution(TDDIProbabilityDistribution value) {
    TDDIFailureAnalysisArtifactUnion x = new TDDIFailureAnalysisArtifactUnion();
    x.setProbabilityDistribution(value);
    return x;
  }

  public static TDDIFailureAnalysisArtifactUnion ProbDistParam(TDDIProbDistParam value) {
    TDDIFailureAnalysisArtifactUnion x = new TDDIFailureAnalysisArtifactUnion();
    x.setProbDistParam(value);
    return x;
  }

  public static TDDIFailureAnalysisArtifactUnion FTAArtifact(TDDIAbstractFTAArtifact value) {
    TDDIFailureAnalysisArtifactUnion x = new TDDIFailureAnalysisArtifactUnion();
    x.setFTAArtifact(value);
    return x;
  }

  public static TDDIFailureAnalysisArtifactUnion FMEAArtifact(TDDIAbstractFMEAArtifact value) {
    TDDIFailureAnalysisArtifactUnion x = new TDDIFailureAnalysisArtifactUnion();
    x.setFMEAArtifact(value);
    return x;
  }

  public static TDDIFailureAnalysisArtifactUnion MarkovArtifact(TDDIAbstractMarkovArtifact value) {
    TDDIFailureAnalysisArtifactUnion x = new TDDIFailureAnalysisArtifactUnion();
    x.setMarkovArtifact(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case FAILURE_LOGIC_PACKAGE:
        if (value instanceof TDDIAbstractFailureLogicPackage) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIAbstractFailureLogicPackage for field 'FailureLogicPackage', but got " + value.getClass().getSimpleName());
      case MINIMAL_CUTSET:
        if (value instanceof TDDIMinimalCutset) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIMinimalCutset for field 'MinimalCutset', but got " + value.getClass().getSimpleName());
      case INTERFACE_FAILURE_PROPAGATION:
        if (value instanceof TDDIInterfaceFailurePropagation) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIInterfaceFailurePropagation for field 'InterfaceFailurePropagation', but got " + value.getClass().getSimpleName());
      case FAILURE:
        if (value instanceof TDDIAbstractFailure) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIAbstractFailure for field 'Failure', but got " + value.getClass().getSimpleName());
      case FAILURE_MODE:
        if (value instanceof TDDIFailureMode) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIFailureMode for field 'FailureMode', but got " + value.getClass().getSimpleName());
      case PROBABILITY_DISTRIBUTION:
        if (value instanceof TDDIProbabilityDistribution) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIProbabilityDistribution for field 'ProbabilityDistribution', but got " + value.getClass().getSimpleName());
      case PROB_DIST_PARAM:
        if (value instanceof TDDIProbDistParam) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIProbDistParam for field 'ProbDistParam', but got " + value.getClass().getSimpleName());
      case FTAARTIFACT:
        if (value instanceof TDDIAbstractFTAArtifact) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIAbstractFTAArtifact for field 'FTAArtifact', but got " + value.getClass().getSimpleName());
      case FMEAARTIFACT:
        if (value instanceof TDDIAbstractFMEAArtifact) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIAbstractFMEAArtifact for field 'FMEAArtifact', but got " + value.getClass().getSimpleName());
      case MARKOV_ARTIFACT:
        if (value instanceof TDDIAbstractMarkovArtifact) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIAbstractMarkovArtifact for field 'MarkovArtifact', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case FAILURE_LOGIC_PACKAGE:
          if (field.type == FAILURE_LOGIC_PACKAGE_FIELD_DESC.type) {
            TDDIAbstractFailureLogicPackage FailureLogicPackage;
            FailureLogicPackage = new TDDIAbstractFailureLogicPackage();
            FailureLogicPackage.read(iprot);
            return FailureLogicPackage;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case MINIMAL_CUTSET:
          if (field.type == MINIMAL_CUTSET_FIELD_DESC.type) {
            TDDIMinimalCutset MinimalCutset;
            MinimalCutset = new TDDIMinimalCutset();
            MinimalCutset.read(iprot);
            return MinimalCutset;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case INTERFACE_FAILURE_PROPAGATION:
          if (field.type == INTERFACE_FAILURE_PROPAGATION_FIELD_DESC.type) {
            TDDIInterfaceFailurePropagation InterfaceFailurePropagation;
            InterfaceFailurePropagation = new TDDIInterfaceFailurePropagation();
            InterfaceFailurePropagation.read(iprot);
            return InterfaceFailurePropagation;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case FAILURE:
          if (field.type == FAILURE_FIELD_DESC.type) {
            TDDIAbstractFailure Failure;
            Failure = new TDDIAbstractFailure();
            Failure.read(iprot);
            return Failure;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case FAILURE_MODE:
          if (field.type == FAILURE_MODE_FIELD_DESC.type) {
            TDDIFailureMode FailureMode;
            FailureMode = new TDDIFailureMode();
            FailureMode.read(iprot);
            return FailureMode;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case PROBABILITY_DISTRIBUTION:
          if (field.type == PROBABILITY_DISTRIBUTION_FIELD_DESC.type) {
            TDDIProbabilityDistribution ProbabilityDistribution;
            ProbabilityDistribution = new TDDIProbabilityDistribution();
            ProbabilityDistribution.read(iprot);
            return ProbabilityDistribution;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case PROB_DIST_PARAM:
          if (field.type == PROB_DIST_PARAM_FIELD_DESC.type) {
            TDDIProbDistParam ProbDistParam;
            ProbDistParam = new TDDIProbDistParam();
            ProbDistParam.read(iprot);
            return ProbDistParam;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case FTAARTIFACT:
          if (field.type == FTAARTIFACT_FIELD_DESC.type) {
            TDDIAbstractFTAArtifact FTAArtifact;
            FTAArtifact = new TDDIAbstractFTAArtifact();
            FTAArtifact.read(iprot);
            return FTAArtifact;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case FMEAARTIFACT:
          if (field.type == FMEAARTIFACT_FIELD_DESC.type) {
            TDDIAbstractFMEAArtifact FMEAArtifact;
            FMEAArtifact = new TDDIAbstractFMEAArtifact();
            FMEAArtifact.read(iprot);
            return FMEAArtifact;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case MARKOV_ARTIFACT:
          if (field.type == MARKOV_ARTIFACT_FIELD_DESC.type) {
            TDDIAbstractMarkovArtifact MarkovArtifact;
            MarkovArtifact = new TDDIAbstractMarkovArtifact();
            MarkovArtifact.read(iprot);
            return MarkovArtifact;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case FAILURE_LOGIC_PACKAGE:
        TDDIAbstractFailureLogicPackage FailureLogicPackage = (TDDIAbstractFailureLogicPackage)value_;
        FailureLogicPackage.write(oprot);
        return;
      case MINIMAL_CUTSET:
        TDDIMinimalCutset MinimalCutset = (TDDIMinimalCutset)value_;
        MinimalCutset.write(oprot);
        return;
      case INTERFACE_FAILURE_PROPAGATION:
        TDDIInterfaceFailurePropagation InterfaceFailurePropagation = (TDDIInterfaceFailurePropagation)value_;
        InterfaceFailurePropagation.write(oprot);
        return;
      case FAILURE:
        TDDIAbstractFailure Failure = (TDDIAbstractFailure)value_;
        Failure.write(oprot);
        return;
      case FAILURE_MODE:
        TDDIFailureMode FailureMode = (TDDIFailureMode)value_;
        FailureMode.write(oprot);
        return;
      case PROBABILITY_DISTRIBUTION:
        TDDIProbabilityDistribution ProbabilityDistribution = (TDDIProbabilityDistribution)value_;
        ProbabilityDistribution.write(oprot);
        return;
      case PROB_DIST_PARAM:
        TDDIProbDistParam ProbDistParam = (TDDIProbDistParam)value_;
        ProbDistParam.write(oprot);
        return;
      case FTAARTIFACT:
        TDDIAbstractFTAArtifact FTAArtifact = (TDDIAbstractFTAArtifact)value_;
        FTAArtifact.write(oprot);
        return;
      case FMEAARTIFACT:
        TDDIAbstractFMEAArtifact FMEAArtifact = (TDDIAbstractFMEAArtifact)value_;
        FMEAArtifact.write(oprot);
        return;
      case MARKOV_ARTIFACT:
        TDDIAbstractMarkovArtifact MarkovArtifact = (TDDIAbstractMarkovArtifact)value_;
        MarkovArtifact.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected java.lang.Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case FAILURE_LOGIC_PACKAGE:
          TDDIAbstractFailureLogicPackage FailureLogicPackage;
          FailureLogicPackage = new TDDIAbstractFailureLogicPackage();
          FailureLogicPackage.read(iprot);
          return FailureLogicPackage;
        case MINIMAL_CUTSET:
          TDDIMinimalCutset MinimalCutset;
          MinimalCutset = new TDDIMinimalCutset();
          MinimalCutset.read(iprot);
          return MinimalCutset;
        case INTERFACE_FAILURE_PROPAGATION:
          TDDIInterfaceFailurePropagation InterfaceFailurePropagation;
          InterfaceFailurePropagation = new TDDIInterfaceFailurePropagation();
          InterfaceFailurePropagation.read(iprot);
          return InterfaceFailurePropagation;
        case FAILURE:
          TDDIAbstractFailure Failure;
          Failure = new TDDIAbstractFailure();
          Failure.read(iprot);
          return Failure;
        case FAILURE_MODE:
          TDDIFailureMode FailureMode;
          FailureMode = new TDDIFailureMode();
          FailureMode.read(iprot);
          return FailureMode;
        case PROBABILITY_DISTRIBUTION:
          TDDIProbabilityDistribution ProbabilityDistribution;
          ProbabilityDistribution = new TDDIProbabilityDistribution();
          ProbabilityDistribution.read(iprot);
          return ProbabilityDistribution;
        case PROB_DIST_PARAM:
          TDDIProbDistParam ProbDistParam;
          ProbDistParam = new TDDIProbDistParam();
          ProbDistParam.read(iprot);
          return ProbDistParam;
        case FTAARTIFACT:
          TDDIAbstractFTAArtifact FTAArtifact;
          FTAArtifact = new TDDIAbstractFTAArtifact();
          FTAArtifact.read(iprot);
          return FTAArtifact;
        case FMEAARTIFACT:
          TDDIAbstractFMEAArtifact FMEAArtifact;
          FMEAArtifact = new TDDIAbstractFMEAArtifact();
          FMEAArtifact.read(iprot);
          return FMEAArtifact;
        case MARKOV_ARTIFACT:
          TDDIAbstractMarkovArtifact MarkovArtifact;
          MarkovArtifact = new TDDIAbstractMarkovArtifact();
          MarkovArtifact.read(iprot);
          return MarkovArtifact;
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new org.apache.thrift.protocol.TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case FAILURE_LOGIC_PACKAGE:
        TDDIAbstractFailureLogicPackage FailureLogicPackage = (TDDIAbstractFailureLogicPackage)value_;
        FailureLogicPackage.write(oprot);
        return;
      case MINIMAL_CUTSET:
        TDDIMinimalCutset MinimalCutset = (TDDIMinimalCutset)value_;
        MinimalCutset.write(oprot);
        return;
      case INTERFACE_FAILURE_PROPAGATION:
        TDDIInterfaceFailurePropagation InterfaceFailurePropagation = (TDDIInterfaceFailurePropagation)value_;
        InterfaceFailurePropagation.write(oprot);
        return;
      case FAILURE:
        TDDIAbstractFailure Failure = (TDDIAbstractFailure)value_;
        Failure.write(oprot);
        return;
      case FAILURE_MODE:
        TDDIFailureMode FailureMode = (TDDIFailureMode)value_;
        FailureMode.write(oprot);
        return;
      case PROBABILITY_DISTRIBUTION:
        TDDIProbabilityDistribution ProbabilityDistribution = (TDDIProbabilityDistribution)value_;
        ProbabilityDistribution.write(oprot);
        return;
      case PROB_DIST_PARAM:
        TDDIProbDistParam ProbDistParam = (TDDIProbDistParam)value_;
        ProbDistParam.write(oprot);
        return;
      case FTAARTIFACT:
        TDDIAbstractFTAArtifact FTAArtifact = (TDDIAbstractFTAArtifact)value_;
        FTAArtifact.write(oprot);
        return;
      case FMEAARTIFACT:
        TDDIAbstractFMEAArtifact FMEAArtifact = (TDDIAbstractFMEAArtifact)value_;
        FMEAArtifact.write(oprot);
        return;
      case MARKOV_ARTIFACT:
        TDDIAbstractMarkovArtifact MarkovArtifact = (TDDIAbstractMarkovArtifact)value_;
        MarkovArtifact.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case FAILURE_LOGIC_PACKAGE:
        return FAILURE_LOGIC_PACKAGE_FIELD_DESC;
      case MINIMAL_CUTSET:
        return MINIMAL_CUTSET_FIELD_DESC;
      case INTERFACE_FAILURE_PROPAGATION:
        return INTERFACE_FAILURE_PROPAGATION_FIELD_DESC;
      case FAILURE:
        return FAILURE_FIELD_DESC;
      case FAILURE_MODE:
        return FAILURE_MODE_FIELD_DESC;
      case PROBABILITY_DISTRIBUTION:
        return PROBABILITY_DISTRIBUTION_FIELD_DESC;
      case PROB_DIST_PARAM:
        return PROB_DIST_PARAM_FIELD_DESC;
      case FTAARTIFACT:
        return FTAARTIFACT_FIELD_DESC;
      case FMEAARTIFACT:
        return FMEAARTIFACT_FIELD_DESC;
      case MARKOV_ARTIFACT:
        return MARKOV_ARTIFACT_FIELD_DESC;
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public TDDIAbstractFailureLogicPackage getFailureLogicPackage() {
    if (getSetField() == _Fields.FAILURE_LOGIC_PACKAGE) {
      return (TDDIAbstractFailureLogicPackage)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'FailureLogicPackage' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFailureLogicPackage(TDDIAbstractFailureLogicPackage value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.FAILURE_LOGIC_PACKAGE;
    value_ = value;
  }

  public TDDIMinimalCutset getMinimalCutset() {
    if (getSetField() == _Fields.MINIMAL_CUTSET) {
      return (TDDIMinimalCutset)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'MinimalCutset' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setMinimalCutset(TDDIMinimalCutset value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.MINIMAL_CUTSET;
    value_ = value;
  }

  public TDDIInterfaceFailurePropagation getInterfaceFailurePropagation() {
    if (getSetField() == _Fields.INTERFACE_FAILURE_PROPAGATION) {
      return (TDDIInterfaceFailurePropagation)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'InterfaceFailurePropagation' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setInterfaceFailurePropagation(TDDIInterfaceFailurePropagation value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.INTERFACE_FAILURE_PROPAGATION;
    value_ = value;
  }

  public TDDIAbstractFailure getFailure() {
    if (getSetField() == _Fields.FAILURE) {
      return (TDDIAbstractFailure)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'Failure' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFailure(TDDIAbstractFailure value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.FAILURE;
    value_ = value;
  }

  public TDDIFailureMode getFailureMode() {
    if (getSetField() == _Fields.FAILURE_MODE) {
      return (TDDIFailureMode)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'FailureMode' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFailureMode(TDDIFailureMode value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.FAILURE_MODE;
    value_ = value;
  }

  public TDDIProbabilityDistribution getProbabilityDistribution() {
    if (getSetField() == _Fields.PROBABILITY_DISTRIBUTION) {
      return (TDDIProbabilityDistribution)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'ProbabilityDistribution' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setProbabilityDistribution(TDDIProbabilityDistribution value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.PROBABILITY_DISTRIBUTION;
    value_ = value;
  }

  public TDDIProbDistParam getProbDistParam() {
    if (getSetField() == _Fields.PROB_DIST_PARAM) {
      return (TDDIProbDistParam)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'ProbDistParam' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setProbDistParam(TDDIProbDistParam value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.PROB_DIST_PARAM;
    value_ = value;
  }

  public TDDIAbstractFTAArtifact getFTAArtifact() {
    if (getSetField() == _Fields.FTAARTIFACT) {
      return (TDDIAbstractFTAArtifact)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'FTAArtifact' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFTAArtifact(TDDIAbstractFTAArtifact value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.FTAARTIFACT;
    value_ = value;
  }

  public TDDIAbstractFMEAArtifact getFMEAArtifact() {
    if (getSetField() == _Fields.FMEAARTIFACT) {
      return (TDDIAbstractFMEAArtifact)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'FMEAArtifact' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFMEAArtifact(TDDIAbstractFMEAArtifact value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.FMEAARTIFACT;
    value_ = value;
  }

  public TDDIAbstractMarkovArtifact getMarkovArtifact() {
    if (getSetField() == _Fields.MARKOV_ARTIFACT) {
      return (TDDIAbstractMarkovArtifact)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'MarkovArtifact' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setMarkovArtifact(TDDIAbstractMarkovArtifact value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.MARKOV_ARTIFACT;
    value_ = value;
  }

  public boolean isSetFailureLogicPackage() {
    return setField_ == _Fields.FAILURE_LOGIC_PACKAGE;
  }


  public boolean isSetMinimalCutset() {
    return setField_ == _Fields.MINIMAL_CUTSET;
  }


  public boolean isSetInterfaceFailurePropagation() {
    return setField_ == _Fields.INTERFACE_FAILURE_PROPAGATION;
  }


  public boolean isSetFailure() {
    return setField_ == _Fields.FAILURE;
  }


  public boolean isSetFailureMode() {
    return setField_ == _Fields.FAILURE_MODE;
  }


  public boolean isSetProbabilityDistribution() {
    return setField_ == _Fields.PROBABILITY_DISTRIBUTION;
  }


  public boolean isSetProbDistParam() {
    return setField_ == _Fields.PROB_DIST_PARAM;
  }


  public boolean isSetFTAArtifact() {
    return setField_ == _Fields.FTAARTIFACT;
  }


  public boolean isSetFMEAArtifact() {
    return setField_ == _Fields.FMEAARTIFACT;
  }


  public boolean isSetMarkovArtifact() {
    return setField_ == _Fields.MARKOV_ARTIFACT;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof TDDIFailureAnalysisArtifactUnion) {
      return equals((TDDIFailureAnalysisArtifactUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(TDDIFailureAnalysisArtifactUnion other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TDDIFailureAnalysisArtifactUnion other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      java.lang.Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}