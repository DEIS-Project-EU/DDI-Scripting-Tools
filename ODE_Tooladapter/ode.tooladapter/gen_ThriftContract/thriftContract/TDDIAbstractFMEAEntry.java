/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-11-04")
public class TDDIAbstractFMEAEntry implements org.apache.thrift.TBase<TDDIAbstractFMEAEntry, TDDIAbstractFMEAEntry._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractFMEAEntry> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractFMEAEntry");

  private static final org.apache.thrift.protocol.TField USED_FMEAENTRY_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedFMEAEntry", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_FMEAENTRY_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedFMEAEntryType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractFMEAEntryStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractFMEAEntryTupleSchemeFactory();

  public TDDIFMEAEntryUnion UsedFMEAEntry; // required
  /**
   * 
   * @see TDDIFMEAEntryUnionType
   */
  public TDDIFMEAEntryUnionType UsedFMEAEntryType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_FMEAENTRY((short)1, "UsedFMEAEntry"),
    /**
     * 
     * @see TDDIFMEAEntryUnionType
     */
    USED_FMEAENTRY_TYPE((short)2, "UsedFMEAEntryType");

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
        case 1: // USED_FMEAENTRY
          return USED_FMEAENTRY;
        case 2: // USED_FMEAENTRY_TYPE
          return USED_FMEAENTRY_TYPE;
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
    tmpMap.put(_Fields.USED_FMEAENTRY, new org.apache.thrift.meta_data.FieldMetaData("UsedFMEAEntry", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIFMEAEntryUnion.class)));
    tmpMap.put(_Fields.USED_FMEAENTRY_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedFMEAEntryType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDIFMEAEntryUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractFMEAEntry.class, metaDataMap);
  }

  public TDDIAbstractFMEAEntry() {
  }

  public TDDIAbstractFMEAEntry(
    TDDIFMEAEntryUnion UsedFMEAEntry,
    TDDIFMEAEntryUnionType UsedFMEAEntryType)
  {
    this();
    this.UsedFMEAEntry = UsedFMEAEntry;
    this.UsedFMEAEntryType = UsedFMEAEntryType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractFMEAEntry(TDDIAbstractFMEAEntry other) {
    if (other.isSetUsedFMEAEntry()) {
      this.UsedFMEAEntry = new TDDIFMEAEntryUnion(other.UsedFMEAEntry);
    }
    if (other.isSetUsedFMEAEntryType()) {
      this.UsedFMEAEntryType = other.UsedFMEAEntryType;
    }
  }

  public TDDIAbstractFMEAEntry deepCopy() {
    return new TDDIAbstractFMEAEntry(this);
  }

  @Override
  public void clear() {
    this.UsedFMEAEntry = null;
    this.UsedFMEAEntryType = null;
  }

  public TDDIFMEAEntryUnion getUsedFMEAEntry() {
    return this.UsedFMEAEntry;
  }

  public TDDIAbstractFMEAEntry setUsedFMEAEntry(TDDIFMEAEntryUnion UsedFMEAEntry) {
    this.UsedFMEAEntry = UsedFMEAEntry;
    return this;
  }

  public void unsetUsedFMEAEntry() {
    this.UsedFMEAEntry = null;
  }

  /** Returns true if field UsedFMEAEntry is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedFMEAEntry() {
    return this.UsedFMEAEntry != null;
  }

  public void setUsedFMEAEntryIsSet(boolean value) {
    if (!value) {
      this.UsedFMEAEntry = null;
    }
  }

  /**
   * 
   * @see TDDIFMEAEntryUnionType
   */
  public TDDIFMEAEntryUnionType getUsedFMEAEntryType() {
    return this.UsedFMEAEntryType;
  }

  /**
   * 
   * @see TDDIFMEAEntryUnionType
   */
  public TDDIAbstractFMEAEntry setUsedFMEAEntryType(TDDIFMEAEntryUnionType UsedFMEAEntryType) {
    this.UsedFMEAEntryType = UsedFMEAEntryType;
    return this;
  }

  public void unsetUsedFMEAEntryType() {
    this.UsedFMEAEntryType = null;
  }

  /** Returns true if field UsedFMEAEntryType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedFMEAEntryType() {
    return this.UsedFMEAEntryType != null;
  }

  public void setUsedFMEAEntryTypeIsSet(boolean value) {
    if (!value) {
      this.UsedFMEAEntryType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_FMEAENTRY:
      if (value == null) {
        unsetUsedFMEAEntry();
      } else {
        setUsedFMEAEntry((TDDIFMEAEntryUnion)value);
      }
      break;

    case USED_FMEAENTRY_TYPE:
      if (value == null) {
        unsetUsedFMEAEntryType();
      } else {
        setUsedFMEAEntryType((TDDIFMEAEntryUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_FMEAENTRY:
      return getUsedFMEAEntry();

    case USED_FMEAENTRY_TYPE:
      return getUsedFMEAEntryType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_FMEAENTRY:
      return isSetUsedFMEAEntry();
    case USED_FMEAENTRY_TYPE:
      return isSetUsedFMEAEntryType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractFMEAEntry)
      return this.equals((TDDIAbstractFMEAEntry)that);
    return false;
  }

  public boolean equals(TDDIAbstractFMEAEntry that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedFMEAEntry = true && this.isSetUsedFMEAEntry();
    boolean that_present_UsedFMEAEntry = true && that.isSetUsedFMEAEntry();
    if (this_present_UsedFMEAEntry || that_present_UsedFMEAEntry) {
      if (!(this_present_UsedFMEAEntry && that_present_UsedFMEAEntry))
        return false;
      if (!this.UsedFMEAEntry.equals(that.UsedFMEAEntry))
        return false;
    }

    boolean this_present_UsedFMEAEntryType = true && this.isSetUsedFMEAEntryType();
    boolean that_present_UsedFMEAEntryType = true && that.isSetUsedFMEAEntryType();
    if (this_present_UsedFMEAEntryType || that_present_UsedFMEAEntryType) {
      if (!(this_present_UsedFMEAEntryType && that_present_UsedFMEAEntryType))
        return false;
      if (!this.UsedFMEAEntryType.equals(that.UsedFMEAEntryType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedFMEAEntry()) ? 131071 : 524287);
    if (isSetUsedFMEAEntry())
      hashCode = hashCode * 8191 + UsedFMEAEntry.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedFMEAEntryType()) ? 131071 : 524287);
    if (isSetUsedFMEAEntryType())
      hashCode = hashCode * 8191 + UsedFMEAEntryType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractFMEAEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedFMEAEntry()).compareTo(other.isSetUsedFMEAEntry());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedFMEAEntry()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedFMEAEntry, other.UsedFMEAEntry);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedFMEAEntryType()).compareTo(other.isSetUsedFMEAEntryType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedFMEAEntryType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedFMEAEntryType, other.UsedFMEAEntryType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractFMEAEntry(");
    boolean first = true;

    sb.append("UsedFMEAEntry:");
    if (this.UsedFMEAEntry == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedFMEAEntry);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedFMEAEntryType:");
    if (this.UsedFMEAEntryType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedFMEAEntryType);
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

  private static class TDDIAbstractFMEAEntryStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractFMEAEntryStandardScheme getScheme() {
      return new TDDIAbstractFMEAEntryStandardScheme();
    }
  }

  private static class TDDIAbstractFMEAEntryStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractFMEAEntry> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractFMEAEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_FMEAENTRY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedFMEAEntry = new TDDIFMEAEntryUnion();
              struct.UsedFMEAEntry.read(iprot);
              struct.setUsedFMEAEntryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_FMEAENTRY_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedFMEAEntryType = thriftContract.TDDIFMEAEntryUnionType.findByValue(iprot.readI32());
              struct.setUsedFMEAEntryTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractFMEAEntry struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedFMEAEntry != null) {
        oprot.writeFieldBegin(USED_FMEAENTRY_FIELD_DESC);
        struct.UsedFMEAEntry.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedFMEAEntryType != null) {
        oprot.writeFieldBegin(USED_FMEAENTRY_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedFMEAEntryType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractFMEAEntryTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractFMEAEntryTupleScheme getScheme() {
      return new TDDIAbstractFMEAEntryTupleScheme();
    }
  }

  private static class TDDIAbstractFMEAEntryTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractFMEAEntry> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractFMEAEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedFMEAEntry()) {
        optionals.set(0);
      }
      if (struct.isSetUsedFMEAEntryType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedFMEAEntry()) {
        struct.UsedFMEAEntry.write(oprot);
      }
      if (struct.isSetUsedFMEAEntryType()) {
        oprot.writeI32(struct.UsedFMEAEntryType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractFMEAEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedFMEAEntry = new TDDIFMEAEntryUnion();
        struct.UsedFMEAEntry.read(iprot);
        struct.setUsedFMEAEntryIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedFMEAEntryType = thriftContract.TDDIFMEAEntryUnionType.findByValue(iprot.readI32());
        struct.setUsedFMEAEntryTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

