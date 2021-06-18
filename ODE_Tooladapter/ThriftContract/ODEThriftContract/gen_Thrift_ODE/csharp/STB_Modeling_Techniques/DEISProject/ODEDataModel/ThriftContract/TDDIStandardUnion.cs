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
  public partial class TDDIStandardUnion : TBase
  {
    private TDDIStandard _Standard;
    private TDDISafetyStandard _SafetyStandard;

    public TDDIStandard Standard
    {
      get
      {
        return _Standard;
      }
      set
      {
        __isset.Standard = true;
        this._Standard = value;
      }
    }

    public TDDISafetyStandard SafetyStandard
    {
      get
      {
        return _SafetyStandard;
      }
      set
      {
        __isset.SafetyStandard = true;
        this._SafetyStandard = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool Standard;
      public bool SafetyStandard;
    }

    public TDDIStandardUnion() {
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
                Standard = new TDDIStandard();
                Standard.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Struct) {
                SafetyStandard = new TDDISafetyStandard();
                SafetyStandard.Read(iprot);
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
        TStruct struc = new TStruct("TDDIStandardUnion");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (Standard != null && __isset.Standard) {
          field.Name = "Standard";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          Standard.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (SafetyStandard != null && __isset.SafetyStandard) {
          field.Name = "SafetyStandard";
          field.Type = TType.Struct;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          SafetyStandard.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIStandardUnion(");
      bool __first = true;
      if (Standard != null && __isset.Standard) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Standard: ");
        __sb.Append(Standard== null ? "<null>" : Standard.ToString());
      }
      if (SafetyStandard != null && __isset.SafetyStandard) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("SafetyStandard: ");
        __sb.Append(SafetyStandard== null ? "<null>" : SafetyStandard.ToString());
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}