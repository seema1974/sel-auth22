package aut239;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ascript3 {

	 public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.amazon.com");
         driver.get("https://www.orbitz.com");
         String apagesource = driver.getPageSource();
			System.out.println(apagesource);
			driver.navigate().to("https://amazon.com");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			driver.navigate().back();
			WebElement hhotelslink = driver.findElement(By.id("primary-header-hotel"));
	          hhotelslink.click();
			
			//driver.close();
	}

}
