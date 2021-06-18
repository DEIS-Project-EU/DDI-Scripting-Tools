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
  public partial class TDDIFTAPackageUnion : TBase
  {
    private TDDIFTAPackage _FTAPackage;
    private TDDIFTAPackageInterface _FTAPackageInterface;
    private TDDIFTAPackageBinding _FTAPackageBinding;

    public TDDIFTAPackage FTAPackage
    {
      get
      {
        return _FTAPackage;
      }
      set
      {
        __isset.FTAPackage = true;
        this._FTAPackage = value;
      }
    }

    public TDDIFTAPackageInterface FTAPackageInterface
    {
      get
      {
        return _FTAPackageInterface;
      }
      set
      {
        __isset.FTAPackageInterface = true;
        this._FTAPackageInterface = value;
      }
    }

    public TDDIFTAPackageBinding FTAPackageBinding
    {
      get
      {
        return _FTAPackageBinding;
      }
      set
      {
        __isset.FTAPackageBinding = true;
        this._FTAPackageBinding = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool FTAPackage;
      public bool FTAPackageInterface;
      public bool FTAPackageBinding;
    }

    public TDDIFTAPackageUnion() {
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
                FTAPackage = new TDDIFTAPackage();
                FTAPackage.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Struct) {
                FTAPackageInterface = new TDDIFTAPackageInterface();
                FTAPackageInterface.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.Struct) {
                FTAPackageBinding = new TDDIFTAPackageBinding();
                FTAPackageBinding.Read(iprot);
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
        TStruct struc = new TStruct("TDDIFTAPackageUnion");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (FTAPackage != null && __isset.FTAPackage) {
          field.Name = "FTAPackage";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          FTAPackage.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (FTAPackageInterface != null && __isset.FTAPackageInterface) {
          field.Name = "FTAPackageInterface";
          field.Type = TType.Struct;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          FTAPackageInterface.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (FTAPackageBinding != null && __isset.FTAPackageBinding) {
          field.Name = "FTAPackageBinding";
          field.Type = TType.Struct;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          FTAPackageBinding.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIFTAPackageUnion(");
      bool __first = true;
      if (FTAPackage != null && __isset.FTAPackage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FTAPackage: ");
        __sb.Append(FTAPackage== null ? "<null>" : FTAPackage.ToString());
      }
      if (FTAPackageInterface != null && __isset.FTAPackageInterface) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FTAPackageInterface: ");
        __sb.Append(FTAPackageInterface== null ? "<null>" : FTAPackageInterface.ToString());
      }
      if (FTAPackageBinding != null && __isset.FTAPackageBinding) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FTAPackageBinding: ");
        __sb.Append(FTAPackageBinding== null ? "<null>" : FTAPackageBinding.ToString());
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}