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
  public partial class TDDICauseUnion : TBase
  {
    private TDDICause _Cause;
    private TDDIGate _Gate;

    public TDDICause Cause
    {
      get
      {
        return _Cause;
      }
      set
      {
        __isset.Cause = true;
        this._Cause = value;
      }
    }

    public TDDIGate Gate
    {
      get
      {
        return _Gate;
      }
      set
      {
        __isset.Gate = true;
        this._Gate = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool Cause;
      public bool Gate;
    }

    public TDDICauseUnion() {
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
                Cause = new TDDICause();
                Cause.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Struct) {
                Gate = new TDDIGate();
                Gate.Read(iprot);
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
        TStruct struc = new TStruct("TDDICauseUnion");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (Cause != null && __isset.Cause) {
          field.Name = "Cause";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          Cause.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (Gate != null && __isset.Gate) {
          field.Name = "Gate";
          field.Type = TType.Struct;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          Gate.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDICauseUnion(");
      bool __first = true;
      if (Cause != null && __isset.Cause) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Cause: ");
        __sb.Append(Cause== null ? "<null>" : Cause.ToString());
      }
      if (Gate != null && __isset.Gate) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Gate: ");
        __sb.Append(Gate== null ? "<null>" : Gate.ToString());
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
