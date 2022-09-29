package GenericLibraries;

import io.restassured.response.Response;

/**
 * this class consist of generic method related to restAssured
 * @return 
 */
public class RestAssuredLibaray {
/**
 * This method will fetch the data based on json Path
 * @param response
 * @param path
 * @return
 */
	
	public String getJsonData(Response response, String path)
	{
		String jsondata = response.jsonPath().get(path);
		return jsondata;
	}
}
