/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-11-04")
public class TDDIAbstractEpsilonScriptExecutionException extends org.apache.thrift.TException implements org.apache.thrift.TBase<TDDIAbstractEpsilonScriptExecutionException, TDDIAbstractEpsilonScriptExecutionException._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractEpsilonScriptExecutionException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractEpsilonScriptExecutionException");

  private static final org.apache.thrift.protocol.TField USED_EXCEPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedException", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_EXCEPTION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedExceptionType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractEpsilonScriptExecutionExceptionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractEpsilonScriptExecutionExceptionTupleSchemeFactory();

  public TDDIEpsilonScriptExecutionExceptionUnion UsedException; // required
  /**
   * 
   * @see TDDIEpsilonScriptExecutionExceptionUnionType
   */
  public TDDIEpsilonScriptExecutionExceptionUnionType UsedExceptionType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_EXCEPTION((short)1, "UsedException"),
    /**
     * 
     * @see TDDIEpsilonScriptExecutionExceptionUnionType
     */
    USED_EXCEPTION_TYPE((short)2, "UsedExceptionType");

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
        case 1: // USED_EXCEPTION
          return USED_EXCEPTION;
        case 2: // USED_EXCEPTION_TYPE
          return USED_EXCEPTION_TYPE;
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
    tmpMap.put(_Fields.USED_EXCEPTION, new org.apache.thrift.meta_data.FieldMetaData("UsedException", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIEpsilonScriptExecutionExceptionUnion.class)));
    tmpMap.put(_Fields.USED_EXCEPTION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedExceptionType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDIEpsilonScriptExecutionExceptionUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractEpsilonScriptExecutionException.class, metaDataMap);
  }

  public TDDIAbstractEpsilonScriptExecutionException() {
  }

  public TDDIAbstractEpsilonScriptExecutionException(
    TDDIEpsilonScriptExecutionExceptionUnion UsedException,
    TDDIEpsilonScriptExecutionExceptionUnionType UsedExceptionType)
  {
    this();
    this.UsedException = UsedException;
    this.UsedExceptionType = UsedExceptionType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractEpsilonScriptExecutionException(TDDIAbstractEpsilonScriptExecutionException other) {
    if (other.isSetUsedException()) {
      this.UsedException = new TDDIEpsilonScriptExecutionExceptionUnion(other.UsedException);
    }
    if (other.isSetUsedExceptionType()) {
      this.UsedExceptionType = other.UsedExceptionType;
    }
  }

  public TDDIAbstractEpsilonScriptExecutionException deepCopy() {
    return new TDDIAbstractEpsilonScriptExecutionException(this);
  }

  @Override
  public void clear() {
    this.UsedException = null;
    this.UsedExceptionType = null;
  }

  public TDDIEpsilonScriptExecutionExceptionUnion getUsedException() {
    return this.UsedException;
  }

  public TDDIAbstractEpsilonScriptExecutionException setUsedException(TDDIEpsilonScriptExecutionExceptionUnion UsedException) {
    this.UsedException = UsedException;
    return this;
  }

  public void unsetUsedException() {
    this.UsedException = null;
  }

  /** Returns true if field UsedException is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedException() {
    return this.UsedException != null;
  }

  public void setUsedExceptionIsSet(boolean value) {
    if (!value) {
      this.UsedException = null;
    }
  }

  /**
   * 
   * @see TDDIEpsilonScriptExecutionExceptionUnionType
   */
  public TDDIEpsilonScriptExecutionExceptionUnionType getUsedExceptionType() {
    return this.UsedExceptionType;
  }

  /**
   * 
   * @see TDDIEpsilonScriptExecutionExceptionUnionType
   */
  public TDDIAbstractEpsilonScriptExecutionException setUsedExceptionType(TDDIEpsilonScriptExecutionExceptionUnionType UsedExceptionType) {
    this.UsedExceptionType = UsedExceptionType;
    return this;
  }

  public void unsetUsedExceptionType() {
    this.UsedExceptionType = null;
  }

  /** Returns true if field UsedExceptionType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedExceptionType() {
    return this.UsedExceptionType != null;
  }

  public void setUsedExceptionTypeIsSet(boolean value) {
    if (!value) {
      this.UsedExceptionType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_EXCEPTION:
      if (value == null) {
        unsetUsedException();
      } else {
        setUsedException((TDDIEpsilonScriptExecutionExceptionUnion)value);
      }
      break;

    case USED_EXCEPTION_TYPE:
      if (value == null) {
        unsetUsedExceptionType();
      } else {
        setUsedExceptionType((TDDIEpsilonScriptExecutionExceptionUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_EXCEPTION:
      return getUsedException();

    case USED_EXCEPTION_TYPE:
      return getUsedExceptionType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_EXCEPTION:
      return isSetUsedException();
    case USED_EXCEPTION_TYPE:
      return isSetUsedExceptionType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractEpsilonScriptExecutionException)
      return this.equals((TDDIAbstractEpsilonScriptExecutionException)that);
    return false;
  }

  public boolean equals(TDDIAbstractEpsilonScriptExecutionException that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedException = true && this.isSetUsedException();
    boolean that_present_UsedException = true && that.isSetUsedException();
    if (this_present_UsedException || that_present_UsedException) {
      if (!(this_present_UsedException && that_present_UsedException))
        return false;
      if (!this.UsedException.equals(that.UsedException))
        return false;
    }

    boolean this_present_UsedExceptionType = true && this.isSetUsedExceptionType();
    boolean that_present_UsedExceptionType = true && that.isSetUsedExceptionType();
    if (this_present_UsedExceptionType || that_present_UsedExceptionType) {
      if (!(this_present_UsedExceptionType && that_present_UsedExceptionType))
        return false;
      if (!this.UsedExceptionType.equals(that.UsedExceptionType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedException()) ? 131071 : 524287);
    if (isSetUsedException())
      hashCode = hashCode * 8191 + UsedException.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedExceptionType()) ? 131071 : 524287);
    if (isSetUsedExceptionType())
      hashCode = hashCode * 8191 + UsedExceptionType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractEpsilonScriptExecutionException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedException()).compareTo(other.isSetUsedException());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedException()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedException, other.UsedException);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedExceptionType()).compareTo(other.isSetUsedExceptionType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedExceptionType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedExceptionType, other.UsedExceptionType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractEpsilonScriptExecutionException(");
    boolean first = true;

    sb.append("UsedException:");
    if (this.UsedException == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedException);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedExceptionType:");
    if (this.UsedExceptionType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedExceptionType);
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

  private static class TDDIAbstractEpsilonScriptExecutionExceptionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractEpsilonScriptExecutionExceptionStandardScheme getScheme() {
      return new TDDIAbstractEpsilonScriptExecutionExceptionStandardScheme();
    }
  }

  private static class TDDIAbstractEpsilonScriptExecutionExceptionStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractEpsilonScriptExecutionException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractEpsilonScriptExecutionException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_EXCEPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedException = new TDDIEpsilonScriptExecutionExceptionUnion();
              struct.UsedException.read(iprot);
              struct.setUsedExceptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_EXCEPTION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedExceptionType = thriftContract.TDDIEpsilonScriptExecutionExceptionUnionType.findByValue(iprot.readI32());
              struct.setUsedExceptionTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractEpsilonScriptExecutionException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedException != null) {
        oprot.writeFieldBegin(USED_EXCEPTION_FIELD_DESC);
        struct.UsedException.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedExceptionType != null) {
        oprot.writeFieldBegin(USED_EXCEPTION_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedExceptionType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractEpsilonScriptExecutionExceptionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractEpsilonScriptExecutionExceptionTupleScheme getScheme() {
      return new TDDIAbstractEpsilonScriptExecutionExceptionTupleScheme();
    }
  }

  private static class TDDIAbstractEpsilonScriptExecutionExceptionTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractEpsilonScriptExecutionException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractEpsilonScriptExecutionException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedException()) {
        optionals.set(0);
      }
      if (struct.isSetUsedExceptionType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedException()) {
        struct.UsedException.write(oprot);
      }
      if (struct.isSetUsedExceptionType()) {
        oprot.writeI32(struct.UsedExceptionType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractEpsilonScriptExecutionException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedException = new TDDIEpsilonScriptExecutionExceptionUnion();
        struct.UsedException.read(iprot);
        struct.setUsedExceptionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedExceptionType = thriftContract.TDDIEpsilonScriptExecutionExceptionUnionType.findByValue(iprot.readI32());
        struct.setUsedExceptionTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

