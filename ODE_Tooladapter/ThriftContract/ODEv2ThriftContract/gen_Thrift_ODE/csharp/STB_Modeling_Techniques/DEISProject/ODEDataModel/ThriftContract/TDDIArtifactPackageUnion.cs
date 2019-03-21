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
  public partial class TDDIArtifactPackageUnion : TBase
  {
    private TDDIArtifactPackage _ArtifactPackage;
    private TDDIArtifactPackageInterface _ArtifactPackageInterface;
    private TDDIArtifactPackageBinding _ArtifactPackageBinding;

    public TDDIArtifactPackage ArtifactPackage
    {
      get
      {
        return _ArtifactPackage;
      }
      set
      {
        __isset.ArtifactPackage = true;
        this._ArtifactPackage = value;
      }
    }

    public TDDIArtifactPackageInterface ArtifactPackageInterface
    {
      get
      {
        return _ArtifactPackageInterface;
      }
      set
      {
        __isset.ArtifactPackageInterface = true;
        this._ArtifactPackageInterface = value;
      }
    }

    public TDDIArtifactPackageBinding ArtifactPackageBinding
    {
      get
      {
        return _ArtifactPackageBinding;
      }
      set
      {
        __isset.ArtifactPackageBinding = true;
        this._ArtifactPackageBinding = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool ArtifactPackage;
      public bool ArtifactPackageInterface;
      public bool ArtifactPackageBinding;
    }

    public TDDIArtifactPackageUnion() {
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
                ArtifactPackage = new TDDIArtifactPackage();
                ArtifactPackage.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Struct) {
                ArtifactPackageInterface = new TDDIArtifactPackageInterface();
                ArtifactPackageInterface.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.Struct) {
                ArtifactPackageBinding = new TDDIArtifactPackageBinding();
                ArtifactPackageBinding.Read(iprot);
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
        TStruct struc = new TStruct("TDDIArtifactPackageUnion");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (ArtifactPackage != null && __isset.ArtifactPackage) {
          field.Name = "ArtifactPackage";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          ArtifactPackage.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (ArtifactPackageInterface != null && __isset.ArtifactPackageInterface) {
          field.Name = "ArtifactPackageInterface";
          field.Type = TType.Struct;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          ArtifactPackageInterface.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (ArtifactPackageBinding != null && __isset.ArtifactPackageBinding) {
          field.Name = "ArtifactPackageBinding";
          field.Type = TType.Struct;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          ArtifactPackageBinding.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIArtifactPackageUnion(");
      bool __first = true;
      if (ArtifactPackage != null && __isset.ArtifactPackage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ArtifactPackage: ");
        __sb.Append(ArtifactPackage);
      }
      if (ArtifactPackageInterface != null && __isset.ArtifactPackageInterface) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ArtifactPackageInterface: ");
        __sb.Append(ArtifactPackageInterface);
      }
      if (ArtifactPackageBinding != null && __isset.ArtifactPackageBinding) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ArtifactPackageBinding: ");
        __sb.Append(ArtifactPackageBinding);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}