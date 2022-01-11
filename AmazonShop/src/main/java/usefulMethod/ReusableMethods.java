package usefulMethod;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import amazon.base.AmazonBase;



public class ReusableMethods extends AmazonBase{
	WebDriverWait wait = new WebDriverWait(driver,10);
	
	
	
	public WebElement Wait_elementIsClickable(WebElement web) {
		return wait.until(
                ExpectedConditions.elementToBeClickable(web));
	}
	
	

}
