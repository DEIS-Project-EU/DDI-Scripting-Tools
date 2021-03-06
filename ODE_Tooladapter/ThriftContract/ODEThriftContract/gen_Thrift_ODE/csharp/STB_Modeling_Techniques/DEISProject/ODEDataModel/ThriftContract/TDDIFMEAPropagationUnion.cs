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
  public partial class TDDIFMEAPropagationUnion : TBase
  {
    private TDDIFMEAPropagation _FMEAPropagation;
    private TDDIDiagnosableFailurePropagation _DiagnosableFailurePropagation;

    public TDDIFMEAPropagation FMEAPropagation
    {
      get
      {
        return _FMEAPropagation;
      }
      set
      {
        __isset.FMEAPropagation = true;
        this._FMEAPropagation = value;
      }
    }

    public TDDIDiagnosableFailurePropagation DiagnosableFailurePropagation
    {
      get
      {
        return _DiagnosableFailurePropagation;
      }
      set
      {
        __isset.DiagnosableFailurePropagation = true;
        this._DiagnosableFailurePropagation = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool FMEAPropagation;
      public bool DiagnosableFailurePropagation;
    }

    public TDDIFMEAPropagationUnion() {
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
              if (field.Type == TType.Struct) {
                FMEAPropagation = new TDDIFMEAPropagation();
                FMEAPropagation.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Struct) {
                DiagnosableFailurePropagation = new TDDIDiagnosableFailurePropagation();
                DiagnosableFailurePropagation.Read(iprot);
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
        TStruct struc = new TStruct("TDDIFMEAPropagationUnion");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (FMEAPropagation != null && __isset.FMEAPropagation) {
          field.Name = "FMEAPropagation";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          FMEAPropagation.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (DiagnosableFailurePropagation != null && __isset.DiagnosableFailurePropagation) {
          field.Name = "DiagnosableFailurePropagation";
          field.Type = TType.Struct;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          DiagnosableFailurePropagation.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIFMEAPropagationUnion(");
      bool __first = true;
      if (FMEAPropagation != null && __isset.FMEAPropagation) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FMEAPropagation: ");
        __sb.Append(FMEAPropagation== null ? "<null>" : FMEAPropagation.ToString());
      }
      if (DiagnosableFailurePropagation != null && __isset.DiagnosableFailurePropagation) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("DiagnosableFailurePropagation: ");
        __sb.Append(DiagnosableFailurePropagation== null ? "<null>" : DiagnosableFailurePropagation.ToString());
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
