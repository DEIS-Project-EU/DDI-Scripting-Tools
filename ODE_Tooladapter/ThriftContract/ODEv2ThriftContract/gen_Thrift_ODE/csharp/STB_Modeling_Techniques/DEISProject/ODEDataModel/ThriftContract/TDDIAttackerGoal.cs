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
  public partial class TDDIAttackerGoal : TBase
  {
    private long _Id;
    private string _Name;
    private string _Description;
    private List<TDDIKeyValueMap> _KeyValueMaps;
    private string _Category;
    private List<TDDIAbstractAttack> _Attacks;
    private List<TDDISecurityCapability> _AddressedBy;
    private List<TDDIVulnerableItemRef> _AttackedItems;

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

    public List<TDDIKeyValueMap> KeyValueMaps
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

    public string Category
    {
      get
      {
        return _Category;
      }
      set
      {
        __isset.Category = true;
        this._Category = value;
      }
    }

    public List<TDDIAbstractAttack> Attacks
    {
      get
      {
        return _Attacks;
      }
      set
      {
        __isset.Attacks = true;
        this._Attacks = value;
      }
    }

    public List<TDDISecurityCapability> AddressedBy
    {
      get
      {
        return _AddressedBy;
      }
      set
      {
        __isset.AddressedBy = true;
        this._AddressedBy = value;
      }
    }

    public List<TDDIVulnerableItemRef> AttackedItems
    {
      get
      {
        return _AttackedItems;
      }
      set
      {
        __isset.AttackedItems = true;
        this._AttackedItems = value;
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
      public bool KeyValueMaps;
      public bool Category;
      public bool Attacks;
      public bool AddressedBy;
      public bool AttackedItems;
    }

    public TDDIAttackerGoal() {
      this._Name = "";
      this.__isset.Name = true;
      this._Description = "";
      this.__isset.Description = true;
      this._KeyValueMaps = new List<TDDIKeyValueMap>();
      this.__isset.KeyValueMaps = true;
      this._Category = "";
      this.__isset.Category = true;
      this._Attacks = new List<TDDIAbstractAttack>();
      this.__isset.Attacks = true;
      this._AddressedBy = new List<TDDISecurityCapability>();
      this.__isset.AddressedBy = true;
      this._AttackedItems = new List<TDDIVulnerableItemRef>();
      this.__isset.AttackedItems = true;
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
              if (field.Type == TType.List) {
                {
                  KeyValueMaps = new List<TDDIKeyValueMap>();
                  TList _list1464 = iprot.ReadListBegin();
                  for( int _i1465 = 0; _i1465 < _list1464.Count; ++_i1465)
                  {
                    TDDIKeyValueMap _elem1466;
                    _elem1466 = new TDDIKeyValueMap();
                    _elem1466.Read(iprot);
                    KeyValueMaps.Add(_elem1466);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.String) {
                Category = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.List) {
                {
                  Attacks = new List<TDDIAbstractAttack>();
                  TList _list1467 = iprot.ReadListBegin();
                  for( int _i1468 = 0; _i1468 < _list1467.Count; ++_i1468)
                  {
                    TDDIAbstractAttack _elem1469;
                    _elem1469 = new TDDIAbstractAttack();
                    _elem1469.Read(iprot);
                    Attacks.Add(_elem1469);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.List) {
                {
                  AddressedBy = new List<TDDISecurityCapability>();
                  TList _list1470 = iprot.ReadListBegin();
                  for( int _i1471 = 0; _i1471 < _list1470.Count; ++_i1471)
                  {
                    TDDISecurityCapability _elem1472;
                    _elem1472 = new TDDISecurityCapability();
                    _elem1472.Read(iprot);
                    AddressedBy.Add(_elem1472);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 8:
              if (field.Type == TType.List) {
                {
                  AttackedItems = new List<TDDIVulnerableItemRef>();
                  TList _list1473 = iprot.ReadListBegin();
                  for( int _i1474 = 0; _i1474 < _list1473.Count; ++_i1474)
                  {
                    TDDIVulnerableItemRef _elem1475;
                    _elem1475 = new TDDIVulnerableItemRef();
                    _elem1475.Read(iprot);
                    AttackedItems.Add(_elem1475);
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
        TStruct struc = new TStruct("TDDIAttackerGoal");
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
        if (KeyValueMaps != null && __isset.KeyValueMaps) {
          field.Name = "KeyValueMaps";
          field.Type = TType.List;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, KeyValueMaps.Count));
            foreach (TDDIKeyValueMap _iter1476 in KeyValueMaps)
            {
              _iter1476.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Category != null && __isset.Category) {
          field.Name = "Category";
          field.Type = TType.String;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(Category);
          oprot.WriteFieldEnd();
        }
        if (Attacks != null && __isset.Attacks) {
          field.Name = "Attacks";
          field.Type = TType.List;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Attacks.Count));
            foreach (TDDIAbstractAttack _iter1477 in Attacks)
            {
              _iter1477.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (AddressedBy != null && __isset.AddressedBy) {
          field.Name = "AddressedBy";
          field.Type = TType.List;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, AddressedBy.Count));
            foreach (TDDISecurityCapability _iter1478 in AddressedBy)
            {
              _iter1478.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (AttackedItems != null && __isset.AttackedItems) {
          field.Name = "AttackedItems";
          field.Type = TType.List;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, AttackedItems.Count));
            foreach (TDDIVulnerableItemRef _iter1479 in AttackedItems)
            {
              _iter1479.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIAttackerGoal(");
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
      if (KeyValueMaps != null && __isset.KeyValueMaps) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("KeyValueMaps: ");
        __sb.Append(KeyValueMaps);
      }
      if (Category != null && __isset.Category) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Category: ");
        __sb.Append(Category);
      }
      if (Attacks != null && __isset.Attacks) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Attacks: ");
        __sb.Append(Attacks);
      }
      if (AddressedBy != null && __isset.AddressedBy) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("AddressedBy: ");
        __sb.Append(AddressedBy);
      }
      if (AttackedItems != null && __isset.AttackedItems) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("AttackedItems: ");
        __sb.Append(AttackedItems);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
