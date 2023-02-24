package DemoTestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 5)
	public void test2() {
		System.out.println("***World***");
	}
}
