package aut239;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ascript4tag {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();			
       
		driver.get("https://WWW.facebook.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		 int numberoflinks = links.size();
		 System.out.println(numberoflinks);
		 
		 for(WebElement l : links) {

			 System.out.println(l.getAttribute("href"));
	}
		 
		 
		 
		 
		 
		
	}
	
	
	
	
	
	
}
