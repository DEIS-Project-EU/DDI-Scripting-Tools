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
  public partial class TDDIMarkovChainPackageUnion : TBase
  {
    private TDDIMarkovChainPackage _MarkovChainPackage;
    private TDDIMarkovChainPackageInterface _MarkovChainPackageInterface;
    private TDDIMarkovChainPackageBinding _MarkovChainPackageBinding;

    public TDDIMarkovChainPackage MarkovChainPackage
    {
      get
      {
        return _MarkovChainPackage;
      }
      set
      {
        __isset.MarkovChainPackage = true;
        this._MarkovChainPackage = value;
      }
    }

    public TDDIMarkovChainPackageInterface MarkovChainPackageInterface
    {
      get
      {
        return _MarkovChainPackageInterface;
      }
      set
      {
        __isset.MarkovChainPackageInterface = true;
        this._MarkovChainPackageInterface = value;
      }
    }

    public TDDIMarkovChainPackageBinding MarkovChainPackageBinding
    {
      get
      {
        return _MarkovChainPackageBinding;
      }
      set
      {
        __isset.MarkovChainPackageBinding = true;
        this._MarkovChainPackageBinding = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool MarkovChainPackage;
      public bool MarkovChainPackageInterface;
      public bool MarkovChainPackageBinding;
    }

    public TDDIMarkovChainPackageUnion() {
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
                MarkovChainPackage = new TDDIMarkovChainPackage();
                MarkovChainPackage.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Struct) {
                MarkovChainPackageInterface = new TDDIMarkovChainPackageInterface();
                MarkovChainPackageInterface.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.Struct) {
                MarkovChainPackageBinding = new TDDIMarkovChainPackageBinding();
                MarkovChainPackageBinding.Read(iprot);
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
        TStruct struc = new TStruct("TDDIMarkovChainPackageUnion");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (MarkovChainPackage != null && __isset.MarkovChainPackage) {
          field.Name = "MarkovChainPackage";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          MarkovChainPackage.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (MarkovChainPackageInterface != null && __isset.MarkovChainPackageInterface) {
          field.Name = "MarkovChainPackageInterface";
          field.Type = TType.Struct;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          MarkovChainPackageInterface.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (MarkovChainPackageBinding != null && __isset.MarkovChainPackageBinding) {
          field.Name = "MarkovChainPackageBinding";
          field.Type = TType.Struct;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          MarkovChainPackageBinding.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIMarkovChainPackageUnion(");
      bool __first = true;
      if (MarkovChainPackage != null && __isset.MarkovChainPackage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("MarkovChainPackage: ");
        __sb.Append(MarkovChainPackage);
      }
      if (MarkovChainPackageInterface != null && __isset.MarkovChainPackageInterface) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("MarkovChainPackageInterface: ");
        __sb.Append(MarkovChainPackageInterface);
      }
      if (MarkovChainPackageBinding != null && __isset.MarkovChainPackageBinding) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("MarkovChainPackageBinding: ");
        __sb.Append(MarkovChainPackageBinding);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}