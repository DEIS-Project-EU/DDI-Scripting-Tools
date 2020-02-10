/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-11-04")
public class TDDIAbstractAssuranceCasePackageRef implements org.apache.thrift.TBase<TDDIAbstractAssuranceCasePackageRef, TDDIAbstractAssuranceCasePackageRef._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractAssuranceCasePackageRef> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractAssuranceCasePackageRef");

  private static final org.apache.thrift.protocol.TField REF_FIELD_DESC = new org.apache.thrift.protocol.TField("ref", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractAssuranceCasePackageRefStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractAssuranceCasePackageRefTupleSchemeFactory();

  public TDDIAbstractAssuranceCasePackage ref; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REF((short)1, "ref");

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
        case 1: // REF
          return REF;
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
    tmpMap.put(_Fields.REF, new org.apache.thrift.meta_data.FieldMetaData("ref", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIAbstractAssuranceCasePackage")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractAssuranceCasePackageRef.class, metaDataMap);
  }

  public TDDIAbstractAssuranceCasePackageRef() {
  }

  public TDDIAbstractAssuranceCasePackageRef(
    TDDIAbstractAssuranceCasePackage ref)
  {
    this();
    this.ref = ref;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractAssuranceCasePackageRef(TDDIAbstractAssuranceCasePackageRef other) {
    if (other.isSetRef()) {
      this.ref = new TDDIAbstractAssuranceCasePackage(other.ref);
    }
  }

  public TDDIAbstractAssuranceCasePackageRef deepCopy() {
    return new TDDIAbstractAssuranceCasePackageRef(this);
  }

  @Override
  public void clear() {
    this.ref = null;
  }

  public TDDIAbstractAssuranceCasePackage getRef() {
    return this.ref;
  }

  public TDDIAbstractAssuranceCasePackageRef setRef(TDDIAbstractAssuranceCasePackage ref) {
    this.ref = ref;
    return this;
  }

  public void unsetRef() {
    this.ref = null;
  }

  /** Returns true if field ref is set (has been assigned a value) and false otherwise */
  public boolean isSetRef() {
    return this.ref != null;
  }

  public void setRefIsSet(boolean value) {
    if (!value) {
      this.ref = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case REF:
      if (value == null) {
        unsetRef();
      } else {
        setRef((TDDIAbstractAssuranceCasePackage)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case REF:
      return getRef();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case REF:
      return isSetRef();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractAssuranceCasePackageRef)
      return this.equals((TDDIAbstractAssuranceCasePackageRef)that);
    return false;
  }

  public boolean equals(TDDIAbstractAssuranceCasePackageRef that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_ref = true && this.isSetRef();
    boolean that_present_ref = true && that.isSetRef();
    if (this_present_ref || that_present_ref) {
      if (!(this_present_ref && that_present_ref))
        return false;
      if (!this.ref.equals(that.ref))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetRef()) ? 131071 : 524287);
    if (isSetRef())
      hashCode = hashCode * 8191 + ref.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractAssuranceCasePackageRef other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetRef()).compareTo(other.isSetRef());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRef()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ref, other.ref);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractAssuranceCasePackageRef(");
    boolean first = true;

    sb.append("ref:");
    if (this.ref == null) {
      sb.append("null");
    } else {
      sb.append(this.ref);
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

  private static class TDDIAbstractAssuranceCasePackageRefStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractAssuranceCasePackageRefStandardScheme getScheme() {
      return new TDDIAbstractAssuranceCasePackageRefStandardScheme();
    }
  }

  private static class TDDIAbstractAssuranceCasePackageRefStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractAssuranceCasePackageRef> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractAssuranceCasePackageRef struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REF
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.ref = new TDDIAbstractAssuranceCasePackage();
              struct.ref.read(iprot);
              struct.setRefIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractAssuranceCasePackageRef struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ref != null) {
        oprot.writeFieldBegin(REF_FIELD_DESC);
        struct.ref.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractAssuranceCasePackageRefTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractAssuranceCasePackageRefTupleScheme getScheme() {
      return new TDDIAbstractAssuranceCasePackageRefTupleScheme();
    }
  }

  private static class TDDIAbstractAssuranceCasePackageRefTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractAssuranceCasePackageRef> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractAssuranceCasePackageRef struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRef()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetRef()) {
        struct.ref.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractAssuranceCasePackageRef struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.ref = new TDDIAbstractAssuranceCasePackage();
        struct.ref.read(iprot);
        struct.setRefIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

