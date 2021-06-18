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
  public partial class TDDIAbstractUtilityElement : TBase
  {
    private TDDIUtilityElementUnion _UsedUtilityElement;
    private TDDIUtilityElementUnionType _UsedUtilityElementType;

    public TDDIUtilityElementUnion UsedUtilityElement
    {
      get
      {
        return _UsedUtilityElement;
      }
      set
      {
        __isset.UsedUtilityElement = true;
        this._UsedUtilityElement = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="TDDIUtilityElementUnionType"/>
    /// </summary>
    public TDDIUtilityElementUnionType UsedUtilityElementType
    {
      get
      {
        return _UsedUtilityElementType;
      }
      set
      {
        __isset.UsedUtilityElementType = true;
        this._UsedUtilityElementType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool UsedUtilityElement;
      public bool UsedUtilityElementType;
    }

    public TDDIAbstractUtilityElement() {
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
                UsedUtilityElement = new TDDIUtilityElementUnion();
                UsedUtilityElement.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I32) {
                UsedUtilityElementType = (TDDIUtilityElementUnionType)iprot.ReadI32();
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
        TStruct struc = new TStruct("TDDIAbstractUtilityElement");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (UsedUtilityElement != null && __isset.UsedUtilityElement) {
          field.Name = "UsedUtilityElement";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          UsedUtilityElement.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (__isset.UsedUtilityElementType) {
          field.Name = "UsedUtilityElementType";
          field.Type = TType.I32;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)UsedUtilityElementType);
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
      StringBuilder __sb = new StringBuilder("TDDIAbstractUtilityElement(");
      bool __first = true;
      if (UsedUtilityElement != null && __isset.UsedUtilityElement) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedUtilityElement: ");
        __sb.Append(UsedUtilityElement== null ? "<null>" : UsedUtilityElement.ToString());
      }
      if (__isset.UsedUtilityElementType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedUtilityElementType: ");
        __sb.Append(UsedUtilityElementType);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}