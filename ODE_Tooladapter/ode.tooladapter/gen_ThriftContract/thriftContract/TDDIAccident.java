/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-01-14")
public class TDDIAccident implements org.apache.thrift.TBase<TDDIAccident, TDDIAccident._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAccident> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAccident");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("Id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("Name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("Description", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField KEY_VALUE_MAPS_FIELD_DESC = new org.apache.thrift.protocol.TField("KeyValueMaps", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField ARGUMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("Argument", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField SEVERITY_FIELD_DESC = new org.apache.thrift.protocol.TField("Severity", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAccidentStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAccidentTupleSchemeFactory();

  public long Id; // required
  public java.lang.String Name; // required
  public java.lang.String Description; // required
  public java.util.List<TDDIKeyValueMap> KeyValueMaps; // required
  public java.lang.String Argument; // required
  public java.lang.String Severity; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "Id"),
    NAME((short)2, "Name"),
    DESCRIPTION((short)3, "Description"),
    KEY_VALUE_MAPS((short)4, "KeyValueMaps"),
    ARGUMENT((short)5, "Argument"),
    SEVERITY((short)6, "Severity");

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
        case 1: // ID
          return ID;
        case 2: // NAME
          return NAME;
        case 3: // DESCRIPTION
          return DESCRIPTION;
        case 4: // KEY_VALUE_MAPS
          return KEY_VALUE_MAPS;
        case 5: // ARGUMENT
          return ARGUMENT;
        case 6: // SEVERITY
          return SEVERITY;
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
  private static final int __ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("Id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("Name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("Description", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.KEY_VALUE_MAPS, new org.apache.thrift.meta_data.FieldMetaData("KeyValueMaps", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIKeyValueMap.class))));
    tmpMap.put(_Fields.ARGUMENT, new org.apache.thrift.meta_data.FieldMetaData("Argument", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEVERITY, new org.apache.thrift.meta_data.FieldMetaData("Severity", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAccident.class, metaDataMap);
  }

  public TDDIAccident() {
    this.Name = "";

    this.Description = "";

    this.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMap>();

    this.Argument = "";

    this.Severity = "";

  }

  public TDDIAccident(
    long Id,
    java.lang.String Name,
    java.lang.String Description,
    java.util.List<TDDIKeyValueMap> KeyValueMaps,
    java.lang.String Argument,
    java.lang.String Severity)
  {
    this();
    this.Id = Id;
    setIdIsSet(true);
    this.Name = Name;
    this.Description = Description;
    this.KeyValueMaps = KeyValueMaps;
    this.Argument = Argument;
    this.Severity = Severity;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAccident(TDDIAccident other) {
    __isset_bitfield = other.__isset_bitfield;
    this.Id = other.Id;
    if (other.isSetName()) {
      this.Name = other.Name;
    }
    if (other.isSetDescription()) {
      this.Description = other.Description;
    }
    if (other.isSetKeyValueMaps()) {
      java.util.List<TDDIKeyValueMap> __this__KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMap>(other.KeyValueMaps.size());
      for (TDDIKeyValueMap other_element : other.KeyValueMaps) {
        __this__KeyValueMaps.add(new TDDIKeyValueMap(other_element));
      }
      this.KeyValueMaps = __this__KeyValueMaps;
    }
    if (other.isSetArgument()) {
      this.Argument = other.Argument;
    }
    if (other.isSetSeverity()) {
      this.Severity = other.Severity;
    }
  }

  public TDDIAccident deepCopy() {
    return new TDDIAccident(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.Id = 0;
    this.Name = "";

    this.Description = "";

    this.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMap>();

    this.Argument = "";

    this.Severity = "";

  }

  public long getId() {
    return this.Id;
  }

  public TDDIAccident setId(long Id) {
    this.Id = Id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field Id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public java.lang.String getName() {
    return this.Name;
  }

  public TDDIAccident setName(java.lang.String Name) {
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

  public java.lang.String getDescription() {
    return this.Description;
  }

  public TDDIAccident setDescription(java.lang.String Description) {
    this.Description = Description;
    return this;
  }

  public void unsetDescription() {
    this.Description = null;
  }

  /** Returns true if field Description is set (has been assigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.Description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.Description = null;
    }
  }

  public int getKeyValueMapsSize() {
    return (this.KeyValueMaps == null) ? 0 : this.KeyValueMaps.size();
  }

  public java.util.Iterator<TDDIKeyValueMap> getKeyValueMapsIterator() {
    return (this.KeyValueMaps == null) ? null : this.KeyValueMaps.iterator();
  }

  public void addToKeyValueMaps(TDDIKeyValueMap elem) {
    if (this.KeyValueMaps == null) {
      this.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMap>();
    }
    this.KeyValueMaps.add(elem);
  }

  public java.util.List<TDDIKeyValueMap> getKeyValueMaps() {
    return this.KeyValueMaps;
  }

  public TDDIAccident setKeyValueMaps(java.util.List<TDDIKeyValueMap> KeyValueMaps) {
    this.KeyValueMaps = KeyValueMaps;
    return this;
  }

  public void unsetKeyValueMaps() {
    this.KeyValueMaps = null;
  }

  /** Returns true if field KeyValueMaps is set (has been assigned a value) and false otherwise */
  public boolean isSetKeyValueMaps() {
    return this.KeyValueMaps != null;
  }

  public void setKeyValueMapsIsSet(boolean value) {
    if (!value) {
      this.KeyValueMaps = null;
    }
  }

  public java.lang.String getArgument() {
    return this.Argument;
  }

  public TDDIAccident setArgument(java.lang.String Argument) {
    this.Argument = Argument;
    return this;
  }

  public void unsetArgument() {
    this.Argument = null;
  }

  /** Returns true if field Argument is set (has been assigned a value) and false otherwise */
  public boolean isSetArgument() {
    return this.Argument != null;
  }

  public void setArgumentIsSet(boolean value) {
    if (!value) {
      this.Argument = null;
    }
  }

  public java.lang.String getSeverity() {
    return this.Severity;
  }

  public TDDIAccident setSeverity(java.lang.String Severity) {
    this.Severity = Severity;
    return this;
  }

  public void unsetSeverity() {
    this.Severity = null;
  }

  /** Returns true if field Severity is set (has been assigned a value) and false otherwise */
  public boolean isSetSeverity() {
    return this.Severity != null;
  }

  public void setSeverityIsSet(boolean value) {
    if (!value) {
      this.Severity = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Long)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((java.lang.String)value);
      }
      break;

    case KEY_VALUE_MAPS:
      if (value == null) {
        unsetKeyValueMaps();
      } else {
        setKeyValueMaps((java.util.List<TDDIKeyValueMap>)value);
      }
      break;

    case ARGUMENT:
      if (value == null) {
        unsetArgument();
      } else {
        setArgument((java.lang.String)value);
      }
      break;

    case SEVERITY:
      if (value == null) {
        unsetSeverity();
      } else {
        setSeverity((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case NAME:
      return getName();

    case DESCRIPTION:
      return getDescription();

    case KEY_VALUE_MAPS:
      return getKeyValueMaps();

    case ARGUMENT:
      return getArgument();

    case SEVERITY:
      return getSeverity();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case NAME:
      return isSetName();
    case DESCRIPTION:
      return isSetDescription();
    case KEY_VALUE_MAPS:
      return isSetKeyValueMaps();
    case ARGUMENT:
      return isSetArgument();
    case SEVERITY:
      return isSetSeverity();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAccident)
      return this.equals((TDDIAccident)that);
    return false;
  }

  public boolean equals(TDDIAccident that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_Id = true;
    boolean that_present_Id = true;
    if (this_present_Id || that_present_Id) {
      if (!(this_present_Id && that_present_Id))
        return false;
      if (this.Id != that.Id)
        return false;
    }

    boolean this_present_Name = true && this.isSetName();
    boolean that_present_Name = true && that.isSetName();
    if (this_present_Name || that_present_Name) {
      if (!(this_present_Name && that_present_Name))
        return false;
      if (!this.Name.equals(that.Name))
        return false;
    }

    boolean this_present_Description = true && this.isSetDescription();
    boolean that_present_Description = true && that.isSetDescription();
    if (this_present_Description || that_present_Description) {
      if (!(this_present_Description && that_present_Description))
        return false;
      if (!this.Description.equals(that.Description))
        return false;
    }

    boolean this_present_KeyValueMaps = true && this.isSetKeyValueMaps();
    boolean that_present_KeyValueMaps = true && that.isSetKeyValueMaps();
    if (this_present_KeyValueMaps || that_present_KeyValueMaps) {
      if (!(this_present_KeyValueMaps && that_present_KeyValueMaps))
        return false;
      if (!this.KeyValueMaps.equals(that.KeyValueMaps))
        return false;
    }

    boolean this_present_Argument = true && this.isSetArgument();
    boolean that_present_Argument = true && that.isSetArgument();
    if (this_present_Argument || that_present_Argument) {
      if (!(this_present_Argument && that_present_Argument))
        return false;
      if (!this.Argument.equals(that.Argument))
        return false;
    }

    boolean this_present_Severity = true && this.isSetSeverity();
    boolean that_present_Severity = true && that.isSetSeverity();
    if (this_present_Severity || that_present_Severity) {
      if (!(this_present_Severity && that_present_Severity))
        return false;
      if (!this.Severity.equals(that.Severity))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(Id);

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + Name.hashCode();

    hashCode = hashCode * 8191 + ((isSetDescription()) ? 131071 : 524287);
    if (isSetDescription())
      hashCode = hashCode * 8191 + Description.hashCode();

    hashCode = hashCode * 8191 + ((isSetKeyValueMaps()) ? 131071 : 524287);
    if (isSetKeyValueMaps())
      hashCode = hashCode * 8191 + KeyValueMaps.hashCode();

    hashCode = hashCode * 8191 + ((isSetArgument()) ? 131071 : 524287);
    if (isSetArgument())
      hashCode = hashCode * 8191 + Argument.hashCode();

    hashCode = hashCode * 8191 + ((isSetSeverity()) ? 131071 : 524287);
    if (isSetSeverity())
      hashCode = hashCode * 8191 + Severity.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAccident other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Id, other.Id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = java.lang.Boolean.valueOf(isSetDescription()).compareTo(other.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Description, other.Description);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetKeyValueMaps()).compareTo(other.isSetKeyValueMaps());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeyValueMaps()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.KeyValueMaps, other.KeyValueMaps);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetArgument()).compareTo(other.isSetArgument());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArgument()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Argument, other.Argument);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSeverity()).compareTo(other.isSetSeverity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSeverity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Severity, other.Severity);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAccident(");
    boolean first = true;

    sb.append("Id:");
    sb.append(this.Id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("Name:");
    if (this.Name == null) {
      sb.append("null");
    } else {
      sb.append(this.Name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Description:");
    if (this.Description == null) {
      sb.append("null");
    } else {
      sb.append(this.Description);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("KeyValueMaps:");
    if (this.KeyValueMaps == null) {
      sb.append("null");
    } else {
      sb.append(this.KeyValueMaps);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Argument:");
    if (this.Argument == null) {
      sb.append("null");
    } else {
      sb.append(this.Argument);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Severity:");
    if (this.Severity == null) {
      sb.append("null");
    } else {
      sb.append(this.Severity);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TDDIAccidentStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAccidentStandardScheme getScheme() {
      return new TDDIAccidentStandardScheme();
    }
  }

  private static class TDDIAccidentStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAccident> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAccident struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.Id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Description = iprot.readString();
              struct.setDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // KEY_VALUE_MAPS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list1072 = iprot.readListBegin();
                struct.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMap>(_list1072.size);
                TDDIKeyValueMap _elem1073;
                for (int _i1074 = 0; _i1074 < _list1072.size; ++_i1074)
                {
                  _elem1073 = new TDDIKeyValueMap();
                  _elem1073.read(iprot);
                  struct.KeyValueMaps.add(_elem1073);
                }
                iprot.readListEnd();
              }
              struct.setKeyValueMapsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ARGUMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Argument = iprot.readString();
              struct.setArgumentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SEVERITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Severity = iprot.readString();
              struct.setSeverityIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAccident struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI64(struct.Id);
      oprot.writeFieldEnd();
      if (struct.Name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.Name);
        oprot.writeFieldEnd();
      }
      if (struct.Description != null) {
        oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
        oprot.writeString(struct.Description);
        oprot.writeFieldEnd();
      }
      if (struct.KeyValueMaps != null) {
        oprot.writeFieldBegin(KEY_VALUE_MAPS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.KeyValueMaps.size()));
          for (TDDIKeyValueMap _iter1075 : struct.KeyValueMaps)
          {
            _iter1075.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.Argument != null) {
        oprot.writeFieldBegin(ARGUMENT_FIELD_DESC);
        oprot.writeString(struct.Argument);
        oprot.writeFieldEnd();
      }
      if (struct.Severity != null) {
        oprot.writeFieldBegin(SEVERITY_FIELD_DESC);
        oprot.writeString(struct.Severity);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAccidentTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAccidentTupleScheme getScheme() {
      return new TDDIAccidentTupleScheme();
    }
  }

  private static class TDDIAccidentTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAccident> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAccident struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetDescription()) {
        optionals.set(2);
      }
      if (struct.isSetKeyValueMaps()) {
        optionals.set(3);
      }
      if (struct.isSetArgument()) {
        optionals.set(4);
      }
      if (struct.isSetSeverity()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeI64(struct.Id);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.Name);
      }
      if (struct.isSetDescription()) {
        oprot.writeString(struct.Description);
      }
      if (struct.isSetKeyValueMaps()) {
        {
          oprot.writeI32(struct.KeyValueMaps.size());
          for (TDDIKeyValueMap _iter1076 : struct.KeyValueMaps)
          {
            _iter1076.write(oprot);
          }
        }
      }
      if (struct.isSetArgument()) {
        oprot.writeString(struct.Argument);
      }
      if (struct.isSetSeverity()) {
        oprot.writeString(struct.Severity);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAccident struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.Id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.Name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.Description = iprot.readString();
        struct.setDescriptionIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list1077 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMap>(_list1077.size);
          TDDIKeyValueMap _elem1078;
          for (int _i1079 = 0; _i1079 < _list1077.size; ++_i1079)
          {
            _elem1078 = new TDDIKeyValueMap();
            _elem1078.read(iprot);
            struct.KeyValueMaps.add(_elem1078);
          }
        }
        struct.setKeyValueMapsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.Argument = iprot.readString();
        struct.setArgumentIsSet(true);
      }
      if (incoming.get(5)) {
        struct.Severity = iprot.readString();
        struct.setSeverityIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

