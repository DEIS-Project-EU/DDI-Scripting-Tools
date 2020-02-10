/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "ExternalService.h"

namespace thriftContract {


ExternalService_InvokeExternalService_args::~ExternalService_InvokeExternalService_args() throw() {
}


uint32_t ExternalService_InvokeExternalService_args::read(::apache::thrift::protocol::TProtocol* iprot) {

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
          xfer += this->DDIPackage.read(iprot);
          this->__isset.DDIPackage = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->ServiceId);
          this->__isset.ServiceId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->ServiceParameter.clear();
            uint32_t _size2834;
            ::apache::thrift::protocol::TType _etype2837;
            xfer += iprot->readListBegin(_etype2837, _size2834);
            this->ServiceParameter.resize(_size2834);
            uint32_t _i2838;
            for (_i2838 = 0; _i2838 < _size2834; ++_i2838)
            {
              xfer += this->ServiceParameter[_i2838].read(iprot);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.ServiceParameter = true;
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

uint32_t ExternalService_InvokeExternalService_args::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  ::apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("ExternalService_InvokeExternalService_args");

  xfer += oprot->writeFieldBegin("DDIPackage", ::apache::thrift::protocol::T_STRUCT, 1);
  xfer += this->DDIPackage.write(oprot);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("ServiceId", ::apache::thrift::protocol::T_STRING, 2);
  xfer += oprot->writeString(this->ServiceId);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("ServiceParameter", ::apache::thrift::protocol::T_LIST, 3);
  {
    xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRUCT, static_cast<uint32_t>(this->ServiceParameter.size()));
    std::vector<TDDIExternalServiceParameter> ::const_iterator _iter2839;
    for (_iter2839 = this->ServiceParameter.begin(); _iter2839 != this->ServiceParameter.end(); ++_iter2839)
    {
      xfer += (*_iter2839).write(oprot);
    }
    xfer += oprot->writeListEnd();
  }
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}


ExternalService_InvokeExternalService_pargs::~ExternalService_InvokeExternalService_pargs() throw() {
}


uint32_t ExternalService_InvokeExternalService_pargs::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  ::apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("ExternalService_InvokeExternalService_pargs");

  xfer += oprot->writeFieldBegin("DDIPackage", ::apache::thrift::protocol::T_STRUCT, 1);
  xfer += (*(this->DDIPackage)).write(oprot);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("ServiceId", ::apache::thrift::protocol::T_STRING, 2);
  xfer += oprot->writeString((*(this->ServiceId)));
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("ServiceParameter", ::apache::thrift::protocol::T_LIST, 3);
  {
    xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRUCT, static_cast<uint32_t>((*(this->ServiceParameter)).size()));
    std::vector<TDDIExternalServiceParameter> ::const_iterator _iter2840;
    for (_iter2840 = (*(this->ServiceParameter)).begin(); _iter2840 != (*(this->ServiceParameter)).end(); ++_iter2840)
    {
      xfer += (*_iter2840).write(oprot);
    }
    xfer += oprot->writeListEnd();
  }
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}


ExternalService_InvokeExternalService_result::~ExternalService_InvokeExternalService_result() throw() {
}


uint32_t ExternalService_InvokeExternalService_result::read(::apache::thrift::protocol::TProtocol* iprot) {

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

uint32_t ExternalService_InvokeExternalService_result::write(::apache::thrift::protocol::TProtocol* oprot) const {

  uint32_t xfer = 0;

  xfer += oprot->writeStructBegin("ExternalService_InvokeExternalService_result");

  if (this->__isset.success) {
    xfer += oprot->writeFieldBegin("success", ::apache::thrift::protocol::T_STRUCT, 0);
    xfer += this->success.write(oprot);
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}


ExternalService_InvokeExternalService_presult::~ExternalService_InvokeExternalService_presult() throw() {
}


uint32_t ExternalService_InvokeExternalService_presult::read(::apache::thrift::protocol::TProtocol* iprot) {

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

void ExternalServiceClient::InvokeExternalService(TDDIDDIPackage& _return, const TDDIDDIPackage& DDIPackage, const std::string& ServiceId, const std::vector<TDDIExternalServiceParameter> & ServiceParameter)
{
  send_InvokeExternalService(DDIPackage, ServiceId, ServiceParameter);
  recv_InvokeExternalService(_return);
}

void ExternalServiceClient::send_InvokeExternalService(const TDDIDDIPackage& DDIPackage, const std::string& ServiceId, const std::vector<TDDIExternalServiceParameter> & ServiceParameter)
{
  int32_t cseqid = 0;
  oprot_->writeMessageBegin("InvokeExternalService", ::apache::thrift::protocol::T_CALL, cseqid);

  ExternalService_InvokeExternalService_pargs args;
  args.DDIPackage = &DDIPackage;
  args.ServiceId = &ServiceId;
  args.ServiceParameter = &ServiceParameter;
  args.write(oprot_);

  oprot_->writeMessageEnd();
  oprot_->getTransport()->writeEnd();
  oprot_->getTransport()->flush();
}

void ExternalServiceClient::recv_InvokeExternalService(TDDIDDIPackage& _return)
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
  if (fname.compare("InvokeExternalService") != 0) {
    iprot_->skip(::apache::thrift::protocol::T_STRUCT);
    iprot_->readMessageEnd();
    iprot_->getTransport()->readEnd();
  }
  ExternalService_InvokeExternalService_presult result;
  result.success = &_return;
  result.read(iprot_);
  iprot_->readMessageEnd();
  iprot_->getTransport()->readEnd();

  if (result.__isset.success) {
    // _return pointer has now been filled
    return;
  }
  throw ::apache::thrift::TApplicationException(::apache::thrift::TApplicationException::MISSING_RESULT, "InvokeExternalService failed: unknown result");
}

bool ExternalServiceProcessor::dispatchCall(::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, const std::string& fname, int32_t seqid, void* callContext) {
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

void ExternalServiceProcessor::process_InvokeExternalService(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext)
{
  void* ctx = NULL;
  if (this->eventHandler_.get() != NULL) {
    ctx = this->eventHandler_->getContext("ExternalService.InvokeExternalService", callContext);
  }
  ::apache::thrift::TProcessorContextFreer freer(this->eventHandler_.get(), ctx, "ExternalService.InvokeExternalService");

  if (this->eventHandler_.get() != NULL) {
    this->eventHandler_->preRead(ctx, "ExternalService.InvokeExternalService");
  }

  ExternalService_InvokeExternalService_args args;
  args.read(iprot);
  iprot->readMessageEnd();
  uint32_t bytes = iprot->getTransport()->readEnd();

  if (this->eventHandler_.get() != NULL) {
    this->eventHandler_->postRead(ctx, "ExternalService.InvokeExternalService", bytes);
  }

  ExternalService_InvokeExternalService_result result;
  try {
    iface_->InvokeExternalService(result.success, args.DDIPackage, args.ServiceId, args.ServiceParameter);
    result.__isset.success = true;
  } catch (const std::exception& e) {
    if (this->eventHandler_.get() != NULL) {
      this->eventHandler_->handlerError(ctx, "ExternalService.InvokeExternalService");
    }

    ::apache::thrift::TApplicationException x(e.what());
    oprot->writeMessageBegin("InvokeExternalService", ::apache::thrift::protocol::T_EXCEPTION, seqid);
    x.write(oprot);
    oprot->writeMessageEnd();
    oprot->getTransport()->writeEnd();
    oprot->getTransport()->flush();
    return;
  }

  if (this->eventHandler_.get() != NULL) {
    this->eventHandler_->preWrite(ctx, "ExternalService.InvokeExternalService");
  }

  oprot->writeMessageBegin("InvokeExternalService", ::apache::thrift::protocol::T_REPLY, seqid);
  result.write(oprot);
  oprot->writeMessageEnd();
  bytes = oprot->getTransport()->writeEnd();
  oprot->getTransport()->flush();

  if (this->eventHandler_.get() != NULL) {
    this->eventHandler_->postWrite(ctx, "ExternalService.InvokeExternalService", bytes);
  }
}

::apache::thrift::stdcxx::shared_ptr< ::apache::thrift::TProcessor > ExternalServiceProcessorFactory::getProcessor(const ::apache::thrift::TConnectionInfo& connInfo) {
  ::apache::thrift::ReleaseHandler< ExternalServiceIfFactory > cleanup(handlerFactory_);
  ::apache::thrift::stdcxx::shared_ptr< ExternalServiceIf > handler(handlerFactory_->getHandler(connInfo), cleanup);
  ::apache::thrift::stdcxx::shared_ptr< ::apache::thrift::TProcessor > processor(new ExternalServiceProcessor(handler));
  return processor;
}

void ExternalServiceConcurrentClient::InvokeExternalService(TDDIDDIPackage& _return, const TDDIDDIPackage& DDIPackage, const std::string& ServiceId, const std::vector<TDDIExternalServiceParameter> & ServiceParameter)
{
  int32_t seqid = send_InvokeExternalService(DDIPackage, ServiceId, ServiceParameter);
  recv_InvokeExternalService(_return, seqid);
}

int32_t ExternalServiceConcurrentClient::send_InvokeExternalService(const TDDIDDIPackage& DDIPackage, const std::string& ServiceId, const std::vector<TDDIExternalServiceParameter> & ServiceParameter)
{
  int32_t cseqid = this->sync_.generateSeqId();
  ::apache::thrift::async::TConcurrentSendSentry sentry(&this->sync_);
  oprot_->writeMessageBegin("InvokeExternalService", ::apache::thrift::protocol::T_CALL, cseqid);

  ExternalService_InvokeExternalService_pargs args;
  args.DDIPackage = &DDIPackage;
  args.ServiceId = &ServiceId;
  args.ServiceParameter = &ServiceParameter;
  args.write(oprot_);

  oprot_->writeMessageEnd();
  oprot_->getTransport()->writeEnd();
  oprot_->getTransport()->flush();

  sentry.commit();
  return cseqid;
}

void ExternalServiceConcurrentClient::recv_InvokeExternalService(TDDIDDIPackage& _return, const int32_t seqid)
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
      if (fname.compare("InvokeExternalService") != 0) {
        iprot_->skip(::apache::thrift::protocol::T_STRUCT);
        iprot_->readMessageEnd();
        iprot_->getTransport()->readEnd();

        // in a bad state, don't commit
        using ::apache::thrift::protocol::TProtocolException;
        throw TProtocolException(TProtocolException::INVALID_DATA);
      }
      ExternalService_InvokeExternalService_presult result;
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
      throw ::apache::thrift::TApplicationException(::apache::thrift::TApplicationException::MISSING_RESULT, "InvokeExternalService failed: unknown result");
    }
    // seqid != rseqid
    this->sync_.updatePending(fname, mtype, rseqid);

    // this will temporarily unlock the readMutex, and let other clients get work done
    this->sync_.waitForWork(seqid);
  } // end while(true)
}

} // namespace

