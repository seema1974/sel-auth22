package aut239;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ascriptfligt11 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();			
       
		driver.get("https://orbitz.com/");
		WebElement flightsl = driver.findElement(By.id("Primary-Header-Flights"));
		flightsl.click();
		String alink = driver.getCurrentUrl();
WebElement searchflights = driver.findElement(By.xpath("//*[@id='hero-banner']/div/div/[1]/div[2]/div/h1"));

String text = searchflights.getText();
System.out.println(text);

	}

}
