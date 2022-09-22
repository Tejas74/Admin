package Org.Amsys.Pages;

import org.openqa.selenium.WebDriver;

import Org.Amsys.Elements.Home_Elements;
import Org.Amsys.Elements.Login_Elements;

public class Home_Pages 
{
	public WebDriver driver;
	public Home_Elements home;
	
	public Home_Pages(WebDriver driver)
	{
		this.driver = driver;
		home = new Home_Elements(driver);
		
	}
	
	
	
	public void SelectProduct()
	{
		home.fleecejacket.click();
		//Home.login.click();
	}
	


}
