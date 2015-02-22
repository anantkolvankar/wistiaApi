package wsapi;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wsapi.ApiUtil;

public class Media {
	
	static String resource = "medias";
	
	//Used to get all medias in account
	public static JSONArray getAll(){
		
		JSONArray mediaJsonArray = null; 
		String allMedias= ApiUtil.getResourceData(resource);
		
		 try {
			mediaJsonArray = new JSONArray(allMedias);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		    return mediaJsonArray;
	}
	
	//Used to get media json based on hashedId
	public static JSONObject getByHashedId(String hashedId){
		
		resource = resource + "/"+hashedId;
		String media= ApiUtil.getResourceData(resource);
		
		JSONObject mediaJsonObj = null;
		try {
			mediaJsonObj = new JSONObject(media);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(NullPointerException e){
			System.out.println("Media not found");
		}
		return mediaJsonObj;
		
	}
	

}
