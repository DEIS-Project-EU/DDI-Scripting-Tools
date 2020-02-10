/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-08-13")
public class TDDIAbstractFailureAnalysisArtifact implements org.apache.thrift.TBase<TDDIAbstractFailureAnalysisArtifact, TDDIAbstractFailureAnalysisArtifact._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractFailureAnalysisArtifact> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractFailureAnalysisArtifact");

  private static final org.apache.thrift.protocol.TField USED_FAILURE_ANALYSIS_ARTIFACT_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedFailureAnalysisArtifact", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_FAILURE_ANALYSIS_ARTIFACT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedFailureAnalysisArtifactType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractFailureAnalysisArtifactStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractFailureAnalysisArtifactTupleSchemeFactory();

  public TDDIFailureAnalysisArtifactUnion UsedFailureAnalysisArtifact; // required
  /**
   * 
   * @see TDDIFailureAnalysisArtifactUnionType
   */
  public TDDIFailureAnalysisArtifactUnionType UsedFailureAnalysisArtifactType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_FAILURE_ANALYSIS_ARTIFACT((short)1, "UsedFailureAnalysisArtifact"),
    /**
     * 
     * @see TDDIFailureAnalysisArtifactUnionType
     */
    USED_FAILURE_ANALYSIS_ARTIFACT_TYPE((short)2, "UsedFailureAnalysisArtifactType");

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
        case 1: // USED_FAILURE_ANALYSIS_ARTIFACT
          return USED_FAILURE_ANALYSIS_ARTIFACT;
        case 2: // USED_FAILURE_ANALYSIS_ARTIFACT_TYPE
          return USED_FAILURE_ANALYSIS_ARTIFACT_TYPE;
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
    tmpMap.put(_Fields.USED_FAILURE_ANALYSIS_ARTIFACT, new org.apache.thrift.meta_data.FieldMetaData("UsedFailureAnalysisArtifact", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIFailureAnalysisArtifactUnion.class)));
    tmpMap.put(_Fields.USED_FAILURE_ANALYSIS_ARTIFACT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedFailureAnalysisArtifactType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDIFailureAnalysisArtifactUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractFailureAnalysisArtifact.class, metaDataMap);
  }

  public TDDIAbstractFailureAnalysisArtifact() {
  }

  public TDDIAbstractFailureAnalysisArtifact(
    TDDIFailureAnalysisArtifactUnion UsedFailureAnalysisArtifact,
    TDDIFailureAnalysisArtifactUnionType UsedFailureAnalysisArtifactType)
  {
    this();
    this.UsedFailureAnalysisArtifact = UsedFailureAnalysisArtifact;
    this.UsedFailureAnalysisArtifactType = UsedFailureAnalysisArtifactType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractFailureAnalysisArtifact(TDDIAbstractFailureAnalysisArtifact other) {
    if (other.isSetUsedFailureAnalysisArtifact()) {
      this.UsedFailureAnalysisArtifact = new TDDIFailureAnalysisArtifactUnion(other.UsedFailureAnalysisArtifact);
    }
    if (other.isSetUsedFailureAnalysisArtifactType()) {
      this.UsedFailureAnalysisArtifactType = other.UsedFailureAnalysisArtifactType;
    }
  }

  public TDDIAbstractFailureAnalysisArtifact deepCopy() {
    return new TDDIAbstractFailureAnalysisArtifact(this);
  }

  @Override
  public void clear() {
    this.UsedFailureAnalysisArtifact = null;
    this.UsedFailureAnalysisArtifactType = null;
  }

  public TDDIFailureAnalysisArtifactUnion getUsedFailureAnalysisArtifact() {
    return this.UsedFailureAnalysisArtifact;
  }

  public TDDIAbstractFailureAnalysisArtifact setUsedFailureAnalysisArtifact(TDDIFailureAnalysisArtifactUnion UsedFailureAnalysisArtifact) {
    this.UsedFailureAnalysisArtifact = UsedFailureAnalysisArtifact;
    return this;
  }

  public void unsetUsedFailureAnalysisArtifact() {
    this.UsedFailureAnalysisArtifact = null;
  }

  /** Returns true if field UsedFailureAnalysisArtifact is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedFailureAnalysisArtifact() {
    return this.UsedFailureAnalysisArtifact != null;
  }

  public void setUsedFailureAnalysisArtifactIsSet(boolean value) {
    if (!value) {
      this.UsedFailureAnalysisArtifact = null;
    }
  }

  /**
   * 
   * @see TDDIFailureAnalysisArtifactUnionType
   */
  public TDDIFailureAnalysisArtifactUnionType getUsedFailureAnalysisArtifactType() {
    return this.UsedFailureAnalysisArtifactType;
  }

  /**
   * 
   * @see TDDIFailureAnalysisArtifactUnionType
   */
  public TDDIAbstractFailureAnalysisArtifact setUsedFailureAnalysisArtifactType(TDDIFailureAnalysisArtifactUnionType UsedFailureAnalysisArtifactType) {
    this.UsedFailureAnalysisArtifactType = UsedFailureAnalysisArtifactType;
    return this;
  }

  public void unsetUsedFailureAnalysisArtifactType() {
    this.UsedFailureAnalysisArtifactType = null;
  }

  /** Returns true if field UsedFailureAnalysisArtifactType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedFailureAnalysisArtifactType() {
    return this.UsedFailureAnalysisArtifactType != null;
  }

  public void setUsedFailureAnalysisArtifactTypeIsSet(boolean value) {
    if (!value) {
      this.UsedFailureAnalysisArtifactType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_FAILURE_ANALYSIS_ARTIFACT:
      if (value == null) {
        unsetUsedFailureAnalysisArtifact();
      } else {
        setUsedFailureAnalysisArtifact((TDDIFailureAnalysisArtifactUnion)value);
      }
      break;

    case USED_FAILURE_ANALYSIS_ARTIFACT_TYPE:
      if (value == null) {
        unsetUsedFailureAnalysisArtifactType();
      } else {
        setUsedFailureAnalysisArtifactType((TDDIFailureAnalysisArtifactUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_FAILURE_ANALYSIS_ARTIFACT:
      return getUsedFailureAnalysisArtifact();

    case USED_FAILURE_ANALYSIS_ARTIFACT_TYPE:
      return getUsedFailureAnalysisArtifactType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_FAILURE_ANALYSIS_ARTIFACT:
      return isSetUsedFailureAnalysisArtifact();
    case USED_FAILURE_ANALYSIS_ARTIFACT_TYPE:
      return isSetUsedFailureAnalysisArtifactType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractFailureAnalysisArtifact)
      return this.equals((TDDIAbstractFailureAnalysisArtifact)that);
    return false;
  }

  public boolean equals(TDDIAbstractFailureAnalysisArtifact that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedFailureAnalysisArtifact = true && this.isSetUsedFailureAnalysisArtifact();
    boolean that_present_UsedFailureAnalysisArtifact = true && that.isSetUsedFailureAnalysisArtifact();
    if (this_present_UsedFailureAnalysisArtifact || that_present_UsedFailureAnalysisArtifact) {
      if (!(this_present_UsedFailureAnalysisArtifact && that_present_UsedFailureAnalysisArtifact))
        return false;
      if (!this.UsedFailureAnalysisArtifact.equals(that.UsedFailureAnalysisArtifact))
        return false;
    }

    boolean this_present_UsedFailureAnalysisArtifactType = true && this.isSetUsedFailureAnalysisArtifactType();
    boolean that_present_UsedFailureAnalysisArtifactType = true && that.isSetUsedFailureAnalysisArtifactType();
    if (this_present_UsedFailureAnalysisArtifactType || that_present_UsedFailureAnalysisArtifactType) {
      if (!(this_present_UsedFailureAnalysisArtifactType && that_present_UsedFailureAnalysisArtifactType))
        return false;
      if (!this.UsedFailureAnalysisArtifactType.equals(that.UsedFailureAnalysisArtifactType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedFailureAnalysisArtifact()) ? 131071 : 524287);
    if (isSetUsedFailureAnalysisArtifact())
      hashCode = hashCode * 8191 + UsedFailureAnalysisArtifact.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedFailureAnalysisArtifactType()) ? 131071 : 524287);
    if (isSetUsedFailureAnalysisArtifactType())
      hashCode = hashCode * 8191 + UsedFailureAnalysisArtifactType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractFailureAnalysisArtifact other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedFailureAnalysisArtifact()).compareTo(other.isSetUsedFailureAnalysisArtifact());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedFailureAnalysisArtifact()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedFailureAnalysisArtifact, other.UsedFailureAnalysisArtifact);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedFailureAnalysisArtifactType()).compareTo(other.isSetUsedFailureAnalysisArtifactType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedFailureAnalysisArtifactType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedFailureAnalysisArtifactType, other.UsedFailureAnalysisArtifactType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractFailureAnalysisArtifact(");
    boolean first = true;

    sb.append("UsedFailureAnalysisArtifact:");
    if (this.UsedFailureAnalysisArtifact == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedFailureAnalysisArtifact);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedFailureAnalysisArtifactType:");
    if (this.UsedFailureAnalysisArtifactType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedFailureAnalysisArtifactType);
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

  private static class TDDIAbstractFailureAnalysisArtifactStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractFailureAnalysisArtifactStandardScheme getScheme() {
      return new TDDIAbstractFailureAnalysisArtifactStandardScheme();
    }
  }

  private static class TDDIAbstractFailureAnalysisArtifactStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractFailureAnalysisArtifact> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractFailureAnalysisArtifact struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_FAILURE_ANALYSIS_ARTIFACT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedFailureAnalysisArtifact = new TDDIFailureAnalysisArtifactUnion();
              struct.UsedFailureAnalysisArtifact.read(iprot);
              struct.setUsedFailureAnalysisArtifactIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_FAILURE_ANALYSIS_ARTIFACT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedFailureAnalysisArtifactType = thriftContract.TDDIFailureAnalysisArtifactUnionType.findByValue(iprot.readI32());
              struct.setUsedFailureAnalysisArtifactTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractFailureAnalysisArtifact struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedFailureAnalysisArtifact != null) {
        oprot.writeFieldBegin(USED_FAILURE_ANALYSIS_ARTIFACT_FIELD_DESC);
        struct.UsedFailureAnalysisArtifact.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedFailureAnalysisArtifactType != null) {
        oprot.writeFieldBegin(USED_FAILURE_ANALYSIS_ARTIFACT_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedFailureAnalysisArtifactType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractFailureAnalysisArtifactTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractFailureAnalysisArtifactTupleScheme getScheme() {
      return new TDDIAbstractFailureAnalysisArtifactTupleScheme();
    }
  }

  private static class TDDIAbstractFailureAnalysisArtifactTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractFailureAnalysisArtifact> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractFailureAnalysisArtifact struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedFailureAnalysisArtifact()) {
        optionals.set(0);
      }
      if (struct.isSetUsedFailureAnalysisArtifactType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedFailureAnalysisArtifact()) {
        struct.UsedFailureAnalysisArtifact.write(oprot);
      }
      if (struct.isSetUsedFailureAnalysisArtifactType()) {
        oprot.writeI32(struct.UsedFailureAnalysisArtifactType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractFailureAnalysisArtifact struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedFailureAnalysisArtifact = new TDDIFailureAnalysisArtifactUnion();
        struct.UsedFailureAnalysisArtifact.read(iprot);
        struct.setUsedFailureAnalysisArtifactIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedFailureAnalysisArtifactType = thriftContract.TDDIFailureAnalysisArtifactUnionType.findByValue(iprot.readI32());
        struct.setUsedFailureAnalysisArtifactTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

