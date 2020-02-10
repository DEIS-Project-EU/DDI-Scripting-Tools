/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-08-13")
public class TDDIAbstractSACMElement implements org.apache.thrift.TBase<TDDIAbstractSACMElement, TDDIAbstractSACMElement._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractSACMElement> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractSACMElement");

  private static final org.apache.thrift.protocol.TField USED_SACMELEMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedSACMElement", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_SACMELEMENT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedSACMElementType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractSACMElementStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractSACMElementTupleSchemeFactory();

  public TDDISACMElementUnion UsedSACMElement; // required
  /**
   * 
   * @see TDDISACMElementUnionType
   */
  public TDDISACMElementUnionType UsedSACMElementType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_SACMELEMENT((short)1, "UsedSACMElement"),
    /**
     * 
     * @see TDDISACMElementUnionType
     */
    USED_SACMELEMENT_TYPE((short)2, "UsedSACMElementType");

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
        case 1: // USED_SACMELEMENT
          return USED_SACMELEMENT;
        case 2: // USED_SACMELEMENT_TYPE
          return USED_SACMELEMENT_TYPE;
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
    tmpMap.put(_Fields.USED_SACMELEMENT, new org.apache.thrift.meta_data.FieldMetaData("UsedSACMElement", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDISACMElementUnion.class)));
    tmpMap.put(_Fields.USED_SACMELEMENT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedSACMElementType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDISACMElementUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractSACMElement.class, metaDataMap);
  }

  public TDDIAbstractSACMElement() {
  }

  public TDDIAbstractSACMElement(
    TDDISACMElementUnion UsedSACMElement,
    TDDISACMElementUnionType UsedSACMElementType)
  {
    this();
    this.UsedSACMElement = UsedSACMElement;
    this.UsedSACMElementType = UsedSACMElementType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractSACMElement(TDDIAbstractSACMElement other) {
    if (other.isSetUsedSACMElement()) {
      this.UsedSACMElement = new TDDISACMElementUnion(other.UsedSACMElement);
    }
    if (other.isSetUsedSACMElementType()) {
      this.UsedSACMElementType = other.UsedSACMElementType;
    }
  }

  public TDDIAbstractSACMElement deepCopy() {
    return new TDDIAbstractSACMElement(this);
  }

  @Override
  public void clear() {
    this.UsedSACMElement = null;
    this.UsedSACMElementType = null;
  }

  public TDDISACMElementUnion getUsedSACMElement() {
    return this.UsedSACMElement;
  }

  public TDDIAbstractSACMElement setUsedSACMElement(TDDISACMElementUnion UsedSACMElement) {
    this.UsedSACMElement = UsedSACMElement;
    return this;
  }

  public void unsetUsedSACMElement() {
    this.UsedSACMElement = null;
  }

  /** Returns true if field UsedSACMElement is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedSACMElement() {
    return this.UsedSACMElement != null;
  }

  public void setUsedSACMElementIsSet(boolean value) {
    if (!value) {
      this.UsedSACMElement = null;
    }
  }

  /**
   * 
   * @see TDDISACMElementUnionType
   */
  public TDDISACMElementUnionType getUsedSACMElementType() {
    return this.UsedSACMElementType;
  }

  /**
   * 
   * @see TDDISACMElementUnionType
   */
  public TDDIAbstractSACMElement setUsedSACMElementType(TDDISACMElementUnionType UsedSACMElementType) {
    this.UsedSACMElementType = UsedSACMElementType;
    return this;
  }

  public void unsetUsedSACMElementType() {
    this.UsedSACMElementType = null;
  }

  /** Returns true if field UsedSACMElementType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedSACMElementType() {
    return this.UsedSACMElementType != null;
  }

  public void setUsedSACMElementTypeIsSet(boolean value) {
    if (!value) {
      this.UsedSACMElementType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_SACMELEMENT:
      if (value == null) {
        unsetUsedSACMElement();
      } else {
        setUsedSACMElement((TDDISACMElementUnion)value);
      }
      break;

    case USED_SACMELEMENT_TYPE:
      if (value == null) {
        unsetUsedSACMElementType();
      } else {
        setUsedSACMElementType((TDDISACMElementUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_SACMELEMENT:
      return getUsedSACMElement();

    case USED_SACMELEMENT_TYPE:
      return getUsedSACMElementType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_SACMELEMENT:
      return isSetUsedSACMElement();
    case USED_SACMELEMENT_TYPE:
      return isSetUsedSACMElementType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractSACMElement)
      return this.equals((TDDIAbstractSACMElement)that);
    return false;
  }

  public boolean equals(TDDIAbstractSACMElement that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedSACMElement = true && this.isSetUsedSACMElement();
    boolean that_present_UsedSACMElement = true && that.isSetUsedSACMElement();
    if (this_present_UsedSACMElement || that_present_UsedSACMElement) {
      if (!(this_present_UsedSACMElement && that_present_UsedSACMElement))
        return false;
      if (!this.UsedSACMElement.equals(that.UsedSACMElement))
        return false;
    }

    boolean this_present_UsedSACMElementType = true && this.isSetUsedSACMElementType();
    boolean that_present_UsedSACMElementType = true && that.isSetUsedSACMElementType();
    if (this_present_UsedSACMElementType || that_present_UsedSACMElementType) {
      if (!(this_present_UsedSACMElementType && that_present_UsedSACMElementType))
        return false;
      if (!this.UsedSACMElementType.equals(that.UsedSACMElementType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedSACMElement()) ? 131071 : 524287);
    if (isSetUsedSACMElement())
      hashCode = hashCode * 8191 + UsedSACMElement.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedSACMElementType()) ? 131071 : 524287);
    if (isSetUsedSACMElementType())
      hashCode = hashCode * 8191 + UsedSACMElementType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractSACMElement other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedSACMElement()).compareTo(other.isSetUsedSACMElement());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedSACMElement()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedSACMElement, other.UsedSACMElement);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedSACMElementType()).compareTo(other.isSetUsedSACMElementType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedSACMElementType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedSACMElementType, other.UsedSACMElementType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractSACMElement(");
    boolean first = true;

    sb.append("UsedSACMElement:");
    if (this.UsedSACMElement == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedSACMElement);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedSACMElementType:");
    if (this.UsedSACMElementType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedSACMElementType);
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

  private static class TDDIAbstractSACMElementStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractSACMElementStandardScheme getScheme() {
      return new TDDIAbstractSACMElementStandardScheme();
    }
  }

  private static class TDDIAbstractSACMElementStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractSACMElement> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractSACMElement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_SACMELEMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedSACMElement = new TDDISACMElementUnion();
              struct.UsedSACMElement.read(iprot);
              struct.setUsedSACMElementIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_SACMELEMENT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedSACMElementType = thriftContract.TDDISACMElementUnionType.findByValue(iprot.readI32());
              struct.setUsedSACMElementTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractSACMElement struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedSACMElement != null) {
        oprot.writeFieldBegin(USED_SACMELEMENT_FIELD_DESC);
        struct.UsedSACMElement.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedSACMElementType != null) {
        oprot.writeFieldBegin(USED_SACMELEMENT_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedSACMElementType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractSACMElementTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractSACMElementTupleScheme getScheme() {
      return new TDDIAbstractSACMElementTupleScheme();
    }
  }

  private static class TDDIAbstractSACMElementTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractSACMElement> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractSACMElement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedSACMElement()) {
        optionals.set(0);
      }
      if (struct.isSetUsedSACMElementType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedSACMElement()) {
        struct.UsedSACMElement.write(oprot);
      }
      if (struct.isSetUsedSACMElementType()) {
        oprot.writeI32(struct.UsedSACMElementType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractSACMElement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedSACMElement = new TDDISACMElementUnion();
        struct.UsedSACMElement.read(iprot);
        struct.setUsedSACMElementIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedSACMElementType = thriftContract.TDDISACMElementUnionType.findByValue(iprot.readI32());
        struct.setUsedSACMElementTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

