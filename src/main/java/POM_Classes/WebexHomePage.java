package POM_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebexHomePage {

	public WebexHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//p[text()='Automation space']")
		private WebElement titleOfTheSpace;
		
		@FindBy(xpath="//div[contains(text(),\"Let's start chatting\")]")
		private WebElement welcomeMessage;
		
		@FindBy(xpath="//h2[@class='md-text-wrapper primary-info']")
		private WebElement expectedTitleOfTheSpace;

		public WebElement getExpectedTitleOfTheSpace() {
			return expectedTitleOfTheSpace;
		}

		public WebElement getTitleOfTheSpace() {
			return titleOfTheSpace;
		}

		public WebElement getWelcomeMessage() {
			return welcomeMessage;
		}
		
		public void validateRoom() {
			titleOfTheSpace.click();
			String msg=welcomeMessage.getText();
			String title = expectedTitleOfTheSpace.getText();
			System.out.println("title: "+ title);
			System.out.println("Welcome Message : "+ msg);
		}
		public void checkSpaceIsDeleted() {
			titleOfTheSpace.findElement(By.xpath(null));
			
		}
	
}
