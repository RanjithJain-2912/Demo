package qsp;

import org.testng.annotations.Test;

public class DemoA {
	@Test(priority = 0,invocationCount = 3)
public void demoB() {
	System.out.println("Hi World");
}
	@Test(priority = 1,dependsOnMethods = "demoB")
public void demo() {
	System.out.println("Hello World");
}
	@Test(priority = 2)
public void demoA() {
	System.out.println("Bye World");
}

}
