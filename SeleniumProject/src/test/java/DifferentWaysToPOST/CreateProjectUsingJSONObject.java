package DifferentWaysToPOST;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingJSONObject {
	
	@Test
	public void createProjectUsingJSON()
	{
		Random ran= new Random();
		int random = ran.nextInt(500);
			
		baseURI= "http://localhost";
		port= 8084;
		//create pre requistes
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "Shilpa");
		obj.put("projectName", "SDET" + random);
		obj.put("status", "ongoing");
		obj.put("teamSize", 20);
		// send the request
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then() //validate the request
		.assertThat()
		.statusCode(201)
		.log().all();
		
		
		
	}

}
