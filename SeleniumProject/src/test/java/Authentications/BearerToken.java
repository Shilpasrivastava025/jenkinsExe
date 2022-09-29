package Authentications;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BearerToken {
	@Test
	public void bearerToken()
	{
		baseURI= "https://api.github.com";
	
		JSONObject jObj= new JSONObject();
		jObj.put("name", "SDET-39RestAssured");
		jObj.put("description", "hybrideFW");
		
		
		given()
		.auth()
		.oauth2("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")
		.body(jObj)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/user/repos")
		
		.then().log().all();
		
		
	}

}
