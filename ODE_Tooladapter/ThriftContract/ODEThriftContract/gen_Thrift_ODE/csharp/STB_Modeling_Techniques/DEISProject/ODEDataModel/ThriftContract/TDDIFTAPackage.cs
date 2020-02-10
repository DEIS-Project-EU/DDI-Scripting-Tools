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
  public partial class TDDIFTAPackage : TBase
  {
    private long _Id;
    private string _Name;
    private string _Description;
    private bool _IsCitation;
    private bool _IsAbstract;
    private List<TDDIKeyValueMapRef> _KeyValueMaps;
    private TDDIAbstractBaseElement _CitedElement;
    private List<TDDIAbstractFailureAnalysisArtifactRef> _FailureAnalysisArtifacts;
    private List<TDDIAbstractFTAArtifact> _FTAArtifacts;
    private List<TDDIBasicEvent> _BasicEvents;

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

    public List<TDDIAbstractFTAArtifact> FTAArtifacts
    {
      get
      {
        return _FTAArtifacts;
      }
      set
      {
        __isset.FTAArtifacts = true;
        this._FTAArtifacts = value;
      }
    }

    public List<TDDIBasicEvent> BasicEvents
    {
      get
      {
        return _BasicEvents;
      }
      set
      {
        __isset.BasicEvents = true;
        this._BasicEvents = value;
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
      public bool FTAArtifacts;
      public bool BasicEvents;
    }

    public TDDIFTAPackage() {
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
      this._FTAArtifacts = new List<TDDIAbstractFTAArtifact>();
      this.__isset.FTAArtifacts = true;
      this._BasicEvents = new List<TDDIBasicEvent>();
      this.__isset.BasicEvents = true;
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
                  TList _list604 = iprot.ReadListBegin();
                  for( int _i605 = 0; _i605 < _list604.Count; ++_i605)
                  {
                    TDDIKeyValueMapRef _elem606;
                    _elem606 = new TDDIKeyValueMapRef();
                    _elem606.Read(iprot);
                    KeyValueMaps.Add(_elem606);
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
                  TList _list607 = iprot.ReadListBegin();
                  for( int _i608 = 0; _i608 < _list607.Count; ++_i608)
                  {
                    TDDIAbstractFailureAnalysisArtifactRef _elem609;
                    _elem609 = new TDDIAbstractFailureAnalysisArtifactRef();
                    _elem609.Read(iprot);
                    FailureAnalysisArtifacts.Add(_elem609);
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
                  FTAArtifacts = new List<TDDIAbstractFTAArtifact>();
                  TList _list610 = iprot.ReadListBegin();
                  for( int _i611 = 0; _i611 < _list610.Count; ++_i611)
                  {
                    TDDIAbstractFTAArtifact _elem612;
                    _elem612 = new TDDIAbstractFTAArtifact();
                    _elem612.Read(iprot);
                    FTAArtifacts.Add(_elem612);
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
                  BasicEvents = new List<TDDIBasicEvent>();
                  TList _list613 = iprot.ReadListBegin();
                  for( int _i614 = 0; _i614 < _list613.Count; ++_i614)
                  {
                    TDDIBasicEvent _elem615;
                    _elem615 = new TDDIBasicEvent();
                    _elem615.Read(iprot);
                    BasicEvents.Add(_elem615);
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
        TStruct struc = new TStruct("TDDIFTAPackage");
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
            foreach (TDDIKeyValueMapRef _iter616 in KeyValueMaps)
            {
              _iter616.Write(oprot);
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
            foreach (TDDIAbstractFailureAnalysisArtifactRef _iter617 in FailureAnalysisArtifacts)
            {
              _iter617.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (FTAArtifacts != null && __isset.FTAArtifacts) {
          field.Name = "FTAArtifacts";
          field.Type = TType.List;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, FTAArtifacts.Count));
            foreach (TDDIAbstractFTAArtifact _iter618 in FTAArtifacts)
            {
              _iter618.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (BasicEvents != null && __isset.BasicEvents) {
          field.Name = "BasicEvents";
          field.Type = TType.List;
          field.ID = 10;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, BasicEvents.Count));
            foreach (TDDIBasicEvent _iter619 in BasicEvents)
            {
              _iter619.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIFTAPackage(");
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
      if (FTAArtifacts != null && __isset.FTAArtifacts) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FTAArtifacts: ");
        __sb.Append(FTAArtifacts);
      }
      if (BasicEvents != null && __isset.BasicEvents) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("BasicEvents: ");
        __sb.Append(BasicEvents);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
