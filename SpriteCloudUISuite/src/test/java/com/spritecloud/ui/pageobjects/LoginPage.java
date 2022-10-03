package com.spritecloud.ui.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spritecloud.ui.utilities.Baseclass;

public class LoginPage {
	
	WebDriver ldriver;
	

	@FindBy(xpath="//div[@class=\"inputs\"][1]//input") private WebElement email;
	@FindBy(xpath="//div[@class=\"inputs\"][2]//input") private WebElement password;
	@FindBy(xpath="//div[@class=\"buttons\"]//button") private WebElement loginbutton;
	
	public LoginPage(WebDriver driver) {
		this.ldriver=driver;
		PageFactory.initElements(driver, this);	
	}

public void addEmailId(String EmailID ) {	
	email.clear();
	email.sendKeys(EmailID);	
}

public void addPassword(String pwd) {
	password.clear();
	password.sendKeys(pwd);	
}

public void clickLoginButton() {	
	loginbutton.click();	
	
}

public void gettitleOfTheLoginPage() {
	System.out.println(ldriver.getTitle());
//	return new HomePage(ldriver);	

}
}
