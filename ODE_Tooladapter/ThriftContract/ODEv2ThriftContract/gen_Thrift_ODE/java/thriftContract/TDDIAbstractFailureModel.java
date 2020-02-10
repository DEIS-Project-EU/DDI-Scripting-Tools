/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-11-04")
public class TDDIAbstractFailureModel implements org.apache.thrift.TBase<TDDIAbstractFailureModel, TDDIAbstractFailureModel._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractFailureModel> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractFailureModel");

  private static final org.apache.thrift.protocol.TField USED_FAILURE_MODEL_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedFailureModel", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_FAILURE_MODEL_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedFailureModelType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractFailureModelStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractFailureModelTupleSchemeFactory();

  public TDDIFailureModelUnion UsedFailureModel; // required
  /**
   * 
   * @see TDDIFailureModelUnionType
   */
  public TDDIFailureModelUnionType UsedFailureModelType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_FAILURE_MODEL((short)1, "UsedFailureModel"),
    /**
     * 
     * @see TDDIFailureModelUnionType
     */
    USED_FAILURE_MODEL_TYPE((short)2, "UsedFailureModelType");

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
        case 1: // USED_FAILURE_MODEL
          return USED_FAILURE_MODEL;
        case 2: // USED_FAILURE_MODEL_TYPE
          return USED_FAILURE_MODEL_TYPE;
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

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USED_FAILURE_MODEL, new org.apache.thrift.meta_data.FieldMetaData("UsedFailureModel", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIFailureModelUnion.class)));
    tmpMap.put(_Fields.USED_FAILURE_MODEL_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedFailureModelType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDIFailureModelUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractFailureModel.class, metaDataMap);
  }

  public TDDIAbstractFailureModel() {
  }

  public TDDIAbstractFailureModel(
    TDDIFailureModelUnion UsedFailureModel,
    TDDIFailureModelUnionType UsedFailureModelType)
  {
    this();
    this.UsedFailureModel = UsedFailureModel;
    this.UsedFailureModelType = UsedFailureModelType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractFailureModel(TDDIAbstractFailureModel other) {
    if (other.isSetUsedFailureModel()) {
      this.UsedFailureModel = new TDDIFailureModelUnion(other.UsedFailureModel);
    }
    if (other.isSetUsedFailureModelType()) {
      this.UsedFailureModelType = other.UsedFailureModelType;
    }
  }

  public TDDIAbstractFailureModel deepCopy() {
    return new TDDIAbstractFailureModel(this);
  }

  @Override
  public void clear() {
    this.UsedFailureModel = null;
    this.UsedFailureModelType = null;
  }

  public TDDIFailureModelUnion getUsedFailureModel() {
    return this.UsedFailureModel;
  }

  public TDDIAbstractFailureModel setUsedFailureModel(TDDIFailureModelUnion UsedFailureModel) {
    this.UsedFailureModel = UsedFailureModel;
    return this;
  }

  public void unsetUsedFailureModel() {
    this.UsedFailureModel = null;
  }

  /** Returns true if field UsedFailureModel is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedFailureModel() {
    return this.UsedFailureModel != null;
  }

  public void setUsedFailureModelIsSet(boolean value) {
    if (!value) {
      this.UsedFailureModel = null;
    }
  }

  /**
   * 
   * @see TDDIFailureModelUnionType
   */
  public TDDIFailureModelUnionType getUsedFailureModelType() {
    return this.UsedFailureModelType;
  }

  /**
   * 
   * @see TDDIFailureModelUnionType
   */
  public TDDIAbstractFailureModel setUsedFailureModelType(TDDIFailureModelUnionType UsedFailureModelType) {
    this.UsedFailureModelType = UsedFailureModelType;
    return this;
  }

  public void unsetUsedFailureModelType() {
    this.UsedFailureModelType = null;
  }

  /** Returns true if field UsedFailureModelType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedFailureModelType() {
    return this.UsedFailureModelType != null;
  }

  public void setUsedFailureModelTypeIsSet(boolean value) {
    if (!value) {
      this.UsedFailureModelType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_FAILURE_MODEL:
      if (value == null) {
        unsetUsedFailureModel();
      } else {
        setUsedFailureModel((TDDIFailureModelUnion)value);
      }
      break;

    case USED_FAILURE_MODEL_TYPE:
      if (value == null) {
        unsetUsedFailureModelType();
      } else {
        setUsedFailureModelType((TDDIFailureModelUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_FAILURE_MODEL:
      return getUsedFailureModel();

    case USED_FAILURE_MODEL_TYPE:
      return getUsedFailureModelType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_FAILURE_MODEL:
      return isSetUsedFailureModel();
    case USED_FAILURE_MODEL_TYPE:
      return isSetUsedFailureModelType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractFailureModel)
      return this.equals((TDDIAbstractFailureModel)that);
    return false;
  }

  public boolean equals(TDDIAbstractFailureModel that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedFailureModel = true && this.isSetUsedFailureModel();
    boolean that_present_UsedFailureModel = true && that.isSetUsedFailureModel();
    if (this_present_UsedFailureModel || that_present_UsedFailureModel) {
      if (!(this_present_UsedFailureModel && that_present_UsedFailureModel))
        return false;
      if (!this.UsedFailureModel.equals(that.UsedFailureModel))
        return false;
    }

    boolean this_present_UsedFailureModelType = true && this.isSetUsedFailureModelType();
    boolean that_present_UsedFailureModelType = true && that.isSetUsedFailureModelType();
    if (this_present_UsedFailureModelType || that_present_UsedFailureModelType) {
      if (!(this_present_UsedFailureModelType && that_present_UsedFailureModelType))
        return false;
      if (!this.UsedFailureModelType.equals(that.UsedFailureModelType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedFailureModel()) ? 131071 : 524287);
    if (isSetUsedFailureModel())
      hashCode = hashCode * 8191 + UsedFailureModel.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedFailureModelType()) ? 131071 : 524287);
    if (isSetUsedFailureModelType())
      hashCode = hashCode * 8191 + UsedFailureModelType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractFailureModel other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedFailureModel()).compareTo(other.isSetUsedFailureModel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedFailureModel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedFailureModel, other.UsedFailureModel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedFailureModelType()).compareTo(other.isSetUsedFailureModelType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedFailureModelType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedFailureModelType, other.UsedFailureModelType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractFailureModel(");
    boolean first = true;

    sb.append("UsedFailureModel:");
    if (this.UsedFailureModel == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedFailureModel);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedFailureModelType:");
    if (this.UsedFailureModelType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedFailureModelType);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class TDDIAbstractFailureModelStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractFailureModelStandardScheme getScheme() {
      return new TDDIAbstractFailureModelStandardScheme();
    }
  }

  private static class TDDIAbstractFailureModelStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractFailureModel> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractFailureModel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_FAILURE_MODEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedFailureModel = new TDDIFailureModelUnion();
              struct.UsedFailureModel.read(iprot);
              struct.setUsedFailureModelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_FAILURE_MODEL_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedFailureModelType = thriftContract.TDDIFailureModelUnionType.findByValue(iprot.readI32());
              struct.setUsedFailureModelTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractFailureModel struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedFailureModel != null) {
        oprot.writeFieldBegin(USED_FAILURE_MODEL_FIELD_DESC);
        struct.UsedFailureModel.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedFailureModelType != null) {
        oprot.writeFieldBegin(USED_FAILURE_MODEL_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedFailureModelType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractFailureModelTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractFailureModelTupleScheme getScheme() {
      return new TDDIAbstractFailureModelTupleScheme();
    }
  }

  private static class TDDIAbstractFailureModelTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractFailureModel> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractFailureModel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedFailureModel()) {
        optionals.set(0);
      }
      if (struct.isSetUsedFailureModelType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedFailureModel()) {
        struct.UsedFailureModel.write(oprot);
      }
      if (struct.isSetUsedFailureModelType()) {
        oprot.writeI32(struct.UsedFailureModelType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractFailureModel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedFailureModel = new TDDIFailureModelUnion();
        struct.UsedFailureModel.read(iprot);
        struct.setUsedFailureModelIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedFailureModelType = thriftContract.TDDIFailureModelUnionType.findByValue(iprot.readI32());
        struct.setUsedFailureModelTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

