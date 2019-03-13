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
  public partial class TDDIAbstractRequirementSource : TBase
  {
    private TDDIRequirementSourceUnion _UsedRequirementSource;
    private TDDIRequirementSourceUnionType _UsedRequirementSourceType;

    public TDDIRequirementSourceUnion UsedRequirementSource
    {
      get
      {
        return _UsedRequirementSource;
      }
      set
      {
        __isset.UsedRequirementSource = true;
        this._UsedRequirementSource = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="TDDIRequirementSourceUnionType"/>
    /// </summary>
    public TDDIRequirementSourceUnionType UsedRequirementSourceType
    {
      get
      {
        return _UsedRequirementSourceType;
      }
      set
      {
        __isset.UsedRequirementSourceType = true;
        this._UsedRequirementSourceType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool UsedRequirementSource;
      public bool UsedRequirementSourceType;
    }

    public TDDIAbstractRequirementSource() {
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
                UsedRequirementSource = new TDDIRequirementSourceUnion();
                UsedRequirementSource.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I32) {
                UsedRequirementSourceType = (TDDIRequirementSourceUnionType)iprot.ReadI32();
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
        TStruct struc = new TStruct("TDDIAbstractRequirementSource");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (UsedRequirementSource != null && __isset.UsedRequirementSource) {
          field.Name = "UsedRequirementSource";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          UsedRequirementSource.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (__isset.UsedRequirementSourceType) {
          field.Name = "UsedRequirementSourceType";
          field.Type = TType.I32;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)UsedRequirementSourceType);
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
      StringBuilder __sb = new StringBuilder("TDDIAbstractRequirementSource(");
      bool __first = true;
      if (UsedRequirementSource != null && __isset.UsedRequirementSource) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedRequirementSource: ");
        __sb.Append(UsedRequirementSource== null ? "<null>" : UsedRequirementSource.ToString());
      }
      if (__isset.UsedRequirementSourceType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedRequirementSourceType: ");
        __sb.Append(UsedRequirementSourceType);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
