package ObjectRep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Crmloginor {
	static WebElement element = null;
	public static WebElement email_1(WebDriver driver) {
		element =driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div/[1]/div/input"));
		
		return element;
	}
	
	public static WebElement pwd1(WebDriver driver) {
	 element = driver .findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[2]/div/input"));
		return element;
		
	}
	
	
	
}
