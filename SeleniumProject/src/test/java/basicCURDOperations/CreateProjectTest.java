package basicCURDOperations;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
	@Test
	public void createProjectTest()
	{
		Random ram= new Random();
		int random = ram.nextInt(500);
		
		//Step 1: Create the prerequisites(request body) necessary
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "Shilpa");
		obj.put("projectName", "SDET" + random);
		obj.put("status", "ongoing");
		obj.put("teamSize", 20);
		
		//Step 2 : Send the request
		RequestSpecification request = RestAssured.given();
		request.body(obj);
		request.contentType(ContentType.JSON);
		
		Response response = request.post("http://localhost:8084/addProject");
		
		//step 3: validate the response
		System.out.println(response.getContentType());
		System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        
        System.out.println(response.prettyPrint());
        System.out.println(response.prettyPeek());
	}

}
