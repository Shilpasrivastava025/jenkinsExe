package ParametersTest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameterTest {
	@Test
	public void pathParameter()
	{
		// create pre requisites
		baseURI="http://localhost";
		port= 8084;
		
		//send the request and validate the response
		given()
		.pathParam("pid", "TY_PROJ_1612")
		.when()
		.get("/projects/{pid}")
		.then().assertThat().statusCode(200)
		.log().all();
	}

}
