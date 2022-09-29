package Bdd.CURDOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectTest {

	@Test
	public void createProject()
	{
		baseURI="http://localhost";
		port= 8084;
		//create prerequisites
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "Shilpa");
		obj.put("projectName", "SDET-online");
		obj.put("status", "ongoing");
		obj.put("teamSize", 20);
		
		// send the request
		given()
		.body(obj)
		.contentType(ContentType.JSON)
	   .when()
	   .post("/addProject")
	   .then()
	   .assertThat().statusCode(201)
	   .log().all();
		
		// validate the request
	}
}
