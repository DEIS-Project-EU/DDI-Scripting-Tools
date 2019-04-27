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
  public partial class TDDIMarkovChain : TBase
  {
    private long _Id;
    private string _Name;
    private string _Description;
    private List<TDDIKeyValueMap> _KeyValueMaps;
    private List<TDDIMinimalCutSets> _MinimalCutSets;
    private List<TDDIAbstractFailure> _Failures;
    private List<TDDIAbstractFailureModelRef> _SubModels;
    private List<TDDITransition> _Transitions;
    private List<TDDIState> _States;

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

    public List<TDDIMinimalCutSets> MinimalCutSets
    {
      get
      {
        return _MinimalCutSets;
      }
      set
      {
        __isset.MinimalCutSets = true;
        this._MinimalCutSets = value;
      }
    }

    public List<TDDIAbstractFailure> Failures
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

    public List<TDDIAbstractFailureModelRef> SubModels
    {
      get
      {
        return _SubModels;
      }
      set
      {
        __isset.SubModels = true;
        this._SubModels = value;
      }
    }

    public List<TDDITransition> Transitions
    {
      get
      {
        return _Transitions;
      }
      set
      {
        __isset.Transitions = true;
        this._Transitions = value;
      }
    }

    public List<TDDIState> States
    {
      get
      {
        return _States;
      }
      set
      {
        __isset.States = true;
        this._States = value;
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
      public bool MinimalCutSets;
      public bool Failures;
      public bool SubModels;
      public bool Transitions;
      public bool States;
    }

    public TDDIMarkovChain() {
      this._Name = "";
      this.__isset.Name = true;
      this._Description = "";
      this.__isset.Description = true;
      this._KeyValueMaps = new List<TDDIKeyValueMap>();
      this.__isset.KeyValueMaps = true;
      this._MinimalCutSets = new List<TDDIMinimalCutSets>();
      this.__isset.MinimalCutSets = true;
      this._Failures = new List<TDDIAbstractFailure>();
      this.__isset.Failures = true;
      this._SubModels = new List<TDDIAbstractFailureModelRef>();
      this.__isset.SubModels = true;
      this._Transitions = new List<TDDITransition>();
      this.__isset.Transitions = true;
      this._States = new List<TDDIState>();
      this.__isset.States = true;
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
                  TList _list628 = iprot.ReadListBegin();
                  for( int _i629 = 0; _i629 < _list628.Count; ++_i629)
                  {
                    TDDIKeyValueMap _elem630;
                    _elem630 = new TDDIKeyValueMap();
                    _elem630.Read(iprot);
                    KeyValueMaps.Add(_elem630);
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
                  MinimalCutSets = new List<TDDIMinimalCutSets>();
                  TList _list631 = iprot.ReadListBegin();
                  for( int _i632 = 0; _i632 < _list631.Count; ++_i632)
                  {
                    TDDIMinimalCutSets _elem633;
                    _elem633 = new TDDIMinimalCutSets();
                    _elem633.Read(iprot);
                    MinimalCutSets.Add(_elem633);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.List) {
                {
                  Failures = new List<TDDIAbstractFailure>();
                  TList _list634 = iprot.ReadListBegin();
                  for( int _i635 = 0; _i635 < _list634.Count; ++_i635)
                  {
                    TDDIAbstractFailure _elem636;
                    _elem636 = new TDDIAbstractFailure();
                    _elem636.Read(iprot);
                    Failures.Add(_elem636);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.List) {
                {
                  SubModels = new List<TDDIAbstractFailureModelRef>();
                  TList _list637 = iprot.ReadListBegin();
                  for( int _i638 = 0; _i638 < _list637.Count; ++_i638)
                  {
                    TDDIAbstractFailureModelRef _elem639;
                    _elem639 = new TDDIAbstractFailureModelRef();
                    _elem639.Read(iprot);
                    SubModels.Add(_elem639);
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
                  Transitions = new List<TDDITransition>();
                  TList _list640 = iprot.ReadListBegin();
                  for( int _i641 = 0; _i641 < _list640.Count; ++_i641)
                  {
                    TDDITransition _elem642;
                    _elem642 = new TDDITransition();
                    _elem642.Read(iprot);
                    Transitions.Add(_elem642);
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
                  States = new List<TDDIState>();
                  TList _list643 = iprot.ReadListBegin();
                  for( int _i644 = 0; _i644 < _list643.Count; ++_i644)
                  {
                    TDDIState _elem645;
                    _elem645 = new TDDIState();
                    _elem645.Read(iprot);
                    States.Add(_elem645);
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
        TStruct struc = new TStruct("TDDIMarkovChain");
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
            foreach (TDDIKeyValueMap _iter646 in KeyValueMaps)
            {
              _iter646.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (MinimalCutSets != null && __isset.MinimalCutSets) {
          field.Name = "MinimalCutSets";
          field.Type = TType.List;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, MinimalCutSets.Count));
            foreach (TDDIMinimalCutSets _iter647 in MinimalCutSets)
            {
              _iter647.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Failures != null && __isset.Failures) {
          field.Name = "Failures";
          field.Type = TType.List;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Failures.Count));
            foreach (TDDIAbstractFailure _iter648 in Failures)
            {
              _iter648.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (SubModels != null && __isset.SubModels) {
          field.Name = "SubModels";
          field.Type = TType.List;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, SubModels.Count));
            foreach (TDDIAbstractFailureModelRef _iter649 in SubModels)
            {
              _iter649.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Transitions != null && __isset.Transitions) {
          field.Name = "Transitions";
          field.Type = TType.List;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Transitions.Count));
            foreach (TDDITransition _iter650 in Transitions)
            {
              _iter650.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (States != null && __isset.States) {
          field.Name = "States";
          field.Type = TType.List;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, States.Count));
            foreach (TDDIState _iter651 in States)
            {
              _iter651.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIMarkovChain(");
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
      if (MinimalCutSets != null && __isset.MinimalCutSets) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("MinimalCutSets: ");
        __sb.Append(MinimalCutSets);
      }
      if (Failures != null && __isset.Failures) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Failures: ");
        __sb.Append(Failures);
      }
      if (SubModels != null && __isset.SubModels) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("SubModels: ");
        __sb.Append(SubModels);
      }
      if (Transitions != null && __isset.Transitions) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Transitions: ");
        __sb.Append(Transitions);
      }
      if (States != null && __isset.States) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("States: ");
        __sb.Append(States);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}