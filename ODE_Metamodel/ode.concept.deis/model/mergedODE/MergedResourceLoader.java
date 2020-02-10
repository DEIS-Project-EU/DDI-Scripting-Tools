package mergedODE;

import java.net.URI;
import java.net.URISyntaxException;

public class MergedResourceLoader {

	public static URI getEcoreUri(String ecoreFileName) throws URISyntaxException{
		
		URI ecoreUri = MergedResourceLoader.class.getResource(ecoreFileName).toURI();
		return ecoreUri;
	}
	
	public static String getEcorePath(String ecoreFileName) throws URISyntaxException{
		
		URI ecoreUri = getEcoreUri(ecoreFileName);
		return ecoreUri.getPath();
	}
	
}
