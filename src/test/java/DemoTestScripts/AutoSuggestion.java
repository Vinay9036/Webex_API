package DemoTestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	WebDriver driver;
	@Test
		public void autoSuggestion() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//driver.findElement(By.name("q")).sendKeys("shoes");
		
//		WebElement item = driver.findElement(By.xpath("//div[text()='in Casual Shoes' and @class]"));
//		System.out.println(item.getText());
		
//		List<WebElement> shoes=driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
//		for(WebElement list:shoes) {
//			System.out.println(list.getText());
//		}
//		
//		//Select class example
//		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
//		WebElement sel = driver.findElement(By.xpath("//div[@class='_1YAKP4']"));
//		Select s=new Select(sel);
//		s.selectByValue("10000");
//		
////		//Actions class example
//		WebElement act = driver.findElement(By.xpath("//div[text()='Fashion']"));
//		Actions a = new Actions(driver);
//		a.moveToElement(act).perform();
//		
		//Assertion
		driver.findElement(By.xpath("//span[text()='Become a Seller']/parent::a[@class='_3-PJz-']")).click();
		String url = driver.getCurrentUrl();
		System.out.println("*******url not found*******");
		SoftAssert a = new SoftAssert();
		a.assertEquals(url, true);
		
		driver.close();
	}
}
