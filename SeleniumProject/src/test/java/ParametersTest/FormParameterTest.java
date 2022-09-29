package ParametersTest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class FormParameterTest {
	@Test
	public void formParamter()
	{
		baseURI="http://localhost";
		port= 8084;
		
		// create pre requisites
		
		// send the request and validate the response
		given()
		.formParam("createdBy","Shilpa")
		.formParam("projectName", "TYSS")
		.formParam("status", "completed")
		.formParam("teamSize", 12)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/addProject")
		.then()
		.log().all();
	
	}

	
	
}
