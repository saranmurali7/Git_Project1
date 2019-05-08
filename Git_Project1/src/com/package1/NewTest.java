package com.package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest 
{
	static String url="https://www.guru99.com/selenium-tutorial.html";
	WebDriver driver;
	static String key="webdriver.gecko.driver";
	static String value="./Drivers/geckodriver";
  @Test
  public void f() 
  {
	  System.setProperty(key, value);
	  driver=new FirefoxDriver();
	  driver.get(url);
	  
	  
  }
}
