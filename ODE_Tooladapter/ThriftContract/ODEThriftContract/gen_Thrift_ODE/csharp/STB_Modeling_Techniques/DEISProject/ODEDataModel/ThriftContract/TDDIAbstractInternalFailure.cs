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
  public partial class TDDIAbstractInternalFailure : TBase
  {
    private TDDIInternalFailureUnion _UsedInternalFailure;
    private TDDIInternalFailureUnionType _UsedInternalFailureType;

    public TDDIInternalFailureUnion UsedInternalFailure
    {
      get
      {
        return _UsedInternalFailure;
      }
      set
      {
        __isset.UsedInternalFailure = true;
        this._UsedInternalFailure = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="TDDIInternalFailureUnionType"/>
    /// </summary>
    public TDDIInternalFailureUnionType UsedInternalFailureType
    {
      get
      {
        return _UsedInternalFailureType;
      }
      set
      {
        __isset.UsedInternalFailureType = true;
        this._UsedInternalFailureType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool UsedInternalFailure;
      public bool UsedInternalFailureType;
    }

    public TDDIAbstractInternalFailure() {
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
                UsedInternalFailure = new TDDIInternalFailureUnion();
                UsedInternalFailure.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I32) {
                UsedInternalFailureType = (TDDIInternalFailureUnionType)iprot.ReadI32();
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
        TStruct struc = new TStruct("TDDIAbstractInternalFailure");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (UsedInternalFailure != null && __isset.UsedInternalFailure) {
          field.Name = "UsedInternalFailure";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          UsedInternalFailure.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (__isset.UsedInternalFailureType) {
          field.Name = "UsedInternalFailureType";
          field.Type = TType.I32;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)UsedInternalFailureType);
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
      StringBuilder __sb = new StringBuilder("TDDIAbstractInternalFailure(");
      bool __first = true;
      if (UsedInternalFailure != null && __isset.UsedInternalFailure) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedInternalFailure: ");
        __sb.Append(UsedInternalFailure== null ? "<null>" : UsedInternalFailure.ToString());
      }
      if (__isset.UsedInternalFailureType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedInternalFailureType: ");
        __sb.Append(UsedInternalFailureType);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
