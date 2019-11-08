package com.target.target;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class new_1 {
	public WebDriver driver;

	@FindBy(linkText="Gift Cards")
	WebElement gfd;
	
	public new_1 (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	public void gftcrd() {
		gfd.click();
	}
}