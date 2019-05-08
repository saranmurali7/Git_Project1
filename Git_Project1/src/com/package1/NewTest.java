package com.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
      WebElement home=driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a/span"));
	  home.click();
	  
  }
}
