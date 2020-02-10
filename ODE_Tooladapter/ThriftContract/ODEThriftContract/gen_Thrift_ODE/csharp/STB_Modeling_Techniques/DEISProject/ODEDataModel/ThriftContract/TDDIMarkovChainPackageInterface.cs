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
  public partial class TDDIMarkovChainPackageInterface : TBase
  {
    private long _Id;
    private string _Name;
    private string _Description;
    private bool _IsCitation;
    private bool _IsAbstract;
    private List<TDDIKeyValueMapRef> _KeyValueMaps;
    private TDDIAbstractBaseElement _CitedElement;
    private List<TDDIAbstractFailureAnalysisArtifactRef> _FailureAnalysisArtifacts;
    private List<TDDIAbstractMarkovArtifact> _MarkovArtifacts;
    private List<TDDIFailState> _FailStates;
    private TDDIAbstractMarkovChainPackage _Implements;

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

    public bool IsCitation
    {
      get
      {
        return _IsCitation;
      }
      set
      {
        __isset.IsCitation = true;
        this._IsCitation = value;
      }
    }

    public bool IsAbstract
    {
      get
      {
        return _IsAbstract;
      }
      set
      {
        __isset.IsAbstract = true;
        this._IsAbstract = value;
      }
    }

    public List<TDDIKeyValueMapRef> KeyValueMaps
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

    public TDDIAbstractBaseElement CitedElement
    {
      get
      {
        return _CitedElement;
      }
      set
      {
        __isset.CitedElement = true;
        this._CitedElement = value;
      }
    }

    public List<TDDIAbstractFailureAnalysisArtifactRef> FailureAnalysisArtifacts
    {
      get
      {
        return _FailureAnalysisArtifacts;
      }
      set
      {
        __isset.FailureAnalysisArtifacts = true;
        this._FailureAnalysisArtifacts = value;
      }
    }

    public List<TDDIAbstractMarkovArtifact> MarkovArtifacts
    {
      get
      {
        return _MarkovArtifacts;
      }
      set
      {
        __isset.MarkovArtifacts = true;
        this._MarkovArtifacts = value;
      }
    }

    public List<TDDIFailState> FailStates
    {
      get
      {
        return _FailStates;
      }
      set
      {
        __isset.FailStates = true;
        this._FailStates = value;
      }
    }

    public TDDIAbstractMarkovChainPackage Implements
    {
      get
      {
        return _Implements;
      }
      set
      {
        __isset.Implements = true;
        this._Implements = value;
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
      public bool IsCitation;
      public bool IsAbstract;
      public bool KeyValueMaps;
      public bool CitedElement;
      public bool FailureAnalysisArtifacts;
      public bool MarkovArtifacts;
      public bool FailStates;
      public bool Implements;
    }

    public TDDIMarkovChainPackageInterface() {
      this._Name = "";
      this.__isset.Name = true;
      this._Description = "";
      this.__isset.Description = true;
      this._IsCitation = false;
      this.__isset.IsCitation = true;
      this._IsAbstract = false;
      this.__isset.IsAbstract = true;
      this._KeyValueMaps = new List<TDDIKeyValueMapRef>();
      this.__isset.KeyValueMaps = true;
      this._FailureAnalysisArtifacts = new List<TDDIAbstractFailureAnalysisArtifactRef>();
      this.__isset.FailureAnalysisArtifacts = true;
      this._MarkovArtifacts = new List<TDDIAbstractMarkovArtifact>();
      this.__isset.MarkovArtifacts = true;
      this._FailStates = new List<TDDIFailState>();
      this.__isset.FailStates = true;
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
              if (field.Type == TType.Bool) {
                IsCitation = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.Bool) {
                IsAbstract = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.List) {
                {
                  KeyValueMaps = new List<TDDIKeyValueMapRef>();
                  TList _list844 = iprot.ReadListBegin();
                  for( int _i845 = 0; _i845 < _list844.Count; ++_i845)
                  {
                    TDDIKeyValueMapRef _elem846;
                    _elem846 = new TDDIKeyValueMapRef();
                    _elem846.Read(iprot);
                    KeyValueMaps.Add(_elem846);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.Struct) {
                CitedElement = new TDDIAbstractBaseElement();
                CitedElement.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 8:
              if (field.Type == TType.List) {
                {
                  FailureAnalysisArtifacts = new List<TDDIAbstractFailureAnalysisArtifactRef>();
                  TList _list847 = iprot.ReadListBegin();
                  for( int _i848 = 0; _i848 < _list847.Count; ++_i848)
                  {
                    TDDIAbstractFailureAnalysisArtifactRef _elem849;
                    _elem849 = new TDDIAbstractFailureAnalysisArtifactRef();
                    _elem849.Read(iprot);
                    FailureAnalysisArtifacts.Add(_elem849);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 9:
              if (field.Type == TType.List) {
                {
                  MarkovArtifacts = new List<TDDIAbstractMarkovArtifact>();
                  TList _list850 = iprot.ReadListBegin();
                  for( int _i851 = 0; _i851 < _list850.Count; ++_i851)
                  {
                    TDDIAbstractMarkovArtifact _elem852;
                    _elem852 = new TDDIAbstractMarkovArtifact();
                    _elem852.Read(iprot);
                    MarkovArtifacts.Add(_elem852);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 10:
              if (field.Type == TType.List) {
                {
                  FailStates = new List<TDDIFailState>();
                  TList _list853 = iprot.ReadListBegin();
                  for( int _i854 = 0; _i854 < _list853.Count; ++_i854)
                  {
                    TDDIFailState _elem855;
                    _elem855 = new TDDIFailState();
                    _elem855.Read(iprot);
                    FailStates.Add(_elem855);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 11:
              if (field.Type == TType.Struct) {
                Implements = new TDDIAbstractMarkovChainPackage();
                Implements.Read(iprot);
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
        TStruct struc = new TStruct("TDDIMarkovChainPackageInterface");
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
        if (__isset.IsCitation) {
          field.Name = "IsCitation";
          field.Type = TType.Bool;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(IsCitation);
          oprot.WriteFieldEnd();
        }
        if (__isset.IsAbstract) {
          field.Name = "IsAbstract";
          field.Type = TType.Bool;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(IsAbstract);
          oprot.WriteFieldEnd();
        }
        if (KeyValueMaps != null && __isset.KeyValueMaps) {
          field.Name = "KeyValueMaps";
          field.Type = TType.List;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, KeyValueMaps.Count));
            foreach (TDDIKeyValueMapRef _iter856 in KeyValueMaps)
            {
              _iter856.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (CitedElement != null && __isset.CitedElement) {
          field.Name = "CitedElement";
          field.Type = TType.Struct;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          CitedElement.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (FailureAnalysisArtifacts != null && __isset.FailureAnalysisArtifacts) {
          field.Name = "FailureAnalysisArtifacts";
          field.Type = TType.List;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, FailureAnalysisArtifacts.Count));
            foreach (TDDIAbstractFailureAnalysisArtifactRef _iter857 in FailureAnalysisArtifacts)
            {
              _iter857.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (MarkovArtifacts != null && __isset.MarkovArtifacts) {
          field.Name = "MarkovArtifacts";
          field.Type = TType.List;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, MarkovArtifacts.Count));
            foreach (TDDIAbstractMarkovArtifact _iter858 in MarkovArtifacts)
            {
              _iter858.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (FailStates != null && __isset.FailStates) {
          field.Name = "FailStates";
          field.Type = TType.List;
          field.ID = 10;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, FailStates.Count));
            foreach (TDDIFailState _iter859 in FailStates)
            {
              _iter859.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Implements != null && __isset.Implements) {
          field.Name = "Implements";
          field.Type = TType.Struct;
          field.ID = 11;
          oprot.WriteFieldBegin(field);
          Implements.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIMarkovChainPackageInterface(");
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
      if (__isset.IsCitation) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("IsCitation: ");
        __sb.Append(IsCitation);
      }
      if (__isset.IsAbstract) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("IsAbstract: ");
        __sb.Append(IsAbstract);
      }
      if (KeyValueMaps != null && __isset.KeyValueMaps) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("KeyValueMaps: ");
        __sb.Append(KeyValueMaps);
      }
      if (CitedElement != null && __isset.CitedElement) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("CitedElement: ");
        __sb.Append(CitedElement== null ? "<null>" : CitedElement.ToString());
      }
      if (FailureAnalysisArtifacts != null && __isset.FailureAnalysisArtifacts) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FailureAnalysisArtifacts: ");
        __sb.Append(FailureAnalysisArtifacts);
      }
      if (MarkovArtifacts != null && __isset.MarkovArtifacts) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("MarkovArtifacts: ");
        __sb.Append(MarkovArtifacts);
      }
      if (FailStates != null && __isset.FailStates) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FailStates: ");
        __sb.Append(FailStates);
      }
      if (Implements != null && __isset.Implements) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Implements: ");
        __sb.Append(Implements== null ? "<null>" : Implements.ToString());
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
