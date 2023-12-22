package com.Login.pack;
import static org.testng.Assert.assertEquals;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLogin {
	WebDriver driver;
	 
	
	
	@Test(dataProvider="Login")
	public void Login(String uname, String password ) {
		//System.setProperty("webdriver.chrome.driver", "D://ChromeDriver//chromedriver_win32//chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://iblesoft.smarteweb.com/");
		driver.findElement(By.name("unameTxt")).clear();
		driver.findElement(By.name("unameTxt")).sendKeys(uname);
		driver.findElement(By.name("passwordTxt")).clear();
		driver.findElement(By.name("passwordTxt")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"registerFormOne\"]/div/div[1]/div/div/div[2]/div[4]/button")).click();
		
		try {
		    assertEquals(driver.findElement(By.className("alert-message")).getText(), "You have successfully logged in");

		    System.out.println("PASS");
		    
		    driver.findElement(By.className("alert-message")).getText();
		    
		    Thread.sleep(2000);
		
	
		    
		    driver.findElement(By.xpath("//*[@id=\"notificationModal\"]/div/div/div[3]/button")).click();
		    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/a")).click();
		
//	    Prealertcls pc = new Prealertcls(driver);
//        pc.TestPrealert(uname, password, password, password, password, uname, password, password, password, password, password, password, password, uname, password);
          
		} catch (Exception e) {

			assertEquals(driver.findElement(By.className("alert alert-danger alert-dismissible")).getText(), "Your username OR password is incorrect or inactive");
			
		    System.out.println("FAIL");
		}
		
		
	}
		@AfterMethod
		public void teardown() {
			driver.close();
			
		} 
		
		@DataProvider(name="Login")
		public Object[][] passdata(){
			ExceldataConfig config=new ExceldataConfig("C:\\Users\\Jyotheeswar\\git\\datadriven\\datadriven\\src\\Tata.xlsx");
					int rows=config.getRowCount(0);
					Object[][] data = new Object[rows][2];
					for(int i=0;i<rows;i++) {
						data[i][0]=config.getData(0, i, 0);
						data[i][1]=config.getData(0, i, 1);
					}
			return data;
			
			
//		Object[][] Login = new Object[2][2];
//		
//		Login[0][0]="CUSID1001";
//		Login[0][1]="Iblesoft@123";
//		Login[1][0]="CUSID1008";
//		Login[1][1]="Iblesoft@123";
//			return Login;
//			
			
		}
	
	}


			

