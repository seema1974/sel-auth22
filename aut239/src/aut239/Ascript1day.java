package aut239;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ascript1day {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
			
		WebDriver driver = new ChromeDriver();			
	       
			//driver.get("https://orbitz.com");
			driver.get("https://amazon.com");
			
			String actualpt = driver.getTitle();
			String expectedt = ("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
			
			
			//String expectedp ="Orbitz Flights, Cheap Vacations, Rental Cars &amp; Hotel Deals";
		 
			
			
			if(actualpt.equals(expectedt)) {
				
				System.out.println(actualpt);
				System.out.println("Tc1 is pass");
				}
	
			else
			{
				System.out.println("Tc1 is fail");
			}
			String acurl = driver.getCurrentUrl();
			System.out.println(acurl);
			
			String apagesource = driver.getPageSource();
			System.out.println(apagesource);
			driver.navigate().to("https://google.com");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			
			
			//driver.close();
			
			
	}
}
				
			
			
			
	

	
