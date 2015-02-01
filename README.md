# wistiaApi
Wistia Data API Java library is a solution to access <a href="http://wistia.com/doc/data-api" >wistia's data api</a> from your java application. To use this library 
just import wistiaApi.jar file from above repo in your project.
Go through <a href="https://github.com/anantkolvankar/wistiaApi/tree/master/wistiaApi-Example-Client">wistia api client example</a> for easy usage.
### Basic Usage 

Import our java library packages.
```
import wsapi.ApiUtil;
import wsapi.Project;
```
Configure your <a href="http://wistia.com/doc/data-api#getting_started">API password</a>
```
ApiUtil.API_PASSWORD="your-api-password-here";
```
### Examples

List all Projects in your account:
```
JSONArray allProjects=Project.getAll();
```
Get project based on hashedId
```
JSONObject project = Project.getByHashedId("your-project-hashed-id");
//getting project name
System.out.println(project.getString("name"));
```
### WistiaApi Client Example java application

You can go through <a href="https://github.com/anantkolvankar/wistiaApi/tree/master/wistiaApi-Example-Client">wistiaApi-example-client application</a>, which show a simple way to use our library. 
