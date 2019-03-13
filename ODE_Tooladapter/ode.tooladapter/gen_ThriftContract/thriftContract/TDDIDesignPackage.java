/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-01-14")
public class TDDIDesignPackage implements org.apache.thrift.TBase<TDDIDesignPackage, TDDIDesignPackage._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIDesignPackage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIDesignPackage");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("Id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("Name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("Description", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField KEY_VALUE_MAPS_FIELD_DESC = new org.apache.thrift.protocol.TField("KeyValueMaps", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField SYSTEMS_FIELD_DESC = new org.apache.thrift.protocol.TField("Systems", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField FUNCTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("Functions", org.apache.thrift.protocol.TType.LIST, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIDesignPackageStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIDesignPackageTupleSchemeFactory();

  public long Id; // required
  public java.lang.String Name; // required
  public java.lang.String Description; // required
  public java.util.List<TDDIKeyValueMap> KeyValueMaps; // required
  public java.util.List<TDDIAbstractSystem> Systems; // required
  public java.util.List<TDDIAbstractFunction> Functions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "Id"),
    NAME((short)2, "Name"),
    DESCRIPTION((short)3, "Description"),
    KEY_VALUE_MAPS((short)4, "KeyValueMaps"),
    SYSTEMS((short)5, "Systems"),
    FUNCTIONS((short)6, "Functions");

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
        case 5: // SYSTEMS
          return SYSTEMS;
        case 6: // FUNCTIONS
          return FUNCTIONS;
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
    tmpMap.put(_Fields.SYSTEMS, new org.apache.thrift.meta_data.FieldMetaData("Systems", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIAbstractSystem.class))));
    tmpMap.put(_Fields.FUNCTIONS, new org.apache.thrift.meta_data.FieldMetaData("Functions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIAbstractFunction.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIDesignPackage.class, metaDataMap);
  }

  public TDDIDesignPackage() {
    this.Name = "";

    this.Description = "";

    this.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMap>();

    this.Systems = new java.util.ArrayList<TDDIAbstractSystem>();

    this.Functions = new java.util.ArrayList<TDDIAbstractFunction>();

  }

  public TDDIDesignPackage(
    long Id,
    java.lang.String Name,
    java.lang.String Description,
    java.util.List<TDDIKeyValueMap> KeyValueMaps,
    java.util.List<TDDIAbstractSystem> Systems,
    java.util.List<TDDIAbstractFunction> Functions)
  {
    this();
    this.Id = Id;
    setIdIsSet(true);
    this.Name = Name;
    this.Description = Description;
    this.KeyValueMaps = KeyValueMaps;
    this.Systems = Systems;
    this.Functions = Functions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIDesignPackage(TDDIDesignPackage other) {
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
    if (other.isSetSystems()) {
      java.util.List<TDDIAbstractSystem> __this__Systems = new java.util.ArrayList<TDDIAbstractSystem>(other.Systems.size());
      for (TDDIAbstractSystem other_element : other.Systems) {
        __this__Systems.add(new TDDIAbstractSystem(other_element));
      }
      this.Systems = __this__Systems;
    }
    if (other.isSetFunctions()) {
      java.util.List<TDDIAbstractFunction> __this__Functions = new java.util.ArrayList<TDDIAbstractFunction>(other.Functions.size());
      for (TDDIAbstractFunction other_element : other.Functions) {
        __this__Functions.add(new TDDIAbstractFunction(other_element));
      }
      this.Functions = __this__Functions;
    }
  }

  public TDDIDesignPackage deepCopy() {
    return new TDDIDesignPackage(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.Id = 0;
    this.Name = "";

    this.Description = "";

    this.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMap>();

    this.Systems = new java.util.ArrayList<TDDIAbstractSystem>();

    this.Functions = new java.util.ArrayList<TDDIAbstractFunction>();

  }

  public long getId() {
    return this.Id;
  }

  public TDDIDesignPackage setId(long Id) {
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

  public TDDIDesignPackage setName(java.lang.String Name) {
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

  public TDDIDesignPackage setDescription(java.lang.String Description) {
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

  public TDDIDesignPackage setKeyValueMaps(java.util.List<TDDIKeyValueMap> KeyValueMaps) {
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

  public int getSystemsSize() {
    return (this.Systems == null) ? 0 : this.Systems.size();
  }

  public java.util.Iterator<TDDIAbstractSystem> getSystemsIterator() {
    return (this.Systems == null) ? null : this.Systems.iterator();
  }

  public void addToSystems(TDDIAbstractSystem elem) {
    if (this.Systems == null) {
      this.Systems = new java.util.ArrayList<TDDIAbstractSystem>();
    }
    this.Systems.add(elem);
  }

  public java.util.List<TDDIAbstractSystem> getSystems() {
    return this.Systems;
  }

  public TDDIDesignPackage setSystems(java.util.List<TDDIAbstractSystem> Systems) {
    this.Systems = Systems;
    return this;
  }

  public void unsetSystems() {
    this.Systems = null;
  }

  /** Returns true if field Systems is set (has been assigned a value) and false otherwise */
  public boolean isSetSystems() {
    return this.Systems != null;
  }

  public void setSystemsIsSet(boolean value) {
    if (!value) {
      this.Systems = null;
    }
  }

  public int getFunctionsSize() {
    return (this.Functions == null) ? 0 : this.Functions.size();
  }

  public java.util.Iterator<TDDIAbstractFunction> getFunctionsIterator() {
    return (this.Functions == null) ? null : this.Functions.iterator();
  }

  public void addToFunctions(TDDIAbstractFunction elem) {
    if (this.Functions == null) {
      this.Functions = new java.util.ArrayList<TDDIAbstractFunction>();
    }
    this.Functions.add(elem);
  }

  public java.util.List<TDDIAbstractFunction> getFunctions() {
    return this.Functions;
  }

  public TDDIDesignPackage setFunctions(java.util.List<TDDIAbstractFunction> Functions) {
    this.Functions = Functions;
    return this;
  }

  public void unsetFunctions() {
    this.Functions = null;
  }

  /** Returns true if field Functions is set (has been assigned a value) and false otherwise */
  public boolean isSetFunctions() {
    return this.Functions != null;
  }

  public void setFunctionsIsSet(boolean value) {
    if (!value) {
      this.Functions = null;
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

    case SYSTEMS:
      if (value == null) {
        unsetSystems();
      } else {
        setSystems((java.util.List<TDDIAbstractSystem>)value);
      }
      break;

    case FUNCTIONS:
      if (value == null) {
        unsetFunctions();
      } else {
        setFunctions((java.util.List<TDDIAbstractFunction>)value);
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

    case SYSTEMS:
      return getSystems();

    case FUNCTIONS:
      return getFunctions();

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
    case SYSTEMS:
      return isSetSystems();
    case FUNCTIONS:
      return isSetFunctions();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIDesignPackage)
      return this.equals((TDDIDesignPackage)that);
    return false;
  }

  public boolean equals(TDDIDesignPackage that) {
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

    boolean this_present_Systems = true && this.isSetSystems();
    boolean that_present_Systems = true && that.isSetSystems();
    if (this_present_Systems || that_present_Systems) {
      if (!(this_present_Systems && that_present_Systems))
        return false;
      if (!this.Systems.equals(that.Systems))
        return false;
    }

    boolean this_present_Functions = true && this.isSetFunctions();
    boolean that_present_Functions = true && that.isSetFunctions();
    if (this_present_Functions || that_present_Functions) {
      if (!(this_present_Functions && that_present_Functions))
        return false;
      if (!this.Functions.equals(that.Functions))
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

    hashCode = hashCode * 8191 + ((isSetSystems()) ? 131071 : 524287);
    if (isSetSystems())
      hashCode = hashCode * 8191 + Systems.hashCode();

    hashCode = hashCode * 8191 + ((isSetFunctions()) ? 131071 : 524287);
    if (isSetFunctions())
      hashCode = hashCode * 8191 + Functions.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIDesignPackage other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetSystems()).compareTo(other.isSetSystems());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSystems()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Systems, other.Systems);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFunctions()).compareTo(other.isSetFunctions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFunctions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Functions, other.Functions);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIDesignPackage(");
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
    sb.append("Systems:");
    if (this.Systems == null) {
      sb.append("null");
    } else {
      sb.append(this.Systems);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Functions:");
    if (this.Functions == null) {
      sb.append("null");
    } else {
      sb.append(this.Functions);
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

  private static class TDDIDesignPackageStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIDesignPackageStandardScheme getScheme() {
      return new TDDIDesignPackageStandardScheme();
    }
  }

  private static class TDDIDesignPackageStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIDesignPackage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIDesignPackage struct) throws org.apache.thrift.TException {
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
                org.apache.thrift.protocol.TList _list688 = iprot.readListBegin();
                struct.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMap>(_list688.size);
                TDDIKeyValueMap _elem689;
                for (int _i690 = 0; _i690 < _list688.size; ++_i690)
                {
                  _elem689 = new TDDIKeyValueMap();
                  _elem689.read(iprot);
                  struct.KeyValueMaps.add(_elem689);
                }
                iprot.readListEnd();
              }
              struct.setKeyValueMapsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SYSTEMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list691 = iprot.readListBegin();
                struct.Systems = new java.util.ArrayList<TDDIAbstractSystem>(_list691.size);
                TDDIAbstractSystem _elem692;
                for (int _i693 = 0; _i693 < _list691.size; ++_i693)
                {
                  _elem692 = new TDDIAbstractSystem();
                  _elem692.read(iprot);
                  struct.Systems.add(_elem692);
                }
                iprot.readListEnd();
              }
              struct.setSystemsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // FUNCTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list694 = iprot.readListBegin();
                struct.Functions = new java.util.ArrayList<TDDIAbstractFunction>(_list694.size);
                TDDIAbstractFunction _elem695;
                for (int _i696 = 0; _i696 < _list694.size; ++_i696)
                {
                  _elem695 = new TDDIAbstractFunction();
                  _elem695.read(iprot);
                  struct.Functions.add(_elem695);
                }
                iprot.readListEnd();
              }
              struct.setFunctionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIDesignPackage struct) throws org.apache.thrift.TException {
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
          for (TDDIKeyValueMap _iter697 : struct.KeyValueMaps)
          {
            _iter697.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.Systems != null) {
        oprot.writeFieldBegin(SYSTEMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.Systems.size()));
          for (TDDIAbstractSystem _iter698 : struct.Systems)
          {
            _iter698.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.Functions != null) {
        oprot.writeFieldBegin(FUNCTIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.Functions.size()));
          for (TDDIAbstractFunction _iter699 : struct.Functions)
          {
            _iter699.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIDesignPackageTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIDesignPackageTupleScheme getScheme() {
      return new TDDIDesignPackageTupleScheme();
    }
  }

  private static class TDDIDesignPackageTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIDesignPackage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIDesignPackage struct) throws org.apache.thrift.TException {
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
      if (struct.isSetSystems()) {
        optionals.set(4);
      }
      if (struct.isSetFunctions()) {
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
          for (TDDIKeyValueMap _iter700 : struct.KeyValueMaps)
          {
            _iter700.write(oprot);
          }
        }
      }
      if (struct.isSetSystems()) {
        {
          oprot.writeI32(struct.Systems.size());
          for (TDDIAbstractSystem _iter701 : struct.Systems)
          {
            _iter701.write(oprot);
          }
        }
      }
      if (struct.isSetFunctions()) {
        {
          oprot.writeI32(struct.Functions.size());
          for (TDDIAbstractFunction _iter702 : struct.Functions)
          {
            _iter702.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIDesignPackage struct) throws org.apache.thrift.TException {
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
          org.apache.thrift.protocol.TList _list703 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMap>(_list703.size);
          TDDIKeyValueMap _elem704;
          for (int _i705 = 0; _i705 < _list703.size; ++_i705)
          {
            _elem704 = new TDDIKeyValueMap();
            _elem704.read(iprot);
            struct.KeyValueMaps.add(_elem704);
          }
        }
        struct.setKeyValueMapsIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list706 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.Systems = new java.util.ArrayList<TDDIAbstractSystem>(_list706.size);
          TDDIAbstractSystem _elem707;
          for (int _i708 = 0; _i708 < _list706.size; ++_i708)
          {
            _elem707 = new TDDIAbstractSystem();
            _elem707.read(iprot);
            struct.Systems.add(_elem707);
          }
        }
        struct.setSystemsIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TList _list709 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.Functions = new java.util.ArrayList<TDDIAbstractFunction>(_list709.size);
          TDDIAbstractFunction _elem710;
          for (int _i711 = 0; _i711 < _list709.size; ++_i711)
          {
            _elem710 = new TDDIAbstractFunction();
            _elem710.read(iprot);
            struct.Functions.add(_elem710);
          }
        }
        struct.setFunctionsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

