package pages;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class ApiPage {

    private Response response;
    

    public Response sendGet(String url) {
        response = given()
            .header("Accept", "application/json; charset=utf-8")
            .header("Accept-Charset", "utf-8")
            .header("Content-Type", "application/json; charset=utf-8")
            .header("Gtw-Branch-Id", "9999")
            .header("Gtw-Password", "integracaogw")
            .header("Gtw-Username", "api.support")
            .get(url);
        
        return response;
    }
    
    public int getStatusCode() {
    	return response.getStatusCode();
    }
    public String getResponseBody() {
    	return response.getBody().asPrettyString();
    }
    public boolean responseBodyContains(String palavra) {
    	String responseBody = getResponseBody();
    	return responseBody.contains(palavra);
    }
}