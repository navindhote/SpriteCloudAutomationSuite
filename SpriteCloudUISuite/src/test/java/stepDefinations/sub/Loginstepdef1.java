package stepDefinations.sub;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.spritecloud.ui.pageobjects.HomePage;
import com.spritecloud.ui.pageobjects.LoginPage;
import com.spritecloud.ui.utilities.Baseclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdef1 extends Baseclass{
	WebDriver driver;
	LoginPage LP;
	HomePage HP;
	
	@Given("^user launch the browser$")
	public void launch_brawser() {
		Baseclass B=new Baseclass();
		this.driver=B.initialization();	
		
	}
	
	@And("^user launch portal \\\"(.*)\\\"$")
	public void open_poetal(String url) {
		driver.get(url);
		
	}
	
	
	
	@When("^user add EmailID \\\"(.*)\\\" and password \\\"(.*)\\\"$")
	public void add_emailid_and_password(String email, String pass) {
		this.LP=new LoginPage(driver);
		LP.addEmailId(email);
		LP.addPassword(pass);	
	}
	
	
	
	@And("^capture login page title$")
	public void login_page_title() {
		
		LP.gettitleOfTheLoginPage();
		
	}
	
	@And("^click on Login button$")
	public void click_login_button() {
		
		LP.clickLoginButton();
	}
	
	@Then("^capture Home page title$")
	public void home_page_title() {
		this.HP=new HomePage(driver);
		HP.gettitleOfTheHomePage();
		
		
	}
	
	@And("^click on the logout button$")
	public void click_logout_button() {
		
		HP.logout();
		
	}
	
	@When("^user add EmailID and password$")
	public void add_emailIDpass_using_dataprovider(DataTable table) throws InterruptedException{
		this.LP=new LoginPage(driver);
		List<String> L1=table.asList();
                  Thread.sleep(3000);
                    LP.addEmailId(L1.get(0));
                    LP.addPassword(L1.get(1));
                 		
	}
	
	@But("^user not able to loggedin into dashboard$")
	public void but_keyword() {
		
		LP.gettitleOfTheLoginPage();
		
	}
}
