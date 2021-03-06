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
  public partial class TDDIAbstractODEPackage : TBase
  {
    private TDDIODEPackageUnion _UsedODEPackage;
    private TDDIODEPackageUnionType _UsedODEPackageType;

    public TDDIODEPackageUnion UsedODEPackage
    {
      get
      {
        return _UsedODEPackage;
      }
      set
      {
        __isset.UsedODEPackage = true;
        this._UsedODEPackage = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="TDDIODEPackageUnionType"/>
    /// </summary>
    public TDDIODEPackageUnionType UsedODEPackageType
    {
      get
      {
        return _UsedODEPackageType;
      }
      set
      {
        __isset.UsedODEPackageType = true;
        this._UsedODEPackageType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool UsedODEPackage;
      public bool UsedODEPackageType;
    }

    public TDDIAbstractODEPackage() {
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
                UsedODEPackage = new TDDIODEPackageUnion();
                UsedODEPackage.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I32) {
                UsedODEPackageType = (TDDIODEPackageUnionType)iprot.ReadI32();
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
        TStruct struc = new TStruct("TDDIAbstractODEPackage");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (UsedODEPackage != null && __isset.UsedODEPackage) {
          field.Name = "UsedODEPackage";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          UsedODEPackage.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (__isset.UsedODEPackageType) {
          field.Name = "UsedODEPackageType";
          field.Type = TType.I32;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)UsedODEPackageType);
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
      StringBuilder __sb = new StringBuilder("TDDIAbstractODEPackage(");
      bool __first = true;
      if (UsedODEPackage != null && __isset.UsedODEPackage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedODEPackage: ");
        __sb.Append(UsedODEPackage== null ? "<null>" : UsedODEPackage.ToString());
      }
      if (__isset.UsedODEPackageType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedODEPackageType: ");
        __sb.Append(UsedODEPackageType);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
