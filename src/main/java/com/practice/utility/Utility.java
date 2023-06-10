package com.practice.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Utility {
	static HSSFWorkbook hssw;
	public static ArrayList<Object[]> get_data_excel() throws IOException
	{
		ArrayList<Object[]> mydata=new ArrayList<Object[]>();
		String uname,pwd;
		File fin=new File("C:\\Users\\student\\eclipse-workspace\\com.practice.testng\\src\\test\\resources\\login.xls");
		FileInputStream in=new FileInputStream(fin);
		hssw=new HSSFWorkbook(in);
		HSSFSheet sheet=hssw.getSheetAt(0);
		int rows=sheet.getLastRowNum();
		for(int i=0;i<rows;i++)
		{
			HSSFRow row=sheet.getRow(i);
			uname=row.getCell(0).getStringCellValue();
			pwd=row.getCell(1).getStringCellValue();
			Object[] object= {uname,pwd};
			mydata.add(object);
			
		}
		return mydata;
	}
	
	

}
