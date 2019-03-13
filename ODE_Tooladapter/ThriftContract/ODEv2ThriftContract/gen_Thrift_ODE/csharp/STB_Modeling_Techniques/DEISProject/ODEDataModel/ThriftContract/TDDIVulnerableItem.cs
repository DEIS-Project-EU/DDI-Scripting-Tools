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
  public partial class TDDIVulnerableItem : TBase
  {
    private long _Id;
    private string _Name;
    private string _Description;
    private List<TDDIKeyValueMap> _KeyValueMaps;
    private double _FinancialValue;
    private TDDIFinancialCostType _FinancialCostType;
    private double _OperationalCost;
    private TDDIOperationalCostType _OperationalCostType;
    private List<TDDIVulnerability> _Vulnerabilities;

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

    public double FinancialValue
    {
      get
      {
        return _FinancialValue;
      }
      set
      {
        __isset.FinancialValue = true;
        this._FinancialValue = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="TDDIFinancialCostType"/>
    /// </summary>
    public TDDIFinancialCostType FinancialCostType
    {
      get
      {
        return _FinancialCostType;
      }
      set
      {
        __isset.FinancialCostType = true;
        this._FinancialCostType = value;
      }
    }

    public double OperationalCost
    {
      get
      {
        return _OperationalCost;
      }
      set
      {
        __isset.OperationalCost = true;
        this._OperationalCost = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="TDDIOperationalCostType"/>
    /// </summary>
    public TDDIOperationalCostType OperationalCostType
    {
      get
      {
        return _OperationalCostType;
      }
      set
      {
        __isset.OperationalCostType = true;
        this._OperationalCostType = value;
      }
    }

    public List<TDDIVulnerability> Vulnerabilities
    {
      get
      {
        return _Vulnerabilities;
      }
      set
      {
        __isset.Vulnerabilities = true;
        this._Vulnerabilities = value;
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
      public bool FinancialValue;
      public bool FinancialCostType;
      public bool OperationalCost;
      public bool OperationalCostType;
      public bool Vulnerabilities;
    }

    public TDDIVulnerableItem() {
      this._Name = "";
      this.__isset.Name = true;
      this._Description = "";
      this.__isset.Description = true;
      this._KeyValueMaps = new List<TDDIKeyValueMap>();
      this.__isset.KeyValueMaps = true;
      this._FinancialValue = 0;
      this.__isset.FinancialValue = true;
      this._FinancialCostType = TDDIFinancialCostType.FCTEUR;
      this.__isset.FinancialCostType = true;
      this._OperationalCost = 0;
      this.__isset.OperationalCost = true;
      this._OperationalCostType = TDDIOperationalCostType.OCTWorkdays;
      this.__isset.OperationalCostType = true;
      this._Vulnerabilities = new List<TDDIVulnerability>();
      this.__isset.Vulnerabilities = true;
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
                  TList _list1400 = iprot.ReadListBegin();
                  for( int _i1401 = 0; _i1401 < _list1400.Count; ++_i1401)
                  {
                    TDDIKeyValueMap _elem1402;
                    _elem1402 = new TDDIKeyValueMap();
                    _elem1402.Read(iprot);
                    KeyValueMaps.Add(_elem1402);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.Double) {
                FinancialValue = iprot.ReadDouble();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.I32) {
                FinancialCostType = (TDDIFinancialCostType)iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.Double) {
                OperationalCost = iprot.ReadDouble();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 8:
              if (field.Type == TType.I32) {
                OperationalCostType = (TDDIOperationalCostType)iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 9:
              if (field.Type == TType.List) {
                {
                  Vulnerabilities = new List<TDDIVulnerability>();
                  TList _list1403 = iprot.ReadListBegin();
                  for( int _i1404 = 0; _i1404 < _list1403.Count; ++_i1404)
                  {
                    TDDIVulnerability _elem1405;
                    _elem1405 = new TDDIVulnerability();
                    _elem1405.Read(iprot);
                    Vulnerabilities.Add(_elem1405);
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
        TStruct struc = new TStruct("TDDIVulnerableItem");
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
            foreach (TDDIKeyValueMap _iter1406 in KeyValueMaps)
            {
              _iter1406.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (__isset.FinancialValue) {
          field.Name = "FinancialValue";
          field.Type = TType.Double;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          oprot.WriteDouble(FinancialValue);
          oprot.WriteFieldEnd();
        }
        if (__isset.FinancialCostType) {
          field.Name = "FinancialCostType";
          field.Type = TType.I32;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)FinancialCostType);
          oprot.WriteFieldEnd();
        }
        if (__isset.OperationalCost) {
          field.Name = "OperationalCost";
          field.Type = TType.Double;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          oprot.WriteDouble(OperationalCost);
          oprot.WriteFieldEnd();
        }
        if (__isset.OperationalCostType) {
          field.Name = "OperationalCostType";
          field.Type = TType.I32;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)OperationalCostType);
          oprot.WriteFieldEnd();
        }
        if (Vulnerabilities != null && __isset.Vulnerabilities) {
          field.Name = "Vulnerabilities";
          field.Type = TType.List;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Vulnerabilities.Count));
            foreach (TDDIVulnerability _iter1407 in Vulnerabilities)
            {
              _iter1407.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIVulnerableItem(");
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
      if (__isset.FinancialValue) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FinancialValue: ");
        __sb.Append(FinancialValue);
      }
      if (__isset.FinancialCostType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FinancialCostType: ");
        __sb.Append(FinancialCostType);
      }
      if (__isset.OperationalCost) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("OperationalCost: ");
        __sb.Append(OperationalCost);
      }
      if (__isset.OperationalCostType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("OperationalCostType: ");
        __sb.Append(OperationalCostType);
      }
      if (Vulnerabilities != null && __isset.Vulnerabilities) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Vulnerabilities: ");
        __sb.Append(Vulnerabilities);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
