/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TDDIHARAPackageUnion extends org.apache.thrift.TUnion<TDDIHARAPackageUnion, TDDIHARAPackageUnion._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIHARAPackageUnion");
  private static final org.apache.thrift.protocol.TField HARAPACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("HARAPackage", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField HARAPACKAGE_INTERFACE_FIELD_DESC = new org.apache.thrift.protocol.TField("HARAPackageInterface", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField HARAPACKAGE_BINDING_FIELD_DESC = new org.apache.thrift.protocol.TField("HARAPackageBinding", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HARAPACKAGE((short)1, "HARAPackage"),
    HARAPACKAGE_INTERFACE((short)2, "HARAPackageInterface"),
    HARAPACKAGE_BINDING((short)3, "HARAPackageBinding");

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
        case 1: // HARAPACKAGE
          return HARAPACKAGE;
        case 2: // HARAPACKAGE_INTERFACE
          return HARAPACKAGE_INTERFACE;
        case 3: // HARAPACKAGE_BINDING
          return HARAPACKAGE_BINDING;
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
    tmpMap.put(_Fields.HARAPACKAGE, new org.apache.thrift.meta_data.FieldMetaData("HARAPackage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIHARAPackage.class)));
    tmpMap.put(_Fields.HARAPACKAGE_INTERFACE, new org.apache.thrift.meta_data.FieldMetaData("HARAPackageInterface", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIHARAPackageInterface.class)));
    tmpMap.put(_Fields.HARAPACKAGE_BINDING, new org.apache.thrift.meta_data.FieldMetaData("HARAPackageBinding", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIHARAPackageBinding.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIHARAPackageUnion.class, metaDataMap);
  }

  public TDDIHARAPackageUnion() {
    super();
  }

  public TDDIHARAPackageUnion(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public TDDIHARAPackageUnion(TDDIHARAPackageUnion other) {
    super(other);
  }
  public TDDIHARAPackageUnion deepCopy() {
    return new TDDIHARAPackageUnion(this);
  }

  public static TDDIHARAPackageUnion HARAPackage(TDDIHARAPackage value) {
    TDDIHARAPackageUnion x = new TDDIHARAPackageUnion();
    x.setHARAPackage(value);
    return x;
  }

  public static TDDIHARAPackageUnion HARAPackageInterface(TDDIHARAPackageInterface value) {
    TDDIHARAPackageUnion x = new TDDIHARAPackageUnion();
    x.setHARAPackageInterface(value);
    return x;
  }

  public static TDDIHARAPackageUnion HARAPackageBinding(TDDIHARAPackageBinding value) {
    TDDIHARAPackageUnion x = new TDDIHARAPackageUnion();
    x.setHARAPackageBinding(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case HARAPACKAGE:
        if (value instanceof TDDIHARAPackage) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIHARAPackage for field 'HARAPackage', but got " + value.getClass().getSimpleName());
      case HARAPACKAGE_INTERFACE:
        if (value instanceof TDDIHARAPackageInterface) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIHARAPackageInterface for field 'HARAPackageInterface', but got " + value.getClass().getSimpleName());
      case HARAPACKAGE_BINDING:
        if (value instanceof TDDIHARAPackageBinding) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIHARAPackageBinding for field 'HARAPackageBinding', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
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
        case HARAPACKAGE_INTERFACE:
          if (field.type == HARAPACKAGE_INTERFACE_FIELD_DESC.type) {
            TDDIHARAPackageInterface HARAPackageInterface;
            HARAPackageInterface = new TDDIHARAPackageInterface();
            HARAPackageInterface.read(iprot);
            return HARAPackageInterface;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case HARAPACKAGE_BINDING:
          if (field.type == HARAPACKAGE_BINDING_FIELD_DESC.type) {
            TDDIHARAPackageBinding HARAPackageBinding;
            HARAPackageBinding = new TDDIHARAPackageBinding();
            HARAPackageBinding.read(iprot);
            return HARAPackageBinding;
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
      case HARAPACKAGE:
        TDDIHARAPackage HARAPackage = (TDDIHARAPackage)value_;
        HARAPackage.write(oprot);
        return;
      case HARAPACKAGE_INTERFACE:
        TDDIHARAPackageInterface HARAPackageInterface = (TDDIHARAPackageInterface)value_;
        HARAPackageInterface.write(oprot);
        return;
      case HARAPACKAGE_BINDING:
        TDDIHARAPackageBinding HARAPackageBinding = (TDDIHARAPackageBinding)value_;
        HARAPackageBinding.write(oprot);
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
        case HARAPACKAGE:
          TDDIHARAPackage HARAPackage;
          HARAPackage = new TDDIHARAPackage();
          HARAPackage.read(iprot);
          return HARAPackage;
        case HARAPACKAGE_INTERFACE:
          TDDIHARAPackageInterface HARAPackageInterface;
          HARAPackageInterface = new TDDIHARAPackageInterface();
          HARAPackageInterface.read(iprot);
          return HARAPackageInterface;
        case HARAPACKAGE_BINDING:
          TDDIHARAPackageBinding HARAPackageBinding;
          HARAPackageBinding = new TDDIHARAPackageBinding();
          HARAPackageBinding.read(iprot);
          return HARAPackageBinding;
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
      case HARAPACKAGE:
        TDDIHARAPackage HARAPackage = (TDDIHARAPackage)value_;
        HARAPackage.write(oprot);
        return;
      case HARAPACKAGE_INTERFACE:
        TDDIHARAPackageInterface HARAPackageInterface = (TDDIHARAPackageInterface)value_;
        HARAPackageInterface.write(oprot);
        return;
      case HARAPACKAGE_BINDING:
        TDDIHARAPackageBinding HARAPackageBinding = (TDDIHARAPackageBinding)value_;
        HARAPackageBinding.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case HARAPACKAGE:
        return HARAPACKAGE_FIELD_DESC;
      case HARAPACKAGE_INTERFACE:
        return HARAPACKAGE_INTERFACE_FIELD_DESC;
      case HARAPACKAGE_BINDING:
        return HARAPACKAGE_BINDING_FIELD_DESC;
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

  public TDDIHARAPackageInterface getHARAPackageInterface() {
    if (getSetField() == _Fields.HARAPACKAGE_INTERFACE) {
      return (TDDIHARAPackageInterface)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'HARAPackageInterface' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setHARAPackageInterface(TDDIHARAPackageInterface value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.HARAPACKAGE_INTERFACE;
    value_ = value;
  }

  public TDDIHARAPackageBinding getHARAPackageBinding() {
    if (getSetField() == _Fields.HARAPACKAGE_BINDING) {
      return (TDDIHARAPackageBinding)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'HARAPackageBinding' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setHARAPackageBinding(TDDIHARAPackageBinding value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.HARAPACKAGE_BINDING;
    value_ = value;
  }

  public boolean isSetHARAPackage() {
    return setField_ == _Fields.HARAPACKAGE;
  }


  public boolean isSetHARAPackageInterface() {
    return setField_ == _Fields.HARAPACKAGE_INTERFACE;
  }


  public boolean isSetHARAPackageBinding() {
    return setField_ == _Fields.HARAPACKAGE_BINDING;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof TDDIHARAPackageUnion) {
      return equals((TDDIHARAPackageUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(TDDIHARAPackageUnion other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TDDIHARAPackageUnion other) {
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
