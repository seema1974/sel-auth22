package aut239;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ascript6 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();			
       
		driver.get("https://orbitz.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement rooms = driver.findElement(By.id("hotel-rooms-hp-hotel"));
		//rooms.click();
		//rooms.sendKeys("4");
		Select s1 = new Select(rooms);
		//s1.selectByIndex(3);
		//s1.selectByValue("4");
		//s1.selectByVisibleText("5");
		//*[@id="rewardsHeader"]/a
		List<WebElement> option1 = s1.getOptions();
		for(WebElement o : option1) {
			System.out.println(o.getText());
		}
		
      // WebElement adults = driver.findElement(By.id("hotel-1-adults-hp-hotel"));
      // adults.sendKeys("3");
	}

}
