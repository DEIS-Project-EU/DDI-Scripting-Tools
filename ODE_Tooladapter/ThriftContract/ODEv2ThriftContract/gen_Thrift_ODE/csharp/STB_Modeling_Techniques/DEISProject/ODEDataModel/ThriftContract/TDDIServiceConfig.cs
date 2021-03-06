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
  public partial class TDDIServiceConfig : TBase
  {
    private string _DDIFilePath;
    private List<TDDIEpsilonScriptExecutionConfig> _EpsilonScriptExecutionConfig;

    public string DDIFilePath
    {
      get
      {
        return _DDIFilePath;
      }
      set
      {
        __isset.DDIFilePath = true;
        this._DDIFilePath = value;
      }
    }

    public List<TDDIEpsilonScriptExecutionConfig> EpsilonScriptExecutionConfig
    {
      get
      {
        return _EpsilonScriptExecutionConfig;
      }
      set
      {
        __isset.EpsilonScriptExecutionConfig = true;
        this._EpsilonScriptExecutionConfig = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool DDIFilePath;
      public bool EpsilonScriptExecutionConfig;
    }

    public TDDIServiceConfig() {
      this._DDIFilePath = "";
      this.__isset.DDIFilePath = true;
      this._EpsilonScriptExecutionConfig = new List<TDDIEpsilonScriptExecutionConfig>();
      this.__isset.EpsilonScriptExecutionConfig = true;
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
              if (field.Type == TType.String) {
                DDIFilePath = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.List) {
                {
                  EpsilonScriptExecutionConfig = new List<TDDIEpsilonScriptExecutionConfig>();
                  TList _list1376 = iprot.ReadListBegin();
                  for( int _i1377 = 0; _i1377 < _list1376.Count; ++_i1377)
                  {
                    TDDIEpsilonScriptExecutionConfig _elem1378;
                    _elem1378 = new TDDIEpsilonScriptExecutionConfig();
                    _elem1378.Read(iprot);
                    EpsilonScriptExecutionConfig.Add(_elem1378);
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
        TStruct struc = new TStruct("TDDIServiceConfig");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (DDIFilePath != null && __isset.DDIFilePath) {
          field.Name = "DDIFilePath";
          field.Type = TType.String;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(DDIFilePath);
          oprot.WriteFieldEnd();
        }
        if (EpsilonScriptExecutionConfig != null && __isset.EpsilonScriptExecutionConfig) {
          field.Name = "EpsilonScriptExecutionConfig";
          field.Type = TType.List;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, EpsilonScriptExecutionConfig.Count));
            foreach (TDDIEpsilonScriptExecutionConfig _iter1379 in EpsilonScriptExecutionConfig)
            {
              _iter1379.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIServiceConfig(");
      bool __first = true;
      if (DDIFilePath != null && __isset.DDIFilePath) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("DDIFilePath: ");
        __sb.Append(DDIFilePath);
      }
      if (EpsilonScriptExecutionConfig != null && __isset.EpsilonScriptExecutionConfig) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("EpsilonScriptExecutionConfig: ");
        __sb.Append(EpsilonScriptExecutionConfig);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
