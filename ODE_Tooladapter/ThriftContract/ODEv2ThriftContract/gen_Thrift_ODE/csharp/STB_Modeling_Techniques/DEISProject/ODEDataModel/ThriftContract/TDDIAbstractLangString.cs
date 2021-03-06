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
  public partial class TDDIAbstractLangString : TBase
  {
    private TDDILangStringUnion _UsedLangString;
    private TDDILangStringUnionType _UsedLangStringType;

    public TDDILangStringUnion UsedLangString
    {
      get
      {
        return _UsedLangString;
      }
      set
      {
        __isset.UsedLangString = true;
        this._UsedLangString = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="TDDILangStringUnionType"/>
    /// </summary>
    public TDDILangStringUnionType UsedLangStringType
    {
      get
      {
        return _UsedLangStringType;
      }
      set
      {
        __isset.UsedLangStringType = true;
        this._UsedLangStringType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool UsedLangString;
      public bool UsedLangStringType;
    }

    public TDDIAbstractLangString() {
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
                UsedLangString = new TDDILangStringUnion();
                UsedLangString.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I32) {
                UsedLangStringType = (TDDILangStringUnionType)iprot.ReadI32();
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
        TStruct struc = new TStruct("TDDIAbstractLangString");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (UsedLangString != null && __isset.UsedLangString) {
          field.Name = "UsedLangString";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          UsedLangString.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (__isset.UsedLangStringType) {
          field.Name = "UsedLangStringType";
          field.Type = TType.I32;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)UsedLangStringType);
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
      StringBuilder __sb = new StringBuilder("TDDIAbstractLangString(");
      bool __first = true;
      if (UsedLangString != null && __isset.UsedLangString) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedLangString: ");
        __sb.Append(UsedLangString== null ? "<null>" : UsedLangString.ToString());
      }
      if (__isset.UsedLangStringType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedLangStringType: ");
        __sb.Append(UsedLangStringType);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
