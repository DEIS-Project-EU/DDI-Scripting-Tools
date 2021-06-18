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
  public partial class TDDIBaseElementUnion : TBase
  {
    private TDDIAbstractDesignArtifact _DesignArtifact;
    private TDDIAbstractODEPackage _ODEPackage;
    private TDDIAbstractFailureAnalysisArtifact _FailureAnalysisArtifact;
    private TDDIAbstractDependabilityArtifact _DependabilityArtifact;

    public TDDIAbstractDesignArtifact DesignArtifact
    {
      get
      {
        return _DesignArtifact;
      }
      set
      {
        __isset.DesignArtifact = true;
        this._DesignArtifact = value;
      }
    }

    public TDDIAbstractODEPackage ODEPackage
    {
      get
      {
        return _ODEPackage;
      }
      set
      {
        __isset.ODEPackage = true;
        this._ODEPackage = value;
      }
    }

    public TDDIAbstractFailureAnalysisArtifact FailureAnalysisArtifact
    {
      get
      {
        return _FailureAnalysisArtifact;
      }
      set
      {
        __isset.FailureAnalysisArtifact = true;
        this._FailureAnalysisArtifact = value;
      }
    }

    public TDDIAbstractDependabilityArtifact DependabilityArtifact
    {
      get
      {
        return _DependabilityArtifact;
      }
      set
      {
        __isset.DependabilityArtifact = true;
        this._DependabilityArtifact = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool DesignArtifact;
      public bool ODEPackage;
      public bool FailureAnalysisArtifact;
      public bool DependabilityArtifact;
    }

    public TDDIBaseElementUnion() {
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
                DesignArtifact = new TDDIAbstractDesignArtifact();
                DesignArtifact.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Struct) {
                ODEPackage = new TDDIAbstractODEPackage();
                ODEPackage.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.Struct) {
                FailureAnalysisArtifact = new TDDIAbstractFailureAnalysisArtifact();
                FailureAnalysisArtifact.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.Struct) {
                DependabilityArtifact = new TDDIAbstractDependabilityArtifact();
                DependabilityArtifact.Read(iprot);
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
        TStruct struc = new TStruct("TDDIBaseElementUnion");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (DesignArtifact != null && __isset.DesignArtifact) {
          field.Name = "DesignArtifact";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          DesignArtifact.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (ODEPackage != null && __isset.ODEPackage) {
          field.Name = "ODEPackage";
          field.Type = TType.Struct;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          ODEPackage.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (FailureAnalysisArtifact != null && __isset.FailureAnalysisArtifact) {
          field.Name = "FailureAnalysisArtifact";
          field.Type = TType.Struct;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          FailureAnalysisArtifact.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (DependabilityArtifact != null && __isset.DependabilityArtifact) {
          field.Name = "DependabilityArtifact";
          field.Type = TType.Struct;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          DependabilityArtifact.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIBaseElementUnion(");
      bool __first = true;
      if (DesignArtifact != null && __isset.DesignArtifact) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("DesignArtifact: ");
        __sb.Append(DesignArtifact== null ? "<null>" : DesignArtifact.ToString());
      }
      if (ODEPackage != null && __isset.ODEPackage) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ODEPackage: ");
        __sb.Append(ODEPackage);
      }
      if (FailureAnalysisArtifact != null && __isset.FailureAnalysisArtifact) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FailureAnalysisArtifact: ");
        __sb.Append(FailureAnalysisArtifact);
      }
      if (DependabilityArtifact != null && __isset.DependabilityArtifact) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("DependabilityArtifact: ");
        __sb.Append(DependabilityArtifact);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}