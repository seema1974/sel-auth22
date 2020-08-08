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

public class NewTest2a {
  @Test
  public void f() {
	  System.out.println("This is from Test method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is from  method under before test annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is from methods under after method annotation");
  }


  }
  
  