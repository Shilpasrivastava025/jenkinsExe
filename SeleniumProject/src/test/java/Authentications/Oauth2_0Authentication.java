package Authentications;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth2_0Authentication {
@Test
public void oAuth2Authentication()
{
	baseURI="http://coop.apps.symfonycasts.com";
	// generate the access token - POST
	Response response = given()
						.formParam("client_id", "SDET_39")
						.formParam("client_secret", "b55508b3dc1483ce54815eedcac558f6")
						.formParam("grant_type", "client_credentials")
						.formParam("redirect_uri", "http://abc.come")
						.formParam("code", "authorization_code")
						.when()
						.post("/token");
	
	// Capture the Access token
	String token = response.jsonPath().get("access_token");
	System.out.println(token);
	
	// use it for other end points
		given()
		.pathParam("USER_ID", 3852)
		.auth()
		.oauth2(token)
		
		.when()
		.post("/api/{USER_ID}/eggs-collect")
		.then().log().all();
	
}
}
