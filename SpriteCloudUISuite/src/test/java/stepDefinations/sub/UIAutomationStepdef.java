package stepDefinations.sub;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.spritecloud.ui.pagecomponents.clickPage;
import com.spritecloud.ui.pagecomponents.homepage;
import com.spritecloud.ui.pagecomponents.loadDilayPage;
import com.spritecloud.ui.pagecomponents.mouseOverPage;
import com.spritecloud.ui.pagecomponents.sampleAppPage;
import com.spritecloud.ui.pagecomponents.scrolllingPage;
import com.spritecloud.ui.pagecomponents.textInputPage;
import com.spritecloud.ui.pagecomponents.visibilityPage;
import com.spritecloud.ui.pageobjects.HomePage;
import com.spritecloud.ui.pageobjects.LoginPage;
import com.spritecloud.ui.utilities.BaseClassSpriteCloud;
import com.spritecloud.ui.utilities.Baseclass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UIAutomationStepdef extends BaseClassSpriteCloud{
	WebDriver driver;
	BaseClassSpriteCloud bs;
	homepage hp;
	textInputPage tip;
	String providedtext;
	String buttontxt;
	sampleAppPage sap;
	clickPage CP;
	mouseOverPage Mo;
	visibilityPage  Vp;
	scrolllingPage Sp;
	loadDilayPage lD;
	
	@Given("^first user launch the browser$")
	public void launch_brawser() throws InterruptedException {
//		this.bs=new Baseclass();
		this.bs=new UIAutomationStepdef();
		driver=bs.initialization();
		 this.hp=new homepage(driver);
		 this.tip=new textInputPage(driver);
		 this.sap=new sampleAppPage(driver);
		 this.CP=new clickPage(driver);
		 this.Mo=new mouseOverPage(driver);
		 this.Vp=new visibilityPage(driver);
		 this.Sp=new scrolllingPage(driver);
		 this.lD=new loadDilayPage(driver);
	}
	
	@And("^enduser launch portal \\\"(.*)\\\"$")
	public void open_url(String url) {	
	driver.get(url);
	}
	
	
	@When("^enduser click on \\\"(.*)\\\" link$")
	public void click_link(String url) {	
	hp.clickButton(url);
	}
	
	@When("^click on on the textbox and insert text as \\\"(.*)\\\"$")
	public void add_text_to_textbox(String url) throws InterruptedException {
		Thread.sleep(2000);
	this.providedtext=url;
	System.out.println("The Provide Test is "+url);
	tip.addText(url);
	}
	
	@When("^click on the button$")
	public void click_btn() throws InterruptedException {	
		Thread.sleep(2000);
	this.buttontxt=tip.clickButton();
	
	}
	
	@Then("^Verify the provide test in textbox and the name of button is same$")
	public void text_verification() throws InterruptedException {	
		Thread.sleep(2000);
	Assert.assertEquals(providedtext, buttontxt);
	}
	
	@And("^User enter the userID as \\\"(.*)\\\"$")
	public void enter_usedID(String UID ) {	
	sap.enterUserName(UID);
		
	}
	
	@And("^User enter the password as \\\"(.*)\\\"$")
	public void enter_password(String pass){	
	sap.enterPassword(pass);
		
	}
	
	@Then("^click on the login button$")
	public void click_login(){	
	sap.clickLoginBtn();	
	}
	
	@Then("^click on button$")
	public void click_green_btn() throws InterruptedException{	
		CP.clickBlueButton();
	
	}
	
	@Then("^make the (\\d+) click on the provided link and check the click count$")
	public void click_count(int n) throws InterruptedException{	
		Mo.countclick(n);
	
	}
	
	@Then("^click on the hide button$")
	public void click_on_the_hide_button() throws InterruptedException{	
		Vp.clickHide();
	}
	
	@Then("^check the visibility of other elements$")
	public void check_the_visibility_of_other_elements() throws InterruptedException{	
		Vp.visibilityOfOtherElements();
	}

	@Then("^scroll to the button$")
	public void scroll_to_the_button() throws InterruptedException{	
		Sp.scrollingToTheButton();
	}
	
	@And("^click the scrolling button$")
	public void click_the_scrolling_button() throws InterruptedException{	
		Sp.clickScrollingButton();
	}
	
	@And("^wait until the button get visible and click on it$")
	public void wait_until_the_button_get_visible() throws InterruptedException{	
		
		lD.waitTillbuttonIsVisibleAndClickOnIt();
		
	}
	
	
}
