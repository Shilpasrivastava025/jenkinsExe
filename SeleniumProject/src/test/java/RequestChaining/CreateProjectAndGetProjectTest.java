package RequestChaining;

import org.testng.annotations.Test;

import POJOLibraies.JavaLibrary;
import POJOLibraies.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreateProjectAndGetProjectTest {
@Test
public void createProjectAndGetProject()
{
	// create prerequisites
	baseURI= "http://localhost";
	port=8084;
	JavaLibrary jlib= new JavaLibrary();
	ProjectLibrary plib= new ProjectLibrary("Shilpa", "hp"+jlib.getRandomNumber(), "created", 12);
	
	Response response = given()
	                   .body(plib)
	                   .contentType(ContentType.JSON)
	                   .when()
	                   .post("/addProject");
	
	
	//Capture the projectID
		String projectID = response.jsonPath().get("projectId");
		System.out.println(projectID);
		//response.then().log().all();
		//Create get request and pass projectID as path parameter
		given()
		.pathParam("PID", projectID)
		.when()
		.get("/projects/{PID}")
		.then()
		.assertThat().statusCode(200).log().all();
}
}
