package Org.Amsys;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Org.Amsys.Pages.Login_Pages;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Admin_Login extends Admin_Base
{

	
	@Test(priority=1)
	public void Validlogin() throws InterruptedException
	{
		
		 //Tejas:*FAQ- Can Manage the downloads and setups easilyyyy*//
		
		    // System.out.println(Login.getcredentials().get("Valid"));
       
       
         String [] str = {"Valid","Invalid"};
         
         for(int i=0;i<str.length;i++)
         {
        	 System.out.println(str[i]);
        	 Login.login_username(str[i]);
    	     Login.login_password(str[i]);
    	     Thread.sleep(30000);
    	     Login.Login_login();
         }
		
        	
	     
       
		//driver.close();
//		List<WebElement> listOfAllWebElements = driver.findElements(By.cssSelector(".inventory_item_price"));
		
	//	for(WebElement element : listOfAllWebElements)
	//	{
			
	 
     
	}
	
	
	

}
