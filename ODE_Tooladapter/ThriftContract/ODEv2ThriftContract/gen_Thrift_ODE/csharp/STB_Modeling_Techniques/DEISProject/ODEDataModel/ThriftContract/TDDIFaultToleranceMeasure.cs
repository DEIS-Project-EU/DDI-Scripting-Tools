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
  public partial class TDDIFaultToleranceMeasure : TBase
  {
    private long _Id;
    private string _Name;
    private string _Description;
    private List<TDDIKeyValueMap> _KeyValueMaps;
    private string _IntrinsicSafety;
    private string _SafeGuard;
    private string _ApplierInformation;
    private bool _RiskAcceptability;
    private string _FurtherAction;
    private string _Source;
    private TDDIAssuranceLevel _AssuranceLevel;
    private TDDIMeasureType _MeasureType;

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

    public string IntrinsicSafety
    {
      get
      {
        return _IntrinsicSafety;
      }
      set
      {
        __isset.IntrinsicSafety = true;
        this._IntrinsicSafety = value;
      }
    }

    public string SafeGuard
    {
      get
      {
        return _SafeGuard;
      }
      set
      {
        __isset.SafeGuard = true;
        this._SafeGuard = value;
      }
    }

    public string ApplierInformation
    {
      get
      {
        return _ApplierInformation;
      }
      set
      {
        __isset.ApplierInformation = true;
        this._ApplierInformation = value;
      }
    }

    public bool RiskAcceptability
    {
      get
      {
        return _RiskAcceptability;
      }
      set
      {
        __isset.RiskAcceptability = true;
        this._RiskAcceptability = value;
      }
    }

    public string FurtherAction
    {
      get
      {
        return _FurtherAction;
      }
      set
      {
        __isset.FurtherAction = true;
        this._FurtherAction = value;
      }
    }

    public string Source
    {
      get
      {
        return _Source;
      }
      set
      {
        __isset.Source = true;
        this._Source = value;
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

    public TDDIMeasureType MeasureType
    {
      get
      {
        return _MeasureType;
      }
      set
      {
        __isset.MeasureType = true;
        this._MeasureType = value;
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
      public bool IntrinsicSafety;
      public bool SafeGuard;
      public bool ApplierInformation;
      public bool RiskAcceptability;
      public bool FurtherAction;
      public bool Source;
      public bool AssuranceLevel;
      public bool MeasureType;
    }

    public TDDIFaultToleranceMeasure() {
      this._Name = "";
      this.__isset.Name = true;
      this._Description = "";
      this.__isset.Description = true;
      this._KeyValueMaps = new List<TDDIKeyValueMap>();
      this.__isset.KeyValueMaps = true;
      this._IntrinsicSafety = "";
      this.__isset.IntrinsicSafety = true;
      this._SafeGuard = "";
      this.__isset.SafeGuard = true;
      this._ApplierInformation = "";
      this.__isset.ApplierInformation = true;
      this._RiskAcceptability = false;
      this.__isset.RiskAcceptability = true;
      this._FurtherAction = "";
      this.__isset.FurtherAction = true;
      this._Source = "";
      this.__isset.Source = true;
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
                  TList _list12 = iprot.ReadListBegin();
                  for( int _i13 = 0; _i13 < _list12.Count; ++_i13)
                  {
                    TDDIKeyValueMap _elem14;
                    _elem14 = new TDDIKeyValueMap();
                    _elem14.Read(iprot);
                    KeyValueMaps.Add(_elem14);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.String) {
                IntrinsicSafety = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.String) {
                SafeGuard = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.String) {
                ApplierInformation = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 8:
              if (field.Type == TType.Bool) {
                RiskAcceptability = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 9:
              if (field.Type == TType.String) {
                FurtherAction = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 10:
              if (field.Type == TType.String) {
                Source = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 14:
              if (field.Type == TType.Struct) {
                AssuranceLevel = new TDDIAssuranceLevel();
                AssuranceLevel.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 15:
              if (field.Type == TType.Struct) {
                MeasureType = new TDDIMeasureType();
                MeasureType.Read(iprot);
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
        TStruct struc = new TStruct("TDDIFaultToleranceMeasure");
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
            foreach (TDDIKeyValueMap _iter15 in KeyValueMaps)
            {
              _iter15.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (IntrinsicSafety != null && __isset.IntrinsicSafety) {
          field.Name = "IntrinsicSafety";
          field.Type = TType.String;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(IntrinsicSafety);
          oprot.WriteFieldEnd();
        }
        if (SafeGuard != null && __isset.SafeGuard) {
          field.Name = "SafeGuard";
          field.Type = TType.String;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(SafeGuard);
          oprot.WriteFieldEnd();
        }
        if (ApplierInformation != null && __isset.ApplierInformation) {
          field.Name = "ApplierInformation";
          field.Type = TType.String;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(ApplierInformation);
          oprot.WriteFieldEnd();
        }
        if (__isset.RiskAcceptability) {
          field.Name = "RiskAcceptability";
          field.Type = TType.Bool;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(RiskAcceptability);
          oprot.WriteFieldEnd();
        }
        if (FurtherAction != null && __isset.FurtherAction) {
          field.Name = "FurtherAction";
          field.Type = TType.String;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(FurtherAction);
          oprot.WriteFieldEnd();
        }
        if (Source != null && __isset.Source) {
          field.Name = "Source";
          field.Type = TType.String;
          field.ID = 10;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(Source);
          oprot.WriteFieldEnd();
        }
        if (AssuranceLevel != null && __isset.AssuranceLevel) {
          field.Name = "AssuranceLevel";
          field.Type = TType.Struct;
          field.ID = 14;
          oprot.WriteFieldBegin(field);
          AssuranceLevel.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (MeasureType != null && __isset.MeasureType) {
          field.Name = "MeasureType";
          field.Type = TType.Struct;
          field.ID = 15;
          oprot.WriteFieldBegin(field);
          MeasureType.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIFaultToleranceMeasure(");
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
      if (IntrinsicSafety != null && __isset.IntrinsicSafety) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("IntrinsicSafety: ");
        __sb.Append(IntrinsicSafety);
      }
      if (SafeGuard != null && __isset.SafeGuard) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("SafeGuard: ");
        __sb.Append(SafeGuard);
      }
      if (ApplierInformation != null && __isset.ApplierInformation) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ApplierInformation: ");
        __sb.Append(ApplierInformation);
      }
      if (__isset.RiskAcceptability) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("RiskAcceptability: ");
        __sb.Append(RiskAcceptability);
      }
      if (FurtherAction != null && __isset.FurtherAction) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FurtherAction: ");
        __sb.Append(FurtherAction);
      }
      if (Source != null && __isset.Source) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Source: ");
        __sb.Append(Source);
      }
      if (AssuranceLevel != null && __isset.AssuranceLevel) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("AssuranceLevel: ");
        __sb.Append(AssuranceLevel);
      }
      if (MeasureType != null && __isset.MeasureType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("MeasureType: ");
        __sb.Append(MeasureType== null ? "<null>" : MeasureType.ToString());
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
