/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-01-14")
public class TDDIAbstractSystem implements org.apache.thrift.TBase<TDDIAbstractSystem, TDDIAbstractSystem._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractSystem> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractSystem");

  private static final org.apache.thrift.protocol.TField USED_SYSTEM_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedSystem", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_SYSTEM_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedSystemType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractSystemStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractSystemTupleSchemeFactory();

  public TDDISystemUnion UsedSystem; // required
  /**
   * 
   * @see TDDISystemUnionType
   */
  public TDDISystemUnionType UsedSystemType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_SYSTEM((short)1, "UsedSystem"),
    /**
     * 
     * @see TDDISystemUnionType
     */
    USED_SYSTEM_TYPE((short)2, "UsedSystemType");

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
        case 1: // USED_SYSTEM
          return USED_SYSTEM;
        case 2: // USED_SYSTEM_TYPE
          return USED_SYSTEM_TYPE;
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
    tmpMap.put(_Fields.USED_SYSTEM, new org.apache.thrift.meta_data.FieldMetaData("UsedSystem", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDISystemUnion.class)));
    tmpMap.put(_Fields.USED_SYSTEM_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedSystemType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDISystemUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractSystem.class, metaDataMap);
  }

  public TDDIAbstractSystem() {
  }

  public TDDIAbstractSystem(
    TDDISystemUnion UsedSystem,
    TDDISystemUnionType UsedSystemType)
  {
    this();
    this.UsedSystem = UsedSystem;
    this.UsedSystemType = UsedSystemType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractSystem(TDDIAbstractSystem other) {
    if (other.isSetUsedSystem()) {
      this.UsedSystem = new TDDISystemUnion(other.UsedSystem);
    }
    if (other.isSetUsedSystemType()) {
      this.UsedSystemType = other.UsedSystemType;
    }
  }

  public TDDIAbstractSystem deepCopy() {
    return new TDDIAbstractSystem(this);
  }

  @Override
  public void clear() {
    this.UsedSystem = null;
    this.UsedSystemType = null;
  }

  public TDDISystemUnion getUsedSystem() {
    return this.UsedSystem;
  }

  public TDDIAbstractSystem setUsedSystem(TDDISystemUnion UsedSystem) {
    this.UsedSystem = UsedSystem;
    return this;
  }

  public void unsetUsedSystem() {
    this.UsedSystem = null;
  }

  /** Returns true if field UsedSystem is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedSystem() {
    return this.UsedSystem != null;
  }

  public void setUsedSystemIsSet(boolean value) {
    if (!value) {
      this.UsedSystem = null;
    }
  }

  /**
   * 
   * @see TDDISystemUnionType
   */
  public TDDISystemUnionType getUsedSystemType() {
    return this.UsedSystemType;
  }

  /**
   * 
   * @see TDDISystemUnionType
   */
  public TDDIAbstractSystem setUsedSystemType(TDDISystemUnionType UsedSystemType) {
    this.UsedSystemType = UsedSystemType;
    return this;
  }

  public void unsetUsedSystemType() {
    this.UsedSystemType = null;
  }

  /** Returns true if field UsedSystemType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedSystemType() {
    return this.UsedSystemType != null;
  }

  public void setUsedSystemTypeIsSet(boolean value) {
    if (!value) {
      this.UsedSystemType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_SYSTEM:
      if (value == null) {
        unsetUsedSystem();
      } else {
        setUsedSystem((TDDISystemUnion)value);
      }
      break;

    case USED_SYSTEM_TYPE:
      if (value == null) {
        unsetUsedSystemType();
      } else {
        setUsedSystemType((TDDISystemUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_SYSTEM:
      return getUsedSystem();

    case USED_SYSTEM_TYPE:
      return getUsedSystemType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_SYSTEM:
      return isSetUsedSystem();
    case USED_SYSTEM_TYPE:
      return isSetUsedSystemType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractSystem)
      return this.equals((TDDIAbstractSystem)that);
    return false;
  }

  public boolean equals(TDDIAbstractSystem that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedSystem = true && this.isSetUsedSystem();
    boolean that_present_UsedSystem = true && that.isSetUsedSystem();
    if (this_present_UsedSystem || that_present_UsedSystem) {
      if (!(this_present_UsedSystem && that_present_UsedSystem))
        return false;
      if (!this.UsedSystem.equals(that.UsedSystem))
        return false;
    }

    boolean this_present_UsedSystemType = true && this.isSetUsedSystemType();
    boolean that_present_UsedSystemType = true && that.isSetUsedSystemType();
    if (this_present_UsedSystemType || that_present_UsedSystemType) {
      if (!(this_present_UsedSystemType && that_present_UsedSystemType))
        return false;
      if (!this.UsedSystemType.equals(that.UsedSystemType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedSystem()) ? 131071 : 524287);
    if (isSetUsedSystem())
      hashCode = hashCode * 8191 + UsedSystem.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedSystemType()) ? 131071 : 524287);
    if (isSetUsedSystemType())
      hashCode = hashCode * 8191 + UsedSystemType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractSystem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedSystem()).compareTo(other.isSetUsedSystem());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedSystem()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedSystem, other.UsedSystem);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedSystemType()).compareTo(other.isSetUsedSystemType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedSystemType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedSystemType, other.UsedSystemType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractSystem(");
    boolean first = true;

    sb.append("UsedSystem:");
    if (this.UsedSystem == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedSystem);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedSystemType:");
    if (this.UsedSystemType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedSystemType);
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

  private static class TDDIAbstractSystemStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractSystemStandardScheme getScheme() {
      return new TDDIAbstractSystemStandardScheme();
    }
  }

  private static class TDDIAbstractSystemStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractSystem> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractSystem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_SYSTEM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedSystem = new TDDISystemUnion();
              struct.UsedSystem.read(iprot);
              struct.setUsedSystemIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_SYSTEM_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedSystemType = thriftContract.TDDISystemUnionType.findByValue(iprot.readI32());
              struct.setUsedSystemTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractSystem struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedSystem != null) {
        oprot.writeFieldBegin(USED_SYSTEM_FIELD_DESC);
        struct.UsedSystem.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedSystemType != null) {
        oprot.writeFieldBegin(USED_SYSTEM_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedSystemType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractSystemTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractSystemTupleScheme getScheme() {
      return new TDDIAbstractSystemTupleScheme();
    }
  }

  private static class TDDIAbstractSystemTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractSystem> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractSystem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedSystem()) {
        optionals.set(0);
      }
      if (struct.isSetUsedSystemType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedSystem()) {
        struct.UsedSystem.write(oprot);
      }
      if (struct.isSetUsedSystemType()) {
        oprot.writeI32(struct.UsedSystemType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractSystem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedSystem = new TDDISystemUnion();
        struct.UsedSystem.read(iprot);
        struct.setUsedSystemIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedSystemType = thriftContract.TDDISystemUnionType.findByValue(iprot.readI32());
        struct.setUsedSystemTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

