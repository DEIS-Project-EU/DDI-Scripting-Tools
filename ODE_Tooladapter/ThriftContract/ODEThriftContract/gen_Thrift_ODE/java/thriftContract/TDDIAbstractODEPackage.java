/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-08-13")
public class TDDIAbstractODEPackage implements org.apache.thrift.TBase<TDDIAbstractODEPackage, TDDIAbstractODEPackage._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractODEPackage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractODEPackage");

  private static final org.apache.thrift.protocol.TField USED_ODEPACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedODEPackage", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_ODEPACKAGE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedODEPackageType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractODEPackageStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractODEPackageTupleSchemeFactory();

  public TDDIODEPackageUnion UsedODEPackage; // required
  /**
   * 
   * @see TDDIODEPackageUnionType
   */
  public TDDIODEPackageUnionType UsedODEPackageType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_ODEPACKAGE((short)1, "UsedODEPackage"),
    /**
     * 
     * @see TDDIODEPackageUnionType
     */
    USED_ODEPACKAGE_TYPE((short)2, "UsedODEPackageType");

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
        case 1: // USED_ODEPACKAGE
          return USED_ODEPACKAGE;
        case 2: // USED_ODEPACKAGE_TYPE
          return USED_ODEPACKAGE_TYPE;
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
    tmpMap.put(_Fields.USED_ODEPACKAGE, new org.apache.thrift.meta_data.FieldMetaData("UsedODEPackage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIODEPackageUnion.class)));
    tmpMap.put(_Fields.USED_ODEPACKAGE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedODEPackageType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDIODEPackageUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractODEPackage.class, metaDataMap);
  }

  public TDDIAbstractODEPackage() {
  }

  public TDDIAbstractODEPackage(
    TDDIODEPackageUnion UsedODEPackage,
    TDDIODEPackageUnionType UsedODEPackageType)
  {
    this();
    this.UsedODEPackage = UsedODEPackage;
    this.UsedODEPackageType = UsedODEPackageType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractODEPackage(TDDIAbstractODEPackage other) {
    if (other.isSetUsedODEPackage()) {
      this.UsedODEPackage = new TDDIODEPackageUnion(other.UsedODEPackage);
    }
    if (other.isSetUsedODEPackageType()) {
      this.UsedODEPackageType = other.UsedODEPackageType;
    }
  }

  public TDDIAbstractODEPackage deepCopy() {
    return new TDDIAbstractODEPackage(this);
  }

  @Override
  public void clear() {
    this.UsedODEPackage = null;
    this.UsedODEPackageType = null;
  }

  public TDDIODEPackageUnion getUsedODEPackage() {
    return this.UsedODEPackage;
  }

  public TDDIAbstractODEPackage setUsedODEPackage(TDDIODEPackageUnion UsedODEPackage) {
    this.UsedODEPackage = UsedODEPackage;
    return this;
  }

  public void unsetUsedODEPackage() {
    this.UsedODEPackage = null;
  }

  /** Returns true if field UsedODEPackage is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedODEPackage() {
    return this.UsedODEPackage != null;
  }

  public void setUsedODEPackageIsSet(boolean value) {
    if (!value) {
      this.UsedODEPackage = null;
    }
  }

  /**
   * 
   * @see TDDIODEPackageUnionType
   */
  public TDDIODEPackageUnionType getUsedODEPackageType() {
    return this.UsedODEPackageType;
  }

  /**
   * 
   * @see TDDIODEPackageUnionType
   */
  public TDDIAbstractODEPackage setUsedODEPackageType(TDDIODEPackageUnionType UsedODEPackageType) {
    this.UsedODEPackageType = UsedODEPackageType;
    return this;
  }

  public void unsetUsedODEPackageType() {
    this.UsedODEPackageType = null;
  }

  /** Returns true if field UsedODEPackageType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedODEPackageType() {
    return this.UsedODEPackageType != null;
  }

  public void setUsedODEPackageTypeIsSet(boolean value) {
    if (!value) {
      this.UsedODEPackageType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_ODEPACKAGE:
      if (value == null) {
        unsetUsedODEPackage();
      } else {
        setUsedODEPackage((TDDIODEPackageUnion)value);
      }
      break;

    case USED_ODEPACKAGE_TYPE:
      if (value == null) {
        unsetUsedODEPackageType();
      } else {
        setUsedODEPackageType((TDDIODEPackageUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_ODEPACKAGE:
      return getUsedODEPackage();

    case USED_ODEPACKAGE_TYPE:
      return getUsedODEPackageType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_ODEPACKAGE:
      return isSetUsedODEPackage();
    case USED_ODEPACKAGE_TYPE:
      return isSetUsedODEPackageType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractODEPackage)
      return this.equals((TDDIAbstractODEPackage)that);
    return false;
  }

  public boolean equals(TDDIAbstractODEPackage that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedODEPackage = true && this.isSetUsedODEPackage();
    boolean that_present_UsedODEPackage = true && that.isSetUsedODEPackage();
    if (this_present_UsedODEPackage || that_present_UsedODEPackage) {
      if (!(this_present_UsedODEPackage && that_present_UsedODEPackage))
        return false;
      if (!this.UsedODEPackage.equals(that.UsedODEPackage))
        return false;
    }

    boolean this_present_UsedODEPackageType = true && this.isSetUsedODEPackageType();
    boolean that_present_UsedODEPackageType = true && that.isSetUsedODEPackageType();
    if (this_present_UsedODEPackageType || that_present_UsedODEPackageType) {
      if (!(this_present_UsedODEPackageType && that_present_UsedODEPackageType))
        return false;
      if (!this.UsedODEPackageType.equals(that.UsedODEPackageType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedODEPackage()) ? 131071 : 524287);
    if (isSetUsedODEPackage())
      hashCode = hashCode * 8191 + UsedODEPackage.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedODEPackageType()) ? 131071 : 524287);
    if (isSetUsedODEPackageType())
      hashCode = hashCode * 8191 + UsedODEPackageType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractODEPackage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedODEPackage()).compareTo(other.isSetUsedODEPackage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedODEPackage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedODEPackage, other.UsedODEPackage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedODEPackageType()).compareTo(other.isSetUsedODEPackageType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedODEPackageType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedODEPackageType, other.UsedODEPackageType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractODEPackage(");
    boolean first = true;

    sb.append("UsedODEPackage:");
    if (this.UsedODEPackage == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedODEPackage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedODEPackageType:");
    if (this.UsedODEPackageType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedODEPackageType);
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

  private static class TDDIAbstractODEPackageStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractODEPackageStandardScheme getScheme() {
      return new TDDIAbstractODEPackageStandardScheme();
    }
  }

  private static class TDDIAbstractODEPackageStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractODEPackage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractODEPackage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_ODEPACKAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedODEPackage = new TDDIODEPackageUnion();
              struct.UsedODEPackage.read(iprot);
              struct.setUsedODEPackageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_ODEPACKAGE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedODEPackageType = thriftContract.TDDIODEPackageUnionType.findByValue(iprot.readI32());
              struct.setUsedODEPackageTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractODEPackage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedODEPackage != null) {
        oprot.writeFieldBegin(USED_ODEPACKAGE_FIELD_DESC);
        struct.UsedODEPackage.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedODEPackageType != null) {
        oprot.writeFieldBegin(USED_ODEPACKAGE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedODEPackageType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractODEPackageTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractODEPackageTupleScheme getScheme() {
      return new TDDIAbstractODEPackageTupleScheme();
    }
  }

  private static class TDDIAbstractODEPackageTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractODEPackage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractODEPackage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedODEPackage()) {
        optionals.set(0);
      }
      if (struct.isSetUsedODEPackageType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedODEPackage()) {
        struct.UsedODEPackage.write(oprot);
      }
      if (struct.isSetUsedODEPackageType()) {
        oprot.writeI32(struct.UsedODEPackageType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractODEPackage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedODEPackage = new TDDIODEPackageUnion();
        struct.UsedODEPackage.read(iprot);
        struct.setUsedODEPackageIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedODEPackageType = thriftContract.TDDIODEPackageUnionType.findByValue(iprot.readI32());
        struct.setUsedODEPackageTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

