package com.spritecloud.ui.pagecomponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loadDilayPage {
	WebDriver lddriver;
	
	@FindBy(xpath="//button[text()=\"Button Appearing After Delay\"]") private WebElement dileyButton;
	
	public loadDilayPage(WebDriver driver) {
		this.lddriver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	public  void waitTillbuttonIsVisibleAndClickOnIt() {
		
//		WebDriverWait wait=new WebDriverWait(lddriver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("dileyButton")));
		lddriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		dileyButton.click();
	}

}
