package DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POJOLibraies.JavaLibrary;
import POJOLibraies.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class MultipleProjectWithSingleReqTest {
	@Test(dataProvider = "getData")
	public void multipleProjectWithSingleReq(String createdBy, String projectName, String status, int teamSize)
	
	{
		baseURI="http://localhost";
		port = 8084;
		
	    // create prerequisites
		JavaLibrary jlib= new JavaLibrary();
		ProjectLibrary plib = new ProjectLibrary(createdBy, projectName+jlib.getRandomNumber(), status, teamSize);		given()
		.body(plib)
		.contentType(ContentType.JSON)
		
		// send the response
		.when()
		.post("/addProject")
		
		//Validation
		.then()
		.log().all();
	}
	
	@DataProvider(name="getData")
	public Object[][]data()
	{
		Object[][]data= new Object[10][4];
		data[0][0]="Shilpa";
		data[0][1]="Dell";
		data[0][2]="completed";
		data[0][3]=12;
		
		data[1][0]="Praveen";
		data[1][1]="Hp";
		data[1][2]="Created";
		data[1][3]=15;
	
		data[2][0]="Abc";
		data[2][1]="Sony";
		data[2][2]="Completed";
		data[2][3]=10;
	
	
		data[3][0]="Xyz";
		data[3][1]="Flipkart";
		data[3][2]="On-going";
		data[3][3]=12;
	
		data[4][0]="Muneera";
		data[4][1]="NOKIA";
		data[4][2]="Completed";
		data[4][3]=12;
		
		data[5][0]="John";
		data[5][1]="Samsung";
		data[5][2]="Process";
		data[5][3]=20;
		
		data[6][0]="Ram";
		data[6][1]="Myntra";
		data[6][2]="Created";
		data[6][3]=10;
		
		data[7][0]="Vijay";
		data[7][1]="Amazon";
		data[7][2]="Completed";
		data[7][3]=18;
		
		data[8][0]="Pavan";
		data[8][1]="Nokia";
		data[8][2]="Completed";
		data[8][3]=20;
		
		data[9][0]="Mohan";
		data[9][1]="Google";
		data[9][2]="Created";
		data[9][3]=10;
	
		return data;
	
	}
}
