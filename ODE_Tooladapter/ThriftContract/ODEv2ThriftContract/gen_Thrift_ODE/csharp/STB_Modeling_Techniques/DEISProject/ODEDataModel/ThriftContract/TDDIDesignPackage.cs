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
  public partial class TDDIDesignPackage : TBase
  {
    private long _Id;
    private string _Name;
    private string _Description;
    private List<TDDIKeyValueMap> _KeyValueMaps;
    private List<TDDIAbstractSystem> _Systems;
    private List<TDDIAbstractFunction> _Functions;

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

    public List<TDDIAbstractSystem> Systems
    {
      get
      {
        return _Systems;
      }
      set
      {
        __isset.Systems = true;
        this._Systems = value;
      }
    }

    public List<TDDIAbstractFunction> Functions
    {
      get
      {
        return _Functions;
      }
      set
      {
        __isset.Functions = true;
        this._Functions = value;
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
      public bool Systems;
      public bool Functions;
    }

    public TDDIDesignPackage() {
      this._Name = "";
      this.__isset.Name = true;
      this._Description = "";
      this.__isset.Description = true;
      this._KeyValueMaps = new List<TDDIKeyValueMap>();
      this.__isset.KeyValueMaps = true;
      this._Systems = new List<TDDIAbstractSystem>();
      this.__isset.Systems = true;
      this._Functions = new List<TDDIAbstractFunction>();
      this.__isset.Functions = true;
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
                  TList _list344 = iprot.ReadListBegin();
                  for( int _i345 = 0; _i345 < _list344.Count; ++_i345)
                  {
                    TDDIKeyValueMap _elem346;
                    _elem346 = new TDDIKeyValueMap();
                    _elem346.Read(iprot);
                    KeyValueMaps.Add(_elem346);
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
                  Systems = new List<TDDIAbstractSystem>();
                  TList _list347 = iprot.ReadListBegin();
                  for( int _i348 = 0; _i348 < _list347.Count; ++_i348)
                  {
                    TDDIAbstractSystem _elem349;
                    _elem349 = new TDDIAbstractSystem();
                    _elem349.Read(iprot);
                    Systems.Add(_elem349);
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
                  Functions = new List<TDDIAbstractFunction>();
                  TList _list350 = iprot.ReadListBegin();
                  for( int _i351 = 0; _i351 < _list350.Count; ++_i351)
                  {
                    TDDIAbstractFunction _elem352;
                    _elem352 = new TDDIAbstractFunction();
                    _elem352.Read(iprot);
                    Functions.Add(_elem352);
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
        TStruct struc = new TStruct("TDDIDesignPackage");
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
            foreach (TDDIKeyValueMap _iter353 in KeyValueMaps)
            {
              _iter353.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Systems != null && __isset.Systems) {
          field.Name = "Systems";
          field.Type = TType.List;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Systems.Count));
            foreach (TDDIAbstractSystem _iter354 in Systems)
            {
              _iter354.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Functions != null && __isset.Functions) {
          field.Name = "Functions";
          field.Type = TType.List;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Functions.Count));
            foreach (TDDIAbstractFunction _iter355 in Functions)
            {
              _iter355.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIDesignPackage(");
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
      if (Systems != null && __isset.Systems) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Systems: ");
        __sb.Append(Systems);
      }
      if (Functions != null && __isset.Functions) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Functions: ");
        __sb.Append(Functions);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
