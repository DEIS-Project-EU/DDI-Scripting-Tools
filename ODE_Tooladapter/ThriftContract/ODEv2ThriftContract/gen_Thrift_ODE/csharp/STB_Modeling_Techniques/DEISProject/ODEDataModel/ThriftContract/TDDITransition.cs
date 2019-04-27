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
  public partial class TDDITransition : TBase
  {
    private long _Id;
    private string _Name;
    private string _Description;
    private List<TDDIKeyValueMap> _KeyValueMaps;
    private double _Transition;
    private TDDIProbDist _TransitionProbDistribution;
    private List<TDDIStateRef> _FromStates;
    private List<TDDIStateRef> _ToStates;

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

    public double Transition
    {
      get
      {
        return _Transition;
      }
      set
      {
        __isset.Transition = true;
        this._Transition = value;
      }
    }

    public TDDIProbDist TransitionProbDistribution
    {
      get
      {
        return _TransitionProbDistribution;
      }
      set
      {
        __isset.TransitionProbDistribution = true;
        this._TransitionProbDistribution = value;
      }
    }

    public List<TDDIStateRef> FromStates
    {
      get
      {
        return _FromStates;
      }
      set
      {
        __isset.FromStates = true;
        this._FromStates = value;
      }
    }

    public List<TDDIStateRef> ToStates
    {
      get
      {
        return _ToStates;
      }
      set
      {
        __isset.ToStates = true;
        this._ToStates = value;
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
      public bool Transition;
      public bool TransitionProbDistribution;
      public bool FromStates;
      public bool ToStates;
    }

    public TDDITransition() {
      this._Name = "";
      this.__isset.Name = true;
      this._Description = "";
      this.__isset.Description = true;
      this._KeyValueMaps = new List<TDDIKeyValueMap>();
      this.__isset.KeyValueMaps = true;
      this._FromStates = new List<TDDIStateRef>();
      this.__isset.FromStates = true;
      this._ToStates = new List<TDDIStateRef>();
      this.__isset.ToStates = true;
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
                  TList _list616 = iprot.ReadListBegin();
                  for( int _i617 = 0; _i617 < _list616.Count; ++_i617)
                  {
                    TDDIKeyValueMap _elem618;
                    _elem618 = new TDDIKeyValueMap();
                    _elem618.Read(iprot);
                    KeyValueMaps.Add(_elem618);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.Double) {
                Transition = iprot.ReadDouble();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.Struct) {
                TransitionProbDistribution = new TDDIProbDist();
                TransitionProbDistribution.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.List) {
                {
                  FromStates = new List<TDDIStateRef>();
                  TList _list619 = iprot.ReadListBegin();
                  for( int _i620 = 0; _i620 < _list619.Count; ++_i620)
                  {
                    TDDIStateRef _elem621;
                    _elem621 = new TDDIStateRef();
                    _elem621.Read(iprot);
                    FromStates.Add(_elem621);
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
                  ToStates = new List<TDDIStateRef>();
                  TList _list622 = iprot.ReadListBegin();
                  for( int _i623 = 0; _i623 < _list622.Count; ++_i623)
                  {
                    TDDIStateRef _elem624;
                    _elem624 = new TDDIStateRef();
                    _elem624.Read(iprot);
                    ToStates.Add(_elem624);
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
        TStruct struc = new TStruct("TDDITransition");
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
            foreach (TDDIKeyValueMap _iter625 in KeyValueMaps)
            {
              _iter625.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (__isset.Transition) {
          field.Name = "Transition";
          field.Type = TType.Double;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          oprot.WriteDouble(Transition);
          oprot.WriteFieldEnd();
        }
        if (TransitionProbDistribution != null && __isset.TransitionProbDistribution) {
          field.Name = "TransitionProbDistribution";
          field.Type = TType.Struct;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          TransitionProbDistribution.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (FromStates != null && __isset.FromStates) {
          field.Name = "FromStates";
          field.Type = TType.List;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, FromStates.Count));
            foreach (TDDIStateRef _iter626 in FromStates)
            {
              _iter626.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (ToStates != null && __isset.ToStates) {
          field.Name = "ToStates";
          field.Type = TType.List;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, ToStates.Count));
            foreach (TDDIStateRef _iter627 in ToStates)
            {
              _iter627.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDITransition(");
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
      if (__isset.Transition) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Transition: ");
        __sb.Append(Transition);
      }
      if (TransitionProbDistribution != null && __isset.TransitionProbDistribution) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("TransitionProbDistribution: ");
        __sb.Append(TransitionProbDistribution== null ? "<null>" : TransitionProbDistribution.ToString());
      }
      if (FromStates != null && __isset.FromStates) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FromStates: ");
        __sb.Append(FromStates);
      }
      if (ToStates != null && __isset.ToStates) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ToStates: ");
        __sb.Append(ToStates);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}