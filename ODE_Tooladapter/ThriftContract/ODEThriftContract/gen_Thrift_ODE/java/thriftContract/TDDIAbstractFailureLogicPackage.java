/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-08-13")
public class TDDIAbstractFailureLogicPackage implements org.apache.thrift.TBase<TDDIAbstractFailureLogicPackage, TDDIAbstractFailureLogicPackage._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractFailureLogicPackage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractFailureLogicPackage");

  private static final org.apache.thrift.protocol.TField USED_FAILURE_LOGIC_PACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedFailureLogicPackage", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_FAILURE_LOGIC_PACKAGE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedFailureLogicPackageType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractFailureLogicPackageStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractFailureLogicPackageTupleSchemeFactory();

  public TDDIFailureLogicPackageUnion UsedFailureLogicPackage; // required
  /**
   * 
   * @see TDDIFailureLogicPackageUnionType
   */
  public TDDIFailureLogicPackageUnionType UsedFailureLogicPackageType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_FAILURE_LOGIC_PACKAGE((short)1, "UsedFailureLogicPackage"),
    /**
     * 
     * @see TDDIFailureLogicPackageUnionType
     */
    USED_FAILURE_LOGIC_PACKAGE_TYPE((short)2, "UsedFailureLogicPackageType");

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
        case 1: // USED_FAILURE_LOGIC_PACKAGE
          return USED_FAILURE_LOGIC_PACKAGE;
        case 2: // USED_FAILURE_LOGIC_PACKAGE_TYPE
          return USED_FAILURE_LOGIC_PACKAGE_TYPE;
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
    tmpMap.put(_Fields.USED_FAILURE_LOGIC_PACKAGE, new org.apache.thrift.meta_data.FieldMetaData("UsedFailureLogicPackage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIFailureLogicPackageUnion.class)));
    tmpMap.put(_Fields.USED_FAILURE_LOGIC_PACKAGE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedFailureLogicPackageType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDIFailureLogicPackageUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractFailureLogicPackage.class, metaDataMap);
  }

  public TDDIAbstractFailureLogicPackage() {
  }

  public TDDIAbstractFailureLogicPackage(
    TDDIFailureLogicPackageUnion UsedFailureLogicPackage,
    TDDIFailureLogicPackageUnionType UsedFailureLogicPackageType)
  {
    this();
    this.UsedFailureLogicPackage = UsedFailureLogicPackage;
    this.UsedFailureLogicPackageType = UsedFailureLogicPackageType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractFailureLogicPackage(TDDIAbstractFailureLogicPackage other) {
    if (other.isSetUsedFailureLogicPackage()) {
      this.UsedFailureLogicPackage = new TDDIFailureLogicPackageUnion(other.UsedFailureLogicPackage);
    }
    if (other.isSetUsedFailureLogicPackageType()) {
      this.UsedFailureLogicPackageType = other.UsedFailureLogicPackageType;
    }
  }

  public TDDIAbstractFailureLogicPackage deepCopy() {
    return new TDDIAbstractFailureLogicPackage(this);
  }

  @Override
  public void clear() {
    this.UsedFailureLogicPackage = null;
    this.UsedFailureLogicPackageType = null;
  }

  public TDDIFailureLogicPackageUnion getUsedFailureLogicPackage() {
    return this.UsedFailureLogicPackage;
  }

  public TDDIAbstractFailureLogicPackage setUsedFailureLogicPackage(TDDIFailureLogicPackageUnion UsedFailureLogicPackage) {
    this.UsedFailureLogicPackage = UsedFailureLogicPackage;
    return this;
  }

  public void unsetUsedFailureLogicPackage() {
    this.UsedFailureLogicPackage = null;
  }

  /** Returns true if field UsedFailureLogicPackage is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedFailureLogicPackage() {
    return this.UsedFailureLogicPackage != null;
  }

  public void setUsedFailureLogicPackageIsSet(boolean value) {
    if (!value) {
      this.UsedFailureLogicPackage = null;
    }
  }

  /**
   * 
   * @see TDDIFailureLogicPackageUnionType
   */
  public TDDIFailureLogicPackageUnionType getUsedFailureLogicPackageType() {
    return this.UsedFailureLogicPackageType;
  }

  /**
   * 
   * @see TDDIFailureLogicPackageUnionType
   */
  public TDDIAbstractFailureLogicPackage setUsedFailureLogicPackageType(TDDIFailureLogicPackageUnionType UsedFailureLogicPackageType) {
    this.UsedFailureLogicPackageType = UsedFailureLogicPackageType;
    return this;
  }

  public void unsetUsedFailureLogicPackageType() {
    this.UsedFailureLogicPackageType = null;
  }

  /** Returns true if field UsedFailureLogicPackageType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedFailureLogicPackageType() {
    return this.UsedFailureLogicPackageType != null;
  }

  public void setUsedFailureLogicPackageTypeIsSet(boolean value) {
    if (!value) {
      this.UsedFailureLogicPackageType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_FAILURE_LOGIC_PACKAGE:
      if (value == null) {
        unsetUsedFailureLogicPackage();
      } else {
        setUsedFailureLogicPackage((TDDIFailureLogicPackageUnion)value);
      }
      break;

    case USED_FAILURE_LOGIC_PACKAGE_TYPE:
      if (value == null) {
        unsetUsedFailureLogicPackageType();
      } else {
        setUsedFailureLogicPackageType((TDDIFailureLogicPackageUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_FAILURE_LOGIC_PACKAGE:
      return getUsedFailureLogicPackage();

    case USED_FAILURE_LOGIC_PACKAGE_TYPE:
      return getUsedFailureLogicPackageType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_FAILURE_LOGIC_PACKAGE:
      return isSetUsedFailureLogicPackage();
    case USED_FAILURE_LOGIC_PACKAGE_TYPE:
      return isSetUsedFailureLogicPackageType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractFailureLogicPackage)
      return this.equals((TDDIAbstractFailureLogicPackage)that);
    return false;
  }

  public boolean equals(TDDIAbstractFailureLogicPackage that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedFailureLogicPackage = true && this.isSetUsedFailureLogicPackage();
    boolean that_present_UsedFailureLogicPackage = true && that.isSetUsedFailureLogicPackage();
    if (this_present_UsedFailureLogicPackage || that_present_UsedFailureLogicPackage) {
      if (!(this_present_UsedFailureLogicPackage && that_present_UsedFailureLogicPackage))
        return false;
      if (!this.UsedFailureLogicPackage.equals(that.UsedFailureLogicPackage))
        return false;
    }

    boolean this_present_UsedFailureLogicPackageType = true && this.isSetUsedFailureLogicPackageType();
    boolean that_present_UsedFailureLogicPackageType = true && that.isSetUsedFailureLogicPackageType();
    if (this_present_UsedFailureLogicPackageType || that_present_UsedFailureLogicPackageType) {
      if (!(this_present_UsedFailureLogicPackageType && that_present_UsedFailureLogicPackageType))
        return false;
      if (!this.UsedFailureLogicPackageType.equals(that.UsedFailureLogicPackageType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedFailureLogicPackage()) ? 131071 : 524287);
    if (isSetUsedFailureLogicPackage())
      hashCode = hashCode * 8191 + UsedFailureLogicPackage.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedFailureLogicPackageType()) ? 131071 : 524287);
    if (isSetUsedFailureLogicPackageType())
      hashCode = hashCode * 8191 + UsedFailureLogicPackageType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractFailureLogicPackage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedFailureLogicPackage()).compareTo(other.isSetUsedFailureLogicPackage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedFailureLogicPackage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedFailureLogicPackage, other.UsedFailureLogicPackage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedFailureLogicPackageType()).compareTo(other.isSetUsedFailureLogicPackageType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedFailureLogicPackageType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedFailureLogicPackageType, other.UsedFailureLogicPackageType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractFailureLogicPackage(");
    boolean first = true;

    sb.append("UsedFailureLogicPackage:");
    if (this.UsedFailureLogicPackage == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedFailureLogicPackage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedFailureLogicPackageType:");
    if (this.UsedFailureLogicPackageType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedFailureLogicPackageType);
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

  private static class TDDIAbstractFailureLogicPackageStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractFailureLogicPackageStandardScheme getScheme() {
      return new TDDIAbstractFailureLogicPackageStandardScheme();
    }
  }

  private static class TDDIAbstractFailureLogicPackageStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractFailureLogicPackage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractFailureLogicPackage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_FAILURE_LOGIC_PACKAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedFailureLogicPackage = new TDDIFailureLogicPackageUnion();
              struct.UsedFailureLogicPackage.read(iprot);
              struct.setUsedFailureLogicPackageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_FAILURE_LOGIC_PACKAGE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedFailureLogicPackageType = thriftContract.TDDIFailureLogicPackageUnionType.findByValue(iprot.readI32());
              struct.setUsedFailureLogicPackageTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractFailureLogicPackage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedFailureLogicPackage != null) {
        oprot.writeFieldBegin(USED_FAILURE_LOGIC_PACKAGE_FIELD_DESC);
        struct.UsedFailureLogicPackage.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedFailureLogicPackageType != null) {
        oprot.writeFieldBegin(USED_FAILURE_LOGIC_PACKAGE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedFailureLogicPackageType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractFailureLogicPackageTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractFailureLogicPackageTupleScheme getScheme() {
      return new TDDIAbstractFailureLogicPackageTupleScheme();
    }
  }

  private static class TDDIAbstractFailureLogicPackageTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractFailureLogicPackage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractFailureLogicPackage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedFailureLogicPackage()) {
        optionals.set(0);
      }
      if (struct.isSetUsedFailureLogicPackageType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedFailureLogicPackage()) {
        struct.UsedFailureLogicPackage.write(oprot);
      }
      if (struct.isSetUsedFailureLogicPackageType()) {
        oprot.writeI32(struct.UsedFailureLogicPackageType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractFailureLogicPackage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedFailureLogicPackage = new TDDIFailureLogicPackageUnion();
        struct.UsedFailureLogicPackage.read(iprot);
        struct.setUsedFailureLogicPackageIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedFailureLogicPackageType = thriftContract.TDDIFailureLogicPackageUnionType.findByValue(iprot.readI32());
        struct.setUsedFailureLogicPackageTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
