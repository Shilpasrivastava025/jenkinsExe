package basicCURDOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetAllProjectTest {

	@Test
	public void getAllProject()
	{
		//Step 1: create pre requisites
		// in get we do not need any pre-requisites
		//step 2: send the request
		Response response = RestAssured.get("http://localhost:8084/projects");

		// validate the response
		int expStatus= 200;
		int actualStatus = response.getStatusCode();
		Assert.assertEquals(actualStatus, expStatus);
	}
}
