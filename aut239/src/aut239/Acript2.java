package aut239;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acript2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();			

		driver.get("https://www.facebook.com");
		
		//WebElement fespanollink = driver.findElement(By.cssSelector("#pageFooter > ul > li:nth-child(2) > a"));
		//WebElement fespanollink = driver.findElement(By.cssSelector("a[class='_sv4'][title='Franch']"));
		WebElement fespanollink = driver.findElement(By.xpath("//a[@class='_sv4'][@title='Spanish']"));	
		fespanollink.click();
		WebElement email = driver.findElement(By.cssSelector("#email"));
				email.sendKeys("hjgh");
				email.clear();
				 String aemaildata= email.getAttribute("data-testid");
				 String eemaildata="royal_email";
				 if(aemaildata.equals(eemaildata)) {
					 System.out.println(aemaildata);
					 System.out.println("TC2 is pass");	 
				 }
				 else
				 {
					 System.out.println("TC2 is Fail");
				 }
		String affvalue = email.getCssValue("font-family");
		System.out.println(affvalue);
		
			//WebElement email = driver.findElement(By.cssSelector("#email"));
		//email.sendKeys("hjgjdgh");
		
		/*List<WebElement> links = driver.findElements(By.tagName("a"));
		int numberoflinks = links.size();
		System.out.println(numberoflinks);
		for(WebElement l : links) {
			System.out.println(l.getAttribute("href"));
		}
		*/

	}

}
