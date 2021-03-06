/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-08-13")
public class TDDIAbstractDesignArtifact implements org.apache.thrift.TBase<TDDIAbstractDesignArtifact, TDDIAbstractDesignArtifact._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractDesignArtifact> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractDesignArtifact");

  private static final org.apache.thrift.protocol.TField USED_DESIGN_ARTIFACT_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedDesignArtifact", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_DESIGN_ARTIFACT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedDesignArtifactType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractDesignArtifactStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractDesignArtifactTupleSchemeFactory();

  public TDDIDesignArtifactUnion UsedDesignArtifact; // required
  /**
   * 
   * @see TDDIDesignArtifactUnionType
   */
  public TDDIDesignArtifactUnionType UsedDesignArtifactType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_DESIGN_ARTIFACT((short)1, "UsedDesignArtifact"),
    /**
     * 
     * @see TDDIDesignArtifactUnionType
     */
    USED_DESIGN_ARTIFACT_TYPE((short)2, "UsedDesignArtifactType");

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
        case 1: // USED_DESIGN_ARTIFACT
          return USED_DESIGN_ARTIFACT;
        case 2: // USED_DESIGN_ARTIFACT_TYPE
          return USED_DESIGN_ARTIFACT_TYPE;
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
    tmpMap.put(_Fields.USED_DESIGN_ARTIFACT, new org.apache.thrift.meta_data.FieldMetaData("UsedDesignArtifact", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIDesignArtifactUnion.class)));
    tmpMap.put(_Fields.USED_DESIGN_ARTIFACT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedDesignArtifactType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDIDesignArtifactUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractDesignArtifact.class, metaDataMap);
  }

  public TDDIAbstractDesignArtifact() {
  }

  public TDDIAbstractDesignArtifact(
    TDDIDesignArtifactUnion UsedDesignArtifact,
    TDDIDesignArtifactUnionType UsedDesignArtifactType)
  {
    this();
    this.UsedDesignArtifact = UsedDesignArtifact;
    this.UsedDesignArtifactType = UsedDesignArtifactType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractDesignArtifact(TDDIAbstractDesignArtifact other) {
    if (other.isSetUsedDesignArtifact()) {
      this.UsedDesignArtifact = new TDDIDesignArtifactUnion(other.UsedDesignArtifact);
    }
    if (other.isSetUsedDesignArtifactType()) {
      this.UsedDesignArtifactType = other.UsedDesignArtifactType;
    }
  }

  public TDDIAbstractDesignArtifact deepCopy() {
    return new TDDIAbstractDesignArtifact(this);
  }

  @Override
  public void clear() {
    this.UsedDesignArtifact = null;
    this.UsedDesignArtifactType = null;
  }

  public TDDIDesignArtifactUnion getUsedDesignArtifact() {
    return this.UsedDesignArtifact;
  }

  public TDDIAbstractDesignArtifact setUsedDesignArtifact(TDDIDesignArtifactUnion UsedDesignArtifact) {
    this.UsedDesignArtifact = UsedDesignArtifact;
    return this;
  }

  public void unsetUsedDesignArtifact() {
    this.UsedDesignArtifact = null;
  }

  /** Returns true if field UsedDesignArtifact is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedDesignArtifact() {
    return this.UsedDesignArtifact != null;
  }

  public void setUsedDesignArtifactIsSet(boolean value) {
    if (!value) {
      this.UsedDesignArtifact = null;
    }
  }

  /**
   * 
   * @see TDDIDesignArtifactUnionType
   */
  public TDDIDesignArtifactUnionType getUsedDesignArtifactType() {
    return this.UsedDesignArtifactType;
  }

  /**
   * 
   * @see TDDIDesignArtifactUnionType
   */
  public TDDIAbstractDesignArtifact setUsedDesignArtifactType(TDDIDesignArtifactUnionType UsedDesignArtifactType) {
    this.UsedDesignArtifactType = UsedDesignArtifactType;
    return this;
  }

  public void unsetUsedDesignArtifactType() {
    this.UsedDesignArtifactType = null;
  }

  /** Returns true if field UsedDesignArtifactType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedDesignArtifactType() {
    return this.UsedDesignArtifactType != null;
  }

  public void setUsedDesignArtifactTypeIsSet(boolean value) {
    if (!value) {
      this.UsedDesignArtifactType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_DESIGN_ARTIFACT:
      if (value == null) {
        unsetUsedDesignArtifact();
      } else {
        setUsedDesignArtifact((TDDIDesignArtifactUnion)value);
      }
      break;

    case USED_DESIGN_ARTIFACT_TYPE:
      if (value == null) {
        unsetUsedDesignArtifactType();
      } else {
        setUsedDesignArtifactType((TDDIDesignArtifactUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_DESIGN_ARTIFACT:
      return getUsedDesignArtifact();

    case USED_DESIGN_ARTIFACT_TYPE:
      return getUsedDesignArtifactType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_DESIGN_ARTIFACT:
      return isSetUsedDesignArtifact();
    case USED_DESIGN_ARTIFACT_TYPE:
      return isSetUsedDesignArtifactType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractDesignArtifact)
      return this.equals((TDDIAbstractDesignArtifact)that);
    return false;
  }

  public boolean equals(TDDIAbstractDesignArtifact that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedDesignArtifact = true && this.isSetUsedDesignArtifact();
    boolean that_present_UsedDesignArtifact = true && that.isSetUsedDesignArtifact();
    if (this_present_UsedDesignArtifact || that_present_UsedDesignArtifact) {
      if (!(this_present_UsedDesignArtifact && that_present_UsedDesignArtifact))
        return false;
      if (!this.UsedDesignArtifact.equals(that.UsedDesignArtifact))
        return false;
    }

    boolean this_present_UsedDesignArtifactType = true && this.isSetUsedDesignArtifactType();
    boolean that_present_UsedDesignArtifactType = true && that.isSetUsedDesignArtifactType();
    if (this_present_UsedDesignArtifactType || that_present_UsedDesignArtifactType) {
      if (!(this_present_UsedDesignArtifactType && that_present_UsedDesignArtifactType))
        return false;
      if (!this.UsedDesignArtifactType.equals(that.UsedDesignArtifactType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedDesignArtifact()) ? 131071 : 524287);
    if (isSetUsedDesignArtifact())
      hashCode = hashCode * 8191 + UsedDesignArtifact.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedDesignArtifactType()) ? 131071 : 524287);
    if (isSetUsedDesignArtifactType())
      hashCode = hashCode * 8191 + UsedDesignArtifactType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractDesignArtifact other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedDesignArtifact()).compareTo(other.isSetUsedDesignArtifact());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedDesignArtifact()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedDesignArtifact, other.UsedDesignArtifact);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedDesignArtifactType()).compareTo(other.isSetUsedDesignArtifactType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedDesignArtifactType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedDesignArtifactType, other.UsedDesignArtifactType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractDesignArtifact(");
    boolean first = true;

    sb.append("UsedDesignArtifact:");
    if (this.UsedDesignArtifact == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedDesignArtifact);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedDesignArtifactType:");
    if (this.UsedDesignArtifactType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedDesignArtifactType);
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

  private static class TDDIAbstractDesignArtifactStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractDesignArtifactStandardScheme getScheme() {
      return new TDDIAbstractDesignArtifactStandardScheme();
    }
  }

  private static class TDDIAbstractDesignArtifactStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractDesignArtifact> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractDesignArtifact struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_DESIGN_ARTIFACT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedDesignArtifact = new TDDIDesignArtifactUnion();
              struct.UsedDesignArtifact.read(iprot);
              struct.setUsedDesignArtifactIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_DESIGN_ARTIFACT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedDesignArtifactType = thriftContract.TDDIDesignArtifactUnionType.findByValue(iprot.readI32());
              struct.setUsedDesignArtifactTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractDesignArtifact struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedDesignArtifact != null) {
        oprot.writeFieldBegin(USED_DESIGN_ARTIFACT_FIELD_DESC);
        struct.UsedDesignArtifact.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedDesignArtifactType != null) {
        oprot.writeFieldBegin(USED_DESIGN_ARTIFACT_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedDesignArtifactType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractDesignArtifactTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractDesignArtifactTupleScheme getScheme() {
      return new TDDIAbstractDesignArtifactTupleScheme();
    }
  }

  private static class TDDIAbstractDesignArtifactTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractDesignArtifact> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractDesignArtifact struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedDesignArtifact()) {
        optionals.set(0);
      }
      if (struct.isSetUsedDesignArtifactType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedDesignArtifact()) {
        struct.UsedDesignArtifact.write(oprot);
      }
      if (struct.isSetUsedDesignArtifactType()) {
        oprot.writeI32(struct.UsedDesignArtifactType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractDesignArtifact struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedDesignArtifact = new TDDIDesignArtifactUnion();
        struct.UsedDesignArtifact.read(iprot);
        struct.setUsedDesignArtifactIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedDesignArtifactType = thriftContract.TDDIDesignArtifactUnionType.findByValue(iprot.readI32());
        struct.setUsedDesignArtifactTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

