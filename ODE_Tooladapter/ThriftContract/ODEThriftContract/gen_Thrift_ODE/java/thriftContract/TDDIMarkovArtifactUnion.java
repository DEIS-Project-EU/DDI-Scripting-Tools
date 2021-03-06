/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TDDIMarkovArtifactUnion extends org.apache.thrift.TUnion<TDDIMarkovArtifactUnion, TDDIMarkovArtifactUnion._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIMarkovArtifactUnion");
  private static final org.apache.thrift.protocol.TField TRANSITION_FIELD_DESC = new org.apache.thrift.protocol.TField("Transition", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("State", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRANSITION((short)1, "Transition"),
    STATE((short)2, "State");

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
        case 1: // TRANSITION
          return TRANSITION;
        case 2: // STATE
          return STATE;
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
    tmpMap.put(_Fields.TRANSITION, new org.apache.thrift.meta_data.FieldMetaData("Transition", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDITransition.class)));
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("State", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIState.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIMarkovArtifactUnion.class, metaDataMap);
  }

  public TDDIMarkovArtifactUnion() {
    super();
  }

  public TDDIMarkovArtifactUnion(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public TDDIMarkovArtifactUnion(TDDIMarkovArtifactUnion other) {
    super(other);
  }
  public TDDIMarkovArtifactUnion deepCopy() {
    return new TDDIMarkovArtifactUnion(this);
  }

  public static TDDIMarkovArtifactUnion Transition(TDDITransition value) {
    TDDIMarkovArtifactUnion x = new TDDIMarkovArtifactUnion();
    x.setTransition(value);
    return x;
  }

  public static TDDIMarkovArtifactUnion State(TDDIState value) {
    TDDIMarkovArtifactUnion x = new TDDIMarkovArtifactUnion();
    x.setState(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case TRANSITION:
        if (value instanceof TDDITransition) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDITransition for field 'Transition', but got " + value.getClass().getSimpleName());
      case STATE:
        if (value instanceof TDDIState) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIState for field 'State', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case TRANSITION:
          if (field.type == TRANSITION_FIELD_DESC.type) {
            TDDITransition Transition;
            Transition = new TDDITransition();
            Transition.read(iprot);
            return Transition;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case STATE:
          if (field.type == STATE_FIELD_DESC.type) {
            TDDIState State;
            State = new TDDIState();
            State.read(iprot);
            return State;
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
      case TRANSITION:
        TDDITransition Transition = (TDDITransition)value_;
        Transition.write(oprot);
        return;
      case STATE:
        TDDIState State = (TDDIState)value_;
        State.write(oprot);
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
        case TRANSITION:
          TDDITransition Transition;
          Transition = new TDDITransition();
          Transition.read(iprot);
          return Transition;
        case STATE:
          TDDIState State;
          State = new TDDIState();
          State.read(iprot);
          return State;
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
      case TRANSITION:
        TDDITransition Transition = (TDDITransition)value_;
        Transition.write(oprot);
        return;
      case STATE:
        TDDIState State = (TDDIState)value_;
        State.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case TRANSITION:
        return TRANSITION_FIELD_DESC;
      case STATE:
        return STATE_FIELD_DESC;
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


  public TDDITransition getTransition() {
    if (getSetField() == _Fields.TRANSITION) {
      return (TDDITransition)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'Transition' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setTransition(TDDITransition value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.TRANSITION;
    value_ = value;
  }

  public TDDIState getState() {
    if (getSetField() == _Fields.STATE) {
      return (TDDIState)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'State' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setState(TDDIState value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.STATE;
    value_ = value;
  }

  public boolean isSetTransition() {
    return setField_ == _Fields.TRANSITION;
  }


  public boolean isSetState() {
    return setField_ == _Fields.STATE;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof TDDIMarkovArtifactUnion) {
      return equals((TDDIMarkovArtifactUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(TDDIMarkovArtifactUnion other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TDDIMarkovArtifactUnion other) {
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
