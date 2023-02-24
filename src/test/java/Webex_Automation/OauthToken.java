package Webex_Automation;

import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;

import static io.restassured.RestAssured.*;

public class OauthToken extends BaseClass{

	@Test
	public void generateOauthToken() {
		
		given().auth().oauth2("NTIyODkyMzctZGY4Yi00NTQxLWIzNTEtMDk4YjNiNzA3ZTQ1YWEzMGMxYTEtYzM3_PF84_a3749315-ae09-4a52-806c-2c3222fa7c2c")
		.when().get("/v1/authorizations")
		.then().assertThat().log().all();
	}
}
