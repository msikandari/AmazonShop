package amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazon.base.AmazonBase;


public class AmazonHome extends AmazonBase {
	
	
	public AmazonHome() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//div[@class='nav-left']/a")
	public WebElement barMenu;
	
	@FindBy(xpath ="//div[contains(text(),'Kindle')]")
	public WebElement barMenuKindle;
	
	@FindBy(xpath ="//ul[@class='hmenu hmenu-visible hmenu-translateX']//a[text()='Kindle']")
	public WebElement barMenu_Kindle_KindleEReaders_Kindle;
	
	public void clickOnBarMenu() {
		barMenu.click();
	}
	
	
	public void clickOnbarMenuKindle() {
		barMenuKindle.click();
	}
	
	public void barMenu_Kindle_KindleEReaders_Kindle() {
		barMenu_Kindle_KindleEReaders_Kindle.click();
	}
	
	
	
	
	
	

}