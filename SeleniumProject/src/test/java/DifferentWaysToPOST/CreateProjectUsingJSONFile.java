package DifferentWaysToPOST;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProjectUsingJSONFile {
@Test
public void createProjectUsingJSONFile()
{
	baseURI= "http://localhost";
	port= 8084;
	File file = new File(".\\FileData.json");
	
	//send the request and validate
	given()
	.body(file)
	.contentType(ContentType.JSON)
	
	.when()
	.post("/addProject")
	.then()
	.log().all();
}
}
