package amazonTest;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazon.base.AmazonBase;
import amazon.pages.AmazonHome;
import amazon.pages.AmazonKindleShop;
import amazon.pages.AmazonLogin;
import usefulMethod.ReusableMethods;





public class BuyKindle extends AmazonBase {
	
	 AmazonLogin login;
	 AmazonHome home;
	 AmazonKindleShop kindleShop;
	 ReusableMethods util ;
	 
	public BuyKindle() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException, MalformedURLException {
		initialization();
		
	}
	
	@Test(priority = 1)
	public void buyingKindle() throws InterruptedException  {
		util = new ReusableMethods();
		home = new AmazonHome();
		//Example purpose
		util.Wait_elementIsClickable(home.barMenu);
		home.clickOnBarMenu();
		Thread.sleep(3000);
		home.clickOnbarMenuKindle();
		Thread.sleep(3000);
		home.barMenu_Kindle_KindleEReaders_Kindle();
		Thread.sleep(3000);
		kindleShop = new AmazonKindleShop();
		Thread.sleep(3000);
		kindleShop.barMenu_Kindle_KindleEReaders_Kindle();
		login= new AmazonLogin();
		Thread.sleep(3000);
		login.CheckingTheLabelOfUserName(); 
		
		
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
