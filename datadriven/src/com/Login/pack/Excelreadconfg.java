package com.Login.pack;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreadconfg {
	XSSFWorkbook wb;
	XSSFSheet Sheet2;
	
	public Excelreadconfg(String excelpath) {
		try
		{
			File src=new File(excelpath);
			FileInputStream fis = new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		} 
		
	}

	
	public String getData(int sheetnumber,int row,int column) {
		Sheet2=wb.getSheetAt(sheetnumber);
		String data1= Sheet2.getRow(row).getCell(column).getStringCellValue();
		return data1;
		
	}

	public int getRowCount(int sheetIndex) {
		
	int row=	wb.getSheetAt(sheetIndex).getLastRowNum();
		
		row=row+1;
		
		return row;
	}
}

