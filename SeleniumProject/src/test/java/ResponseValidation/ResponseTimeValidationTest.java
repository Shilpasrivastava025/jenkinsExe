package ResponseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ResponseTimeValidationTest {
@Test
public void responseTimeValidation()
{
	baseURI= "http://localhost";
	port = 8084;
	
	//step create prerequisites
	// send the request
     when()
	 .get("/projects") 
     .then()  	// validate the response
	 .assertThat().time(Matchers.lessThan(500L));
	
}
}
