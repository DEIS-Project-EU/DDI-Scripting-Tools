/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-03-13")
public class TDDIImplementationConstraint implements org.apache.thrift.TBase<TDDIImplementationConstraint, TDDIImplementationConstraint._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIImplementationConstraint> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIImplementationConstraint");

  private static final org.apache.thrift.protocol.TField GID_FIELD_DESC = new org.apache.thrift.protocol.TField("Gid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField IS_CITATION_FIELD_DESC = new org.apache.thrift.protocol.TField("IsCitation", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField IS_ABSTRACT_FIELD_DESC = new org.apache.thrift.protocol.TField("IsAbstract", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField CITED_ELEMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("CitedElement", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField ABSTRACT_FORM_FIELD_DESC = new org.apache.thrift.protocol.TField("AbstractForm", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("Content", org.apache.thrift.protocol.TType.STRUCT, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIImplementationConstraintStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIImplementationConstraintTupleSchemeFactory();

  public java.lang.String Gid; // required
  public boolean IsCitation; // required
  public boolean IsAbstract; // required
  public TDDIAbstractSACMElement CitedElement; // required
  public TDDIAbstractSACMElement AbstractForm; // required
  public TDDIMultiLangString Content; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GID((short)1, "Gid"),
    IS_CITATION((short)2, "IsCitation"),
    IS_ABSTRACT((short)3, "IsAbstract"),
    CITED_ELEMENT((short)4, "CitedElement"),
    ABSTRACT_FORM((short)5, "AbstractForm"),
    CONTENT((short)6, "Content");

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
        case 1: // GID
          return GID;
        case 2: // IS_CITATION
          return IS_CITATION;
        case 3: // IS_ABSTRACT
          return IS_ABSTRACT;
        case 4: // CITED_ELEMENT
          return CITED_ELEMENT;
        case 5: // ABSTRACT_FORM
          return ABSTRACT_FORM;
        case 6: // CONTENT
          return CONTENT;
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
  private static final int __ISCITATION_ISSET_ID = 0;
  private static final int __ISABSTRACT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GID, new org.apache.thrift.meta_data.FieldMetaData("Gid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_CITATION, new org.apache.thrift.meta_data.FieldMetaData("IsCitation", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_ABSTRACT, new org.apache.thrift.meta_data.FieldMetaData("IsAbstract", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CITED_ELEMENT, new org.apache.thrift.meta_data.FieldMetaData("CitedElement", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIAbstractSACMElement")));
    tmpMap.put(_Fields.ABSTRACT_FORM, new org.apache.thrift.meta_data.FieldMetaData("AbstractForm", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIAbstractSACMElement")));
    tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("Content", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIMultiLangString.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIImplementationConstraint.class, metaDataMap);
  }

  public TDDIImplementationConstraint() {
    this.Gid = "";

    this.IsCitation = false;

    this.IsAbstract = false;

  }

  public TDDIImplementationConstraint(
    java.lang.String Gid,
    boolean IsCitation,
    boolean IsAbstract,
    TDDIAbstractSACMElement CitedElement,
    TDDIAbstractSACMElement AbstractForm,
    TDDIMultiLangString Content)
  {
    this();
    this.Gid = Gid;
    this.IsCitation = IsCitation;
    setIsCitationIsSet(true);
    this.IsAbstract = IsAbstract;
    setIsAbstractIsSet(true);
    this.CitedElement = CitedElement;
    this.AbstractForm = AbstractForm;
    this.Content = Content;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIImplementationConstraint(TDDIImplementationConstraint other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetGid()) {
      this.Gid = other.Gid;
    }
    this.IsCitation = other.IsCitation;
    this.IsAbstract = other.IsAbstract;
    if (other.isSetCitedElement()) {
      this.CitedElement = new TDDIAbstractSACMElement(other.CitedElement);
    }
    if (other.isSetAbstractForm()) {
      this.AbstractForm = new TDDIAbstractSACMElement(other.AbstractForm);
    }
    if (other.isSetContent()) {
      this.Content = new TDDIMultiLangString(other.Content);
    }
  }

  public TDDIImplementationConstraint deepCopy() {
    return new TDDIImplementationConstraint(this);
  }

  @Override
  public void clear() {
    this.Gid = "";

    this.IsCitation = false;

    this.IsAbstract = false;

    this.CitedElement = null;
    this.AbstractForm = null;
    this.Content = null;
  }

  public java.lang.String getGid() {
    return this.Gid;
  }

  public TDDIImplementationConstraint setGid(java.lang.String Gid) {
    this.Gid = Gid;
    return this;
  }

  public void unsetGid() {
    this.Gid = null;
  }

  /** Returns true if field Gid is set (has been assigned a value) and false otherwise */
  public boolean isSetGid() {
    return this.Gid != null;
  }

  public void setGidIsSet(boolean value) {
    if (!value) {
      this.Gid = null;
    }
  }

  public boolean isIsCitation() {
    return this.IsCitation;
  }

  public TDDIImplementationConstraint setIsCitation(boolean IsCitation) {
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

  public TDDIImplementationConstraint setIsAbstract(boolean IsAbstract) {
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

  public TDDIAbstractSACMElement getCitedElement() {
    return this.CitedElement;
  }

  public TDDIImplementationConstraint setCitedElement(TDDIAbstractSACMElement CitedElement) {
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

  public TDDIAbstractSACMElement getAbstractForm() {
    return this.AbstractForm;
  }

  public TDDIImplementationConstraint setAbstractForm(TDDIAbstractSACMElement AbstractForm) {
    this.AbstractForm = AbstractForm;
    return this;
  }

  public void unsetAbstractForm() {
    this.AbstractForm = null;
  }

  /** Returns true if field AbstractForm is set (has been assigned a value) and false otherwise */
  public boolean isSetAbstractForm() {
    return this.AbstractForm != null;
  }

  public void setAbstractFormIsSet(boolean value) {
    if (!value) {
      this.AbstractForm = null;
    }
  }

  public TDDIMultiLangString getContent() {
    return this.Content;
  }

  public TDDIImplementationConstraint setContent(TDDIMultiLangString Content) {
    this.Content = Content;
    return this;
  }

  public void unsetContent() {
    this.Content = null;
  }

  /** Returns true if field Content is set (has been assigned a value) and false otherwise */
  public boolean isSetContent() {
    return this.Content != null;
  }

  public void setContentIsSet(boolean value) {
    if (!value) {
      this.Content = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case GID:
      if (value == null) {
        unsetGid();
      } else {
        setGid((java.lang.String)value);
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

    case CITED_ELEMENT:
      if (value == null) {
        unsetCitedElement();
      } else {
        setCitedElement((TDDIAbstractSACMElement)value);
      }
      break;

    case ABSTRACT_FORM:
      if (value == null) {
        unsetAbstractForm();
      } else {
        setAbstractForm((TDDIAbstractSACMElement)value);
      }
      break;

    case CONTENT:
      if (value == null) {
        unsetContent();
      } else {
        setContent((TDDIMultiLangString)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case GID:
      return getGid();

    case IS_CITATION:
      return isIsCitation();

    case IS_ABSTRACT:
      return isIsAbstract();

    case CITED_ELEMENT:
      return getCitedElement();

    case ABSTRACT_FORM:
      return getAbstractForm();

    case CONTENT:
      return getContent();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case GID:
      return isSetGid();
    case IS_CITATION:
      return isSetIsCitation();
    case IS_ABSTRACT:
      return isSetIsAbstract();
    case CITED_ELEMENT:
      return isSetCitedElement();
    case ABSTRACT_FORM:
      return isSetAbstractForm();
    case CONTENT:
      return isSetContent();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIImplementationConstraint)
      return this.equals((TDDIImplementationConstraint)that);
    return false;
  }

  public boolean equals(TDDIImplementationConstraint that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_Gid = true && this.isSetGid();
    boolean that_present_Gid = true && that.isSetGid();
    if (this_present_Gid || that_present_Gid) {
      if (!(this_present_Gid && that_present_Gid))
        return false;
      if (!this.Gid.equals(that.Gid))
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

    boolean this_present_CitedElement = true && this.isSetCitedElement();
    boolean that_present_CitedElement = true && that.isSetCitedElement();
    if (this_present_CitedElement || that_present_CitedElement) {
      if (!(this_present_CitedElement && that_present_CitedElement))
        return false;
      if (!this.CitedElement.equals(that.CitedElement))
        return false;
    }

    boolean this_present_AbstractForm = true && this.isSetAbstractForm();
    boolean that_present_AbstractForm = true && that.isSetAbstractForm();
    if (this_present_AbstractForm || that_present_AbstractForm) {
      if (!(this_present_AbstractForm && that_present_AbstractForm))
        return false;
      if (!this.AbstractForm.equals(that.AbstractForm))
        return false;
    }

    boolean this_present_Content = true && this.isSetContent();
    boolean that_present_Content = true && that.isSetContent();
    if (this_present_Content || that_present_Content) {
      if (!(this_present_Content && that_present_Content))
        return false;
      if (!this.Content.equals(that.Content))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetGid()) ? 131071 : 524287);
    if (isSetGid())
      hashCode = hashCode * 8191 + Gid.hashCode();

    hashCode = hashCode * 8191 + ((IsCitation) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((IsAbstract) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetCitedElement()) ? 131071 : 524287);
    if (isSetCitedElement())
      hashCode = hashCode * 8191 + CitedElement.hashCode();

    hashCode = hashCode * 8191 + ((isSetAbstractForm()) ? 131071 : 524287);
    if (isSetAbstractForm())
      hashCode = hashCode * 8191 + AbstractForm.hashCode();

    hashCode = hashCode * 8191 + ((isSetContent()) ? 131071 : 524287);
    if (isSetContent())
      hashCode = hashCode * 8191 + Content.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIImplementationConstraint other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetGid()).compareTo(other.isSetGid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Gid, other.Gid);
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
    lastComparison = java.lang.Boolean.valueOf(isSetAbstractForm()).compareTo(other.isSetAbstractForm());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAbstractForm()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.AbstractForm, other.AbstractForm);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetContent()).compareTo(other.isSetContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Content, other.Content);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIImplementationConstraint(");
    boolean first = true;

    sb.append("Gid:");
    if (this.Gid == null) {
      sb.append("null");
    } else {
      sb.append(this.Gid);
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
    sb.append("CitedElement:");
    if (this.CitedElement == null) {
      sb.append("null");
    } else {
      sb.append(this.CitedElement);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("AbstractForm:");
    if (this.AbstractForm == null) {
      sb.append("null");
    } else {
      sb.append(this.AbstractForm);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Content:");
    if (this.Content == null) {
      sb.append("null");
    } else {
      sb.append(this.Content);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (Content != null) {
      Content.validate();
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

  private static class TDDIImplementationConstraintStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIImplementationConstraintStandardScheme getScheme() {
      return new TDDIImplementationConstraintStandardScheme();
    }
  }

  private static class TDDIImplementationConstraintStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIImplementationConstraint> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIImplementationConstraint struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Gid = iprot.readString();
              struct.setGidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IS_CITATION
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.IsCitation = iprot.readBool();
              struct.setIsCitationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_ABSTRACT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.IsAbstract = iprot.readBool();
              struct.setIsAbstractIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CITED_ELEMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.CitedElement = new TDDIAbstractSACMElement();
              struct.CitedElement.read(iprot);
              struct.setCitedElementIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ABSTRACT_FORM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.AbstractForm = new TDDIAbstractSACMElement();
              struct.AbstractForm.read(iprot);
              struct.setAbstractFormIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.Content = new TDDIMultiLangString();
              struct.Content.read(iprot);
              struct.setContentIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIImplementationConstraint struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.Gid != null) {
        oprot.writeFieldBegin(GID_FIELD_DESC);
        oprot.writeString(struct.Gid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_CITATION_FIELD_DESC);
      oprot.writeBool(struct.IsCitation);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_ABSTRACT_FIELD_DESC);
      oprot.writeBool(struct.IsAbstract);
      oprot.writeFieldEnd();
      if (struct.CitedElement != null) {
        oprot.writeFieldBegin(CITED_ELEMENT_FIELD_DESC);
        struct.CitedElement.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.AbstractForm != null) {
        oprot.writeFieldBegin(ABSTRACT_FORM_FIELD_DESC);
        struct.AbstractForm.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.Content != null) {
        oprot.writeFieldBegin(CONTENT_FIELD_DESC);
        struct.Content.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIImplementationConstraintTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIImplementationConstraintTupleScheme getScheme() {
      return new TDDIImplementationConstraintTupleScheme();
    }
  }

  private static class TDDIImplementationConstraintTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIImplementationConstraint> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIImplementationConstraint struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetGid()) {
        optionals.set(0);
      }
      if (struct.isSetIsCitation()) {
        optionals.set(1);
      }
      if (struct.isSetIsAbstract()) {
        optionals.set(2);
      }
      if (struct.isSetCitedElement()) {
        optionals.set(3);
      }
      if (struct.isSetAbstractForm()) {
        optionals.set(4);
      }
      if (struct.isSetContent()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetGid()) {
        oprot.writeString(struct.Gid);
      }
      if (struct.isSetIsCitation()) {
        oprot.writeBool(struct.IsCitation);
      }
      if (struct.isSetIsAbstract()) {
        oprot.writeBool(struct.IsAbstract);
      }
      if (struct.isSetCitedElement()) {
        struct.CitedElement.write(oprot);
      }
      if (struct.isSetAbstractForm()) {
        struct.AbstractForm.write(oprot);
      }
      if (struct.isSetContent()) {
        struct.Content.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIImplementationConstraint struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.Gid = iprot.readString();
        struct.setGidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.IsCitation = iprot.readBool();
        struct.setIsCitationIsSet(true);
      }
      if (incoming.get(2)) {
        struct.IsAbstract = iprot.readBool();
        struct.setIsAbstractIsSet(true);
      }
      if (incoming.get(3)) {
        struct.CitedElement = new TDDIAbstractSACMElement();
        struct.CitedElement.read(iprot);
        struct.setCitedElementIsSet(true);
      }
      if (incoming.get(4)) {
        struct.AbstractForm = new TDDIAbstractSACMElement();
        struct.AbstractForm.read(iprot);
        struct.setAbstractFormIsSet(true);
      }
      if (incoming.get(5)) {
        struct.Content = new TDDIMultiLangString();
        struct.Content.read(iprot);
        struct.setContentIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

