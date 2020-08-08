package aut239;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ascripts9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();			
       
		driver.get("https://www.facebook.com/");
		
		String hpwhdle = driver.getWindowHandle();
		//System.out.println(hpwhdle);
		
		WebElement tlink = driver.findElement(By.id("terms-link"));
         tlink.click();
        Set<String> allwindows = driver.getWindowHandles();
       String curl = "https://www.facebook.com/";
        
        for(String wid : allwindows) {
        	if(driver.switchTo().window(wid).getCurrentUrl().equals(curl)) {
        		String ptitle = driver.getTitle();
        		System.out.println(ptitle);
        		WebElement fbproducts = driver.findElement(By.xpath("//*[@id='content']/div/div/div[2]/div[2]/div[1]/div/a[1]"));
        		fbproducts.click();
        		String fbtproductlinks = driver.getCurrentUrl();
        		System.out.println(fbtproductlinks);
        		
        	
        	}
        
        }
        System.out.println(driver.getCurrentUrl());
        
        driver.switchTo().window(hpwhdle);
        System.out.println(driver.getCurrentUrl());
	}

}
