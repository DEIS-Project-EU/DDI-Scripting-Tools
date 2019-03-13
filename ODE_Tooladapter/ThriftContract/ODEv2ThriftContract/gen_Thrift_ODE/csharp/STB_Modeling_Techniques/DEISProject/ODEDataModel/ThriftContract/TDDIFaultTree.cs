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
  public partial class TDDIFaultTree : TBase
  {
    private long _Id;
    private string _Name;
    private string _Description;
    private List<TDDIKeyValueMap> _KeyValueMaps;
    private List<TDDIMinimalCutSets> _MinimalCutSets;
    private List<TDDIAbstractFailure> _Failures;
    private List<TDDIAbstractFailureModelRef> _SubModels;
    private List<TDDIAbstractCause> _Causes;

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

    public List<TDDIAbstractCause> Causes
    {
      get
      {
        return _Causes;
      }
      set
      {
        __isset.Causes = true;
        this._Causes = value;
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
      public bool Causes;
    }

    public TDDIFaultTree() {
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
      this._Causes = new List<TDDIAbstractCause>();
      this.__isset.Causes = true;
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
                  TList _list496 = iprot.ReadListBegin();
                  for( int _i497 = 0; _i497 < _list496.Count; ++_i497)
                  {
                    TDDIKeyValueMap _elem498;
                    _elem498 = new TDDIKeyValueMap();
                    _elem498.Read(iprot);
                    KeyValueMaps.Add(_elem498);
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
                  TList _list499 = iprot.ReadListBegin();
                  for( int _i500 = 0; _i500 < _list499.Count; ++_i500)
                  {
                    TDDIMinimalCutSets _elem501;
                    _elem501 = new TDDIMinimalCutSets();
                    _elem501.Read(iprot);
                    MinimalCutSets.Add(_elem501);
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
                  TList _list502 = iprot.ReadListBegin();
                  for( int _i503 = 0; _i503 < _list502.Count; ++_i503)
                  {
                    TDDIAbstractFailure _elem504;
                    _elem504 = new TDDIAbstractFailure();
                    _elem504.Read(iprot);
                    Failures.Add(_elem504);
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
                  TList _list505 = iprot.ReadListBegin();
                  for( int _i506 = 0; _i506 < _list505.Count; ++_i506)
                  {
                    TDDIAbstractFailureModelRef _elem507;
                    _elem507 = new TDDIAbstractFailureModelRef();
                    _elem507.Read(iprot);
                    SubModels.Add(_elem507);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 8:
              if (field.Type == TType.List) {
                {
                  Causes = new List<TDDIAbstractCause>();
                  TList _list508 = iprot.ReadListBegin();
                  for( int _i509 = 0; _i509 < _list508.Count; ++_i509)
                  {
                    TDDIAbstractCause _elem510;
                    _elem510 = new TDDIAbstractCause();
                    _elem510.Read(iprot);
                    Causes.Add(_elem510);
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
        TStruct struc = new TStruct("TDDIFaultTree");
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
            foreach (TDDIKeyValueMap _iter511 in KeyValueMaps)
            {
              _iter511.Write(oprot);
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
            foreach (TDDIMinimalCutSets _iter512 in MinimalCutSets)
            {
              _iter512.Write(oprot);
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
            foreach (TDDIAbstractFailure _iter513 in Failures)
            {
              _iter513.Write(oprot);
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
            foreach (TDDIAbstractFailureModelRef _iter514 in SubModels)
            {
              _iter514.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Causes != null && __isset.Causes) {
          field.Name = "Causes";
          field.Type = TType.List;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Causes.Count));
            foreach (TDDIAbstractCause _iter515 in Causes)
            {
              _iter515.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIFaultTree(");
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
      if (Causes != null && __isset.Causes) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Causes: ");
        __sb.Append(Causes);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
