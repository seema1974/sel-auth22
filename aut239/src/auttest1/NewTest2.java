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

public class NewTest2 {
  @Test
  public void loin1() {
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
	  System.out.println("This is from  method under after method annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is from  method under before class annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is from  method under after class annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is from  method under before test annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is from  method under after test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is from  method under before suite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is from  method under after suite annotation");
  }



  }
  
  