package Bdd.CURDOperations;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetAllProjectsTest {
	@Test
	public void getAllProjects()
	{
		baseURI="http://localhost";
		port= 8084;
		//create prerequisites
		
		// send the request
		when()
		.get("/projects")
		.then()
		.log().all();
		// validate the request
		
	}

}
