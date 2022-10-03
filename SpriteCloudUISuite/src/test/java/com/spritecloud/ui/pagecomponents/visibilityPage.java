package com.spritecloud.ui.pagecomponents;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class visibilityPage {
	WebDriver vpdriver;
	
	@FindBy(xpath="//button[@id=\"hideButton\"]") private WebElement hide;
	@FindBy(xpath="//button[@id=\"removedButton\"]") private WebElement removed;
	@FindBy(xpath="//button[@id=\"zeroWidthButton\"]") private WebElement zeroWidth;
	@FindBy(xpath="//button[@id=\"overlappedButton\"]") private WebElement overlapped;
	@FindBy(xpath="//button[@id=\"transparentButton\"]") private WebElement opacity0;
	@FindBy(xpath="//button[@id=\"invisibleButton\"]") private WebElement visibilityHidden;
	@FindBy(xpath="//button[@id=\"notdisplayedButton\"]") private WebElement displayNone;
	@FindBy(xpath="//button[@id=\"offscreenButton\"]") private WebElement offScreen;
	
	
	public visibilityPage(WebDriver driver) {
		this.vpdriver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	public void clickHide() throws InterruptedException {
		System.out.println(removed.isDisplayed());
		hide.click();
		Thread.sleep(2000);
		System.out.println(removed.isDisplayed());
		
	}
	
	public void visibilityOfOtherElements() {
		
//		boolean s=removed.isDisplayed();
		
		System.out.println(removed.isDisplayed());
		
//		Assert.assertEquals("",);
		
	}
	
	

}
