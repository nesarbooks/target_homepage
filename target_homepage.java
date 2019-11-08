package com.target.target;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class target_homepage {
public WebDriver driver;

	@FindBy(linkText="RedCard")
	WebElement rdc;
	
	public target_homepage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void rdcrd() {
		rdc.click();
	}
	
}
