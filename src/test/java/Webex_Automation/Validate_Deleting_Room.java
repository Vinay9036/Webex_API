package Webex_Automation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Token_Utility;
import POM_Classes.EnterEmailPage;
import POM_Classes.MFAPage;
import POM_Classes.SignInPage;
import POM_Classes.WebexHomePage;
import io.restassured.RestAssured;

public class Validate_Deleting_Room extends BaseClass{
	
	@Test(priority = 0)
	public void deleteRoom() throws Throwable {
		
		String bearerToken = Token_Utility.getBearerToken();
		RestAssured.given().auth().oauth2(bearerToken)
		.when().delete("/v1/rooms/{roomId}","Y2lzY29zcGFyazovL3VzL1JPT00vZDY2N2YwOTAtYTZiOS0xMWVkLWEyZDYtZGZiNTE4NWZlNzNl")
		.then().statusCode(204)
		.log().all();
	}

@Test(priority = 1)
public void deleteSpace() {
	
	SignInPage sip=new SignInPage(driver);
	sip.signIn();
	
	EnterEmailPage eep=new EnterEmailPage(driver);
	eep.enterEmail();
	
	MFAPage mfa=new MFAPage(driver);
	mfa.mfaPush();
	
	//WebexHomePage wh =new WebexHomePage(driver);
	try {
		driver.findElement(By.xpath("//p[text()='Automation space']"));
		Assert.fail("The space was not deleted");
	}catch(Exception e){
		Assert.assertTrue(true,"The space is successfully deleted");
	}
}
}