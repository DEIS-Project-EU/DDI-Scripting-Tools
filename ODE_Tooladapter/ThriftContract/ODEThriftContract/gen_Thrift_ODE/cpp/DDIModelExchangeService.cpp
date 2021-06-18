/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "DDIModelExchangeService.h"

namespace thriftContract {


DDIModelExchangeService_ExportModelToDDIFile_args::~DDIModelExchangeService_ExportModelToDDIFile_args() throw() {
}


uint32_t DDIModelExchangeService_ExportModelToDDIFile_args::read(::apache::thrift::protocol::TProtocol* iprot) {

  ::apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;


  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->Path);
          this->__isset.Path = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRUCT) {
          xfer += this->ODEPackage.read(iprot);
          this->__isset.ODEPackage = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  return xfer;
}

uint32_t DDIModelExchangeService_ExportModelToDDIFile_args::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  ::apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("DDIModelExchangeService_ExportModelToDDIFile_args");

  xfer += oprot->writeFieldBegin("Path", ::apache::thrift::protocol::T_STRING, 1);
  xfer += oprot->writeString(this->Path);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("ODEPackage", ::apache::thrift::protocol::T_STRUCT, 2);
  xfer += this->ODEPackage.write(oprot);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}


DDIModelExchangeService_ExportModelToDDIFile_pargs::~DDIModelExchangeService_ExportModelToDDIFile_pargs() throw() {
}


uint32_t DDIModelExchangeService_ExportModelToDDIFile_pargs::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  ::apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("DDIModelExchangeService_ExportModelToDDIFile_pargs");

  xfer += oprot->writeFieldBegin("Path", ::apache::thrift::protocol::T_STRING, 1);
  xfer += oprot->writeString((*(this->Path)));
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("ODEPackage", ::apache::thrift::protocol::T_STRUCT, 2);
  xfer += (*(this->ODEPackage)).write(oprot);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}


DDIModelExchangeService_ExportModelToDDIFile_result::~DDIModelExchangeService_ExportModelToDDIFile_result() throw() {
}


uint32_t DDIModelExchangeService_ExportModelToDDIFile_result::read(::apache::thrift::protocol::TProtocol* iprot) {

  ::apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;


  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRUCT) {
          xfer += this->ValidationFailedException.read(iprot);
          this->__isset.ValidationFailedException = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  return xfer;
}

uint32_t DDIModelExchangeService_ExportModelToDDIFile_result::write(::apache::thrift::protocol::TProtocol* oprot) const {

  uint32_t xfer = 0;

  xfer += oprot->writeStructBegin("DDIModelExchangeService_ExportModelToDDIFile_result");

  if (this->__isset.ValidationFailedException) {
    xfer += oprot->writeFieldBegin("ValidationFailedException", ::apache::thrift::protocol::T_STRUCT, 1);
    xfer += this->ValidationFailedException.write(oprot);
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}


DDIModelExchangeService_ExportModelToDDIFile_presult::~DDIModelExchangeService_ExportModelToDDIFile_presult() throw() {
}


uint32_t DDIModelExchangeService_ExportModelToDDIFile_presult::read(::apache::thrift::protocol::TProtocol* iprot) {

  ::apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;


  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRUCT) {
          xfer += this->ValidationFailedException.read(iprot);
          this->__isset.ValidationFailedException = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  return xfer;
}


DDIModelExchangeService_ImportDDIModel_args::~DDIModelExchangeService_ImportDDIModel_args() throw() {
}


uint32_t DDIModelExchangeService_ImportDDIModel_args::read(::apache::thrift::protocol::TProtocol* iprot) {

  ::apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;


  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->Path);
          this->__isset.Path = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  return xfer;
}

uint32_t DDIModelExchangeService_ImportDDIModel_args::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  ::apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("DDIModelExchangeService_ImportDDIModel_args");

  xfer += oprot->writeFieldBegin("Path", ::apache::thrift::protocol::T_STRING, 1);
  xfer += oprot->writeString(this->Path);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}


DDIModelExchangeService_ImportDDIModel_pargs::~DDIModelExchangeService_ImportDDIModel_pargs() throw() {
}


uint32_t DDIModelExchangeService_ImportDDIModel_pargs::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  ::apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("DDIModelExchangeService_ImportDDIModel_pargs");

  xfer += oprot->writeFieldBegin("Path", ::apache::thrift::protocol::T_STRING, 1);
  xfer += oprot->writeString((*(this->Path)));
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}


DDIModelExchangeService_ImportDDIModel_result::~DDIModelExchangeService_ImportDDIModel_result() throw() {
}


uint32_t DDIModelExchangeService_ImportDDIModel_result::read(::apache::thrift::protocol::TProtocol* iprot) {

  ::apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;


  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 0:
        if (ftype == ::apache::thrift::protocol::T_STRUCT) {
          xfer += this->success.read(iprot);
          this->__isset.success = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRUCT) {
          xfer += this->ValidationFailedException.read(iprot);
          this->__isset.ValidationFailedException = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  return xfer;
}

uint32_t DDIModelExchangeService_ImportDDIModel_result::write(::apache::thrift::protocol::TProtocol* oprot) const {

  uint32_t xfer = 0;

  xfer += oprot->writeStructBegin("DDIModelExchangeService_ImportDDIModel_result");

  if (this->__isset.success) {
    xfer += oprot->writeFieldBegin("success", ::apache::thrift::protocol::T_STRUCT, 0);
    xfer += this->success.write(oprot);
    xfer += oprot->writeFieldEnd();
  } else if (this->__isset.ValidationFailedException) {
    xfer += oprot->writeFieldBegin("ValidationFailedException", ::apache::thrift::protocol::T_STRUCT, 1);
    xfer += this->ValidationFailedException.write(oprot);
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}


DDIModelExchangeService_ImportDDIModel_presult::~DDIModelExchangeService_ImportDDIModel_presult() throw() {
}


uint32_t DDIModelExchangeService_ImportDDIModel_presult::read(::apache::thrift::protocol::TProtocol* iprot) {

  ::apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;


  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 0:
        if (ftype == ::apache::thrift::protocol::T_STRUCT) {
          xfer += (*(this->success)).read(iprot);
          this->__isset.success = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRUCT) {
          xfer += this->ValidationFailedException.read(iprot);
          this->__isset.ValidationFailedException = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  return xfer;
}


DDIModelExchangeService_ValidateDdi_args::~DDIModelExchangeService_ValidateDdi_args() throw() {
}


uint32_t DDIModelExchangeService_ValidateDdi_args::read(::apache::thrift::protocol::TProtocol* iprot) {

  ::apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;


  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->DdiPath);
          this->__isset.DdiPath = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->EvlFilePath);
          this->__isset.EvlFilePath = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  return xfer;
}

uint32_t DDIModelExchangeService_ValidateDdi_args::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  ::apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("DDIModelExchangeService_ValidateDdi_args");

  xfer += oprot->writeFieldBegin("DdiPath", ::apache::thrift::protocol::T_STRING, 1);
  xfer += oprot->writeString(this->DdiPath);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("EvlFilePath", ::apache::thrift::protocol::T_STRING, 2);
  xfer += oprot->writeString(this->EvlFilePath);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}


DDIModelExchangeService_ValidateDdi_pargs::~DDIModelExchangeService_ValidateDdi_pargs() throw() {
}


uint32_t DDIModelExchangeService_ValidateDdi_pargs::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  ::apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("DDIModelExchangeService_ValidateDdi_pargs");

  xfer += oprot->writeFieldBegin("DdiPath", ::apache::thrift::protocol::T_STRING, 1);
  xfer += oprot->writeString((*(this->DdiPath)));
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("EvlFilePath", ::apache::thrift::protocol::T_STRING, 2);
  xfer += oprot->writeString((*(this->EvlFilePath)));
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}


DDIModelExchangeService_ValidateDdi_result::~DDIModelExchangeService_ValidateDdi_result() throw() {
}


uint32_t DDIModelExchangeService_ValidateDdi_result::read(::apache::thrift::protocol::TProtocol* iprot) {

  ::apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;


  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 0:
        if (ftype == ::apache::thrift::protocol::T_STRUCT) {
          xfer += this->success.read(iprot);
          this->__isset.success = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  return xfer;
}

uint32_t DDIModelExchangeService_ValidateDdi_result::write(::apache::thrift::protocol::TProtocol* oprot) const {

  uint32_t xfer = 0;

  xfer += oprot->writeStructBegin("DDIModelExchangeService_ValidateDdi_result");

  if (this->__isset.success) {
    xfer += oprot->writeFieldBegin("success", ::apache::thrift::protocol::T_STRUCT, 0);
    xfer += this->success.write(oprot);
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}


DDIModelExchangeService_ValidateDdi_presult::~DDIModelExchangeService_ValidateDdi_presult() throw() {
}


uint32_t DDIModelExchangeService_ValidateDdi_presult::read(::apache::thrift::protocol::TProtocol* iprot) {

  ::apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;


  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 0:
        if (ftype == ::apache::thrift::protocol::T_STRUCT) {
          xfer += (*(this->success)).read(iprot);
          this->__isset.success = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  return xfer;
}

void DDIModelExchangeServiceClient::ExportModelToDDIFile(const std::string& Path, const TDDIAbstractODEPackage& ODEPackage)
{
  send_ExportModelToDDIFile(Path, ODEPackage);
  recv_ExportModelToDDIFile();
}

void DDIModelExchangeServiceClient::send_ExportModelToDDIFile(const std::string& Path, const TDDIAbstractODEPackage& ODEPackage)
{
  int32_t cseqid = 0;
  oprot_->writeMessageBegin("ExportModelToDDIFile", ::apache::thrift::protocol::T_CALL, cseqid);

  DDIModelExchangeService_ExportModelToDDIFile_pargs args;
  args.Path = &Path;
  args.ODEPackage = &ODEPackage;
  args.write(oprot_);

  oprot_->writeMessageEnd();
  oprot_->getTransport()->writeEnd();
  oprot_->getTransport()->flush();
}

void DDIModelExchangeServiceClient::recv_ExportModelToDDIFile()
{

  int32_t rseqid = 0;
  std::string fname;
  ::apache::thrift::protocol::TMessageType mtype;

  iprot_->readMessageBegin(fname, mtype, rseqid);
  if (mtype == ::apache::thrift::protocol::T_EXCEPTION) {
    ::apache::thrift::TApplicationException x;
    x.read(iprot_);
    iprot_->readMessageEnd();
    iprot_->getTransport()->readEnd();
    throw x;
  }
  if (mtype != ::apache::thrift::protocol::T_REPLY) {
    iprot_->skip(::apache::thrift::protocol::T_STRUCT);
    iprot_->readMessageEnd();
    iprot_->getTransport()->readEnd();
  }
  if (fname.compare("ExportModelToDDIFile") != 0) {
    iprot_->skip(::apache::thrift::protocol::T_STRUCT);
    iprot_->readMessageEnd();
    iprot_->getTransport()->readEnd();
  }
  DDIModelExchangeService_ExportModelToDDIFile_presult result;
  result.read(iprot_);
  iprot_->readMessageEnd();
  iprot_->getTransport()->readEnd();

  if (result.__isset.ValidationFailedException) {
    throw result.ValidationFailedException;
  }
  return;
}

void DDIModelExchangeServiceClient::ImportDDIModel(TDDIAbstractODEPackage& _return, const std::string& Path)
{
  send_ImportDDIModel(Path);
  recv_ImportDDIModel(_return);
}

void DDIModelExchangeServiceClient::send_ImportDDIModel(const std::string& Path)
{
  int32_t cseqid = 0;
  oprot_->writeMessageBegin("ImportDDIModel", ::apache::thrift::protocol::T_CALL, cseqid);

  DDIModelExchangeService_ImportDDIModel_pargs args;
  args.Path = &Path;
  args.write(oprot_);

  oprot_->writeMessageEnd();
  oprot_->getTransport()->writeEnd();
  oprot_->getTransport()->flush();
}

void DDIModelExchangeServiceClient::recv_ImportDDIModel(TDDIAbstractODEPackage& _return)
{

  int32_t rseqid = 0;
  std::string fname;
  ::apache::thrift::protocol::TMessageType mtype;

  iprot_->readMessageBegin(fname, mtype, rseqid);
  if (mtype == ::apache::thrift::protocol::T_EXCEPTION) {
    ::apache::thrift::TApplicationException x;
    x.read(iprot_);
    iprot_->readMessageEnd();
    iprot_->getTransport()->readEnd();
    throw x;
  }
  if (mtype != ::apache::thrift::protocol::T_REPLY) {
    iprot_->skip(::apache::thrift::protocol::T_STRUCT);
    iprot_->readMessageEnd();
    iprot_->getTransport()->readEnd();
  }
  if (fname.compare("ImportDDIModel") != 0) {
    iprot_->skip(::apache::thrift::protocol::T_STRUCT);
    iprot_->readMessageEnd();
    iprot_->getTransport()->readEnd();
  }
  DDIModelExchangeService_ImportDDIModel_presult result;
  result.success = &_return;
  result.read(iprot_);
  iprot_->readMessageEnd();
  iprot_->getTransport()->readEnd();

  if (result.__isset.success) {
    // _return pointer has now been filled
    return;
  }
  if (result.__isset.ValidationFailedException) {
    throw result.ValidationFailedException;
  }
  throw ::apache::thrift::TApplicationException(::apache::thrift::TApplicationException::MISSING_RESULT, "ImportDDIModel failed: unknown result");
}

void DDIModelExchangeServiceClient::ValidateDdi(TDDIValidationResult& _return, const std::string& DdiPath, const std::string& EvlFilePath)
{
  send_ValidateDdi(DdiPath, EvlFilePath);
  recv_ValidateDdi(_return);
}

void DDIModelExchangeServiceClient::send_ValidateDdi(const std::string& DdiPath, const std::string& EvlFilePath)
{
  int32_t cseqid = 0;
  oprot_->writeMessageBegin("ValidateDdi", ::apache::thrift::protocol::T_CALL, cseqid);

  DDIModelExchangeService_ValidateDdi_pargs args;
  args.DdiPath = &DdiPath;
  args.EvlFilePath = &EvlFilePath;
  args.write(oprot_);

  oprot_->writeMessageEnd();
  oprot_->getTransport()->writeEnd();
  oprot_->getTransport()->flush();
}

void DDIModelExchangeServiceClient::recv_ValidateDdi(TDDIValidationResult& _return)
{

  int32_t rseqid = 0;
  std::string fname;
  ::apache::thrift::protocol::TMessageType mtype;

  iprot_->readMessageBegin(fname, mtype, rseqid);
  if (mtype == ::apache::thrift::protocol::T_EXCEPTION) {
    ::apache::thrift::TApplicationException x;
    x.read(iprot_);
    iprot_->readMessageEnd();
    iprot_->getTransport()->readEnd();
    throw x;
  }
  if (mtype != ::apache::thrift::protocol::T_REPLY) {
    iprot_->skip(::apache::thrift::protocol::T_STRUCT);
    iprot_->readMessageEnd();
    iprot_->getTransport()->readEnd();
  }
  if (fname.compare("ValidateDdi") != 0) {
    iprot_->skip(::apache::thrift::protocol::T_STRUCT);
    iprot_->readMessageEnd();
    iprot_->getTransport()->readEnd();
  }
  DDIModelExchangeService_ValidateDdi_presult result;
  result.success = &_return;
  result.read(iprot_);
  iprot_->readMessageEnd();
  iprot_->getTransport()->readEnd();

  if (result.__isset.success) {
    // _return pointer has now been filled
    return;
  }
  throw ::apache::thrift::TApplicationException(::apache::thrift::TApplicationException::MISSING_RESULT, "ValidateDdi failed: unknown result");
}

bool DDIModelExchangeServiceProcessor::dispatchCall(::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, const std::string& fname, int32_t seqid, void* callContext) {
  ProcessMap::iterator pfn;
  pfn = processMap_.find(fname);
  if (pfn == processMap_.end()) {
    iprot->skip(::apache::thrift::protocol::T_STRUCT);
    iprot->readMessageEnd();
    iprot->getTransport()->readEnd();
    ::apache::thrift::TApplicationException x(::apache::thrift::TApplicationException::UNKNOWN_METHOD, "Invalid method name: '"+fname+"'");
    oprot->writeMessageBegin(fname, ::apache::thrift::protocol::T_EXCEPTION, seqid);
    x.write(oprot);
    oprot->writeMessageEnd();
    oprot->getTransport()->writeEnd();
    oprot->getTransport()->flush();
    return true;
  }
  (this->*(pfn->second))(seqid, iprot, oprot, callContext);
  return true;
}

void DDIModelExchangeServiceProcessor::process_ExportModelToDDIFile(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext)
{
  void* ctx = NULL;
  if (this->eventHandler_.get() != NULL) {
    ctx = this->eventHandler_->getContext("DDIModelExchangeService.ExportModelToDDIFile", callContext);
  }
  ::apache::thrift::TProcessorContextFreer freer(this->eventHandler_.get(), ctx, "DDIModelExchangeService.ExportModelToDDIFile");

  if (this->eventHandler_.get() != NULL) {
    this->eventHandler_->preRead(ctx, "DDIModelExchangeService.ExportModelToDDIFile");
  }

  DDIModelExchangeService_ExportModelToDDIFile_args args;
  args.read(iprot);
  iprot->readMessageEnd();
  uint32_t bytes = iprot->getTransport()->readEnd();

  if (this->eventHandler_.get() != NULL) {
    this->eventHandler_->postRead(ctx, "DDIModelExchangeService.ExportModelToDDIFile", bytes);
  }

  DDIModelExchangeService_ExportModelToDDIFile_result result;
  try {
    iface_->ExportModelToDDIFile(args.Path, args.ODEPackage);
  } catch (TDDIValidationFailedException &ValidationFailedException) {
    result.ValidationFailedException = ValidationFailedException;
    result.__isset.ValidationFailedException = true;
  } catch (const std::exception& e) {
    if (this->eventHandler_.get() != NULL) {
      this->eventHandler_->handlerError(ctx, "DDIModelExchangeService.ExportModelToDDIFile");
    }

    ::apache::thrift::TApplicationException x(e.what());
    oprot->writeMessageBegin("ExportModelToDDIFile", ::apache::thrift::protocol::T_EXCEPTION, seqid);
    x.write(oprot);
    oprot->writeMessageEnd();
    oprot->getTransport()->writeEnd();
    oprot->getTransport()->flush();
    return;
  }

  if (this->eventHandler_.get() != NULL) {
    this->eventHandler_->preWrite(ctx, "DDIModelExchangeService.ExportModelToDDIFile");
  }

  oprot->writeMessageBegin("ExportModelToDDIFile", ::apache::thrift::protocol::T_REPLY, seqid);
  result.write(oprot);
  oprot->writeMessageEnd();
  bytes = oprot->getTransport()->writeEnd();
  oprot->getTransport()->flush();

  if (this->eventHandler_.get() != NULL) {
    this->eventHandler_->postWrite(ctx, "DDIModelExchangeService.ExportModelToDDIFile", bytes);
  }
}

void DDIModelExchangeServiceProcessor::process_ImportDDIModel(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext)
{
  void* ctx = NULL;
  if (this->eventHandler_.get() != NULL) {
    ctx = this->eventHandler_->getContext("DDIModelExchangeService.ImportDDIModel", callContext);
  }
  ::apache::thrift::TProcessorContextFreer freer(this->eventHandler_.get(), ctx, "DDIModelExchangeService.ImportDDIModel");

  if (this->eventHandler_.get() != NULL) {
    this->eventHandler_->preRead(ctx, "DDIModelExchangeService.ImportDDIModel");
  }

  DDIModelExchangeService_ImportDDIModel_args args;
  args.read(iprot);
  iprot->readMessageEnd();
  uint32_t bytes = iprot->getTransport()->readEnd();

  if (this->eventHandler_.get() != NULL) {
    this->eventHandler_->postRead(ctx, "DDIModelExchangeService.ImportDDIModel", bytes);
  }

  DDIModelExchangeService_ImportDDIModel_result result;
  try {
    iface_->ImportDDIModel(result.success, args.Path);
    result.__isset.success = true;
  } catch (TDDIValidationFailedException &ValidationFailedException) {
    result.ValidationFailedException = ValidationFailedException;
    result.__isset.ValidationFailedException = true;
  } catch (const std::exception& e) {
    if (this->eventHandler_.get() != NULL) {
      this->eventHandler_->handlerError(ctx, "DDIModelExchangeService.ImportDDIModel");
    }

    ::apache::thrift::TApplicationException x(e.what());
    oprot->writeMessageBegin("ImportDDIModel", ::apache::thrift::protocol::T_EXCEPTION, seqid);
    x.write(oprot);
    oprot->writeMessageEnd();
    oprot->getTransport()->writeEnd();
    oprot->getTransport()->flush();
    return;
  }

  if (this->eventHandler_.get() != NULL) {
    this->eventHandler_->preWrite(ctx, "DDIModelExchangeService.ImportDDIModel");
  }

  oprot->writeMessageBegin("ImportDDIModel", ::apache::thrift::protocol::T_REPLY, seqid);
  result.write(oprot);
  oprot->writeMessageEnd();
  bytes = oprot->getTransport()->writeEnd();
  oprot->getTransport()->flush();

  if (this->eventHandler_.get() != NULL) {
    this->eventHandler_->postWrite(ctx, "DDIModelExchangeService.ImportDDIModel", bytes);
  }
}

void DDIModelExchangeServiceProcessor::process_ValidateDdi(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext)
{
  void* ctx = NULL;
  if (this->eventHandler_.get() != NULL) {
    ctx = this->eventHandler_->getContext("DDIModelExchangeService.ValidateDdi", callContext);
  }
  ::apache::thrift::TProcessorContextFreer freer(this->eventHandler_.get(), ctx, "DDIModelExchangeService.ValidateDdi");

  if (this->eventHandler_.get() != NULL) {
    this->eventHandler_->preRead(ctx, "DDIModelExchangeService.ValidateDdi");
  }

  DDIModelExchangeService_ValidateDdi_args args;
  args.read(iprot);
  iprot->readMessageEnd();
  uint32_t bytes = iprot->getTransport()->readEnd();

  if (this->eventHandler_.get() != NULL) {
    this->eventHandler_->postRead(ctx, "DDIModelExchangeService.ValidateDdi", bytes);
  }

  DDIModelExchangeService_ValidateDdi_result result;
  try {
    iface_->ValidateDdi(result.success, args.DdiPath, args.EvlFilePath);
    result.__isset.success = true;
  } catch (const std::exception& e) {
    if (this->eventHandler_.get() != NULL) {
      this->eventHandler_->handlerError(ctx, "DDIModelExchangeService.ValidateDdi");
    }

    ::apache::thrift::TApplicationException x(e.what());
    oprot->writeMessageBegin("ValidateDdi", ::apache::thrift::protocol::T_EXCEPTION, seqid);
    x.write(oprot);
    oprot->writeMessageEnd();
    oprot->getTransport()->writeEnd();
    oprot->getTransport()->flush();
    return;
  }

  if (this->eventHandler_.get() != NULL) {
    this->eventHandler_->preWrite(ctx, "DDIModelExchangeService.ValidateDdi");
  }

  oprot->writeMessageBegin("ValidateDdi", ::apache::thrift::protocol::T_REPLY, seqid);
  result.write(oprot);
  oprot->writeMessageEnd();
  bytes = oprot->getTransport()->writeEnd();
  oprot->getTransport()->flush();

  if (this->eventHandler_.get() != NULL) {
    this->eventHandler_->postWrite(ctx, "DDIModelExchangeService.ValidateDdi", bytes);
  }
}

::apache::thrift::stdcxx::shared_ptr< ::apache::thrift::TProcessor > DDIModelExchangeServiceProcessorFactory::getProcessor(const ::apache::thrift::TConnectionInfo& connInfo) {
  ::apache::thrift::ReleaseHandler< DDIModelExchangeServiceIfFactory > cleanup(handlerFactory_);
  ::apache::thrift::stdcxx::shared_ptr< DDIModelExchangeServiceIf > handler(handlerFactory_->getHandler(connInfo), cleanup);
  ::apache::thrift::stdcxx::shared_ptr< ::apache::thrift::TProcessor > processor(new DDIModelExchangeServiceProcessor(handler));
  return processor;
}

void DDIModelExchangeServiceConcurrentClient::ExportModelToDDIFile(const std::string& Path, const TDDIAbstractODEPackage& ODEPackage)
{
  int32_t seqid = send_ExportModelToDDIFile(Path, ODEPackage);
  recv_ExportModelToDDIFile(seqid);
}

int32_t DDIModelExchangeServiceConcurrentClient::send_ExportModelToDDIFile(const std::string& Path, const TDDIAbstractODEPackage& ODEPackage)
{
  int32_t cseqid = this->sync_.generateSeqId();
  ::apache::thrift::async::TConcurrentSendSentry sentry(&this->sync_);
  oprot_->writeMessageBegin("ExportModelToDDIFile", ::apache::thrift::protocol::T_CALL, cseqid);

  DDIModelExchangeService_ExportModelToDDIFile_pargs args;
  args.Path = &Path;
  args.ODEPackage = &ODEPackage;
  args.write(oprot_);

  oprot_->writeMessageEnd();
  oprot_->getTransport()->writeEnd();
  oprot_->getTransport()->flush();

  sentry.commit();
  return cseqid;
}

void DDIModelExchangeServiceConcurrentClient::recv_ExportModelToDDIFile(const int32_t seqid)
{

  int32_t rseqid = 0;
  std::string fname;
  ::apache::thrift::protocol::TMessageType mtype;

  // the read mutex gets dropped and reacquired as part of waitForWork()
  // The destructor of this sentry wakes up other clients
  ::apache::thrift::async::TConcurrentRecvSentry sentry(&this->sync_, seqid);

  while(true) {
    if(!this->sync_.getPending(fname, mtype, rseqid)) {
      iprot_->readMessageBegin(fname, mtype, rseqid);
    }
    if(seqid == rseqid) {
      if (mtype == ::apache::thrift::protocol::T_EXCEPTION) {
        ::apache::thrift::TApplicationException x;
        x.read(iprot_);
        iprot_->readMessageEnd();
        iprot_->getTransport()->readEnd();
        sentry.commit();
        throw x;
      }
      if (mtype != ::apache::thrift::protocol::T_REPLY) {
        iprot_->skip(::apache::thrift::protocol::T_STRUCT);
        iprot_->readMessageEnd();
        iprot_->getTransport()->readEnd();
      }
      if (fname.compare("ExportModelToDDIFile") != 0) {
        iprot_->skip(::apache::thrift::protocol::T_STRUCT);
        iprot_->readMessageEnd();
        iprot_->getTransport()->readEnd();

        // in a bad state, don't commit
        using ::apache::thrift::protocol::TProtocolException;
        throw TProtocolException(TProtocolException::INVALID_DATA);
      }
      DDIModelExchangeService_ExportModelToDDIFile_presult result;
      result.read(iprot_);
      iprot_->readMessageEnd();
      iprot_->getTransport()->readEnd();

      if (result.__isset.ValidationFailedException) {
        sentry.commit();
        throw result.ValidationFailedException;
      }
      sentry.commit();
      return;
    }
    // seqid != rseqid
    this->sync_.updatePending(fname, mtype, rseqid);

    // this will temporarily unlock the readMutex, and let other clients get work done
    this->sync_.waitForWork(seqid);
  } // end while(true)
}

void DDIModelExchangeServiceConcurrentClient::ImportDDIModel(TDDIAbstractODEPackage& _return, const std::string& Path)
{
  int32_t seqid = send_ImportDDIModel(Path);
  recv_ImportDDIModel(_return, seqid);
}

int32_t DDIModelExchangeServiceConcurrentClient::send_ImportDDIModel(const std::string& Path)
{
  int32_t cseqid = this->sync_.generateSeqId();
  ::apache::thrift::async::TConcurrentSendSentry sentry(&this->sync_);
  oprot_->writeMessageBegin("ImportDDIModel", ::apache::thrift::protocol::T_CALL, cseqid);

  DDIModelExchangeService_ImportDDIModel_pargs args;
  args.Path = &Path;
  args.write(oprot_);

  oprot_->writeMessageEnd();
  oprot_->getTransport()->writeEnd();
  oprot_->getTransport()->flush();

  sentry.commit();
  return cseqid;
}

void DDIModelExchangeServiceConcurrentClient::recv_ImportDDIModel(TDDIAbstractODEPackage& _return, const int32_t seqid)
{

  int32_t rseqid = 0;
  std::string fname;
  ::apache::thrift::protocol::TMessageType mtype;

  // the read mutex gets dropped and reacquired as part of waitForWork()
  // The destructor of this sentry wakes up other clients
  ::apache::thrift::async::TConcurrentRecvSentry sentry(&this->sync_, seqid);

  while(true) {
    if(!this->sync_.getPending(fname, mtype, rseqid)) {
      iprot_->readMessageBegin(fname, mtype, rseqid);
    }
    if(seqid == rseqid) {
      if (mtype == ::apache::thrift::protocol::T_EXCEPTION) {
        ::apache::thrift::TApplicationException x;
        x.read(iprot_);
        iprot_->readMessageEnd();
        iprot_->getTransport()->readEnd();
        sentry.commit();
        throw x;
      }
      if (mtype != ::apache::thrift::protocol::T_REPLY) {
        iprot_->skip(::apache::thrift::protocol::T_STRUCT);
        iprot_->readMessageEnd();
        iprot_->getTransport()->readEnd();
      }
      if (fname.compare("ImportDDIModel") != 0) {
        iprot_->skip(::apache::thrift::protocol::T_STRUCT);
        iprot_->readMessageEnd();
        iprot_->getTransport()->readEnd();

        // in a bad state, don't commit
        using ::apache::thrift::protocol::TProtocolException;
        throw TProtocolException(TProtocolException::INVALID_DATA);
      }
      DDIModelExchangeService_ImportDDIModel_presult result;
      result.success = &_return;
      result.read(iprot_);
      iprot_->readMessageEnd();
      iprot_->getTransport()->readEnd();

      if (result.__isset.success) {
        // _return pointer has now been filled
        sentry.commit();
        return;
      }
      if (result.__isset.ValidationFailedException) {
        sentry.commit();
        throw result.ValidationFailedException;
      }
      // in a bad state, don't commit
      throw ::apache::thrift::TApplicationException(::apache::thrift::TApplicationException::MISSING_RESULT, "ImportDDIModel failed: unknown result");
    }
    // seqid != rseqid
    this->sync_.updatePending(fname, mtype, rseqid);

    // this will temporarily unlock the readMutex, and let other clients get work done
    this->sync_.waitForWork(seqid);
  } // end while(true)
}

void DDIModelExchangeServiceConcurrentClient::ValidateDdi(TDDIValidationResult& _return, const std::string& DdiPath, const std::string& EvlFilePath)
{
  int32_t seqid = send_ValidateDdi(DdiPath, EvlFilePath);
  recv_ValidateDdi(_return, seqid);
}

int32_t DDIModelExchangeServiceConcurrentClient::send_ValidateDdi(const std::string& DdiPath, const std::string& EvlFilePath)
{
  int32_t cseqid = this->sync_.generateSeqId();
  ::apache::thrift::async::TConcurrentSendSentry sentry(&this->sync_);
  oprot_->writeMessageBegin("ValidateDdi", ::apache::thrift::protocol::T_CALL, cseqid);

  DDIModelExchangeService_ValidateDdi_pargs args;
  args.DdiPath = &DdiPath;
  args.EvlFilePath = &EvlFilePath;
  args.write(oprot_);

  oprot_->writeMessageEnd();
  oprot_->getTransport()->writeEnd();
  oprot_->getTransport()->flush();

  sentry.commit();
  return cseqid;
}

void DDIModelExchangeServiceConcurrentClient::recv_ValidateDdi(TDDIValidationResult& _return, const int32_t seqid)
{

  int32_t rseqid = 0;
  std::string fname;
  ::apache::thrift::protocol::TMessageType mtype;

  // the read mutex gets dropped and reacquired as part of waitForWork()
  // The destructor of this sentry wakes up other clients
  ::apache::thrift::async::TConcurrentRecvSentry sentry(&this->sync_, seqid);

  while(true) {
    if(!this->sync_.getPending(fname, mtype, rseqid)) {
      iprot_->readMessageBegin(fname, mtype, rseqid);
    }
    if(seqid == rseqid) {
      if (mtype == ::apache::thrift::protocol::T_EXCEPTION) {
        ::apache::thrift::TApplicationException x;
        x.read(iprot_);
        iprot_->readMessageEnd();
        iprot_->getTransport()->readEnd();
        sentry.commit();
        throw x;
      }
      if (mtype != ::apache::thrift::protocol::T_REPLY) {
        iprot_->skip(::apache::thrift::protocol::T_STRUCT);
        iprot_->readMessageEnd();
        iprot_->getTransport()->readEnd();
      }
      if (fname.compare("ValidateDdi") != 0) {
        iprot_->skip(::apache::thrift::protocol::T_STRUCT);
        iprot_->readMessageEnd();
        iprot_->getTransport()->readEnd();

        // in a bad state, don't commit
        using ::apache::thrift::protocol::TProtocolException;
        throw TProtocolException(TProtocolException::INVALID_DATA);
      }
      DDIModelExchangeService_ValidateDdi_presult result;
      result.success = &_return;
      result.read(iprot_);
      iprot_->readMessageEnd();
      iprot_->getTransport()->readEnd();

      if (result.__isset.success) {
        // _return pointer has now been filled
        sentry.commit();
        return;
      }
      // in a bad state, don't commit
      throw ::apache::thrift::TApplicationException(::apache::thrift::TApplicationException::MISSING_RESULT, "ValidateDdi failed: unknown result");
    }
    // seqid != rseqid
    this->sync_.updatePending(fname, mtype, rseqid);

    // this will temporarily unlock the readMutex, and let other clients get work done
    this->sync_.waitForWork(seqid);
  } // end while(true)
}

} // namespace
