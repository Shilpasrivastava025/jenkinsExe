package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import practice_POJO_SerDes.EmployeeDetails;

public class Serialization {
	
	@Test
	public void SerializationTest() throws Throwable, JsonMappingException, IOException
	
	{
		//Step 1 : create an object of POJO class
		EmployeeDetails emp = new EmployeeDetails("shilpa", 123654987, "TY123", "s@gmail.com", true);
		
		// Step 2: create object of objectMapper class from jacksonMapper
		//( we are utilizing the method write value)
		ObjectMapper obj = new ObjectMapper();
		
		// Step 3 : call write value method and provide the file path
		obj.writeValue(new File(".\\Data.json"), emp);
		
     }

}
