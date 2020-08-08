package auttest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ObjectRep.Nt9OR;

public class newTest9 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();			
		//driver.get("https://www.overstock.com/");
		Actions a = new Actions(driver);
		//a.moveToElement(Nt9OR.bb(driver)).build().perform();
		
		driver.get("https://artoftesting.com/sampleSiteForSelenium");
WebElement si = driver.findElement(By.id("sourceImage"));

WebElement t1 = driver.findElement(By.xpath("//*[@id='targetDiv']"));
a.dragAndDrop(si,t1).perform();

		
		
  }
}
