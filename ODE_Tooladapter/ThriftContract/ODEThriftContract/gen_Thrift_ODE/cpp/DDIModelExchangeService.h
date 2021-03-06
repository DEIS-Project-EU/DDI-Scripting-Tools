/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef DDIModelExchangeService_H
#define DDIModelExchangeService_H

#include <thrift/TDispatchProcessor.h>
#include <thrift/async/TConcurrentClientSyncInfo.h>
#include "mergedDDIThriftContract_types.h"

namespace thriftContract {

#ifdef _MSC_VER
  #pragma warning( push )
  #pragma warning (disable : 4250 ) //inheriting methods via dominance 
#endif

class DDIModelExchangeServiceIf {
 public:
  virtual ~DDIModelExchangeServiceIf() {}
  virtual void ExportModelToDDIFile(const std::string& Path, const TDDIAbstractODEPackage& ODEPackage) = 0;
  virtual void ImportDDIModel(TDDIAbstractODEPackage& _return, const std::string& Path) = 0;
  virtual void ValidateDdi(TDDIValidationResult& _return, const std::string& DdiPath, const std::string& EvlFilePath) = 0;
};

class DDIModelExchangeServiceIfFactory {
 public:
  typedef DDIModelExchangeServiceIf Handler;

  virtual ~DDIModelExchangeServiceIfFactory() {}

  virtual DDIModelExchangeServiceIf* getHandler(const ::apache::thrift::TConnectionInfo& connInfo) = 0;
  virtual void releaseHandler(DDIModelExchangeServiceIf* /* handler */) = 0;
};

class DDIModelExchangeServiceIfSingletonFactory : virtual public DDIModelExchangeServiceIfFactory {
 public:
  DDIModelExchangeServiceIfSingletonFactory(const ::apache::thrift::stdcxx::shared_ptr<DDIModelExchangeServiceIf>& iface) : iface_(iface) {}
  virtual ~DDIModelExchangeServiceIfSingletonFactory() {}

  virtual DDIModelExchangeServiceIf* getHandler(const ::apache::thrift::TConnectionInfo&) {
    return iface_.get();
  }
  virtual void releaseHandler(DDIModelExchangeServiceIf* /* handler */) {}

 protected:
  ::apache::thrift::stdcxx::shared_ptr<DDIModelExchangeServiceIf> iface_;
};

class DDIModelExchangeServiceNull : virtual public DDIModelExchangeServiceIf {
 public:
  virtual ~DDIModelExchangeServiceNull() {}
  void ExportModelToDDIFile(const std::string& /* Path */, const TDDIAbstractODEPackage& /* ODEPackage */) {
    return;
  }
  void ImportDDIModel(TDDIAbstractODEPackage& /* _return */, const std::string& /* Path */) {
    return;
  }
  void ValidateDdi(TDDIValidationResult& /* _return */, const std::string& /* DdiPath */, const std::string& /* EvlFilePath */) {
    return;
  }
};

typedef struct _DDIModelExchangeService_ExportModelToDDIFile_args__isset {
  _DDIModelExchangeService_ExportModelToDDIFile_args__isset() : Path(false), ODEPackage(false) {}
  bool Path :1;
  bool ODEPackage :1;
} _DDIModelExchangeService_ExportModelToDDIFile_args__isset;

class DDIModelExchangeService_ExportModelToDDIFile_args {
 public:

  DDIModelExchangeService_ExportModelToDDIFile_args(const DDIModelExchangeService_ExportModelToDDIFile_args&);
  DDIModelExchangeService_ExportModelToDDIFile_args& operator=(const DDIModelExchangeService_ExportModelToDDIFile_args&);
  DDIModelExchangeService_ExportModelToDDIFile_args() : Path() {
  }

  virtual ~DDIModelExchangeService_ExportModelToDDIFile_args() throw();
  std::string Path;
  TDDIAbstractODEPackage ODEPackage;

  _DDIModelExchangeService_ExportModelToDDIFile_args__isset __isset;

  void __set_Path(const std::string& val);

  void __set_ODEPackage(const TDDIAbstractODEPackage& val);

  bool operator == (const DDIModelExchangeService_ExportModelToDDIFile_args & rhs) const
  {
    if (!(Path == rhs.Path))
      return false;
    if (!(ODEPackage == rhs.ODEPackage))
      return false;
    return true;
  }
  bool operator != (const DDIModelExchangeService_ExportModelToDDIFile_args &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const DDIModelExchangeService_ExportModelToDDIFile_args & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};


class DDIModelExchangeService_ExportModelToDDIFile_pargs {
 public:


  virtual ~DDIModelExchangeService_ExportModelToDDIFile_pargs() throw();
  const std::string* Path;
  const TDDIAbstractODEPackage* ODEPackage;

  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _DDIModelExchangeService_ExportModelToDDIFile_result__isset {
  _DDIModelExchangeService_ExportModelToDDIFile_result__isset() : ValidationFailedException(false) {}
  bool ValidationFailedException :1;
} _DDIModelExchangeService_ExportModelToDDIFile_result__isset;

class DDIModelExchangeService_ExportModelToDDIFile_result {
 public:

  DDIModelExchangeService_ExportModelToDDIFile_result(const DDIModelExchangeService_ExportModelToDDIFile_result&);
  DDIModelExchangeService_ExportModelToDDIFile_result& operator=(const DDIModelExchangeService_ExportModelToDDIFile_result&);
  DDIModelExchangeService_ExportModelToDDIFile_result() {
  }

  virtual ~DDIModelExchangeService_ExportModelToDDIFile_result() throw();
  TDDIValidationFailedException ValidationFailedException;

  _DDIModelExchangeService_ExportModelToDDIFile_result__isset __isset;

  void __set_ValidationFailedException(const TDDIValidationFailedException& val);

  bool operator == (const DDIModelExchangeService_ExportModelToDDIFile_result & rhs) const
  {
    if (!(ValidationFailedException == rhs.ValidationFailedException))
      return false;
    return true;
  }
  bool operator != (const DDIModelExchangeService_ExportModelToDDIFile_result &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const DDIModelExchangeService_ExportModelToDDIFile_result & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _DDIModelExchangeService_ExportModelToDDIFile_presult__isset {
  _DDIModelExchangeService_ExportModelToDDIFile_presult__isset() : ValidationFailedException(false) {}
  bool ValidationFailedException :1;
} _DDIModelExchangeService_ExportModelToDDIFile_presult__isset;

class DDIModelExchangeService_ExportModelToDDIFile_presult {
 public:


  virtual ~DDIModelExchangeService_ExportModelToDDIFile_presult() throw();
  TDDIValidationFailedException ValidationFailedException;

  _DDIModelExchangeService_ExportModelToDDIFile_presult__isset __isset;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);

};

typedef struct _DDIModelExchangeService_ImportDDIModel_args__isset {
  _DDIModelExchangeService_ImportDDIModel_args__isset() : Path(false) {}
  bool Path :1;
} _DDIModelExchangeService_ImportDDIModel_args__isset;

class DDIModelExchangeService_ImportDDIModel_args {
 public:

  DDIModelExchangeService_ImportDDIModel_args(const DDIModelExchangeService_ImportDDIModel_args&);
  DDIModelExchangeService_ImportDDIModel_args& operator=(const DDIModelExchangeService_ImportDDIModel_args&);
  DDIModelExchangeService_ImportDDIModel_args() : Path() {
  }

  virtual ~DDIModelExchangeService_ImportDDIModel_args() throw();
  std::string Path;

  _DDIModelExchangeService_ImportDDIModel_args__isset __isset;

  void __set_Path(const std::string& val);

  bool operator == (const DDIModelExchangeService_ImportDDIModel_args & rhs) const
  {
    if (!(Path == rhs.Path))
      return false;
    return true;
  }
  bool operator != (const DDIModelExchangeService_ImportDDIModel_args &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const DDIModelExchangeService_ImportDDIModel_args & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};


class DDIModelExchangeService_ImportDDIModel_pargs {
 public:


  virtual ~DDIModelExchangeService_ImportDDIModel_pargs() throw();
  const std::string* Path;

  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _DDIModelExchangeService_ImportDDIModel_result__isset {
  _DDIModelExchangeService_ImportDDIModel_result__isset() : success(false), ValidationFailedException(false) {}
  bool success :1;
  bool ValidationFailedException :1;
} _DDIModelExchangeService_ImportDDIModel_result__isset;

class DDIModelExchangeService_ImportDDIModel_result {
 public:

  DDIModelExchangeService_ImportDDIModel_result(const DDIModelExchangeService_ImportDDIModel_result&);
  DDIModelExchangeService_ImportDDIModel_result& operator=(const DDIModelExchangeService_ImportDDIModel_result&);
  DDIModelExchangeService_ImportDDIModel_result() {
  }

  virtual ~DDIModelExchangeService_ImportDDIModel_result() throw();
  TDDIAbstractODEPackage success;
  TDDIValidationFailedException ValidationFailedException;

  _DDIModelExchangeService_ImportDDIModel_result__isset __isset;

  void __set_success(const TDDIAbstractODEPackage& val);

  void __set_ValidationFailedException(const TDDIValidationFailedException& val);

  bool operator == (const DDIModelExchangeService_ImportDDIModel_result & rhs) const
  {
    if (!(success == rhs.success))
      return false;
    if (!(ValidationFailedException == rhs.ValidationFailedException))
      return false;
    return true;
  }
  bool operator != (const DDIModelExchangeService_ImportDDIModel_result &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const DDIModelExchangeService_ImportDDIModel_result & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _DDIModelExchangeService_ImportDDIModel_presult__isset {
  _DDIModelExchangeService_ImportDDIModel_presult__isset() : success(false), ValidationFailedException(false) {}
  bool success :1;
  bool ValidationFailedException :1;
} _DDIModelExchangeService_ImportDDIModel_presult__isset;

class DDIModelExchangeService_ImportDDIModel_presult {
 public:


  virtual ~DDIModelExchangeService_ImportDDIModel_presult() throw();
  TDDIAbstractODEPackage* success;
  TDDIValidationFailedException ValidationFailedException;

  _DDIModelExchangeService_ImportDDIModel_presult__isset __isset;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);

};

typedef struct _DDIModelExchangeService_ValidateDdi_args__isset {
  _DDIModelExchangeService_ValidateDdi_args__isset() : DdiPath(false), EvlFilePath(false) {}
  bool DdiPath :1;
  bool EvlFilePath :1;
} _DDIModelExchangeService_ValidateDdi_args__isset;

class DDIModelExchangeService_ValidateDdi_args {
 public:

  DDIModelExchangeService_ValidateDdi_args(const DDIModelExchangeService_ValidateDdi_args&);
  DDIModelExchangeService_ValidateDdi_args& operator=(const DDIModelExchangeService_ValidateDdi_args&);
  DDIModelExchangeService_ValidateDdi_args() : DdiPath(), EvlFilePath() {
  }

  virtual ~DDIModelExchangeService_ValidateDdi_args() throw();
  std::string DdiPath;
  std::string EvlFilePath;

  _DDIModelExchangeService_ValidateDdi_args__isset __isset;

  void __set_DdiPath(const std::string& val);

  void __set_EvlFilePath(const std::string& val);

  bool operator == (const DDIModelExchangeService_ValidateDdi_args & rhs) const
  {
    if (!(DdiPath == rhs.DdiPath))
      return false;
    if (!(EvlFilePath == rhs.EvlFilePath))
      return false;
    return true;
  }
  bool operator != (const DDIModelExchangeService_ValidateDdi_args &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const DDIModelExchangeService_ValidateDdi_args & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};


class DDIModelExchangeService_ValidateDdi_pargs {
 public:


  virtual ~DDIModelExchangeService_ValidateDdi_pargs() throw();
  const std::string* DdiPath;
  const std::string* EvlFilePath;

  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _DDIModelExchangeService_ValidateDdi_result__isset {
  _DDIModelExchangeService_ValidateDdi_result__isset() : success(false) {}
  bool success :1;
} _DDIModelExchangeService_ValidateDdi_result__isset;

class DDIModelExchangeService_ValidateDdi_result {
 public:

  DDIModelExchangeService_ValidateDdi_result(const DDIModelExchangeService_ValidateDdi_result&);
  DDIModelExchangeService_ValidateDdi_result& operator=(const DDIModelExchangeService_ValidateDdi_result&);
  DDIModelExchangeService_ValidateDdi_result() {
  }

  virtual ~DDIModelExchangeService_ValidateDdi_result() throw();
  TDDIValidationResult success;

  _DDIModelExchangeService_ValidateDdi_result__isset __isset;

  void __set_success(const TDDIValidationResult& val);

  bool operator == (const DDIModelExchangeService_ValidateDdi_result & rhs) const
  {
    if (!(success == rhs.success))
      return false;
    return true;
  }
  bool operator != (const DDIModelExchangeService_ValidateDdi_result &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const DDIModelExchangeService_ValidateDdi_result & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _DDIModelExchangeService_ValidateDdi_presult__isset {
  _DDIModelExchangeService_ValidateDdi_presult__isset() : success(false) {}
  bool success :1;
} _DDIModelExchangeService_ValidateDdi_presult__isset;

class DDIModelExchangeService_ValidateDdi_presult {
 public:


  virtual ~DDIModelExchangeService_ValidateDdi_presult() throw();
  TDDIValidationResult* success;

  _DDIModelExchangeService_ValidateDdi_presult__isset __isset;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);

};

class DDIModelExchangeServiceClient : virtual public DDIModelExchangeServiceIf {
 public:
  DDIModelExchangeServiceClient(apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) {
    setProtocol(prot);
  }
  DDIModelExchangeServiceClient(apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) {
    setProtocol(iprot,oprot);
  }
 private:
  void setProtocol(apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) {
  setProtocol(prot,prot);
  }
  void setProtocol(apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) {
    piprot_=iprot;
    poprot_=oprot;
    iprot_ = iprot.get();
    oprot_ = oprot.get();
  }
 public:
  apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> getInputProtocol() {
    return piprot_;
  }
  apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> getOutputProtocol() {
    return poprot_;
  }
  void ExportModelToDDIFile(const std::string& Path, const TDDIAbstractODEPackage& ODEPackage);
  void send_ExportModelToDDIFile(const std::string& Path, const TDDIAbstractODEPackage& ODEPackage);
  void recv_ExportModelToDDIFile();
  void ImportDDIModel(TDDIAbstractODEPackage& _return, const std::string& Path);
  void send_ImportDDIModel(const std::string& Path);
  void recv_ImportDDIModel(TDDIAbstractODEPackage& _return);
  void ValidateDdi(TDDIValidationResult& _return, const std::string& DdiPath, const std::string& EvlFilePath);
  void send_ValidateDdi(const std::string& DdiPath, const std::string& EvlFilePath);
  void recv_ValidateDdi(TDDIValidationResult& _return);
 protected:
  apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> piprot_;
  apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> poprot_;
  ::apache::thrift::protocol::TProtocol* iprot_;
  ::apache::thrift::protocol::TProtocol* oprot_;
};

class DDIModelExchangeServiceProcessor : public ::apache::thrift::TDispatchProcessor {
 protected:
  ::apache::thrift::stdcxx::shared_ptr<DDIModelExchangeServiceIf> iface_;
  virtual bool dispatchCall(::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, const std::string& fname, int32_t seqid, void* callContext);
 private:
  typedef  void (DDIModelExchangeServiceProcessor::*ProcessFunction)(int32_t, ::apache::thrift::protocol::TProtocol*, ::apache::thrift::protocol::TProtocol*, void*);
  typedef std::map<std::string, ProcessFunction> ProcessMap;
  ProcessMap processMap_;
  void process_ExportModelToDDIFile(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext);
  void process_ImportDDIModel(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext);
  void process_ValidateDdi(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext);
 public:
  DDIModelExchangeServiceProcessor(::apache::thrift::stdcxx::shared_ptr<DDIModelExchangeServiceIf> iface) :
    iface_(iface) {
    processMap_["ExportModelToDDIFile"] = &DDIModelExchangeServiceProcessor::process_ExportModelToDDIFile;
    processMap_["ImportDDIModel"] = &DDIModelExchangeServiceProcessor::process_ImportDDIModel;
    processMap_["ValidateDdi"] = &DDIModelExchangeServiceProcessor::process_ValidateDdi;
  }

  virtual ~DDIModelExchangeServiceProcessor() {}
};

class DDIModelExchangeServiceProcessorFactory : public ::apache::thrift::TProcessorFactory {
 public:
  DDIModelExchangeServiceProcessorFactory(const ::apache::thrift::stdcxx::shared_ptr< DDIModelExchangeServiceIfFactory >& handlerFactory) :
      handlerFactory_(handlerFactory) {}

  ::apache::thrift::stdcxx::shared_ptr< ::apache::thrift::TProcessor > getProcessor(const ::apache::thrift::TConnectionInfo& connInfo);

 protected:
  ::apache::thrift::stdcxx::shared_ptr< DDIModelExchangeServiceIfFactory > handlerFactory_;
};

class DDIModelExchangeServiceMultiface : virtual public DDIModelExchangeServiceIf {
 public:
  DDIModelExchangeServiceMultiface(std::vector<apache::thrift::stdcxx::shared_ptr<DDIModelExchangeServiceIf> >& ifaces) : ifaces_(ifaces) {
  }
  virtual ~DDIModelExchangeServiceMultiface() {}
 protected:
  std::vector<apache::thrift::stdcxx::shared_ptr<DDIModelExchangeServiceIf> > ifaces_;
  DDIModelExchangeServiceMultiface() {}
  void add(::apache::thrift::stdcxx::shared_ptr<DDIModelExchangeServiceIf> iface) {
    ifaces_.push_back(iface);
  }
 public:
  void ExportModelToDDIFile(const std::string& Path, const TDDIAbstractODEPackage& ODEPackage) {
    size_t sz = ifaces_.size();
    size_t i = 0;
    for (; i < (sz - 1); ++i) {
      ifaces_[i]->ExportModelToDDIFile(Path, ODEPackage);
    }
    ifaces_[i]->ExportModelToDDIFile(Path, ODEPackage);
  }

  void ImportDDIModel(TDDIAbstractODEPackage& _return, const std::string& Path) {
    size_t sz = ifaces_.size();
    size_t i = 0;
    for (; i < (sz - 1); ++i) {
      ifaces_[i]->ImportDDIModel(_return, Path);
    }
    ifaces_[i]->ImportDDIModel(_return, Path);
    return;
  }

  void ValidateDdi(TDDIValidationResult& _return, const std::string& DdiPath, const std::string& EvlFilePath) {
    size_t sz = ifaces_.size();
    size_t i = 0;
    for (; i < (sz - 1); ++i) {
      ifaces_[i]->ValidateDdi(_return, DdiPath, EvlFilePath);
    }
    ifaces_[i]->ValidateDdi(_return, DdiPath, EvlFilePath);
    return;
  }

};

// The 'concurrent' client is a thread safe client that correctly handles
// out of order responses.  It is slower than the regular client, so should
// only be used when you need to share a connection among multiple threads
class DDIModelExchangeServiceConcurrentClient : virtual public DDIModelExchangeServiceIf {
 public:
  DDIModelExchangeServiceConcurrentClient(apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) {
    setProtocol(prot);
  }
  DDIModelExchangeServiceConcurrentClient(apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) {
    setProtocol(iprot,oprot);
  }
 private:
  void setProtocol(apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) {
  setProtocol(prot,prot);
  }
  void setProtocol(apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) {
    piprot_=iprot;
    poprot_=oprot;
    iprot_ = iprot.get();
    oprot_ = oprot.get();
  }
 public:
  apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> getInputProtocol() {
    return piprot_;
  }
  apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> getOutputProtocol() {
    return poprot_;
  }
  void ExportModelToDDIFile(const std::string& Path, const TDDIAbstractODEPackage& ODEPackage);
  int32_t send_ExportModelToDDIFile(const std::string& Path, const TDDIAbstractODEPackage& ODEPackage);
  void recv_ExportModelToDDIFile(const int32_t seqid);
  void ImportDDIModel(TDDIAbstractODEPackage& _return, const std::string& Path);
  int32_t send_ImportDDIModel(const std::string& Path);
  void recv_ImportDDIModel(TDDIAbstractODEPackage& _return, const int32_t seqid);
  void ValidateDdi(TDDIValidationResult& _return, const std::string& DdiPath, const std::string& EvlFilePath);
  int32_t send_ValidateDdi(const std::string& DdiPath, const std::string& EvlFilePath);
  void recv_ValidateDdi(TDDIValidationResult& _return, const int32_t seqid);
 protected:
  apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> piprot_;
  apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> poprot_;
  ::apache::thrift::protocol::TProtocol* iprot_;
  ::apache::thrift::protocol::TProtocol* oprot_;
  ::apache::thrift::async::TConcurrentClientSyncInfo sync_;
};

#ifdef _MSC_VER
  #pragma warning( pop )
#endif

} // namespace

#endif
