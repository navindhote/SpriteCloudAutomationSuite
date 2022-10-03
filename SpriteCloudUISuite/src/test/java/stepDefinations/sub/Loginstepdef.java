package stepDefinations.sub;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.spritecloud.ui.pageobjects.HomePage;
import com.spritecloud.ui.pageobjects.LoginPage;
import com.spritecloud.ui.utilities.Baseclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginstepdef extends Baseclass {
	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	Baseclass bs;
	
	@Given("^User launch brawser$")
	public void launch_brawser() {
//		this.bs=new Baseclass();
		this.bs=new Loginstepdef();
		driver=bs.initialization();
		 this.lp=new LoginPage(driver);
		 this.hp=new HomePage(driver);
	}
	
	@When("^User opens URL \\\"(.*)\\\"$")
	public void open_url(String url) {	
	driver.get(url);
	}
	
	@When("^User opens URL$")
	public void open_url_using_dataTable(DataTable D1) {	
	
		List<String> L1= D1.asList();
		driver.get(L1.get(0));
	
	}
	
	@And("^User add Email \\\"(.*)\\\" and password \\\"(.*)\\\"$")
	public void add_email_and_password(String email,String pass) throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		lp.addEmailId(email);
		lp.addPassword(pass);		
	}
	
	
	@And("^User add cridentials$")
	public void User_add_cridentials(DataTable table) throws InterruptedException {
		
		List<String> data = table.asList();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		lp.addEmailId(data.get(0));
		lp.addPassword(data.get(1));		
	}
	
	@And("^Click on the Login button$")
	public void click_login_button() {		
		lp.clickLoginButton();
	}

	@Then("^Login Page tile captured$")
	public void title_capture() {
		lp.gettitleOfTheLoginPage();	
	}
	
	@And("^Click on the logout$")
	public void logout() {		
		
		hp.logout();		
	}
	
	@Then("^Home page title captured$")
	public void page_title() {		
		hp.gettitleOfTheHomePage();
	}
	
}
