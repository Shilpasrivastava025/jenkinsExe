package basicCURDOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {
@Test
public void updateProject()
{
	//Step 1: create pre requisites
	JSONObject obj = new JSONObject();
	obj.put("createdBy", "Shilpa");
	obj.put("projectName", "SDET");
	obj.put("status", "process");
	obj.put("teamSize", 20);
	
	// Steps2 : send the request
    RequestSpecification request = RestAssured.given();
	request.body(obj);
	request.contentType(ContentType.JSON);
	Response response = request.put("http://localhost:8084/projects/TY_PROJ_1203");
	//steps 3: validate the response
	System.out.println(response.getStatusCode());
	
	
}
}
