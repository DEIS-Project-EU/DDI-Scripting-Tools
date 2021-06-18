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
  public partial class TDDIRequirementArtifactUnion : TBase
  {
    private TDDIAbstractRequirementPackage _RequirementPackage;
    private TDDIAbstractRequirementSource _RequirementSource;
    private TDDIAbstractDependabilityRequirement _DependabilityRequirement;

    public TDDIAbstractRequirementPackage RequirementPackage
    {
      get
      {
        return _RequirementPackage;
      }
      set
      {
        __isset.RequirementPackage = true;
        this._RequirementPackage = value;
      }
    }

    public TDDIAbstractRequirementSource RequirementSource
    {
      get
      {
        return _RequirementSource;
      }
      set
      {
        __isset.RequirementSource = true;
        this._RequirementSource = value;
      }
    }

    public TDDIAbstractDependabilityRequirement DependabilityRequirement
    {
      get
      {
        return _DependabilityRequirement;
      }
      set
      {
        __isset.DependabilityRequirement = true;
        this._DependabilityRequirement = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool RequirementPackage;
      public bool RequirementSource;
      public bool DependabilityRequirement;
    }

    public TDDIRequirementArtifactUnion() {
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
                RequirementPackage = new TDDIAbstractRequirementPackage();
                RequirementPackage.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Struct) {
                RequirementSource = new TDDIAbstractRequirementSource();
                RequirementSource.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.Struct) {
                DependabilityRequirement = new TDDIAbstractDependabilityRequirement();
                DependabilityRequirement.Read(iprot);
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
        TStruct struc = new TStruct("TDDIRequirementArtifactUnion");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (RequirementPackage != null && __isset.RequirementPackage) {
          field.Name = "RequirementPackage";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          RequirementPackage.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (RequirementSource != null && __isset.RequirementSource) {
          field.Name = "RequirementSource";
          field.Type = TType.Struct;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          RequirementSource.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (DependabilityRequirement != null && __isset.DependabilityRequirement) {
          field.Name = "DependabilityRequirement";
          field.Type = TType.Struct;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          DependabilityRequirement.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIRequirementArtifactUnion(");
      bool __first = true;
      if (RequirementPackage != null && __isset.RequirementPackage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("RequirementPackage: ");
        __sb.Append(RequirementPackage== null ? "<null>" : RequirementPackage.ToString());
      }
      if (RequirementSource != null && __isset.RequirementSource) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("RequirementSource: ");
        __sb.Append(RequirementSource== null ? "<null>" : RequirementSource.ToString());
      }
      if (DependabilityRequirement != null && __isset.DependabilityRequirement) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("DependabilityRequirement: ");
        __sb.Append(DependabilityRequirement== null ? "<null>" : DependabilityRequirement.ToString());
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}