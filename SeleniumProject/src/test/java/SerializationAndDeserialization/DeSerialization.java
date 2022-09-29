package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import practice_POJO_SerDes.EmployeeDetails;

public class DeSerialization {
	
	@Test
	public void deSerializationTest() throws JsonParseException, JsonMappingException, IOException
	{
		// Step 1: Create Object of object Mapper
		ObjectMapper obj= new ObjectMapper();
		
		// Step 2 : read the value from object mapper class
		 EmployeeDetails emp = obj.readValue(new File(".\\Data.json"), EmployeeDetails .class);
		
		//Step 3 : access the value reference
		 System.out.println(emp.getEmail());
		emp.setName("abc");
	}

}
