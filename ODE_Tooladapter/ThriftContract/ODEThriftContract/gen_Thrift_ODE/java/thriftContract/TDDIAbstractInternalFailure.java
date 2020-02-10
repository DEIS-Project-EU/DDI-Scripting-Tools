/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-08-13")
public class TDDIAbstractInternalFailure implements org.apache.thrift.TBase<TDDIAbstractInternalFailure, TDDIAbstractInternalFailure._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractInternalFailure> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractInternalFailure");

  private static final org.apache.thrift.protocol.TField USED_INTERNAL_FAILURE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedInternalFailure", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_INTERNAL_FAILURE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedInternalFailureType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractInternalFailureStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractInternalFailureTupleSchemeFactory();

  public TDDIInternalFailureUnion UsedInternalFailure; // required
  /**
   * 
   * @see TDDIInternalFailureUnionType
   */
  public TDDIInternalFailureUnionType UsedInternalFailureType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_INTERNAL_FAILURE((short)1, "UsedInternalFailure"),
    /**
     * 
     * @see TDDIInternalFailureUnionType
     */
    USED_INTERNAL_FAILURE_TYPE((short)2, "UsedInternalFailureType");

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
        case 1: // USED_INTERNAL_FAILURE
          return USED_INTERNAL_FAILURE;
        case 2: // USED_INTERNAL_FAILURE_TYPE
          return USED_INTERNAL_FAILURE_TYPE;
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
    tmpMap.put(_Fields.USED_INTERNAL_FAILURE, new org.apache.thrift.meta_data.FieldMetaData("UsedInternalFailure", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIInternalFailureUnion.class)));
    tmpMap.put(_Fields.USED_INTERNAL_FAILURE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedInternalFailureType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDIInternalFailureUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractInternalFailure.class, metaDataMap);
  }

  public TDDIAbstractInternalFailure() {
  }

  public TDDIAbstractInternalFailure(
    TDDIInternalFailureUnion UsedInternalFailure,
    TDDIInternalFailureUnionType UsedInternalFailureType)
  {
    this();
    this.UsedInternalFailure = UsedInternalFailure;
    this.UsedInternalFailureType = UsedInternalFailureType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractInternalFailure(TDDIAbstractInternalFailure other) {
    if (other.isSetUsedInternalFailure()) {
      this.UsedInternalFailure = new TDDIInternalFailureUnion(other.UsedInternalFailure);
    }
    if (other.isSetUsedInternalFailureType()) {
      this.UsedInternalFailureType = other.UsedInternalFailureType;
    }
  }

  public TDDIAbstractInternalFailure deepCopy() {
    return new TDDIAbstractInternalFailure(this);
  }

  @Override
  public void clear() {
    this.UsedInternalFailure = null;
    this.UsedInternalFailureType = null;
  }

  public TDDIInternalFailureUnion getUsedInternalFailure() {
    return this.UsedInternalFailure;
  }

  public TDDIAbstractInternalFailure setUsedInternalFailure(TDDIInternalFailureUnion UsedInternalFailure) {
    this.UsedInternalFailure = UsedInternalFailure;
    return this;
  }

  public void unsetUsedInternalFailure() {
    this.UsedInternalFailure = null;
  }

  /** Returns true if field UsedInternalFailure is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedInternalFailure() {
    return this.UsedInternalFailure != null;
  }

  public void setUsedInternalFailureIsSet(boolean value) {
    if (!value) {
      this.UsedInternalFailure = null;
    }
  }

  /**
   * 
   * @see TDDIInternalFailureUnionType
   */
  public TDDIInternalFailureUnionType getUsedInternalFailureType() {
    return this.UsedInternalFailureType;
  }

  /**
   * 
   * @see TDDIInternalFailureUnionType
   */
  public TDDIAbstractInternalFailure setUsedInternalFailureType(TDDIInternalFailureUnionType UsedInternalFailureType) {
    this.UsedInternalFailureType = UsedInternalFailureType;
    return this;
  }

  public void unsetUsedInternalFailureType() {
    this.UsedInternalFailureType = null;
  }

  /** Returns true if field UsedInternalFailureType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedInternalFailureType() {
    return this.UsedInternalFailureType != null;
  }

  public void setUsedInternalFailureTypeIsSet(boolean value) {
    if (!value) {
      this.UsedInternalFailureType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_INTERNAL_FAILURE:
      if (value == null) {
        unsetUsedInternalFailure();
      } else {
        setUsedInternalFailure((TDDIInternalFailureUnion)value);
      }
      break;

    case USED_INTERNAL_FAILURE_TYPE:
      if (value == null) {
        unsetUsedInternalFailureType();
      } else {
        setUsedInternalFailureType((TDDIInternalFailureUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_INTERNAL_FAILURE:
      return getUsedInternalFailure();

    case USED_INTERNAL_FAILURE_TYPE:
      return getUsedInternalFailureType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_INTERNAL_FAILURE:
      return isSetUsedInternalFailure();
    case USED_INTERNAL_FAILURE_TYPE:
      return isSetUsedInternalFailureType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractInternalFailure)
      return this.equals((TDDIAbstractInternalFailure)that);
    return false;
  }

  public boolean equals(TDDIAbstractInternalFailure that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedInternalFailure = true && this.isSetUsedInternalFailure();
    boolean that_present_UsedInternalFailure = true && that.isSetUsedInternalFailure();
    if (this_present_UsedInternalFailure || that_present_UsedInternalFailure) {
      if (!(this_present_UsedInternalFailure && that_present_UsedInternalFailure))
        return false;
      if (!this.UsedInternalFailure.equals(that.UsedInternalFailure))
        return false;
    }

    boolean this_present_UsedInternalFailureType = true && this.isSetUsedInternalFailureType();
    boolean that_present_UsedInternalFailureType = true && that.isSetUsedInternalFailureType();
    if (this_present_UsedInternalFailureType || that_present_UsedInternalFailureType) {
      if (!(this_present_UsedInternalFailureType && that_present_UsedInternalFailureType))
        return false;
      if (!this.UsedInternalFailureType.equals(that.UsedInternalFailureType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedInternalFailure()) ? 131071 : 524287);
    if (isSetUsedInternalFailure())
      hashCode = hashCode * 8191 + UsedInternalFailure.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedInternalFailureType()) ? 131071 : 524287);
    if (isSetUsedInternalFailureType())
      hashCode = hashCode * 8191 + UsedInternalFailureType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractInternalFailure other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedInternalFailure()).compareTo(other.isSetUsedInternalFailure());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedInternalFailure()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedInternalFailure, other.UsedInternalFailure);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedInternalFailureType()).compareTo(other.isSetUsedInternalFailureType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedInternalFailureType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedInternalFailureType, other.UsedInternalFailureType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractInternalFailure(");
    boolean first = true;

    sb.append("UsedInternalFailure:");
    if (this.UsedInternalFailure == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedInternalFailure);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedInternalFailureType:");
    if (this.UsedInternalFailureType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedInternalFailureType);
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

  private static class TDDIAbstractInternalFailureStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractInternalFailureStandardScheme getScheme() {
      return new TDDIAbstractInternalFailureStandardScheme();
    }
  }

  private static class TDDIAbstractInternalFailureStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractInternalFailure> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractInternalFailure struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_INTERNAL_FAILURE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedInternalFailure = new TDDIInternalFailureUnion();
              struct.UsedInternalFailure.read(iprot);
              struct.setUsedInternalFailureIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_INTERNAL_FAILURE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedInternalFailureType = thriftContract.TDDIInternalFailureUnionType.findByValue(iprot.readI32());
              struct.setUsedInternalFailureTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractInternalFailure struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedInternalFailure != null) {
        oprot.writeFieldBegin(USED_INTERNAL_FAILURE_FIELD_DESC);
        struct.UsedInternalFailure.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedInternalFailureType != null) {
        oprot.writeFieldBegin(USED_INTERNAL_FAILURE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedInternalFailureType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractInternalFailureTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractInternalFailureTupleScheme getScheme() {
      return new TDDIAbstractInternalFailureTupleScheme();
    }
  }

  private static class TDDIAbstractInternalFailureTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractInternalFailure> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractInternalFailure struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedInternalFailure()) {
        optionals.set(0);
      }
      if (struct.isSetUsedInternalFailureType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedInternalFailure()) {
        struct.UsedInternalFailure.write(oprot);
      }
      if (struct.isSetUsedInternalFailureType()) {
        oprot.writeI32(struct.UsedInternalFailureType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractInternalFailure struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedInternalFailure = new TDDIInternalFailureUnion();
        struct.UsedInternalFailure.read(iprot);
        struct.setUsedInternalFailureIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedInternalFailureType = thriftContract.TDDIInternalFailureUnionType.findByValue(iprot.readI32());
        struct.setUsedInternalFailureTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

