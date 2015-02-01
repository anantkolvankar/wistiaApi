package wsapi;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;


public class ApiUtil {
		
	static String BASE_URL="https://api.wistia.com";
	static String API_VERSION="v1";
	public static String API_PASSWORD="";
	
	private static WebTarget getWebTarget(){
		
	ClientConfig config = new ClientConfig();

    Client client = ClientBuilder.newClient(config);
 
    WebTarget target = client.target(getBaseURI());
    
	return target;
	}
	
	private static URI getBaseURI() {

		    return UriBuilder.fromUri(BASE_URL).build();

    }
	
	// params - resource should be string for format eg:- 'projects.json' or 'projects/<project-hashed-id>.json'
	public static String getResourceData(String resource){
		
		resource = resource + ".json";
		WebTarget target = getWebTarget();
		String response = null;
		try{
	
		 response = target.path(API_VERSION).path(resource).queryParam("api_password", API_PASSWORD).request()

		    .accept(MediaType.APPLICATION_JSON).get(String.class);
		 
		}catch(javax.ws.rs.NotFoundException e){
			
			System.out.println("Invalid url");
		}
		return response;
	}
}
