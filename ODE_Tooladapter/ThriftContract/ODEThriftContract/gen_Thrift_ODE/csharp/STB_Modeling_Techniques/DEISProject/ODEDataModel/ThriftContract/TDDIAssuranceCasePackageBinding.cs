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
  public partial class TDDIAssuranceCasePackageBinding : TBase
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
    private List<TDDIAbstractAssuranceCasePackageRef> _AssuranceCasePackage;
    private List<TDDIAssuranceCasePackageInterfaceRef> _Interface;
    private List<TDDIAbstractArtifactPackageRef> _ArtifactPackage;
    private List<TDDIAbstractArgumentPackageRef> _ArgumentPackage;
    private List<TDDIAbstractTerminologyPackageRef> _TerminologyPackage;
    private List<TDDIAbstractAssuranceCasePackageRef> _ParticipantPackage;

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

    public List<TDDIAbstractAssuranceCasePackageRef> AssuranceCasePackage
    {
      get
      {
        return _AssuranceCasePackage;
      }
      set
      {
        __isset.AssuranceCasePackage = true;
        this._AssuranceCasePackage = value;
      }
    }

    public List<TDDIAssuranceCasePackageInterfaceRef> Interface
    {
      get
      {
        return _Interface;
      }
      set
      {
        __isset.@Interface = true;
        this._Interface = value;
      }
    }

    public List<TDDIAbstractArtifactPackageRef> ArtifactPackage
    {
      get
      {
        return _ArtifactPackage;
      }
      set
      {
        __isset.ArtifactPackage = true;
        this._ArtifactPackage = value;
      }
    }

    public List<TDDIAbstractArgumentPackageRef> ArgumentPackage
    {
      get
      {
        return _ArgumentPackage;
      }
      set
      {
        __isset.ArgumentPackage = true;
        this._ArgumentPackage = value;
      }
    }

    public List<TDDIAbstractTerminologyPackageRef> TerminologyPackage
    {
      get
      {
        return _TerminologyPackage;
      }
      set
      {
        __isset.TerminologyPackage = true;
        this._TerminologyPackage = value;
      }
    }

    public List<TDDIAbstractAssuranceCasePackageRef> ParticipantPackage
    {
      get
      {
        return _ParticipantPackage;
      }
      set
      {
        __isset.ParticipantPackage = true;
        this._ParticipantPackage = value;
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
      public bool AssuranceCasePackage;
      public bool @Interface;
      public bool ArtifactPackage;
      public bool ArgumentPackage;
      public bool TerminologyPackage;
      public bool ParticipantPackage;
    }

    public TDDIAssuranceCasePackageBinding() {
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
      this._AssuranceCasePackage = new List<TDDIAbstractAssuranceCasePackageRef>();
      this.__isset.AssuranceCasePackage = true;
      this._Interface = new List<TDDIAssuranceCasePackageInterfaceRef>();
      this.__isset.@Interface = true;
      this._ArtifactPackage = new List<TDDIAbstractArtifactPackageRef>();
      this.__isset.ArtifactPackage = true;
      this._ArgumentPackage = new List<TDDIAbstractArgumentPackageRef>();
      this.__isset.ArgumentPackage = true;
      this._TerminologyPackage = new List<TDDIAbstractTerminologyPackageRef>();
      this.__isset.TerminologyPackage = true;
      this._ParticipantPackage = new List<TDDIAbstractAssuranceCasePackageRef>();
      this.__isset.ParticipantPackage = true;
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
                  TList _list1436 = iprot.ReadListBegin();
                  for( int _i1437 = 0; _i1437 < _list1436.Count; ++_i1437)
                  {
                    TDDIImplementationConstraintRef _elem1438;
                    _elem1438 = new TDDIImplementationConstraintRef();
                    _elem1438.Read(iprot);
                    ImplementationConstraint.Add(_elem1438);
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
                  TList _list1439 = iprot.ReadListBegin();
                  for( int _i1440 = 0; _i1440 < _list1439.Count; ++_i1440)
                  {
                    TDDINoteRef _elem1441;
                    _elem1441 = new TDDINoteRef();
                    _elem1441.Read(iprot);
                    Note.Add(_elem1441);
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
                  TList _list1442 = iprot.ReadListBegin();
                  for( int _i1443 = 0; _i1443 < _list1442.Count; ++_i1443)
                  {
                    TDDITaggedValueRef _elem1444;
                    _elem1444 = new TDDITaggedValueRef();
                    _elem1444.Read(iprot);
                    TaggedValue.Add(_elem1444);
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
                  AssuranceCasePackage = new List<TDDIAbstractAssuranceCasePackageRef>();
                  TList _list1445 = iprot.ReadListBegin();
                  for( int _i1446 = 0; _i1446 < _list1445.Count; ++_i1446)
                  {
                    TDDIAbstractAssuranceCasePackageRef _elem1447;
                    _elem1447 = new TDDIAbstractAssuranceCasePackageRef();
                    _elem1447.Read(iprot);
                    AssuranceCasePackage.Add(_elem1447);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 12:
              if (field.Type == TType.List) {
                {
                  Interface = new List<TDDIAssuranceCasePackageInterfaceRef>();
                  TList _list1448 = iprot.ReadListBegin();
                  for( int _i1449 = 0; _i1449 < _list1448.Count; ++_i1449)
                  {
                    TDDIAssuranceCasePackageInterfaceRef _elem1450;
                    _elem1450 = new TDDIAssuranceCasePackageInterfaceRef();
                    _elem1450.Read(iprot);
                    Interface.Add(_elem1450);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 13:
              if (field.Type == TType.List) {
                {
                  ArtifactPackage = new List<TDDIAbstractArtifactPackageRef>();
                  TList _list1451 = iprot.ReadListBegin();
                  for( int _i1452 = 0; _i1452 < _list1451.Count; ++_i1452)
                  {
                    TDDIAbstractArtifactPackageRef _elem1453;
                    _elem1453 = new TDDIAbstractArtifactPackageRef();
                    _elem1453.Read(iprot);
                    ArtifactPackage.Add(_elem1453);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 14:
              if (field.Type == TType.List) {
                {
                  ArgumentPackage = new List<TDDIAbstractArgumentPackageRef>();
                  TList _list1454 = iprot.ReadListBegin();
                  for( int _i1455 = 0; _i1455 < _list1454.Count; ++_i1455)
                  {
                    TDDIAbstractArgumentPackageRef _elem1456;
                    _elem1456 = new TDDIAbstractArgumentPackageRef();
                    _elem1456.Read(iprot);
                    ArgumentPackage.Add(_elem1456);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 15:
              if (field.Type == TType.List) {
                {
                  TerminologyPackage = new List<TDDIAbstractTerminologyPackageRef>();
                  TList _list1457 = iprot.ReadListBegin();
                  for( int _i1458 = 0; _i1458 < _list1457.Count; ++_i1458)
                  {
                    TDDIAbstractTerminologyPackageRef _elem1459;
                    _elem1459 = new TDDIAbstractTerminologyPackageRef();
                    _elem1459.Read(iprot);
                    TerminologyPackage.Add(_elem1459);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 16:
              if (field.Type == TType.List) {
                {
                  ParticipantPackage = new List<TDDIAbstractAssuranceCasePackageRef>();
                  TList _list1460 = iprot.ReadListBegin();
                  for( int _i1461 = 0; _i1461 < _list1460.Count; ++_i1461)
                  {
                    TDDIAbstractAssuranceCasePackageRef _elem1462;
                    _elem1462 = new TDDIAbstractAssuranceCasePackageRef();
                    _elem1462.Read(iprot);
                    ParticipantPackage.Add(_elem1462);
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
        TStruct struc = new TStruct("TDDIAssuranceCasePackageBinding");
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
            foreach (TDDIImplementationConstraintRef _iter1463 in ImplementationConstraint)
            {
              _iter1463.Write(oprot);
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
            foreach (TDDINoteRef _iter1464 in Note)
            {
              _iter1464.Write(oprot);
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
            foreach (TDDITaggedValueRef _iter1465 in TaggedValue)
            {
              _iter1465.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (AssuranceCasePackage != null && __isset.AssuranceCasePackage) {
          field.Name = "AssuranceCasePackage";
          field.Type = TType.List;
          field.ID = 11;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, AssuranceCasePackage.Count));
            foreach (TDDIAbstractAssuranceCasePackageRef _iter1466 in AssuranceCasePackage)
            {
              _iter1466.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Interface != null && __isset.@Interface) {
          field.Name = "Interface";
          field.Type = TType.List;
          field.ID = 12;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Interface.Count));
            foreach (TDDIAssuranceCasePackageInterfaceRef _iter1467 in Interface)
            {
              _iter1467.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (ArtifactPackage != null && __isset.ArtifactPackage) {
          field.Name = "ArtifactPackage";
          field.Type = TType.List;
          field.ID = 13;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, ArtifactPackage.Count));
            foreach (TDDIAbstractArtifactPackageRef _iter1468 in ArtifactPackage)
            {
              _iter1468.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (ArgumentPackage != null && __isset.ArgumentPackage) {
          field.Name = "ArgumentPackage";
          field.Type = TType.List;
          field.ID = 14;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, ArgumentPackage.Count));
            foreach (TDDIAbstractArgumentPackageRef _iter1469 in ArgumentPackage)
            {
              _iter1469.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (TerminologyPackage != null && __isset.TerminologyPackage) {
          field.Name = "TerminologyPackage";
          field.Type = TType.List;
          field.ID = 15;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, TerminologyPackage.Count));
            foreach (TDDIAbstractTerminologyPackageRef _iter1470 in TerminologyPackage)
            {
              _iter1470.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (ParticipantPackage != null && __isset.ParticipantPackage) {
          field.Name = "ParticipantPackage";
          field.Type = TType.List;
          field.ID = 16;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, ParticipantPackage.Count));
            foreach (TDDIAbstractAssuranceCasePackageRef _iter1471 in ParticipantPackage)
            {
              _iter1471.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIAssuranceCasePackageBinding(");
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
      if (AssuranceCasePackage != null && __isset.AssuranceCasePackage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("AssuranceCasePackage: ");
        __sb.Append(AssuranceCasePackage);
      }
      if (Interface != null && __isset.@Interface) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Interface: ");
        __sb.Append(Interface);
      }
      if (ArtifactPackage != null && __isset.ArtifactPackage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ArtifactPackage: ");
        __sb.Append(ArtifactPackage);
      }
      if (ArgumentPackage != null && __isset.ArgumentPackage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ArgumentPackage: ");
        __sb.Append(ArgumentPackage);
      }
      if (TerminologyPackage != null && __isset.TerminologyPackage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("TerminologyPackage: ");
        __sb.Append(TerminologyPackage);
      }
      if (ParticipantPackage != null && __isset.ParticipantPackage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ParticipantPackage: ");
        __sb.Append(ParticipantPackage);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
