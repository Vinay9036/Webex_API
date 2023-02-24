package Webex_Automation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Validate_Creating_Message {

	@Test
	public void createMessage() {
	 JSONObject jobj = new JSONObject();
	 jobj.put("roomId", "");
	 jobj.put("text", "");
	 
	 given().body(jobj).contentType(ContentType.JSON).auth().oauth2("NTIyODkyMzctZGY4Yi00NTQxLWIzNTEtMDk4YjNiNzA3ZTQ1YWEzMGMxYTEtYzM3_PF84_a3749315-ae09-4a52-806c-2c3222fa7c2c")
	 .when().post("/v1/messages")
	 .then().assertThat()
	 .contentType(ContentType.JSON)
	 .statusCode(200)
	 .log().all();
	}
	
	@Test
	public void sendMessage() {
		
	}
}
