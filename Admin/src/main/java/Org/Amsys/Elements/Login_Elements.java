package Org.Amsys.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Elements 
{ 
	public WebDriver driver;
	@FindBy(id="user-name") public WebElement username;
	 // @FindBy(id="source") public WebElement source;
	  
	  
	  @FindBy(id="password") public WebElement password;
	 // @FindBy(id="destination") public WebElement destination;
	  
	  @FindBy(id="login-button") public WebElement login;
	  
	  
	  
	  public Login_Elements(WebDriver driver)
	  {
		  this.driver= driver;
		  PageFactory.initElements(driver, this);
	  }


}
