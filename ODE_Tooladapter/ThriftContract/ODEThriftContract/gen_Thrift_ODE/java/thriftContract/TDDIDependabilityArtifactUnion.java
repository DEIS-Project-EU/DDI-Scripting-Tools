/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TDDIDependabilityArtifactUnion extends org.apache.thrift.TUnion<TDDIDependabilityArtifactUnion, TDDIDependabilityArtifactUnion._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIDependabilityArtifactUnion");
  private static final org.apache.thrift.protocol.TField DEPENDABILITY_PACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("DependabilityPackage", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField MEASURE_FIELD_DESC = new org.apache.thrift.protocol.TField("Measure", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField MEASURE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("MeasureType", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField MAINTENANCE_PROCEDURE_FIELD_DESC = new org.apache.thrift.protocol.TField("MaintenanceProcedure", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField DOMAIN_ELEMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("DomainElement", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField REQUIREMENT_ARTIFACT_FIELD_DESC = new org.apache.thrift.protocol.TField("RequirementArtifact", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField HARAARTIFACT_FIELD_DESC = new org.apache.thrift.protocol.TField("HARAArtifact", org.apache.thrift.protocol.TType.STRUCT, (short)7);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DEPENDABILITY_PACKAGE((short)1, "DependabilityPackage"),
    MEASURE((short)2, "Measure"),
    MEASURE_TYPE((short)3, "MeasureType"),
    MAINTENANCE_PROCEDURE((short)4, "MaintenanceProcedure"),
    DOMAIN_ELEMENT((short)5, "DomainElement"),
    REQUIREMENT_ARTIFACT((short)6, "RequirementArtifact"),
    HARAARTIFACT((short)7, "HARAArtifact");

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
        case 1: // DEPENDABILITY_PACKAGE
          return DEPENDABILITY_PACKAGE;
        case 2: // MEASURE
          return MEASURE;
        case 3: // MEASURE_TYPE
          return MEASURE_TYPE;
        case 4: // MAINTENANCE_PROCEDURE
          return MAINTENANCE_PROCEDURE;
        case 5: // DOMAIN_ELEMENT
          return DOMAIN_ELEMENT;
        case 6: // REQUIREMENT_ARTIFACT
          return REQUIREMENT_ARTIFACT;
        case 7: // HARAARTIFACT
          return HARAARTIFACT;
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
    tmpMap.put(_Fields.DEPENDABILITY_PACKAGE, new org.apache.thrift.meta_data.FieldMetaData("DependabilityPackage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIAbstractDependabilityPackage.class)));
    tmpMap.put(_Fields.MEASURE, new org.apache.thrift.meta_data.FieldMetaData("Measure", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIAbstractMeasure.class)));
    tmpMap.put(_Fields.MEASURE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("MeasureType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIMeasureType.class)));
    tmpMap.put(_Fields.MAINTENANCE_PROCEDURE, new org.apache.thrift.meta_data.FieldMetaData("MaintenanceProcedure", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIMaintenanceProcedure.class)));
    tmpMap.put(_Fields.DOMAIN_ELEMENT, new org.apache.thrift.meta_data.FieldMetaData("DomainElement", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIAbstractDomainElement")));
    tmpMap.put(_Fields.REQUIREMENT_ARTIFACT, new org.apache.thrift.meta_data.FieldMetaData("RequirementArtifact", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIAbstractRequirementArtifact")));
    tmpMap.put(_Fields.HARAARTIFACT, new org.apache.thrift.meta_data.FieldMetaData("HARAArtifact", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIAbstractHARAArtifact")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIDependabilityArtifactUnion.class, metaDataMap);
  }

  public TDDIDependabilityArtifactUnion() {
    super();
  }

  public TDDIDependabilityArtifactUnion(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public TDDIDependabilityArtifactUnion(TDDIDependabilityArtifactUnion other) {
    super(other);
  }
  public TDDIDependabilityArtifactUnion deepCopy() {
    return new TDDIDependabilityArtifactUnion(this);
  }

  public static TDDIDependabilityArtifactUnion DependabilityPackage(TDDIAbstractDependabilityPackage value) {
    TDDIDependabilityArtifactUnion x = new TDDIDependabilityArtifactUnion();
    x.setDependabilityPackage(value);
    return x;
  }

  public static TDDIDependabilityArtifactUnion Measure(TDDIAbstractMeasure value) {
    TDDIDependabilityArtifactUnion x = new TDDIDependabilityArtifactUnion();
    x.setMeasure(value);
    return x;
  }

  public static TDDIDependabilityArtifactUnion MeasureType(TDDIMeasureType value) {
    TDDIDependabilityArtifactUnion x = new TDDIDependabilityArtifactUnion();
    x.setMeasureType(value);
    return x;
  }

  public static TDDIDependabilityArtifactUnion MaintenanceProcedure(TDDIMaintenanceProcedure value) {
    TDDIDependabilityArtifactUnion x = new TDDIDependabilityArtifactUnion();
    x.setMaintenanceProcedure(value);
    return x;
  }

  public static TDDIDependabilityArtifactUnion DomainElement(TDDIAbstractDomainElement value) {
    TDDIDependabilityArtifactUnion x = new TDDIDependabilityArtifactUnion();
    x.setDomainElement(value);
    return x;
  }

  public static TDDIDependabilityArtifactUnion RequirementArtifact(TDDIAbstractRequirementArtifact value) {
    TDDIDependabilityArtifactUnion x = new TDDIDependabilityArtifactUnion();
    x.setRequirementArtifact(value);
    return x;
  }

  public static TDDIDependabilityArtifactUnion HARAArtifact(TDDIAbstractHARAArtifact value) {
    TDDIDependabilityArtifactUnion x = new TDDIDependabilityArtifactUnion();
    x.setHARAArtifact(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case DEPENDABILITY_PACKAGE:
        if (value instanceof TDDIAbstractDependabilityPackage) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIAbstractDependabilityPackage for field 'DependabilityPackage', but got " + value.getClass().getSimpleName());
      case MEASURE:
        if (value instanceof TDDIAbstractMeasure) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIAbstractMeasure for field 'Measure', but got " + value.getClass().getSimpleName());
      case MEASURE_TYPE:
        if (value instanceof TDDIMeasureType) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIMeasureType for field 'MeasureType', but got " + value.getClass().getSimpleName());
      case MAINTENANCE_PROCEDURE:
        if (value instanceof TDDIMaintenanceProcedure) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIMaintenanceProcedure for field 'MaintenanceProcedure', but got " + value.getClass().getSimpleName());
      case DOMAIN_ELEMENT:
        if (value instanceof TDDIAbstractDomainElement) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIAbstractDomainElement for field 'DomainElement', but got " + value.getClass().getSimpleName());
      case REQUIREMENT_ARTIFACT:
        if (value instanceof TDDIAbstractRequirementArtifact) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIAbstractRequirementArtifact for field 'RequirementArtifact', but got " + value.getClass().getSimpleName());
      case HARAARTIFACT:
        if (value instanceof TDDIAbstractHARAArtifact) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIAbstractHARAArtifact for field 'HARAArtifact', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case DEPENDABILITY_PACKAGE:
          if (field.type == DEPENDABILITY_PACKAGE_FIELD_DESC.type) {
            TDDIAbstractDependabilityPackage DependabilityPackage;
            DependabilityPackage = new TDDIAbstractDependabilityPackage();
            DependabilityPackage.read(iprot);
            return DependabilityPackage;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case MEASURE:
          if (field.type == MEASURE_FIELD_DESC.type) {
            TDDIAbstractMeasure Measure;
            Measure = new TDDIAbstractMeasure();
            Measure.read(iprot);
            return Measure;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case MEASURE_TYPE:
          if (field.type == MEASURE_TYPE_FIELD_DESC.type) {
            TDDIMeasureType MeasureType;
            MeasureType = new TDDIMeasureType();
            MeasureType.read(iprot);
            return MeasureType;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case MAINTENANCE_PROCEDURE:
          if (field.type == MAINTENANCE_PROCEDURE_FIELD_DESC.type) {
            TDDIMaintenanceProcedure MaintenanceProcedure;
            MaintenanceProcedure = new TDDIMaintenanceProcedure();
            MaintenanceProcedure.read(iprot);
            return MaintenanceProcedure;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case DOMAIN_ELEMENT:
          if (field.type == DOMAIN_ELEMENT_FIELD_DESC.type) {
            TDDIAbstractDomainElement DomainElement;
            DomainElement = new TDDIAbstractDomainElement();
            DomainElement.read(iprot);
            return DomainElement;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case REQUIREMENT_ARTIFACT:
          if (field.type == REQUIREMENT_ARTIFACT_FIELD_DESC.type) {
            TDDIAbstractRequirementArtifact RequirementArtifact;
            RequirementArtifact = new TDDIAbstractRequirementArtifact();
            RequirementArtifact.read(iprot);
            return RequirementArtifact;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case HARAARTIFACT:
          if (field.type == HARAARTIFACT_FIELD_DESC.type) {
            TDDIAbstractHARAArtifact HARAArtifact;
            HARAArtifact = new TDDIAbstractHARAArtifact();
            HARAArtifact.read(iprot);
            return HARAArtifact;
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
      case DEPENDABILITY_PACKAGE:
        TDDIAbstractDependabilityPackage DependabilityPackage = (TDDIAbstractDependabilityPackage)value_;
        DependabilityPackage.write(oprot);
        return;
      case MEASURE:
        TDDIAbstractMeasure Measure = (TDDIAbstractMeasure)value_;
        Measure.write(oprot);
        return;
      case MEASURE_TYPE:
        TDDIMeasureType MeasureType = (TDDIMeasureType)value_;
        MeasureType.write(oprot);
        return;
      case MAINTENANCE_PROCEDURE:
        TDDIMaintenanceProcedure MaintenanceProcedure = (TDDIMaintenanceProcedure)value_;
        MaintenanceProcedure.write(oprot);
        return;
      case DOMAIN_ELEMENT:
        TDDIAbstractDomainElement DomainElement = (TDDIAbstractDomainElement)value_;
        DomainElement.write(oprot);
        return;
      case REQUIREMENT_ARTIFACT:
        TDDIAbstractRequirementArtifact RequirementArtifact = (TDDIAbstractRequirementArtifact)value_;
        RequirementArtifact.write(oprot);
        return;
      case HARAARTIFACT:
        TDDIAbstractHARAArtifact HARAArtifact = (TDDIAbstractHARAArtifact)value_;
        HARAArtifact.write(oprot);
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
        case DEPENDABILITY_PACKAGE:
          TDDIAbstractDependabilityPackage DependabilityPackage;
          DependabilityPackage = new TDDIAbstractDependabilityPackage();
          DependabilityPackage.read(iprot);
          return DependabilityPackage;
        case MEASURE:
          TDDIAbstractMeasure Measure;
          Measure = new TDDIAbstractMeasure();
          Measure.read(iprot);
          return Measure;
        case MEASURE_TYPE:
          TDDIMeasureType MeasureType;
          MeasureType = new TDDIMeasureType();
          MeasureType.read(iprot);
          return MeasureType;
        case MAINTENANCE_PROCEDURE:
          TDDIMaintenanceProcedure MaintenanceProcedure;
          MaintenanceProcedure = new TDDIMaintenanceProcedure();
          MaintenanceProcedure.read(iprot);
          return MaintenanceProcedure;
        case DOMAIN_ELEMENT:
          TDDIAbstractDomainElement DomainElement;
          DomainElement = new TDDIAbstractDomainElement();
          DomainElement.read(iprot);
          return DomainElement;
        case REQUIREMENT_ARTIFACT:
          TDDIAbstractRequirementArtifact RequirementArtifact;
          RequirementArtifact = new TDDIAbstractRequirementArtifact();
          RequirementArtifact.read(iprot);
          return RequirementArtifact;
        case HARAARTIFACT:
          TDDIAbstractHARAArtifact HARAArtifact;
          HARAArtifact = new TDDIAbstractHARAArtifact();
          HARAArtifact.read(iprot);
          return HARAArtifact;
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
      case DEPENDABILITY_PACKAGE:
        TDDIAbstractDependabilityPackage DependabilityPackage = (TDDIAbstractDependabilityPackage)value_;
        DependabilityPackage.write(oprot);
        return;
      case MEASURE:
        TDDIAbstractMeasure Measure = (TDDIAbstractMeasure)value_;
        Measure.write(oprot);
        return;
      case MEASURE_TYPE:
        TDDIMeasureType MeasureType = (TDDIMeasureType)value_;
        MeasureType.write(oprot);
        return;
      case MAINTENANCE_PROCEDURE:
        TDDIMaintenanceProcedure MaintenanceProcedure = (TDDIMaintenanceProcedure)value_;
        MaintenanceProcedure.write(oprot);
        return;
      case DOMAIN_ELEMENT:
        TDDIAbstractDomainElement DomainElement = (TDDIAbstractDomainElement)value_;
        DomainElement.write(oprot);
        return;
      case REQUIREMENT_ARTIFACT:
        TDDIAbstractRequirementArtifact RequirementArtifact = (TDDIAbstractRequirementArtifact)value_;
        RequirementArtifact.write(oprot);
        return;
      case HARAARTIFACT:
        TDDIAbstractHARAArtifact HARAArtifact = (TDDIAbstractHARAArtifact)value_;
        HARAArtifact.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case DEPENDABILITY_PACKAGE:
        return DEPENDABILITY_PACKAGE_FIELD_DESC;
      case MEASURE:
        return MEASURE_FIELD_DESC;
      case MEASURE_TYPE:
        return MEASURE_TYPE_FIELD_DESC;
      case MAINTENANCE_PROCEDURE:
        return MAINTENANCE_PROCEDURE_FIELD_DESC;
      case DOMAIN_ELEMENT:
        return DOMAIN_ELEMENT_FIELD_DESC;
      case REQUIREMENT_ARTIFACT:
        return REQUIREMENT_ARTIFACT_FIELD_DESC;
      case HARAARTIFACT:
        return HARAARTIFACT_FIELD_DESC;
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


  public TDDIAbstractDependabilityPackage getDependabilityPackage() {
    if (getSetField() == _Fields.DEPENDABILITY_PACKAGE) {
      return (TDDIAbstractDependabilityPackage)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'DependabilityPackage' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDependabilityPackage(TDDIAbstractDependabilityPackage value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.DEPENDABILITY_PACKAGE;
    value_ = value;
  }

  public TDDIAbstractMeasure getMeasure() {
    if (getSetField() == _Fields.MEASURE) {
      return (TDDIAbstractMeasure)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'Measure' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setMeasure(TDDIAbstractMeasure value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.MEASURE;
    value_ = value;
  }

  public TDDIMeasureType getMeasureType() {
    if (getSetField() == _Fields.MEASURE_TYPE) {
      return (TDDIMeasureType)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'MeasureType' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setMeasureType(TDDIMeasureType value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.MEASURE_TYPE;
    value_ = value;
  }

  public TDDIMaintenanceProcedure getMaintenanceProcedure() {
    if (getSetField() == _Fields.MAINTENANCE_PROCEDURE) {
      return (TDDIMaintenanceProcedure)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'MaintenanceProcedure' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setMaintenanceProcedure(TDDIMaintenanceProcedure value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.MAINTENANCE_PROCEDURE;
    value_ = value;
  }

  public TDDIAbstractDomainElement getDomainElement() {
    if (getSetField() == _Fields.DOMAIN_ELEMENT) {
      return (TDDIAbstractDomainElement)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'DomainElement' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDomainElement(TDDIAbstractDomainElement value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.DOMAIN_ELEMENT;
    value_ = value;
  }

  public TDDIAbstractRequirementArtifact getRequirementArtifact() {
    if (getSetField() == _Fields.REQUIREMENT_ARTIFACT) {
      return (TDDIAbstractRequirementArtifact)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'RequirementArtifact' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setRequirementArtifact(TDDIAbstractRequirementArtifact value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.REQUIREMENT_ARTIFACT;
    value_ = value;
  }

  public TDDIAbstractHARAArtifact getHARAArtifact() {
    if (getSetField() == _Fields.HARAARTIFACT) {
      return (TDDIAbstractHARAArtifact)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'HARAArtifact' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setHARAArtifact(TDDIAbstractHARAArtifact value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.HARAARTIFACT;
    value_ = value;
  }

  public boolean isSetDependabilityPackage() {
    return setField_ == _Fields.DEPENDABILITY_PACKAGE;
  }


  public boolean isSetMeasure() {
    return setField_ == _Fields.MEASURE;
  }


  public boolean isSetMeasureType() {
    return setField_ == _Fields.MEASURE_TYPE;
  }


  public boolean isSetMaintenanceProcedure() {
    return setField_ == _Fields.MAINTENANCE_PROCEDURE;
  }


  public boolean isSetDomainElement() {
    return setField_ == _Fields.DOMAIN_ELEMENT;
  }


  public boolean isSetRequirementArtifact() {
    return setField_ == _Fields.REQUIREMENT_ARTIFACT;
  }


  public boolean isSetHARAArtifact() {
    return setField_ == _Fields.HARAARTIFACT;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof TDDIDependabilityArtifactUnion) {
      return equals((TDDIDependabilityArtifactUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(TDDIDependabilityArtifactUnion other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TDDIDependabilityArtifactUnion other) {
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