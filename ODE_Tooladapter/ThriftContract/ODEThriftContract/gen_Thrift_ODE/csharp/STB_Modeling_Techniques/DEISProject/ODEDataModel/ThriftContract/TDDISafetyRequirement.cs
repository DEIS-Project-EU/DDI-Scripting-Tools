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
  public partial class TDDISafetyRequirement : TBase
  {
    private long _Id;
    private string _Name;
    private string _Description;
    private bool _IsCitation;
    private bool _IsAbstract;
    private List<TDDIKeyValueMapRef> _KeyValueMaps;
    private TDDIAbstractBaseElement _CitedElement;
    private string _DecompositionArgument;
    private List<TDDIAbstractDependabilityRequirementRef> _RefinedRequirements;
    private TDDIAbstractRequirementSource _RequirementSource;
    private List<TDDIAbstractMeasureRef> _Measures;
    private List<TDDIAbstractFailureRef> _FailureModes;
    private TDDIAssuranceLevel _AssuranceLevel;
    private List<TDDIMaintenanceProcedureRef> _MaintenanceProcedures;
    private List<TDDIHazardRef> _Hazards;
    private double _FailureReactionTime;
    private double _FailureDetectionTime;
    private double _FailureLatencyTime;
    private bool _IsSafetyGoal;

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

    public string DecompositionArgument
    {
      get
      {
        return _DecompositionArgument;
      }
      set
      {
        __isset.DecompositionArgument = true;
        this._DecompositionArgument = value;
      }
    }

    public List<TDDIAbstractDependabilityRequirementRef> RefinedRequirements
    {
      get
      {
        return _RefinedRequirements;
      }
      set
      {
        __isset.RefinedRequirements = true;
        this._RefinedRequirements = value;
      }
    }

    public TDDIAbstractRequirementSource RequirementSource
    {
      get
      {
        return _RequirementSource;
      }
      set
      {
        __isset.RequirementSource = true;
        this._RequirementSource = value;
      }
    }

    public List<TDDIAbstractMeasureRef> Measures
    {
      get
      {
        return _Measures;
      }
      set
      {
        __isset.Measures = true;
        this._Measures = value;
      }
    }

    public List<TDDIAbstractFailureRef> FailureModes
    {
      get
      {
        return _FailureModes;
      }
      set
      {
        __isset.FailureModes = true;
        this._FailureModes = value;
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

    public List<TDDIMaintenanceProcedureRef> MaintenanceProcedures
    {
      get
      {
        return _MaintenanceProcedures;
      }
      set
      {
        __isset.MaintenanceProcedures = true;
        this._MaintenanceProcedures = value;
      }
    }

    public List<TDDIHazardRef> Hazards
    {
      get
      {
        return _Hazards;
      }
      set
      {
        __isset.Hazards = true;
        this._Hazards = value;
      }
    }

    public double FailureReactionTime
    {
      get
      {
        return _FailureReactionTime;
      }
      set
      {
        __isset.FailureReactionTime = true;
        this._FailureReactionTime = value;
      }
    }

    public double FailureDetectionTime
    {
      get
      {
        return _FailureDetectionTime;
      }
      set
      {
        __isset.FailureDetectionTime = true;
        this._FailureDetectionTime = value;
      }
    }

    public double FailureLatencyTime
    {
      get
      {
        return _FailureLatencyTime;
      }
      set
      {
        __isset.FailureLatencyTime = true;
        this._FailureLatencyTime = value;
      }
    }

    public bool IsSafetyGoal
    {
      get
      {
        return _IsSafetyGoal;
      }
      set
      {
        __isset.IsSafetyGoal = true;
        this._IsSafetyGoal = value;
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
      public bool DecompositionArgument;
      public bool RefinedRequirements;
      public bool RequirementSource;
      public bool Measures;
      public bool FailureModes;
      public bool AssuranceLevel;
      public bool MaintenanceProcedures;
      public bool Hazards;
      public bool FailureReactionTime;
      public bool FailureDetectionTime;
      public bool FailureLatencyTime;
      public bool IsSafetyGoal;
    }

    public TDDISafetyRequirement() {
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
      this._DecompositionArgument = "";
      this.__isset.DecompositionArgument = true;
      this._RefinedRequirements = new List<TDDIAbstractDependabilityRequirementRef>();
      this.__isset.RefinedRequirements = true;
      this._Measures = new List<TDDIAbstractMeasureRef>();
      this.__isset.Measures = true;
      this._FailureModes = new List<TDDIAbstractFailureRef>();
      this.__isset.FailureModes = true;
      this._MaintenanceProcedures = new List<TDDIMaintenanceProcedureRef>();
      this.__isset.MaintenanceProcedures = true;
      this._Hazards = new List<TDDIHazardRef>();
      this.__isset.Hazards = true;
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
                  TList _list912 = iprot.ReadListBegin();
                  for( int _i913 = 0; _i913 < _list912.Count; ++_i913)
                  {
                    TDDIKeyValueMapRef _elem914;
                    _elem914 = new TDDIKeyValueMapRef();
                    _elem914.Read(iprot);
                    KeyValueMaps.Add(_elem914);
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
              if (field.Type == TType.String) {
                DecompositionArgument = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 9:
              if (field.Type == TType.List) {
                {
                  RefinedRequirements = new List<TDDIAbstractDependabilityRequirementRef>();
                  TList _list915 = iprot.ReadListBegin();
                  for( int _i916 = 0; _i916 < _list915.Count; ++_i916)
                  {
                    TDDIAbstractDependabilityRequirementRef _elem917;
                    _elem917 = new TDDIAbstractDependabilityRequirementRef();
                    _elem917.Read(iprot);
                    RefinedRequirements.Add(_elem917);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 10:
              if (field.Type == TType.Struct) {
                RequirementSource = new TDDIAbstractRequirementSource();
                RequirementSource.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 11:
              if (field.Type == TType.List) {
                {
                  Measures = new List<TDDIAbstractMeasureRef>();
                  TList _list918 = iprot.ReadListBegin();
                  for( int _i919 = 0; _i919 < _list918.Count; ++_i919)
                  {
                    TDDIAbstractMeasureRef _elem920;
                    _elem920 = new TDDIAbstractMeasureRef();
                    _elem920.Read(iprot);
                    Measures.Add(_elem920);
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
                  FailureModes = new List<TDDIAbstractFailureRef>();
                  TList _list921 = iprot.ReadListBegin();
                  for( int _i922 = 0; _i922 < _list921.Count; ++_i922)
                  {
                    TDDIAbstractFailureRef _elem923;
                    _elem923 = new TDDIAbstractFailureRef();
                    _elem923.Read(iprot);
                    FailureModes.Add(_elem923);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 13:
              if (field.Type == TType.Struct) {
                AssuranceLevel = new TDDIAssuranceLevel();
                AssuranceLevel.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 14:
              if (field.Type == TType.List) {
                {
                  MaintenanceProcedures = new List<TDDIMaintenanceProcedureRef>();
                  TList _list924 = iprot.ReadListBegin();
                  for( int _i925 = 0; _i925 < _list924.Count; ++_i925)
                  {
                    TDDIMaintenanceProcedureRef _elem926;
                    _elem926 = new TDDIMaintenanceProcedureRef();
                    _elem926.Read(iprot);
                    MaintenanceProcedures.Add(_elem926);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 15:
              if (field.Type == TType.List) {
                {
                  Hazards = new List<TDDIHazardRef>();
                  TList _list927 = iprot.ReadListBegin();
                  for( int _i928 = 0; _i928 < _list927.Count; ++_i928)
                  {
                    TDDIHazardRef _elem929;
                    _elem929 = new TDDIHazardRef();
                    _elem929.Read(iprot);
                    Hazards.Add(_elem929);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 16:
              if (field.Type == TType.Double) {
                FailureReactionTime = iprot.ReadDouble();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 17:
              if (field.Type == TType.Double) {
                FailureDetectionTime = iprot.ReadDouble();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 18:
              if (field.Type == TType.Double) {
                FailureLatencyTime = iprot.ReadDouble();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 19:
              if (field.Type == TType.Bool) {
                IsSafetyGoal = iprot.ReadBool();
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
        TStruct struc = new TStruct("TDDISafetyRequirement");
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
            foreach (TDDIKeyValueMapRef _iter930 in KeyValueMaps)
            {
              _iter930.Write(oprot);
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
        if (DecompositionArgument != null && __isset.DecompositionArgument) {
          field.Name = "DecompositionArgument";
          field.Type = TType.String;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(DecompositionArgument);
          oprot.WriteFieldEnd();
        }
        if (RefinedRequirements != null && __isset.RefinedRequirements) {
          field.Name = "RefinedRequirements";
          field.Type = TType.List;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, RefinedRequirements.Count));
            foreach (TDDIAbstractDependabilityRequirementRef _iter931 in RefinedRequirements)
            {
              _iter931.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (RequirementSource != null && __isset.RequirementSource) {
          field.Name = "RequirementSource";
          field.Type = TType.Struct;
          field.ID = 10;
          oprot.WriteFieldBegin(field);
          RequirementSource.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (Measures != null && __isset.Measures) {
          field.Name = "Measures";
          field.Type = TType.List;
          field.ID = 11;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Measures.Count));
            foreach (TDDIAbstractMeasureRef _iter932 in Measures)
            {
              _iter932.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (FailureModes != null && __isset.FailureModes) {
          field.Name = "FailureModes";
          field.Type = TType.List;
          field.ID = 12;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, FailureModes.Count));
            foreach (TDDIAbstractFailureRef _iter933 in FailureModes)
            {
              _iter933.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (AssuranceLevel != null && __isset.AssuranceLevel) {
          field.Name = "AssuranceLevel";
          field.Type = TType.Struct;
          field.ID = 13;
          oprot.WriteFieldBegin(field);
          AssuranceLevel.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (MaintenanceProcedures != null && __isset.MaintenanceProcedures) {
          field.Name = "MaintenanceProcedures";
          field.Type = TType.List;
          field.ID = 14;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, MaintenanceProcedures.Count));
            foreach (TDDIMaintenanceProcedureRef _iter934 in MaintenanceProcedures)
            {
              _iter934.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Hazards != null && __isset.Hazards) {
          field.Name = "Hazards";
          field.Type = TType.List;
          field.ID = 15;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Hazards.Count));
            foreach (TDDIHazardRef _iter935 in Hazards)
            {
              _iter935.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (__isset.FailureReactionTime) {
          field.Name = "FailureReactionTime";
          field.Type = TType.Double;
          field.ID = 16;
          oprot.WriteFieldBegin(field);
          oprot.WriteDouble(FailureReactionTime);
          oprot.WriteFieldEnd();
        }
        if (__isset.FailureDetectionTime) {
          field.Name = "FailureDetectionTime";
          field.Type = TType.Double;
          field.ID = 17;
          oprot.WriteFieldBegin(field);
          oprot.WriteDouble(FailureDetectionTime);
          oprot.WriteFieldEnd();
        }
        if (__isset.FailureLatencyTime) {
          field.Name = "FailureLatencyTime";
          field.Type = TType.Double;
          field.ID = 18;
          oprot.WriteFieldBegin(field);
          oprot.WriteDouble(FailureLatencyTime);
          oprot.WriteFieldEnd();
        }
        if (__isset.IsSafetyGoal) {
          field.Name = "IsSafetyGoal";
          field.Type = TType.Bool;
          field.ID = 19;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(IsSafetyGoal);
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
      StringBuilder __sb = new StringBuilder("TDDISafetyRequirement(");
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
      if (DecompositionArgument != null && __isset.DecompositionArgument) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("DecompositionArgument: ");
        __sb.Append(DecompositionArgument);
      }
      if (RefinedRequirements != null && __isset.RefinedRequirements) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("RefinedRequirements: ");
        __sb.Append(RefinedRequirements);
      }
      if (RequirementSource != null && __isset.RequirementSource) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("RequirementSource: ");
        __sb.Append(RequirementSource== null ? "<null>" : RequirementSource.ToString());
      }
      if (Measures != null && __isset.Measures) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Measures: ");
        __sb.Append(Measures);
      }
      if (FailureModes != null && __isset.FailureModes) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FailureModes: ");
        __sb.Append(FailureModes);
      }
      if (AssuranceLevel != null && __isset.AssuranceLevel) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("AssuranceLevel: ");
        __sb.Append(AssuranceLevel== null ? "<null>" : AssuranceLevel.ToString());
      }
      if (MaintenanceProcedures != null && __isset.MaintenanceProcedures) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("MaintenanceProcedures: ");
        __sb.Append(MaintenanceProcedures);
      }
      if (Hazards != null && __isset.Hazards) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Hazards: ");
        __sb.Append(Hazards);
      }
      if (__isset.FailureReactionTime) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FailureReactionTime: ");
        __sb.Append(FailureReactionTime);
      }
      if (__isset.FailureDetectionTime) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FailureDetectionTime: ");
        __sb.Append(FailureDetectionTime);
      }
      if (__isset.FailureLatencyTime) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FailureLatencyTime: ");
        __sb.Append(FailureLatencyTime);
      }
      if (__isset.IsSafetyGoal) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("IsSafetyGoal: ");
        __sb.Append(IsSafetyGoal);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}