package aut239;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTestng6 {
	//WebElement driver;
	//WebElement email = driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/[1]/div/input"));
//}
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();			
     driver.get("https://ui.freecrm.com/");
     
    
     WebElement email = driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/[1]/div/input"));
     email.sendKeys("test1@test.com");
     
   WebElement pwd = driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[2]/div/input"));
	  pwd.sendKeys("test");
	  
	  WebElement loginb =driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]/div/input"));
		
		loginb.click();
	  //driver.close();      
  }
  
 
  
}
