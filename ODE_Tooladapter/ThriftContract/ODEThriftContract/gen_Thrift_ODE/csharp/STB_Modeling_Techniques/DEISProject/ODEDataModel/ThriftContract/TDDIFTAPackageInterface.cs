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
  public partial class TDDIFTAPackageInterface : TBase
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
    private TDDIAbstractFTAPackage _Implements;

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

    public TDDIAbstractFTAPackage Implements
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
      public bool FTAArtifacts;
      public bool BasicEvents;
      public bool Implements;
    }

    public TDDIFTAPackageInterface() {
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
                  TList _list620 = iprot.ReadListBegin();
                  for( int _i621 = 0; _i621 < _list620.Count; ++_i621)
                  {
                    TDDIKeyValueMapRef _elem622;
                    _elem622 = new TDDIKeyValueMapRef();
                    _elem622.Read(iprot);
                    KeyValueMaps.Add(_elem622);
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
                  TList _list623 = iprot.ReadListBegin();
                  for( int _i624 = 0; _i624 < _list623.Count; ++_i624)
                  {
                    TDDIAbstractFailureAnalysisArtifactRef _elem625;
                    _elem625 = new TDDIAbstractFailureAnalysisArtifactRef();
                    _elem625.Read(iprot);
                    FailureAnalysisArtifacts.Add(_elem625);
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
                  TList _list626 = iprot.ReadListBegin();
                  for( int _i627 = 0; _i627 < _list626.Count; ++_i627)
                  {
                    TDDIAbstractFTAArtifact _elem628;
                    _elem628 = new TDDIAbstractFTAArtifact();
                    _elem628.Read(iprot);
                    FTAArtifacts.Add(_elem628);
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
                  TList _list629 = iprot.ReadListBegin();
                  for( int _i630 = 0; _i630 < _list629.Count; ++_i630)
                  {
                    TDDIBasicEvent _elem631;
                    _elem631 = new TDDIBasicEvent();
                    _elem631.Read(iprot);
                    BasicEvents.Add(_elem631);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 11:
              if (field.Type == TType.Struct) {
                Implements = new TDDIAbstractFTAPackage();
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
        TStruct struc = new TStruct("TDDIFTAPackageInterface");
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
            foreach (TDDIKeyValueMapRef _iter632 in KeyValueMaps)
            {
              _iter632.Write(oprot);
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
            foreach (TDDIAbstractFailureAnalysisArtifactRef _iter633 in FailureAnalysisArtifacts)
            {
              _iter633.Write(oprot);
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
            foreach (TDDIAbstractFTAArtifact _iter634 in FTAArtifacts)
            {
              _iter634.Write(oprot);
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
            foreach (TDDIBasicEvent _iter635 in BasicEvents)
            {
              _iter635.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIFTAPackageInterface(");
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
      if (Implements != null && __isset.Implements) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Implements: ");
        __sb.Append(Implements);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
