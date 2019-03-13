package resourcePackage;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class EcoreResourceLoader {

	static EcoreResourceLoader rl = new EcoreResourceLoader();
	
	public static URI getEcoreUri(String ecoreFileName) throws URISyntaxException{
		URI ecoreUri = EcoreResourceLoader.class.getResource(ecoreFileName).toURI();
		//URL ecoreUrl = EcoreResourceLoader.class.getResource(ecoreFileName);
		
		return ecoreUri;
	}
	
	public static String getEcorePath(String ecoreFileName) throws URISyntaxException{
		
		
		URI ecoreUri = getEcoreUri(ecoreFileName);
		
		//return ecoreUri.toString();
		
		return rl.getClass().getResource(ecoreFileName).getPath();
	}
}
