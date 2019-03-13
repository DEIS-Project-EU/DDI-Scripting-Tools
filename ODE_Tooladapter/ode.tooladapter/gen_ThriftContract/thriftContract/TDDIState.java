/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-01-14")
public class TDDIState implements org.apache.thrift.TBase<TDDIState, TDDIState._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIState> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIState");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("Id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("Name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("Description", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField KEY_VALUE_MAPS_FIELD_DESC = new org.apache.thrift.protocol.TField("KeyValueMaps", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField IS_INITIAL_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("IsInitialState", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField IS_FAIL_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("IsFailState", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField FAIL_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("FailState", org.apache.thrift.protocol.TType.STRUCT, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIStateStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIStateTupleSchemeFactory();

  public long Id; // required
  public java.lang.String Name; // required
  public java.lang.String Description; // required
  public java.util.List<TDDIKeyValueMap> KeyValueMaps; // required
  public boolean IsInitialState; // required
  public boolean IsFailState; // required
  public TDDIAbstractFailure FailState; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "Id"),
    NAME((short)2, "Name"),
    DESCRIPTION((short)3, "Description"),
    KEY_VALUE_MAPS((short)4, "KeyValueMaps"),
    IS_INITIAL_STATE((short)5, "IsInitialState"),
    IS_FAIL_STATE((short)6, "IsFailState"),
    FAIL_STATE((short)7, "FailState");

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
        case 5: // IS_INITIAL_STATE
          return IS_INITIAL_STATE;
        case 6: // IS_FAIL_STATE
          return IS_FAIL_STATE;
        case 7: // FAIL_STATE
          return FAIL_STATE;
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
  private static final int __ISINITIALSTATE_ISSET_ID = 1;
  private static final int __ISFAILSTATE_ISSET_ID = 2;
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
    tmpMap.put(_Fields.IS_INITIAL_STATE, new org.apache.thrift.meta_data.FieldMetaData("IsInitialState", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_FAIL_STATE, new org.apache.thrift.meta_data.FieldMetaData("IsFailState", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.FAIL_STATE, new org.apache.thrift.meta_data.FieldMetaData("FailState", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIAbstractFailure.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIState.class, metaDataMap);
  }

  public TDDIState() {
    this.Name = "";

    this.Description = "";

    this.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMap>();

  }

  public TDDIState(
    long Id,
    java.lang.String Name,
    java.lang.String Description,
    java.util.List<TDDIKeyValueMap> KeyValueMaps,
    boolean IsInitialState,
    boolean IsFailState,
    TDDIAbstractFailure FailState)
  {
    this();
    this.Id = Id;
    setIdIsSet(true);
    this.Name = Name;
    this.Description = Description;
    this.KeyValueMaps = KeyValueMaps;
    this.IsInitialState = IsInitialState;
    setIsInitialStateIsSet(true);
    this.IsFailState = IsFailState;
    setIsFailStateIsSet(true);
    this.FailState = FailState;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIState(TDDIState other) {
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
    this.IsInitialState = other.IsInitialState;
    this.IsFailState = other.IsFailState;
    if (other.isSetFailState()) {
      this.FailState = new TDDIAbstractFailure(other.FailState);
    }
  }

  public TDDIState deepCopy() {
    return new TDDIState(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.Id = 0;
    this.Name = "";

    this.Description = "";

    this.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMap>();

    setIsInitialStateIsSet(false);
    this.IsInitialState = false;
    setIsFailStateIsSet(false);
    this.IsFailState = false;
    this.FailState = null;
  }

  public long getId() {
    return this.Id;
  }

  public TDDIState setId(long Id) {
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

  public TDDIState setName(java.lang.String Name) {
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

  public TDDIState setDescription(java.lang.String Description) {
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

  public TDDIState setKeyValueMaps(java.util.List<TDDIKeyValueMap> KeyValueMaps) {
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

  public boolean isIsInitialState() {
    return this.IsInitialState;
  }

  public TDDIState setIsInitialState(boolean IsInitialState) {
    this.IsInitialState = IsInitialState;
    setIsInitialStateIsSet(true);
    return this;
  }

  public void unsetIsInitialState() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISINITIALSTATE_ISSET_ID);
  }

  /** Returns true if field IsInitialState is set (has been assigned a value) and false otherwise */
  public boolean isSetIsInitialState() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISINITIALSTATE_ISSET_ID);
  }

  public void setIsInitialStateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISINITIALSTATE_ISSET_ID, value);
  }

  public boolean isIsFailState() {
    return this.IsFailState;
  }

  public TDDIState setIsFailState(boolean IsFailState) {
    this.IsFailState = IsFailState;
    setIsFailStateIsSet(true);
    return this;
  }

  public void unsetIsFailState() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISFAILSTATE_ISSET_ID);
  }

  /** Returns true if field IsFailState is set (has been assigned a value) and false otherwise */
  public boolean isSetIsFailState() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISFAILSTATE_ISSET_ID);
  }

  public void setIsFailStateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISFAILSTATE_ISSET_ID, value);
  }

  public TDDIAbstractFailure getFailState() {
    return this.FailState;
  }

  public TDDIState setFailState(TDDIAbstractFailure FailState) {
    this.FailState = FailState;
    return this;
  }

  public void unsetFailState() {
    this.FailState = null;
  }

  /** Returns true if field FailState is set (has been assigned a value) and false otherwise */
  public boolean isSetFailState() {
    return this.FailState != null;
  }

  public void setFailStateIsSet(boolean value) {
    if (!value) {
      this.FailState = null;
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

    case IS_INITIAL_STATE:
      if (value == null) {
        unsetIsInitialState();
      } else {
        setIsInitialState((java.lang.Boolean)value);
      }
      break;

    case IS_FAIL_STATE:
      if (value == null) {
        unsetIsFailState();
      } else {
        setIsFailState((java.lang.Boolean)value);
      }
      break;

    case FAIL_STATE:
      if (value == null) {
        unsetFailState();
      } else {
        setFailState((TDDIAbstractFailure)value);
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

    case IS_INITIAL_STATE:
      return isIsInitialState();

    case IS_FAIL_STATE:
      return isIsFailState();

    case FAIL_STATE:
      return getFailState();

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
    case IS_INITIAL_STATE:
      return isSetIsInitialState();
    case IS_FAIL_STATE:
      return isSetIsFailState();
    case FAIL_STATE:
      return isSetFailState();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIState)
      return this.equals((TDDIState)that);
    return false;
  }

  public boolean equals(TDDIState that) {
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

    boolean this_present_IsInitialState = true;
    boolean that_present_IsInitialState = true;
    if (this_present_IsInitialState || that_present_IsInitialState) {
      if (!(this_present_IsInitialState && that_present_IsInitialState))
        return false;
      if (this.IsInitialState != that.IsInitialState)
        return false;
    }

    boolean this_present_IsFailState = true;
    boolean that_present_IsFailState = true;
    if (this_present_IsFailState || that_present_IsFailState) {
      if (!(this_present_IsFailState && that_present_IsFailState))
        return false;
      if (this.IsFailState != that.IsFailState)
        return false;
    }

    boolean this_present_FailState = true && this.isSetFailState();
    boolean that_present_FailState = true && that.isSetFailState();
    if (this_present_FailState || that_present_FailState) {
      if (!(this_present_FailState && that_present_FailState))
        return false;
      if (!this.FailState.equals(that.FailState))
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

    hashCode = hashCode * 8191 + ((IsInitialState) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((IsFailState) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetFailState()) ? 131071 : 524287);
    if (isSetFailState())
      hashCode = hashCode * 8191 + FailState.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIState other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetIsInitialState()).compareTo(other.isSetIsInitialState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsInitialState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.IsInitialState, other.IsInitialState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIsFailState()).compareTo(other.isSetIsFailState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsFailState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.IsFailState, other.IsFailState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFailState()).compareTo(other.isSetFailState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFailState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.FailState, other.FailState);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIState(");
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
    sb.append("IsInitialState:");
    sb.append(this.IsInitialState);
    first = false;
    if (!first) sb.append(", ");
    sb.append("IsFailState:");
    sb.append(this.IsFailState);
    first = false;
    if (!first) sb.append(", ");
    sb.append("FailState:");
    if (this.FailState == null) {
      sb.append("null");
    } else {
      sb.append(this.FailState);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (FailState != null) {
      FailState.validate();
    }
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

  private static class TDDIStateStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIStateStandardScheme getScheme() {
      return new TDDIStateStandardScheme();
    }
  }

  private static class TDDIStateStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIState> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIState struct) throws org.apache.thrift.TException {
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
                org.apache.thrift.protocol.TList _list1224 = iprot.readListBegin();
                struct.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMap>(_list1224.size);
                TDDIKeyValueMap _elem1225;
                for (int _i1226 = 0; _i1226 < _list1224.size; ++_i1226)
                {
                  _elem1225 = new TDDIKeyValueMap();
                  _elem1225.read(iprot);
                  struct.KeyValueMaps.add(_elem1225);
                }
                iprot.readListEnd();
              }
              struct.setKeyValueMapsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IS_INITIAL_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.IsInitialState = iprot.readBool();
              struct.setIsInitialStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // IS_FAIL_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.IsFailState = iprot.readBool();
              struct.setIsFailStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // FAIL_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.FailState = new TDDIAbstractFailure();
              struct.FailState.read(iprot);
              struct.setFailStateIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIState struct) throws org.apache.thrift.TException {
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
          for (TDDIKeyValueMap _iter1227 : struct.KeyValueMaps)
          {
            _iter1227.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_INITIAL_STATE_FIELD_DESC);
      oprot.writeBool(struct.IsInitialState);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_FAIL_STATE_FIELD_DESC);
      oprot.writeBool(struct.IsFailState);
      oprot.writeFieldEnd();
      if (struct.FailState != null) {
        oprot.writeFieldBegin(FAIL_STATE_FIELD_DESC);
        struct.FailState.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIStateTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIStateTupleScheme getScheme() {
      return new TDDIStateTupleScheme();
    }
  }

  private static class TDDIStateTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIState> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIState struct) throws org.apache.thrift.TException {
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
      if (struct.isSetIsInitialState()) {
        optionals.set(4);
      }
      if (struct.isSetIsFailState()) {
        optionals.set(5);
      }
      if (struct.isSetFailState()) {
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
          for (TDDIKeyValueMap _iter1228 : struct.KeyValueMaps)
          {
            _iter1228.write(oprot);
          }
        }
      }
      if (struct.isSetIsInitialState()) {
        oprot.writeBool(struct.IsInitialState);
      }
      if (struct.isSetIsFailState()) {
        oprot.writeBool(struct.IsFailState);
      }
      if (struct.isSetFailState()) {
        struct.FailState.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIState struct) throws org.apache.thrift.TException {
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
          org.apache.thrift.protocol.TList _list1229 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMap>(_list1229.size);
          TDDIKeyValueMap _elem1230;
          for (int _i1231 = 0; _i1231 < _list1229.size; ++_i1231)
          {
            _elem1230 = new TDDIKeyValueMap();
            _elem1230.read(iprot);
            struct.KeyValueMaps.add(_elem1230);
          }
        }
        struct.setKeyValueMapsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.IsInitialState = iprot.readBool();
        struct.setIsInitialStateIsSet(true);
      }
      if (incoming.get(5)) {
        struct.IsFailState = iprot.readBool();
        struct.setIsFailStateIsSet(true);
      }
      if (incoming.get(6)) {
        struct.FailState = new TDDIAbstractFailure();
        struct.FailState.read(iprot);
        struct.setFailStateIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

