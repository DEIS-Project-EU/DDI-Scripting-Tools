/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TDDIODEProductPackageUnion extends org.apache.thrift.TUnion<TDDIODEProductPackageUnion, TDDIODEProductPackageUnion._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIODEProductPackageUnion");
  private static final org.apache.thrift.protocol.TField DESIGN_PACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("DesignPackage", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField FAILURE_LOGIC_PACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("FailureLogicPackage", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField REQUIREMENT_PACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("RequirementPackage", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField HARAPACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("HARAPackage", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField DEPENDABILITY_PACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("DependabilityPackage", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField TARAPACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("TARAPackage", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField DOMAIN_PACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("DomainPackage", org.apache.thrift.protocol.TType.STRUCT, (short)7);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DESIGN_PACKAGE((short)1, "DesignPackage"),
    FAILURE_LOGIC_PACKAGE((short)2, "FailureLogicPackage"),
    REQUIREMENT_PACKAGE((short)3, "RequirementPackage"),
    HARAPACKAGE((short)4, "HARAPackage"),
    DEPENDABILITY_PACKAGE((short)5, "DependabilityPackage"),
    TARAPACKAGE((short)6, "TARAPackage"),
    DOMAIN_PACKAGE((short)7, "DomainPackage");

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
        case 1: // DESIGN_PACKAGE
          return DESIGN_PACKAGE;
        case 2: // FAILURE_LOGIC_PACKAGE
          return FAILURE_LOGIC_PACKAGE;
        case 3: // REQUIREMENT_PACKAGE
          return REQUIREMENT_PACKAGE;
        case 4: // HARAPACKAGE
          return HARAPACKAGE;
        case 5: // DEPENDABILITY_PACKAGE
          return DEPENDABILITY_PACKAGE;
        case 6: // TARAPACKAGE
          return TARAPACKAGE;
        case 7: // DOMAIN_PACKAGE
          return DOMAIN_PACKAGE;
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
    tmpMap.put(_Fields.DESIGN_PACKAGE, new org.apache.thrift.meta_data.FieldMetaData("DesignPackage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIDesignPackage.class)));
    tmpMap.put(_Fields.FAILURE_LOGIC_PACKAGE, new org.apache.thrift.meta_data.FieldMetaData("FailureLogicPackage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIFailureLogicPackage.class)));
    tmpMap.put(_Fields.REQUIREMENT_PACKAGE, new org.apache.thrift.meta_data.FieldMetaData("RequirementPackage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIRequirementPackage")));
    tmpMap.put(_Fields.HARAPACKAGE, new org.apache.thrift.meta_data.FieldMetaData("HARAPackage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIHARAPackage.class)));
    tmpMap.put(_Fields.DEPENDABILITY_PACKAGE, new org.apache.thrift.meta_data.FieldMetaData("DependabilityPackage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIDependabilityPackage.class)));
    tmpMap.put(_Fields.TARAPACKAGE, new org.apache.thrift.meta_data.FieldMetaData("TARAPackage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDITARAPackage")));
    tmpMap.put(_Fields.DOMAIN_PACKAGE, new org.apache.thrift.meta_data.FieldMetaData("DomainPackage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIDomainPackage.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIODEProductPackageUnion.class, metaDataMap);
  }

  public TDDIODEProductPackageUnion() {
    super();
  }

  public TDDIODEProductPackageUnion(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public TDDIODEProductPackageUnion(TDDIODEProductPackageUnion other) {
    super(other);
  }
  public TDDIODEProductPackageUnion deepCopy() {
    return new TDDIODEProductPackageUnion(this);
  }

  public static TDDIODEProductPackageUnion DesignPackage(TDDIDesignPackage value) {
    TDDIODEProductPackageUnion x = new TDDIODEProductPackageUnion();
    x.setDesignPackage(value);
    return x;
  }

  public static TDDIODEProductPackageUnion FailureLogicPackage(TDDIFailureLogicPackage value) {
    TDDIODEProductPackageUnion x = new TDDIODEProductPackageUnion();
    x.setFailureLogicPackage(value);
    return x;
  }

  public static TDDIODEProductPackageUnion RequirementPackage(TDDIRequirementPackage value) {
    TDDIODEProductPackageUnion x = new TDDIODEProductPackageUnion();
    x.setRequirementPackage(value);
    return x;
  }

  public static TDDIODEProductPackageUnion HARAPackage(TDDIHARAPackage value) {
    TDDIODEProductPackageUnion x = new TDDIODEProductPackageUnion();
    x.setHARAPackage(value);
    return x;
  }

  public static TDDIODEProductPackageUnion DependabilityPackage(TDDIDependabilityPackage value) {
    TDDIODEProductPackageUnion x = new TDDIODEProductPackageUnion();
    x.setDependabilityPackage(value);
    return x;
  }

  public static TDDIODEProductPackageUnion TARAPackage(TDDITARAPackage value) {
    TDDIODEProductPackageUnion x = new TDDIODEProductPackageUnion();
    x.setTARAPackage(value);
    return x;
  }

  public static TDDIODEProductPackageUnion DomainPackage(TDDIDomainPackage value) {
    TDDIODEProductPackageUnion x = new TDDIODEProductPackageUnion();
    x.setDomainPackage(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case DESIGN_PACKAGE:
        if (value instanceof TDDIDesignPackage) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIDesignPackage for field 'DesignPackage', but got " + value.getClass().getSimpleName());
      case FAILURE_LOGIC_PACKAGE:
        if (value instanceof TDDIFailureLogicPackage) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIFailureLogicPackage for field 'FailureLogicPackage', but got " + value.getClass().getSimpleName());
      case REQUIREMENT_PACKAGE:
        if (value instanceof TDDIRequirementPackage) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIRequirementPackage for field 'RequirementPackage', but got " + value.getClass().getSimpleName());
      case HARAPACKAGE:
        if (value instanceof TDDIHARAPackage) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIHARAPackage for field 'HARAPackage', but got " + value.getClass().getSimpleName());
      case DEPENDABILITY_PACKAGE:
        if (value instanceof TDDIDependabilityPackage) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIDependabilityPackage for field 'DependabilityPackage', but got " + value.getClass().getSimpleName());
      case TARAPACKAGE:
        if (value instanceof TDDITARAPackage) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDITARAPackage for field 'TARAPackage', but got " + value.getClass().getSimpleName());
      case DOMAIN_PACKAGE:
        if (value instanceof TDDIDomainPackage) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIDomainPackage for field 'DomainPackage', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case DESIGN_PACKAGE:
          if (field.type == DESIGN_PACKAGE_FIELD_DESC.type) {
            TDDIDesignPackage DesignPackage;
            DesignPackage = new TDDIDesignPackage();
            DesignPackage.read(iprot);
            return DesignPackage;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
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
        case REQUIREMENT_PACKAGE:
          if (field.type == REQUIREMENT_PACKAGE_FIELD_DESC.type) {
            TDDIRequirementPackage RequirementPackage;
            RequirementPackage = new TDDIRequirementPackage();
            RequirementPackage.read(iprot);
            return RequirementPackage;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case HARAPACKAGE:
          if (field.type == HARAPACKAGE_FIELD_DESC.type) {
            TDDIHARAPackage HARAPackage;
            HARAPackage = new TDDIHARAPackage();
            HARAPackage.read(iprot);
            return HARAPackage;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case DEPENDABILITY_PACKAGE:
          if (field.type == DEPENDABILITY_PACKAGE_FIELD_DESC.type) {
            TDDIDependabilityPackage DependabilityPackage;
            DependabilityPackage = new TDDIDependabilityPackage();
            DependabilityPackage.read(iprot);
            return DependabilityPackage;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case TARAPACKAGE:
          if (field.type == TARAPACKAGE_FIELD_DESC.type) {
            TDDITARAPackage TARAPackage;
            TARAPackage = new TDDITARAPackage();
            TARAPackage.read(iprot);
            return TARAPackage;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case DOMAIN_PACKAGE:
          if (field.type == DOMAIN_PACKAGE_FIELD_DESC.type) {
            TDDIDomainPackage DomainPackage;
            DomainPackage = new TDDIDomainPackage();
            DomainPackage.read(iprot);
            return DomainPackage;
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
      case DESIGN_PACKAGE:
        TDDIDesignPackage DesignPackage = (TDDIDesignPackage)value_;
        DesignPackage.write(oprot);
        return;
      case FAILURE_LOGIC_PACKAGE:
        TDDIFailureLogicPackage FailureLogicPackage = (TDDIFailureLogicPackage)value_;
        FailureLogicPackage.write(oprot);
        return;
      case REQUIREMENT_PACKAGE:
        TDDIRequirementPackage RequirementPackage = (TDDIRequirementPackage)value_;
        RequirementPackage.write(oprot);
        return;
      case HARAPACKAGE:
        TDDIHARAPackage HARAPackage = (TDDIHARAPackage)value_;
        HARAPackage.write(oprot);
        return;
      case DEPENDABILITY_PACKAGE:
        TDDIDependabilityPackage DependabilityPackage = (TDDIDependabilityPackage)value_;
        DependabilityPackage.write(oprot);
        return;
      case TARAPACKAGE:
        TDDITARAPackage TARAPackage = (TDDITARAPackage)value_;
        TARAPackage.write(oprot);
        return;
      case DOMAIN_PACKAGE:
        TDDIDomainPackage DomainPackage = (TDDIDomainPackage)value_;
        DomainPackage.write(oprot);
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
        case DESIGN_PACKAGE:
          TDDIDesignPackage DesignPackage;
          DesignPackage = new TDDIDesignPackage();
          DesignPackage.read(iprot);
          return DesignPackage;
        case FAILURE_LOGIC_PACKAGE:
          TDDIFailureLogicPackage FailureLogicPackage;
          FailureLogicPackage = new TDDIFailureLogicPackage();
          FailureLogicPackage.read(iprot);
          return FailureLogicPackage;
        case REQUIREMENT_PACKAGE:
          TDDIRequirementPackage RequirementPackage;
          RequirementPackage = new TDDIRequirementPackage();
          RequirementPackage.read(iprot);
          return RequirementPackage;
        case HARAPACKAGE:
          TDDIHARAPackage HARAPackage;
          HARAPackage = new TDDIHARAPackage();
          HARAPackage.read(iprot);
          return HARAPackage;
        case DEPENDABILITY_PACKAGE:
          TDDIDependabilityPackage DependabilityPackage;
          DependabilityPackage = new TDDIDependabilityPackage();
          DependabilityPackage.read(iprot);
          return DependabilityPackage;
        case TARAPACKAGE:
          TDDITARAPackage TARAPackage;
          TARAPackage = new TDDITARAPackage();
          TARAPackage.read(iprot);
          return TARAPackage;
        case DOMAIN_PACKAGE:
          TDDIDomainPackage DomainPackage;
          DomainPackage = new TDDIDomainPackage();
          DomainPackage.read(iprot);
          return DomainPackage;
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
      case DESIGN_PACKAGE:
        TDDIDesignPackage DesignPackage = (TDDIDesignPackage)value_;
        DesignPackage.write(oprot);
        return;
      case FAILURE_LOGIC_PACKAGE:
        TDDIFailureLogicPackage FailureLogicPackage = (TDDIFailureLogicPackage)value_;
        FailureLogicPackage.write(oprot);
        return;
      case REQUIREMENT_PACKAGE:
        TDDIRequirementPackage RequirementPackage = (TDDIRequirementPackage)value_;
        RequirementPackage.write(oprot);
        return;
      case HARAPACKAGE:
        TDDIHARAPackage HARAPackage = (TDDIHARAPackage)value_;
        HARAPackage.write(oprot);
        return;
      case DEPENDABILITY_PACKAGE:
        TDDIDependabilityPackage DependabilityPackage = (TDDIDependabilityPackage)value_;
        DependabilityPackage.write(oprot);
        return;
      case TARAPACKAGE:
        TDDITARAPackage TARAPackage = (TDDITARAPackage)value_;
        TARAPackage.write(oprot);
        return;
      case DOMAIN_PACKAGE:
        TDDIDomainPackage DomainPackage = (TDDIDomainPackage)value_;
        DomainPackage.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case DESIGN_PACKAGE:
        return DESIGN_PACKAGE_FIELD_DESC;
      case FAILURE_LOGIC_PACKAGE:
        return FAILURE_LOGIC_PACKAGE_FIELD_DESC;
      case REQUIREMENT_PACKAGE:
        return REQUIREMENT_PACKAGE_FIELD_DESC;
      case HARAPACKAGE:
        return HARAPACKAGE_FIELD_DESC;
      case DEPENDABILITY_PACKAGE:
        return DEPENDABILITY_PACKAGE_FIELD_DESC;
      case TARAPACKAGE:
        return TARAPACKAGE_FIELD_DESC;
      case DOMAIN_PACKAGE:
        return DOMAIN_PACKAGE_FIELD_DESC;
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


  public TDDIDesignPackage getDesignPackage() {
    if (getSetField() == _Fields.DESIGN_PACKAGE) {
      return (TDDIDesignPackage)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'DesignPackage' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDesignPackage(TDDIDesignPackage value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.DESIGN_PACKAGE;
    value_ = value;
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

  public TDDIRequirementPackage getRequirementPackage() {
    if (getSetField() == _Fields.REQUIREMENT_PACKAGE) {
      return (TDDIRequirementPackage)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'RequirementPackage' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setRequirementPackage(TDDIRequirementPackage value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.REQUIREMENT_PACKAGE;
    value_ = value;
  }

  public TDDIHARAPackage getHARAPackage() {
    if (getSetField() == _Fields.HARAPACKAGE) {
      return (TDDIHARAPackage)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'HARAPackage' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setHARAPackage(TDDIHARAPackage value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.HARAPACKAGE;
    value_ = value;
  }

  public TDDIDependabilityPackage getDependabilityPackage() {
    if (getSetField() == _Fields.DEPENDABILITY_PACKAGE) {
      return (TDDIDependabilityPackage)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'DependabilityPackage' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDependabilityPackage(TDDIDependabilityPackage value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.DEPENDABILITY_PACKAGE;
    value_ = value;
  }

  public TDDITARAPackage getTARAPackage() {
    if (getSetField() == _Fields.TARAPACKAGE) {
      return (TDDITARAPackage)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'TARAPackage' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setTARAPackage(TDDITARAPackage value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.TARAPACKAGE;
    value_ = value;
  }

  public TDDIDomainPackage getDomainPackage() {
    if (getSetField() == _Fields.DOMAIN_PACKAGE) {
      return (TDDIDomainPackage)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'DomainPackage' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDomainPackage(TDDIDomainPackage value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.DOMAIN_PACKAGE;
    value_ = value;
  }

  public boolean isSetDesignPackage() {
    return setField_ == _Fields.DESIGN_PACKAGE;
  }


  public boolean isSetFailureLogicPackage() {
    return setField_ == _Fields.FAILURE_LOGIC_PACKAGE;
  }


  public boolean isSetRequirementPackage() {
    return setField_ == _Fields.REQUIREMENT_PACKAGE;
  }


  public boolean isSetHARAPackage() {
    return setField_ == _Fields.HARAPACKAGE;
  }


  public boolean isSetDependabilityPackage() {
    return setField_ == _Fields.DEPENDABILITY_PACKAGE;
  }


  public boolean isSetTARAPackage() {
    return setField_ == _Fields.TARAPACKAGE;
  }


  public boolean isSetDomainPackage() {
    return setField_ == _Fields.DOMAIN_PACKAGE;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof TDDIODEProductPackageUnion) {
      return equals((TDDIODEProductPackageUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(TDDIODEProductPackageUnion other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TDDIODEProductPackageUnion other) {
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