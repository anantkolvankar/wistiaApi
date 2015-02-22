package wsapiTest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import wsapi.ApiUtil;
import wsapi.Media;
public class mediaTest {
	
	public static void main(String[] args) throws JSONException  {

	    
	    System.out.println("Setting Api key");
	    ApiUtil.API_PASSWORD="496afc14822ab0609232aa2c0caaa2ef31f9348b";
	    
	    System.out.println("Using Api key:-"+ApiUtil.API_PASSWORD);
	    
	    // Get All Media
	    JSONArray allMedias=Media.getAll();
	    
	    System.out.println("\nGet json array of medias in your account:-");
	    System.out.println(allMedias);   
	    
	    System.out.println("\nGet a media json from json array of medias:-");
	    System.out.println(allMedias.getJSONObject(1));
	  
	    // Get media by hashed id
	    JSONObject media = Media.getByHashedId("z5tvnjfv9j");
	    
	    System.out.println("\nGet media json in your account with id:- z5tvnjfv9j");
	    System.out.println(media);
	    
	    JSONObject mediaJsonObj = media;
	    System.out.println("\nGet media name from media json:-");
	    System.out.println(mediaJsonObj.getString("name"));
	    

	}
}
