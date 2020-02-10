/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-11-04")
public class TDDIAbstractUtilityElement implements org.apache.thrift.TBase<TDDIAbstractUtilityElement, TDDIAbstractUtilityElement._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractUtilityElement> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractUtilityElement");

  private static final org.apache.thrift.protocol.TField USED_UTILITY_ELEMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedUtilityElement", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_UTILITY_ELEMENT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedUtilityElementType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractUtilityElementStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractUtilityElementTupleSchemeFactory();

  public TDDIUtilityElementUnion UsedUtilityElement; // required
  /**
   * 
   * @see TDDIUtilityElementUnionType
   */
  public TDDIUtilityElementUnionType UsedUtilityElementType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_UTILITY_ELEMENT((short)1, "UsedUtilityElement"),
    /**
     * 
     * @see TDDIUtilityElementUnionType
     */
    USED_UTILITY_ELEMENT_TYPE((short)2, "UsedUtilityElementType");

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
        case 1: // USED_UTILITY_ELEMENT
          return USED_UTILITY_ELEMENT;
        case 2: // USED_UTILITY_ELEMENT_TYPE
          return USED_UTILITY_ELEMENT_TYPE;
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
    tmpMap.put(_Fields.USED_UTILITY_ELEMENT, new org.apache.thrift.meta_data.FieldMetaData("UsedUtilityElement", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIUtilityElementUnion.class)));
    tmpMap.put(_Fields.USED_UTILITY_ELEMENT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedUtilityElementType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDIUtilityElementUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractUtilityElement.class, metaDataMap);
  }

  public TDDIAbstractUtilityElement() {
  }

  public TDDIAbstractUtilityElement(
    TDDIUtilityElementUnion UsedUtilityElement,
    TDDIUtilityElementUnionType UsedUtilityElementType)
  {
    this();
    this.UsedUtilityElement = UsedUtilityElement;
    this.UsedUtilityElementType = UsedUtilityElementType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractUtilityElement(TDDIAbstractUtilityElement other) {
    if (other.isSetUsedUtilityElement()) {
      this.UsedUtilityElement = new TDDIUtilityElementUnion(other.UsedUtilityElement);
    }
    if (other.isSetUsedUtilityElementType()) {
      this.UsedUtilityElementType = other.UsedUtilityElementType;
    }
  }

  public TDDIAbstractUtilityElement deepCopy() {
    return new TDDIAbstractUtilityElement(this);
  }

  @Override
  public void clear() {
    this.UsedUtilityElement = null;
    this.UsedUtilityElementType = null;
  }

  public TDDIUtilityElementUnion getUsedUtilityElement() {
    return this.UsedUtilityElement;
  }

  public TDDIAbstractUtilityElement setUsedUtilityElement(TDDIUtilityElementUnion UsedUtilityElement) {
    this.UsedUtilityElement = UsedUtilityElement;
    return this;
  }

  public void unsetUsedUtilityElement() {
    this.UsedUtilityElement = null;
  }

  /** Returns true if field UsedUtilityElement is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedUtilityElement() {
    return this.UsedUtilityElement != null;
  }

  public void setUsedUtilityElementIsSet(boolean value) {
    if (!value) {
      this.UsedUtilityElement = null;
    }
  }

  /**
   * 
   * @see TDDIUtilityElementUnionType
   */
  public TDDIUtilityElementUnionType getUsedUtilityElementType() {
    return this.UsedUtilityElementType;
  }

  /**
   * 
   * @see TDDIUtilityElementUnionType
   */
  public TDDIAbstractUtilityElement setUsedUtilityElementType(TDDIUtilityElementUnionType UsedUtilityElementType) {
    this.UsedUtilityElementType = UsedUtilityElementType;
    return this;
  }

  public void unsetUsedUtilityElementType() {
    this.UsedUtilityElementType = null;
  }

  /** Returns true if field UsedUtilityElementType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedUtilityElementType() {
    return this.UsedUtilityElementType != null;
  }

  public void setUsedUtilityElementTypeIsSet(boolean value) {
    if (!value) {
      this.UsedUtilityElementType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_UTILITY_ELEMENT:
      if (value == null) {
        unsetUsedUtilityElement();
      } else {
        setUsedUtilityElement((TDDIUtilityElementUnion)value);
      }
      break;

    case USED_UTILITY_ELEMENT_TYPE:
      if (value == null) {
        unsetUsedUtilityElementType();
      } else {
        setUsedUtilityElementType((TDDIUtilityElementUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_UTILITY_ELEMENT:
      return getUsedUtilityElement();

    case USED_UTILITY_ELEMENT_TYPE:
      return getUsedUtilityElementType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_UTILITY_ELEMENT:
      return isSetUsedUtilityElement();
    case USED_UTILITY_ELEMENT_TYPE:
      return isSetUsedUtilityElementType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractUtilityElement)
      return this.equals((TDDIAbstractUtilityElement)that);
    return false;
  }

  public boolean equals(TDDIAbstractUtilityElement that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedUtilityElement = true && this.isSetUsedUtilityElement();
    boolean that_present_UsedUtilityElement = true && that.isSetUsedUtilityElement();
    if (this_present_UsedUtilityElement || that_present_UsedUtilityElement) {
      if (!(this_present_UsedUtilityElement && that_present_UsedUtilityElement))
        return false;
      if (!this.UsedUtilityElement.equals(that.UsedUtilityElement))
        return false;
    }

    boolean this_present_UsedUtilityElementType = true && this.isSetUsedUtilityElementType();
    boolean that_present_UsedUtilityElementType = true && that.isSetUsedUtilityElementType();
    if (this_present_UsedUtilityElementType || that_present_UsedUtilityElementType) {
      if (!(this_present_UsedUtilityElementType && that_present_UsedUtilityElementType))
        return false;
      if (!this.UsedUtilityElementType.equals(that.UsedUtilityElementType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedUtilityElement()) ? 131071 : 524287);
    if (isSetUsedUtilityElement())
      hashCode = hashCode * 8191 + UsedUtilityElement.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedUtilityElementType()) ? 131071 : 524287);
    if (isSetUsedUtilityElementType())
      hashCode = hashCode * 8191 + UsedUtilityElementType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractUtilityElement other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedUtilityElement()).compareTo(other.isSetUsedUtilityElement());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedUtilityElement()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedUtilityElement, other.UsedUtilityElement);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedUtilityElementType()).compareTo(other.isSetUsedUtilityElementType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedUtilityElementType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedUtilityElementType, other.UsedUtilityElementType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractUtilityElement(");
    boolean first = true;

    sb.append("UsedUtilityElement:");
    if (this.UsedUtilityElement == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedUtilityElement);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedUtilityElementType:");
    if (this.UsedUtilityElementType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedUtilityElementType);
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

  private static class TDDIAbstractUtilityElementStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractUtilityElementStandardScheme getScheme() {
      return new TDDIAbstractUtilityElementStandardScheme();
    }
  }

  private static class TDDIAbstractUtilityElementStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractUtilityElement> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractUtilityElement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_UTILITY_ELEMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedUtilityElement = new TDDIUtilityElementUnion();
              struct.UsedUtilityElement.read(iprot);
              struct.setUsedUtilityElementIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_UTILITY_ELEMENT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedUtilityElementType = thriftContract.TDDIUtilityElementUnionType.findByValue(iprot.readI32());
              struct.setUsedUtilityElementTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractUtilityElement struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedUtilityElement != null) {
        oprot.writeFieldBegin(USED_UTILITY_ELEMENT_FIELD_DESC);
        struct.UsedUtilityElement.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedUtilityElementType != null) {
        oprot.writeFieldBegin(USED_UTILITY_ELEMENT_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedUtilityElementType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractUtilityElementTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractUtilityElementTupleScheme getScheme() {
      return new TDDIAbstractUtilityElementTupleScheme();
    }
  }

  private static class TDDIAbstractUtilityElementTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractUtilityElement> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractUtilityElement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedUtilityElement()) {
        optionals.set(0);
      }
      if (struct.isSetUsedUtilityElementType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedUtilityElement()) {
        struct.UsedUtilityElement.write(oprot);
      }
      if (struct.isSetUsedUtilityElementType()) {
        oprot.writeI32(struct.UsedUtilityElementType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractUtilityElement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedUtilityElement = new TDDIUtilityElementUnion();
        struct.UsedUtilityElement.read(iprot);
        struct.setUsedUtilityElementIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedUtilityElementType = thriftContract.TDDIUtilityElementUnionType.findByValue(iprot.readI32());
        struct.setUsedUtilityElementTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

