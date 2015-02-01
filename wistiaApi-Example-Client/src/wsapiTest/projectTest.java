package wsapiTest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import wsapi.ApiUtil;
import wsapi.Project;
public class projectTest {
	
	public static void main(String[] args) throws JSONException  {

	    
	    System.out.println("Setting Api key");
	    ApiUtil.API_PASSWORD="496afc14822ab0609232aa2c0caaa2ef31f9348b";
	    
	    System.out.println("Using Api key:-"+ApiUtil.API_PASSWORD);
	    
	    // Get All Project
	    JSONArray allProjects=Project.getAll();
	    
	    System.out.println("\nGet json array of projects in your account:-");
	    System.out.println(allProjects);   
	    
	    System.out.println("\nGet a project json from json array of projects:-");
	    System.out.println(allProjects.getJSONObject(1));
	  
	    // Get project by hashed id
	    JSONObject project = Project.getByHashedId("eoi3z7ghnx");
	    
	    System.out.println("\nGet project json in your account with id:- eoi3z7ghnx");
	    System.out.println(project);
	    
	    JSONObject projectJsonObj = project;
	    System.out.println("\nGet project name from project json:-");
	    System.out.println(projectJsonObj.getString("name"));
	    

	}
}
