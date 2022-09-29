package DifferentWaysToPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Random;

public class CreateProjectUsingHashMap {
	@Test
	public void createProjectUsingHashMap()
	{
		Random ran= new Random();
		int random = ran.nextInt(500);
			
		baseURI= "http://localhost";
		port= 8084;
		//create pre requisites
		HashMap map= new HashMap();
		map.put("createdBy", "Praveen");
		map.put("projectName","Sony"+random);
		map.put("status", "process");
		map.put("teamSize",4 );
		
		// send and validate the request
		given()
		.body(map)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/addProject")
		
		.then()
		.assertThat()
		.statusCode(201)
		.log().all();
	}

}
