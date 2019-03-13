/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;

namespace STB_Modeling_Techniques.DEISProject.ODEDataModel.ThriftContract
{

  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class TDDIFMEA : TBase
  {
    private long _Id;
    private string _Name;
    private string _Description;
    private List<TDDIKeyValueMap> _KeyValueMaps;
    private List<TDDIMinimalCutSets> _MinimalCutSets;
    private List<TDDIAbstractFailure> _Failures;
    private List<TDDIAbstractFailureModelRef> _SubModels;
    private TDDIFMEAType _Type;
    private List<TDDIAbstractFMEAEntry> _Entries;

    public long Id
    {
      get
      {
        return _Id;
      }
      set
      {
        __isset.Id = true;
        this._Id = value;
      }
    }

    public string Name
    {
      get
      {
        return _Name;
      }
      set
      {
        __isset.Name = true;
        this._Name = value;
      }
    }

    public string Description
    {
      get
      {
        return _Description;
      }
      set
      {
        __isset.Description = true;
        this._Description = value;
      }
    }

    public List<TDDIKeyValueMap> KeyValueMaps
    {
      get
      {
        return _KeyValueMaps;
      }
      set
      {
        __isset.KeyValueMaps = true;
        this._KeyValueMaps = value;
      }
    }

    public List<TDDIMinimalCutSets> MinimalCutSets
    {
      get
      {
        return _MinimalCutSets;
      }
      set
      {
        __isset.MinimalCutSets = true;
        this._MinimalCutSets = value;
      }
    }

    public List<TDDIAbstractFailure> Failures
    {
      get
      {
        return _Failures;
      }
      set
      {
        __isset.Failures = true;
        this._Failures = value;
      }
    }

    public List<TDDIAbstractFailureModelRef> SubModels
    {
      get
      {
        return _SubModels;
      }
      set
      {
        __isset.SubModels = true;
        this._SubModels = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="TDDIFMEAType"/>
    /// </summary>
    public TDDIFMEAType Type
    {
      get
      {
        return _Type;
      }
      set
      {
        __isset.Type = true;
        this._Type = value;
      }
    }

    public List<TDDIAbstractFMEAEntry> Entries
    {
      get
      {
        return _Entries;
      }
      set
      {
        __isset.Entries = true;
        this._Entries = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool Id;
      public bool Name;
      public bool Description;
      public bool KeyValueMaps;
      public bool MinimalCutSets;
      public bool Failures;
      public bool SubModels;
      public bool Type;
      public bool Entries;
    }

    public TDDIFMEA() {
      this._Name = "";
      this.__isset.Name = true;
      this._Description = "";
      this.__isset.Description = true;
      this._KeyValueMaps = new List<TDDIKeyValueMap>();
      this.__isset.KeyValueMaps = true;
      this._MinimalCutSets = new List<TDDIMinimalCutSets>();
      this.__isset.MinimalCutSets = true;
      this._Failures = new List<TDDIAbstractFailure>();
      this.__isset.Failures = true;
      this._SubModels = new List<TDDIAbstractFailureModelRef>();
      this.__isset.SubModels = true;
      this._Entries = new List<TDDIAbstractFMEAEntry>();
      this.__isset.Entries = true;
    }

    public void Read (TProtocol iprot)
    {
      iprot.IncrementRecursionDepth();
      try
      {
        TField field;
        iprot.ReadStructBegin();
        while (true)
        {
          field = iprot.ReadFieldBegin();
          if (field.Type == TType.Stop) { 
            break;
          }
          switch (field.ID)
          {
            case 1:
              if (field.Type == TType.I64) {
                Id = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.String) {
                Name = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.String) {
                Description = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.List) {
                {
                  KeyValueMaps = new List<TDDIKeyValueMap>();
                  TList _list464 = iprot.ReadListBegin();
                  for( int _i465 = 0; _i465 < _list464.Count; ++_i465)
                  {
                    TDDIKeyValueMap _elem466;
                    _elem466 = new TDDIKeyValueMap();
                    _elem466.Read(iprot);
                    KeyValueMaps.Add(_elem466);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.List) {
                {
                  MinimalCutSets = new List<TDDIMinimalCutSets>();
                  TList _list467 = iprot.ReadListBegin();
                  for( int _i468 = 0; _i468 < _list467.Count; ++_i468)
                  {
                    TDDIMinimalCutSets _elem469;
                    _elem469 = new TDDIMinimalCutSets();
                    _elem469.Read(iprot);
                    MinimalCutSets.Add(_elem469);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.List) {
                {
                  Failures = new List<TDDIAbstractFailure>();
                  TList _list470 = iprot.ReadListBegin();
                  for( int _i471 = 0; _i471 < _list470.Count; ++_i471)
                  {
                    TDDIAbstractFailure _elem472;
                    _elem472 = new TDDIAbstractFailure();
                    _elem472.Read(iprot);
                    Failures.Add(_elem472);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.List) {
                {
                  SubModels = new List<TDDIAbstractFailureModelRef>();
                  TList _list473 = iprot.ReadListBegin();
                  for( int _i474 = 0; _i474 < _list473.Count; ++_i474)
                  {
                    TDDIAbstractFailureModelRef _elem475;
                    _elem475 = new TDDIAbstractFailureModelRef();
                    _elem475.Read(iprot);
                    SubModels.Add(_elem475);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 8:
              if (field.Type == TType.I32) {
                Type = (TDDIFMEAType)iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 9:
              if (field.Type == TType.List) {
                {
                  Entries = new List<TDDIAbstractFMEAEntry>();
                  TList _list476 = iprot.ReadListBegin();
                  for( int _i477 = 0; _i477 < _list476.Count; ++_i477)
                  {
                    TDDIAbstractFMEAEntry _elem478;
                    _elem478 = new TDDIAbstractFMEAEntry();
                    _elem478.Read(iprot);
                    Entries.Add(_elem478);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            default: 
              TProtocolUtil.Skip(iprot, field.Type);
              break;
          }
          iprot.ReadFieldEnd();
        }
        iprot.ReadStructEnd();
      }
      finally
      {
        iprot.DecrementRecursionDepth();
      }
    }

    public void Write(TProtocol oprot) {
      oprot.IncrementRecursionDepth();
      try
      {
        TStruct struc = new TStruct("TDDIFMEA");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (__isset.Id) {
          field.Name = "Id";
          field.Type = TType.I64;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(Id);
          oprot.WriteFieldEnd();
        }
        if (Name != null && __isset.Name) {
          field.Name = "Name";
          field.Type = TType.String;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(Name);
          oprot.WriteFieldEnd();
        }
        if (Description != null && __isset.Description) {
          field.Name = "Description";
          field.Type = TType.String;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(Description);
          oprot.WriteFieldEnd();
        }
        if (KeyValueMaps != null && __isset.KeyValueMaps) {
          field.Name = "KeyValueMaps";
          field.Type = TType.List;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, KeyValueMaps.Count));
            foreach (TDDIKeyValueMap _iter479 in KeyValueMaps)
            {
              _iter479.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (MinimalCutSets != null && __isset.MinimalCutSets) {
          field.Name = "MinimalCutSets";
          field.Type = TType.List;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, MinimalCutSets.Count));
            foreach (TDDIMinimalCutSets _iter480 in MinimalCutSets)
            {
              _iter480.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Failures != null && __isset.Failures) {
          field.Name = "Failures";
          field.Type = TType.List;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Failures.Count));
            foreach (TDDIAbstractFailure _iter481 in Failures)
            {
              _iter481.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (SubModels != null && __isset.SubModels) {
          field.Name = "SubModels";
          field.Type = TType.List;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, SubModels.Count));
            foreach (TDDIAbstractFailureModelRef _iter482 in SubModels)
            {
              _iter482.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (__isset.Type) {
          field.Name = "Type";
          field.Type = TType.I32;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)Type);
          oprot.WriteFieldEnd();
        }
        if (Entries != null && __isset.Entries) {
          field.Name = "Entries";
          field.Type = TType.List;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Entries.Count));
            foreach (TDDIAbstractFMEAEntry _iter483 in Entries)
            {
              _iter483.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        oprot.WriteFieldStop();
        oprot.WriteStructEnd();
      }
      finally
      {
        oprot.DecrementRecursionDepth();
      }
    }

    public override string ToString() {
      StringBuilder __sb = new StringBuilder("TDDIFMEA(");
      bool __first = true;
      if (__isset.Id) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Id: ");
        __sb.Append(Id);
      }
      if (Name != null && __isset.Name) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Name: ");
        __sb.Append(Name);
      }
      if (Description != null && __isset.Description) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Description: ");
        __sb.Append(Description);
      }
      if (KeyValueMaps != null && __isset.KeyValueMaps) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("KeyValueMaps: ");
        __sb.Append(KeyValueMaps);
      }
      if (MinimalCutSets != null && __isset.MinimalCutSets) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("MinimalCutSets: ");
        __sb.Append(MinimalCutSets);
      }
      if (Failures != null && __isset.Failures) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Failures: ");
        __sb.Append(Failures);
      }
      if (SubModels != null && __isset.SubModels) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("SubModels: ");
        __sb.Append(SubModels);
      }
      if (__isset.Type) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Type: ");
        __sb.Append(Type);
      }
      if (Entries != null && __isset.Entries) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Entries: ");
        __sb.Append(Entries);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
