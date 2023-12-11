package com.Login.pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Readexceldata {

	public static void main(String[] args) throws IOException {
		
		File src = new File("C:\\Users\\Jyotheeswar\\eclipse-workspace\\Framework\\datadriven\\src\\Tata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook 	wb = new XSSFWorkbook(fis);
		
		XSSFSheet Sheet1=wb.getSheetAt(0);
		
        XSSFSheet Sheet2=wb.getSheetAt(1);
        
        String data0=Sheet1.getRow(0).getCell(0).getStringCellValue();
        System.out.println("Data from excel is  "+ data0);
        String data1=Sheet1.getRow(0).getCell(1).getStringCellValue();
        System.out.println("Data from excel is "+ data1);
        
//        String data2=Sheet1.getRow(1).getCell(0).getStringCellValue();
//        System.out.println("Data from excel is  "+ data2);
//        String data3=Sheet1.getRow(1).getCell(1).getStringCellValue();
//        System.out.println("Data from excel is "+ data3);
        
        
        
        
        String data01=Sheet2.getRow(0).getCell(0).getStringCellValue();
        System.out.println("Data from excel is  "+ data01);
        String data11=Sheet2.getRow(0).getCell(1).getStringCellValue();
        System.out.println("Data from excel is "+ data11);
        
        String data21=Sheet2.getRow(1).getCell(0).getStringCellValue();
        System.out.println("Data from excel is  "+ data21);
        String data31=Sheet2.getRow(1).getCell(1).getStringCellValue();
        System.out.println("Data from excel is "+ data31);
        
        
        wb.close();
	}

}
