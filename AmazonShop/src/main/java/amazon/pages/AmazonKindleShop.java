package amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazon.base.AmazonBase;


public class AmazonKindleShop extends AmazonBase {
	
	public AmazonKindleShop() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@id='buy-now-button']")
	public WebElement buyNow;
	
	public void barMenu_Kindle_KindleEReaders_Kindle() {
		buyNow.click();
	}
	
	

}
