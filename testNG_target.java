package com.target.target;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class testNG_target {
	public WebDriver driver;
	
  @Test (priority=0)
  public void f() {
	  target_homepage obj = new target_homepage(driver);
	  obj.rdcrd();
	  
  }
  @Test (priority=1)
  public void f2() {
	  new_1 obj1 = new new_1(driver);
	  obj1.gftcrd();
  }
  @Parameters ("browser")
  @BeforeClass
  public void beforeClass(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
		     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yoga\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		      driver=new ChromeDriver();
		      driver.navigate().to("https://www.target.com");
		      driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		      }else if (browser.equalsIgnoreCase("firefox")){
		         System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yoga\\eclipse-workspace\\Automation_aps_code\\Drivers\\geckodriver.exe");
		         driver=new FirefoxDriver();
		         driver.navigate().to("https://www.target.com");
		         driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		          }else {
		         
		      }
  }

  @AfterClass
  public void afterClass() {
  }

}
