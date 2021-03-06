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
  public partial class TDDIAbstractFailure : TBase
  {
    private TDDIFailureUnion _UsedFailure;
    private TDDIFailureUnionType _UsedFailureType;

    public TDDIFailureUnion UsedFailure
    {
      get
      {
        return _UsedFailure;
      }
      set
      {
        __isset.UsedFailure = true;
        this._UsedFailure = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="TDDIFailureUnionType"/>
    /// </summary>
    public TDDIFailureUnionType UsedFailureType
    {
      get
      {
        return _UsedFailureType;
      }
      set
      {
        __isset.UsedFailureType = true;
        this._UsedFailureType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool UsedFailure;
      public bool UsedFailureType;
    }

    public TDDIAbstractFailure() {
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
                UsedFailure = new TDDIFailureUnion();
                UsedFailure.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I32) {
                UsedFailureType = (TDDIFailureUnionType)iprot.ReadI32();
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
        TStruct struc = new TStruct("TDDIAbstractFailure");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (UsedFailure != null && __isset.UsedFailure) {
          field.Name = "UsedFailure";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          UsedFailure.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (__isset.UsedFailureType) {
          field.Name = "UsedFailureType";
          field.Type = TType.I32;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)UsedFailureType);
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
      StringBuilder __sb = new StringBuilder("TDDIAbstractFailure(");
      bool __first = true;
      if (UsedFailure != null && __isset.UsedFailure) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedFailure: ");
        __sb.Append(UsedFailure== null ? "<null>" : UsedFailure.ToString());
      }
      if (__isset.UsedFailureType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedFailureType: ");
        __sb.Append(UsedFailureType);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
