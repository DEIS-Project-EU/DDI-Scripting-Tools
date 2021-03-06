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
    private List<TDDIKeyValueMap> _KeyValueMaps;
    private string _DecompositionArgument;
    private List<TDDIAbstractDependabilityRequirementRef> _RefinedRequirements;
    private TDDIAbstractRequirementSource _RequirementSource;
    private List<TDDIAbstractMeasureRef> _Measures;
    private List<TDDIAbstractFailureRef> _Failures;
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
      public bool KeyValueMaps;
      public bool DecompositionArgument;
      public bool RefinedRequirements;
      public bool RequirementSource;
      public bool Measures;
      public bool Failures;
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
      this._KeyValueMaps = new List<TDDIKeyValueMap>();
      this.__isset.KeyValueMaps = true;
      this._DecompositionArgument = "";
      this.__isset.DecompositionArgument = true;
      this._RefinedRequirements = new List<TDDIAbstractDependabilityRequirementRef>();
      this.__isset.RefinedRequirements = true;
      this._Measures = new List<TDDIAbstractMeasureRef>();
      this.__isset.Measures = true;
      this._Failures = new List<TDDIAbstractFailureRef>();
      this.__isset.Failures = true;
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
              if (field.Type == TType.List) {
                {
                  KeyValueMaps = new List<TDDIKeyValueMap>();
                  TList _list656 = iprot.ReadListBegin();
                  for( int _i657 = 0; _i657 < _list656.Count; ++_i657)
                  {
                    TDDIKeyValueMap _elem658;
                    _elem658 = new TDDIKeyValueMap();
                    _elem658.Read(iprot);
                    KeyValueMaps.Add(_elem658);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.String) {
                DecompositionArgument = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.List) {
                {
                  RefinedRequirements = new List<TDDIAbstractDependabilityRequirementRef>();
                  TList _list659 = iprot.ReadListBegin();
                  for( int _i660 = 0; _i660 < _list659.Count; ++_i660)
                  {
                    TDDIAbstractDependabilityRequirementRef _elem661;
                    _elem661 = new TDDIAbstractDependabilityRequirementRef();
                    _elem661.Read(iprot);
                    RefinedRequirements.Add(_elem661);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.Struct) {
                RequirementSource = new TDDIAbstractRequirementSource();
                RequirementSource.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 8:
              if (field.Type == TType.List) {
                {
                  Measures = new List<TDDIAbstractMeasureRef>();
                  TList _list662 = iprot.ReadListBegin();
                  for( int _i663 = 0; _i663 < _list662.Count; ++_i663)
                  {
                    TDDIAbstractMeasureRef _elem664;
                    _elem664 = new TDDIAbstractMeasureRef();
                    _elem664.Read(iprot);
                    Measures.Add(_elem664);
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
                  Failures = new List<TDDIAbstractFailureRef>();
                  TList _list665 = iprot.ReadListBegin();
                  for( int _i666 = 0; _i666 < _list665.Count; ++_i666)
                  {
                    TDDIAbstractFailureRef _elem667;
                    _elem667 = new TDDIAbstractFailureRef();
                    _elem667.Read(iprot);
                    Failures.Add(_elem667);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 10:
              if (field.Type == TType.Struct) {
                AssuranceLevel = new TDDIAssuranceLevel();
                AssuranceLevel.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 11:
              if (field.Type == TType.List) {
                {
                  MaintenanceProcedures = new List<TDDIMaintenanceProcedureRef>();
                  TList _list668 = iprot.ReadListBegin();
                  for( int _i669 = 0; _i669 < _list668.Count; ++_i669)
                  {
                    TDDIMaintenanceProcedureRef _elem670;
                    _elem670 = new TDDIMaintenanceProcedureRef();
                    _elem670.Read(iprot);
                    MaintenanceProcedures.Add(_elem670);
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
                  Hazards = new List<TDDIHazardRef>();
                  TList _list671 = iprot.ReadListBegin();
                  for( int _i672 = 0; _i672 < _list671.Count; ++_i672)
                  {
                    TDDIHazardRef _elem673;
                    _elem673 = new TDDIHazardRef();
                    _elem673.Read(iprot);
                    Hazards.Add(_elem673);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 13:
              if (field.Type == TType.Double) {
                FailureReactionTime = iprot.ReadDouble();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 14:
              if (field.Type == TType.Double) {
                FailureDetectionTime = iprot.ReadDouble();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 15:
              if (field.Type == TType.Double) {
                FailureLatencyTime = iprot.ReadDouble();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 16:
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
        if (KeyValueMaps != null && __isset.KeyValueMaps) {
          field.Name = "KeyValueMaps";
          field.Type = TType.List;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, KeyValueMaps.Count));
            foreach (TDDIKeyValueMap _iter674 in KeyValueMaps)
            {
              _iter674.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (DecompositionArgument != null && __isset.DecompositionArgument) {
          field.Name = "DecompositionArgument";
          field.Type = TType.String;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(DecompositionArgument);
          oprot.WriteFieldEnd();
        }
        if (RefinedRequirements != null && __isset.RefinedRequirements) {
          field.Name = "RefinedRequirements";
          field.Type = TType.List;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, RefinedRequirements.Count));
            foreach (TDDIAbstractDependabilityRequirementRef _iter675 in RefinedRequirements)
            {
              _iter675.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (RequirementSource != null && __isset.RequirementSource) {
          field.Name = "RequirementSource";
          field.Type = TType.Struct;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          RequirementSource.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (Measures != null && __isset.Measures) {
          field.Name = "Measures";
          field.Type = TType.List;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Measures.Count));
            foreach (TDDIAbstractMeasureRef _iter676 in Measures)
            {
              _iter676.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Failures != null && __isset.Failures) {
          field.Name = "Failures";
          field.Type = TType.List;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Failures.Count));
            foreach (TDDIAbstractFailureRef _iter677 in Failures)
            {
              _iter677.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (AssuranceLevel != null && __isset.AssuranceLevel) {
          field.Name = "AssuranceLevel";
          field.Type = TType.Struct;
          field.ID = 10;
          oprot.WriteFieldBegin(field);
          AssuranceLevel.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (MaintenanceProcedures != null && __isset.MaintenanceProcedures) {
          field.Name = "MaintenanceProcedures";
          field.Type = TType.List;
          field.ID = 11;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, MaintenanceProcedures.Count));
            foreach (TDDIMaintenanceProcedureRef _iter678 in MaintenanceProcedures)
            {
              _iter678.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Hazards != null && __isset.Hazards) {
          field.Name = "Hazards";
          field.Type = TType.List;
          field.ID = 12;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Hazards.Count));
            foreach (TDDIHazardRef _iter679 in Hazards)
            {
              _iter679.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (__isset.FailureReactionTime) {
          field.Name = "FailureReactionTime";
          field.Type = TType.Double;
          field.ID = 13;
          oprot.WriteFieldBegin(field);
          oprot.WriteDouble(FailureReactionTime);
          oprot.WriteFieldEnd();
        }
        if (__isset.FailureDetectionTime) {
          field.Name = "FailureDetectionTime";
          field.Type = TType.Double;
          field.ID = 14;
          oprot.WriteFieldBegin(field);
          oprot.WriteDouble(FailureDetectionTime);
          oprot.WriteFieldEnd();
        }
        if (__isset.FailureLatencyTime) {
          field.Name = "FailureLatencyTime";
          field.Type = TType.Double;
          field.ID = 15;
          oprot.WriteFieldBegin(field);
          oprot.WriteDouble(FailureLatencyTime);
          oprot.WriteFieldEnd();
        }
        if (__isset.IsSafetyGoal) {
          field.Name = "IsSafetyGoal";
          field.Type = TType.Bool;
          field.ID = 16;
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
      if (KeyValueMaps != null && __isset.KeyValueMaps) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("KeyValueMaps: ");
        __sb.Append(KeyValueMaps);
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
      if (Failures != null && __isset.Failures) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Failures: ");
        __sb.Append(Failures);
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
