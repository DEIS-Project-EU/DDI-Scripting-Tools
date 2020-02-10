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
  public partial class TDDIAbstractAssertion : TBase
  {
    private TDDIAssertionUnion _UsedAssertion;
    private TDDIAssertionUnionType _UsedAssertionType;

    public TDDIAssertionUnion UsedAssertion
    {
      get
      {
        return _UsedAssertion;
      }
      set
      {
        __isset.UsedAssertion = true;
        this._UsedAssertion = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="TDDIAssertionUnionType"/>
    /// </summary>
    public TDDIAssertionUnionType UsedAssertionType
    {
      get
      {
        return _UsedAssertionType;
      }
      set
      {
        __isset.UsedAssertionType = true;
        this._UsedAssertionType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool UsedAssertion;
      public bool UsedAssertionType;
    }

    public TDDIAbstractAssertion() {
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
                UsedAssertion = new TDDIAssertionUnion();
                UsedAssertion.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I32) {
                UsedAssertionType = (TDDIAssertionUnionType)iprot.ReadI32();
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
        TStruct struc = new TStruct("TDDIAbstractAssertion");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (UsedAssertion != null && __isset.UsedAssertion) {
          field.Name = "UsedAssertion";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          UsedAssertion.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (__isset.UsedAssertionType) {
          field.Name = "UsedAssertionType";
          field.Type = TType.I32;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)UsedAssertionType);
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
      StringBuilder __sb = new StringBuilder("TDDIAbstractAssertion(");
      bool __first = true;
      if (UsedAssertion != null && __isset.UsedAssertion) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedAssertion: ");
        __sb.Append(UsedAssertion== null ? "<null>" : UsedAssertion.ToString());
      }
      if (__isset.UsedAssertionType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedAssertionType: ");
        __sb.Append(UsedAssertionType);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
