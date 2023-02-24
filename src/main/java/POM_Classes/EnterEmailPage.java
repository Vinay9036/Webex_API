package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utilities.BaseClass;

public class EnterEmailPage extends BaseClass{
	
	public EnterEmailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@placeholder='Email address']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nextButton;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getNextButton() {
		return nextButton;
	}
	public void enterEmail() {
		emailTextField.sendKeys("vkc@akamai.com");
		nextButton.click();
	}
}
