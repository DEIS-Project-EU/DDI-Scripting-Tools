/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-11-04")
public class TDDIAbstractAssertedRelationship implements org.apache.thrift.TBase<TDDIAbstractAssertedRelationship, TDDIAbstractAssertedRelationship._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractAssertedRelationship> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractAssertedRelationship");

  private static final org.apache.thrift.protocol.TField USED_ASSERTED_RELATIONSHIP_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedAssertedRelationship", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_ASSERTED_RELATIONSHIP_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedAssertedRelationshipType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractAssertedRelationshipStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractAssertedRelationshipTupleSchemeFactory();

  public TDDIAssertedRelationshipUnion UsedAssertedRelationship; // required
  /**
   * 
   * @see TDDIAssertedRelationshipUnionType
   */
  public TDDIAssertedRelationshipUnionType UsedAssertedRelationshipType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_ASSERTED_RELATIONSHIP((short)1, "UsedAssertedRelationship"),
    /**
     * 
     * @see TDDIAssertedRelationshipUnionType
     */
    USED_ASSERTED_RELATIONSHIP_TYPE((short)2, "UsedAssertedRelationshipType");

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
        case 1: // USED_ASSERTED_RELATIONSHIP
          return USED_ASSERTED_RELATIONSHIP;
        case 2: // USED_ASSERTED_RELATIONSHIP_TYPE
          return USED_ASSERTED_RELATIONSHIP_TYPE;
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
    tmpMap.put(_Fields.USED_ASSERTED_RELATIONSHIP, new org.apache.thrift.meta_data.FieldMetaData("UsedAssertedRelationship", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIAssertedRelationshipUnion.class)));
    tmpMap.put(_Fields.USED_ASSERTED_RELATIONSHIP_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedAssertedRelationshipType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDIAssertedRelationshipUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractAssertedRelationship.class, metaDataMap);
  }

  public TDDIAbstractAssertedRelationship() {
  }

  public TDDIAbstractAssertedRelationship(
    TDDIAssertedRelationshipUnion UsedAssertedRelationship,
    TDDIAssertedRelationshipUnionType UsedAssertedRelationshipType)
  {
    this();
    this.UsedAssertedRelationship = UsedAssertedRelationship;
    this.UsedAssertedRelationshipType = UsedAssertedRelationshipType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractAssertedRelationship(TDDIAbstractAssertedRelationship other) {
    if (other.isSetUsedAssertedRelationship()) {
      this.UsedAssertedRelationship = new TDDIAssertedRelationshipUnion(other.UsedAssertedRelationship);
    }
    if (other.isSetUsedAssertedRelationshipType()) {
      this.UsedAssertedRelationshipType = other.UsedAssertedRelationshipType;
    }
  }

  public TDDIAbstractAssertedRelationship deepCopy() {
    return new TDDIAbstractAssertedRelationship(this);
  }

  @Override
  public void clear() {
    this.UsedAssertedRelationship = null;
    this.UsedAssertedRelationshipType = null;
  }

  public TDDIAssertedRelationshipUnion getUsedAssertedRelationship() {
    return this.UsedAssertedRelationship;
  }

  public TDDIAbstractAssertedRelationship setUsedAssertedRelationship(TDDIAssertedRelationshipUnion UsedAssertedRelationship) {
    this.UsedAssertedRelationship = UsedAssertedRelationship;
    return this;
  }

  public void unsetUsedAssertedRelationship() {
    this.UsedAssertedRelationship = null;
  }

  /** Returns true if field UsedAssertedRelationship is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedAssertedRelationship() {
    return this.UsedAssertedRelationship != null;
  }

  public void setUsedAssertedRelationshipIsSet(boolean value) {
    if (!value) {
      this.UsedAssertedRelationship = null;
    }
  }

  /**
   * 
   * @see TDDIAssertedRelationshipUnionType
   */
  public TDDIAssertedRelationshipUnionType getUsedAssertedRelationshipType() {
    return this.UsedAssertedRelationshipType;
  }

  /**
   * 
   * @see TDDIAssertedRelationshipUnionType
   */
  public TDDIAbstractAssertedRelationship setUsedAssertedRelationshipType(TDDIAssertedRelationshipUnionType UsedAssertedRelationshipType) {
    this.UsedAssertedRelationshipType = UsedAssertedRelationshipType;
    return this;
  }

  public void unsetUsedAssertedRelationshipType() {
    this.UsedAssertedRelationshipType = null;
  }

  /** Returns true if field UsedAssertedRelationshipType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedAssertedRelationshipType() {
    return this.UsedAssertedRelationshipType != null;
  }

  public void setUsedAssertedRelationshipTypeIsSet(boolean value) {
    if (!value) {
      this.UsedAssertedRelationshipType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_ASSERTED_RELATIONSHIP:
      if (value == null) {
        unsetUsedAssertedRelationship();
      } else {
        setUsedAssertedRelationship((TDDIAssertedRelationshipUnion)value);
      }
      break;

    case USED_ASSERTED_RELATIONSHIP_TYPE:
      if (value == null) {
        unsetUsedAssertedRelationshipType();
      } else {
        setUsedAssertedRelationshipType((TDDIAssertedRelationshipUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_ASSERTED_RELATIONSHIP:
      return getUsedAssertedRelationship();

    case USED_ASSERTED_RELATIONSHIP_TYPE:
      return getUsedAssertedRelationshipType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_ASSERTED_RELATIONSHIP:
      return isSetUsedAssertedRelationship();
    case USED_ASSERTED_RELATIONSHIP_TYPE:
      return isSetUsedAssertedRelationshipType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractAssertedRelationship)
      return this.equals((TDDIAbstractAssertedRelationship)that);
    return false;
  }

  public boolean equals(TDDIAbstractAssertedRelationship that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedAssertedRelationship = true && this.isSetUsedAssertedRelationship();
    boolean that_present_UsedAssertedRelationship = true && that.isSetUsedAssertedRelationship();
    if (this_present_UsedAssertedRelationship || that_present_UsedAssertedRelationship) {
      if (!(this_present_UsedAssertedRelationship && that_present_UsedAssertedRelationship))
        return false;
      if (!this.UsedAssertedRelationship.equals(that.UsedAssertedRelationship))
        return false;
    }

    boolean this_present_UsedAssertedRelationshipType = true && this.isSetUsedAssertedRelationshipType();
    boolean that_present_UsedAssertedRelationshipType = true && that.isSetUsedAssertedRelationshipType();
    if (this_present_UsedAssertedRelationshipType || that_present_UsedAssertedRelationshipType) {
      if (!(this_present_UsedAssertedRelationshipType && that_present_UsedAssertedRelationshipType))
        return false;
      if (!this.UsedAssertedRelationshipType.equals(that.UsedAssertedRelationshipType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedAssertedRelationship()) ? 131071 : 524287);
    if (isSetUsedAssertedRelationship())
      hashCode = hashCode * 8191 + UsedAssertedRelationship.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedAssertedRelationshipType()) ? 131071 : 524287);
    if (isSetUsedAssertedRelationshipType())
      hashCode = hashCode * 8191 + UsedAssertedRelationshipType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractAssertedRelationship other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedAssertedRelationship()).compareTo(other.isSetUsedAssertedRelationship());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedAssertedRelationship()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedAssertedRelationship, other.UsedAssertedRelationship);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedAssertedRelationshipType()).compareTo(other.isSetUsedAssertedRelationshipType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedAssertedRelationshipType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedAssertedRelationshipType, other.UsedAssertedRelationshipType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractAssertedRelationship(");
    boolean first = true;

    sb.append("UsedAssertedRelationship:");
    if (this.UsedAssertedRelationship == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedAssertedRelationship);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedAssertedRelationshipType:");
    if (this.UsedAssertedRelationshipType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedAssertedRelationshipType);
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

  private static class TDDIAbstractAssertedRelationshipStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractAssertedRelationshipStandardScheme getScheme() {
      return new TDDIAbstractAssertedRelationshipStandardScheme();
    }
  }

  private static class TDDIAbstractAssertedRelationshipStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractAssertedRelationship> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractAssertedRelationship struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_ASSERTED_RELATIONSHIP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedAssertedRelationship = new TDDIAssertedRelationshipUnion();
              struct.UsedAssertedRelationship.read(iprot);
              struct.setUsedAssertedRelationshipIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_ASSERTED_RELATIONSHIP_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedAssertedRelationshipType = thriftContract.TDDIAssertedRelationshipUnionType.findByValue(iprot.readI32());
              struct.setUsedAssertedRelationshipTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractAssertedRelationship struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedAssertedRelationship != null) {
        oprot.writeFieldBegin(USED_ASSERTED_RELATIONSHIP_FIELD_DESC);
        struct.UsedAssertedRelationship.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedAssertedRelationshipType != null) {
        oprot.writeFieldBegin(USED_ASSERTED_RELATIONSHIP_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedAssertedRelationshipType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractAssertedRelationshipTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractAssertedRelationshipTupleScheme getScheme() {
      return new TDDIAbstractAssertedRelationshipTupleScheme();
    }
  }

  private static class TDDIAbstractAssertedRelationshipTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractAssertedRelationship> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractAssertedRelationship struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedAssertedRelationship()) {
        optionals.set(0);
      }
      if (struct.isSetUsedAssertedRelationshipType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedAssertedRelationship()) {
        struct.UsedAssertedRelationship.write(oprot);
      }
      if (struct.isSetUsedAssertedRelationshipType()) {
        oprot.writeI32(struct.UsedAssertedRelationshipType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractAssertedRelationship struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedAssertedRelationship = new TDDIAssertedRelationshipUnion();
        struct.UsedAssertedRelationship.read(iprot);
        struct.setUsedAssertedRelationshipIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedAssertedRelationshipType = thriftContract.TDDIAssertedRelationshipUnionType.findByValue(iprot.readI32());
        struct.setUsedAssertedRelationshipTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

