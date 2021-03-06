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
  public partial class TDDIODEPackage : TBase
  {
    private long _Id;
    private string _Name;
    private string _Description;
    private bool _IsCitation;
    private bool _IsAbstract;
    private List<TDDIKeyValueMapRef> _KeyValueMaps;
    private TDDIAbstractBaseElement _CitedElement;
    private List<TDDIAbstractODEPackageRef> _ODEPackages;
    private List<TDDIAbstractArchitecturePackageRef> _ArchitecturePackages;
    private List<TDDIAbstractDependabilityPackageRef> _DependabilityPackages;
    private List<TDDIAbstractFailureLogicPackageRef> _FailureLogicPackages;
    private List<TDDIAbstractAssuranceCasePackageRef> _AssuranceCasePackages;

    public long Id
    {
      get
      {
        return _Id;
      }
      set
      {
        __isset.Id = true;
        this._Id = value;
      }
    }

    public string Name
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

    public string Description
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

    public List<TDDIKeyValueMapRef> KeyValueMaps
    {
      get
      {
        return _KeyValueMaps;
      }
      set
      {
        __isset.KeyValueMaps = true;
        this._KeyValueMaps = value;
      }
    }

    public TDDIAbstractBaseElement CitedElement
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

    public List<TDDIAbstractODEPackageRef> ODEPackages
    {
      get
      {
        return _ODEPackages;
      }
      set
      {
        __isset.ODEPackages = true;
        this._ODEPackages = value;
      }
    }

    public List<TDDIAbstractArchitecturePackageRef> ArchitecturePackages
    {
      get
      {
        return _ArchitecturePackages;
      }
      set
      {
        __isset.ArchitecturePackages = true;
        this._ArchitecturePackages = value;
      }
    }

    public List<TDDIAbstractDependabilityPackageRef> DependabilityPackages
    {
      get
      {
        return _DependabilityPackages;
      }
      set
      {
        __isset.DependabilityPackages = true;
        this._DependabilityPackages = value;
      }
    }

    public List<TDDIAbstractFailureLogicPackageRef> FailureLogicPackages
    {
      get
      {
        return _FailureLogicPackages;
      }
      set
      {
        __isset.FailureLogicPackages = true;
        this._FailureLogicPackages = value;
      }
    }

    public List<TDDIAbstractAssuranceCasePackageRef> AssuranceCasePackages
    {
      get
      {
        return _AssuranceCasePackages;
      }
      set
      {
        __isset.AssuranceCasePackages = true;
        this._AssuranceCasePackages = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool Id;
      public bool Name;
      public bool Description;
      public bool IsCitation;
      public bool IsAbstract;
      public bool KeyValueMaps;
      public bool CitedElement;
      public bool ODEPackages;
      public bool ArchitecturePackages;
      public bool DependabilityPackages;
      public bool FailureLogicPackages;
      public bool AssuranceCasePackages;
    }

    public TDDIODEPackage() {
      this._Name = "";
      this.__isset.Name = true;
      this._Description = "";
      this.__isset.Description = true;
      this._IsCitation = false;
      this.__isset.IsCitation = true;
      this._IsAbstract = false;
      this.__isset.IsAbstract = true;
      this._KeyValueMaps = new List<TDDIKeyValueMapRef>();
      this.__isset.KeyValueMaps = true;
      this._ODEPackages = new List<TDDIAbstractODEPackageRef>();
      this.__isset.ODEPackages = true;
      this._ArchitecturePackages = new List<TDDIAbstractArchitecturePackageRef>();
      this.__isset.ArchitecturePackages = true;
      this._DependabilityPackages = new List<TDDIAbstractDependabilityPackageRef>();
      this.__isset.DependabilityPackages = true;
      this._FailureLogicPackages = new List<TDDIAbstractFailureLogicPackageRef>();
      this.__isset.FailureLogicPackages = true;
      this._AssuranceCasePackages = new List<TDDIAbstractAssuranceCasePackageRef>();
      this.__isset.AssuranceCasePackages = true;
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
              if (field.Type == TType.I64) {
                Id = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.String) {
                Name = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.String) {
                Description = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.Bool) {
                IsCitation = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.Bool) {
                IsAbstract = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.List) {
                {
                  KeyValueMaps = new List<TDDIKeyValueMapRef>();
                  TList _list736 = iprot.ReadListBegin();
                  for( int _i737 = 0; _i737 < _list736.Count; ++_i737)
                  {
                    TDDIKeyValueMapRef _elem738;
                    _elem738 = new TDDIKeyValueMapRef();
                    _elem738.Read(iprot);
                    KeyValueMaps.Add(_elem738);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.Struct) {
                CitedElement = new TDDIAbstractBaseElement();
                CitedElement.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 8:
              if (field.Type == TType.List) {
                {
                  ODEPackages = new List<TDDIAbstractODEPackageRef>();
                  TList _list739 = iprot.ReadListBegin();
                  for( int _i740 = 0; _i740 < _list739.Count; ++_i740)
                  {
                    TDDIAbstractODEPackageRef _elem741;
                    _elem741 = new TDDIAbstractODEPackageRef();
                    _elem741.Read(iprot);
                    ODEPackages.Add(_elem741);
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
                  ArchitecturePackages = new List<TDDIAbstractArchitecturePackageRef>();
                  TList _list742 = iprot.ReadListBegin();
                  for( int _i743 = 0; _i743 < _list742.Count; ++_i743)
                  {
                    TDDIAbstractArchitecturePackageRef _elem744;
                    _elem744 = new TDDIAbstractArchitecturePackageRef();
                    _elem744.Read(iprot);
                    ArchitecturePackages.Add(_elem744);
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
                  DependabilityPackages = new List<TDDIAbstractDependabilityPackageRef>();
                  TList _list745 = iprot.ReadListBegin();
                  for( int _i746 = 0; _i746 < _list745.Count; ++_i746)
                  {
                    TDDIAbstractDependabilityPackageRef _elem747;
                    _elem747 = new TDDIAbstractDependabilityPackageRef();
                    _elem747.Read(iprot);
                    DependabilityPackages.Add(_elem747);
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
                  FailureLogicPackages = new List<TDDIAbstractFailureLogicPackageRef>();
                  TList _list748 = iprot.ReadListBegin();
                  for( int _i749 = 0; _i749 < _list748.Count; ++_i749)
                  {
                    TDDIAbstractFailureLogicPackageRef _elem750;
                    _elem750 = new TDDIAbstractFailureLogicPackageRef();
                    _elem750.Read(iprot);
                    FailureLogicPackages.Add(_elem750);
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
                  AssuranceCasePackages = new List<TDDIAbstractAssuranceCasePackageRef>();
                  TList _list751 = iprot.ReadListBegin();
                  for( int _i752 = 0; _i752 < _list751.Count; ++_i752)
                  {
                    TDDIAbstractAssuranceCasePackageRef _elem753;
                    _elem753 = new TDDIAbstractAssuranceCasePackageRef();
                    _elem753.Read(iprot);
                    AssuranceCasePackages.Add(_elem753);
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
        TStruct struc = new TStruct("TDDIODEPackage");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (__isset.Id) {
          field.Name = "Id";
          field.Type = TType.I64;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(Id);
          oprot.WriteFieldEnd();
        }
        if (Name != null && __isset.Name) {
          field.Name = "Name";
          field.Type = TType.String;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(Name);
          oprot.WriteFieldEnd();
        }
        if (Description != null && __isset.Description) {
          field.Name = "Description";
          field.Type = TType.String;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(Description);
          oprot.WriteFieldEnd();
        }
        if (__isset.IsCitation) {
          field.Name = "IsCitation";
          field.Type = TType.Bool;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(IsCitation);
          oprot.WriteFieldEnd();
        }
        if (__isset.IsAbstract) {
          field.Name = "IsAbstract";
          field.Type = TType.Bool;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(IsAbstract);
          oprot.WriteFieldEnd();
        }
        if (KeyValueMaps != null && __isset.KeyValueMaps) {
          field.Name = "KeyValueMaps";
          field.Type = TType.List;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, KeyValueMaps.Count));
            foreach (TDDIKeyValueMapRef _iter754 in KeyValueMaps)
            {
              _iter754.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (CitedElement != null && __isset.CitedElement) {
          field.Name = "CitedElement";
          field.Type = TType.Struct;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          CitedElement.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (ODEPackages != null && __isset.ODEPackages) {
          field.Name = "ODEPackages";
          field.Type = TType.List;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, ODEPackages.Count));
            foreach (TDDIAbstractODEPackageRef _iter755 in ODEPackages)
            {
              _iter755.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (ArchitecturePackages != null && __isset.ArchitecturePackages) {
          field.Name = "ArchitecturePackages";
          field.Type = TType.List;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, ArchitecturePackages.Count));
            foreach (TDDIAbstractArchitecturePackageRef _iter756 in ArchitecturePackages)
            {
              _iter756.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (DependabilityPackages != null && __isset.DependabilityPackages) {
          field.Name = "DependabilityPackages";
          field.Type = TType.List;
          field.ID = 10;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, DependabilityPackages.Count));
            foreach (TDDIAbstractDependabilityPackageRef _iter757 in DependabilityPackages)
            {
              _iter757.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (FailureLogicPackages != null && __isset.FailureLogicPackages) {
          field.Name = "FailureLogicPackages";
          field.Type = TType.List;
          field.ID = 11;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, FailureLogicPackages.Count));
            foreach (TDDIAbstractFailureLogicPackageRef _iter758 in FailureLogicPackages)
            {
              _iter758.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (AssuranceCasePackages != null && __isset.AssuranceCasePackages) {
          field.Name = "AssuranceCasePackages";
          field.Type = TType.List;
          field.ID = 12;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, AssuranceCasePackages.Count));
            foreach (TDDIAbstractAssuranceCasePackageRef _iter759 in AssuranceCasePackages)
            {
              _iter759.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIODEPackage(");
      bool __first = true;
      if (__isset.Id) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Id: ");
        __sb.Append(Id);
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
      if (KeyValueMaps != null && __isset.KeyValueMaps) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("KeyValueMaps: ");
        __sb.Append(KeyValueMaps);
      }
      if (CitedElement != null && __isset.CitedElement) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("CitedElement: ");
        __sb.Append(CitedElement== null ? "<null>" : CitedElement.ToString());
      }
      if (ODEPackages != null && __isset.ODEPackages) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ODEPackages: ");
        __sb.Append(ODEPackages);
      }
      if (ArchitecturePackages != null && __isset.ArchitecturePackages) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ArchitecturePackages: ");
        __sb.Append(ArchitecturePackages);
      }
      if (DependabilityPackages != null && __isset.DependabilityPackages) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("DependabilityPackages: ");
        __sb.Append(DependabilityPackages);
      }
      if (FailureLogicPackages != null && __isset.FailureLogicPackages) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FailureLogicPackages: ");
        __sb.Append(FailureLogicPackages);
      }
      if (AssuranceCasePackages != null && __isset.AssuranceCasePackages) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("AssuranceCasePackages: ");
        __sb.Append(AssuranceCasePackages);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
