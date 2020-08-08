package aut239;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ascript19alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();	
	driver.get("https://javascript.info/alert-prompt-confirm");
	
	WebElement pa = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/main/div[1]/article/div[2]/div[5]/div[2]/div[1]/div/div[1]/div[1]/a")); 
	pa.click();
	
	Alert palert = driver.switchTo().alert();
	palert.dismiss();
	Thread.sleep(1000);

	String atext = palert.getText();
	System.out.println(atext);
	
	palert.accept();
	//WebElement pa = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/main/div[1]/article/div[2]/div[1]/div/div[1]/div[1]/a")); 
	pa.click();
	palert.sendKeys("test");
	palert.accept();
		
	String atext1 = palert.getText();
	System.out.println(atext1);
	palert.accept();
	
	
	//WebElement sa = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/main/div[1]/article/div[2]/div[1]/div/div[1]/div[1]/a"));
	//sa.click();
	
	//Alert salert = driver.switchTo().alert();
	//Thread.sleep(10000);
	//salert.accept();
	//
	}
	
	
	

}
