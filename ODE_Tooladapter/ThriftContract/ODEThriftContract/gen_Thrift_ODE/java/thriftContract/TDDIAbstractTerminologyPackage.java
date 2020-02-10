/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-08-13")
public class TDDIAbstractTerminologyPackage implements org.apache.thrift.TBase<TDDIAbstractTerminologyPackage, TDDIAbstractTerminologyPackage._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractTerminologyPackage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractTerminologyPackage");

  private static final org.apache.thrift.protocol.TField USED_TERMINOLOGY_PACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedTerminologyPackage", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_TERMINOLOGY_PACKAGE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedTerminologyPackageType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractTerminologyPackageStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractTerminologyPackageTupleSchemeFactory();

  public TDDITerminologyPackageUnion UsedTerminologyPackage; // required
  /**
   * 
   * @see TDDITerminologyPackageUnionType
   */
  public TDDITerminologyPackageUnionType UsedTerminologyPackageType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_TERMINOLOGY_PACKAGE((short)1, "UsedTerminologyPackage"),
    /**
     * 
     * @see TDDITerminologyPackageUnionType
     */
    USED_TERMINOLOGY_PACKAGE_TYPE((short)2, "UsedTerminologyPackageType");

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
        case 1: // USED_TERMINOLOGY_PACKAGE
          return USED_TERMINOLOGY_PACKAGE;
        case 2: // USED_TERMINOLOGY_PACKAGE_TYPE
          return USED_TERMINOLOGY_PACKAGE_TYPE;
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
    tmpMap.put(_Fields.USED_TERMINOLOGY_PACKAGE, new org.apache.thrift.meta_data.FieldMetaData("UsedTerminologyPackage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDITerminologyPackageUnion.class)));
    tmpMap.put(_Fields.USED_TERMINOLOGY_PACKAGE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedTerminologyPackageType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDITerminologyPackageUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractTerminologyPackage.class, metaDataMap);
  }

  public TDDIAbstractTerminologyPackage() {
  }

  public TDDIAbstractTerminologyPackage(
    TDDITerminologyPackageUnion UsedTerminologyPackage,
    TDDITerminologyPackageUnionType UsedTerminologyPackageType)
  {
    this();
    this.UsedTerminologyPackage = UsedTerminologyPackage;
    this.UsedTerminologyPackageType = UsedTerminologyPackageType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractTerminologyPackage(TDDIAbstractTerminologyPackage other) {
    if (other.isSetUsedTerminologyPackage()) {
      this.UsedTerminologyPackage = new TDDITerminologyPackageUnion(other.UsedTerminologyPackage);
    }
    if (other.isSetUsedTerminologyPackageType()) {
      this.UsedTerminologyPackageType = other.UsedTerminologyPackageType;
    }
  }

  public TDDIAbstractTerminologyPackage deepCopy() {
    return new TDDIAbstractTerminologyPackage(this);
  }

  @Override
  public void clear() {
    this.UsedTerminologyPackage = null;
    this.UsedTerminologyPackageType = null;
  }

  public TDDITerminologyPackageUnion getUsedTerminologyPackage() {
    return this.UsedTerminologyPackage;
  }

  public TDDIAbstractTerminologyPackage setUsedTerminologyPackage(TDDITerminologyPackageUnion UsedTerminologyPackage) {
    this.UsedTerminologyPackage = UsedTerminologyPackage;
    return this;
  }

  public void unsetUsedTerminologyPackage() {
    this.UsedTerminologyPackage = null;
  }

  /** Returns true if field UsedTerminologyPackage is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedTerminologyPackage() {
    return this.UsedTerminologyPackage != null;
  }

  public void setUsedTerminologyPackageIsSet(boolean value) {
    if (!value) {
      this.UsedTerminologyPackage = null;
    }
  }

  /**
   * 
   * @see TDDITerminologyPackageUnionType
   */
  public TDDITerminologyPackageUnionType getUsedTerminologyPackageType() {
    return this.UsedTerminologyPackageType;
  }

  /**
   * 
   * @see TDDITerminologyPackageUnionType
   */
  public TDDIAbstractTerminologyPackage setUsedTerminologyPackageType(TDDITerminologyPackageUnionType UsedTerminologyPackageType) {
    this.UsedTerminologyPackageType = UsedTerminologyPackageType;
    return this;
  }

  public void unsetUsedTerminologyPackageType() {
    this.UsedTerminologyPackageType = null;
  }

  /** Returns true if field UsedTerminologyPackageType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedTerminologyPackageType() {
    return this.UsedTerminologyPackageType != null;
  }

  public void setUsedTerminologyPackageTypeIsSet(boolean value) {
    if (!value) {
      this.UsedTerminologyPackageType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_TERMINOLOGY_PACKAGE:
      if (value == null) {
        unsetUsedTerminologyPackage();
      } else {
        setUsedTerminologyPackage((TDDITerminologyPackageUnion)value);
      }
      break;

    case USED_TERMINOLOGY_PACKAGE_TYPE:
      if (value == null) {
        unsetUsedTerminologyPackageType();
      } else {
        setUsedTerminologyPackageType((TDDITerminologyPackageUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_TERMINOLOGY_PACKAGE:
      return getUsedTerminologyPackage();

    case USED_TERMINOLOGY_PACKAGE_TYPE:
      return getUsedTerminologyPackageType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_TERMINOLOGY_PACKAGE:
      return isSetUsedTerminologyPackage();
    case USED_TERMINOLOGY_PACKAGE_TYPE:
      return isSetUsedTerminologyPackageType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractTerminologyPackage)
      return this.equals((TDDIAbstractTerminologyPackage)that);
    return false;
  }

  public boolean equals(TDDIAbstractTerminologyPackage that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedTerminologyPackage = true && this.isSetUsedTerminologyPackage();
    boolean that_present_UsedTerminologyPackage = true && that.isSetUsedTerminologyPackage();
    if (this_present_UsedTerminologyPackage || that_present_UsedTerminologyPackage) {
      if (!(this_present_UsedTerminologyPackage && that_present_UsedTerminologyPackage))
        return false;
      if (!this.UsedTerminologyPackage.equals(that.UsedTerminologyPackage))
        return false;
    }

    boolean this_present_UsedTerminologyPackageType = true && this.isSetUsedTerminologyPackageType();
    boolean that_present_UsedTerminologyPackageType = true && that.isSetUsedTerminologyPackageType();
    if (this_present_UsedTerminologyPackageType || that_present_UsedTerminologyPackageType) {
      if (!(this_present_UsedTerminologyPackageType && that_present_UsedTerminologyPackageType))
        return false;
      if (!this.UsedTerminologyPackageType.equals(that.UsedTerminologyPackageType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedTerminologyPackage()) ? 131071 : 524287);
    if (isSetUsedTerminologyPackage())
      hashCode = hashCode * 8191 + UsedTerminologyPackage.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedTerminologyPackageType()) ? 131071 : 524287);
    if (isSetUsedTerminologyPackageType())
      hashCode = hashCode * 8191 + UsedTerminologyPackageType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractTerminologyPackage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedTerminologyPackage()).compareTo(other.isSetUsedTerminologyPackage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedTerminologyPackage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedTerminologyPackage, other.UsedTerminologyPackage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedTerminologyPackageType()).compareTo(other.isSetUsedTerminologyPackageType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedTerminologyPackageType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedTerminologyPackageType, other.UsedTerminologyPackageType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractTerminologyPackage(");
    boolean first = true;

    sb.append("UsedTerminologyPackage:");
    if (this.UsedTerminologyPackage == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedTerminologyPackage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedTerminologyPackageType:");
    if (this.UsedTerminologyPackageType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedTerminologyPackageType);
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

  private static class TDDIAbstractTerminologyPackageStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractTerminologyPackageStandardScheme getScheme() {
      return new TDDIAbstractTerminologyPackageStandardScheme();
    }
  }

  private static class TDDIAbstractTerminologyPackageStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractTerminologyPackage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractTerminologyPackage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_TERMINOLOGY_PACKAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedTerminologyPackage = new TDDITerminologyPackageUnion();
              struct.UsedTerminologyPackage.read(iprot);
              struct.setUsedTerminologyPackageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_TERMINOLOGY_PACKAGE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedTerminologyPackageType = thriftContract.TDDITerminologyPackageUnionType.findByValue(iprot.readI32());
              struct.setUsedTerminologyPackageTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractTerminologyPackage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedTerminologyPackage != null) {
        oprot.writeFieldBegin(USED_TERMINOLOGY_PACKAGE_FIELD_DESC);
        struct.UsedTerminologyPackage.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedTerminologyPackageType != null) {
        oprot.writeFieldBegin(USED_TERMINOLOGY_PACKAGE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedTerminologyPackageType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractTerminologyPackageTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractTerminologyPackageTupleScheme getScheme() {
      return new TDDIAbstractTerminologyPackageTupleScheme();
    }
  }

  private static class TDDIAbstractTerminologyPackageTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractTerminologyPackage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractTerminologyPackage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedTerminologyPackage()) {
        optionals.set(0);
      }
      if (struct.isSetUsedTerminologyPackageType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedTerminologyPackage()) {
        struct.UsedTerminologyPackage.write(oprot);
      }
      if (struct.isSetUsedTerminologyPackageType()) {
        oprot.writeI32(struct.UsedTerminologyPackageType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractTerminologyPackage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedTerminologyPackage = new TDDITerminologyPackageUnion();
        struct.UsedTerminologyPackage.read(iprot);
        struct.setUsedTerminologyPackageIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedTerminologyPackageType = thriftContract.TDDITerminologyPackageUnionType.findByValue(iprot.readI32());
        struct.setUsedTerminologyPackageTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

