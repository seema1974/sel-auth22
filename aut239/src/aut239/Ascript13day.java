package aut239;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ascript13day {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
					
					WebDriver driver = new ChromeDriver();			
			       
					driver.get("https://orbitz.com");
					WebElement hhotelslink = driver.findElement(By.id("primary-header-hotel"));
					hhotelslink.click();

					driver.get("https://facebook.com");
					WebElement fbemail = driver.findElement(By.name("email"));
					fbemail.sendKeys("fggghhjkj");		
					
					

	}

}
