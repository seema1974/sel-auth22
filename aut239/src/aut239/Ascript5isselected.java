package aut239;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ascript5isselected {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();			
       
		driver.get("https://WWW.facebook.com/");		
         
         
         WebElement gender = driver.findElement(By.xpath("//input[@type='radio][@value='1']"));
		System.out.println(gender.isSelected());
		gender.click();
		System.out.println(gender.isSelected());
		

	}

}
