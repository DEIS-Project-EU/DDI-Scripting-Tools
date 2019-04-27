/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TDDIFailureModelUnion extends org.apache.thrift.TUnion<TDDIFailureModelUnion, TDDIFailureModelUnion._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIFailureModelUnion");
  private static final org.apache.thrift.protocol.TField FAILURE_MODEL_FIELD_DESC = new org.apache.thrift.protocol.TField("FailureModel", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField FMEA_FIELD_DESC = new org.apache.thrift.protocol.TField("FMEA", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField MARKOV_CHAIN_FIELD_DESC = new org.apache.thrift.protocol.TField("MarkovChain", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField FAULT_TREE_FIELD_DESC = new org.apache.thrift.protocol.TField("FaultTree", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FAILURE_MODEL((short)1, "FailureModel"),
    FMEA((short)2, "FMEA"),
    MARKOV_CHAIN((short)3, "MarkovChain"),
    FAULT_TREE((short)4, "FaultTree");

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
        case 1: // FAILURE_MODEL
          return FAILURE_MODEL;
        case 2: // FMEA
          return FMEA;
        case 3: // MARKOV_CHAIN
          return MARKOV_CHAIN;
        case 4: // FAULT_TREE
          return FAULT_TREE;
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
    tmpMap.put(_Fields.FAILURE_MODEL, new org.apache.thrift.meta_data.FieldMetaData("FailureModel", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIFailureModel.class)));
    tmpMap.put(_Fields.FMEA, new org.apache.thrift.meta_data.FieldMetaData("FMEA", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIFMEA")));
    tmpMap.put(_Fields.MARKOV_CHAIN, new org.apache.thrift.meta_data.FieldMetaData("MarkovChain", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIMarkovChain")));
    tmpMap.put(_Fields.FAULT_TREE, new org.apache.thrift.meta_data.FieldMetaData("FaultTree", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIFaultTree")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIFailureModelUnion.class, metaDataMap);
  }

  public TDDIFailureModelUnion() {
    super();
  }

  public TDDIFailureModelUnion(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public TDDIFailureModelUnion(TDDIFailureModelUnion other) {
    super(other);
  }
  public TDDIFailureModelUnion deepCopy() {
    return new TDDIFailureModelUnion(this);
  }

  public static TDDIFailureModelUnion FailureModel(TDDIFailureModel value) {
    TDDIFailureModelUnion x = new TDDIFailureModelUnion();
    x.setFailureModel(value);
    return x;
  }

  public static TDDIFailureModelUnion FMEA(TDDIFMEA value) {
    TDDIFailureModelUnion x = new TDDIFailureModelUnion();
    x.setFMEA(value);
    return x;
  }

  public static TDDIFailureModelUnion MarkovChain(TDDIMarkovChain value) {
    TDDIFailureModelUnion x = new TDDIFailureModelUnion();
    x.setMarkovChain(value);
    return x;
  }

  public static TDDIFailureModelUnion FaultTree(TDDIFaultTree value) {
    TDDIFailureModelUnion x = new TDDIFailureModelUnion();
    x.setFaultTree(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case FAILURE_MODEL:
        if (value instanceof TDDIFailureModel) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIFailureModel for field 'FailureModel', but got " + value.getClass().getSimpleName());
      case FMEA:
        if (value instanceof TDDIFMEA) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIFMEA for field 'FMEA', but got " + value.getClass().getSimpleName());
      case MARKOV_CHAIN:
        if (value instanceof TDDIMarkovChain) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIMarkovChain for field 'MarkovChain', but got " + value.getClass().getSimpleName());
      case FAULT_TREE:
        if (value instanceof TDDIFaultTree) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TDDIFaultTree for field 'FaultTree', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case FAILURE_MODEL:
          if (field.type == FAILURE_MODEL_FIELD_DESC.type) {
            TDDIFailureModel FailureModel;
            FailureModel = new TDDIFailureModel();
            FailureModel.read(iprot);
            return FailureModel;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case FMEA:
          if (field.type == FMEA_FIELD_DESC.type) {
            TDDIFMEA FMEA;
            FMEA = new TDDIFMEA();
            FMEA.read(iprot);
            return FMEA;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case MARKOV_CHAIN:
          if (field.type == MARKOV_CHAIN_FIELD_DESC.type) {
            TDDIMarkovChain MarkovChain;
            MarkovChain = new TDDIMarkovChain();
            MarkovChain.read(iprot);
            return MarkovChain;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case FAULT_TREE:
          if (field.type == FAULT_TREE_FIELD_DESC.type) {
            TDDIFaultTree FaultTree;
            FaultTree = new TDDIFaultTree();
            FaultTree.read(iprot);
            return FaultTree;
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
      case FAILURE_MODEL:
        TDDIFailureModel FailureModel = (TDDIFailureModel)value_;
        FailureModel.write(oprot);
        return;
      case FMEA:
        TDDIFMEA FMEA = (TDDIFMEA)value_;
        FMEA.write(oprot);
        return;
      case MARKOV_CHAIN:
        TDDIMarkovChain MarkovChain = (TDDIMarkovChain)value_;
        MarkovChain.write(oprot);
        return;
      case FAULT_TREE:
        TDDIFaultTree FaultTree = (TDDIFaultTree)value_;
        FaultTree.write(oprot);
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
        case FAILURE_MODEL:
          TDDIFailureModel FailureModel;
          FailureModel = new TDDIFailureModel();
          FailureModel.read(iprot);
          return FailureModel;
        case FMEA:
          TDDIFMEA FMEA;
          FMEA = new TDDIFMEA();
          FMEA.read(iprot);
          return FMEA;
        case MARKOV_CHAIN:
          TDDIMarkovChain MarkovChain;
          MarkovChain = new TDDIMarkovChain();
          MarkovChain.read(iprot);
          return MarkovChain;
        case FAULT_TREE:
          TDDIFaultTree FaultTree;
          FaultTree = new TDDIFaultTree();
          FaultTree.read(iprot);
          return FaultTree;
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
      case FAILURE_MODEL:
        TDDIFailureModel FailureModel = (TDDIFailureModel)value_;
        FailureModel.write(oprot);
        return;
      case FMEA:
        TDDIFMEA FMEA = (TDDIFMEA)value_;
        FMEA.write(oprot);
        return;
      case MARKOV_CHAIN:
        TDDIMarkovChain MarkovChain = (TDDIMarkovChain)value_;
        MarkovChain.write(oprot);
        return;
      case FAULT_TREE:
        TDDIFaultTree FaultTree = (TDDIFaultTree)value_;
        FaultTree.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case FAILURE_MODEL:
        return FAILURE_MODEL_FIELD_DESC;
      case FMEA:
        return FMEA_FIELD_DESC;
      case MARKOV_CHAIN:
        return MARKOV_CHAIN_FIELD_DESC;
      case FAULT_TREE:
        return FAULT_TREE_FIELD_DESC;
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


  public TDDIFailureModel getFailureModel() {
    if (getSetField() == _Fields.FAILURE_MODEL) {
      return (TDDIFailureModel)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'FailureModel' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFailureModel(TDDIFailureModel value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.FAILURE_MODEL;
    value_ = value;
  }

  public TDDIFMEA getFMEA() {
    if (getSetField() == _Fields.FMEA) {
      return (TDDIFMEA)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'FMEA' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFMEA(TDDIFMEA value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.FMEA;
    value_ = value;
  }

  public TDDIMarkovChain getMarkovChain() {
    if (getSetField() == _Fields.MARKOV_CHAIN) {
      return (TDDIMarkovChain)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'MarkovChain' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setMarkovChain(TDDIMarkovChain value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.MARKOV_CHAIN;
    value_ = value;
  }

  public TDDIFaultTree getFaultTree() {
    if (getSetField() == _Fields.FAULT_TREE) {
      return (TDDIFaultTree)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'FaultTree' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFaultTree(TDDIFaultTree value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.FAULT_TREE;
    value_ = value;
  }

  public boolean isSetFailureModel() {
    return setField_ == _Fields.FAILURE_MODEL;
  }


  public boolean isSetFMEA() {
    return setField_ == _Fields.FMEA;
  }


  public boolean isSetMarkovChain() {
    return setField_ == _Fields.MARKOV_CHAIN;
  }


  public boolean isSetFaultTree() {
    return setField_ == _Fields.FAULT_TREE;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof TDDIFailureModelUnion) {
      return equals((TDDIFailureModelUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(TDDIFailureModelUnion other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TDDIFailureModelUnion other) {
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