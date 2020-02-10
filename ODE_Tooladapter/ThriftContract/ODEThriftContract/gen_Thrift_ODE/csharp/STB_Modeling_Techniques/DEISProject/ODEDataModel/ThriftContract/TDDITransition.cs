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
    private bool _IsCitation;
    private bool _IsAbstract;
    private List<TDDIKeyValueMapRef> _KeyValueMaps;
    private TDDIAbstractBaseElement _CitedElement;
    private double _Probability;
    private TDDIProbabilityDistribution _ProbabilityDistribution;
    private TDDIFailState _FromFailState;
    private TDDIFailState _ToFailState;
    private TDDIState _FromState;
    private TDDIState _ToState;

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

    public double Probability
    {
      get
      {
        return _Probability;
      }
      set
      {
        __isset.Probability = true;
        this._Probability = value;
      }
    }

    public TDDIProbabilityDistribution ProbabilityDistribution
    {
      get
      {
        return _ProbabilityDistribution;
      }
      set
      {
        __isset.ProbabilityDistribution = true;
        this._ProbabilityDistribution = value;
      }
    }

    public TDDIFailState FromFailState
    {
      get
      {
        return _FromFailState;
      }
      set
      {
        __isset.FromFailState = true;
        this._FromFailState = value;
      }
    }

    public TDDIFailState ToFailState
    {
      get
      {
        return _ToFailState;
      }
      set
      {
        __isset.ToFailState = true;
        this._ToFailState = value;
      }
    }

    public TDDIState FromState
    {
      get
      {
        return _FromState;
      }
      set
      {
        __isset.FromState = true;
        this._FromState = value;
      }
    }

    public TDDIState ToState
    {
      get
      {
        return _ToState;
      }
      set
      {
        __isset.ToState = true;
        this._ToState = value;
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
      public bool Probability;
      public bool ProbabilityDistribution;
      public bool FromFailState;
      public bool ToFailState;
      public bool FromState;
      public bool ToState;
    }

    public TDDITransition() {
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
                  TList _list824 = iprot.ReadListBegin();
                  for( int _i825 = 0; _i825 < _list824.Count; ++_i825)
                  {
                    TDDIKeyValueMapRef _elem826;
                    _elem826 = new TDDIKeyValueMapRef();
                    _elem826.Read(iprot);
                    KeyValueMaps.Add(_elem826);
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
              if (field.Type == TType.Double) {
                Probability = iprot.ReadDouble();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 9:
              if (field.Type == TType.Struct) {
                ProbabilityDistribution = new TDDIProbabilityDistribution();
                ProbabilityDistribution.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 10:
              if (field.Type == TType.Struct) {
                FromFailState = new TDDIFailState();
                FromFailState.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 11:
              if (field.Type == TType.Struct) {
                ToFailState = new TDDIFailState();
                ToFailState.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 12:
              if (field.Type == TType.Struct) {
                FromState = new TDDIState();
                FromState.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 13:
              if (field.Type == TType.Struct) {
                ToState = new TDDIState();
                ToState.Read(iprot);
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
            foreach (TDDIKeyValueMapRef _iter827 in KeyValueMaps)
            {
              _iter827.Write(oprot);
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
        if (__isset.Probability) {
          field.Name = "Probability";
          field.Type = TType.Double;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          oprot.WriteDouble(Probability);
          oprot.WriteFieldEnd();
        }
        if (ProbabilityDistribution != null && __isset.ProbabilityDistribution) {
          field.Name = "ProbabilityDistribution";
          field.Type = TType.Struct;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          ProbabilityDistribution.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (FromFailState != null && __isset.FromFailState) {
          field.Name = "FromFailState";
          field.Type = TType.Struct;
          field.ID = 10;
          oprot.WriteFieldBegin(field);
          FromFailState.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (ToFailState != null && __isset.ToFailState) {
          field.Name = "ToFailState";
          field.Type = TType.Struct;
          field.ID = 11;
          oprot.WriteFieldBegin(field);
          ToFailState.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (FromState != null && __isset.FromState) {
          field.Name = "FromState";
          field.Type = TType.Struct;
          field.ID = 12;
          oprot.WriteFieldBegin(field);
          FromState.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (ToState != null && __isset.ToState) {
          field.Name = "ToState";
          field.Type = TType.Struct;
          field.ID = 13;
          oprot.WriteFieldBegin(field);
          ToState.Write(oprot);
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
      if (__isset.Probability) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Probability: ");
        __sb.Append(Probability);
      }
      if (ProbabilityDistribution != null && __isset.ProbabilityDistribution) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ProbabilityDistribution: ");
        __sb.Append(ProbabilityDistribution== null ? "<null>" : ProbabilityDistribution.ToString());
      }
      if (FromFailState != null && __isset.FromFailState) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FromFailState: ");
        __sb.Append(FromFailState== null ? "<null>" : FromFailState.ToString());
      }
      if (ToFailState != null && __isset.ToFailState) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ToFailState: ");
        __sb.Append(ToFailState== null ? "<null>" : ToFailState.ToString());
      }
      if (FromState != null && __isset.FromState) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FromState: ");
        __sb.Append(FromState== null ? "<null>" : FromState.ToString());
      }
      if (ToState != null && __isset.ToState) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ToState: ");
        __sb.Append(ToState== null ? "<null>" : ToState.ToString());
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
