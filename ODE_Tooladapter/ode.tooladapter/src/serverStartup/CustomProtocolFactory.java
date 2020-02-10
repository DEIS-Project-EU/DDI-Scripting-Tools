package serverStartup;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.TTransport;

public class CustomProtocolFactory implements TProtocolFactory {

	protected Boolean strictRead_ = false;
	protected Boolean strictWrite_ = false;
	
	
	
	@Override
	public TProtocol getProtocol(TTransport arg0) {
		TBinaryProtocol prot = new TBinaryProtocol(arg0, 999999999, 999999999, strictRead_, strictWrite_);
		
		
		
		// TODO Auto-generated method stub
		return prot;
	}

}
