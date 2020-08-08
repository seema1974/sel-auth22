package aut239;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ascripts4 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();			

		driver.get("https://orbitz.com");
		WebElement link=driver.findElement(By.id("primary-header-vacationRental"));
		String atag = link.getTagName();
		String etag ="a";
		if (atag.contentEquals(etag)) {
			System.out.println(atag);
			System.out.println("TC#is pass");
		}
		else
		{
			System.out.println("TC# is fail");
			
		}
		String atext = link.getText();
		System.out.println(atext);
		
		boolean avalue = link.isDisplayed();
		System.out.println(avalue);
		
		driver.get("https://indeed.com/");
		WebElement button = driver.findElement(By.xpath("//*[@id='whatWhereFormId']/div[3]/button"));
				
		boolean  abuttonvalue = button.isEnabled();;
		System.out.println(abuttonvalue);
	}

}
