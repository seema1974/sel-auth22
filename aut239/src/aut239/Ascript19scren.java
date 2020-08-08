package aut239;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ascript19scren {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();	
	driver.get("https://javascript.info/alert-prompt-confirm");

	}

}
