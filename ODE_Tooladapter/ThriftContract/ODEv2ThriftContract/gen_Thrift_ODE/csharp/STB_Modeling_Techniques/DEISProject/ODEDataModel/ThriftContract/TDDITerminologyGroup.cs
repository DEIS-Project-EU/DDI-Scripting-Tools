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
  public partial class TDDITerminologyGroup : TBase
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
    private List<TDDIAbstractTerminologyElement> _TerminologyElement;

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

    public List<TDDIAbstractTerminologyElement> TerminologyElement
    {
      get
      {
        return _TerminologyElement;
      }
      set
      {
        __isset.TerminologyElement = true;
        this._TerminologyElement = value;
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
      public bool TerminologyElement;
    }

    public TDDITerminologyGroup() {
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
      this._TerminologyElement = new List<TDDIAbstractTerminologyElement>();
      this.__isset.TerminologyElement = true;
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
                  TList _list1256 = iprot.ReadListBegin();
                  for( int _i1257 = 0; _i1257 < _list1256.Count; ++_i1257)
                  {
                    TDDIImplementationConstraintRef _elem1258;
                    _elem1258 = new TDDIImplementationConstraintRef();
                    _elem1258.Read(iprot);
                    ImplementationConstraint.Add(_elem1258);
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
                  TList _list1259 = iprot.ReadListBegin();
                  for( int _i1260 = 0; _i1260 < _list1259.Count; ++_i1260)
                  {
                    TDDINoteRef _elem1261;
                    _elem1261 = new TDDINoteRef();
                    _elem1261.Read(iprot);
                    Note.Add(_elem1261);
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
                  TList _list1262 = iprot.ReadListBegin();
                  for( int _i1263 = 0; _i1263 < _list1262.Count; ++_i1263)
                  {
                    TDDITaggedValueRef _elem1264;
                    _elem1264 = new TDDITaggedValueRef();
                    _elem1264.Read(iprot);
                    TaggedValue.Add(_elem1264);
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
                  TerminologyElement = new List<TDDIAbstractTerminologyElement>();
                  TList _list1265 = iprot.ReadListBegin();
                  for( int _i1266 = 0; _i1266 < _list1265.Count; ++_i1266)
                  {
                    TDDIAbstractTerminologyElement _elem1267;
                    _elem1267 = new TDDIAbstractTerminologyElement();
                    _elem1267.Read(iprot);
                    TerminologyElement.Add(_elem1267);
                  }
                  iprot.ReadListEnd();
                }
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
        TStruct struc = new TStruct("TDDITerminologyGroup");
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
            foreach (TDDIImplementationConstraintRef _iter1268 in ImplementationConstraint)
            {
              _iter1268.Write(oprot);
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
            foreach (TDDINoteRef _iter1269 in Note)
            {
              _iter1269.Write(oprot);
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
            foreach (TDDITaggedValueRef _iter1270 in TaggedValue)
            {
              _iter1270.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (TerminologyElement != null && __isset.TerminologyElement) {
          field.Name = "TerminologyElement";
          field.Type = TType.List;
          field.ID = 11;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, TerminologyElement.Count));
            foreach (TDDIAbstractTerminologyElement _iter1271 in TerminologyElement)
            {
              _iter1271.Write(oprot);
            }
            oprot.WriteListEnd();
          }
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
      StringBuilder __sb = new StringBuilder("TDDITerminologyGroup(");
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
        __sb.Append(CitedElement== null ? "<null>" : CitedElement.ToString());
      }
      if (AbstractForm != null && __isset.AbstractForm) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("AbstractForm: ");
        __sb.Append(AbstractForm== null ? "<null>" : AbstractForm.ToString());
      }
      if (Name != null && __isset.Name) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Name: ");
        __sb.Append(Name== null ? "<null>" : Name.ToString());
      }
      if (Description != null && __isset.Description) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Description: ");
        __sb.Append(Description== null ? "<null>" : Description.ToString());
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
      if (TerminologyElement != null && __isset.TerminologyElement) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("TerminologyElement: ");
        __sb.Append(TerminologyElement);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
