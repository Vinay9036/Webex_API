package Webex_Automation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Token_Utility;
import POM_Classes.EnterEmailPage;
import POM_Classes.MFAPage;
import POM_Classes.SignInPage;
import POM_Classes.WebexHomePage;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Validate_Creating_Rooms extends BaseClass{
	
	@Test(priority = 0)
	public void createRoom() throws Throwable {
		
		 String bearerToken = Token_Utility.getBearerToken();
		JSONObject jobj=new JSONObject();
		jobj.put("title", "Automation space");
		jobj.put("description", "This is used for automation");
		
		RestAssured.given().body(jobj).contentType(ContentType.JSON).auth().oauth2(bearerToken)
		.when().post("/v1/rooms")
		.then().assertThat()
		.contentType(ContentType.JSON)
		.statusCode(200)
		.log().all();
		
	}
	@Test(priority = 1)
	public void validateRoom() {
		
		SignInPage sip=new SignInPage(driver);
		sip.signIn();
		
		EnterEmailPage eep=new EnterEmailPage(driver);
		eep.enterEmail();
		
		MFAPage mfa=new MFAPage(driver);
		mfa.mfaPush();
		
		WebexHomePage wh = new WebexHomePage(driver);
		wh.validateRoom();
	}
}
