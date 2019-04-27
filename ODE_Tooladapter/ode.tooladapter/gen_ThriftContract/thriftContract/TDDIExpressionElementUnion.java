/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TDDIExpressionElementUnion extends org.apache.thrift.TUnion<TDDIExpressionElementUnion, TDDIExpressionElementUnion._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIExpressionElementUnion");
  private static final org.apache.thrift.protocol.TField EXPRESSION_FIELD_DESC = new org.apache.thrift.protocol.TField("Expression", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TERM_FIELD_DESC = new org.apache.thrift.protocol.TField("Term", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXPRESSION((short)1, "Expression"),
    TERM((short)2, "Term");

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
        case 1: // EXPRESSION
          return EXPRESSION;
        case 2: // TERM
          return TERM;
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
    tmpMap.put(_Fields.EXPRESSION, new org.apache.thrift.meta_data.FieldMetaData("Expression", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIExpression.class)));
    tmpMap.put(_Fields.TERM, new org.apache.thrift.meta_data.FieldMetaData("Term", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDITerm.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIExpressionElementUnion.class, metaDataMap);
  }

  public TDDIExpressionElementUnion() {
    super();
  }

  public TDDIExpressionElementUnion(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public TDDIExpressionElementUnion(TDDIExpressionElementUnion other) {
    super(other);
  }
  public TDDIExpressionElementUnion deepCopy() {
    return new TDDIExpressionElementUnion(this);
  }

  public static TDDIExpressionElementUnion Expression(TDDIExpression value) {
    TDDIExpressionElementUnion x = new TDDIExpressionElementUnion();
    x.setExpression(value);
    return x;
  }

  public static TDDIExpressionElementUnion Term(TDDITerm value) {
    TDDIExpressionElementUnion x = new TDDIExpressionElementUnion();
    x.setTerm(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case EXPRESSION:
        if (value instanceof TDDIExpression) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIExpression for field 'Expression', but got " + value.getClass().getSimpleName());
      case TERM:
        if (value instanceof TDDITerm) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDITerm for field 'Term', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case EXPRESSION:
          if (field.type == EXPRESSION_FIELD_DESC.type) {
            TDDIExpression Expression;
            Expression = new TDDIExpression();
            Expression.read(iprot);
            return Expression;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case TERM:
          if (field.type == TERM_FIELD_DESC.type) {
            TDDITerm Term;
            Term = new TDDITerm();
            Term.read(iprot);
            return Term;
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
      case EXPRESSION:
        TDDIExpression Expression = (TDDIExpression)value_;
        Expression.write(oprot);
        return;
      case TERM:
        TDDITerm Term = (TDDITerm)value_;
        Term.write(oprot);
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
        case EXPRESSION:
          TDDIExpression Expression;
          Expression = new TDDIExpression();
          Expression.read(iprot);
          return Expression;
        case TERM:
          TDDITerm Term;
          Term = new TDDITerm();
          Term.read(iprot);
          return Term;
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
      case EXPRESSION:
        TDDIExpression Expression = (TDDIExpression)value_;
        Expression.write(oprot);
        return;
      case TERM:
        TDDITerm Term = (TDDITerm)value_;
        Term.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case EXPRESSION:
        return EXPRESSION_FIELD_DESC;
      case TERM:
        return TERM_FIELD_DESC;
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


  public TDDIExpression getExpression() {
    if (getSetField() == _Fields.EXPRESSION) {
      return (TDDIExpression)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'Expression' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setExpression(TDDIExpression value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.EXPRESSION;
    value_ = value;
  }

  public TDDITerm getTerm() {
    if (getSetField() == _Fields.TERM) {
      return (TDDITerm)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'Term' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setTerm(TDDITerm value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.TERM;
    value_ = value;
  }

  public boolean isSetExpression() {
    return setField_ == _Fields.EXPRESSION;
  }


  public boolean isSetTerm() {
    return setField_ == _Fields.TERM;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof TDDIExpressionElementUnion) {
      return equals((TDDIExpressionElementUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(TDDIExpressionElementUnion other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TDDIExpressionElementUnion other) {
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