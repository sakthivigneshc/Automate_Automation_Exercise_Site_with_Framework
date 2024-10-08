package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {
	
	@FindBy(xpath="//h2[normalize-space()='New User Signup!']")
	public static WebElement VerifySignUptext;
	
	@FindBy(name="name")
	public static WebElement UserName;
	
	@FindBy(xpath = "//div[@class='signup-form']/form/input[@name='email']")
	public static WebElement UserEmail;
	
	@FindBy(xpath="//div[@class=\"signup-form\"]/form/button")
	public static WebElement SignupButton;
	
	
	@FindBy(id="id_gender1")
	public static WebElement TitleRadioBtn;

}
