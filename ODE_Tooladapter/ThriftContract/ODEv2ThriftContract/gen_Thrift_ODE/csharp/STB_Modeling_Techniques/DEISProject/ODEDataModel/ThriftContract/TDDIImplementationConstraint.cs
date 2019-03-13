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
  public partial class TDDIImplementationConstraint : TBase
  {
    private string _Gid;
    private bool _IsCitation;
    private bool _IsAbstract;
    private TDDIAbstractSACMElement _CitedElement;
    private TDDIAbstractSACMElement _AbstractForm;
    private TDDIMultiLangString _Content;

    public string Gid
    {
      get
      {
        return _Gid;
      }
      set
      {
        __isset.Gid = true;
        this._Gid = value;
      }
    }

    public bool IsCitation
    {
      get
      {
        return _IsCitation;
      }
      set
      {
        __isset.IsCitation = true;
        this._IsCitation = value;
      }
    }

    public bool IsAbstract
    {
      get
      {
        return _IsAbstract;
      }
      set
      {
        __isset.IsAbstract = true;
        this._IsAbstract = value;
      }
    }

    public TDDIAbstractSACMElement CitedElement
    {
      get
      {
        return _CitedElement;
      }
      set
      {
        __isset.CitedElement = true;
        this._CitedElement = value;
      }
    }

    public TDDIAbstractSACMElement AbstractForm
    {
      get
      {
        return _AbstractForm;
      }
      set
      {
        __isset.AbstractForm = true;
        this._AbstractForm = value;
      }
    }

    public TDDIMultiLangString Content
    {
      get
      {
        return _Content;
      }
      set
      {
        __isset.Content = true;
        this._Content = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool Gid;
      public bool IsCitation;
      public bool IsAbstract;
      public bool CitedElement;
      public bool AbstractForm;
      public bool Content;
    }

    public TDDIImplementationConstraint() {
      this._Gid = "";
      this.__isset.Gid = true;
      this._IsCitation = false;
      this.__isset.IsCitation = true;
      this._IsAbstract = false;
      this.__isset.IsAbstract = true;
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
              if (field.Type == TType.String) {
                Gid = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Bool) {
                IsCitation = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.Bool) {
                IsAbstract = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.Struct) {
                CitedElement = new TDDIAbstractSACMElement();
                CitedElement.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.Struct) {
                AbstractForm = new TDDIAbstractSACMElement();
                AbstractForm.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.Struct) {
                Content = new TDDIMultiLangString();
                Content.Read(iprot);
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
        TStruct struc = new TStruct("TDDIImplementationConstraint");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (Gid != null && __isset.Gid) {
          field.Name = "Gid";
          field.Type = TType.String;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(Gid);
          oprot.WriteFieldEnd();
        }
        if (__isset.IsCitation) {
          field.Name = "IsCitation";
          field.Type = TType.Bool;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(IsCitation);
          oprot.WriteFieldEnd();
        }
        if (__isset.IsAbstract) {
          field.Name = "IsAbstract";
          field.Type = TType.Bool;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(IsAbstract);
          oprot.WriteFieldEnd();
        }
        if (CitedElement != null && __isset.CitedElement) {
          field.Name = "CitedElement";
          field.Type = TType.Struct;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          CitedElement.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (AbstractForm != null && __isset.AbstractForm) {
          field.Name = "AbstractForm";
          field.Type = TType.Struct;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          AbstractForm.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (Content != null && __isset.Content) {
          field.Name = "Content";
          field.Type = TType.Struct;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          Content.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIImplementationConstraint(");
      bool __first = true;
      if (Gid != null && __isset.Gid) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Gid: ");
        __sb.Append(Gid);
      }
      if (__isset.IsCitation) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("IsCitation: ");
        __sb.Append(IsCitation);
      }
      if (__isset.IsAbstract) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("IsAbstract: ");
        __sb.Append(IsAbstract);
      }
      if (CitedElement != null && __isset.CitedElement) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("CitedElement: ");
        __sb.Append(CitedElement);
      }
      if (AbstractForm != null && __isset.AbstractForm) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("AbstractForm: ");
        __sb.Append(AbstractForm);
      }
      if (Content != null && __isset.Content) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Content: ");
        __sb.Append(Content== null ? "<null>" : Content.ToString());
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
