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
  public partial class TDDIArgumentPackageInterface : TBase
  {
    private string _Gid;
    private bool _IsCitation;
    private bool _IsAbstract;
    private TDDIAbstractSACMElement _CitedElement;
    private TDDIAbstractSACMElement _AbstractForm;
    private TDDIAbstractLangString _Name;
    private TDDIDescription _Description;
    private List<TDDIImplementationConstraintRef> _ImplementationConstraint;
    private List<TDDINoteRef> _Note;
    private List<TDDITaggedValueRef> _TaggedValue;
    private List<TDDIAbstractArgumentationElementRef> _ArgumentationElement;
    private TDDIAbstractArgumentPackage _Implements;

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

    public TDDIAbstractLangString Name
    {
      get
      {
        return _Name;
      }
      set
      {
        __isset.Name = true;
        this._Name = value;
      }
    }

    public TDDIDescription Description
    {
      get
      {
        return _Description;
      }
      set
      {
        __isset.Description = true;
        this._Description = value;
      }
    }

    public List<TDDIImplementationConstraintRef> ImplementationConstraint
    {
      get
      {
        return _ImplementationConstraint;
      }
      set
      {
        __isset.ImplementationConstraint = true;
        this._ImplementationConstraint = value;
      }
    }

    public List<TDDINoteRef> Note
    {
      get
      {
        return _Note;
      }
      set
      {
        __isset.Note = true;
        this._Note = value;
      }
    }

    public List<TDDITaggedValueRef> TaggedValue
    {
      get
      {
        return _TaggedValue;
      }
      set
      {
        __isset.TaggedValue = true;
        this._TaggedValue = value;
      }
    }

    public List<TDDIAbstractArgumentationElementRef> ArgumentationElement
    {
      get
      {
        return _ArgumentationElement;
      }
      set
      {
        __isset.ArgumentationElement = true;
        this._ArgumentationElement = value;
      }
    }

    public TDDIAbstractArgumentPackage Implements
    {
      get
      {
        return _Implements;
      }
      set
      {
        __isset.Implements = true;
        this._Implements = value;
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
      public bool Name;
      public bool Description;
      public bool ImplementationConstraint;
      public bool Note;
      public bool TaggedValue;
      public bool ArgumentationElement;
      public bool Implements;
    }

    public TDDIArgumentPackageInterface() {
      this._Gid = "";
      this.__isset.Gid = true;
      this._IsCitation = false;
      this.__isset.IsCitation = true;
      this._IsAbstract = false;
      this.__isset.IsAbstract = true;
      this._ImplementationConstraint = new List<TDDIImplementationConstraintRef>();
      this.__isset.ImplementationConstraint = true;
      this._Note = new List<TDDINoteRef>();
      this.__isset.Note = true;
      this._TaggedValue = new List<TDDITaggedValueRef>();
      this.__isset.TaggedValue = true;
      this._ArgumentationElement = new List<TDDIAbstractArgumentationElementRef>();
      this.__isset.ArgumentationElement = true;
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
                Name = new TDDIAbstractLangString();
                Name.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.Struct) {
                Description = new TDDIDescription();
                Description.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 8:
              if (field.Type == TType.List) {
                {
                  ImplementationConstraint = new List<TDDIImplementationConstraintRef>();
                  TList _list764 = iprot.ReadListBegin();
                  for( int _i765 = 0; _i765 < _list764.Count; ++_i765)
                  {
                    TDDIImplementationConstraintRef _elem766;
                    _elem766 = new TDDIImplementationConstraintRef();
                    _elem766.Read(iprot);
                    ImplementationConstraint.Add(_elem766);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 9:
              if (field.Type == TType.List) {
                {
                  Note = new List<TDDINoteRef>();
                  TList _list767 = iprot.ReadListBegin();
                  for( int _i768 = 0; _i768 < _list767.Count; ++_i768)
                  {
                    TDDINoteRef _elem769;
                    _elem769 = new TDDINoteRef();
                    _elem769.Read(iprot);
                    Note.Add(_elem769);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 10:
              if (field.Type == TType.List) {
                {
                  TaggedValue = new List<TDDITaggedValueRef>();
                  TList _list770 = iprot.ReadListBegin();
                  for( int _i771 = 0; _i771 < _list770.Count; ++_i771)
                  {
                    TDDITaggedValueRef _elem772;
                    _elem772 = new TDDITaggedValueRef();
                    _elem772.Read(iprot);
                    TaggedValue.Add(_elem772);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 11:
              if (field.Type == TType.List) {
                {
                  ArgumentationElement = new List<TDDIAbstractArgumentationElementRef>();
                  TList _list773 = iprot.ReadListBegin();
                  for( int _i774 = 0; _i774 < _list773.Count; ++_i774)
                  {
                    TDDIAbstractArgumentationElementRef _elem775;
                    _elem775 = new TDDIAbstractArgumentationElementRef();
                    _elem775.Read(iprot);
                    ArgumentationElement.Add(_elem775);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 12:
              if (field.Type == TType.Struct) {
                Implements = new TDDIAbstractArgumentPackage();
                Implements.Read(iprot);
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
        TStruct struc = new TStruct("TDDIArgumentPackageInterface");
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
        if (Name != null && __isset.Name) {
          field.Name = "Name";
          field.Type = TType.Struct;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          Name.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (Description != null && __isset.Description) {
          field.Name = "Description";
          field.Type = TType.Struct;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          Description.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (ImplementationConstraint != null && __isset.ImplementationConstraint) {
          field.Name = "ImplementationConstraint";
          field.Type = TType.List;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, ImplementationConstraint.Count));
            foreach (TDDIImplementationConstraintRef _iter776 in ImplementationConstraint)
            {
              _iter776.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Note != null && __isset.Note) {
          field.Name = "Note";
          field.Type = TType.List;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Note.Count));
            foreach (TDDINoteRef _iter777 in Note)
            {
              _iter777.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (TaggedValue != null && __isset.TaggedValue) {
          field.Name = "TaggedValue";
          field.Type = TType.List;
          field.ID = 10;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, TaggedValue.Count));
            foreach (TDDITaggedValueRef _iter778 in TaggedValue)
            {
              _iter778.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (ArgumentationElement != null && __isset.ArgumentationElement) {
          field.Name = "ArgumentationElement";
          field.Type = TType.List;
          field.ID = 11;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, ArgumentationElement.Count));
            foreach (TDDIAbstractArgumentationElementRef _iter779 in ArgumentationElement)
            {
              _iter779.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Implements != null && __isset.Implements) {
          field.Name = "Implements";
          field.Type = TType.Struct;
          field.ID = 12;
          oprot.WriteFieldBegin(field);
          Implements.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIArgumentPackageInterface(");
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
      if (Name != null && __isset.Name) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Name: ");
        __sb.Append(Name);
      }
      if (Description != null && __isset.Description) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Description: ");
        __sb.Append(Description);
      }
      if (ImplementationConstraint != null && __isset.ImplementationConstraint) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ImplementationConstraint: ");
        __sb.Append(ImplementationConstraint);
      }
      if (Note != null && __isset.Note) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Note: ");
        __sb.Append(Note);
      }
      if (TaggedValue != null && __isset.TaggedValue) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("TaggedValue: ");
        __sb.Append(TaggedValue);
      }
      if (ArgumentationElement != null && __isset.ArgumentationElement) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ArgumentationElement: ");
        __sb.Append(ArgumentationElement);
      }
      if (Implements != null && __isset.Implements) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Implements: ");
        __sb.Append(Implements== null ? "<null>" : Implements.ToString());
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}