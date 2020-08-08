package aut239;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ascripts7 {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();			
       
		driver.get("https://orbitz.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement flightscbox = driver.findElement(By.xpath("//*[@id='hotel-add-flight-checkbox-hp-hotel']"));
		
		WebDriverWait Wait = new WebDriverWait(driver,30);
		Wait.until(ExpectedConditions.elementSelectionStateToBe(flightscbox,true));
		System.out.println("moving to the next step");

	}

}
