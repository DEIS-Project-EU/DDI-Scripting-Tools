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
  public partial class TDDISafetyFunction : TBase
  {
    private long _Id;
    private string _Name;
    private string _Description;
    private List<TDDIKeyValueMap> _KeyValueMaps;
    private List<TDDIAbstractDependabilityRequirementRef> _DependabilityRequirements;
    private TDDIAssuranceLevel _AssuranceLevel;
    private List<TDDIAbstractFunctionRef> _SubFunctions;
    private List<TDDIPort> _Ports;
    private List<TDDISignal> _Signals;
    private TDDIPerfChars _PerfChars;
    private List<TDDIAbstractFailureModelRef> _FailureModels;
    private List<TDDIMalfunctionRef> _Malfunctions;
    private TDDIAbstractAsset _AsAsset;
    private string _Object;
    private string _Behavior;
    private string _SafeState;

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

    public List<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements
    {
      get
      {
        return _DependabilityRequirements;
      }
      set
      {
        __isset.DependabilityRequirements = true;
        this._DependabilityRequirements = value;
      }
    }

    public TDDIAssuranceLevel AssuranceLevel
    {
      get
      {
        return _AssuranceLevel;
      }
      set
      {
        __isset.AssuranceLevel = true;
        this._AssuranceLevel = value;
      }
    }

    public List<TDDIAbstractFunctionRef> SubFunctions
    {
      get
      {
        return _SubFunctions;
      }
      set
      {
        __isset.SubFunctions = true;
        this._SubFunctions = value;
      }
    }

    public List<TDDIPort> Ports
    {
      get
      {
        return _Ports;
      }
      set
      {
        __isset.Ports = true;
        this._Ports = value;
      }
    }

    public List<TDDISignal> Signals
    {
      get
      {
        return _Signals;
      }
      set
      {
        __isset.Signals = true;
        this._Signals = value;
      }
    }

    public TDDIPerfChars PerfChars
    {
      get
      {
        return _PerfChars;
      }
      set
      {
        __isset.PerfChars = true;
        this._PerfChars = value;
      }
    }

    public List<TDDIAbstractFailureModelRef> FailureModels
    {
      get
      {
        return _FailureModels;
      }
      set
      {
        __isset.FailureModels = true;
        this._FailureModels = value;
      }
    }

    public List<TDDIMalfunctionRef> Malfunctions
    {
      get
      {
        return _Malfunctions;
      }
      set
      {
        __isset.Malfunctions = true;
        this._Malfunctions = value;
      }
    }

    public TDDIAbstractAsset AsAsset
    {
      get
      {
        return _AsAsset;
      }
      set
      {
        __isset.AsAsset = true;
        this._AsAsset = value;
      }
    }

    public string Object
    {
      get
      {
        return _Object;
      }
      set
      {
        __isset.@Object = true;
        this._Object = value;
      }
    }

    public string Behavior
    {
      get
      {
        return _Behavior;
      }
      set
      {
        __isset.Behavior = true;
        this._Behavior = value;
      }
    }

    public string SafeState
    {
      get
      {
        return _SafeState;
      }
      set
      {
        __isset.SafeState = true;
        this._SafeState = value;
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
      public bool DependabilityRequirements;
      public bool AssuranceLevel;
      public bool SubFunctions;
      public bool Ports;
      public bool Signals;
      public bool PerfChars;
      public bool FailureModels;
      public bool Malfunctions;
      public bool AsAsset;
      public bool @Object;
      public bool Behavior;
      public bool SafeState;
    }

    public TDDISafetyFunction() {
      this._Name = "";
      this.__isset.Name = true;
      this._Description = "";
      this.__isset.Description = true;
      this._KeyValueMaps = new List<TDDIKeyValueMap>();
      this.__isset.KeyValueMaps = true;
      this._DependabilityRequirements = new List<TDDIAbstractDependabilityRequirementRef>();
      this.__isset.DependabilityRequirements = true;
      this._SubFunctions = new List<TDDIAbstractFunctionRef>();
      this.__isset.SubFunctions = true;
      this._Ports = new List<TDDIPort>();
      this.__isset.Ports = true;
      this._Signals = new List<TDDISignal>();
      this.__isset.Signals = true;
      this._FailureModels = new List<TDDIAbstractFailureModelRef>();
      this.__isset.FailureModels = true;
      this._Malfunctions = new List<TDDIMalfunctionRef>();
      this.__isset.Malfunctions = true;
      this._Object = "";
      this.__isset.@Object = true;
      this._Behavior = "";
      this.__isset.Behavior = true;
      this._SafeState = "";
      this.__isset.SafeState = true;
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
                  TList _list112 = iprot.ReadListBegin();
                  for( int _i113 = 0; _i113 < _list112.Count; ++_i113)
                  {
                    TDDIKeyValueMap _elem114;
                    _elem114 = new TDDIKeyValueMap();
                    _elem114.Read(iprot);
                    KeyValueMaps.Add(_elem114);
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
                  DependabilityRequirements = new List<TDDIAbstractDependabilityRequirementRef>();
                  TList _list115 = iprot.ReadListBegin();
                  for( int _i116 = 0; _i116 < _list115.Count; ++_i116)
                  {
                    TDDIAbstractDependabilityRequirementRef _elem117;
                    _elem117 = new TDDIAbstractDependabilityRequirementRef();
                    _elem117.Read(iprot);
                    DependabilityRequirements.Add(_elem117);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.Struct) {
                AssuranceLevel = new TDDIAssuranceLevel();
                AssuranceLevel.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.List) {
                {
                  SubFunctions = new List<TDDIAbstractFunctionRef>();
                  TList _list118 = iprot.ReadListBegin();
                  for( int _i119 = 0; _i119 < _list118.Count; ++_i119)
                  {
                    TDDIAbstractFunctionRef _elem120;
                    _elem120 = new TDDIAbstractFunctionRef();
                    _elem120.Read(iprot);
                    SubFunctions.Add(_elem120);
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
                  Ports = new List<TDDIPort>();
                  TList _list121 = iprot.ReadListBegin();
                  for( int _i122 = 0; _i122 < _list121.Count; ++_i122)
                  {
                    TDDIPort _elem123;
                    _elem123 = new TDDIPort();
                    _elem123.Read(iprot);
                    Ports.Add(_elem123);
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
                  Signals = new List<TDDISignal>();
                  TList _list124 = iprot.ReadListBegin();
                  for( int _i125 = 0; _i125 < _list124.Count; ++_i125)
                  {
                    TDDISignal _elem126;
                    _elem126 = new TDDISignal();
                    _elem126.Read(iprot);
                    Signals.Add(_elem126);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 10:
              if (field.Type == TType.Struct) {
                PerfChars = new TDDIPerfChars();
                PerfChars.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 11:
              if (field.Type == TType.List) {
                {
                  FailureModels = new List<TDDIAbstractFailureModelRef>();
                  TList _list127 = iprot.ReadListBegin();
                  for( int _i128 = 0; _i128 < _list127.Count; ++_i128)
                  {
                    TDDIAbstractFailureModelRef _elem129;
                    _elem129 = new TDDIAbstractFailureModelRef();
                    _elem129.Read(iprot);
                    FailureModels.Add(_elem129);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 12:
              if (field.Type == TType.List) {
                {
                  Malfunctions = new List<TDDIMalfunctionRef>();
                  TList _list130 = iprot.ReadListBegin();
                  for( int _i131 = 0; _i131 < _list130.Count; ++_i131)
                  {
                    TDDIMalfunctionRef _elem132;
                    _elem132 = new TDDIMalfunctionRef();
                    _elem132.Read(iprot);
                    Malfunctions.Add(_elem132);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 13:
              if (field.Type == TType.Struct) {
                AsAsset = new TDDIAbstractAsset();
                AsAsset.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 14:
              if (field.Type == TType.String) {
                Object = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 15:
              if (field.Type == TType.String) {
                Behavior = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 16:
              if (field.Type == TType.String) {
                SafeState = iprot.ReadString();
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
        TStruct struc = new TStruct("TDDISafetyFunction");
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
            foreach (TDDIKeyValueMap _iter133 in KeyValueMaps)
            {
              _iter133.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (DependabilityRequirements != null && __isset.DependabilityRequirements) {
          field.Name = "DependabilityRequirements";
          field.Type = TType.List;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, DependabilityRequirements.Count));
            foreach (TDDIAbstractDependabilityRequirementRef _iter134 in DependabilityRequirements)
            {
              _iter134.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (AssuranceLevel != null && __isset.AssuranceLevel) {
          field.Name = "AssuranceLevel";
          field.Type = TType.Struct;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          AssuranceLevel.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (SubFunctions != null && __isset.SubFunctions) {
          field.Name = "SubFunctions";
          field.Type = TType.List;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, SubFunctions.Count));
            foreach (TDDIAbstractFunctionRef _iter135 in SubFunctions)
            {
              _iter135.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Ports != null && __isset.Ports) {
          field.Name = "Ports";
          field.Type = TType.List;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Ports.Count));
            foreach (TDDIPort _iter136 in Ports)
            {
              _iter136.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Signals != null && __isset.Signals) {
          field.Name = "Signals";
          field.Type = TType.List;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Signals.Count));
            foreach (TDDISignal _iter137 in Signals)
            {
              _iter137.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (PerfChars != null && __isset.PerfChars) {
          field.Name = "PerfChars";
          field.Type = TType.Struct;
          field.ID = 10;
          oprot.WriteFieldBegin(field);
          PerfChars.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (FailureModels != null && __isset.FailureModels) {
          field.Name = "FailureModels";
          field.Type = TType.List;
          field.ID = 11;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, FailureModels.Count));
            foreach (TDDIAbstractFailureModelRef _iter138 in FailureModels)
            {
              _iter138.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Malfunctions != null && __isset.Malfunctions) {
          field.Name = "Malfunctions";
          field.Type = TType.List;
          field.ID = 12;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Malfunctions.Count));
            foreach (TDDIMalfunctionRef _iter139 in Malfunctions)
            {
              _iter139.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (AsAsset != null && __isset.AsAsset) {
          field.Name = "AsAsset";
          field.Type = TType.Struct;
          field.ID = 13;
          oprot.WriteFieldBegin(field);
          AsAsset.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (Object != null && __isset.@Object) {
          field.Name = "Object";
          field.Type = TType.String;
          field.ID = 14;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(Object);
          oprot.WriteFieldEnd();
        }
        if (Behavior != null && __isset.Behavior) {
          field.Name = "Behavior";
          field.Type = TType.String;
          field.ID = 15;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(Behavior);
          oprot.WriteFieldEnd();
        }
        if (SafeState != null && __isset.SafeState) {
          field.Name = "SafeState";
          field.Type = TType.String;
          field.ID = 16;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(SafeState);
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
      StringBuilder __sb = new StringBuilder("TDDISafetyFunction(");
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
      if (DependabilityRequirements != null && __isset.DependabilityRequirements) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("DependabilityRequirements: ");
        __sb.Append(DependabilityRequirements);
      }
      if (AssuranceLevel != null && __isset.AssuranceLevel) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("AssuranceLevel: ");
        __sb.Append(AssuranceLevel);
      }
      if (SubFunctions != null && __isset.SubFunctions) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("SubFunctions: ");
        __sb.Append(SubFunctions);
      }
      if (Ports != null && __isset.Ports) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Ports: ");
        __sb.Append(Ports);
      }
      if (Signals != null && __isset.Signals) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Signals: ");
        __sb.Append(Signals);
      }
      if (PerfChars != null && __isset.PerfChars) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("PerfChars: ");
        __sb.Append(PerfChars== null ? "<null>" : PerfChars.ToString());
      }
      if (FailureModels != null && __isset.FailureModels) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FailureModels: ");
        __sb.Append(FailureModels);
      }
      if (Malfunctions != null && __isset.Malfunctions) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Malfunctions: ");
        __sb.Append(Malfunctions);
      }
      if (AsAsset != null && __isset.AsAsset) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("AsAsset: ");
        __sb.Append(AsAsset);
      }
      if (Object != null && __isset.@Object) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Object: ");
        __sb.Append(Object);
      }
      if (Behavior != null && __isset.Behavior) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Behavior: ");
        __sb.Append(Behavior);
      }
      if (SafeState != null && __isset.SafeState) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("SafeState: ");
        __sb.Append(SafeState);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
