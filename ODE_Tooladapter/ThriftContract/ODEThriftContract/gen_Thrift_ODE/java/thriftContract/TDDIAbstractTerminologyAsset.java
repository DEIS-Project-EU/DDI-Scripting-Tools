/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-08-13")
public class TDDIAbstractTerminologyAsset implements org.apache.thrift.TBase<TDDIAbstractTerminologyAsset, TDDIAbstractTerminologyAsset._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractTerminologyAsset> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractTerminologyAsset");

  private static final org.apache.thrift.protocol.TField USED_TERMINOLOGY_ASSET_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedTerminologyAsset", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_TERMINOLOGY_ASSET_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedTerminologyAssetType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractTerminologyAssetStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractTerminologyAssetTupleSchemeFactory();

  public TDDITerminologyAssetUnion UsedTerminologyAsset; // required
  /**
   * 
   * @see TDDITerminologyAssetUnionType
   */
  public TDDITerminologyAssetUnionType UsedTerminologyAssetType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_TERMINOLOGY_ASSET((short)1, "UsedTerminologyAsset"),
    /**
     * 
     * @see TDDITerminologyAssetUnionType
     */
    USED_TERMINOLOGY_ASSET_TYPE((short)2, "UsedTerminologyAssetType");

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
        case 1: // USED_TERMINOLOGY_ASSET
          return USED_TERMINOLOGY_ASSET;
        case 2: // USED_TERMINOLOGY_ASSET_TYPE
          return USED_TERMINOLOGY_ASSET_TYPE;
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
    tmpMap.put(_Fields.USED_TERMINOLOGY_ASSET, new org.apache.thrift.meta_data.FieldMetaData("UsedTerminologyAsset", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDITerminologyAssetUnion.class)));
    tmpMap.put(_Fields.USED_TERMINOLOGY_ASSET_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedTerminologyAssetType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDITerminologyAssetUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractTerminologyAsset.class, metaDataMap);
  }

  public TDDIAbstractTerminologyAsset() {
  }

  public TDDIAbstractTerminologyAsset(
    TDDITerminologyAssetUnion UsedTerminologyAsset,
    TDDITerminologyAssetUnionType UsedTerminologyAssetType)
  {
    this();
    this.UsedTerminologyAsset = UsedTerminologyAsset;
    this.UsedTerminologyAssetType = UsedTerminologyAssetType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractTerminologyAsset(TDDIAbstractTerminologyAsset other) {
    if (other.isSetUsedTerminologyAsset()) {
      this.UsedTerminologyAsset = new TDDITerminologyAssetUnion(other.UsedTerminologyAsset);
    }
    if (other.isSetUsedTerminologyAssetType()) {
      this.UsedTerminologyAssetType = other.UsedTerminologyAssetType;
    }
  }

  public TDDIAbstractTerminologyAsset deepCopy() {
    return new TDDIAbstractTerminologyAsset(this);
  }

  @Override
  public void clear() {
    this.UsedTerminologyAsset = null;
    this.UsedTerminologyAssetType = null;
  }

  public TDDITerminologyAssetUnion getUsedTerminologyAsset() {
    return this.UsedTerminologyAsset;
  }

  public TDDIAbstractTerminologyAsset setUsedTerminologyAsset(TDDITerminologyAssetUnion UsedTerminologyAsset) {
    this.UsedTerminologyAsset = UsedTerminologyAsset;
    return this;
  }

  public void unsetUsedTerminologyAsset() {
    this.UsedTerminologyAsset = null;
  }

  /** Returns true if field UsedTerminologyAsset is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedTerminologyAsset() {
    return this.UsedTerminologyAsset != null;
  }

  public void setUsedTerminologyAssetIsSet(boolean value) {
    if (!value) {
      this.UsedTerminologyAsset = null;
    }
  }

  /**
   * 
   * @see TDDITerminologyAssetUnionType
   */
  public TDDITerminologyAssetUnionType getUsedTerminologyAssetType() {
    return this.UsedTerminologyAssetType;
  }

  /**
   * 
   * @see TDDITerminologyAssetUnionType
   */
  public TDDIAbstractTerminologyAsset setUsedTerminologyAssetType(TDDITerminologyAssetUnionType UsedTerminologyAssetType) {
    this.UsedTerminologyAssetType = UsedTerminologyAssetType;
    return this;
  }

  public void unsetUsedTerminologyAssetType() {
    this.UsedTerminologyAssetType = null;
  }

  /** Returns true if field UsedTerminologyAssetType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedTerminologyAssetType() {
    return this.UsedTerminologyAssetType != null;
  }

  public void setUsedTerminologyAssetTypeIsSet(boolean value) {
    if (!value) {
      this.UsedTerminologyAssetType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_TERMINOLOGY_ASSET:
      if (value == null) {
        unsetUsedTerminologyAsset();
      } else {
        setUsedTerminologyAsset((TDDITerminologyAssetUnion)value);
      }
      break;

    case USED_TERMINOLOGY_ASSET_TYPE:
      if (value == null) {
        unsetUsedTerminologyAssetType();
      } else {
        setUsedTerminologyAssetType((TDDITerminologyAssetUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_TERMINOLOGY_ASSET:
      return getUsedTerminologyAsset();

    case USED_TERMINOLOGY_ASSET_TYPE:
      return getUsedTerminologyAssetType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_TERMINOLOGY_ASSET:
      return isSetUsedTerminologyAsset();
    case USED_TERMINOLOGY_ASSET_TYPE:
      return isSetUsedTerminologyAssetType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractTerminologyAsset)
      return this.equals((TDDIAbstractTerminologyAsset)that);
    return false;
  }

  public boolean equals(TDDIAbstractTerminologyAsset that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedTerminologyAsset = true && this.isSetUsedTerminologyAsset();
    boolean that_present_UsedTerminologyAsset = true && that.isSetUsedTerminologyAsset();
    if (this_present_UsedTerminologyAsset || that_present_UsedTerminologyAsset) {
      if (!(this_present_UsedTerminologyAsset && that_present_UsedTerminologyAsset))
        return false;
      if (!this.UsedTerminologyAsset.equals(that.UsedTerminologyAsset))
        return false;
    }

    boolean this_present_UsedTerminologyAssetType = true && this.isSetUsedTerminologyAssetType();
    boolean that_present_UsedTerminologyAssetType = true && that.isSetUsedTerminologyAssetType();
    if (this_present_UsedTerminologyAssetType || that_present_UsedTerminologyAssetType) {
      if (!(this_present_UsedTerminologyAssetType && that_present_UsedTerminologyAssetType))
        return false;
      if (!this.UsedTerminologyAssetType.equals(that.UsedTerminologyAssetType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedTerminologyAsset()) ? 131071 : 524287);
    if (isSetUsedTerminologyAsset())
      hashCode = hashCode * 8191 + UsedTerminologyAsset.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedTerminologyAssetType()) ? 131071 : 524287);
    if (isSetUsedTerminologyAssetType())
      hashCode = hashCode * 8191 + UsedTerminologyAssetType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractTerminologyAsset other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedTerminologyAsset()).compareTo(other.isSetUsedTerminologyAsset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedTerminologyAsset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedTerminologyAsset, other.UsedTerminologyAsset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedTerminologyAssetType()).compareTo(other.isSetUsedTerminologyAssetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedTerminologyAssetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedTerminologyAssetType, other.UsedTerminologyAssetType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractTerminologyAsset(");
    boolean first = true;

    sb.append("UsedTerminologyAsset:");
    if (this.UsedTerminologyAsset == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedTerminologyAsset);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedTerminologyAssetType:");
    if (this.UsedTerminologyAssetType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedTerminologyAssetType);
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

  private static class TDDIAbstractTerminologyAssetStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractTerminologyAssetStandardScheme getScheme() {
      return new TDDIAbstractTerminologyAssetStandardScheme();
    }
  }

  private static class TDDIAbstractTerminologyAssetStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractTerminologyAsset> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractTerminologyAsset struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_TERMINOLOGY_ASSET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedTerminologyAsset = new TDDITerminologyAssetUnion();
              struct.UsedTerminologyAsset.read(iprot);
              struct.setUsedTerminologyAssetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_TERMINOLOGY_ASSET_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedTerminologyAssetType = thriftContract.TDDITerminologyAssetUnionType.findByValue(iprot.readI32());
              struct.setUsedTerminologyAssetTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractTerminologyAsset struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedTerminologyAsset != null) {
        oprot.writeFieldBegin(USED_TERMINOLOGY_ASSET_FIELD_DESC);
        struct.UsedTerminologyAsset.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedTerminologyAssetType != null) {
        oprot.writeFieldBegin(USED_TERMINOLOGY_ASSET_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedTerminologyAssetType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractTerminologyAssetTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractTerminologyAssetTupleScheme getScheme() {
      return new TDDIAbstractTerminologyAssetTupleScheme();
    }
  }

  private static class TDDIAbstractTerminologyAssetTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractTerminologyAsset> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractTerminologyAsset struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedTerminologyAsset()) {
        optionals.set(0);
      }
      if (struct.isSetUsedTerminologyAssetType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedTerminologyAsset()) {
        struct.UsedTerminologyAsset.write(oprot);
      }
      if (struct.isSetUsedTerminologyAssetType()) {
        oprot.writeI32(struct.UsedTerminologyAssetType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractTerminologyAsset struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedTerminologyAsset = new TDDITerminologyAssetUnion();
        struct.UsedTerminologyAsset.read(iprot);
        struct.setUsedTerminologyAssetIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedTerminologyAssetType = thriftContract.TDDITerminologyAssetUnionType.findByValue(iprot.readI32());
        struct.setUsedTerminologyAssetTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

