/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TDDIDomainPackageUnion extends org.apache.thrift.TUnion<TDDIDomainPackageUnion, TDDIDomainPackageUnion._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIDomainPackageUnion");
  private static final org.apache.thrift.protocol.TField DOMAIN_PACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("DomainPackage", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField DOMAIN_PACKAGE_INTERFACE_FIELD_DESC = new org.apache.thrift.protocol.TField("DomainPackageInterface", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField DOMAIN_PACKAGE_BINDING_FIELD_DESC = new org.apache.thrift.protocol.TField("DomainPackageBinding", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DOMAIN_PACKAGE((short)1, "DomainPackage"),
    DOMAIN_PACKAGE_INTERFACE((short)2, "DomainPackageInterface"),
    DOMAIN_PACKAGE_BINDING((short)3, "DomainPackageBinding");

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
        case 1: // DOMAIN_PACKAGE
          return DOMAIN_PACKAGE;
        case 2: // DOMAIN_PACKAGE_INTERFACE
          return DOMAIN_PACKAGE_INTERFACE;
        case 3: // DOMAIN_PACKAGE_BINDING
          return DOMAIN_PACKAGE_BINDING;
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
    tmpMap.put(_Fields.DOMAIN_PACKAGE, new org.apache.thrift.meta_data.FieldMetaData("DomainPackage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIDomainPackage")));
    tmpMap.put(_Fields.DOMAIN_PACKAGE_INTERFACE, new org.apache.thrift.meta_data.FieldMetaData("DomainPackageInterface", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIDomainPackageInterface")));
    tmpMap.put(_Fields.DOMAIN_PACKAGE_BINDING, new org.apache.thrift.meta_data.FieldMetaData("DomainPackageBinding", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIDomainPackageBinding")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIDomainPackageUnion.class, metaDataMap);
  }

  public TDDIDomainPackageUnion() {
    super();
  }

  public TDDIDomainPackageUnion(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public TDDIDomainPackageUnion(TDDIDomainPackageUnion other) {
    super(other);
  }
  public TDDIDomainPackageUnion deepCopy() {
    return new TDDIDomainPackageUnion(this);
  }

  public static TDDIDomainPackageUnion DomainPackage(TDDIDomainPackage value) {
    TDDIDomainPackageUnion x = new TDDIDomainPackageUnion();
    x.setDomainPackage(value);
    return x;
  }

  public static TDDIDomainPackageUnion DomainPackageInterface(TDDIDomainPackageInterface value) {
    TDDIDomainPackageUnion x = new TDDIDomainPackageUnion();
    x.setDomainPackageInterface(value);
    return x;
  }

  public static TDDIDomainPackageUnion DomainPackageBinding(TDDIDomainPackageBinding value) {
    TDDIDomainPackageUnion x = new TDDIDomainPackageUnion();
    x.setDomainPackageBinding(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case DOMAIN_PACKAGE:
        if (value instanceof TDDIDomainPackage) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIDomainPackage for field 'DomainPackage', but got " + value.getClass().getSimpleName());
      case DOMAIN_PACKAGE_INTERFACE:
        if (value instanceof TDDIDomainPackageInterface) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIDomainPackageInterface for field 'DomainPackageInterface', but got " + value.getClass().getSimpleName());
      case DOMAIN_PACKAGE_BINDING:
        if (value instanceof TDDIDomainPackageBinding) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIDomainPackageBinding for field 'DomainPackageBinding', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
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
        case DOMAIN_PACKAGE_INTERFACE:
          if (field.type == DOMAIN_PACKAGE_INTERFACE_FIELD_DESC.type) {
            TDDIDomainPackageInterface DomainPackageInterface;
            DomainPackageInterface = new TDDIDomainPackageInterface();
            DomainPackageInterface.read(iprot);
            return DomainPackageInterface;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case DOMAIN_PACKAGE_BINDING:
          if (field.type == DOMAIN_PACKAGE_BINDING_FIELD_DESC.type) {
            TDDIDomainPackageBinding DomainPackageBinding;
            DomainPackageBinding = new TDDIDomainPackageBinding();
            DomainPackageBinding.read(iprot);
            return DomainPackageBinding;
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
      case DOMAIN_PACKAGE:
        TDDIDomainPackage DomainPackage = (TDDIDomainPackage)value_;
        DomainPackage.write(oprot);
        return;
      case DOMAIN_PACKAGE_INTERFACE:
        TDDIDomainPackageInterface DomainPackageInterface = (TDDIDomainPackageInterface)value_;
        DomainPackageInterface.write(oprot);
        return;
      case DOMAIN_PACKAGE_BINDING:
        TDDIDomainPackageBinding DomainPackageBinding = (TDDIDomainPackageBinding)value_;
        DomainPackageBinding.write(oprot);
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
        case DOMAIN_PACKAGE:
          TDDIDomainPackage DomainPackage;
          DomainPackage = new TDDIDomainPackage();
          DomainPackage.read(iprot);
          return DomainPackage;
        case DOMAIN_PACKAGE_INTERFACE:
          TDDIDomainPackageInterface DomainPackageInterface;
          DomainPackageInterface = new TDDIDomainPackageInterface();
          DomainPackageInterface.read(iprot);
          return DomainPackageInterface;
        case DOMAIN_PACKAGE_BINDING:
          TDDIDomainPackageBinding DomainPackageBinding;
          DomainPackageBinding = new TDDIDomainPackageBinding();
          DomainPackageBinding.read(iprot);
          return DomainPackageBinding;
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
      case DOMAIN_PACKAGE:
        TDDIDomainPackage DomainPackage = (TDDIDomainPackage)value_;
        DomainPackage.write(oprot);
        return;
      case DOMAIN_PACKAGE_INTERFACE:
        TDDIDomainPackageInterface DomainPackageInterface = (TDDIDomainPackageInterface)value_;
        DomainPackageInterface.write(oprot);
        return;
      case DOMAIN_PACKAGE_BINDING:
        TDDIDomainPackageBinding DomainPackageBinding = (TDDIDomainPackageBinding)value_;
        DomainPackageBinding.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case DOMAIN_PACKAGE:
        return DOMAIN_PACKAGE_FIELD_DESC;
      case DOMAIN_PACKAGE_INTERFACE:
        return DOMAIN_PACKAGE_INTERFACE_FIELD_DESC;
      case DOMAIN_PACKAGE_BINDING:
        return DOMAIN_PACKAGE_BINDING_FIELD_DESC;
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

  public TDDIDomainPackageInterface getDomainPackageInterface() {
    if (getSetField() == _Fields.DOMAIN_PACKAGE_INTERFACE) {
      return (TDDIDomainPackageInterface)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'DomainPackageInterface' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDomainPackageInterface(TDDIDomainPackageInterface value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.DOMAIN_PACKAGE_INTERFACE;
    value_ = value;
  }

  public TDDIDomainPackageBinding getDomainPackageBinding() {
    if (getSetField() == _Fields.DOMAIN_PACKAGE_BINDING) {
      return (TDDIDomainPackageBinding)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'DomainPackageBinding' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDomainPackageBinding(TDDIDomainPackageBinding value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.DOMAIN_PACKAGE_BINDING;
    value_ = value;
  }

  public boolean isSetDomainPackage() {
    return setField_ == _Fields.DOMAIN_PACKAGE;
  }


  public boolean isSetDomainPackageInterface() {
    return setField_ == _Fields.DOMAIN_PACKAGE_INTERFACE;
  }


  public boolean isSetDomainPackageBinding() {
    return setField_ == _Fields.DOMAIN_PACKAGE_BINDING;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof TDDIDomainPackageUnion) {
      return equals((TDDIDomainPackageUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(TDDIDomainPackageUnion other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TDDIDomainPackageUnion other) {
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
