package aut239;

import org.testng.annotations.Test;

import ObjectRep.Crmloginor;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

	
	public class Test8 {
	  @Test(dataProvider = "dp2")
	  public void f(String e, String p) {
		 // System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
			
			//WebDriver driver = new ChromeDriver();			
			//driver.get("https://ui.freecrm.com");
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
			
			WebDriver driver = new ChromeDriver();			
	         driver.get("https://ui.freecrm.com/");
			
			 String atitle =driver.getTitle();
			String etitle ="Cogmento CRM";
		Assert.assertEquals(atitle, etitle);
			
			
			//WebElement email =driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div/[1]/div/input"));
			Crmloginor.email_1(driver).sendKeys(e);
			
			//WebElement pwd = driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[2]/div/input"));
		 // pwd.sendKeys(p);
			Crmloginor.pwd1(driver).sendKeys(p);
			WebElement loginb =driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]/div/input"));
			
			loginb.click();
		  driver.close();      
	  }
	  
	  @DataProvider
	  public Object[]dp1()throws IOException{
		  Test9 t1 = new Test9();
		  String fpath =System.getProperty("C:\\Users\\Owner\\OneDrive");
		 // String filepath =System.getProperty("user.dir") +"\\src\\testdata";
		  //String filepath = System.getProperty(dir);
		  
		  return t1.readExcel(fpath, "Book.xlsx", "loginsheet");
		 
	  

	 /* @DataProvider(name ="dp2")
	  public Object[][] dp1() {
	    return new Object[][] {
	      new Object[] {"email1@email.com", "a" },
	      new Object[] { "email2@email.com", "b" },
	      new Object[] {"email3@email.com", "c"},
	    };
	  }
	 */
	  }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 