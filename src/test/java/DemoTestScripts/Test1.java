package DemoTestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Demo_Generic.Demo_BaseClass;
import Demo_POM.LoginToAmazon;

public class Test1 extends Demo_BaseClass{

	@Test
	public void demo() {
		LoginToAmazon login = new LoginToAmazon(driver);
		login.enterProduct();
		
		
		driver.close();
	}
}
