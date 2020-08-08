package aut239;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTestng7 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();			
   driver.get("https://ui.freecrm.com/");
   
  }
}
