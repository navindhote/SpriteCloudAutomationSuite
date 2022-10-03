package com.spritecloud.ui.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spritecloud.ui.utilities.Baseclass;

public class HomePage {
	 WebDriver hdriver;
	@FindBy(xpath="//a[text()=\"Logout\"]") private WebElement logoutBtn;
	
public HomePage(WebDriver driver) {
	this.hdriver=driver;		
	PageFactory.initElements(driver, this);		
	}

public void logout() {
	logoutBtn.click();	
}

public void gettitleOfTheHomePage() {	
	System.out.println(hdriver.getTitle());
}

}
