/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-01-14")
public class TDDIEpsilonParameter implements org.apache.thrift.TBase<TDDIEpsilonParameter, TDDIEpsilonParameter._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIEpsilonParameter> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIEpsilonParameter");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("Name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ALIAS_FIELD_DESC = new org.apache.thrift.protocol.TField("Alias", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIEpsilonParameterStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIEpsilonParameterTupleSchemeFactory();

  public java.lang.String Name; // required
  public java.lang.String Alias; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "Name"),
    ALIAS((short)2, "Alias");

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
        case 1: // NAME
          return NAME;
        case 2: // ALIAS
          return ALIAS;
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
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("Name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ALIAS, new org.apache.thrift.meta_data.FieldMetaData("Alias", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIEpsilonParameter.class, metaDataMap);
  }

  public TDDIEpsilonParameter() {
    this.Name = "";

    this.Alias = "";

  }

  public TDDIEpsilonParameter(
    java.lang.String Name,
    java.lang.String Alias)
  {
    this();
    this.Name = Name;
    this.Alias = Alias;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIEpsilonParameter(TDDIEpsilonParameter other) {
    if (other.isSetName()) {
      this.Name = other.Name;
    }
    if (other.isSetAlias()) {
      this.Alias = other.Alias;
    }
  }

  public TDDIEpsilonParameter deepCopy() {
    return new TDDIEpsilonParameter(this);
  }

  @Override
  public void clear() {
    this.Name = "";

    this.Alias = "";

  }

  public java.lang.String getName() {
    return this.Name;
  }

  public TDDIEpsilonParameter setName(java.lang.String Name) {
    this.Name = Name;
    return this;
  }

  public void unsetName() {
    this.Name = null;
  }

  /** Returns true if field Name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.Name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.Name = null;
    }
  }

  public java.lang.String getAlias() {
    return this.Alias;
  }

  public TDDIEpsilonParameter setAlias(java.lang.String Alias) {
    this.Alias = Alias;
    return this;
  }

  public void unsetAlias() {
    this.Alias = null;
  }

  /** Returns true if field Alias is set (has been assigned a value) and false otherwise */
  public boolean isSetAlias() {
    return this.Alias != null;
  }

  public void setAliasIsSet(boolean value) {
    if (!value) {
      this.Alias = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case ALIAS:
      if (value == null) {
        unsetAlias();
      } else {
        setAlias((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case ALIAS:
      return getAlias();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case ALIAS:
      return isSetAlias();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIEpsilonParameter)
      return this.equals((TDDIEpsilonParameter)that);
    return false;
  }

  public boolean equals(TDDIEpsilonParameter that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_Name = true && this.isSetName();
    boolean that_present_Name = true && that.isSetName();
    if (this_present_Name || that_present_Name) {
      if (!(this_present_Name && that_present_Name))
        return false;
      if (!this.Name.equals(that.Name))
        return false;
    }

    boolean this_present_Alias = true && this.isSetAlias();
    boolean that_present_Alias = true && that.isSetAlias();
    if (this_present_Alias || that_present_Alias) {
      if (!(this_present_Alias && that_present_Alias))
        return false;
      if (!this.Alias.equals(that.Alias))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + Name.hashCode();

    hashCode = hashCode * 8191 + ((isSetAlias()) ? 131071 : 524287);
    if (isSetAlias())
      hashCode = hashCode * 8191 + Alias.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIEpsilonParameter other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Name, other.Name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAlias()).compareTo(other.isSetAlias());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAlias()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Alias, other.Alias);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIEpsilonParameter(");
    boolean first = true;

    sb.append("Name:");
    if (this.Name == null) {
      sb.append("null");
    } else {
      sb.append(this.Name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Alias:");
    if (this.Alias == null) {
      sb.append("null");
    } else {
      sb.append(this.Alias);
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

  private static class TDDIEpsilonParameterStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIEpsilonParameterStandardScheme getScheme() {
      return new TDDIEpsilonParameterStandardScheme();
    }
  }

  private static class TDDIEpsilonParameterStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIEpsilonParameter> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIEpsilonParameter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ALIAS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Alias = iprot.readString();
              struct.setAliasIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIEpsilonParameter struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.Name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.Name);
        oprot.writeFieldEnd();
      }
      if (struct.Alias != null) {
        oprot.writeFieldBegin(ALIAS_FIELD_DESC);
        oprot.writeString(struct.Alias);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIEpsilonParameterTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIEpsilonParameterTupleScheme getScheme() {
      return new TDDIEpsilonParameterTupleScheme();
    }
  }

  private static class TDDIEpsilonParameterTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIEpsilonParameter> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIEpsilonParameter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetAlias()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetName()) {
        oprot.writeString(struct.Name);
      }
      if (struct.isSetAlias()) {
        oprot.writeString(struct.Alias);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIEpsilonParameter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.Name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.Alias = iprot.readString();
        struct.setAliasIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

