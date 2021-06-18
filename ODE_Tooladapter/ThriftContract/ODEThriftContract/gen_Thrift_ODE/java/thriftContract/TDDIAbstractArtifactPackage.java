/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-08-13")
public class TDDIAbstractArtifactPackage implements org.apache.thrift.TBase<TDDIAbstractArtifactPackage, TDDIAbstractArtifactPackage._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractArtifactPackage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractArtifactPackage");

  private static final org.apache.thrift.protocol.TField USED_ARTIFACT_PACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedArtifactPackage", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_ARTIFACT_PACKAGE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedArtifactPackageType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractArtifactPackageStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractArtifactPackageTupleSchemeFactory();

  public TDDIArtifactPackageUnion UsedArtifactPackage; // required
  /**
   * 
   * @see TDDIArtifactPackageUnionType
   */
  public TDDIArtifactPackageUnionType UsedArtifactPackageType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_ARTIFACT_PACKAGE((short)1, "UsedArtifactPackage"),
    /**
     * 
     * @see TDDIArtifactPackageUnionType
     */
    USED_ARTIFACT_PACKAGE_TYPE((short)2, "UsedArtifactPackageType");

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
        case 1: // USED_ARTIFACT_PACKAGE
          return USED_ARTIFACT_PACKAGE;
        case 2: // USED_ARTIFACT_PACKAGE_TYPE
          return USED_ARTIFACT_PACKAGE_TYPE;
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
    tmpMap.put(_Fields.USED_ARTIFACT_PACKAGE, new org.apache.thrift.meta_data.FieldMetaData("UsedArtifactPackage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIArtifactPackageUnion.class)));
    tmpMap.put(_Fields.USED_ARTIFACT_PACKAGE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedArtifactPackageType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDIArtifactPackageUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractArtifactPackage.class, metaDataMap);
  }

  public TDDIAbstractArtifactPackage() {
  }

  public TDDIAbstractArtifactPackage(
    TDDIArtifactPackageUnion UsedArtifactPackage,
    TDDIArtifactPackageUnionType UsedArtifactPackageType)
  {
    this();
    this.UsedArtifactPackage = UsedArtifactPackage;
    this.UsedArtifactPackageType = UsedArtifactPackageType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractArtifactPackage(TDDIAbstractArtifactPackage other) {
    if (other.isSetUsedArtifactPackage()) {
      this.UsedArtifactPackage = new TDDIArtifactPackageUnion(other.UsedArtifactPackage);
    }
    if (other.isSetUsedArtifactPackageType()) {
      this.UsedArtifactPackageType = other.UsedArtifactPackageType;
    }
  }

  public TDDIAbstractArtifactPackage deepCopy() {
    return new TDDIAbstractArtifactPackage(this);
  }

  @Override
  public void clear() {
    this.UsedArtifactPackage = null;
    this.UsedArtifactPackageType = null;
  }

  public TDDIArtifactPackageUnion getUsedArtifactPackage() {
    return this.UsedArtifactPackage;
  }

  public TDDIAbstractArtifactPackage setUsedArtifactPackage(TDDIArtifactPackageUnion UsedArtifactPackage) {
    this.UsedArtifactPackage = UsedArtifactPackage;
    return this;
  }

  public void unsetUsedArtifactPackage() {
    this.UsedArtifactPackage = null;
  }

  /** Returns true if field UsedArtifactPackage is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedArtifactPackage() {
    return this.UsedArtifactPackage != null;
  }

  public void setUsedArtifactPackageIsSet(boolean value) {
    if (!value) {
      this.UsedArtifactPackage = null;
    }
  }

  /**
   * 
   * @see TDDIArtifactPackageUnionType
   */
  public TDDIArtifactPackageUnionType getUsedArtifactPackageType() {
    return this.UsedArtifactPackageType;
  }

  /**
   * 
   * @see TDDIArtifactPackageUnionType
   */
  public TDDIAbstractArtifactPackage setUsedArtifactPackageType(TDDIArtifactPackageUnionType UsedArtifactPackageType) {
    this.UsedArtifactPackageType = UsedArtifactPackageType;
    return this;
  }

  public void unsetUsedArtifactPackageType() {
    this.UsedArtifactPackageType = null;
  }

  /** Returns true if field UsedArtifactPackageType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedArtifactPackageType() {
    return this.UsedArtifactPackageType != null;
  }

  public void setUsedArtifactPackageTypeIsSet(boolean value) {
    if (!value) {
      this.UsedArtifactPackageType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_ARTIFACT_PACKAGE:
      if (value == null) {
        unsetUsedArtifactPackage();
      } else {
        setUsedArtifactPackage((TDDIArtifactPackageUnion)value);
      }
      break;

    case USED_ARTIFACT_PACKAGE_TYPE:
      if (value == null) {
        unsetUsedArtifactPackageType();
      } else {
        setUsedArtifactPackageType((TDDIArtifactPackageUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_ARTIFACT_PACKAGE:
      return getUsedArtifactPackage();

    case USED_ARTIFACT_PACKAGE_TYPE:
      return getUsedArtifactPackageType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_ARTIFACT_PACKAGE:
      return isSetUsedArtifactPackage();
    case USED_ARTIFACT_PACKAGE_TYPE:
      return isSetUsedArtifactPackageType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractArtifactPackage)
      return this.equals((TDDIAbstractArtifactPackage)that);
    return false;
  }

  public boolean equals(TDDIAbstractArtifactPackage that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedArtifactPackage = true && this.isSetUsedArtifactPackage();
    boolean that_present_UsedArtifactPackage = true && that.isSetUsedArtifactPackage();
    if (this_present_UsedArtifactPackage || that_present_UsedArtifactPackage) {
      if (!(this_present_UsedArtifactPackage && that_present_UsedArtifactPackage))
        return false;
      if (!this.UsedArtifactPackage.equals(that.UsedArtifactPackage))
        return false;
    }

    boolean this_present_UsedArtifactPackageType = true && this.isSetUsedArtifactPackageType();
    boolean that_present_UsedArtifactPackageType = true && that.isSetUsedArtifactPackageType();
    if (this_present_UsedArtifactPackageType || that_present_UsedArtifactPackageType) {
      if (!(this_present_UsedArtifactPackageType && that_present_UsedArtifactPackageType))
        return false;
      if (!this.UsedArtifactPackageType.equals(that.UsedArtifactPackageType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedArtifactPackage()) ? 131071 : 524287);
    if (isSetUsedArtifactPackage())
      hashCode = hashCode * 8191 + UsedArtifactPackage.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedArtifactPackageType()) ? 131071 : 524287);
    if (isSetUsedArtifactPackageType())
      hashCode = hashCode * 8191 + UsedArtifactPackageType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractArtifactPackage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedArtifactPackage()).compareTo(other.isSetUsedArtifactPackage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedArtifactPackage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedArtifactPackage, other.UsedArtifactPackage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedArtifactPackageType()).compareTo(other.isSetUsedArtifactPackageType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedArtifactPackageType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedArtifactPackageType, other.UsedArtifactPackageType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractArtifactPackage(");
    boolean first = true;

    sb.append("UsedArtifactPackage:");
    if (this.UsedArtifactPackage == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedArtifactPackage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedArtifactPackageType:");
    if (this.UsedArtifactPackageType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedArtifactPackageType);
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

  private static class TDDIAbstractArtifactPackageStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractArtifactPackageStandardScheme getScheme() {
      return new TDDIAbstractArtifactPackageStandardScheme();
    }
  }

  private static class TDDIAbstractArtifactPackageStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractArtifactPackage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractArtifactPackage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_ARTIFACT_PACKAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedArtifactPackage = new TDDIArtifactPackageUnion();
              struct.UsedArtifactPackage.read(iprot);
              struct.setUsedArtifactPackageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_ARTIFACT_PACKAGE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedArtifactPackageType = thriftContract.TDDIArtifactPackageUnionType.findByValue(iprot.readI32());
              struct.setUsedArtifactPackageTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractArtifactPackage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedArtifactPackage != null) {
        oprot.writeFieldBegin(USED_ARTIFACT_PACKAGE_FIELD_DESC);
        struct.UsedArtifactPackage.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedArtifactPackageType != null) {
        oprot.writeFieldBegin(USED_ARTIFACT_PACKAGE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedArtifactPackageType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractArtifactPackageTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractArtifactPackageTupleScheme getScheme() {
      return new TDDIAbstractArtifactPackageTupleScheme();
    }
  }

  private static class TDDIAbstractArtifactPackageTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractArtifactPackage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractArtifactPackage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedArtifactPackage()) {
        optionals.set(0);
      }
      if (struct.isSetUsedArtifactPackageType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedArtifactPackage()) {
        struct.UsedArtifactPackage.write(oprot);
      }
      if (struct.isSetUsedArtifactPackageType()) {
        oprot.writeI32(struct.UsedArtifactPackageType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractArtifactPackage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedArtifactPackage = new TDDIArtifactPackageUnion();
        struct.UsedArtifactPackage.read(iprot);
        struct.setUsedArtifactPackageIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedArtifactPackageType = thriftContract.TDDIArtifactPackageUnionType.findByValue(iprot.readI32());
        struct.setUsedArtifactPackageTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
