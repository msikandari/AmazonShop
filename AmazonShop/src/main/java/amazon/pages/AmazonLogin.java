package amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import amazon.base.AmazonBase;


public class AmazonLogin extends AmazonBase {
	
	public AmazonLogin() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath ="//label[contains(text(),'E-mail address or mobile phone number')]")
	public WebElement loginRequest;
	
	public void CheckingTheLabelOfUserName() {
		// loginRequest.isDisplayed();
		 String login = loginRequest.getText();
		 Assert.assertEquals(login, 
	              "E-mail address or mobile phone number"
	              );
		 
	}
	

}
