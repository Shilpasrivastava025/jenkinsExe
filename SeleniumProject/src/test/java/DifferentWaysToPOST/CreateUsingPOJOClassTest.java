package DifferentWaysToPOST;

import org.testng.annotations.Test;

import POJOLibraies.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateUsingPOJOClassTest {
@Test

public void createUsingPOJOclass()
{
	baseURI= "http://localhost";
	port= 8084;
	Random ran = new Random();
	int random = ran.nextInt(500);
	// Create prerequisites
	ProjectLibrary plib = new ProjectLibrary("Shilpa", "Xylem"+random, "Created", 10);
	
 // send and validate the request
	given()
	.body(plib)
	.contentType(ContentType.JSON)
	
	.when()
	.post("/addProject")
	
	.then()
	.assertThat()
	.statusCode(201)
	.log().all();
}
}
