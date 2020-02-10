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
  public partial class TDDIArchitecturePackageBinding : TBase
  {
    private long _Id;
    private string _Name;
    private string _Description;
    private bool _IsCitation;
    private bool _IsAbstract;
    private List<TDDIKeyValueMapRef> _KeyValueMaps;
    private TDDIAbstractBaseElement _CitedElement;
    private List<TDDIAbstractDependabilityRequirementRef> _DependabilityRequirements;
    private TDDIAssuranceLevel _AssuranceLevel;
    private List<TDDIAbstractDesignArtifactRef> _DesignArtifacts;
    private List<TDDIAbstractArchitecturePackageRef> _ParticipantPackages;

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

    public List<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements
    {
      get
      {
        return _DependabilityRequirements;
      }
      set
      {
        __isset.DependabilityRequirements = true;
        this._DependabilityRequirements = value;
      }
    }

    public TDDIAssuranceLevel AssuranceLevel
    {
      get
      {
        return _AssuranceLevel;
      }
      set
      {
        __isset.AssuranceLevel = true;
        this._AssuranceLevel = value;
      }
    }

    public List<TDDIAbstractDesignArtifactRef> DesignArtifacts
    {
      get
      {
        return _DesignArtifacts;
      }
      set
      {
        __isset.DesignArtifacts = true;
        this._DesignArtifacts = value;
      }
    }

    public List<TDDIAbstractArchitecturePackageRef> ParticipantPackages
    {
      get
      {
        return _ParticipantPackages;
      }
      set
      {
        __isset.ParticipantPackages = true;
        this._ParticipantPackages = value;
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
      public bool DependabilityRequirements;
      public bool AssuranceLevel;
      public bool DesignArtifacts;
      public bool ParticipantPackages;
    }

    public TDDIArchitecturePackageBinding() {
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
      this._DependabilityRequirements = new List<TDDIAbstractDependabilityRequirementRef>();
      this.__isset.DependabilityRequirements = true;
      this._DesignArtifacts = new List<TDDIAbstractDesignArtifactRef>();
      this.__isset.DesignArtifacts = true;
      this._ParticipantPackages = new List<TDDIAbstractArchitecturePackageRef>();
      this.__isset.ParticipantPackages = true;
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
                  TList _list24 = iprot.ReadListBegin();
                  for( int _i25 = 0; _i25 < _list24.Count; ++_i25)
                  {
                    TDDIKeyValueMapRef _elem26;
                    _elem26 = new TDDIKeyValueMapRef();
                    _elem26.Read(iprot);
                    KeyValueMaps.Add(_elem26);
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
                  DependabilityRequirements = new List<TDDIAbstractDependabilityRequirementRef>();
                  TList _list27 = iprot.ReadListBegin();
                  for( int _i28 = 0; _i28 < _list27.Count; ++_i28)
                  {
                    TDDIAbstractDependabilityRequirementRef _elem29;
                    _elem29 = new TDDIAbstractDependabilityRequirementRef();
                    _elem29.Read(iprot);
                    DependabilityRequirements.Add(_elem29);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 9:
              if (field.Type == TType.Struct) {
                AssuranceLevel = new TDDIAssuranceLevel();
                AssuranceLevel.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 10:
              if (field.Type == TType.List) {
                {
                  DesignArtifacts = new List<TDDIAbstractDesignArtifactRef>();
                  TList _list30 = iprot.ReadListBegin();
                  for( int _i31 = 0; _i31 < _list30.Count; ++_i31)
                  {
                    TDDIAbstractDesignArtifactRef _elem32;
                    _elem32 = new TDDIAbstractDesignArtifactRef();
                    _elem32.Read(iprot);
                    DesignArtifacts.Add(_elem32);
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
                  ParticipantPackages = new List<TDDIAbstractArchitecturePackageRef>();
                  TList _list33 = iprot.ReadListBegin();
                  for( int _i34 = 0; _i34 < _list33.Count; ++_i34)
                  {
                    TDDIAbstractArchitecturePackageRef _elem35;
                    _elem35 = new TDDIAbstractArchitecturePackageRef();
                    _elem35.Read(iprot);
                    ParticipantPackages.Add(_elem35);
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
        TStruct struc = new TStruct("TDDIArchitecturePackageBinding");
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
            foreach (TDDIKeyValueMapRef _iter36 in KeyValueMaps)
            {
              _iter36.Write(oprot);
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
        if (DependabilityRequirements != null && __isset.DependabilityRequirements) {
          field.Name = "DependabilityRequirements";
          field.Type = TType.List;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, DependabilityRequirements.Count));
            foreach (TDDIAbstractDependabilityRequirementRef _iter37 in DependabilityRequirements)
            {
              _iter37.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (AssuranceLevel != null && __isset.AssuranceLevel) {
          field.Name = "AssuranceLevel";
          field.Type = TType.Struct;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          AssuranceLevel.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (DesignArtifacts != null && __isset.DesignArtifacts) {
          field.Name = "DesignArtifacts";
          field.Type = TType.List;
          field.ID = 10;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, DesignArtifacts.Count));
            foreach (TDDIAbstractDesignArtifactRef _iter38 in DesignArtifacts)
            {
              _iter38.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (ParticipantPackages != null && __isset.ParticipantPackages) {
          field.Name = "ParticipantPackages";
          field.Type = TType.List;
          field.ID = 11;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, ParticipantPackages.Count));
            foreach (TDDIAbstractArchitecturePackageRef _iter39 in ParticipantPackages)
            {
              _iter39.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIArchitecturePackageBinding(");
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
        __sb.Append(CitedElement);
      }
      if (DependabilityRequirements != null && __isset.DependabilityRequirements) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("DependabilityRequirements: ");
        __sb.Append(DependabilityRequirements);
      }
      if (AssuranceLevel != null && __isset.AssuranceLevel) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("AssuranceLevel: ");
        __sb.Append(AssuranceLevel);
      }
      if (DesignArtifacts != null && __isset.DesignArtifacts) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("DesignArtifacts: ");
        __sb.Append(DesignArtifacts);
      }
      if (ParticipantPackages != null && __isset.ParticipantPackages) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ParticipantPackages: ");
        __sb.Append(ParticipantPackages);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
