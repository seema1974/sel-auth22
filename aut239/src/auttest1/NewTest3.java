package auttest1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest3 { 
	@Test
	public void login1() {
	 System.out.println("This is from Test method1");
}
@Test
public void login2() {
	  System.out.println("This is from Test method2");
}
@Test
public void login3() {
	  System.out.println("This is from Test method3");
} 
@BeforeMethod
public void beforeMethod() {
	  System.out.println("This is from  method under before method annotation");
}

@AfterMethod
public void afterMethod() {
	  System.out.println("This is from  method under after  method annotation");
}


}

 