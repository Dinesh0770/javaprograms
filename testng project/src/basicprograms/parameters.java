package basicprograms;

import org.testng.annotations.Test;

public class parameters {

	@Test(invocationCount = 5)
	void test1() {
		System.out.println("system 1");
	}

	@Test(dependsOnMethods = "test1")
	void test2() {
		System.out.println("system 2");
	}

	@Test(priority = -2)
	void test3() {
		System.out.println("system 3");
	}

}
