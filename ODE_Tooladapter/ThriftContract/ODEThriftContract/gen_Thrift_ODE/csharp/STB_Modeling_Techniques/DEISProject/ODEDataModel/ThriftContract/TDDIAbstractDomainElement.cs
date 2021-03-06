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
  public partial class TDDIAbstractDomainElement : TBase
  {
    private TDDIDomainElementUnion _UsedDomainElement;
    private TDDIDomainElementUnionType _UsedDomainElementType;

    public TDDIDomainElementUnion UsedDomainElement
    {
      get
      {
        return _UsedDomainElement;
      }
      set
      {
        __isset.UsedDomainElement = true;
        this._UsedDomainElement = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="TDDIDomainElementUnionType"/>
    /// </summary>
    public TDDIDomainElementUnionType UsedDomainElementType
    {
      get
      {
        return _UsedDomainElementType;
      }
      set
      {
        __isset.UsedDomainElementType = true;
        this._UsedDomainElementType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool UsedDomainElement;
      public bool UsedDomainElementType;
    }

    public TDDIAbstractDomainElement() {
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
                UsedDomainElement = new TDDIDomainElementUnion();
                UsedDomainElement.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I32) {
                UsedDomainElementType = (TDDIDomainElementUnionType)iprot.ReadI32();
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
        TStruct struc = new TStruct("TDDIAbstractDomainElement");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (UsedDomainElement != null && __isset.UsedDomainElement) {
          field.Name = "UsedDomainElement";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          UsedDomainElement.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (__isset.UsedDomainElementType) {
          field.Name = "UsedDomainElementType";
          field.Type = TType.I32;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)UsedDomainElementType);
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
      StringBuilder __sb = new StringBuilder("TDDIAbstractDomainElement(");
      bool __first = true;
      if (UsedDomainElement != null && __isset.UsedDomainElement) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedDomainElement: ");
        __sb.Append(UsedDomainElement== null ? "<null>" : UsedDomainElement.ToString());
      }
      if (__isset.UsedDomainElementType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedDomainElementType: ");
        __sb.Append(UsedDomainElementType);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
