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
  public partial class TDDIAbstractModelElement : TBase
  {
    private TDDIModelElementUnion _UsedModelElement;
    private TDDIModelElementUnionType _UsedModelElementType;

    public TDDIModelElementUnion UsedModelElement
    {
      get
      {
        return _UsedModelElement;
      }
      set
      {
        __isset.UsedModelElement = true;
        this._UsedModelElement = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="TDDIModelElementUnionType"/>
    /// </summary>
    public TDDIModelElementUnionType UsedModelElementType
    {
      get
      {
        return _UsedModelElementType;
      }
      set
      {
        __isset.UsedModelElementType = true;
        this._UsedModelElementType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool UsedModelElement;
      public bool UsedModelElementType;
    }

    public TDDIAbstractModelElement() {
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
                UsedModelElement = new TDDIModelElementUnion();
                UsedModelElement.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I32) {
                UsedModelElementType = (TDDIModelElementUnionType)iprot.ReadI32();
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
        TStruct struc = new TStruct("TDDIAbstractModelElement");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (UsedModelElement != null && __isset.UsedModelElement) {
          field.Name = "UsedModelElement";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          UsedModelElement.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (__isset.UsedModelElementType) {
          field.Name = "UsedModelElementType";
          field.Type = TType.I32;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)UsedModelElementType);
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
      StringBuilder __sb = new StringBuilder("TDDIAbstractModelElement(");
      bool __first = true;
      if (UsedModelElement != null && __isset.UsedModelElement) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedModelElement: ");
        __sb.Append(UsedModelElement== null ? "<null>" : UsedModelElement.ToString());
      }
      if (__isset.UsedModelElementType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedModelElementType: ");
        __sb.Append(UsedModelElementType);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
