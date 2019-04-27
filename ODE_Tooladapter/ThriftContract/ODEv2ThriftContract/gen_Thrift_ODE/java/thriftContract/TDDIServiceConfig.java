/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-03-13")
public class TDDIServiceConfig implements org.apache.thrift.TBase<TDDIServiceConfig, TDDIServiceConfig._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIServiceConfig> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIServiceConfig");

  private static final org.apache.thrift.protocol.TField DDIFILE_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("DDIFilePath", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField EPSILON_SCRIPT_EXECUTION_CONFIG_FIELD_DESC = new org.apache.thrift.protocol.TField("EpsilonScriptExecutionConfig", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIServiceConfigStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIServiceConfigTupleSchemeFactory();

  public java.lang.String DDIFilePath; // required
  public java.util.List<TDDIEpsilonScriptExecutionConfig> EpsilonScriptExecutionConfig; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DDIFILE_PATH((short)1, "DDIFilePath"),
    EPSILON_SCRIPT_EXECUTION_CONFIG((short)2, "EpsilonScriptExecutionConfig");

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
        case 1: // DDIFILE_PATH
          return DDIFILE_PATH;
        case 2: // EPSILON_SCRIPT_EXECUTION_CONFIG
          return EPSILON_SCRIPT_EXECUTION_CONFIG;
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
    tmpMap.put(_Fields.DDIFILE_PATH, new org.apache.thrift.meta_data.FieldMetaData("DDIFilePath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EPSILON_SCRIPT_EXECUTION_CONFIG, new org.apache.thrift.meta_data.FieldMetaData("EpsilonScriptExecutionConfig", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "TDDIEpsilonScriptExecutionConfig"))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIServiceConfig.class, metaDataMap);
  }

  public TDDIServiceConfig() {
    this.DDIFilePath = "";

    this.EpsilonScriptExecutionConfig = new java.util.ArrayList<TDDIEpsilonScriptExecutionConfig>();

  }

  public TDDIServiceConfig(
    java.lang.String DDIFilePath,
    java.util.List<TDDIEpsilonScriptExecutionConfig> EpsilonScriptExecutionConfig)
  {
    this();
    this.DDIFilePath = DDIFilePath;
    this.EpsilonScriptExecutionConfig = EpsilonScriptExecutionConfig;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIServiceConfig(TDDIServiceConfig other) {
    if (other.isSetDDIFilePath()) {
      this.DDIFilePath = other.DDIFilePath;
    }
    if (other.isSetEpsilonScriptExecutionConfig()) {
      java.util.List<TDDIEpsilonScriptExecutionConfig> __this__EpsilonScriptExecutionConfig = new java.util.ArrayList<TDDIEpsilonScriptExecutionConfig>(other.EpsilonScriptExecutionConfig.size());
      for (TDDIEpsilonScriptExecutionConfig other_element : other.EpsilonScriptExecutionConfig) {
        __this__EpsilonScriptExecutionConfig.add(new TDDIEpsilonScriptExecutionConfig(other_element));
      }
      this.EpsilonScriptExecutionConfig = __this__EpsilonScriptExecutionConfig;
    }
  }

  public TDDIServiceConfig deepCopy() {
    return new TDDIServiceConfig(this);
  }

  @Override
  public void clear() {
    this.DDIFilePath = "";

    this.EpsilonScriptExecutionConfig = new java.util.ArrayList<TDDIEpsilonScriptExecutionConfig>();

  }

  public java.lang.String getDDIFilePath() {
    return this.DDIFilePath;
  }

  public TDDIServiceConfig setDDIFilePath(java.lang.String DDIFilePath) {
    this.DDIFilePath = DDIFilePath;
    return this;
  }

  public void unsetDDIFilePath() {
    this.DDIFilePath = null;
  }

  /** Returns true if field DDIFilePath is set (has been assigned a value) and false otherwise */
  public boolean isSetDDIFilePath() {
    return this.DDIFilePath != null;
  }

  public void setDDIFilePathIsSet(boolean value) {
    if (!value) {
      this.DDIFilePath = null;
    }
  }

  public int getEpsilonScriptExecutionConfigSize() {
    return (this.EpsilonScriptExecutionConfig == null) ? 0 : this.EpsilonScriptExecutionConfig.size();
  }

  public java.util.Iterator<TDDIEpsilonScriptExecutionConfig> getEpsilonScriptExecutionConfigIterator() {
    return (this.EpsilonScriptExecutionConfig == null) ? null : this.EpsilonScriptExecutionConfig.iterator();
  }

  public void addToEpsilonScriptExecutionConfig(TDDIEpsilonScriptExecutionConfig elem) {
    if (this.EpsilonScriptExecutionConfig == null) {
      this.EpsilonScriptExecutionConfig = new java.util.ArrayList<TDDIEpsilonScriptExecutionConfig>();
    }
    this.EpsilonScriptExecutionConfig.add(elem);
  }

  public java.util.List<TDDIEpsilonScriptExecutionConfig> getEpsilonScriptExecutionConfig() {
    return this.EpsilonScriptExecutionConfig;
  }

  public TDDIServiceConfig setEpsilonScriptExecutionConfig(java.util.List<TDDIEpsilonScriptExecutionConfig> EpsilonScriptExecutionConfig) {
    this.EpsilonScriptExecutionConfig = EpsilonScriptExecutionConfig;
    return this;
  }

  public void unsetEpsilonScriptExecutionConfig() {
    this.EpsilonScriptExecutionConfig = null;
  }

  /** Returns true if field EpsilonScriptExecutionConfig is set (has been assigned a value) and false otherwise */
  public boolean isSetEpsilonScriptExecutionConfig() {
    return this.EpsilonScriptExecutionConfig != null;
  }

  public void setEpsilonScriptExecutionConfigIsSet(boolean value) {
    if (!value) {
      this.EpsilonScriptExecutionConfig = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case DDIFILE_PATH:
      if (value == null) {
        unsetDDIFilePath();
      } else {
        setDDIFilePath((java.lang.String)value);
      }
      break;

    case EPSILON_SCRIPT_EXECUTION_CONFIG:
      if (value == null) {
        unsetEpsilonScriptExecutionConfig();
      } else {
        setEpsilonScriptExecutionConfig((java.util.List<TDDIEpsilonScriptExecutionConfig>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DDIFILE_PATH:
      return getDDIFilePath();

    case EPSILON_SCRIPT_EXECUTION_CONFIG:
      return getEpsilonScriptExecutionConfig();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case DDIFILE_PATH:
      return isSetDDIFilePath();
    case EPSILON_SCRIPT_EXECUTION_CONFIG:
      return isSetEpsilonScriptExecutionConfig();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIServiceConfig)
      return this.equals((TDDIServiceConfig)that);
    return false;
  }

  public boolean equals(TDDIServiceConfig that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_DDIFilePath = true && this.isSetDDIFilePath();
    boolean that_present_DDIFilePath = true && that.isSetDDIFilePath();
    if (this_present_DDIFilePath || that_present_DDIFilePath) {
      if (!(this_present_DDIFilePath && that_present_DDIFilePath))
        return false;
      if (!this.DDIFilePath.equals(that.DDIFilePath))
        return false;
    }

    boolean this_present_EpsilonScriptExecutionConfig = true && this.isSetEpsilonScriptExecutionConfig();
    boolean that_present_EpsilonScriptExecutionConfig = true && that.isSetEpsilonScriptExecutionConfig();
    if (this_present_EpsilonScriptExecutionConfig || that_present_EpsilonScriptExecutionConfig) {
      if (!(this_present_EpsilonScriptExecutionConfig && that_present_EpsilonScriptExecutionConfig))
        return false;
      if (!this.EpsilonScriptExecutionConfig.equals(that.EpsilonScriptExecutionConfig))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDDIFilePath()) ? 131071 : 524287);
    if (isSetDDIFilePath())
      hashCode = hashCode * 8191 + DDIFilePath.hashCode();

    hashCode = hashCode * 8191 + ((isSetEpsilonScriptExecutionConfig()) ? 131071 : 524287);
    if (isSetEpsilonScriptExecutionConfig())
      hashCode = hashCode * 8191 + EpsilonScriptExecutionConfig.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIServiceConfig other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetDDIFilePath()).compareTo(other.isSetDDIFilePath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDDIFilePath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.DDIFilePath, other.DDIFilePath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEpsilonScriptExecutionConfig()).compareTo(other.isSetEpsilonScriptExecutionConfig());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEpsilonScriptExecutionConfig()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.EpsilonScriptExecutionConfig, other.EpsilonScriptExecutionConfig);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIServiceConfig(");
    boolean first = true;

    sb.append("DDIFilePath:");
    if (this.DDIFilePath == null) {
      sb.append("null");
    } else {
      sb.append(this.DDIFilePath);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("EpsilonScriptExecutionConfig:");
    if (this.EpsilonScriptExecutionConfig == null) {
      sb.append("null");
    } else {
      sb.append(this.EpsilonScriptExecutionConfig);
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

  private static class TDDIServiceConfigStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIServiceConfigStandardScheme getScheme() {
      return new TDDIServiceConfigStandardScheme();
    }
  }

  private static class TDDIServiceConfigStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIServiceConfig> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIServiceConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DDIFILE_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.DDIFilePath = iprot.readString();
              struct.setDDIFilePathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EPSILON_SCRIPT_EXECUTION_CONFIG
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list2752 = iprot.readListBegin();
                struct.EpsilonScriptExecutionConfig = new java.util.ArrayList<TDDIEpsilonScriptExecutionConfig>(_list2752.size);
                TDDIEpsilonScriptExecutionConfig _elem2753;
                for (int _i2754 = 0; _i2754 < _list2752.size; ++_i2754)
                {
                  _elem2753 = new TDDIEpsilonScriptExecutionConfig();
                  _elem2753.read(iprot);
                  struct.EpsilonScriptExecutionConfig.add(_elem2753);
                }
                iprot.readListEnd();
              }
              struct.setEpsilonScriptExecutionConfigIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIServiceConfig struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.DDIFilePath != null) {
        oprot.writeFieldBegin(DDIFILE_PATH_FIELD_DESC);
        oprot.writeString(struct.DDIFilePath);
        oprot.writeFieldEnd();
      }
      if (struct.EpsilonScriptExecutionConfig != null) {
        oprot.writeFieldBegin(EPSILON_SCRIPT_EXECUTION_CONFIG_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.EpsilonScriptExecutionConfig.size()));
          for (TDDIEpsilonScriptExecutionConfig _iter2755 : struct.EpsilonScriptExecutionConfig)
          {
            _iter2755.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIServiceConfigTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIServiceConfigTupleScheme getScheme() {
      return new TDDIServiceConfigTupleScheme();
    }
  }

  private static class TDDIServiceConfigTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIServiceConfig> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIServiceConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDDIFilePath()) {
        optionals.set(0);
      }
      if (struct.isSetEpsilonScriptExecutionConfig()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetDDIFilePath()) {
        oprot.writeString(struct.DDIFilePath);
      }
      if (struct.isSetEpsilonScriptExecutionConfig()) {
        {
          oprot.writeI32(struct.EpsilonScriptExecutionConfig.size());
          for (TDDIEpsilonScriptExecutionConfig _iter2756 : struct.EpsilonScriptExecutionConfig)
          {
            _iter2756.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIServiceConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.DDIFilePath = iprot.readString();
        struct.setDDIFilePathIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list2757 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.EpsilonScriptExecutionConfig = new java.util.ArrayList<TDDIEpsilonScriptExecutionConfig>(_list2757.size);
          TDDIEpsilonScriptExecutionConfig _elem2758;
          for (int _i2759 = 0; _i2759 < _list2757.size; ++_i2759)
          {
            _elem2758 = new TDDIEpsilonScriptExecutionConfig();
            _elem2758.read(iprot);
            struct.EpsilonScriptExecutionConfig.add(_elem2758);
          }
        }
        struct.setEpsilonScriptExecutionConfigIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
