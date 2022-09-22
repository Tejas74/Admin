package Org.Amsys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Org.Amsys.Pages.Home_Pages;
import Org.Amsys.Pages.Login_Pages;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Admin_Base 
{ 
	WebDriver driver;
	Login_Pages Login;
	Home_Pages home ;
	JavascriptExecutor js; 
	
	@BeforeSuite
	public void initialization()
	{
		
		int arr[] = {1,3,4,4,10,20};
		{
			int high = Integer.MIN_VALUE;
			int second = Integer.MIN_VALUE;
			
			for (int i=0;i<arr.length;i++)
			{
				if (arr[i] > high )
				{
					second = high ;
					high = arr[i];
				}
				else
				{
					if(arr[i] < second && high!=arr[i] )
					{
					 //	high = second ;
						second = high ; 
					}
					
				}
				System.out.print(second);



			}
			
			
		}
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.saucedemo.com"); //*FAQ- Wait until the page load*//
		//Actions  aa = new Actions();
		//driver.findElement(By.id(null)).sendKeys(keys.rig)
	//	driver.getWindowHandle().
		//driver.navigate().to("https://www.saucedemo.com");//*FAQ- Cannot wait for page load and maintains browser history and cookies *//
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Login = new Login_Pages(driver);
		home = new Home_Pages(driver);
		js = (JavascriptExecutor) driver;
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

}
