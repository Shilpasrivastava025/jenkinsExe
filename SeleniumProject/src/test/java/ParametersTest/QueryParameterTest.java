package ParametersTest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParameterTest {
	@Test
	public void queryParameter()
	{

		baseURI="https://reqres.in";
	
		// send the request and validate the response
		given()
		.queryParam("page", 2)
		.when()
		.get("/api/users")
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	}

}
