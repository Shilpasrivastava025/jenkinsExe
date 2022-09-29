package ResponseValidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class StaticResponseValidationTest {
	@Test
	public void staticResponseValidation()
	{
		//Create prerequisites
		String expectedData = "TY_PROJ_1604";
		baseURI="http://localhost";
		port= 8084;
		
		// send the response
		Response response = when()
		 .get("/projects");
		
		String actualData = response.jsonPath().get("[1].projectId");
		
		// validate the response
		Assert.assertEquals(actualData, actualData);
		System.out.println(actualData);
		//response.then().log().all();
	}

}
