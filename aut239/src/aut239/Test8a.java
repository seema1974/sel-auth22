package aut239;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Test8a {
  @Test(dataProvider = "dp")
  public void f(Integer e, String p) {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();			
       driver.get("https://ui.freecrm.com/");
		
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"email@email.com", "a" },
      new Object[] { "email2@email.com", "b" },
      new Object[] {"email3@email.com","c"},
    };
    
  }
}
