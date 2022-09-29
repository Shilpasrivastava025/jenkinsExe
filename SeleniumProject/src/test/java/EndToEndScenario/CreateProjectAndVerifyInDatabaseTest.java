package EndToEndScenario;

import org.testng.annotations.Test;

import GenericLibraries.BaseAPIClass;
import GenericLibraries.EndPointLibrary;
import POJOLibraies.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

public class CreateProjectAndVerifyInDatabaseTest extends BaseAPIClass {
@Test

	public void createProjectAndVerifyInDatabaseTest() throws SQLException
	{
		// Step 1 : create prerequisites
		ProjectLibrary plib = new ProjectLibrary("Shilpa", "SDET39Online"+jlib.getRandomNumber(), "Created", 15);
		
		// step 2: send the post request
		Response response = given()
			.body(plib)
			.contentType(ContentType.JSON)
			.when()
			.post(EndPointLibrary.createProject);

		// Steps 3 : capture the project ID
		String ExpData=rlib.getJsonData(response, "projectId");
			System.out.println(ExpData);
			
		//Step 4: Verify the project ID in dataBase
			String Query = "Select * from project";
			String actualData = dlib.executeQueryandReturnData(Query,1 , ExpData);
	        Assert.assertEquals(actualData, ExpData); 
	
	
	
	}
}
