package GenericLibraries;

import java.sql.SQLException;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

/**
 * This class will contains basic configuration annotations
 * @author Shilpa
 *
 */

public class BaseAPIClass {
	
	public DatabaseLibrary dlib = new DatabaseLibrary();
	public JavaLibrary jlib = new JavaLibrary();
	public RestAssuredLibaray rlib = new RestAssuredLibaray();
	
	@BeforeSuite // for database connection
	public void bsConfig() throws SQLException
	{
		dlib.connectToDatabase();
		Reporter.log("==========DB connection Establish================", true);
		
		baseURI= IConstantsLibrary.appURL;
		port= IConstantsLibrary.appPort;
		
	}
	
	@AfterSuite
	public void asConfig() throws SQLException
	{
		dlib.closeDb();
		Reporter.log("===========database connection close=======", true);
	}
	

}
