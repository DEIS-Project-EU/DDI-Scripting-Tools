/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-08-13")
public class TDDIAbstractFMEAPackage implements org.apache.thrift.TBase<TDDIAbstractFMEAPackage, TDDIAbstractFMEAPackage._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractFMEAPackage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractFMEAPackage");

  private static final org.apache.thrift.protocol.TField USED_FMEAPACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedFMEAPackage", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_FMEAPACKAGE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedFMEAPackageType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractFMEAPackageStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractFMEAPackageTupleSchemeFactory();

  public TDDIFMEAPackageUnion UsedFMEAPackage; // required
  /**
   * 
   * @see TDDIFMEAPackageUnionType
   */
  public TDDIFMEAPackageUnionType UsedFMEAPackageType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_FMEAPACKAGE((short)1, "UsedFMEAPackage"),
    /**
     * 
     * @see TDDIFMEAPackageUnionType
     */
    USED_FMEAPACKAGE_TYPE((short)2, "UsedFMEAPackageType");

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
        case 1: // USED_FMEAPACKAGE
          return USED_FMEAPACKAGE;
        case 2: // USED_FMEAPACKAGE_TYPE
          return USED_FMEAPACKAGE_TYPE;
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
    tmpMap.put(_Fields.USED_FMEAPACKAGE, new org.apache.thrift.meta_data.FieldMetaData("UsedFMEAPackage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIFMEAPackageUnion.class)));
    tmpMap.put(_Fields.USED_FMEAPACKAGE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedFMEAPackageType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDIFMEAPackageUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractFMEAPackage.class, metaDataMap);
  }

  public TDDIAbstractFMEAPackage() {
  }

  public TDDIAbstractFMEAPackage(
    TDDIFMEAPackageUnion UsedFMEAPackage,
    TDDIFMEAPackageUnionType UsedFMEAPackageType)
  {
    this();
    this.UsedFMEAPackage = UsedFMEAPackage;
    this.UsedFMEAPackageType = UsedFMEAPackageType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractFMEAPackage(TDDIAbstractFMEAPackage other) {
    if (other.isSetUsedFMEAPackage()) {
      this.UsedFMEAPackage = new TDDIFMEAPackageUnion(other.UsedFMEAPackage);
    }
    if (other.isSetUsedFMEAPackageType()) {
      this.UsedFMEAPackageType = other.UsedFMEAPackageType;
    }
  }

  public TDDIAbstractFMEAPackage deepCopy() {
    return new TDDIAbstractFMEAPackage(this);
  }

  @Override
  public void clear() {
    this.UsedFMEAPackage = null;
    this.UsedFMEAPackageType = null;
  }

  public TDDIFMEAPackageUnion getUsedFMEAPackage() {
    return this.UsedFMEAPackage;
  }

  public TDDIAbstractFMEAPackage setUsedFMEAPackage(TDDIFMEAPackageUnion UsedFMEAPackage) {
    this.UsedFMEAPackage = UsedFMEAPackage;
    return this;
  }

  public void unsetUsedFMEAPackage() {
    this.UsedFMEAPackage = null;
  }

  /** Returns true if field UsedFMEAPackage is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedFMEAPackage() {
    return this.UsedFMEAPackage != null;
  }

  public void setUsedFMEAPackageIsSet(boolean value) {
    if (!value) {
      this.UsedFMEAPackage = null;
    }
  }

  /**
   * 
   * @see TDDIFMEAPackageUnionType
   */
  public TDDIFMEAPackageUnionType getUsedFMEAPackageType() {
    return this.UsedFMEAPackageType;
  }

  /**
   * 
   * @see TDDIFMEAPackageUnionType
   */
  public TDDIAbstractFMEAPackage setUsedFMEAPackageType(TDDIFMEAPackageUnionType UsedFMEAPackageType) {
    this.UsedFMEAPackageType = UsedFMEAPackageType;
    return this;
  }

  public void unsetUsedFMEAPackageType() {
    this.UsedFMEAPackageType = null;
  }

  /** Returns true if field UsedFMEAPackageType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedFMEAPackageType() {
    return this.UsedFMEAPackageType != null;
  }

  public void setUsedFMEAPackageTypeIsSet(boolean value) {
    if (!value) {
      this.UsedFMEAPackageType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_FMEAPACKAGE:
      if (value == null) {
        unsetUsedFMEAPackage();
      } else {
        setUsedFMEAPackage((TDDIFMEAPackageUnion)value);
      }
      break;

    case USED_FMEAPACKAGE_TYPE:
      if (value == null) {
        unsetUsedFMEAPackageType();
      } else {
        setUsedFMEAPackageType((TDDIFMEAPackageUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_FMEAPACKAGE:
      return getUsedFMEAPackage();

    case USED_FMEAPACKAGE_TYPE:
      return getUsedFMEAPackageType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_FMEAPACKAGE:
      return isSetUsedFMEAPackage();
    case USED_FMEAPACKAGE_TYPE:
      return isSetUsedFMEAPackageType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractFMEAPackage)
      return this.equals((TDDIAbstractFMEAPackage)that);
    return false;
  }

  public boolean equals(TDDIAbstractFMEAPackage that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedFMEAPackage = true && this.isSetUsedFMEAPackage();
    boolean that_present_UsedFMEAPackage = true && that.isSetUsedFMEAPackage();
    if (this_present_UsedFMEAPackage || that_present_UsedFMEAPackage) {
      if (!(this_present_UsedFMEAPackage && that_present_UsedFMEAPackage))
        return false;
      if (!this.UsedFMEAPackage.equals(that.UsedFMEAPackage))
        return false;
    }

    boolean this_present_UsedFMEAPackageType = true && this.isSetUsedFMEAPackageType();
    boolean that_present_UsedFMEAPackageType = true && that.isSetUsedFMEAPackageType();
    if (this_present_UsedFMEAPackageType || that_present_UsedFMEAPackageType) {
      if (!(this_present_UsedFMEAPackageType && that_present_UsedFMEAPackageType))
        return false;
      if (!this.UsedFMEAPackageType.equals(that.UsedFMEAPackageType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedFMEAPackage()) ? 131071 : 524287);
    if (isSetUsedFMEAPackage())
      hashCode = hashCode * 8191 + UsedFMEAPackage.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedFMEAPackageType()) ? 131071 : 524287);
    if (isSetUsedFMEAPackageType())
      hashCode = hashCode * 8191 + UsedFMEAPackageType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractFMEAPackage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedFMEAPackage()).compareTo(other.isSetUsedFMEAPackage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedFMEAPackage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedFMEAPackage, other.UsedFMEAPackage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedFMEAPackageType()).compareTo(other.isSetUsedFMEAPackageType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedFMEAPackageType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedFMEAPackageType, other.UsedFMEAPackageType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractFMEAPackage(");
    boolean first = true;

    sb.append("UsedFMEAPackage:");
    if (this.UsedFMEAPackage == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedFMEAPackage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedFMEAPackageType:");
    if (this.UsedFMEAPackageType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedFMEAPackageType);
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

  private static class TDDIAbstractFMEAPackageStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractFMEAPackageStandardScheme getScheme() {
      return new TDDIAbstractFMEAPackageStandardScheme();
    }
  }

  private static class TDDIAbstractFMEAPackageStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractFMEAPackage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractFMEAPackage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_FMEAPACKAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedFMEAPackage = new TDDIFMEAPackageUnion();
              struct.UsedFMEAPackage.read(iprot);
              struct.setUsedFMEAPackageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_FMEAPACKAGE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedFMEAPackageType = thriftContract.TDDIFMEAPackageUnionType.findByValue(iprot.readI32());
              struct.setUsedFMEAPackageTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractFMEAPackage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedFMEAPackage != null) {
        oprot.writeFieldBegin(USED_FMEAPACKAGE_FIELD_DESC);
        struct.UsedFMEAPackage.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedFMEAPackageType != null) {
        oprot.writeFieldBegin(USED_FMEAPACKAGE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedFMEAPackageType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractFMEAPackageTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractFMEAPackageTupleScheme getScheme() {
      return new TDDIAbstractFMEAPackageTupleScheme();
    }
  }

  private static class TDDIAbstractFMEAPackageTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractFMEAPackage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractFMEAPackage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedFMEAPackage()) {
        optionals.set(0);
      }
      if (struct.isSetUsedFMEAPackageType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedFMEAPackage()) {
        struct.UsedFMEAPackage.write(oprot);
      }
      if (struct.isSetUsedFMEAPackageType()) {
        oprot.writeI32(struct.UsedFMEAPackageType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractFMEAPackage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedFMEAPackage = new TDDIFMEAPackageUnion();
        struct.UsedFMEAPackage.read(iprot);
        struct.setUsedFMEAPackageIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedFMEAPackageType = thriftContract.TDDIFMEAPackageUnionType.findByValue(iprot.readI32());
        struct.setUsedFMEAPackageTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

