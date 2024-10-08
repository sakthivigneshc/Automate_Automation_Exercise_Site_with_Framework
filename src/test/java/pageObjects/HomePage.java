package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	
	@FindBy(xpath="//header[@id='header']//li[4]")
	public static WebElement SignUpButton;
	

}
