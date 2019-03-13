/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-01-14")
public class TDDISecurityCapability implements org.apache.thrift.TBase<TDDISecurityCapability, TDDISecurityCapability._Fields>, java.io.Serializable, Cloneable, Comparable<TDDISecurityCapability> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDISecurityCapability");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("Id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("Name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("Description", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField KEY_VALUE_MAPS_FIELD_DESC = new org.apache.thrift.protocol.TField("KeyValueMaps", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField CATEGORY_FIELD_DESC = new org.apache.thrift.protocol.TField("Category", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("Type", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField IMPLEMENTED_BY_FIELD_DESC = new org.apache.thrift.protocol.TField("ImplementedBy", org.apache.thrift.protocol.TType.LIST, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDISecurityCapabilityStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDISecurityCapabilityTupleSchemeFactory();

  public long Id; // required
  public java.lang.String Name; // required
  public java.lang.String Description; // required
  public java.util.List<TDDIKeyValueMap> KeyValueMaps; // required
  public java.lang.String Category; // required
  /**
   * 
   * @see TDDISecurityApplicationType
   */
  public TDDISecurityApplicationType Type; // required
  public java.util.List<TDDISecurityControlRef> ImplementedBy; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "Id"),
    NAME((short)2, "Name"),
    DESCRIPTION((short)3, "Description"),
    KEY_VALUE_MAPS((short)4, "KeyValueMaps"),
    CATEGORY((short)5, "Category"),
    /**
     * 
     * @see TDDISecurityApplicationType
     */
    TYPE((short)6, "Type"),
    IMPLEMENTED_BY((short)7, "ImplementedBy");

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
        case 5: // CATEGORY
          return CATEGORY;
        case 6: // TYPE
          return TYPE;
        case 7: // IMPLEMENTED_BY
          return IMPLEMENTED_BY;
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
    tmpMap.put(_Fields.CATEGORY, new org.apache.thrift.meta_data.FieldMetaData("Category", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("Type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDISecurityApplicationType.class)));
    tmpMap.put(_Fields.IMPLEMENTED_BY, new org.apache.thrift.meta_data.FieldMetaData("ImplementedBy", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDISecurityControlRef.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDISecurityCapability.class, metaDataMap);
  }

  public TDDISecurityCapability() {
    this.Name = "";

    this.Description = "";

    this.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMap>();

    this.Category = "";

    this.Type = thriftContract.TDDISecurityApplicationType.SATPreventive;

    this.ImplementedBy = new java.util.ArrayList<TDDISecurityControlRef>();

  }

  public TDDISecurityCapability(
    long Id,
    java.lang.String Name,
    java.lang.String Description,
    java.util.List<TDDIKeyValueMap> KeyValueMaps,
    java.lang.String Category,
    TDDISecurityApplicationType Type,
    java.util.List<TDDISecurityControlRef> ImplementedBy)
  {
    this();
    this.Id = Id;
    setIdIsSet(true);
    this.Name = Name;
    this.Description = Description;
    this.KeyValueMaps = KeyValueMaps;
    this.Category = Category;
    this.Type = Type;
    this.ImplementedBy = ImplementedBy;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDISecurityCapability(TDDISecurityCapability other) {
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
    if (other.isSetCategory()) {
      this.Category = other.Category;
    }
    if (other.isSetType()) {
      this.Type = other.Type;
    }
    if (other.isSetImplementedBy()) {
      java.util.List<TDDISecurityControlRef> __this__ImplementedBy = new java.util.ArrayList<TDDISecurityControlRef>(other.ImplementedBy.size());
      for (TDDISecurityControlRef other_element : other.ImplementedBy) {
        __this__ImplementedBy.add(new TDDISecurityControlRef(other_element));
      }
      this.ImplementedBy = __this__ImplementedBy;
    }
  }

  public TDDISecurityCapability deepCopy() {
    return new TDDISecurityCapability(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.Id = 0;
    this.Name = "";

    this.Description = "";

    this.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMap>();

    this.Category = "";

    this.Type = thriftContract.TDDISecurityApplicationType.SATPreventive;

    this.ImplementedBy = new java.util.ArrayList<TDDISecurityControlRef>();

  }

  public long getId() {
    return this.Id;
  }

  public TDDISecurityCapability setId(long Id) {
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

  public TDDISecurityCapability setName(java.lang.String Name) {
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

  public TDDISecurityCapability setDescription(java.lang.String Description) {
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

  public TDDISecurityCapability setKeyValueMaps(java.util.List<TDDIKeyValueMap> KeyValueMaps) {
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

  public java.lang.String getCategory() {
    return this.Category;
  }

  public TDDISecurityCapability setCategory(java.lang.String Category) {
    this.Category = Category;
    return this;
  }

  public void unsetCategory() {
    this.Category = null;
  }

  /** Returns true if field Category is set (has been assigned a value) and false otherwise */
  public boolean isSetCategory() {
    return this.Category != null;
  }

  public void setCategoryIsSet(boolean value) {
    if (!value) {
      this.Category = null;
    }
  }

  /**
   * 
   * @see TDDISecurityApplicationType
   */
  public TDDISecurityApplicationType getType() {
    return this.Type;
  }

  /**
   * 
   * @see TDDISecurityApplicationType
   */
  public TDDISecurityCapability setType(TDDISecurityApplicationType Type) {
    this.Type = Type;
    return this;
  }

  public void unsetType() {
    this.Type = null;
  }

  /** Returns true if field Type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.Type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.Type = null;
    }
  }

  public int getImplementedBySize() {
    return (this.ImplementedBy == null) ? 0 : this.ImplementedBy.size();
  }

  public java.util.Iterator<TDDISecurityControlRef> getImplementedByIterator() {
    return (this.ImplementedBy == null) ? null : this.ImplementedBy.iterator();
  }

  public void addToImplementedBy(TDDISecurityControlRef elem) {
    if (this.ImplementedBy == null) {
      this.ImplementedBy = new java.util.ArrayList<TDDISecurityControlRef>();
    }
    this.ImplementedBy.add(elem);
  }

  public java.util.List<TDDISecurityControlRef> getImplementedBy() {
    return this.ImplementedBy;
  }

  public TDDISecurityCapability setImplementedBy(java.util.List<TDDISecurityControlRef> ImplementedBy) {
    this.ImplementedBy = ImplementedBy;
    return this;
  }

  public void unsetImplementedBy() {
    this.ImplementedBy = null;
  }

  /** Returns true if field ImplementedBy is set (has been assigned a value) and false otherwise */
  public boolean isSetImplementedBy() {
    return this.ImplementedBy != null;
  }

  public void setImplementedByIsSet(boolean value) {
    if (!value) {
      this.ImplementedBy = null;
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

    case CATEGORY:
      if (value == null) {
        unsetCategory();
      } else {
        setCategory((java.lang.String)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((TDDISecurityApplicationType)value);
      }
      break;

    case IMPLEMENTED_BY:
      if (value == null) {
        unsetImplementedBy();
      } else {
        setImplementedBy((java.util.List<TDDISecurityControlRef>)value);
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

    case CATEGORY:
      return getCategory();

    case TYPE:
      return getType();

    case IMPLEMENTED_BY:
      return getImplementedBy();

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
    case CATEGORY:
      return isSetCategory();
    case TYPE:
      return isSetType();
    case IMPLEMENTED_BY:
      return isSetImplementedBy();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDISecurityCapability)
      return this.equals((TDDISecurityCapability)that);
    return false;
  }

  public boolean equals(TDDISecurityCapability that) {
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

    boolean this_present_Category = true && this.isSetCategory();
    boolean that_present_Category = true && that.isSetCategory();
    if (this_present_Category || that_present_Category) {
      if (!(this_present_Category && that_present_Category))
        return false;
      if (!this.Category.equals(that.Category))
        return false;
    }

    boolean this_present_Type = true && this.isSetType();
    boolean that_present_Type = true && that.isSetType();
    if (this_present_Type || that_present_Type) {
      if (!(this_present_Type && that_present_Type))
        return false;
      if (!this.Type.equals(that.Type))
        return false;
    }

    boolean this_present_ImplementedBy = true && this.isSetImplementedBy();
    boolean that_present_ImplementedBy = true && that.isSetImplementedBy();
    if (this_present_ImplementedBy || that_present_ImplementedBy) {
      if (!(this_present_ImplementedBy && that_present_ImplementedBy))
        return false;
      if (!this.ImplementedBy.equals(that.ImplementedBy))
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

    hashCode = hashCode * 8191 + ((isSetCategory()) ? 131071 : 524287);
    if (isSetCategory())
      hashCode = hashCode * 8191 + Category.hashCode();

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + Type.getValue();

    hashCode = hashCode * 8191 + ((isSetImplementedBy()) ? 131071 : 524287);
    if (isSetImplementedBy())
      hashCode = hashCode * 8191 + ImplementedBy.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TDDISecurityCapability other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetCategory()).compareTo(other.isSetCategory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCategory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Category, other.Category);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Type, other.Type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetImplementedBy()).compareTo(other.isSetImplementedBy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImplementedBy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ImplementedBy, other.ImplementedBy);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDISecurityCapability(");
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
    sb.append("Category:");
    if (this.Category == null) {
      sb.append("null");
    } else {
      sb.append(this.Category);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Type:");
    if (this.Type == null) {
      sb.append("null");
    } else {
      sb.append(this.Type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ImplementedBy:");
    if (this.ImplementedBy == null) {
      sb.append("null");
    } else {
      sb.append(this.ImplementedBy);
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

  private static class TDDISecurityCapabilityStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDISecurityCapabilityStandardScheme getScheme() {
      return new TDDISecurityCapabilityStandardScheme();
    }
  }

  private static class TDDISecurityCapabilityStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDISecurityCapability> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDISecurityCapability struct) throws org.apache.thrift.TException {
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
                org.apache.thrift.protocol.TList _list2816 = iprot.readListBegin();
                struct.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMap>(_list2816.size);
                TDDIKeyValueMap _elem2817;
                for (int _i2818 = 0; _i2818 < _list2816.size; ++_i2818)
                {
                  _elem2817 = new TDDIKeyValueMap();
                  _elem2817.read(iprot);
                  struct.KeyValueMaps.add(_elem2817);
                }
                iprot.readListEnd();
              }
              struct.setKeyValueMapsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CATEGORY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Category = iprot.readString();
              struct.setCategoryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.Type = thriftContract.TDDISecurityApplicationType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // IMPLEMENTED_BY
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list2819 = iprot.readListBegin();
                struct.ImplementedBy = new java.util.ArrayList<TDDISecurityControlRef>(_list2819.size);
                TDDISecurityControlRef _elem2820;
                for (int _i2821 = 0; _i2821 < _list2819.size; ++_i2821)
                {
                  _elem2820 = new TDDISecurityControlRef();
                  _elem2820.read(iprot);
                  struct.ImplementedBy.add(_elem2820);
                }
                iprot.readListEnd();
              }
              struct.setImplementedByIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDISecurityCapability struct) throws org.apache.thrift.TException {
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
          for (TDDIKeyValueMap _iter2822 : struct.KeyValueMaps)
          {
            _iter2822.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.Category != null) {
        oprot.writeFieldBegin(CATEGORY_FIELD_DESC);
        oprot.writeString(struct.Category);
        oprot.writeFieldEnd();
      }
      if (struct.Type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.Type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.ImplementedBy != null) {
        oprot.writeFieldBegin(IMPLEMENTED_BY_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.ImplementedBy.size()));
          for (TDDISecurityControlRef _iter2823 : struct.ImplementedBy)
          {
            _iter2823.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDISecurityCapabilityTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDISecurityCapabilityTupleScheme getScheme() {
      return new TDDISecurityCapabilityTupleScheme();
    }
  }

  private static class TDDISecurityCapabilityTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDISecurityCapability> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDISecurityCapability struct) throws org.apache.thrift.TException {
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
      if (struct.isSetCategory()) {
        optionals.set(4);
      }
      if (struct.isSetType()) {
        optionals.set(5);
      }
      if (struct.isSetImplementedBy()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
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
          for (TDDIKeyValueMap _iter2824 : struct.KeyValueMaps)
          {
            _iter2824.write(oprot);
          }
        }
      }
      if (struct.isSetCategory()) {
        oprot.writeString(struct.Category);
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.Type.getValue());
      }
      if (struct.isSetImplementedBy()) {
        {
          oprot.writeI32(struct.ImplementedBy.size());
          for (TDDISecurityControlRef _iter2825 : struct.ImplementedBy)
          {
            _iter2825.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDISecurityCapability struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
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
          org.apache.thrift.protocol.TList _list2826 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMap>(_list2826.size);
          TDDIKeyValueMap _elem2827;
          for (int _i2828 = 0; _i2828 < _list2826.size; ++_i2828)
          {
            _elem2827 = new TDDIKeyValueMap();
            _elem2827.read(iprot);
            struct.KeyValueMaps.add(_elem2827);
          }
        }
        struct.setKeyValueMapsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.Category = iprot.readString();
        struct.setCategoryIsSet(true);
      }
      if (incoming.get(5)) {
        struct.Type = thriftContract.TDDISecurityApplicationType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(6)) {
        {
          org.apache.thrift.protocol.TList _list2829 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.ImplementedBy = new java.util.ArrayList<TDDISecurityControlRef>(_list2829.size);
          TDDISecurityControlRef _elem2830;
          for (int _i2831 = 0; _i2831 < _list2829.size; ++_i2831)
          {
            _elem2830 = new TDDISecurityControlRef();
            _elem2830.read(iprot);
            struct.ImplementedBy.add(_elem2830);
          }
        }
        struct.setImplementedByIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

