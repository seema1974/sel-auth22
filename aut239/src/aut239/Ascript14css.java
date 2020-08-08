package aut239;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ascript14css {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();			
       
		driver.get("https://WWW.facebook.com/");
		WebElement fespanollink = driver.findElement(By.cssSelector("#pageFooter > ul > li:nth-child(2) > a"));
		fespanollink.click();
	}

}
