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
  public partial class TDDIAbstractMarkovChainPackage : TBase
  {
    private TDDIMarkovChainPackageUnion _UsedMarkovChainPackage;
    private TDDIMarkovChainPackageUnionType _UsedMarkovChainPackageType;

    public TDDIMarkovChainPackageUnion UsedMarkovChainPackage
    {
      get
      {
        return _UsedMarkovChainPackage;
      }
      set
      {
        __isset.UsedMarkovChainPackage = true;
        this._UsedMarkovChainPackage = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="TDDIMarkovChainPackageUnionType"/>
    /// </summary>
    public TDDIMarkovChainPackageUnionType UsedMarkovChainPackageType
    {
      get
      {
        return _UsedMarkovChainPackageType;
      }
      set
      {
        __isset.UsedMarkovChainPackageType = true;
        this._UsedMarkovChainPackageType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool UsedMarkovChainPackage;
      public bool UsedMarkovChainPackageType;
    }

    public TDDIAbstractMarkovChainPackage() {
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
                UsedMarkovChainPackage = new TDDIMarkovChainPackageUnion();
                UsedMarkovChainPackage.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I32) {
                UsedMarkovChainPackageType = (TDDIMarkovChainPackageUnionType)iprot.ReadI32();
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
        TStruct struc = new TStruct("TDDIAbstractMarkovChainPackage");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (UsedMarkovChainPackage != null && __isset.UsedMarkovChainPackage) {
          field.Name = "UsedMarkovChainPackage";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          UsedMarkovChainPackage.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (__isset.UsedMarkovChainPackageType) {
          field.Name = "UsedMarkovChainPackageType";
          field.Type = TType.I32;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)UsedMarkovChainPackageType);
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
      StringBuilder __sb = new StringBuilder("TDDIAbstractMarkovChainPackage(");
      bool __first = true;
      if (UsedMarkovChainPackage != null && __isset.UsedMarkovChainPackage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedMarkovChainPackage: ");
        __sb.Append(UsedMarkovChainPackage== null ? "<null>" : UsedMarkovChainPackage.ToString());
      }
      if (__isset.UsedMarkovChainPackageType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedMarkovChainPackageType: ");
        __sb.Append(UsedMarkovChainPackageType);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
