package aut239;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ascript12locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://orbitz.com");
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement espanol = driver.findElement(By.id("header-language-2058"));
		Point eslocation = espanol.getLocation();
		System.out.println("x coordinate is"+ eslocation.x +"y coordinata is" +eslocation.y);
		
		

	}

}
