package basicCURDOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProjectTest {
	@Test
	public void deleteProject()
	{
		//Steps 1: create pre requisites
		
		// steps 2: send the request
		Response response = RestAssured.delete("http://localhost:8084/TY_PROJ_1203");
		//steps 3: validate the response
		System.out.println(response.getStatusCode());
	}

}
