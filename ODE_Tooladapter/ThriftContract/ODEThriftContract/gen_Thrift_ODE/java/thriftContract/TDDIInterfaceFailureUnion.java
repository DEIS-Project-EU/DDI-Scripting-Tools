/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TDDIInterfaceFailureUnion extends org.apache.thrift.TUnion<TDDIInterfaceFailureUnion, TDDIInterfaceFailureUnion._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIInterfaceFailureUnion");
  private static final org.apache.thrift.protocol.TField OUTPUT_FAILURE_FIELD_DESC = new org.apache.thrift.protocol.TField("OutputFailure", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField INPUT_FAILURE_FIELD_DESC = new org.apache.thrift.protocol.TField("InputFailure", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OUTPUT_FAILURE((short)1, "OutputFailure"),
    INPUT_FAILURE((short)2, "InputFailure");

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
        case 1: // OUTPUT_FAILURE
          return OUTPUT_FAILURE;
        case 2: // INPUT_FAILURE
          return INPUT_FAILURE;
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
    tmpMap.put(_Fields.OUTPUT_FAILURE, new org.apache.thrift.meta_data.FieldMetaData("OutputFailure", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIOutputFailure.class)));
    tmpMap.put(_Fields.INPUT_FAILURE, new org.apache.thrift.meta_data.FieldMetaData("InputFailure", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIInputFailure.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIInterfaceFailureUnion.class, metaDataMap);
  }

  public TDDIInterfaceFailureUnion() {
    super();
  }

  public TDDIInterfaceFailureUnion(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public TDDIInterfaceFailureUnion(TDDIInterfaceFailureUnion other) {
    super(other);
  }
  public TDDIInterfaceFailureUnion deepCopy() {
    return new TDDIInterfaceFailureUnion(this);
  }

  public static TDDIInterfaceFailureUnion OutputFailure(TDDIOutputFailure value) {
    TDDIInterfaceFailureUnion x = new TDDIInterfaceFailureUnion();
    x.setOutputFailure(value);
    return x;
  }

  public static TDDIInterfaceFailureUnion InputFailure(TDDIInputFailure value) {
    TDDIInterfaceFailureUnion x = new TDDIInterfaceFailureUnion();
    x.setInputFailure(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case OUTPUT_FAILURE:
        if (value instanceof TDDIOutputFailure) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIOutputFailure for field 'OutputFailure', but got " + value.getClass().getSimpleName());
      case INPUT_FAILURE:
        if (value instanceof TDDIInputFailure) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIInputFailure for field 'InputFailure', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case OUTPUT_FAILURE:
          if (field.type == OUTPUT_FAILURE_FIELD_DESC.type) {
            TDDIOutputFailure OutputFailure;
            OutputFailure = new TDDIOutputFailure();
            OutputFailure.read(iprot);
            return OutputFailure;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case INPUT_FAILURE:
          if (field.type == INPUT_FAILURE_FIELD_DESC.type) {
            TDDIInputFailure InputFailure;
            InputFailure = new TDDIInputFailure();
            InputFailure.read(iprot);
            return InputFailure;
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
      case OUTPUT_FAILURE:
        TDDIOutputFailure OutputFailure = (TDDIOutputFailure)value_;
        OutputFailure.write(oprot);
        return;
      case INPUT_FAILURE:
        TDDIInputFailure InputFailure = (TDDIInputFailure)value_;
        InputFailure.write(oprot);
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
        case OUTPUT_FAILURE:
          TDDIOutputFailure OutputFailure;
          OutputFailure = new TDDIOutputFailure();
          OutputFailure.read(iprot);
          return OutputFailure;
        case INPUT_FAILURE:
          TDDIInputFailure InputFailure;
          InputFailure = new TDDIInputFailure();
          InputFailure.read(iprot);
          return InputFailure;
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
      case OUTPUT_FAILURE:
        TDDIOutputFailure OutputFailure = (TDDIOutputFailure)value_;
        OutputFailure.write(oprot);
        return;
      case INPUT_FAILURE:
        TDDIInputFailure InputFailure = (TDDIInputFailure)value_;
        InputFailure.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case OUTPUT_FAILURE:
        return OUTPUT_FAILURE_FIELD_DESC;
      case INPUT_FAILURE:
        return INPUT_FAILURE_FIELD_DESC;
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


  public TDDIOutputFailure getOutputFailure() {
    if (getSetField() == _Fields.OUTPUT_FAILURE) {
      return (TDDIOutputFailure)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'OutputFailure' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setOutputFailure(TDDIOutputFailure value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.OUTPUT_FAILURE;
    value_ = value;
  }

  public TDDIInputFailure getInputFailure() {
    if (getSetField() == _Fields.INPUT_FAILURE) {
      return (TDDIInputFailure)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'InputFailure' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setInputFailure(TDDIInputFailure value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.INPUT_FAILURE;
    value_ = value;
  }

  public boolean isSetOutputFailure() {
    return setField_ == _Fields.OUTPUT_FAILURE;
  }


  public boolean isSetInputFailure() {
    return setField_ == _Fields.INPUT_FAILURE;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof TDDIInterfaceFailureUnion) {
      return equals((TDDIInterfaceFailureUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(TDDIInterfaceFailureUnion other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TDDIInterfaceFailureUnion other) {
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
