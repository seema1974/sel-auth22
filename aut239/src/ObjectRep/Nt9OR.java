package ObjectRep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nt9OR {
	static WebElement element =null;
	public static WebElement bb(WebDriver driver) {
		 element = driver.findElement(By.xpath("//*[@id ='TopNav']/div[1]/div[4]/a"));
		return element;
		
	}
	

}
