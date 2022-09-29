package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import practice_POJO_SerDes.EmployeeDetails_Object;
import practice_POJO_SerDes.Spouse_EmployeeDetailsObject;

public class ObjectSerilization {

	@Test
	public void objectSerilization() throws JsonGenerationException, JsonMappingException, IOException {
		int arr[]= {56974613, 968272124};
		
		Spouse_EmployeeDetailsObject sobj= new Spouse_EmployeeDetailsObject("abc", "abc@gmail.com", arr, "TY9696");
		EmployeeDetails_Object empObj= new EmployeeDetails_Object("shilpa", arr, "abc@gmail.com", sobj , "TY8969");
		
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("./ObjectData.json"),empObj );

	}
}
