package com.Login.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Prealertcls  {
	
	WebDriver driver;
	
		public Prealertcls(WebDriver driver) {
			 this.driver = driver;
		}

	

		@Test(dataProvider = "prealert")
		

		public void TestPrealert(String mname, String carrier,
				String carriertrackingTxt, String orderdate, String country, String anameTxt, String quantityTxt,
				String declaredvalue, String totalpriceTxt, String itemstatusTxt, String rmavalue, String orderidTxt,
				String lengthTxt, String widthTxt_1, String heightTxt) throws InterruptedException {
	 
//			driver.findElement(By.xpath("//*[@id=\"registerFormOne\"]/div/div[1]/div/div/div[2]/div[4]/button")).click();
			Thread.sleep(2000);
	//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/a")).click();
			
			//*[@id="content"]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/a
			
			
			driver.findElement(By.name("mnameTxt")).clear();
			driver.findElement(By.name("mnameTxt")).sendKeys(mname);
	 
			driver.findElement(By.name("carrierTxt")).clear();
			driver.findElement(By.name("carrierTxt")).sendKeys(carrier);
	 
			driver.findElement(By.name("carriertrackingTxt")).clear();
			driver.findElement(By.name("carriertrackingTxt")).sendKeys(carriertrackingTxt);
	 
			driver.findElement(By.name("orderdateTxt]")).clear();
			driver.findElement(By.name("orderdateTxt")).sendKeys(orderdate);
	 
			driver.findElement(By.name("country3Txt")).clear();
			driver.findElement(By.name("country3Txt")).sendKeys(country);
	 
			driver.findElement(By.name("anameTxt[]")).clear();
			driver.findElement(By.name("anameTxt[]")).sendKeys(anameTxt);
	 
			driver.findElement(By.name("quantityTxt[]")).clear();
			driver.findElement(By.name("quantityTxt[]")).sendKeys(quantityTxt);
	 
			driver.findElement(By.name("declaredvalueTxt[]")).clear();
			driver.findElement(By.name("declaredvalueTxt[]")).sendKeys(declaredvalue);
	 
			driver.findElement(By.name("totalpriceTxt[]")).clear();
			driver.findElement(By.name("totalpriceTxt[]")).sendKeys(totalpriceTxt);
	 
			driver.findElement(By.name("itemstatusTxt[]")).clear();
			driver.findElement(By.name("itemstatusTxt[]")).sendKeys(itemstatusTxt);
	 
			driver.findElement(By.name("rmavalue[]")).clear();
			driver.findElement(By.name("rmavalue[]")).sendKeys(rmavalue);
	 
			driver.findElement(By.name("orderidTxt[]")).clear();
			driver.findElement(By.name("orderidTxt[]")).sendKeys(orderidTxt);
	 
			driver.findElement(By.name("lengthTxt[]")).clear();
			driver.findElement(By.name("lengthTxt[]")).sendKeys(lengthTxt);
	 
			driver.findElement(By.name("widthTxt[]")).clear();
			driver.findElement(By.name("widthTxt[]")).sendKeys(widthTxt_1);
	 
			driver.findElement(By.name("heightTxt[]")).clear();
			driver.findElement(By.name("heightTxt[]")).sendKeys(heightTxt);
	 
			driver.findElement(By.xpath("/html/body/div[3]/header/nav/div/div/div[2]/div[2]/div[2]/div/div/ul/li[1]/a")).click();
		}
	 
		@DataProvider(name = "prealert")
	 
		public Object[][] TestDataFeed() {
	
			Excelreadconfg ef = new Excelreadconfg("C:\\Users\\Jyotheeswar\\eclipse-workspace\\Framework\\datadriven\\src\\Tata.xlsx");
			int row = ef.getRowCount(1);
	 
			Object[][] data1 = new Object[row][16];
	 
			for (int i = 0; i < row; i++) {
				data1[i][0] = ef.getData(1, i, 0);
				data1[i][1] = ef.getData(1, i, 1);
			}
	 
			return data1;
		}
	}


