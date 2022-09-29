package ResponseValidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicResponseValidationTest {
	@Test
	public void dynamicResponseValidation()
	{
		baseURI= "http://localhost";
		port= 8084;
		 String expData = "TY_PROJ_1603";
		// create prerequisites
		
		// send the request
		Response response = when()
		                     .get("/projects");
		//validate the response
		boolean flag= false;
	    List<String> Ids= response.jsonPath().get("projectId");
		for(String actData: Ids)
		{
			if(actData.equalsIgnoreCase(expData))
			{
				System.out.println(actData);
				flag= true;
				break;
			}
		}
		Assert.assertTrue(flag);
		
		//response.then().log().all();
		
	}

}
