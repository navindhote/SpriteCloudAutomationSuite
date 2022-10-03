package com.spritecloud.ui.pagecomponents;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class scrolllingPage {
	WebDriver Sdriver;
	
	@FindBy(xpath="//button[@id=\"hidingButton\"]") private WebElement scrolledButton;	
	

	public scrolllingPage(WebDriver driver) {
		
		this.Sdriver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	public void scrollingToTheButton() throws InterruptedException {
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) Sdriver;
		js.executeScript("arguments[0].scrollIntoView();", scrolledButton);
		
		
	}
	
	public void clickScrollingButton() throws InterruptedException {
		Thread.sleep(2000);
		scrolledButton.click();
		
	}
	
	
	
}
