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
  public partial class TDDIValidationResult : TBase
  {
    private bool _ValidationViolationOccurred;
    private List<TDDIValidationViolationMessage> _ValidationViolationMessages;

    public bool ValidationViolationOccurred
    {
      get
      {
        return _ValidationViolationOccurred;
      }
      set
      {
        __isset.ValidationViolationOccurred = true;
        this._ValidationViolationOccurred = value;
      }
    }

    public List<TDDIValidationViolationMessage> ValidationViolationMessages
    {
      get
      {
        return _ValidationViolationMessages;
      }
      set
      {
        __isset.ValidationViolationMessages = true;
        this._ValidationViolationMessages = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool ValidationViolationOccurred;
      public bool ValidationViolationMessages;
    }

    public TDDIValidationResult() {
      this._ValidationViolationOccurred = false;
      this.__isset.ValidationViolationOccurred = true;
      this._ValidationViolationMessages = new List<TDDIValidationViolationMessage>();
      this.__isset.ValidationViolationMessages = true;
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
              if (field.Type == TType.Bool) {
                ValidationViolationOccurred = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.List) {
                {
                  ValidationViolationMessages = new List<TDDIValidationViolationMessage>();
                  TList _list1372 = iprot.ReadListBegin();
                  for( int _i1373 = 0; _i1373 < _list1372.Count; ++_i1373)
                  {
                    TDDIValidationViolationMessage _elem1374;
                    _elem1374 = new TDDIValidationViolationMessage();
                    _elem1374.Read(iprot);
                    ValidationViolationMessages.Add(_elem1374);
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
        TStruct struc = new TStruct("TDDIValidationResult");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (__isset.ValidationViolationOccurred) {
          field.Name = "ValidationViolationOccurred";
          field.Type = TType.Bool;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(ValidationViolationOccurred);
          oprot.WriteFieldEnd();
        }
        if (ValidationViolationMessages != null && __isset.ValidationViolationMessages) {
          field.Name = "ValidationViolationMessages";
          field.Type = TType.List;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, ValidationViolationMessages.Count));
            foreach (TDDIValidationViolationMessage _iter1375 in ValidationViolationMessages)
            {
              _iter1375.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIValidationResult(");
      bool __first = true;
      if (__isset.ValidationViolationOccurred) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ValidationViolationOccurred: ");
        __sb.Append(ValidationViolationOccurred);
      }
      if (ValidationViolationMessages != null && __isset.ValidationViolationMessages) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ValidationViolationMessages: ");
        __sb.Append(ValidationViolationMessages);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
