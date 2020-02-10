/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TDDIFailureLogicPackageUnion extends org.apache.thrift.TUnion<TDDIFailureLogicPackageUnion, TDDIFailureLogicPackageUnion._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIFailureLogicPackageUnion");
  private static final org.apache.thrift.protocol.TField FAILURE_LOGIC_PACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("FailureLogicPackage", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField FAILURE_LOGIC_PACKAGE_INTERFACE_FIELD_DESC = new org.apache.thrift.protocol.TField("FailureLogicPackageInterface", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField FAILURE_LOGIC_PACKAGE_BINDING_FIELD_DESC = new org.apache.thrift.protocol.TField("FailureLogicPackageBinding", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField FTAPACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("FTAPackage", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField FMEAPACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("FMEAPackage", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField MARKOV_CHAIN_PACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("MarkovChainPackage", org.apache.thrift.protocol.TType.STRUCT, (short)6);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FAILURE_LOGIC_PACKAGE((short)1, "FailureLogicPackage"),
    FAILURE_LOGIC_PACKAGE_INTERFACE((short)2, "FailureLogicPackageInterface"),
    FAILURE_LOGIC_PACKAGE_BINDING((short)3, "FailureLogicPackageBinding"),
    FTAPACKAGE((short)4, "FTAPackage"),
    FMEAPACKAGE((short)5, "FMEAPackage"),
    MARKOV_CHAIN_PACKAGE((short)6, "MarkovChainPackage");

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
        case 2: // FAILURE_LOGIC_PACKAGE_INTERFACE
          return FAILURE_LOGIC_PACKAGE_INTERFACE;
        case 3: // FAILURE_LOGIC_PACKAGE_BINDING
          return FAILURE_LOGIC_PACKAGE_BINDING;
        case 4: // FTAPACKAGE
          return FTAPACKAGE;
        case 5: // FMEAPACKAGE
          return FMEAPACKAGE;
        case 6: // MARKOV_CHAIN_PACKAGE
          return MARKOV_CHAIN_PACKAGE;
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
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIFailureLogicPackage.class)));
    tmpMap.put(_Fields.FAILURE_LOGIC_PACKAGE_INTERFACE, new org.apache.thrift.meta_data.FieldMetaData("FailureLogicPackageInterface", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIFailureLogicPackageInterface.class)));
    tmpMap.put(_Fields.FAILURE_LOGIC_PACKAGE_BINDING, new org.apache.thrift.meta_data.FieldMetaData("FailureLogicPackageBinding", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIFailureLogicPackageBinding.class)));
    tmpMap.put(_Fields.FTAPACKAGE, new org.apache.thrift.meta_data.FieldMetaData("FTAPackage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIAbstractFTAPackage")));
    tmpMap.put(_Fields.FMEAPACKAGE, new org.apache.thrift.meta_data.FieldMetaData("FMEAPackage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIAbstractFMEAPackage")));
    tmpMap.put(_Fields.MARKOV_CHAIN_PACKAGE, new org.apache.thrift.meta_data.FieldMetaData("MarkovChainPackage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIAbstractMarkovChainPackage")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIFailureLogicPackageUnion.class, metaDataMap);
  }

  public TDDIFailureLogicPackageUnion() {
    super();
  }

  public TDDIFailureLogicPackageUnion(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public TDDIFailureLogicPackageUnion(TDDIFailureLogicPackageUnion other) {
    super(other);
  }
  public TDDIFailureLogicPackageUnion deepCopy() {
    return new TDDIFailureLogicPackageUnion(this);
  }

  public static TDDIFailureLogicPackageUnion FailureLogicPackage(TDDIFailureLogicPackage value) {
    TDDIFailureLogicPackageUnion x = new TDDIFailureLogicPackageUnion();
    x.setFailureLogicPackage(value);
    return x;
  }

  public static TDDIFailureLogicPackageUnion FailureLogicPackageInterface(TDDIFailureLogicPackageInterface value) {
    TDDIFailureLogicPackageUnion x = new TDDIFailureLogicPackageUnion();
    x.setFailureLogicPackageInterface(value);
    return x;
  }

  public static TDDIFailureLogicPackageUnion FailureLogicPackageBinding(TDDIFailureLogicPackageBinding value) {
    TDDIFailureLogicPackageUnion x = new TDDIFailureLogicPackageUnion();
    x.setFailureLogicPackageBinding(value);
    return x;
  }

  public static TDDIFailureLogicPackageUnion FTAPackage(TDDIAbstractFTAPackage value) {
    TDDIFailureLogicPackageUnion x = new TDDIFailureLogicPackageUnion();
    x.setFTAPackage(value);
    return x;
  }

  public static TDDIFailureLogicPackageUnion FMEAPackage(TDDIAbstractFMEAPackage value) {
    TDDIFailureLogicPackageUnion x = new TDDIFailureLogicPackageUnion();
    x.setFMEAPackage(value);
    return x;
  }

  public static TDDIFailureLogicPackageUnion MarkovChainPackage(TDDIAbstractMarkovChainPackage value) {
    TDDIFailureLogicPackageUnion x = new TDDIFailureLogicPackageUnion();
    x.setMarkovChainPackage(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case FAILURE_LOGIC_PACKAGE:
        if (value instanceof TDDIFailureLogicPackage) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIFailureLogicPackage for field 'FailureLogicPackage', but got " + value.getClass().getSimpleName());
      case FAILURE_LOGIC_PACKAGE_INTERFACE:
        if (value instanceof TDDIFailureLogicPackageInterface) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIFailureLogicPackageInterface for field 'FailureLogicPackageInterface', but got " + value.getClass().getSimpleName());
      case FAILURE_LOGIC_PACKAGE_BINDING:
        if (value instanceof TDDIFailureLogicPackageBinding) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIFailureLogicPackageBinding for field 'FailureLogicPackageBinding', but got " + value.getClass().getSimpleName());
      case FTAPACKAGE:
        if (value instanceof TDDIAbstractFTAPackage) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIAbstractFTAPackage for field 'FTAPackage', but got " + value.getClass().getSimpleName());
      case FMEAPACKAGE:
        if (value instanceof TDDIAbstractFMEAPackage) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIAbstractFMEAPackage for field 'FMEAPackage', but got " + value.getClass().getSimpleName());
      case MARKOV_CHAIN_PACKAGE:
        if (value instanceof TDDIAbstractMarkovChainPackage) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIAbstractMarkovChainPackage for field 'MarkovChainPackage', but got " + value.getClass().getSimpleName());
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
            TDDIFailureLogicPackage FailureLogicPackage;
            FailureLogicPackage = new TDDIFailureLogicPackage();
            FailureLogicPackage.read(iprot);
            return FailureLogicPackage;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case FAILURE_LOGIC_PACKAGE_INTERFACE:
          if (field.type == FAILURE_LOGIC_PACKAGE_INTERFACE_FIELD_DESC.type) {
            TDDIFailureLogicPackageInterface FailureLogicPackageInterface;
            FailureLogicPackageInterface = new TDDIFailureLogicPackageInterface();
            FailureLogicPackageInterface.read(iprot);
            return FailureLogicPackageInterface;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case FAILURE_LOGIC_PACKAGE_BINDING:
          if (field.type == FAILURE_LOGIC_PACKAGE_BINDING_FIELD_DESC.type) {
            TDDIFailureLogicPackageBinding FailureLogicPackageBinding;
            FailureLogicPackageBinding = new TDDIFailureLogicPackageBinding();
            FailureLogicPackageBinding.read(iprot);
            return FailureLogicPackageBinding;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case FTAPACKAGE:
          if (field.type == FTAPACKAGE_FIELD_DESC.type) {
            TDDIAbstractFTAPackage FTAPackage;
            FTAPackage = new TDDIAbstractFTAPackage();
            FTAPackage.read(iprot);
            return FTAPackage;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case FMEAPACKAGE:
          if (field.type == FMEAPACKAGE_FIELD_DESC.type) {
            TDDIAbstractFMEAPackage FMEAPackage;
            FMEAPackage = new TDDIAbstractFMEAPackage();
            FMEAPackage.read(iprot);
            return FMEAPackage;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case MARKOV_CHAIN_PACKAGE:
          if (field.type == MARKOV_CHAIN_PACKAGE_FIELD_DESC.type) {
            TDDIAbstractMarkovChainPackage MarkovChainPackage;
            MarkovChainPackage = new TDDIAbstractMarkovChainPackage();
            MarkovChainPackage.read(iprot);
            return MarkovChainPackage;
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
        TDDIFailureLogicPackage FailureLogicPackage = (TDDIFailureLogicPackage)value_;
        FailureLogicPackage.write(oprot);
        return;
      case FAILURE_LOGIC_PACKAGE_INTERFACE:
        TDDIFailureLogicPackageInterface FailureLogicPackageInterface = (TDDIFailureLogicPackageInterface)value_;
        FailureLogicPackageInterface.write(oprot);
        return;
      case FAILURE_LOGIC_PACKAGE_BINDING:
        TDDIFailureLogicPackageBinding FailureLogicPackageBinding = (TDDIFailureLogicPackageBinding)value_;
        FailureLogicPackageBinding.write(oprot);
        return;
      case FTAPACKAGE:
        TDDIAbstractFTAPackage FTAPackage = (TDDIAbstractFTAPackage)value_;
        FTAPackage.write(oprot);
        return;
      case FMEAPACKAGE:
        TDDIAbstractFMEAPackage FMEAPackage = (TDDIAbstractFMEAPackage)value_;
        FMEAPackage.write(oprot);
        return;
      case MARKOV_CHAIN_PACKAGE:
        TDDIAbstractMarkovChainPackage MarkovChainPackage = (TDDIAbstractMarkovChainPackage)value_;
        MarkovChainPackage.write(oprot);
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
          TDDIFailureLogicPackage FailureLogicPackage;
          FailureLogicPackage = new TDDIFailureLogicPackage();
          FailureLogicPackage.read(iprot);
          return FailureLogicPackage;
        case FAILURE_LOGIC_PACKAGE_INTERFACE:
          TDDIFailureLogicPackageInterface FailureLogicPackageInterface;
          FailureLogicPackageInterface = new TDDIFailureLogicPackageInterface();
          FailureLogicPackageInterface.read(iprot);
          return FailureLogicPackageInterface;
        case FAILURE_LOGIC_PACKAGE_BINDING:
          TDDIFailureLogicPackageBinding FailureLogicPackageBinding;
          FailureLogicPackageBinding = new TDDIFailureLogicPackageBinding();
          FailureLogicPackageBinding.read(iprot);
          return FailureLogicPackageBinding;
        case FTAPACKAGE:
          TDDIAbstractFTAPackage FTAPackage;
          FTAPackage = new TDDIAbstractFTAPackage();
          FTAPackage.read(iprot);
          return FTAPackage;
        case FMEAPACKAGE:
          TDDIAbstractFMEAPackage FMEAPackage;
          FMEAPackage = new TDDIAbstractFMEAPackage();
          FMEAPackage.read(iprot);
          return FMEAPackage;
        case MARKOV_CHAIN_PACKAGE:
          TDDIAbstractMarkovChainPackage MarkovChainPackage;
          MarkovChainPackage = new TDDIAbstractMarkovChainPackage();
          MarkovChainPackage.read(iprot);
          return MarkovChainPackage;
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
        TDDIFailureLogicPackage FailureLogicPackage = (TDDIFailureLogicPackage)value_;
        FailureLogicPackage.write(oprot);
        return;
      case FAILURE_LOGIC_PACKAGE_INTERFACE:
        TDDIFailureLogicPackageInterface FailureLogicPackageInterface = (TDDIFailureLogicPackageInterface)value_;
        FailureLogicPackageInterface.write(oprot);
        return;
      case FAILURE_LOGIC_PACKAGE_BINDING:
        TDDIFailureLogicPackageBinding FailureLogicPackageBinding = (TDDIFailureLogicPackageBinding)value_;
        FailureLogicPackageBinding.write(oprot);
        return;
      case FTAPACKAGE:
        TDDIAbstractFTAPackage FTAPackage = (TDDIAbstractFTAPackage)value_;
        FTAPackage.write(oprot);
        return;
      case FMEAPACKAGE:
        TDDIAbstractFMEAPackage FMEAPackage = (TDDIAbstractFMEAPackage)value_;
        FMEAPackage.write(oprot);
        return;
      case MARKOV_CHAIN_PACKAGE:
        TDDIAbstractMarkovChainPackage MarkovChainPackage = (TDDIAbstractMarkovChainPackage)value_;
        MarkovChainPackage.write(oprot);
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
      case FAILURE_LOGIC_PACKAGE_INTERFACE:
        return FAILURE_LOGIC_PACKAGE_INTERFACE_FIELD_DESC;
      case FAILURE_LOGIC_PACKAGE_BINDING:
        return FAILURE_LOGIC_PACKAGE_BINDING_FIELD_DESC;
      case FTAPACKAGE:
        return FTAPACKAGE_FIELD_DESC;
      case FMEAPACKAGE:
        return FMEAPACKAGE_FIELD_DESC;
      case MARKOV_CHAIN_PACKAGE:
        return MARKOV_CHAIN_PACKAGE_FIELD_DESC;
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


  public TDDIFailureLogicPackage getFailureLogicPackage() {
    if (getSetField() == _Fields.FAILURE_LOGIC_PACKAGE) {
      return (TDDIFailureLogicPackage)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'FailureLogicPackage' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFailureLogicPackage(TDDIFailureLogicPackage value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.FAILURE_LOGIC_PACKAGE;
    value_ = value;
  }

  public TDDIFailureLogicPackageInterface getFailureLogicPackageInterface() {
    if (getSetField() == _Fields.FAILURE_LOGIC_PACKAGE_INTERFACE) {
      return (TDDIFailureLogicPackageInterface)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'FailureLogicPackageInterface' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFailureLogicPackageInterface(TDDIFailureLogicPackageInterface value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.FAILURE_LOGIC_PACKAGE_INTERFACE;
    value_ = value;
  }

  public TDDIFailureLogicPackageBinding getFailureLogicPackageBinding() {
    if (getSetField() == _Fields.FAILURE_LOGIC_PACKAGE_BINDING) {
      return (TDDIFailureLogicPackageBinding)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'FailureLogicPackageBinding' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFailureLogicPackageBinding(TDDIFailureLogicPackageBinding value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.FAILURE_LOGIC_PACKAGE_BINDING;
    value_ = value;
  }

  public TDDIAbstractFTAPackage getFTAPackage() {
    if (getSetField() == _Fields.FTAPACKAGE) {
      return (TDDIAbstractFTAPackage)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'FTAPackage' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFTAPackage(TDDIAbstractFTAPackage value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.FTAPACKAGE;
    value_ = value;
  }

  public TDDIAbstractFMEAPackage getFMEAPackage() {
    if (getSetField() == _Fields.FMEAPACKAGE) {
      return (TDDIAbstractFMEAPackage)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'FMEAPackage' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFMEAPackage(TDDIAbstractFMEAPackage value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.FMEAPACKAGE;
    value_ = value;
  }

  public TDDIAbstractMarkovChainPackage getMarkovChainPackage() {
    if (getSetField() == _Fields.MARKOV_CHAIN_PACKAGE) {
      return (TDDIAbstractMarkovChainPackage)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'MarkovChainPackage' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setMarkovChainPackage(TDDIAbstractMarkovChainPackage value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.MARKOV_CHAIN_PACKAGE;
    value_ = value;
  }

  public boolean isSetFailureLogicPackage() {
    return setField_ == _Fields.FAILURE_LOGIC_PACKAGE;
  }


  public boolean isSetFailureLogicPackageInterface() {
    return setField_ == _Fields.FAILURE_LOGIC_PACKAGE_INTERFACE;
  }


  public boolean isSetFailureLogicPackageBinding() {
    return setField_ == _Fields.FAILURE_LOGIC_PACKAGE_BINDING;
  }


  public boolean isSetFTAPackage() {
    return setField_ == _Fields.FTAPACKAGE;
  }


  public boolean isSetFMEAPackage() {
    return setField_ == _Fields.FMEAPACKAGE;
  }


  public boolean isSetMarkovChainPackage() {
    return setField_ == _Fields.MARKOV_CHAIN_PACKAGE;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof TDDIFailureLogicPackageUnion) {
      return equals((TDDIFailureLogicPackageUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(TDDIFailureLogicPackageUnion other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TDDIFailureLogicPackageUnion other) {
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
