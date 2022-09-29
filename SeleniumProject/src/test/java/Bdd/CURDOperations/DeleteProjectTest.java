package Bdd.CURDOperations;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteProjectTest {
	@Test
	public void deleteProject()
	{
		baseURI="http://localhost";
		port= 8084;
		
		//Create prerequisites
		
		
		 when()        //send the request
		.delete("/projects/TY_PROJ_1202")
	    .then()   	  //validate the request
		.assertThat()
		.statusCode(204)
		.log().all();
		//validate the request
		
	}

}
