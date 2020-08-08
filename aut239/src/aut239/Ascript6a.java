package aut239;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ascript6a {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();			
       
		driver.get("https://google.com/");
		WebElement search = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input"));
       search.sendKeys("selenuim");
       search.submit();
		
		
		
		
		
		
	}

}
