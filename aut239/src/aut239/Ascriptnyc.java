package aut239;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ascriptnyc {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();			
       driver.get("https://www.nyandcompany.com");
       driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String hphandle = driver.getWindowHandle();
		System.out.println(hphandle);
		WebElement link = driver.findElement(By.xpath("/html/head/meta[10]"));
		String atitle =driver.getTitle();   
	   
		if (atitle.equals(atitle)) {
	    	System.out.println(atitle);
	    	System.out.println("Tc#1 is pass");
	    		 }
	    else
	    {
	    System.out.println("Tc#1 is fail");
	    }
	     String atext = link.getText();
	      System.out.println(atext);
	
	     boolean avalue= link.isDisplayed();
	        System.out.println(avalue);
		
		 
				/*  WebElement Evamenendes = driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[1]/li/a"));
				 // "https://www.nyandcompany.com/eva-mendes/N-3455744724"
		          if(Evamenendes.isDisplayed()) {
						Evamenendes.click();
						driver.navigate().back();
				String Evamendes = driver.getCurrentUrl();
			  if(Evamendes.equals("https://www.nyandcompany.com/eva-mendes/N-3455744724")) {
					System.out.println("Test#2 pass");
				}
				else {
					System.out.println("Test#2 fail");
				}
				driver.navigate().back();
				 } 
				*/  
		
		  WebElement Gabirelleunion = driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[2]/li[1]/a"));
       if(Gabirelleunion.isDisplayed()) {
    	   Gabirelleunion.click();
				driver.navigate().back();
		String Gabirelleunion1 = driver.getCurrentUrl();
	  if(Gabirelleunion.equals("https://www.nyandcompany.com/gabrielle-union/N-675084437/" )); {
	  }	
		  System.out.println("Test#3 pass");
	  }
	  
	  
	  else{
			
		{
			System.out.println("Test#3 fail");
		}
		driver.navigate().back();
		 } 
     
      /* WebElement Brandswelove = driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[2]/li[2]/a"));
  if(Brandswelove.isDisplayed()) {
	  Brandswelove.click();
			driver.navigate().back();
	String Brandswelove1 = driver.getCurrentUrl();
 if(Brandswelove1.equals("Brands we love" )); {
 }	
	  System.out.println("Test#4 pass");
 }
 else{
		
	{
		System.out.println("Test#4 fail");
	}
	driver.navigate().back();
	 } 
    
 */
  
  WebElement Newsarrivals = driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[2]/li[3]/a"));
  if(Newsarrivals.isDisplayed()) {
	  Newsarrivals.click();
			driver.navigate().back();
			 String Newsarrivals1 = driver.getCurrentUrl();
 if(Newsarrivals.equals("https://www.nyandcompany.com/new/must-haves/N-103455/"));{
 }
 
 System.out.println("Test#5 pass");
 }
  else
  {
	
		System.out.println("Test#5 fail");
	}
	
	} 
	}
  
  ///html/body/header/nav[1]/div[3]/div/ul[2]/li[3]/a
  
 //"https://www.nyandcompany.com/new/must-haves/N-103455/" 
				//  WebElement login = driver.findElement(By.xpath("/html/body/header/nav[1]/div[1]/div/div/div[1]/ul/li[1]/a]"));
			    // System.out.println(login.isDisplayed());
				
			      
			     // WebElement wishl = driver.findElement(By.id("myWishList"));
		         // System.out.println(wishl);
		        
		       
		         // Dimension Wishl = wishl.getSize();
		          // System.out.println("font-size");

		          
		   		//WebElement loginlink = driver.findElement(By.xpath("/html/body/header/nav[1]/div[1]/div/div/div[1]/ul/li[1]"));
				//loginlink.click();	
				
				
				
				


			
		
	


