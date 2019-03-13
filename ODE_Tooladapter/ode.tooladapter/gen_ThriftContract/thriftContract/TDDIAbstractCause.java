/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-01-14")
public class TDDIAbstractCause implements org.apache.thrift.TBase<TDDIAbstractCause, TDDIAbstractCause._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractCause> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractCause");

  private static final org.apache.thrift.protocol.TField USED_CAUSE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedCause", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_CAUSE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedCauseType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractCauseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractCauseTupleSchemeFactory();

  public TDDICauseUnion UsedCause; // required
  /**
   * 
   * @see TDDICauseUnionType
   */
  public TDDICauseUnionType UsedCauseType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_CAUSE((short)1, "UsedCause"),
    /**
     * 
     * @see TDDICauseUnionType
     */
    USED_CAUSE_TYPE((short)2, "UsedCauseType");

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
        case 1: // USED_CAUSE
          return USED_CAUSE;
        case 2: // USED_CAUSE_TYPE
          return USED_CAUSE_TYPE;
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
    tmpMap.put(_Fields.USED_CAUSE, new org.apache.thrift.meta_data.FieldMetaData("UsedCause", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDICauseUnion.class)));
    tmpMap.put(_Fields.USED_CAUSE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedCauseType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDICauseUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractCause.class, metaDataMap);
  }

  public TDDIAbstractCause() {
  }

  public TDDIAbstractCause(
    TDDICauseUnion UsedCause,
    TDDICauseUnionType UsedCauseType)
  {
    this();
    this.UsedCause = UsedCause;
    this.UsedCauseType = UsedCauseType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractCause(TDDIAbstractCause other) {
    if (other.isSetUsedCause()) {
      this.UsedCause = new TDDICauseUnion(other.UsedCause);
    }
    if (other.isSetUsedCauseType()) {
      this.UsedCauseType = other.UsedCauseType;
    }
  }

  public TDDIAbstractCause deepCopy() {
    return new TDDIAbstractCause(this);
  }

  @Override
  public void clear() {
    this.UsedCause = null;
    this.UsedCauseType = null;
  }

  public TDDICauseUnion getUsedCause() {
    return this.UsedCause;
  }

  public TDDIAbstractCause setUsedCause(TDDICauseUnion UsedCause) {
    this.UsedCause = UsedCause;
    return this;
  }

  public void unsetUsedCause() {
    this.UsedCause = null;
  }

  /** Returns true if field UsedCause is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedCause() {
    return this.UsedCause != null;
  }

  public void setUsedCauseIsSet(boolean value) {
    if (!value) {
      this.UsedCause = null;
    }
  }

  /**
   * 
   * @see TDDICauseUnionType
   */
  public TDDICauseUnionType getUsedCauseType() {
    return this.UsedCauseType;
  }

  /**
   * 
   * @see TDDICauseUnionType
   */
  public TDDIAbstractCause setUsedCauseType(TDDICauseUnionType UsedCauseType) {
    this.UsedCauseType = UsedCauseType;
    return this;
  }

  public void unsetUsedCauseType() {
    this.UsedCauseType = null;
  }

  /** Returns true if field UsedCauseType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedCauseType() {
    return this.UsedCauseType != null;
  }

  public void setUsedCauseTypeIsSet(boolean value) {
    if (!value) {
      this.UsedCauseType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_CAUSE:
      if (value == null) {
        unsetUsedCause();
      } else {
        setUsedCause((TDDICauseUnion)value);
      }
      break;

    case USED_CAUSE_TYPE:
      if (value == null) {
        unsetUsedCauseType();
      } else {
        setUsedCauseType((TDDICauseUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_CAUSE:
      return getUsedCause();

    case USED_CAUSE_TYPE:
      return getUsedCauseType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_CAUSE:
      return isSetUsedCause();
    case USED_CAUSE_TYPE:
      return isSetUsedCauseType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractCause)
      return this.equals((TDDIAbstractCause)that);
    return false;
  }

  public boolean equals(TDDIAbstractCause that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedCause = true && this.isSetUsedCause();
    boolean that_present_UsedCause = true && that.isSetUsedCause();
    if (this_present_UsedCause || that_present_UsedCause) {
      if (!(this_present_UsedCause && that_present_UsedCause))
        return false;
      if (!this.UsedCause.equals(that.UsedCause))
        return false;
    }

    boolean this_present_UsedCauseType = true && this.isSetUsedCauseType();
    boolean that_present_UsedCauseType = true && that.isSetUsedCauseType();
    if (this_present_UsedCauseType || that_present_UsedCauseType) {
      if (!(this_present_UsedCauseType && that_present_UsedCauseType))
        return false;
      if (!this.UsedCauseType.equals(that.UsedCauseType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedCause()) ? 131071 : 524287);
    if (isSetUsedCause())
      hashCode = hashCode * 8191 + UsedCause.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedCauseType()) ? 131071 : 524287);
    if (isSetUsedCauseType())
      hashCode = hashCode * 8191 + UsedCauseType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractCause other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedCause()).compareTo(other.isSetUsedCause());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedCause()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedCause, other.UsedCause);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedCauseType()).compareTo(other.isSetUsedCauseType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedCauseType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedCauseType, other.UsedCauseType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractCause(");
    boolean first = true;

    sb.append("UsedCause:");
    if (this.UsedCause == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedCause);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedCauseType:");
    if (this.UsedCauseType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedCauseType);
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

  private static class TDDIAbstractCauseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractCauseStandardScheme getScheme() {
      return new TDDIAbstractCauseStandardScheme();
    }
  }

  private static class TDDIAbstractCauseStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractCause> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractCause struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_CAUSE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedCause = new TDDICauseUnion();
              struct.UsedCause.read(iprot);
              struct.setUsedCauseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_CAUSE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedCauseType = thriftContract.TDDICauseUnionType.findByValue(iprot.readI32());
              struct.setUsedCauseTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractCause struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedCause != null) {
        oprot.writeFieldBegin(USED_CAUSE_FIELD_DESC);
        struct.UsedCause.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedCauseType != null) {
        oprot.writeFieldBegin(USED_CAUSE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedCauseType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractCauseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractCauseTupleScheme getScheme() {
      return new TDDIAbstractCauseTupleScheme();
    }
  }

  private static class TDDIAbstractCauseTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractCause> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractCause struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedCause()) {
        optionals.set(0);
      }
      if (struct.isSetUsedCauseType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedCause()) {
        struct.UsedCause.write(oprot);
      }
      if (struct.isSetUsedCauseType()) {
        oprot.writeI32(struct.UsedCauseType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractCause struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedCause = new TDDICauseUnion();
        struct.UsedCause.read(iprot);
        struct.setUsedCauseIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedCauseType = thriftContract.TDDICauseUnionType.findByValue(iprot.readI32());
        struct.setUsedCauseTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

