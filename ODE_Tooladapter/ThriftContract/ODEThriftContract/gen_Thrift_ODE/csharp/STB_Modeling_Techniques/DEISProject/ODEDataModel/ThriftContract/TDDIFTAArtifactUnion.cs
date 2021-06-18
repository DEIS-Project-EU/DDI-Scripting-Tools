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
  public partial class TDDIFTAArtifactUnion : TBase
  {
    private TDDIInputEvent _InputEvent;
    private TDDIOutputEvent _OutputEvent;
    private TDDIGate _Gate;
    private TDDIFTAPropagation _FTAPropagation;

    public TDDIInputEvent InputEvent
    {
      get
      {
        return _InputEvent;
      }
      set
      {
        __isset.InputEvent = true;
        this._InputEvent = value;
      }
    }

    public TDDIOutputEvent OutputEvent
    {
      get
      {
        return _OutputEvent;
      }
      set
      {
        __isset.OutputEvent = true;
        this._OutputEvent = value;
      }
    }

    public TDDIGate Gate
    {
      get
      {
        return _Gate;
      }
      set
      {
        __isset.Gate = true;
        this._Gate = value;
      }
    }

    public TDDIFTAPropagation FTAPropagation
    {
      get
      {
        return _FTAPropagation;
      }
      set
      {
        __isset.FTAPropagation = true;
        this._FTAPropagation = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool InputEvent;
      public bool OutputEvent;
      public bool Gate;
      public bool FTAPropagation;
    }

    public TDDIFTAArtifactUnion() {
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
                InputEvent = new TDDIInputEvent();
                InputEvent.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Struct) {
                OutputEvent = new TDDIOutputEvent();
                OutputEvent.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.Struct) {
                Gate = new TDDIGate();
                Gate.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.Struct) {
                FTAPropagation = new TDDIFTAPropagation();
                FTAPropagation.Read(iprot);
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
        TStruct struc = new TStruct("TDDIFTAArtifactUnion");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (InputEvent != null && __isset.InputEvent) {
          field.Name = "InputEvent";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          InputEvent.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (OutputEvent != null && __isset.OutputEvent) {
          field.Name = "OutputEvent";
          field.Type = TType.Struct;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          OutputEvent.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (Gate != null && __isset.Gate) {
          field.Name = "Gate";
          field.Type = TType.Struct;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          Gate.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (FTAPropagation != null && __isset.FTAPropagation) {
          field.Name = "FTAPropagation";
          field.Type = TType.Struct;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          FTAPropagation.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIFTAArtifactUnion(");
      bool __first = true;
      if (InputEvent != null && __isset.InputEvent) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("InputEvent: ");
        __sb.Append(InputEvent== null ? "<null>" : InputEvent.ToString());
      }
      if (OutputEvent != null && __isset.OutputEvent) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("OutputEvent: ");
        __sb.Append(OutputEvent== null ? "<null>" : OutputEvent.ToString());
      }
      if (Gate != null && __isset.Gate) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Gate: ");
        __sb.Append(Gate== null ? "<null>" : Gate.ToString());
      }
      if (FTAPropagation != null && __isset.FTAPropagation) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FTAPropagation: ");
        __sb.Append(FTAPropagation== null ? "<null>" : FTAPropagation.ToString());
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}