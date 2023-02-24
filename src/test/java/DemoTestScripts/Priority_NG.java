package DemoTestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Priority_NG {

	@Test(enabled = false)
	public void test1() {
		System.out.println("===Hello===");
	}
	
	@Test(priority = -1)
	public void test2() {
		System.out.println("***World***");
	}
}
