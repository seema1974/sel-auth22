package aut239;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ascript16size {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://orbitz.com");
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement edit = driver.findElement(By.xpath("//*[@id='hotel-destination-hp-hotel']"));
            Dimension editz = edit.getSize();
           System.out.println("Height is"+ editz.height + "width is" + editz.width);

           
          WebElement checkin1 = driver.findElement(By.xpath("//*[@id='hotel-checkin-hp-hotel']"));
          System.out.println(checkin1.isDisplayed());
          
          
          
          
          
          
          
	}
	
	
	
	
	

}
