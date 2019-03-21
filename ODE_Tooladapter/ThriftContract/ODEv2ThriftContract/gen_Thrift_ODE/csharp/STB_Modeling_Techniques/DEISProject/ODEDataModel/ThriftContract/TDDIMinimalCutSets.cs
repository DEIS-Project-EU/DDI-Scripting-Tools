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
  public partial class TDDIMinimalCutSets : TBase
  {
    private long _Id;
    private string _Name;
    private string _Description;
    private List<TDDIKeyValueMap> _KeyValueMaps;
    private List<TDDIMinimalCutSet> _Cutsets;
    private List<TDDIAbstractFailureRef> _Failures;

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

    public List<TDDIMinimalCutSet> Cutsets
    {
      get
      {
        return _Cutsets;
      }
      set
      {
        __isset.Cutsets = true;
        this._Cutsets = value;
      }
    }

    public List<TDDIAbstractFailureRef> Failures
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


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool Id;
      public bool Name;
      public bool Description;
      public bool KeyValueMaps;
      public bool Cutsets;
      public bool Failures;
    }

    public TDDIMinimalCutSets() {
      this._Name = "";
      this.__isset.Name = true;
      this._Description = "";
      this.__isset.Description = true;
      this._KeyValueMaps = new List<TDDIKeyValueMap>();
      this.__isset.KeyValueMaps = true;
      this._Cutsets = new List<TDDIMinimalCutSet>();
      this.__isset.Cutsets = true;
      this._Failures = new List<TDDIAbstractFailureRef>();
      this.__isset.Failures = true;
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
                  TList _list420 = iprot.ReadListBegin();
                  for( int _i421 = 0; _i421 < _list420.Count; ++_i421)
                  {
                    TDDIKeyValueMap _elem422;
                    _elem422 = new TDDIKeyValueMap();
                    _elem422.Read(iprot);
                    KeyValueMaps.Add(_elem422);
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
                  Cutsets = new List<TDDIMinimalCutSet>();
                  TList _list423 = iprot.ReadListBegin();
                  for( int _i424 = 0; _i424 < _list423.Count; ++_i424)
                  {
                    TDDIMinimalCutSet _elem425;
                    _elem425 = new TDDIMinimalCutSet();
                    _elem425.Read(iprot);
                    Cutsets.Add(_elem425);
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
                  Failures = new List<TDDIAbstractFailureRef>();
                  TList _list426 = iprot.ReadListBegin();
                  for( int _i427 = 0; _i427 < _list426.Count; ++_i427)
                  {
                    TDDIAbstractFailureRef _elem428;
                    _elem428 = new TDDIAbstractFailureRef();
                    _elem428.Read(iprot);
                    Failures.Add(_elem428);
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
        TStruct struc = new TStruct("TDDIMinimalCutSets");
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
            foreach (TDDIKeyValueMap _iter429 in KeyValueMaps)
            {
              _iter429.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Cutsets != null && __isset.Cutsets) {
          field.Name = "Cutsets";
          field.Type = TType.List;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Cutsets.Count));
            foreach (TDDIMinimalCutSet _iter430 in Cutsets)
            {
              _iter430.Write(oprot);
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
            foreach (TDDIAbstractFailureRef _iter431 in Failures)
            {
              _iter431.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIMinimalCutSets(");
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
      if (Cutsets != null && __isset.Cutsets) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Cutsets: ");
        __sb.Append(Cutsets);
      }
      if (Failures != null && __isset.Failures) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Failures: ");
        __sb.Append(Failures);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}