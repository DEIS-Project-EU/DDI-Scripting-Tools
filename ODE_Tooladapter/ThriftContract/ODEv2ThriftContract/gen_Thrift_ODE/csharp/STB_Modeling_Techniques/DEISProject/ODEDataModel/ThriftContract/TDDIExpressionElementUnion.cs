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
  public partial class TDDIExpressionElementUnion : TBase
  {
    private TDDIExpression _Expression;
    private TDDITerm _Term;

    public TDDIExpression Expression
    {
      get
      {
        return _Expression;
      }
      set
      {
        __isset.Expression = true;
        this._Expression = value;
      }
    }

    public TDDITerm Term
    {
      get
      {
        return _Term;
      }
      set
      {
        __isset.Term = true;
        this._Term = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool Expression;
      public bool Term;
    }

    public TDDIExpressionElementUnion() {
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
                Expression = new TDDIExpression();
                Expression.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Struct) {
                Term = new TDDITerm();
                Term.Read(iprot);
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
        TStruct struc = new TStruct("TDDIExpressionElementUnion");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (Expression != null && __isset.Expression) {
          field.Name = "Expression";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          Expression.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (Term != null && __isset.Term) {
          field.Name = "Term";
          field.Type = TType.Struct;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          Term.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIExpressionElementUnion(");
      bool __first = true;
      if (Expression != null && __isset.Expression) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Expression: ");
        __sb.Append(Expression== null ? "<null>" : Expression.ToString());
      }
      if (Term != null && __isset.Term) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Term: ");
        __sb.Append(Term== null ? "<null>" : Term.ToString());
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
