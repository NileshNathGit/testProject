package day9;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
// FILE -> Workbook -> Sheet - Row - Cell
public class dataDriven 
{
	
	public static void macin() throws IOException  {
		//Read the File
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//newtest.xlsx");
		
	     // Go to workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        // Go to sheet
        XSSFSheet sheet = workbook.getSheetAt(0);

        int rows = sheet.getLastRowNum();

        for (int i = 1; i <= rows; i++) {
            XSSFRow row = sheet.getRow(i);
            int cols = row.getLastCellNum();
            for (int j = 0; j < cols; j++) { // ✅ Fixed increment here
                XSSFCell cell = row.getCell(j);
                System.out.print(cell + " | ");
            }
            System.out.println();
        }

        workbook.close(); // Always close workbook!
    }
	
	@Test
	void f() throws IOException
	{
		macin();
		
	}
	
}