package Demo_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToAmazon {

	public LoginToAmazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setSearchField(WebElement searchField) {
		this.searchField = searchField;
	}
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchField;
	
	public WebElement getSearchField() {
		return searchField;
	}
	public void enterProduct() {
		searchField.click();
		searchField.sendKeys("Shoes");
	}
	
}
