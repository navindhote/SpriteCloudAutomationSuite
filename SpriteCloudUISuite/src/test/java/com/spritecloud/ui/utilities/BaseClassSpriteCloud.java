package com.spritecloud.ui.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassSpriteCloud {
	
	
	public WebDriver initialization() {	
//		System.setProperty("Webdriver.chrome.silentOutput", "true");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
