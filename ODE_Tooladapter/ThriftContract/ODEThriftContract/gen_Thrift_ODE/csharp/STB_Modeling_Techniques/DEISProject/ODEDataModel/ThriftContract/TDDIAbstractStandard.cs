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
  public partial class TDDIAbstractStandard : TBase
  {
    private TDDIStandardUnion _UsedStandard;
    private TDDIStandardUnionType _UsedStandardType;

    public TDDIStandardUnion UsedStandard
    {
      get
      {
        return _UsedStandard;
      }
      set
      {
        __isset.UsedStandard = true;
        this._UsedStandard = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="TDDIStandardUnionType"/>
    /// </summary>
    public TDDIStandardUnionType UsedStandardType
    {
      get
      {
        return _UsedStandardType;
      }
      set
      {
        __isset.UsedStandardType = true;
        this._UsedStandardType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool UsedStandard;
      public bool UsedStandardType;
    }

    public TDDIAbstractStandard() {
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
                UsedStandard = new TDDIStandardUnion();
                UsedStandard.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I32) {
                UsedStandardType = (TDDIStandardUnionType)iprot.ReadI32();
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
        TStruct struc = new TStruct("TDDIAbstractStandard");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (UsedStandard != null && __isset.UsedStandard) {
          field.Name = "UsedStandard";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          UsedStandard.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (__isset.UsedStandardType) {
          field.Name = "UsedStandardType";
          field.Type = TType.I32;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)UsedStandardType);
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
      StringBuilder __sb = new StringBuilder("TDDIAbstractStandard(");
      bool __first = true;
      if (UsedStandard != null && __isset.UsedStandard) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedStandard: ");
        __sb.Append(UsedStandard== null ? "<null>" : UsedStandard.ToString());
      }
      if (__isset.UsedStandardType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedStandardType: ");
        __sb.Append(UsedStandardType);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
