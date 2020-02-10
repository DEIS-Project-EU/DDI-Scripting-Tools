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
  public partial class TDDIAbstractFailureLogicPackage : TBase
  {
    private TDDIFailureLogicPackageUnion _UsedFailureLogicPackage;
    private TDDIFailureLogicPackageUnionType _UsedFailureLogicPackageType;

    public TDDIFailureLogicPackageUnion UsedFailureLogicPackage
    {
      get
      {
        return _UsedFailureLogicPackage;
      }
      set
      {
        __isset.UsedFailureLogicPackage = true;
        this._UsedFailureLogicPackage = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="TDDIFailureLogicPackageUnionType"/>
    /// </summary>
    public TDDIFailureLogicPackageUnionType UsedFailureLogicPackageType
    {
      get
      {
        return _UsedFailureLogicPackageType;
      }
      set
      {
        __isset.UsedFailureLogicPackageType = true;
        this._UsedFailureLogicPackageType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool UsedFailureLogicPackage;
      public bool UsedFailureLogicPackageType;
    }

    public TDDIAbstractFailureLogicPackage() {
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
                UsedFailureLogicPackage = new TDDIFailureLogicPackageUnion();
                UsedFailureLogicPackage.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I32) {
                UsedFailureLogicPackageType = (TDDIFailureLogicPackageUnionType)iprot.ReadI32();
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
        TStruct struc = new TStruct("TDDIAbstractFailureLogicPackage");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (UsedFailureLogicPackage != null && __isset.UsedFailureLogicPackage) {
          field.Name = "UsedFailureLogicPackage";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          UsedFailureLogicPackage.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (__isset.UsedFailureLogicPackageType) {
          field.Name = "UsedFailureLogicPackageType";
          field.Type = TType.I32;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)UsedFailureLogicPackageType);
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
      StringBuilder __sb = new StringBuilder("TDDIAbstractFailureLogicPackage(");
      bool __first = true;
      if (UsedFailureLogicPackage != null && __isset.UsedFailureLogicPackage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedFailureLogicPackage: ");
        __sb.Append(UsedFailureLogicPackage== null ? "<null>" : UsedFailureLogicPackage.ToString());
      }
      if (__isset.UsedFailureLogicPackageType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedFailureLogicPackageType: ");
        __sb.Append(UsedFailureLogicPackageType);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
