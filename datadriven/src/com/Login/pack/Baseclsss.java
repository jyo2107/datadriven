package com.Login.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Baseclsss{
	WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser() {
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://iblesoft.smarteweb.com/");
	
	}
	
	
//	@Test
//	public void LTT() {
//		TestLogin tl = new TestLogin();
//		 tl.Login(null, null);
	//
	
	@AfterTest 
	public void Teardown() {
		driver.close();
	}
}

