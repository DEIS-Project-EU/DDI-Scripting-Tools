/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TDDIArchitecturePackageUnion extends org.apache.thrift.TUnion<TDDIArchitecturePackageUnion, TDDIArchitecturePackageUnion._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIArchitecturePackageUnion");
  private static final org.apache.thrift.protocol.TField ARCHITECTURE_PACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("ArchitecturePackage", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField ARCHITECTURE_PACKAGE_INTERFACE_FIELD_DESC = new org.apache.thrift.protocol.TField("ArchitecturePackageInterface", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField ARCHITECTURE_PACKAGE_BINDING_FIELD_DESC = new org.apache.thrift.protocol.TField("ArchitecturePackageBinding", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ARCHITECTURE_PACKAGE((short)1, "ArchitecturePackage"),
    ARCHITECTURE_PACKAGE_INTERFACE((short)2, "ArchitecturePackageInterface"),
    ARCHITECTURE_PACKAGE_BINDING((short)3, "ArchitecturePackageBinding");

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
        case 1: // ARCHITECTURE_PACKAGE
          return ARCHITECTURE_PACKAGE;
        case 2: // ARCHITECTURE_PACKAGE_INTERFACE
          return ARCHITECTURE_PACKAGE_INTERFACE;
        case 3: // ARCHITECTURE_PACKAGE_BINDING
          return ARCHITECTURE_PACKAGE_BINDING;
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
    tmpMap.put(_Fields.ARCHITECTURE_PACKAGE, new org.apache.thrift.meta_data.FieldMetaData("ArchitecturePackage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIArchitecturePackage")));
    tmpMap.put(_Fields.ARCHITECTURE_PACKAGE_INTERFACE, new org.apache.thrift.meta_data.FieldMetaData("ArchitecturePackageInterface", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIArchitecturePackageInterface")));
    tmpMap.put(_Fields.ARCHITECTURE_PACKAGE_BINDING, new org.apache.thrift.meta_data.FieldMetaData("ArchitecturePackageBinding", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIArchitecturePackageBinding")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIArchitecturePackageUnion.class, metaDataMap);
  }

  public TDDIArchitecturePackageUnion() {
    super();
  }

  public TDDIArchitecturePackageUnion(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public TDDIArchitecturePackageUnion(TDDIArchitecturePackageUnion other) {
    super(other);
  }
  public TDDIArchitecturePackageUnion deepCopy() {
    return new TDDIArchitecturePackageUnion(this);
  }

  public static TDDIArchitecturePackageUnion ArchitecturePackage(TDDIArchitecturePackage value) {
    TDDIArchitecturePackageUnion x = new TDDIArchitecturePackageUnion();
    x.setArchitecturePackage(value);
    return x;
  }

  public static TDDIArchitecturePackageUnion ArchitecturePackageInterface(TDDIArchitecturePackageInterface value) {
    TDDIArchitecturePackageUnion x = new TDDIArchitecturePackageUnion();
    x.setArchitecturePackageInterface(value);
    return x;
  }

  public static TDDIArchitecturePackageUnion ArchitecturePackageBinding(TDDIArchitecturePackageBinding value) {
    TDDIArchitecturePackageUnion x = new TDDIArchitecturePackageUnion();
    x.setArchitecturePackageBinding(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case ARCHITECTURE_PACKAGE:
        if (value instanceof TDDIArchitecturePackage) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIArchitecturePackage for field 'ArchitecturePackage', but got " + value.getClass().getSimpleName());
      case ARCHITECTURE_PACKAGE_INTERFACE:
        if (value instanceof TDDIArchitecturePackageInterface) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIArchitecturePackageInterface for field 'ArchitecturePackageInterface', but got " + value.getClass().getSimpleName());
      case ARCHITECTURE_PACKAGE_BINDING:
        if (value instanceof TDDIArchitecturePackageBinding) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIArchitecturePackageBinding for field 'ArchitecturePackageBinding', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case ARCHITECTURE_PACKAGE:
          if (field.type == ARCHITECTURE_PACKAGE_FIELD_DESC.type) {
            TDDIArchitecturePackage ArchitecturePackage;
            ArchitecturePackage = new TDDIArchitecturePackage();
            ArchitecturePackage.read(iprot);
            return ArchitecturePackage;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case ARCHITECTURE_PACKAGE_INTERFACE:
          if (field.type == ARCHITECTURE_PACKAGE_INTERFACE_FIELD_DESC.type) {
            TDDIArchitecturePackageInterface ArchitecturePackageInterface;
            ArchitecturePackageInterface = new TDDIArchitecturePackageInterface();
            ArchitecturePackageInterface.read(iprot);
            return ArchitecturePackageInterface;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case ARCHITECTURE_PACKAGE_BINDING:
          if (field.type == ARCHITECTURE_PACKAGE_BINDING_FIELD_DESC.type) {
            TDDIArchitecturePackageBinding ArchitecturePackageBinding;
            ArchitecturePackageBinding = new TDDIArchitecturePackageBinding();
            ArchitecturePackageBinding.read(iprot);
            return ArchitecturePackageBinding;
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
      case ARCHITECTURE_PACKAGE:
        TDDIArchitecturePackage ArchitecturePackage = (TDDIArchitecturePackage)value_;
        ArchitecturePackage.write(oprot);
        return;
      case ARCHITECTURE_PACKAGE_INTERFACE:
        TDDIArchitecturePackageInterface ArchitecturePackageInterface = (TDDIArchitecturePackageInterface)value_;
        ArchitecturePackageInterface.write(oprot);
        return;
      case ARCHITECTURE_PACKAGE_BINDING:
        TDDIArchitecturePackageBinding ArchitecturePackageBinding = (TDDIArchitecturePackageBinding)value_;
        ArchitecturePackageBinding.write(oprot);
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
        case ARCHITECTURE_PACKAGE:
          TDDIArchitecturePackage ArchitecturePackage;
          ArchitecturePackage = new TDDIArchitecturePackage();
          ArchitecturePackage.read(iprot);
          return ArchitecturePackage;
        case ARCHITECTURE_PACKAGE_INTERFACE:
          TDDIArchitecturePackageInterface ArchitecturePackageInterface;
          ArchitecturePackageInterface = new TDDIArchitecturePackageInterface();
          ArchitecturePackageInterface.read(iprot);
          return ArchitecturePackageInterface;
        case ARCHITECTURE_PACKAGE_BINDING:
          TDDIArchitecturePackageBinding ArchitecturePackageBinding;
          ArchitecturePackageBinding = new TDDIArchitecturePackageBinding();
          ArchitecturePackageBinding.read(iprot);
          return ArchitecturePackageBinding;
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
      case ARCHITECTURE_PACKAGE:
        TDDIArchitecturePackage ArchitecturePackage = (TDDIArchitecturePackage)value_;
        ArchitecturePackage.write(oprot);
        return;
      case ARCHITECTURE_PACKAGE_INTERFACE:
        TDDIArchitecturePackageInterface ArchitecturePackageInterface = (TDDIArchitecturePackageInterface)value_;
        ArchitecturePackageInterface.write(oprot);
        return;
      case ARCHITECTURE_PACKAGE_BINDING:
        TDDIArchitecturePackageBinding ArchitecturePackageBinding = (TDDIArchitecturePackageBinding)value_;
        ArchitecturePackageBinding.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case ARCHITECTURE_PACKAGE:
        return ARCHITECTURE_PACKAGE_FIELD_DESC;
      case ARCHITECTURE_PACKAGE_INTERFACE:
        return ARCHITECTURE_PACKAGE_INTERFACE_FIELD_DESC;
      case ARCHITECTURE_PACKAGE_BINDING:
        return ARCHITECTURE_PACKAGE_BINDING_FIELD_DESC;
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


  public TDDIArchitecturePackage getArchitecturePackage() {
    if (getSetField() == _Fields.ARCHITECTURE_PACKAGE) {
      return (TDDIArchitecturePackage)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'ArchitecturePackage' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setArchitecturePackage(TDDIArchitecturePackage value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.ARCHITECTURE_PACKAGE;
    value_ = value;
  }

  public TDDIArchitecturePackageInterface getArchitecturePackageInterface() {
    if (getSetField() == _Fields.ARCHITECTURE_PACKAGE_INTERFACE) {
      return (TDDIArchitecturePackageInterface)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'ArchitecturePackageInterface' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setArchitecturePackageInterface(TDDIArchitecturePackageInterface value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.ARCHITECTURE_PACKAGE_INTERFACE;
    value_ = value;
  }

  public TDDIArchitecturePackageBinding getArchitecturePackageBinding() {
    if (getSetField() == _Fields.ARCHITECTURE_PACKAGE_BINDING) {
      return (TDDIArchitecturePackageBinding)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'ArchitecturePackageBinding' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setArchitecturePackageBinding(TDDIArchitecturePackageBinding value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.ARCHITECTURE_PACKAGE_BINDING;
    value_ = value;
  }

  public boolean isSetArchitecturePackage() {
    return setField_ == _Fields.ARCHITECTURE_PACKAGE;
  }


  public boolean isSetArchitecturePackageInterface() {
    return setField_ == _Fields.ARCHITECTURE_PACKAGE_INTERFACE;
  }


  public boolean isSetArchitecturePackageBinding() {
    return setField_ == _Fields.ARCHITECTURE_PACKAGE_BINDING;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof TDDIArchitecturePackageUnion) {
      return equals((TDDIArchitecturePackageUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(TDDIArchitecturePackageUnion other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TDDIArchitecturePackageUnion other) {
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