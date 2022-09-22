package Org.Amsys.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Elements 
{
	public WebDriver driver;
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket") public WebElement fleecejacket;
	 // @FindBy(id="source") public WebElement source;
	  
	  
	//  @FindBy(id="password") public WebElement password;
	 // @FindBy(id="destination") public WebElement destination;
	  
	//  @FindBy(id="login-button") public WebElement login;
	  
	  
	  
	  public Home_Elements(WebDriver driver)
	  {
		  this.driver= driver;
		  PageFactory.initElements(driver, this);
	  }


}
