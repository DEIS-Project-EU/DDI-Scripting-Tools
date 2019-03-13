package sacm;

import java.net.URI;
import java.net.URISyntaxException;

public class SacmEcoreResourceLoader {

static SacmEcoreResourceLoader rl = new SacmEcoreResourceLoader();
	
	public static URI getEcoreUri(String ecoreFileName) throws URISyntaxException{
		URI ecoreUri = SacmEcoreResourceLoader.class.getResource(ecoreFileName).toURI();
		//URL ecoreUrl = EcoreResourceLoader.class.getResource(ecoreFileName);
		
		return ecoreUri;
	}
	
	public static String getEcorePath(String ecoreFileName) throws URISyntaxException{
		
		
		URI ecoreUri = getEcoreUri(ecoreFileName);
		return ecoreUri.getPath();
		//return ecoreUri.toString();
		
		//return rl.getClass().getResource(ecoreFileName).getPath();
	}
	
}
