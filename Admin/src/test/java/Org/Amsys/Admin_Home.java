package Org.Amsys;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Admin_Home extends Admin_Base
{ 
	@Test(priority=2)
	public void home() throws InterruptedException
	{
		 js.executeScript("window.scrollBy(0,500)", "");
	     // Thread.sleep(1000);
				
		   home.SelectProduct();	
			//	driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
			
		
		//	}
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
			
			driver.findElement(By.id("first-name")).sendKeys("Tom");
			driver.findElement(By.id("last-name")).sendKeys("Cruise");
			driver.findElement(By.id("postal-code")).sendKeys("410210");
			
			driver.findElement(By.id("continue")).click();
			
			driver.findElement(By.id("finish")).click();
			
			driver.findElement(By.id("back-to-products")).click();
			Thread.sleep(3000);
	}

}
