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
  public partial class TDDIAbstractArgumentAsset : TBase
  {
    private TDDIArgumentAssetUnion _UsedArgumentAsset;
    private TDDIArgumentAssetUnionType _UsedArgumentAssetType;

    public TDDIArgumentAssetUnion UsedArgumentAsset
    {
      get
      {
        return _UsedArgumentAsset;
      }
      set
      {
        __isset.UsedArgumentAsset = true;
        this._UsedArgumentAsset = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="TDDIArgumentAssetUnionType"/>
    /// </summary>
    public TDDIArgumentAssetUnionType UsedArgumentAssetType
    {
      get
      {
        return _UsedArgumentAssetType;
      }
      set
      {
        __isset.UsedArgumentAssetType = true;
        this._UsedArgumentAssetType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool UsedArgumentAsset;
      public bool UsedArgumentAssetType;
    }

    public TDDIAbstractArgumentAsset() {
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
                UsedArgumentAsset = new TDDIArgumentAssetUnion();
                UsedArgumentAsset.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I32) {
                UsedArgumentAssetType = (TDDIArgumentAssetUnionType)iprot.ReadI32();
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
        TStruct struc = new TStruct("TDDIAbstractArgumentAsset");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (UsedArgumentAsset != null && __isset.UsedArgumentAsset) {
          field.Name = "UsedArgumentAsset";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          UsedArgumentAsset.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (__isset.UsedArgumentAssetType) {
          field.Name = "UsedArgumentAssetType";
          field.Type = TType.I32;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)UsedArgumentAssetType);
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
      StringBuilder __sb = new StringBuilder("TDDIAbstractArgumentAsset(");
      bool __first = true;
      if (UsedArgumentAsset != null && __isset.UsedArgumentAsset) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedArgumentAsset: ");
        __sb.Append(UsedArgumentAsset== null ? "<null>" : UsedArgumentAsset.ToString());
      }
      if (__isset.UsedArgumentAssetType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedArgumentAssetType: ");
        __sb.Append(UsedArgumentAssetType);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
