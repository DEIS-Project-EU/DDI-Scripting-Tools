/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-08-13")
public class TDDIHazardType implements org.apache.thrift.TBase<TDDIHazardType, TDDIHazardType._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIHazardType> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIHazardType");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("Id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("Name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("Description", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField IS_CITATION_FIELD_DESC = new org.apache.thrift.protocol.TField("IsCitation", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField IS_ABSTRACT_FIELD_DESC = new org.apache.thrift.protocol.TField("IsAbstract", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField KEY_VALUE_MAPS_FIELD_DESC = new org.apache.thrift.protocol.TField("KeyValueMaps", org.apache.thrift.protocol.TType.LIST, (short)6);
  private static final org.apache.thrift.protocol.TField CITED_ELEMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("CitedElement", org.apache.thrift.protocol.TType.STRUCT, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIHazardTypeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIHazardTypeTupleSchemeFactory();

  public long Id; // required
  public java.lang.String Name; // required
  public java.lang.String Description; // required
  public boolean IsCitation; // required
  public boolean IsAbstract; // required
  public java.util.List<TDDIKeyValueMapRef> KeyValueMaps; // required
  public TDDIAbstractBaseElement CitedElement; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "Id"),
    NAME((short)2, "Name"),
    DESCRIPTION((short)3, "Description"),
    IS_CITATION((short)4, "IsCitation"),
    IS_ABSTRACT((short)5, "IsAbstract"),
    KEY_VALUE_MAPS((short)6, "KeyValueMaps"),
    CITED_ELEMENT((short)7, "CitedElement");

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
        case 4: // IS_CITATION
          return IS_CITATION;
        case 5: // IS_ABSTRACT
          return IS_ABSTRACT;
        case 6: // KEY_VALUE_MAPS
          return KEY_VALUE_MAPS;
        case 7: // CITED_ELEMENT
          return CITED_ELEMENT;
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
  private static final int __ISCITATION_ISSET_ID = 1;
  private static final int __ISABSTRACT_ISSET_ID = 2;
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
    tmpMap.put(_Fields.IS_CITATION, new org.apache.thrift.meta_data.FieldMetaData("IsCitation", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_ABSTRACT, new org.apache.thrift.meta_data.FieldMetaData("IsAbstract", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.KEY_VALUE_MAPS, new org.apache.thrift.meta_data.FieldMetaData("KeyValueMaps", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIKeyValueMapRef.class))));
    tmpMap.put(_Fields.CITED_ELEMENT, new org.apache.thrift.meta_data.FieldMetaData("CitedElement", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIAbstractBaseElement.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIHazardType.class, metaDataMap);
  }

  public TDDIHazardType() {
    this.Name = "";

    this.Description = "";

    this.IsCitation = false;

    this.IsAbstract = false;

    this.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMapRef>();

  }

  public TDDIHazardType(
    long Id,
    java.lang.String Name,
    java.lang.String Description,
    boolean IsCitation,
    boolean IsAbstract,
    java.util.List<TDDIKeyValueMapRef> KeyValueMaps,
    TDDIAbstractBaseElement CitedElement)
  {
    this();
    this.Id = Id;
    setIdIsSet(true);
    this.Name = Name;
    this.Description = Description;
    this.IsCitation = IsCitation;
    setIsCitationIsSet(true);
    this.IsAbstract = IsAbstract;
    setIsAbstractIsSet(true);
    this.KeyValueMaps = KeyValueMaps;
    this.CitedElement = CitedElement;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIHazardType(TDDIHazardType other) {
    __isset_bitfield = other.__isset_bitfield;
    this.Id = other.Id;
    if (other.isSetName()) {
      this.Name = other.Name;
    }
    if (other.isSetDescription()) {
      this.Description = other.Description;
    }
    this.IsCitation = other.IsCitation;
    this.IsAbstract = other.IsAbstract;
    if (other.isSetKeyValueMaps()) {
      java.util.List<TDDIKeyValueMapRef> __this__KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMapRef>(other.KeyValueMaps.size());
      for (TDDIKeyValueMapRef other_element : other.KeyValueMaps) {
        __this__KeyValueMaps.add(new TDDIKeyValueMapRef(other_element));
      }
      this.KeyValueMaps = __this__KeyValueMaps;
    }
    if (other.isSetCitedElement()) {
      this.CitedElement = new TDDIAbstractBaseElement(other.CitedElement);
    }
  }

  public TDDIHazardType deepCopy() {
    return new TDDIHazardType(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.Id = 0;
    this.Name = "";

    this.Description = "";

    this.IsCitation = false;

    this.IsAbstract = false;

    this.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMapRef>();

    this.CitedElement = null;
  }

  public long getId() {
    return this.Id;
  }

  public TDDIHazardType setId(long Id) {
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

  public TDDIHazardType setName(java.lang.String Name) {
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

  public TDDIHazardType setDescription(java.lang.String Description) {
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

  public boolean isIsCitation() {
    return this.IsCitation;
  }

  public TDDIHazardType setIsCitation(boolean IsCitation) {
    this.IsCitation = IsCitation;
    setIsCitationIsSet(true);
    return this;
  }

  public void unsetIsCitation() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISCITATION_ISSET_ID);
  }

  /** Returns true if field IsCitation is set (has been assigned a value) and false otherwise */
  public boolean isSetIsCitation() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISCITATION_ISSET_ID);
  }

  public void setIsCitationIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISCITATION_ISSET_ID, value);
  }

  public boolean isIsAbstract() {
    return this.IsAbstract;
  }

  public TDDIHazardType setIsAbstract(boolean IsAbstract) {
    this.IsAbstract = IsAbstract;
    setIsAbstractIsSet(true);
    return this;
  }

  public void unsetIsAbstract() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISABSTRACT_ISSET_ID);
  }

  /** Returns true if field IsAbstract is set (has been assigned a value) and false otherwise */
  public boolean isSetIsAbstract() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISABSTRACT_ISSET_ID);
  }

  public void setIsAbstractIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISABSTRACT_ISSET_ID, value);
  }

  public int getKeyValueMapsSize() {
    return (this.KeyValueMaps == null) ? 0 : this.KeyValueMaps.size();
  }

  public java.util.Iterator<TDDIKeyValueMapRef> getKeyValueMapsIterator() {
    return (this.KeyValueMaps == null) ? null : this.KeyValueMaps.iterator();
  }

  public void addToKeyValueMaps(TDDIKeyValueMapRef elem) {
    if (this.KeyValueMaps == null) {
      this.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMapRef>();
    }
    this.KeyValueMaps.add(elem);
  }

  public java.util.List<TDDIKeyValueMapRef> getKeyValueMaps() {
    return this.KeyValueMaps;
  }

  public TDDIHazardType setKeyValueMaps(java.util.List<TDDIKeyValueMapRef> KeyValueMaps) {
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

  public TDDIAbstractBaseElement getCitedElement() {
    return this.CitedElement;
  }

  public TDDIHazardType setCitedElement(TDDIAbstractBaseElement CitedElement) {
    this.CitedElement = CitedElement;
    return this;
  }

  public void unsetCitedElement() {
    this.CitedElement = null;
  }

  /** Returns true if field CitedElement is set (has been assigned a value) and false otherwise */
  public boolean isSetCitedElement() {
    return this.CitedElement != null;
  }

  public void setCitedElementIsSet(boolean value) {
    if (!value) {
      this.CitedElement = null;
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

    case IS_CITATION:
      if (value == null) {
        unsetIsCitation();
      } else {
        setIsCitation((java.lang.Boolean)value);
      }
      break;

    case IS_ABSTRACT:
      if (value == null) {
        unsetIsAbstract();
      } else {
        setIsAbstract((java.lang.Boolean)value);
      }
      break;

    case KEY_VALUE_MAPS:
      if (value == null) {
        unsetKeyValueMaps();
      } else {
        setKeyValueMaps((java.util.List<TDDIKeyValueMapRef>)value);
      }
      break;

    case CITED_ELEMENT:
      if (value == null) {
        unsetCitedElement();
      } else {
        setCitedElement((TDDIAbstractBaseElement)value);
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

    case IS_CITATION:
      return isIsCitation();

    case IS_ABSTRACT:
      return isIsAbstract();

    case KEY_VALUE_MAPS:
      return getKeyValueMaps();

    case CITED_ELEMENT:
      return getCitedElement();

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
    case IS_CITATION:
      return isSetIsCitation();
    case IS_ABSTRACT:
      return isSetIsAbstract();
    case KEY_VALUE_MAPS:
      return isSetKeyValueMaps();
    case CITED_ELEMENT:
      return isSetCitedElement();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIHazardType)
      return this.equals((TDDIHazardType)that);
    return false;
  }

  public boolean equals(TDDIHazardType that) {
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

    boolean this_present_IsCitation = true;
    boolean that_present_IsCitation = true;
    if (this_present_IsCitation || that_present_IsCitation) {
      if (!(this_present_IsCitation && that_present_IsCitation))
        return false;
      if (this.IsCitation != that.IsCitation)
        return false;
    }

    boolean this_present_IsAbstract = true;
    boolean that_present_IsAbstract = true;
    if (this_present_IsAbstract || that_present_IsAbstract) {
      if (!(this_present_IsAbstract && that_present_IsAbstract))
        return false;
      if (this.IsAbstract != that.IsAbstract)
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

    boolean this_present_CitedElement = true && this.isSetCitedElement();
    boolean that_present_CitedElement = true && that.isSetCitedElement();
    if (this_present_CitedElement || that_present_CitedElement) {
      if (!(this_present_CitedElement && that_present_CitedElement))
        return false;
      if (!this.CitedElement.equals(that.CitedElement))
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

    hashCode = hashCode * 8191 + ((IsCitation) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((IsAbstract) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetKeyValueMaps()) ? 131071 : 524287);
    if (isSetKeyValueMaps())
      hashCode = hashCode * 8191 + KeyValueMaps.hashCode();

    hashCode = hashCode * 8191 + ((isSetCitedElement()) ? 131071 : 524287);
    if (isSetCitedElement())
      hashCode = hashCode * 8191 + CitedElement.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIHazardType other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetIsCitation()).compareTo(other.isSetIsCitation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsCitation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.IsCitation, other.IsCitation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIsAbstract()).compareTo(other.isSetIsAbstract());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsAbstract()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.IsAbstract, other.IsAbstract);
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
    lastComparison = java.lang.Boolean.valueOf(isSetCitedElement()).compareTo(other.isSetCitedElement());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCitedElement()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.CitedElement, other.CitedElement);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIHazardType(");
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
    sb.append("IsCitation:");
    sb.append(this.IsCitation);
    first = false;
    if (!first) sb.append(", ");
    sb.append("IsAbstract:");
    sb.append(this.IsAbstract);
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
    sb.append("CitedElement:");
    if (this.CitedElement == null) {
      sb.append("null");
    } else {
      sb.append(this.CitedElement);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (CitedElement != null) {
      CitedElement.validate();
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

  private static class TDDIHazardTypeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIHazardTypeStandardScheme getScheme() {
      return new TDDIHazardTypeStandardScheme();
    }
  }

  private static class TDDIHazardTypeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIHazardType> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIHazardType struct) throws org.apache.thrift.TException {
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
          case 4: // IS_CITATION
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.IsCitation = iprot.readBool();
              struct.setIsCitationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IS_ABSTRACT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.IsAbstract = iprot.readBool();
              struct.setIsAbstractIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // KEY_VALUE_MAPS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list1312 = iprot.readListBegin();
                struct.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMapRef>(_list1312.size);
                TDDIKeyValueMapRef _elem1313;
                for (int _i1314 = 0; _i1314 < _list1312.size; ++_i1314)
                {
                  _elem1313 = new TDDIKeyValueMapRef();
                  _elem1313.read(iprot);
                  struct.KeyValueMaps.add(_elem1313);
                }
                iprot.readListEnd();
              }
              struct.setKeyValueMapsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CITED_ELEMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.CitedElement = new TDDIAbstractBaseElement();
              struct.CitedElement.read(iprot);
              struct.setCitedElementIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIHazardType struct) throws org.apache.thrift.TException {
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
      oprot.writeFieldBegin(IS_CITATION_FIELD_DESC);
      oprot.writeBool(struct.IsCitation);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_ABSTRACT_FIELD_DESC);
      oprot.writeBool(struct.IsAbstract);
      oprot.writeFieldEnd();
      if (struct.KeyValueMaps != null) {
        oprot.writeFieldBegin(KEY_VALUE_MAPS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.KeyValueMaps.size()));
          for (TDDIKeyValueMapRef _iter1315 : struct.KeyValueMaps)
          {
            _iter1315.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.CitedElement != null) {
        oprot.writeFieldBegin(CITED_ELEMENT_FIELD_DESC);
        struct.CitedElement.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIHazardTypeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIHazardTypeTupleScheme getScheme() {
      return new TDDIHazardTypeTupleScheme();
    }
  }

  private static class TDDIHazardTypeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIHazardType> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIHazardType struct) throws org.apache.thrift.TException {
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
      if (struct.isSetIsCitation()) {
        optionals.set(3);
      }
      if (struct.isSetIsAbstract()) {
        optionals.set(4);
      }
      if (struct.isSetKeyValueMaps()) {
        optionals.set(5);
      }
      if (struct.isSetCitedElement()) {
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
      if (struct.isSetIsCitation()) {
        oprot.writeBool(struct.IsCitation);
      }
      if (struct.isSetIsAbstract()) {
        oprot.writeBool(struct.IsAbstract);
      }
      if (struct.isSetKeyValueMaps()) {
        {
          oprot.writeI32(struct.KeyValueMaps.size());
          for (TDDIKeyValueMapRef _iter1316 : struct.KeyValueMaps)
          {
            _iter1316.write(oprot);
          }
        }
      }
      if (struct.isSetCitedElement()) {
        struct.CitedElement.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIHazardType struct) throws org.apache.thrift.TException {
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
        struct.IsCitation = iprot.readBool();
        struct.setIsCitationIsSet(true);
      }
      if (incoming.get(4)) {
        struct.IsAbstract = iprot.readBool();
        struct.setIsAbstractIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TList _list1317 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.KeyValueMaps = new java.util.ArrayList<TDDIKeyValueMapRef>(_list1317.size);
          TDDIKeyValueMapRef _elem1318;
          for (int _i1319 = 0; _i1319 < _list1317.size; ++_i1319)
          {
            _elem1318 = new TDDIKeyValueMapRef();
            _elem1318.read(iprot);
            struct.KeyValueMaps.add(_elem1318);
          }
        }
        struct.setKeyValueMapsIsSet(true);
      }
      if (incoming.get(6)) {
        struct.CitedElement = new TDDIAbstractBaseElement();
        struct.CitedElement.read(iprot);
        struct.setCitedElementIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

