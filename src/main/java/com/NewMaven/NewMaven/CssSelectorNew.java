package com.NewMaven.NewMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorNew {
	WebDriver driver;
	@Test
	public void cssSelect() {
	System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.dollardays.com/");
	driver.manage().window().maximize();
	String s = driver.findElement(By.cssSelector("span[class=call]")).getText();
	System.out.println(s);
	
}
}
