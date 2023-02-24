package Generic_Utilities;

import static io.restassured.RestAssured.baseURI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	
	ExcelUtility elib = new ExcelUtility();
	FileUtility flib = new FileUtility();
	WebDriverUtility wlib = new WebDriverUtility();
	JavaUtility jlib = new JavaUtility();

	@BeforeSuite
	public void configBS() {
		System.out.println("start");
		 baseURI="https://webexapis.com";
	}
	@BeforeTest
	public void configBT() {
		System.out.println("Test");
	}
	@BeforeClass
	public void configBC() {
		System.out.println("Launch browser");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--start-maximized");
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://web.webex.com/sign-in");
	}
	
	@BeforeMethod
	public void configBM() {
		System.out.println("");
		
	}
	
	@AfterMethod
	public void configAM() {
		System.out.println("");
	}
	
	@AfterClass
	public void configAC() {
		System.out.println("");
//		driver.close();;
	}
	@AfterTest
	public void configAT() {
		System.out.println("");
	}
	@AfterSuite
	public void config() {
		System.out.println("Finish");
	}
}
