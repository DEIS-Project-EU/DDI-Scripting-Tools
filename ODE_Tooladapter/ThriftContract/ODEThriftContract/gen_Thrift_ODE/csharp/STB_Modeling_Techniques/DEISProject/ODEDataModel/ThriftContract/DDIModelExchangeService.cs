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
  public partial class DDIModelExchangeService {
    public interface ISync {
      void ExportModelToDDIFile(string Path, TDDIAbstractODEPackage ODEPackage);
      TDDIAbstractODEPackage ImportDDIModel(string Path);
      TDDIValidationResult ValidateDdi(string DdiPath, string EvlFilePath);
    }

    public interface Iface : ISync {
      #if SILVERLIGHT
      IAsyncResult Begin_ExportModelToDDIFile(AsyncCallback callback, object state, string Path, TDDIAbstractODEPackage ODEPackage);
      void End_ExportModelToDDIFile(IAsyncResult asyncResult);
      #endif
      #if SILVERLIGHT
      IAsyncResult Begin_ImportDDIModel(AsyncCallback callback, object state, string Path);
      TDDIAbstractODEPackage End_ImportDDIModel(IAsyncResult asyncResult);
      #endif
      #if SILVERLIGHT
      IAsyncResult Begin_ValidateDdi(AsyncCallback callback, object state, string DdiPath, string EvlFilePath);
      TDDIValidationResult End_ValidateDdi(IAsyncResult asyncResult);
      #endif
    }

    public class Client : IDisposable, Iface {
      public Client(TProtocol prot) : this(prot, prot)
      {
      }

      public Client(TProtocol iprot, TProtocol oprot)
      {
        iprot_ = iprot;
        oprot_ = oprot;
      }

      protected TProtocol iprot_;
      protected TProtocol oprot_;
      protected int seqid_;

      public TProtocol InputProtocol
      {
        get { return iprot_; }
      }
      public TProtocol OutputProtocol
      {
        get { return oprot_; }
      }


      #region " IDisposable Support "
      private bool _IsDisposed;

      // IDisposable
      public void Dispose()
      {
        Dispose(true);
      }
      

      protected virtual void Dispose(bool disposing)
      {
        if (!_IsDisposed)
        {
          if (disposing)
          {
            if (iprot_ != null)
            {
              ((IDisposable)iprot_).Dispose();
            }
            if (oprot_ != null)
            {
              ((IDisposable)oprot_).Dispose();
            }
          }
        }
        _IsDisposed = true;
      }
      #endregion


      
      #if SILVERLIGHT
      public IAsyncResult Begin_ExportModelToDDIFile(AsyncCallback callback, object state, string Path, TDDIAbstractODEPackage ODEPackage)
      {
        return send_ExportModelToDDIFile(callback, state, Path, ODEPackage);
      }

      public void End_ExportModelToDDIFile(IAsyncResult asyncResult)
      {
        oprot_.Transport.EndFlush(asyncResult);
        recv_ExportModelToDDIFile();
      }

      #endif

      public void ExportModelToDDIFile(string Path, TDDIAbstractODEPackage ODEPackage)
      {
        #if !SILVERLIGHT
        send_ExportModelToDDIFile(Path, ODEPackage);
        recv_ExportModelToDDIFile();

        #else
        var asyncResult = Begin_ExportModelToDDIFile(null, null, Path, ODEPackage);
        End_ExportModelToDDIFile(asyncResult);

        #endif
      }
      #if SILVERLIGHT
      public IAsyncResult send_ExportModelToDDIFile(AsyncCallback callback, object state, string Path, TDDIAbstractODEPackage ODEPackage)
      #else
      public void send_ExportModelToDDIFile(string Path, TDDIAbstractODEPackage ODEPackage)
      #endif
      {
        oprot_.WriteMessageBegin(new TMessage("ExportModelToDDIFile", TMessageType.Call, seqid_));
        ExportModelToDDIFile_args args = new ExportModelToDDIFile_args();
        args.Path = Path;
        args.ODEPackage = ODEPackage;
        args.Write(oprot_);
        oprot_.WriteMessageEnd();
        #if SILVERLIGHT
        return oprot_.Transport.BeginFlush(callback, state);
        #else
        oprot_.Transport.Flush();
        #endif
      }

      public void recv_ExportModelToDDIFile()
      {
        TMessage msg = iprot_.ReadMessageBegin();
        if (msg.Type == TMessageType.Exception) {
          TApplicationException x = TApplicationException.Read(iprot_);
          iprot_.ReadMessageEnd();
          throw x;
        }
        ExportModelToDDIFile_result result = new ExportModelToDDIFile_result();
        result.Read(iprot_);
        iprot_.ReadMessageEnd();
        if (result.__isset.ValidationFailedException) {
          throw result.ValidationFailedException;
        }
        return;
      }

      
      #if SILVERLIGHT
      public IAsyncResult Begin_ImportDDIModel(AsyncCallback callback, object state, string Path)
      {
        return send_ImportDDIModel(callback, state, Path);
      }

      public TDDIAbstractODEPackage End_ImportDDIModel(IAsyncResult asyncResult)
      {
        oprot_.Transport.EndFlush(asyncResult);
        return recv_ImportDDIModel();
      }

      #endif

      public TDDIAbstractODEPackage ImportDDIModel(string Path)
      {
        #if !SILVERLIGHT
        send_ImportDDIModel(Path);
        return recv_ImportDDIModel();

        #else
        var asyncResult = Begin_ImportDDIModel(null, null, Path);
        return End_ImportDDIModel(asyncResult);

        #endif
      }
      #if SILVERLIGHT
      public IAsyncResult send_ImportDDIModel(AsyncCallback callback, object state, string Path)
      #else
      public void send_ImportDDIModel(string Path)
      #endif
      {
        oprot_.WriteMessageBegin(new TMessage("ImportDDIModel", TMessageType.Call, seqid_));
        ImportDDIModel_args args = new ImportDDIModel_args();
        args.Path = Path;
        args.Write(oprot_);
        oprot_.WriteMessageEnd();
        #if SILVERLIGHT
        return oprot_.Transport.BeginFlush(callback, state);
        #else
        oprot_.Transport.Flush();
        #endif
      }

      public TDDIAbstractODEPackage recv_ImportDDIModel()
      {
        TMessage msg = iprot_.ReadMessageBegin();
        if (msg.Type == TMessageType.Exception) {
          TApplicationException x = TApplicationException.Read(iprot_);
          iprot_.ReadMessageEnd();
          throw x;
        }
        ImportDDIModel_result result = new ImportDDIModel_result();
        result.Read(iprot_);
        iprot_.ReadMessageEnd();
        if (result.__isset.success) {
          return result.Success;
        }
        if (result.__isset.ValidationFailedException) {
          throw result.ValidationFailedException;
        }
        throw new TApplicationException(TApplicationException.ExceptionType.MissingResult, "ImportDDIModel failed: unknown result");
      }

      
      #if SILVERLIGHT
      public IAsyncResult Begin_ValidateDdi(AsyncCallback callback, object state, string DdiPath, string EvlFilePath)
      {
        return send_ValidateDdi(callback, state, DdiPath, EvlFilePath);
      }

      public TDDIValidationResult End_ValidateDdi(IAsyncResult asyncResult)
      {
        oprot_.Transport.EndFlush(asyncResult);
        return recv_ValidateDdi();
      }

      #endif

      public TDDIValidationResult ValidateDdi(string DdiPath, string EvlFilePath)
      {
        #if !SILVERLIGHT
        send_ValidateDdi(DdiPath, EvlFilePath);
        return recv_ValidateDdi();

        #else
        var asyncResult = Begin_ValidateDdi(null, null, DdiPath, EvlFilePath);
        return End_ValidateDdi(asyncResult);

        #endif
      }
      #if SILVERLIGHT
      public IAsyncResult send_ValidateDdi(AsyncCallback callback, object state, string DdiPath, string EvlFilePath)
      #else
      public void send_ValidateDdi(string DdiPath, string EvlFilePath)
      #endif
      {
        oprot_.WriteMessageBegin(new TMessage("ValidateDdi", TMessageType.Call, seqid_));
        ValidateDdi_args args = new ValidateDdi_args();
        args.DdiPath = DdiPath;
        args.EvlFilePath = EvlFilePath;
        args.Write(oprot_);
        oprot_.WriteMessageEnd();
        #if SILVERLIGHT
        return oprot_.Transport.BeginFlush(callback, state);
        #else
        oprot_.Transport.Flush();
        #endif
      }

      public TDDIValidationResult recv_ValidateDdi()
      {
        TMessage msg = iprot_.ReadMessageBegin();
        if (msg.Type == TMessageType.Exception) {
          TApplicationException x = TApplicationException.Read(iprot_);
          iprot_.ReadMessageEnd();
          throw x;
        }
        ValidateDdi_result result = new ValidateDdi_result();
        result.Read(iprot_);
        iprot_.ReadMessageEnd();
        if (result.__isset.success) {
          return result.Success;
        }
        throw new TApplicationException(TApplicationException.ExceptionType.MissingResult, "ValidateDdi failed: unknown result");
      }

    }
    public class Processor : TProcessor {
      public Processor(ISync iface)
      {
        iface_ = iface;
        processMap_["ExportModelToDDIFile"] = ExportModelToDDIFile_Process;
        processMap_["ImportDDIModel"] = ImportDDIModel_Process;
        processMap_["ValidateDdi"] = ValidateDdi_Process;
      }

      protected delegate void ProcessFunction(int seqid, TProtocol iprot, TProtocol oprot);
      private ISync iface_;
      protected Dictionary<string, ProcessFunction> processMap_ = new Dictionary<string, ProcessFunction>();

      public bool Process(TProtocol iprot, TProtocol oprot)
      {
        try
        {
          TMessage msg = iprot.ReadMessageBegin();
          ProcessFunction fn;
          processMap_.TryGetValue(msg.Name, out fn);
          if (fn == null) {
            TProtocolUtil.Skip(iprot, TType.Struct);
            iprot.ReadMessageEnd();
            TApplicationException x = new TApplicationException (TApplicationException.ExceptionType.UnknownMethod, "Invalid method name: '" + msg.Name + "'");
            oprot.WriteMessageBegin(new TMessage(msg.Name, TMessageType.Exception, msg.SeqID));
            x.Write(oprot);
            oprot.WriteMessageEnd();
            oprot.Transport.Flush();
            return true;
          }
          fn(msg.SeqID, iprot, oprot);
        }
        catch (IOException)
        {
          return false;
        }
        return true;
      }

      public void ExportModelToDDIFile_Process(int seqid, TProtocol iprot, TProtocol oprot)
      {
        ExportModelToDDIFile_args args = new ExportModelToDDIFile_args();
        args.Read(iprot);
        iprot.ReadMessageEnd();
        ExportModelToDDIFile_result result = new ExportModelToDDIFile_result();
        try
        {
          try
          {
            iface_.ExportModelToDDIFile(args.Path, args.ODEPackage);
          }
          catch (TDDIValidationFailedException ValidationFailedException)
          {
            result.ValidationFailedException = ValidationFailedException;
          }
          oprot.WriteMessageBegin(new TMessage("ExportModelToDDIFile", TMessageType.Reply, seqid)); 
          result.Write(oprot);
        }
        catch (TTransportException)
        {
          throw;
        }
        catch (Exception ex)
        {
          Console.Error.WriteLine("Error occurred in processor:");
          Console.Error.WriteLine(ex.ToString());
          TApplicationException x = new TApplicationException        (TApplicationException.ExceptionType.InternalError," Internal error.");
          oprot.WriteMessageBegin(new TMessage("ExportModelToDDIFile", TMessageType.Exception, seqid));
          x.Write(oprot);
        }
        oprot.WriteMessageEnd();
        oprot.Transport.Flush();
      }

      public void ImportDDIModel_Process(int seqid, TProtocol iprot, TProtocol oprot)
      {
        ImportDDIModel_args args = new ImportDDIModel_args();
        args.Read(iprot);
        iprot.ReadMessageEnd();
        ImportDDIModel_result result = new ImportDDIModel_result();
        try
        {
          try
          {
            result.Success = iface_.ImportDDIModel(args.Path);
          }
          catch (TDDIValidationFailedException ValidationFailedException)
          {
            result.ValidationFailedException = ValidationFailedException;
          }
          oprot.WriteMessageBegin(new TMessage("ImportDDIModel", TMessageType.Reply, seqid)); 
          result.Write(oprot);
        }
        catch (TTransportException)
        {
          throw;
        }
        catch (Exception ex)
        {
          Console.Error.WriteLine("Error occurred in processor:");
          Console.Error.WriteLine(ex.ToString());
          TApplicationException x = new TApplicationException        (TApplicationException.ExceptionType.InternalError," Internal error.");
          oprot.WriteMessageBegin(new TMessage("ImportDDIModel", TMessageType.Exception, seqid));
          x.Write(oprot);
        }
        oprot.WriteMessageEnd();
        oprot.Transport.Flush();
      }

      public void ValidateDdi_Process(int seqid, TProtocol iprot, TProtocol oprot)
      {
        ValidateDdi_args args = new ValidateDdi_args();
        args.Read(iprot);
        iprot.ReadMessageEnd();
        ValidateDdi_result result = new ValidateDdi_result();
        try
        {
          result.Success = iface_.ValidateDdi(args.DdiPath, args.EvlFilePath);
          oprot.WriteMessageBegin(new TMessage("ValidateDdi", TMessageType.Reply, seqid)); 
          result.Write(oprot);
        }
        catch (TTransportException)
        {
          throw;
        }
        catch (Exception ex)
        {
          Console.Error.WriteLine("Error occurred in processor:");
          Console.Error.WriteLine(ex.ToString());
          TApplicationException x = new TApplicationException        (TApplicationException.ExceptionType.InternalError," Internal error.");
          oprot.WriteMessageBegin(new TMessage("ValidateDdi", TMessageType.Exception, seqid));
          x.Write(oprot);
        }
        oprot.WriteMessageEnd();
        oprot.Transport.Flush();
      }

    }


    #if !SILVERLIGHT
    [Serializable]
    #endif
    public partial class ExportModelToDDIFile_args : TBase
    {
      private string _Path;
      private TDDIAbstractODEPackage _ODEPackage;

      public string Path
      {
        get
        {
          return _Path;
        }
        set
        {
          __isset.Path = true;
          this._Path = value;
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


      public Isset __isset;
      #if !SILVERLIGHT
      [Serializable]
      #endif
      public struct Isset {
        public bool Path;
        public bool ODEPackage;
      }

      public ExportModelToDDIFile_args() {
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
                if (field.Type == TType.String) {
                  Path = iprot.ReadString();
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
          TStruct struc = new TStruct("ExportModelToDDIFile_args");
          oprot.WriteStructBegin(struc);
          TField field = new TField();
          if (Path != null && __isset.Path) {
            field.Name = "Path";
            field.Type = TType.String;
            field.ID = 1;
            oprot.WriteFieldBegin(field);
            oprot.WriteString(Path);
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
          oprot.WriteFieldStop();
          oprot.WriteStructEnd();
        }
        finally
        {
          oprot.DecrementRecursionDepth();
        }
      }

      public override string ToString() {
        StringBuilder __sb = new StringBuilder("ExportModelToDDIFile_args(");
        bool __first = true;
        if (Path != null && __isset.Path) {
          if(!__first) { __sb.Append(", "); }
          __first = false;
          __sb.Append("Path: ");
          __sb.Append(Path);
        }
        if (ODEPackage != null && __isset.ODEPackage) {
          if(!__first) { __sb.Append(", "); }
          __first = false;
          __sb.Append("ODEPackage: ");
          __sb.Append(ODEPackage== null ? "<null>" : ODEPackage.ToString());
        }
        __sb.Append(")");
        return __sb.ToString();
      }

    }


    #if !SILVERLIGHT
    [Serializable]
    #endif
    public partial class ExportModelToDDIFile_result : TBase
    {
      private TDDIValidationFailedException _ValidationFailedException;

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


      public Isset __isset;
      #if !SILVERLIGHT
      [Serializable]
      #endif
      public struct Isset {
        public bool ValidationFailedException;
      }

      public ExportModelToDDIFile_result() {
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
          TStruct struc = new TStruct("ExportModelToDDIFile_result");
          oprot.WriteStructBegin(struc);
          TField field = new TField();

          if (this.__isset.ValidationFailedException) {
            if (ValidationFailedException != null) {
              field.Name = "ValidationFailedException";
              field.Type = TType.Struct;
              field.ID = 1;
              oprot.WriteFieldBegin(field);
              ValidationFailedException.Write(oprot);
              oprot.WriteFieldEnd();
            }
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
        StringBuilder __sb = new StringBuilder("ExportModelToDDIFile_result(");
        bool __first = true;
        if (ValidationFailedException != null && __isset.ValidationFailedException) {
          if(!__first) { __sb.Append(", "); }
          __first = false;
          __sb.Append("ValidationFailedException: ");
          __sb.Append(ValidationFailedException== null ? "<null>" : ValidationFailedException.ToString());
        }
        __sb.Append(")");
        return __sb.ToString();
      }

    }


    #if !SILVERLIGHT
    [Serializable]
    #endif
    public partial class ImportDDIModel_args : TBase
    {
      private string _Path;

      public string Path
      {
        get
        {
          return _Path;
        }
        set
        {
          __isset.Path = true;
          this._Path = value;
        }
      }


      public Isset __isset;
      #if !SILVERLIGHT
      [Serializable]
      #endif
      public struct Isset {
        public bool Path;
      }

      public ImportDDIModel_args() {
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
                if (field.Type == TType.String) {
                  Path = iprot.ReadString();
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
          TStruct struc = new TStruct("ImportDDIModel_args");
          oprot.WriteStructBegin(struc);
          TField field = new TField();
          if (Path != null && __isset.Path) {
            field.Name = "Path";
            field.Type = TType.String;
            field.ID = 1;
            oprot.WriteFieldBegin(field);
            oprot.WriteString(Path);
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
        StringBuilder __sb = new StringBuilder("ImportDDIModel_args(");
        bool __first = true;
        if (Path != null && __isset.Path) {
          if(!__first) { __sb.Append(", "); }
          __first = false;
          __sb.Append("Path: ");
          __sb.Append(Path);
        }
        __sb.Append(")");
        return __sb.ToString();
      }

    }


    #if !SILVERLIGHT
    [Serializable]
    #endif
    public partial class ImportDDIModel_result : TBase
    {
      private TDDIAbstractODEPackage _success;
      private TDDIValidationFailedException _ValidationFailedException;

      public TDDIAbstractODEPackage Success
      {
        get
        {
          return _success;
        }
        set
        {
          __isset.success = true;
          this._success = value;
        }
      }

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


      public Isset __isset;
      #if !SILVERLIGHT
      [Serializable]
      #endif
      public struct Isset {
        public bool success;
        public bool ValidationFailedException;
      }

      public ImportDDIModel_result() {
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
              case 0:
                if (field.Type == TType.Struct) {
                  Success = new TDDIAbstractODEPackage();
                  Success.Read(iprot);
                } else { 
                  TProtocolUtil.Skip(iprot, field.Type);
                }
                break;
              case 1:
                if (field.Type == TType.Struct) {
                  ValidationFailedException = new TDDIValidationFailedException();
                  ValidationFailedException.Read(iprot);
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
          TStruct struc = new TStruct("ImportDDIModel_result");
          oprot.WriteStructBegin(struc);
          TField field = new TField();

          if (this.__isset.success) {
            if (Success != null) {
              field.Name = "Success";
              field.Type = TType.Struct;
              field.ID = 0;
              oprot.WriteFieldBegin(field);
              Success.Write(oprot);
              oprot.WriteFieldEnd();
            }
          } else if (this.__isset.ValidationFailedException) {
            if (ValidationFailedException != null) {
              field.Name = "ValidationFailedException";
              field.Type = TType.Struct;
              field.ID = 1;
              oprot.WriteFieldBegin(field);
              ValidationFailedException.Write(oprot);
              oprot.WriteFieldEnd();
            }
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
        StringBuilder __sb = new StringBuilder("ImportDDIModel_result(");
        bool __first = true;
        if (Success != null && __isset.success) {
          if(!__first) { __sb.Append(", "); }
          __first = false;
          __sb.Append("Success: ");
          __sb.Append(Success== null ? "<null>" : Success.ToString());
        }
        if (ValidationFailedException != null && __isset.ValidationFailedException) {
          if(!__first) { __sb.Append(", "); }
          __first = false;
          __sb.Append("ValidationFailedException: ");
          __sb.Append(ValidationFailedException== null ? "<null>" : ValidationFailedException.ToString());
        }
        __sb.Append(")");
        return __sb.ToString();
      }

    }


    #if !SILVERLIGHT
    [Serializable]
    #endif
    public partial class ValidateDdi_args : TBase
    {
      private string _DdiPath;
      private string _EvlFilePath;

      public string DdiPath
      {
        get
        {
          return _DdiPath;
        }
        set
        {
          __isset.DdiPath = true;
          this._DdiPath = value;
        }
      }

      public string EvlFilePath
      {
        get
        {
          return _EvlFilePath;
        }
        set
        {
          __isset.EvlFilePath = true;
          this._EvlFilePath = value;
        }
      }


      public Isset __isset;
      #if !SILVERLIGHT
      [Serializable]
      #endif
      public struct Isset {
        public bool DdiPath;
        public bool EvlFilePath;
      }

      public ValidateDdi_args() {
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
                if (field.Type == TType.String) {
                  DdiPath = iprot.ReadString();
                } else { 
                  TProtocolUtil.Skip(iprot, field.Type);
                }
                break;
              case 2:
                if (field.Type == TType.String) {
                  EvlFilePath = iprot.ReadString();
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
          TStruct struc = new TStruct("ValidateDdi_args");
          oprot.WriteStructBegin(struc);
          TField field = new TField();
          if (DdiPath != null && __isset.DdiPath) {
            field.Name = "DdiPath";
            field.Type = TType.String;
            field.ID = 1;
            oprot.WriteFieldBegin(field);
            oprot.WriteString(DdiPath);
            oprot.WriteFieldEnd();
          }
          if (EvlFilePath != null && __isset.EvlFilePath) {
            field.Name = "EvlFilePath";
            field.Type = TType.String;
            field.ID = 2;
            oprot.WriteFieldBegin(field);
            oprot.WriteString(EvlFilePath);
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
        StringBuilder __sb = new StringBuilder("ValidateDdi_args(");
        bool __first = true;
        if (DdiPath != null && __isset.DdiPath) {
          if(!__first) { __sb.Append(", "); }
          __first = false;
          __sb.Append("DdiPath: ");
          __sb.Append(DdiPath);
        }
        if (EvlFilePath != null && __isset.EvlFilePath) {
          if(!__first) { __sb.Append(", "); }
          __first = false;
          __sb.Append("EvlFilePath: ");
          __sb.Append(EvlFilePath);
        }
        __sb.Append(")");
        return __sb.ToString();
      }

    }


    #if !SILVERLIGHT
    [Serializable]
    #endif
    public partial class ValidateDdi_result : TBase
    {
      private TDDIValidationResult _success;

      public TDDIValidationResult Success
      {
        get
        {
          return _success;
        }
        set
        {
          __isset.success = true;
          this._success = value;
        }
      }


      public Isset __isset;
      #if !SILVERLIGHT
      [Serializable]
      #endif
      public struct Isset {
        public bool success;
      }

      public ValidateDdi_result() {
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
              case 0:
                if (field.Type == TType.Struct) {
                  Success = new TDDIValidationResult();
                  Success.Read(iprot);
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
          TStruct struc = new TStruct("ValidateDdi_result");
          oprot.WriteStructBegin(struc);
          TField field = new TField();

          if (this.__isset.success) {
            if (Success != null) {
              field.Name = "Success";
              field.Type = TType.Struct;
              field.ID = 0;
              oprot.WriteFieldBegin(field);
              Success.Write(oprot);
              oprot.WriteFieldEnd();
            }
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
        StringBuilder __sb = new StringBuilder("ValidateDdi_result(");
        bool __first = true;
        if (Success != null && __isset.success) {
          if(!__first) { __sb.Append(", "); }
          __first = false;
          __sb.Append("Success: ");
          __sb.Append(Success== null ? "<null>" : Success.ToString());
        }
        __sb.Append(")");
        return __sb.ToString();
      }

    }

  }
}
