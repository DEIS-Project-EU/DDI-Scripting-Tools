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
  public partial class TDDIArtifactElementUnion : TBase
  {
    private TDDIAbstractTerminologyElement _TerminologyElement;
    private TDDIAbstractAssuranceCasePackage _AssuranceCasePackage;
    private TDDIAbstractArtifactPackage _ArtifactPackage;
    private TDDIArtifactGroup _ArtifactGroup;
    private TDDIAbstractArtifactAsset _ArtifactAsset;
    private TDDIAbstractArgumentationElement _ArgumentationElement;

    public TDDIAbstractTerminologyElement TerminologyElement
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

    public TDDIAbstractAssuranceCasePackage AssuranceCasePackage
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

    public TDDIAbstractArtifactPackage ArtifactPackage
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

    public TDDIArtifactGroup ArtifactGroup
    {
      get
      {
        return _ArtifactGroup;
      }
      set
      {
        __isset.ArtifactGroup = true;
        this._ArtifactGroup = value;
      }
    }

    public TDDIAbstractArtifactAsset ArtifactAsset
    {
      get
      {
        return _ArtifactAsset;
      }
      set
      {
        __isset.ArtifactAsset = true;
        this._ArtifactAsset = value;
      }
    }

    public TDDIAbstractArgumentationElement ArgumentationElement
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


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool TerminologyElement;
      public bool AssuranceCasePackage;
      public bool ArtifactPackage;
      public bool ArtifactGroup;
      public bool ArtifactAsset;
      public bool ArgumentationElement;
    }

    public TDDIArtifactElementUnion() {
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
                TerminologyElement = new TDDIAbstractTerminologyElement();
                TerminologyElement.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Struct) {
                AssuranceCasePackage = new TDDIAbstractAssuranceCasePackage();
                AssuranceCasePackage.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.Struct) {
                ArtifactPackage = new TDDIAbstractArtifactPackage();
                ArtifactPackage.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.Struct) {
                ArtifactGroup = new TDDIArtifactGroup();
                ArtifactGroup.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.Struct) {
                ArtifactAsset = new TDDIAbstractArtifactAsset();
                ArtifactAsset.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.Struct) {
                ArgumentationElement = new TDDIAbstractArgumentationElement();
                ArgumentationElement.Read(iprot);
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
        TStruct struc = new TStruct("TDDIArtifactElementUnion");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (TerminologyElement != null && __isset.TerminologyElement) {
          field.Name = "TerminologyElement";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          TerminologyElement.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (AssuranceCasePackage != null && __isset.AssuranceCasePackage) {
          field.Name = "AssuranceCasePackage";
          field.Type = TType.Struct;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          AssuranceCasePackage.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (ArtifactPackage != null && __isset.ArtifactPackage) {
          field.Name = "ArtifactPackage";
          field.Type = TType.Struct;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          ArtifactPackage.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (ArtifactGroup != null && __isset.ArtifactGroup) {
          field.Name = "ArtifactGroup";
          field.Type = TType.Struct;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          ArtifactGroup.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (ArtifactAsset != null && __isset.ArtifactAsset) {
          field.Name = "ArtifactAsset";
          field.Type = TType.Struct;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          ArtifactAsset.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (ArgumentationElement != null && __isset.ArgumentationElement) {
          field.Name = "ArgumentationElement";
          field.Type = TType.Struct;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          ArgumentationElement.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIArtifactElementUnion(");
      bool __first = true;
      if (TerminologyElement != null && __isset.TerminologyElement) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("TerminologyElement: ");
        __sb.Append(TerminologyElement);
      }
      if (AssuranceCasePackage != null && __isset.AssuranceCasePackage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("AssuranceCasePackage: ");
        __sb.Append(AssuranceCasePackage== null ? "<null>" : AssuranceCasePackage.ToString());
      }
      if (ArtifactPackage != null && __isset.ArtifactPackage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ArtifactPackage: ");
        __sb.Append(ArtifactPackage== null ? "<null>" : ArtifactPackage.ToString());
      }
      if (ArtifactGroup != null && __isset.ArtifactGroup) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ArtifactGroup: ");
        __sb.Append(ArtifactGroup== null ? "<null>" : ArtifactGroup.ToString());
      }
      if (ArtifactAsset != null && __isset.ArtifactAsset) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ArtifactAsset: ");
        __sb.Append(ArtifactAsset== null ? "<null>" : ArtifactAsset.ToString());
      }
      if (ArgumentationElement != null && __isset.ArgumentationElement) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ArgumentationElement: ");
        __sb.Append(ArgumentationElement== null ? "<null>" : ArgumentationElement.ToString());
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
