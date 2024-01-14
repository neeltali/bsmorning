package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	public static XSSFWorkbook wb;
/*	public ExcelDataProvider() throws Exception {
		String path="C:\\Users\\Advantal\\eclipse-workspace\\Nec\\TestData\\Test.xlsx";
		FileInputStream fis1= new FileInputStream(path);
		 wb= new XSSFWorkbook(fis1);
		
	} */
	
	public static String getStringData(String sheetname, int row, int cell) {
		String path="C:\\Users\\Advantal\\eclipse-workspace\\Nec\\TestData\\Test.xlsx";
		FileInputStream fis1 = null;
		try {
			fis1 = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			wb= new XSSFWorkbook(fis1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();	
	}

}
