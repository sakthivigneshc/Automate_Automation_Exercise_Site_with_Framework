package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonActions.commonTestFunctionalities;
import pageObjects.HomePage;
import pageObjects.SignUpPage;


public class LaunchTheBrowser extends commonTestFunctionalities {

//	System.out.println(expectedHomePageTitle);

	public void homePage() {
		
		Assert.assertEquals(commonTestFunctionalities.pageTitle(),commonTestFunctionalities.pageTitle() );
		PageFactory.initElements(driver,HomePage.class);
		HomePage.SignUpButton.click();
		
	}
	
	
	public void accountInformation()
	{
		PageFactory.initElements(driver, SignUpPage.class);
		SignUpPage.TitleRadioBtn.click();

	}
	
	
	@Test
	public void SignUp() {
		homePage();
		
		PageFactory.initElements(driver,SignUpPage.class);
		String name =properties.getProperty("name");
		String emailAddress = properties.getProperty("emailAddress");
		
		String actualSignUpText =	SignUpPage.VerifySignUptext.getText();
		Assert.assertEquals(actualSignUpText, "New User Signup!");

		SignUpPage.UserName.sendKeys(name);
		SignUpPage.UserEmail.sendKeys(emailAddress);
		SignUpPage.SignupButton.click();
		
		accountInformation();
		}
	
	

	
	
}
