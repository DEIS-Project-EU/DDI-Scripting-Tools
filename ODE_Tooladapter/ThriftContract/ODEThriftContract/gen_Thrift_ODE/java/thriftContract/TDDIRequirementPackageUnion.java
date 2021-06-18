/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TDDIRequirementPackageUnion extends org.apache.thrift.TUnion<TDDIRequirementPackageUnion, TDDIRequirementPackageUnion._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIRequirementPackageUnion");
  private static final org.apache.thrift.protocol.TField REQUIREMENT_PACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("RequirementPackage", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField REQUIREMENT_PACKAGE_INTERFACE_FIELD_DESC = new org.apache.thrift.protocol.TField("RequirementPackageInterface", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField REQUIREMENT_PACKAGE_BINDING_FIELD_DESC = new org.apache.thrift.protocol.TField("RequirementPackageBinding", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REQUIREMENT_PACKAGE((short)1, "RequirementPackage"),
    REQUIREMENT_PACKAGE_INTERFACE((short)2, "RequirementPackageInterface"),
    REQUIREMENT_PACKAGE_BINDING((short)3, "RequirementPackageBinding");

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
        case 1: // REQUIREMENT_PACKAGE
          return REQUIREMENT_PACKAGE;
        case 2: // REQUIREMENT_PACKAGE_INTERFACE
          return REQUIREMENT_PACKAGE_INTERFACE;
        case 3: // REQUIREMENT_PACKAGE_BINDING
          return REQUIREMENT_PACKAGE_BINDING;
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
    tmpMap.put(_Fields.REQUIREMENT_PACKAGE, new org.apache.thrift.meta_data.FieldMetaData("RequirementPackage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIRequirementPackage")));
    tmpMap.put(_Fields.REQUIREMENT_PACKAGE_INTERFACE, new org.apache.thrift.meta_data.FieldMetaData("RequirementPackageInterface", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIRequirementPackageInterface")));
    tmpMap.put(_Fields.REQUIREMENT_PACKAGE_BINDING, new org.apache.thrift.meta_data.FieldMetaData("RequirementPackageBinding", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIRequirementPackageBinding")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIRequirementPackageUnion.class, metaDataMap);
  }

  public TDDIRequirementPackageUnion() {
    super();
  }

  public TDDIRequirementPackageUnion(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public TDDIRequirementPackageUnion(TDDIRequirementPackageUnion other) {
    super(other);
  }
  public TDDIRequirementPackageUnion deepCopy() {
    return new TDDIRequirementPackageUnion(this);
  }

  public static TDDIRequirementPackageUnion RequirementPackage(TDDIRequirementPackage value) {
    TDDIRequirementPackageUnion x = new TDDIRequirementPackageUnion();
    x.setRequirementPackage(value);
    return x;
  }

  public static TDDIRequirementPackageUnion RequirementPackageInterface(TDDIRequirementPackageInterface value) {
    TDDIRequirementPackageUnion x = new TDDIRequirementPackageUnion();
    x.setRequirementPackageInterface(value);
    return x;
  }

  public static TDDIRequirementPackageUnion RequirementPackageBinding(TDDIRequirementPackageBinding value) {
    TDDIRequirementPackageUnion x = new TDDIRequirementPackageUnion();
    x.setRequirementPackageBinding(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case REQUIREMENT_PACKAGE:
        if (value instanceof TDDIRequirementPackage) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIRequirementPackage for field 'RequirementPackage', but got " + value.getClass().getSimpleName());
      case REQUIREMENT_PACKAGE_INTERFACE:
        if (value instanceof TDDIRequirementPackageInterface) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIRequirementPackageInterface for field 'RequirementPackageInterface', but got " + value.getClass().getSimpleName());
      case REQUIREMENT_PACKAGE_BINDING:
        if (value instanceof TDDIRequirementPackageBinding) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIRequirementPackageBinding for field 'RequirementPackageBinding', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
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
        case REQUIREMENT_PACKAGE_INTERFACE:
          if (field.type == REQUIREMENT_PACKAGE_INTERFACE_FIELD_DESC.type) {
            TDDIRequirementPackageInterface RequirementPackageInterface;
            RequirementPackageInterface = new TDDIRequirementPackageInterface();
            RequirementPackageInterface.read(iprot);
            return RequirementPackageInterface;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case REQUIREMENT_PACKAGE_BINDING:
          if (field.type == REQUIREMENT_PACKAGE_BINDING_FIELD_DESC.type) {
            TDDIRequirementPackageBinding RequirementPackageBinding;
            RequirementPackageBinding = new TDDIRequirementPackageBinding();
            RequirementPackageBinding.read(iprot);
            return RequirementPackageBinding;
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
      case REQUIREMENT_PACKAGE:
        TDDIRequirementPackage RequirementPackage = (TDDIRequirementPackage)value_;
        RequirementPackage.write(oprot);
        return;
      case REQUIREMENT_PACKAGE_INTERFACE:
        TDDIRequirementPackageInterface RequirementPackageInterface = (TDDIRequirementPackageInterface)value_;
        RequirementPackageInterface.write(oprot);
        return;
      case REQUIREMENT_PACKAGE_BINDING:
        TDDIRequirementPackageBinding RequirementPackageBinding = (TDDIRequirementPackageBinding)value_;
        RequirementPackageBinding.write(oprot);
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
        case REQUIREMENT_PACKAGE:
          TDDIRequirementPackage RequirementPackage;
          RequirementPackage = new TDDIRequirementPackage();
          RequirementPackage.read(iprot);
          return RequirementPackage;
        case REQUIREMENT_PACKAGE_INTERFACE:
          TDDIRequirementPackageInterface RequirementPackageInterface;
          RequirementPackageInterface = new TDDIRequirementPackageInterface();
          RequirementPackageInterface.read(iprot);
          return RequirementPackageInterface;
        case REQUIREMENT_PACKAGE_BINDING:
          TDDIRequirementPackageBinding RequirementPackageBinding;
          RequirementPackageBinding = new TDDIRequirementPackageBinding();
          RequirementPackageBinding.read(iprot);
          return RequirementPackageBinding;
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
      case REQUIREMENT_PACKAGE:
        TDDIRequirementPackage RequirementPackage = (TDDIRequirementPackage)value_;
        RequirementPackage.write(oprot);
        return;
      case REQUIREMENT_PACKAGE_INTERFACE:
        TDDIRequirementPackageInterface RequirementPackageInterface = (TDDIRequirementPackageInterface)value_;
        RequirementPackageInterface.write(oprot);
        return;
      case REQUIREMENT_PACKAGE_BINDING:
        TDDIRequirementPackageBinding RequirementPackageBinding = (TDDIRequirementPackageBinding)value_;
        RequirementPackageBinding.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case REQUIREMENT_PACKAGE:
        return REQUIREMENT_PACKAGE_FIELD_DESC;
      case REQUIREMENT_PACKAGE_INTERFACE:
        return REQUIREMENT_PACKAGE_INTERFACE_FIELD_DESC;
      case REQUIREMENT_PACKAGE_BINDING:
        return REQUIREMENT_PACKAGE_BINDING_FIELD_DESC;
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

  public TDDIRequirementPackageInterface getRequirementPackageInterface() {
    if (getSetField() == _Fields.REQUIREMENT_PACKAGE_INTERFACE) {
      return (TDDIRequirementPackageInterface)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'RequirementPackageInterface' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setRequirementPackageInterface(TDDIRequirementPackageInterface value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.REQUIREMENT_PACKAGE_INTERFACE;
    value_ = value;
  }

  public TDDIRequirementPackageBinding getRequirementPackageBinding() {
    if (getSetField() == _Fields.REQUIREMENT_PACKAGE_BINDING) {
      return (TDDIRequirementPackageBinding)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'RequirementPackageBinding' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setRequirementPackageBinding(TDDIRequirementPackageBinding value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.REQUIREMENT_PACKAGE_BINDING;
    value_ = value;
  }

  public boolean isSetRequirementPackage() {
    return setField_ == _Fields.REQUIREMENT_PACKAGE;
  }


  public boolean isSetRequirementPackageInterface() {
    return setField_ == _Fields.REQUIREMENT_PACKAGE_INTERFACE;
  }


  public boolean isSetRequirementPackageBinding() {
    return setField_ == _Fields.REQUIREMENT_PACKAGE_BINDING;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof TDDIRequirementPackageUnion) {
      return equals((TDDIRequirementPackageUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(TDDIRequirementPackageUnion other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TDDIRequirementPackageUnion other) {
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