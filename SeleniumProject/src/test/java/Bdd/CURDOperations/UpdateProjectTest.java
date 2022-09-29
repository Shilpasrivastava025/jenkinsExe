package Bdd.CURDOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProjectTest {
@Test
public void updateProject()
{
	baseURI="http://localhost";
	port= 8084;
	//Create the prerequisites
	JSONObject obj = new JSONObject();
	obj.put("createdBy", "Shilpa");
	obj.put("projectName", "SDET");
	obj.put("status", "on-going");
	obj.put("teamSize", 20);
	
	//send and validate the request
	given()
	.body(obj)
	.contentType(ContentType.JSON)

	.when()
	.put("/projects/TY_PROJ_1202")
	.then()
	.assertThat()
	.statusCode(200)
	.contentType(ContentType.JSON)
	.log().all();
	
}
}
