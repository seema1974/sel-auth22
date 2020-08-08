package aut239;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exfinally {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://orbitz.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		try {
		WebElement hotelsl = driver.findElement(By.id("Primary-Header-Flight"));
		hotelsl.click();
		driver.navigate().back();
		String hotelsltext = hotelsl.getText();
		hotelsl.getCssValue("font-size");
		
				
			WebElement edit = driver.findElement(By.xpath("//*[@id='hoggel-destination-hp-hotel']"));
            Dimension editz = edit.getSize();
           System.out.println("Height is"+ editz.height + "width is" + editz.width);
		}
		//(catch (Exception e) 
	
		catch(NoSuchElementException e) { 
		System.out.println(e);
		}	catch(StaleElementReferenceException e) { 
			System.out.println(e);
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Closing the browser");
			driver.quit();
           System.out.println("Rest of the script");
          WebElement checkin1 = driver.findElement(By.xpath("//*[@id='hotel-checkin-hp-hotel']"));
          System.out.println(checkin1.isDisplayed());

	}

}


	}


