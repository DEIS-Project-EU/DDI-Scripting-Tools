/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TDDITerminologyPackageUnion extends org.apache.thrift.TUnion<TDDITerminologyPackageUnion, TDDITerminologyPackageUnion._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDITerminologyPackageUnion");
  private static final org.apache.thrift.protocol.TField TERMINOLOGY_PACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("TerminologyPackage", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TERMINOLOGY_PACKAGE_BINDING_FIELD_DESC = new org.apache.thrift.protocol.TField("TerminologyPackageBinding", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField TERMINOLOGY_PACKAGE_INTERFACE_FIELD_DESC = new org.apache.thrift.protocol.TField("TerminologyPackageInterface", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TERMINOLOGY_PACKAGE((short)1, "TerminologyPackage"),
    TERMINOLOGY_PACKAGE_BINDING((short)2, "TerminologyPackageBinding"),
    TERMINOLOGY_PACKAGE_INTERFACE((short)3, "TerminologyPackageInterface");

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
        case 1: // TERMINOLOGY_PACKAGE
          return TERMINOLOGY_PACKAGE;
        case 2: // TERMINOLOGY_PACKAGE_BINDING
          return TERMINOLOGY_PACKAGE_BINDING;
        case 3: // TERMINOLOGY_PACKAGE_INTERFACE
          return TERMINOLOGY_PACKAGE_INTERFACE;
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
    tmpMap.put(_Fields.TERMINOLOGY_PACKAGE, new org.apache.thrift.meta_data.FieldMetaData("TerminologyPackage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDITerminologyPackage")));
    tmpMap.put(_Fields.TERMINOLOGY_PACKAGE_BINDING, new org.apache.thrift.meta_data.FieldMetaData("TerminologyPackageBinding", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDITerminologyPackageBinding")));
    tmpMap.put(_Fields.TERMINOLOGY_PACKAGE_INTERFACE, new org.apache.thrift.meta_data.FieldMetaData("TerminologyPackageInterface", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDITerminologyPackageInterface")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDITerminologyPackageUnion.class, metaDataMap);
  }

  public TDDITerminologyPackageUnion() {
    super();
  }

  public TDDITerminologyPackageUnion(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public TDDITerminologyPackageUnion(TDDITerminologyPackageUnion other) {
    super(other);
  }
  public TDDITerminologyPackageUnion deepCopy() {
    return new TDDITerminologyPackageUnion(this);
  }

  public static TDDITerminologyPackageUnion TerminologyPackage(TDDITerminologyPackage value) {
    TDDITerminologyPackageUnion x = new TDDITerminologyPackageUnion();
    x.setTerminologyPackage(value);
    return x;
  }

  public static TDDITerminologyPackageUnion TerminologyPackageBinding(TDDITerminologyPackageBinding value) {
    TDDITerminologyPackageUnion x = new TDDITerminologyPackageUnion();
    x.setTerminologyPackageBinding(value);
    return x;
  }

  public static TDDITerminologyPackageUnion TerminologyPackageInterface(TDDITerminologyPackageInterface value) {
    TDDITerminologyPackageUnion x = new TDDITerminologyPackageUnion();
    x.setTerminologyPackageInterface(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case TERMINOLOGY_PACKAGE:
        if (value instanceof TDDITerminologyPackage) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDITerminologyPackage for field 'TerminologyPackage', but got " + value.getClass().getSimpleName());
      case TERMINOLOGY_PACKAGE_BINDING:
        if (value instanceof TDDITerminologyPackageBinding) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDITerminologyPackageBinding for field 'TerminologyPackageBinding', but got " + value.getClass().getSimpleName());
      case TERMINOLOGY_PACKAGE_INTERFACE:
        if (value instanceof TDDITerminologyPackageInterface) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDITerminologyPackageInterface for field 'TerminologyPackageInterface', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case TERMINOLOGY_PACKAGE:
          if (field.type == TERMINOLOGY_PACKAGE_FIELD_DESC.type) {
            TDDITerminologyPackage TerminologyPackage;
            TerminologyPackage = new TDDITerminologyPackage();
            TerminologyPackage.read(iprot);
            return TerminologyPackage;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case TERMINOLOGY_PACKAGE_BINDING:
          if (field.type == TERMINOLOGY_PACKAGE_BINDING_FIELD_DESC.type) {
            TDDITerminologyPackageBinding TerminologyPackageBinding;
            TerminologyPackageBinding = new TDDITerminologyPackageBinding();
            TerminologyPackageBinding.read(iprot);
            return TerminologyPackageBinding;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case TERMINOLOGY_PACKAGE_INTERFACE:
          if (field.type == TERMINOLOGY_PACKAGE_INTERFACE_FIELD_DESC.type) {
            TDDITerminologyPackageInterface TerminologyPackageInterface;
            TerminologyPackageInterface = new TDDITerminologyPackageInterface();
            TerminologyPackageInterface.read(iprot);
            return TerminologyPackageInterface;
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
      case TERMINOLOGY_PACKAGE:
        TDDITerminologyPackage TerminologyPackage = (TDDITerminologyPackage)value_;
        TerminologyPackage.write(oprot);
        return;
      case TERMINOLOGY_PACKAGE_BINDING:
        TDDITerminologyPackageBinding TerminologyPackageBinding = (TDDITerminologyPackageBinding)value_;
        TerminologyPackageBinding.write(oprot);
        return;
      case TERMINOLOGY_PACKAGE_INTERFACE:
        TDDITerminologyPackageInterface TerminologyPackageInterface = (TDDITerminologyPackageInterface)value_;
        TerminologyPackageInterface.write(oprot);
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
        case TERMINOLOGY_PACKAGE:
          TDDITerminologyPackage TerminologyPackage;
          TerminologyPackage = new TDDITerminologyPackage();
          TerminologyPackage.read(iprot);
          return TerminologyPackage;
        case TERMINOLOGY_PACKAGE_BINDING:
          TDDITerminologyPackageBinding TerminologyPackageBinding;
          TerminologyPackageBinding = new TDDITerminologyPackageBinding();
          TerminologyPackageBinding.read(iprot);
          return TerminologyPackageBinding;
        case TERMINOLOGY_PACKAGE_INTERFACE:
          TDDITerminologyPackageInterface TerminologyPackageInterface;
          TerminologyPackageInterface = new TDDITerminologyPackageInterface();
          TerminologyPackageInterface.read(iprot);
          return TerminologyPackageInterface;
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
      case TERMINOLOGY_PACKAGE:
        TDDITerminologyPackage TerminologyPackage = (TDDITerminologyPackage)value_;
        TerminologyPackage.write(oprot);
        return;
      case TERMINOLOGY_PACKAGE_BINDING:
        TDDITerminologyPackageBinding TerminologyPackageBinding = (TDDITerminologyPackageBinding)value_;
        TerminologyPackageBinding.write(oprot);
        return;
      case TERMINOLOGY_PACKAGE_INTERFACE:
        TDDITerminologyPackageInterface TerminologyPackageInterface = (TDDITerminologyPackageInterface)value_;
        TerminologyPackageInterface.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case TERMINOLOGY_PACKAGE:
        return TERMINOLOGY_PACKAGE_FIELD_DESC;
      case TERMINOLOGY_PACKAGE_BINDING:
        return TERMINOLOGY_PACKAGE_BINDING_FIELD_DESC;
      case TERMINOLOGY_PACKAGE_INTERFACE:
        return TERMINOLOGY_PACKAGE_INTERFACE_FIELD_DESC;
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


  public TDDITerminologyPackage getTerminologyPackage() {
    if (getSetField() == _Fields.TERMINOLOGY_PACKAGE) {
      return (TDDITerminologyPackage)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'TerminologyPackage' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setTerminologyPackage(TDDITerminologyPackage value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.TERMINOLOGY_PACKAGE;
    value_ = value;
  }

  public TDDITerminologyPackageBinding getTerminologyPackageBinding() {
    if (getSetField() == _Fields.TERMINOLOGY_PACKAGE_BINDING) {
      return (TDDITerminologyPackageBinding)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'TerminologyPackageBinding' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setTerminologyPackageBinding(TDDITerminologyPackageBinding value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.TERMINOLOGY_PACKAGE_BINDING;
    value_ = value;
  }

  public TDDITerminologyPackageInterface getTerminologyPackageInterface() {
    if (getSetField() == _Fields.TERMINOLOGY_PACKAGE_INTERFACE) {
      return (TDDITerminologyPackageInterface)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'TerminologyPackageInterface' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setTerminologyPackageInterface(TDDITerminologyPackageInterface value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.TERMINOLOGY_PACKAGE_INTERFACE;
    value_ = value;
  }

  public boolean isSetTerminologyPackage() {
    return setField_ == _Fields.TERMINOLOGY_PACKAGE;
  }


  public boolean isSetTerminologyPackageBinding() {
    return setField_ == _Fields.TERMINOLOGY_PACKAGE_BINDING;
  }


  public boolean isSetTerminologyPackageInterface() {
    return setField_ == _Fields.TERMINOLOGY_PACKAGE_INTERFACE;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof TDDITerminologyPackageUnion) {
      return equals((TDDITerminologyPackageUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(TDDITerminologyPackageUnion other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TDDITerminologyPackageUnion other) {
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
