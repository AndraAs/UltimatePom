package com.DemoWebShop.Cucumber.ExcelReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenReader {
	
	
	public ArrayList<String> getData(String testCaseName) throws IOException {
		//fileInputStream argument
		ArrayList<String>a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("C:\\Users\\Andra\\Downloads\\userRegister.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int Sheets=workbook.getNumberOfSheets();
		for (int i=0; i< Sheets;i++) {
			
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
					{
			XSSFSheet sheet=workbook.getSheetAt(i);
			//Identify testcases column by scanning entire first row
			Iterator<Row> rows=sheet.iterator();
			Row firstRow=rows.next();
			Iterator<Cell> Cellu=firstRow.cellIterator();
			int k=0;
			int column=0;
			while (Cellu.hasNext())
			{
				Cell value=Cellu.next();
				if(value.getStringCellValue().equalsIgnoreCase("URL")) {
					//this is the desired column
					column=k;
				}
				k++;
			}
			System.out.println(column);
			//once column is identified, scan the first column
			while(rows.hasNext()) {
				Row r=rows.next();
				if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {
					//after you grab name row pull all the data of that row and pull it into the test
					Iterator<Cell> cellValues=r.cellIterator();
					while(cellValues.hasNext()) {
						a.add(cellValues.next().getStringCellValue());
					}
				
				}
			
			}
					}
			
		}
		return a;

	}
	
	

	public static void main(String[] args)  {



}}
