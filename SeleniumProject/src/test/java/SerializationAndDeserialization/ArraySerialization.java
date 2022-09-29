package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import practice_POJO_SerDes.EmpolyeeDetails_Array;

public class ArraySerialization {
	@Test
	public void arraySerialization() throws JsonGenerationException, JsonMappingException, IOException
	{
		int a[]= {96148215};
		EmpolyeeDetails_Array empd= new EmpolyeeDetails_Array("Shilpa", a , "Shilpa@gmail.com", "bangalore", true);
		
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File(".\\ArrayData.json"), empd);
		
	}

}
