package day6;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class dataDriven 
{
	//File-->WorkBook --> Sheet --> row ---> cell
	@Test
	public void f() throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int totrows = sheet.getLastRowNum();
		int totColns = sheet.getRow(1).getLastCellNum();
//		XSSFRow row = sheet.getRow(0);
		System.out.println("Total rows :"+totrows); //sTARTS FROM 0
		System.out.println("Total columbs :"+totColns); //sTARTS FROM 1
		
		for(int r=1;r<=totrows;r++) {
			XSSFRow currentRow = sheet.getRow(r);
			for(int c=0;c<totColns;c++) {
				XSSFCell cell = currentRow.getCell(c);
				System.out.print(cell.toString()+" | ");
				
			}System.out.println();
		}
	}
		
		
		
	}


