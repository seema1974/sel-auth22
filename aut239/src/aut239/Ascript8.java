package aut239;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ascript8 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
			WebDriver driver = new ChromeDriver();			
	       
			driver.get("https://orbitz.com");
			
			String hpwhdle = driver.getWindowHandle();
			System.out.println(hpwhdle);
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			WebElement jr = driver.findElement(By.xpath("//*[@id='rewardsHeader']/a"));
			jr.click();
			System.out.println(driver.getCurrentUrl());
			
			Set<String> allwindows =  driver.getWindowHandles();
			String ptitle = "Orbitz";
			
			for(String wid : allwindows) {
				if(ptitle.contentEquals("Orbitz")) {
					driver.switchTo().window(wid);
					System.out.println(driver.getCurrentUrl());
				}
				
			}
			System.out.println(driver.getCurrentUrl());
			//to come back to the hp
			driver.switchTo().window(hpwhdle);
			System.out.println(driver.getCurrentUrl());
		
	}

}
