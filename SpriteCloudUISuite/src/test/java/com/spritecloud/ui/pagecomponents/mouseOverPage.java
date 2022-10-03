package com.spritecloud.ui.pagecomponents;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mouseOverPage {
	
	WebDriver modriver;
	
	@FindBy(xpath="//a[@title=\"Click me\"]") private WebElement clickLink;
	@FindBy(xpath="//span[@id=\"clickCount\"]") private WebElement clickCount;
	
	public mouseOverPage(WebDriver driver) {
		this.modriver=driver;
		PageFactory.initElements(driver, this);
	}
	

	public void countclick(int n) throws InterruptedException {
		System.out.println(clickCount.getText());
		Thread.sleep(2000);
		Actions A=new Actions(modriver);
		A.doubleClick(clickLink).perform();
		System.out.println(clickCount.getText());
		Assert.assertEquals("2",clickCount.getText());
		
	}
	
	
}
