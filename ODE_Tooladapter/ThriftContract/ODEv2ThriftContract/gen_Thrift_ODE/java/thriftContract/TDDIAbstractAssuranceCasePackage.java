/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-03-13")
public class TDDIAbstractAssuranceCasePackage implements org.apache.thrift.TBase<TDDIAbstractAssuranceCasePackage, TDDIAbstractAssuranceCasePackage._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractAssuranceCasePackage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractAssuranceCasePackage");

  private static final org.apache.thrift.protocol.TField USED_ASSURANCE_CASE_PACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedAssuranceCasePackage", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_ASSURANCE_CASE_PACKAGE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedAssuranceCasePackageType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractAssuranceCasePackageStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractAssuranceCasePackageTupleSchemeFactory();

  public TDDIAssuranceCasePackageUnion UsedAssuranceCasePackage; // required
  /**
   * 
   * @see TDDIAssuranceCasePackageUnionType
   */
  public TDDIAssuranceCasePackageUnionType UsedAssuranceCasePackageType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_ASSURANCE_CASE_PACKAGE((short)1, "UsedAssuranceCasePackage"),
    /**
     * 
     * @see TDDIAssuranceCasePackageUnionType
     */
    USED_ASSURANCE_CASE_PACKAGE_TYPE((short)2, "UsedAssuranceCasePackageType");

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
        case 1: // USED_ASSURANCE_CASE_PACKAGE
          return USED_ASSURANCE_CASE_PACKAGE;
        case 2: // USED_ASSURANCE_CASE_PACKAGE_TYPE
          return USED_ASSURANCE_CASE_PACKAGE_TYPE;
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
    tmpMap.put(_Fields.USED_ASSURANCE_CASE_PACKAGE, new org.apache.thrift.meta_data.FieldMetaData("UsedAssuranceCasePackage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIAssuranceCasePackageUnion.class)));
    tmpMap.put(_Fields.USED_ASSURANCE_CASE_PACKAGE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedAssuranceCasePackageType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDIAssuranceCasePackageUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractAssuranceCasePackage.class, metaDataMap);
  }

  public TDDIAbstractAssuranceCasePackage() {
  }

  public TDDIAbstractAssuranceCasePackage(
    TDDIAssuranceCasePackageUnion UsedAssuranceCasePackage,
    TDDIAssuranceCasePackageUnionType UsedAssuranceCasePackageType)
  {
    this();
    this.UsedAssuranceCasePackage = UsedAssuranceCasePackage;
    this.UsedAssuranceCasePackageType = UsedAssuranceCasePackageType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractAssuranceCasePackage(TDDIAbstractAssuranceCasePackage other) {
    if (other.isSetUsedAssuranceCasePackage()) {
      this.UsedAssuranceCasePackage = new TDDIAssuranceCasePackageUnion(other.UsedAssuranceCasePackage);
    }
    if (other.isSetUsedAssuranceCasePackageType()) {
      this.UsedAssuranceCasePackageType = other.UsedAssuranceCasePackageType;
    }
  }

  public TDDIAbstractAssuranceCasePackage deepCopy() {
    return new TDDIAbstractAssuranceCasePackage(this);
  }

  @Override
  public void clear() {
    this.UsedAssuranceCasePackage = null;
    this.UsedAssuranceCasePackageType = null;
  }

  public TDDIAssuranceCasePackageUnion getUsedAssuranceCasePackage() {
    return this.UsedAssuranceCasePackage;
  }

  public TDDIAbstractAssuranceCasePackage setUsedAssuranceCasePackage(TDDIAssuranceCasePackageUnion UsedAssuranceCasePackage) {
    this.UsedAssuranceCasePackage = UsedAssuranceCasePackage;
    return this;
  }

  public void unsetUsedAssuranceCasePackage() {
    this.UsedAssuranceCasePackage = null;
  }

  /** Returns true if field UsedAssuranceCasePackage is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedAssuranceCasePackage() {
    return this.UsedAssuranceCasePackage != null;
  }

  public void setUsedAssuranceCasePackageIsSet(boolean value) {
    if (!value) {
      this.UsedAssuranceCasePackage = null;
    }
  }

  /**
   * 
   * @see TDDIAssuranceCasePackageUnionType
   */
  public TDDIAssuranceCasePackageUnionType getUsedAssuranceCasePackageType() {
    return this.UsedAssuranceCasePackageType;
  }

  /**
   * 
   * @see TDDIAssuranceCasePackageUnionType
   */
  public TDDIAbstractAssuranceCasePackage setUsedAssuranceCasePackageType(TDDIAssuranceCasePackageUnionType UsedAssuranceCasePackageType) {
    this.UsedAssuranceCasePackageType = UsedAssuranceCasePackageType;
    return this;
  }

  public void unsetUsedAssuranceCasePackageType() {
    this.UsedAssuranceCasePackageType = null;
  }

  /** Returns true if field UsedAssuranceCasePackageType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedAssuranceCasePackageType() {
    return this.UsedAssuranceCasePackageType != null;
  }

  public void setUsedAssuranceCasePackageTypeIsSet(boolean value) {
    if (!value) {
      this.UsedAssuranceCasePackageType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_ASSURANCE_CASE_PACKAGE:
      if (value == null) {
        unsetUsedAssuranceCasePackage();
      } else {
        setUsedAssuranceCasePackage((TDDIAssuranceCasePackageUnion)value);
      }
      break;

    case USED_ASSURANCE_CASE_PACKAGE_TYPE:
      if (value == null) {
        unsetUsedAssuranceCasePackageType();
      } else {
        setUsedAssuranceCasePackageType((TDDIAssuranceCasePackageUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_ASSURANCE_CASE_PACKAGE:
      return getUsedAssuranceCasePackage();

    case USED_ASSURANCE_CASE_PACKAGE_TYPE:
      return getUsedAssuranceCasePackageType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_ASSURANCE_CASE_PACKAGE:
      return isSetUsedAssuranceCasePackage();
    case USED_ASSURANCE_CASE_PACKAGE_TYPE:
      return isSetUsedAssuranceCasePackageType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractAssuranceCasePackage)
      return this.equals((TDDIAbstractAssuranceCasePackage)that);
    return false;
  }

  public boolean equals(TDDIAbstractAssuranceCasePackage that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedAssuranceCasePackage = true && this.isSetUsedAssuranceCasePackage();
    boolean that_present_UsedAssuranceCasePackage = true && that.isSetUsedAssuranceCasePackage();
    if (this_present_UsedAssuranceCasePackage || that_present_UsedAssuranceCasePackage) {
      if (!(this_present_UsedAssuranceCasePackage && that_present_UsedAssuranceCasePackage))
        return false;
      if (!this.UsedAssuranceCasePackage.equals(that.UsedAssuranceCasePackage))
        return false;
    }

    boolean this_present_UsedAssuranceCasePackageType = true && this.isSetUsedAssuranceCasePackageType();
    boolean that_present_UsedAssuranceCasePackageType = true && that.isSetUsedAssuranceCasePackageType();
    if (this_present_UsedAssuranceCasePackageType || that_present_UsedAssuranceCasePackageType) {
      if (!(this_present_UsedAssuranceCasePackageType && that_present_UsedAssuranceCasePackageType))
        return false;
      if (!this.UsedAssuranceCasePackageType.equals(that.UsedAssuranceCasePackageType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedAssuranceCasePackage()) ? 131071 : 524287);
    if (isSetUsedAssuranceCasePackage())
      hashCode = hashCode * 8191 + UsedAssuranceCasePackage.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedAssuranceCasePackageType()) ? 131071 : 524287);
    if (isSetUsedAssuranceCasePackageType())
      hashCode = hashCode * 8191 + UsedAssuranceCasePackageType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractAssuranceCasePackage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedAssuranceCasePackage()).compareTo(other.isSetUsedAssuranceCasePackage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedAssuranceCasePackage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedAssuranceCasePackage, other.UsedAssuranceCasePackage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedAssuranceCasePackageType()).compareTo(other.isSetUsedAssuranceCasePackageType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedAssuranceCasePackageType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedAssuranceCasePackageType, other.UsedAssuranceCasePackageType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractAssuranceCasePackage(");
    boolean first = true;

    sb.append("UsedAssuranceCasePackage:");
    if (this.UsedAssuranceCasePackage == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedAssuranceCasePackage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedAssuranceCasePackageType:");
    if (this.UsedAssuranceCasePackageType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedAssuranceCasePackageType);
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

  private static class TDDIAbstractAssuranceCasePackageStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractAssuranceCasePackageStandardScheme getScheme() {
      return new TDDIAbstractAssuranceCasePackageStandardScheme();
    }
  }

  private static class TDDIAbstractAssuranceCasePackageStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractAssuranceCasePackage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractAssuranceCasePackage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_ASSURANCE_CASE_PACKAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedAssuranceCasePackage = new TDDIAssuranceCasePackageUnion();
              struct.UsedAssuranceCasePackage.read(iprot);
              struct.setUsedAssuranceCasePackageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_ASSURANCE_CASE_PACKAGE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedAssuranceCasePackageType = thriftContract.TDDIAssuranceCasePackageUnionType.findByValue(iprot.readI32());
              struct.setUsedAssuranceCasePackageTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractAssuranceCasePackage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedAssuranceCasePackage != null) {
        oprot.writeFieldBegin(USED_ASSURANCE_CASE_PACKAGE_FIELD_DESC);
        struct.UsedAssuranceCasePackage.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedAssuranceCasePackageType != null) {
        oprot.writeFieldBegin(USED_ASSURANCE_CASE_PACKAGE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedAssuranceCasePackageType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractAssuranceCasePackageTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractAssuranceCasePackageTupleScheme getScheme() {
      return new TDDIAbstractAssuranceCasePackageTupleScheme();
    }
  }

  private static class TDDIAbstractAssuranceCasePackageTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractAssuranceCasePackage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractAssuranceCasePackage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedAssuranceCasePackage()) {
        optionals.set(0);
      }
      if (struct.isSetUsedAssuranceCasePackageType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedAssuranceCasePackage()) {
        struct.UsedAssuranceCasePackage.write(oprot);
      }
      if (struct.isSetUsedAssuranceCasePackageType()) {
        oprot.writeI32(struct.UsedAssuranceCasePackageType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractAssuranceCasePackage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedAssuranceCasePackage = new TDDIAssuranceCasePackageUnion();
        struct.UsedAssuranceCasePackage.read(iprot);
        struct.setUsedAssuranceCasePackageIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedAssuranceCasePackageType = thriftContract.TDDIAssuranceCasePackageUnionType.findByValue(iprot.readI32());
        struct.setUsedAssuranceCasePackageTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

