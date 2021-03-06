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
  public partial class TDDIAbstractDependabilityPackage : TBase
  {
    private TDDIDependabilityPackageUnion _UsedDependabilityPackage;
    private TDDIDependabilityPackageUnionType _UsedDependabilityPackageType;

    public TDDIDependabilityPackageUnion UsedDependabilityPackage
    {
      get
      {
        return _UsedDependabilityPackage;
      }
      set
      {
        __isset.UsedDependabilityPackage = true;
        this._UsedDependabilityPackage = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="TDDIDependabilityPackageUnionType"/>
    /// </summary>
    public TDDIDependabilityPackageUnionType UsedDependabilityPackageType
    {
      get
      {
        return _UsedDependabilityPackageType;
      }
      set
      {
        __isset.UsedDependabilityPackageType = true;
        this._UsedDependabilityPackageType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool UsedDependabilityPackage;
      public bool UsedDependabilityPackageType;
    }

    public TDDIAbstractDependabilityPackage() {
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
                UsedDependabilityPackage = new TDDIDependabilityPackageUnion();
                UsedDependabilityPackage.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I32) {
                UsedDependabilityPackageType = (TDDIDependabilityPackageUnionType)iprot.ReadI32();
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
        TStruct struc = new TStruct("TDDIAbstractDependabilityPackage");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (UsedDependabilityPackage != null && __isset.UsedDependabilityPackage) {
          field.Name = "UsedDependabilityPackage";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          UsedDependabilityPackage.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (__isset.UsedDependabilityPackageType) {
          field.Name = "UsedDependabilityPackageType";
          field.Type = TType.I32;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)UsedDependabilityPackageType);
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
      StringBuilder __sb = new StringBuilder("TDDIAbstractDependabilityPackage(");
      bool __first = true;
      if (UsedDependabilityPackage != null && __isset.UsedDependabilityPackage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedDependabilityPackage: ");
        __sb.Append(UsedDependabilityPackage== null ? "<null>" : UsedDependabilityPackage.ToString());
      }
      if (__isset.UsedDependabilityPackageType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedDependabilityPackageType: ");
        __sb.Append(UsedDependabilityPackageType);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
