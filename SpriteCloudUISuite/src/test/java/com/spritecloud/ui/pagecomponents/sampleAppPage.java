package com.spritecloud.ui.pagecomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sampleAppPage {

	WebDriver SAdriver;
	
	@FindBy(xpath="//input[@name=\"UserName\"]") private WebElement username;
	@FindBy(xpath="//input[@name=\"Password\"]") private WebElement password;
	@FindBy(xpath="//button[@id=\"login\"]") private WebElement login;
	
	public sampleAppPage(WebDriver driver) {
		this.SAdriver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void enterUserName(String Uname) {
		
		username.sendKeys(Uname);
		
	}
	
   public void enterPassword(String pass) {
		
	    password.sendKeys(pass);
		
	}
	
   
   public void clickLoginBtn() {
	   
	   login.click();
	   
   }
}
