package com.spritecloud.ui.pagecomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	WebDriver HPdriver;
	@FindBy(xpath="//a[contains(text(),'Text Input')]") private WebElement textInput;
	@FindBy(xpath="//a[contains(text(),'Sample App')]") private WebElement sampleApp;
	@FindBy(xpath="//a[contains(text(),'Click')]") private WebElement click;
	@FindBy(xpath="//a[contains(text(),'Visibility')]") private WebElement visibility;
	@FindBy(xpath="//a[contains(text(),'Scrollbars')]") private WebElement scrollbars;
	@FindBy(xpath="//a[contains(text(),'Load Delay')]") private WebElement loaddelay;
	@FindBy(xpath="//a[contains(text(),'Mouse Over')]") private WebElement mouseover;
	
	public homepage(WebDriver driver) {
		this.HPdriver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void clickButton(String btn) {
		
		switch (btn) {
		
		case "Text Input":
			textInput.click();
			break;
			
		case "Sample App":
			sampleApp.click();
			break;
			
		case "Click":
			click.click();
			break;
			
		case "Visibility":
			visibility.click();
			break;
			
		case "Scrollbars":
			scrollbars.click();
			break;
			
		case "Load Delay":
			loaddelay.click();
			break;
			
		case "Mouse Over":
			mouseover.click();
			break;
		
		}
		
		
	}
	
	
//	public void clickLoginButton(providedText) {	
//		
//		switch (providedText) 
//		  case "Text Input":
//			  textInput.click();
//		    break;	
//		
//}

}
