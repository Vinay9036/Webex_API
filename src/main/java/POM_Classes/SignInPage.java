package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utilities.BaseClass;

public class SignInPage extends BaseClass{

	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement signInButton;
	
	@FindBy(xpath="//span[text()='Join a meeting']")
	private WebElement joinMeetingButton;
	
	@FindBy(xpath="//span[text()='Create a new account']")
	private WebElement createNewAccountLink;

	public WebElement getSignInButton() {
		return signInButton;
	}

	public WebElement getJoinMeetingButton() {
		return joinMeetingButton;
	}

	public WebElement getCreateNewAccountLink() {
		return createNewAccountLink;
	}
	public void signIn() {
		signInButton.click();
	}
}
