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
  public partial class TDDIODEPackageUnion : TBase
  {
    private TDDIODEPackage _ODEPackage;
    private TDDIODEPackageInterface _ODEPackageInterface;
    private TDDIODEPackageBinding _ODEPackageBinding;

    public TDDIODEPackage ODEPackage
    {
      get
      {
        return _ODEPackage;
      }
      set
      {
        __isset.ODEPackage = true;
        this._ODEPackage = value;
      }
    }

    public TDDIODEPackageInterface ODEPackageInterface
    {
      get
      {
        return _ODEPackageInterface;
      }
      set
      {
        __isset.ODEPackageInterface = true;
        this._ODEPackageInterface = value;
      }
    }

    public TDDIODEPackageBinding ODEPackageBinding
    {
      get
      {
        return _ODEPackageBinding;
      }
      set
      {
        __isset.ODEPackageBinding = true;
        this._ODEPackageBinding = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool ODEPackage;
      public bool ODEPackageInterface;
      public bool ODEPackageBinding;
    }

    public TDDIODEPackageUnion() {
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
                ODEPackage = new TDDIODEPackage();
                ODEPackage.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Struct) {
                ODEPackageInterface = new TDDIODEPackageInterface();
                ODEPackageInterface.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.Struct) {
                ODEPackageBinding = new TDDIODEPackageBinding();
                ODEPackageBinding.Read(iprot);
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
        TStruct struc = new TStruct("TDDIODEPackageUnion");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (ODEPackage != null && __isset.ODEPackage) {
          field.Name = "ODEPackage";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          ODEPackage.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (ODEPackageInterface != null && __isset.ODEPackageInterface) {
          field.Name = "ODEPackageInterface";
          field.Type = TType.Struct;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          ODEPackageInterface.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (ODEPackageBinding != null && __isset.ODEPackageBinding) {
          field.Name = "ODEPackageBinding";
          field.Type = TType.Struct;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          ODEPackageBinding.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIODEPackageUnion(");
      bool __first = true;
      if (ODEPackage != null && __isset.ODEPackage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ODEPackage: ");
        __sb.Append(ODEPackage);
      }
      if (ODEPackageInterface != null && __isset.ODEPackageInterface) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ODEPackageInterface: ");
        __sb.Append(ODEPackageInterface);
      }
      if (ODEPackageBinding != null && __isset.ODEPackageBinding) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ODEPackageBinding: ");
        __sb.Append(ODEPackageBinding);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
