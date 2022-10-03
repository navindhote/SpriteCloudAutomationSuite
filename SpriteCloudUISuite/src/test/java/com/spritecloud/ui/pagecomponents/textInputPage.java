package com.spritecloud.ui.pagecomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class textInputPage {
	WebDriver TIdriver;
	
	@FindBy(xpath="//input[@type=\"text\"]") private WebElement textBox;
	
	@FindBy(xpath="//input[@type=\"text\"]//following-sibling::button") private WebElement button;
	
	
	public textInputPage(WebDriver driver) {
		this.TIdriver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	
	public void addText(String txt) {
		textBox.sendKeys(txt);
	}

	public String clickButton() throws InterruptedException {
		
		button.click();
		Thread.sleep(1000);
		System.out.println("The text presnt on the button is "+button.getText());
		
		String btnText= button.getText();
		return btnText;
	}

}
