package com.spritecloud.ui.pagecomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clickPage {
	
	WebDriver cdriver;
	
	@FindBy(xpath="//button[@id=\"badButton\"]") private WebElement button;
	
	public clickPage(WebDriver driver) {
		this.cdriver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	public void clickBlueButton() throws InterruptedException {
		String s=button.getCssValue("color");
		String c = Color.fromString(s).asHex();
	    System.out.println("Color is :" + s);
	    System.out.println("Hex code for color:" + c);
		
		button.click();
		Thread.sleep(1000);
		String s1=button.getCssValue("color");
		String c1 = Color.fromString(s).asHex();
	    System.out.println("Color is :" + s1);
	    System.out.println("Hex code for color:" + c1);
		
	}
	
}
