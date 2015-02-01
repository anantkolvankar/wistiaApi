package wsapi;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wsapi.ApiUtil;

public class Project {
	
	static String resource = "projects";
	
	//Used to get all projects in account
	public static JSONArray getAll(){
		
		JSONArray projectJsonArray = null; 
		String allProjects= ApiUtil.getResourceData(resource);
		
		 try {
			projectJsonArray = new JSONArray(allProjects);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		    return projectJsonArray;
	}
	
	//Used to get project json based on hashedId
	public static JSONObject getByHashedId(String hashedId){
		
		resource = resource + "/"+hashedId;
		String project= ApiUtil.getResourceData(resource);
		
		JSONObject projectJsonObj = null;
		try {
			projectJsonObj = new JSONObject(project);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(NullPointerException e){
			System.out.println("Project not found");
		}
		return projectJsonObj;
		
	}
	

}
