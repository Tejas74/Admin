package Org.Amsys.Pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Org.Amsys.Elements.Login_Elements;

public class Login_Pages 
{
	public WebDriver driver;
	public Login_Elements login;
	
	public Login_Pages(WebDriver driver)
	{
		this.driver = driver;
		login = new Login_Elements(driver);
		
	}
	
	

	

	
	
	public HashMap<String,String> getcredentials()
	{
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("Valid", "standard_user:secret_sauce");
		hm.put("Invalid", "standard_userq:secret_sauce");
		
	return hm;
		
	}
	
	
	 
     
     
	public void login_username(String str)
	{
	    
		String validuser= getcredentials().get(str);
	    String [] usrpass = validuser.split(":");
	 	login.username.sendKeys(usrpass[0]);
		//return validuser.split(":")[0];
		
	}
	
	public void login_password(String value)
	{
		String validuser= getcredentials().get(value);
		String [] usrpass = validuser.split(":");
		login.password.sendKeys(usrpass[1]);
		//return validuser.split(":")[1];
	}
	
	public void Login_login()
	{
		login.login.click();
	}








}
