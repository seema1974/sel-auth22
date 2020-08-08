package aut239;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acript1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();			
       
		driver.get("https://orbitz.com");
		
	
		
		
		WebElement hhotelslink = driver.findElement(By.id("primary-header-hotel"));
          hhotelslink.click();
         
          driver.navigate().back();
           WebElement flightslink = driver.findElement(By.id("primary-header-flight"));
          flightslink.click();
          driver.navigate().back();
          WebElement vrentals = driver.findElement(By.id("primary-header-vacationRental"));
          vrentals.click();
        
          /*
          driver.get("https://www.facebook.com/");
          WebElement fbemail = driver.findElement(By.name("email"));
          fbemail.sendKeys("jhghjg");
           WebElement fbpwd = driver.findElement(By.className("login_form_input_box"));
           fbpwd.sendKeys("jhhjnkpwd");
          // WebElement fbfplink = driver.findElement(By.linkText("Forgot account?"));
           WebElement fbfplink = driver.findElement(By.partialLinkText("Forgot"));
           fbfplink.click();
           WebElement fflightlink = driver.findElement(By.id("primary-header-flight"));
           fflightlink.click();
           WebElement vpacklink = driver.findElement(By.id("primary-header-package"));
           vpacklink.click();
           */
           
	}

	
}
