/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-08-13")
public class TDDIAbstractRequirementArtifact implements org.apache.thrift.TBase<TDDIAbstractRequirementArtifact, TDDIAbstractRequirementArtifact._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractRequirementArtifact> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractRequirementArtifact");

  private static final org.apache.thrift.protocol.TField USED_REQUIREMENT_ARTIFACT_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedRequirementArtifact", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_REQUIREMENT_ARTIFACT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedRequirementArtifactType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractRequirementArtifactStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractRequirementArtifactTupleSchemeFactory();

  public TDDIRequirementArtifactUnion UsedRequirementArtifact; // required
  /**
   * 
   * @see TDDIRequirementArtifactUnionType
   */
  public TDDIRequirementArtifactUnionType UsedRequirementArtifactType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_REQUIREMENT_ARTIFACT((short)1, "UsedRequirementArtifact"),
    /**
     * 
     * @see TDDIRequirementArtifactUnionType
     */
    USED_REQUIREMENT_ARTIFACT_TYPE((short)2, "UsedRequirementArtifactType");

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
        case 1: // USED_REQUIREMENT_ARTIFACT
          return USED_REQUIREMENT_ARTIFACT;
        case 2: // USED_REQUIREMENT_ARTIFACT_TYPE
          return USED_REQUIREMENT_ARTIFACT_TYPE;
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
    tmpMap.put(_Fields.USED_REQUIREMENT_ARTIFACT, new org.apache.thrift.meta_data.FieldMetaData("UsedRequirementArtifact", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIRequirementArtifactUnion.class)));
    tmpMap.put(_Fields.USED_REQUIREMENT_ARTIFACT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedRequirementArtifactType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDIRequirementArtifactUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractRequirementArtifact.class, metaDataMap);
  }

  public TDDIAbstractRequirementArtifact() {
  }

  public TDDIAbstractRequirementArtifact(
    TDDIRequirementArtifactUnion UsedRequirementArtifact,
    TDDIRequirementArtifactUnionType UsedRequirementArtifactType)
  {
    this();
    this.UsedRequirementArtifact = UsedRequirementArtifact;
    this.UsedRequirementArtifactType = UsedRequirementArtifactType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractRequirementArtifact(TDDIAbstractRequirementArtifact other) {
    if (other.isSetUsedRequirementArtifact()) {
      this.UsedRequirementArtifact = new TDDIRequirementArtifactUnion(other.UsedRequirementArtifact);
    }
    if (other.isSetUsedRequirementArtifactType()) {
      this.UsedRequirementArtifactType = other.UsedRequirementArtifactType;
    }
  }

  public TDDIAbstractRequirementArtifact deepCopy() {
    return new TDDIAbstractRequirementArtifact(this);
  }

  @Override
  public void clear() {
    this.UsedRequirementArtifact = null;
    this.UsedRequirementArtifactType = null;
  }

  public TDDIRequirementArtifactUnion getUsedRequirementArtifact() {
    return this.UsedRequirementArtifact;
  }

  public TDDIAbstractRequirementArtifact setUsedRequirementArtifact(TDDIRequirementArtifactUnion UsedRequirementArtifact) {
    this.UsedRequirementArtifact = UsedRequirementArtifact;
    return this;
  }

  public void unsetUsedRequirementArtifact() {
    this.UsedRequirementArtifact = null;
  }

  /** Returns true if field UsedRequirementArtifact is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedRequirementArtifact() {
    return this.UsedRequirementArtifact != null;
  }

  public void setUsedRequirementArtifactIsSet(boolean value) {
    if (!value) {
      this.UsedRequirementArtifact = null;
    }
  }

  /**
   * 
   * @see TDDIRequirementArtifactUnionType
   */
  public TDDIRequirementArtifactUnionType getUsedRequirementArtifactType() {
    return this.UsedRequirementArtifactType;
  }

  /**
   * 
   * @see TDDIRequirementArtifactUnionType
   */
  public TDDIAbstractRequirementArtifact setUsedRequirementArtifactType(TDDIRequirementArtifactUnionType UsedRequirementArtifactType) {
    this.UsedRequirementArtifactType = UsedRequirementArtifactType;
    return this;
  }

  public void unsetUsedRequirementArtifactType() {
    this.UsedRequirementArtifactType = null;
  }

  /** Returns true if field UsedRequirementArtifactType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedRequirementArtifactType() {
    return this.UsedRequirementArtifactType != null;
  }

  public void setUsedRequirementArtifactTypeIsSet(boolean value) {
    if (!value) {
      this.UsedRequirementArtifactType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_REQUIREMENT_ARTIFACT:
      if (value == null) {
        unsetUsedRequirementArtifact();
      } else {
        setUsedRequirementArtifact((TDDIRequirementArtifactUnion)value);
      }
      break;

    case USED_REQUIREMENT_ARTIFACT_TYPE:
      if (value == null) {
        unsetUsedRequirementArtifactType();
      } else {
        setUsedRequirementArtifactType((TDDIRequirementArtifactUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_REQUIREMENT_ARTIFACT:
      return getUsedRequirementArtifact();

    case USED_REQUIREMENT_ARTIFACT_TYPE:
      return getUsedRequirementArtifactType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_REQUIREMENT_ARTIFACT:
      return isSetUsedRequirementArtifact();
    case USED_REQUIREMENT_ARTIFACT_TYPE:
      return isSetUsedRequirementArtifactType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractRequirementArtifact)
      return this.equals((TDDIAbstractRequirementArtifact)that);
    return false;
  }

  public boolean equals(TDDIAbstractRequirementArtifact that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedRequirementArtifact = true && this.isSetUsedRequirementArtifact();
    boolean that_present_UsedRequirementArtifact = true && that.isSetUsedRequirementArtifact();
    if (this_present_UsedRequirementArtifact || that_present_UsedRequirementArtifact) {
      if (!(this_present_UsedRequirementArtifact && that_present_UsedRequirementArtifact))
        return false;
      if (!this.UsedRequirementArtifact.equals(that.UsedRequirementArtifact))
        return false;
    }

    boolean this_present_UsedRequirementArtifactType = true && this.isSetUsedRequirementArtifactType();
    boolean that_present_UsedRequirementArtifactType = true && that.isSetUsedRequirementArtifactType();
    if (this_present_UsedRequirementArtifactType || that_present_UsedRequirementArtifactType) {
      if (!(this_present_UsedRequirementArtifactType && that_present_UsedRequirementArtifactType))
        return false;
      if (!this.UsedRequirementArtifactType.equals(that.UsedRequirementArtifactType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedRequirementArtifact()) ? 131071 : 524287);
    if (isSetUsedRequirementArtifact())
      hashCode = hashCode * 8191 + UsedRequirementArtifact.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedRequirementArtifactType()) ? 131071 : 524287);
    if (isSetUsedRequirementArtifactType())
      hashCode = hashCode * 8191 + UsedRequirementArtifactType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractRequirementArtifact other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedRequirementArtifact()).compareTo(other.isSetUsedRequirementArtifact());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedRequirementArtifact()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedRequirementArtifact, other.UsedRequirementArtifact);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedRequirementArtifactType()).compareTo(other.isSetUsedRequirementArtifactType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedRequirementArtifactType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedRequirementArtifactType, other.UsedRequirementArtifactType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractRequirementArtifact(");
    boolean first = true;

    sb.append("UsedRequirementArtifact:");
    if (this.UsedRequirementArtifact == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedRequirementArtifact);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedRequirementArtifactType:");
    if (this.UsedRequirementArtifactType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedRequirementArtifactType);
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

  private static class TDDIAbstractRequirementArtifactStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractRequirementArtifactStandardScheme getScheme() {
      return new TDDIAbstractRequirementArtifactStandardScheme();
    }
  }

  private static class TDDIAbstractRequirementArtifactStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractRequirementArtifact> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractRequirementArtifact struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_REQUIREMENT_ARTIFACT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedRequirementArtifact = new TDDIRequirementArtifactUnion();
              struct.UsedRequirementArtifact.read(iprot);
              struct.setUsedRequirementArtifactIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_REQUIREMENT_ARTIFACT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedRequirementArtifactType = thriftContract.TDDIRequirementArtifactUnionType.findByValue(iprot.readI32());
              struct.setUsedRequirementArtifactTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractRequirementArtifact struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedRequirementArtifact != null) {
        oprot.writeFieldBegin(USED_REQUIREMENT_ARTIFACT_FIELD_DESC);
        struct.UsedRequirementArtifact.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedRequirementArtifactType != null) {
        oprot.writeFieldBegin(USED_REQUIREMENT_ARTIFACT_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedRequirementArtifactType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractRequirementArtifactTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractRequirementArtifactTupleScheme getScheme() {
      return new TDDIAbstractRequirementArtifactTupleScheme();
    }
  }

  private static class TDDIAbstractRequirementArtifactTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractRequirementArtifact> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractRequirementArtifact struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedRequirementArtifact()) {
        optionals.set(0);
      }
      if (struct.isSetUsedRequirementArtifactType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedRequirementArtifact()) {
        struct.UsedRequirementArtifact.write(oprot);
      }
      if (struct.isSetUsedRequirementArtifactType()) {
        oprot.writeI32(struct.UsedRequirementArtifactType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractRequirementArtifact struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedRequirementArtifact = new TDDIRequirementArtifactUnion();
        struct.UsedRequirementArtifact.read(iprot);
        struct.setUsedRequirementArtifactIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedRequirementArtifactType = thriftContract.TDDIRequirementArtifactUnionType.findByValue(iprot.readI32());
        struct.setUsedRequirementArtifactTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

