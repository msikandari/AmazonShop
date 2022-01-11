package amazonTest;

import amazon.base.AmazonBase;
import amazon.pages.AmazonHome;
import amazon.pages.AmazonKindleShop;
import amazon.pages.AmazonLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import usefulMethod.ReusableMethods;

public class AmazonTestCucumber extends AmazonBase{
	AmazonLogin login;
	 AmazonHome home;
	 AmazonKindleShop kindleShop;
	 ReusableMethods util ;
	 
		public AmazonTestCucumber() {
			super();
		}

	
	@Given("User navigate to amazon page")
	public void user_navigate_to_amazon_page() {
		initialization();
	}
	@Given("click on bar tab\\/Click on kindle\\/Click on kindle under Kindle E-Readers")
	public void click_on_bar_tab_click_on_kindle_click_on_kindle_under_kindle_e_readers() throws InterruptedException {
		home = new AmazonHome();
		home.clickOnBarMenu();
		Thread.sleep(3000);
		home.clickOnbarMenuKindle();
		Thread.sleep(3000);
		home.barMenu_Kindle_KindleEReaders_Kindle();
	}

		


	

	@And("click on buy  button")
	public void click_on_buy_button() throws InterruptedException {
		Thread.sleep(3000);
		kindleShop = new AmazonKindleShop();
		Thread.sleep(3000);
		kindleShop.barMenu_Kindle_KindleEReaders_Kindle();
	}

	@Then("validate the text")
	public void validate_the_text() throws InterruptedException {
		login= new AmazonLogin();
		Thread.sleep(3000);
		login.CheckingTheLabelOfUserName(); 
		driver.close();
	}
}
