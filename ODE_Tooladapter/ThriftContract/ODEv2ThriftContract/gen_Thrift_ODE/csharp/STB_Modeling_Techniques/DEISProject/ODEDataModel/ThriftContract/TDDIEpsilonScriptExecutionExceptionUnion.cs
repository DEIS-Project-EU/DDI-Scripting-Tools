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
  public partial class TDDIEpsilonScriptExecutionExceptionUnion : TBase
  {
    private TDDIValidationFailedException _ValidationFailedException;
    private TDDIEpsilonScriptExecutionException _EpsilonScriptExecutionException;

    public TDDIValidationFailedException ValidationFailedException
    {
      get
      {
        return _ValidationFailedException;
      }
      set
      {
        __isset.ValidationFailedException = true;
        this._ValidationFailedException = value;
      }
    }

    public TDDIEpsilonScriptExecutionException EpsilonScriptExecutionException
    {
      get
      {
        return _EpsilonScriptExecutionException;
      }
      set
      {
        __isset.EpsilonScriptExecutionException = true;
        this._EpsilonScriptExecutionException = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool ValidationFailedException;
      public bool EpsilonScriptExecutionException;
    }

    public TDDIEpsilonScriptExecutionExceptionUnion() {
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
                ValidationFailedException = new TDDIValidationFailedException();
                ValidationFailedException.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Struct) {
                EpsilonScriptExecutionException = new TDDIEpsilonScriptExecutionException();
                EpsilonScriptExecutionException.Read(iprot);
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
        TStruct struc = new TStruct("TDDIEpsilonScriptExecutionExceptionUnion");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (ValidationFailedException != null && __isset.ValidationFailedException) {
          field.Name = "ValidationFailedException";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          ValidationFailedException.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (EpsilonScriptExecutionException != null && __isset.EpsilonScriptExecutionException) {
          field.Name = "EpsilonScriptExecutionException";
          field.Type = TType.Struct;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          EpsilonScriptExecutionException.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIEpsilonScriptExecutionExceptionUnion(");
      bool __first = true;
      if (ValidationFailedException != null && __isset.ValidationFailedException) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ValidationFailedException: ");
        __sb.Append(ValidationFailedException);
      }
      if (EpsilonScriptExecutionException != null && __isset.EpsilonScriptExecutionException) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("EpsilonScriptExecutionException: ");
        __sb.Append(EpsilonScriptExecutionException);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}