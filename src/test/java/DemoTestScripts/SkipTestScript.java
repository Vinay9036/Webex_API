package DemoTestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class SkipTestScript {
	@Test
	public void test1() {
		System.out.println("===Hello===");
	}
	
	@Test(enabled = false)
	public void test2() {
		System.out.println("***World***");
	}
}
