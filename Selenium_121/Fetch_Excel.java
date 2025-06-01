package Selenium_121;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Excel
{
  //Fetch the excel sheet
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		String Path ="C:\\Users\\Ruturaj Mane\\Desktop\\Book1.xlsx";
		InputStream file = new FileInputStream(Path);
		
		//String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
		//System.out.println(data);
		
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheetAt(0);
		
		int last_row = sheet.getLastRowNum(); 
		System.out.println("last row number : " + last_row); // last row no. = 5 
		
		Row row = sheet.getRow(last_row);
		int last_cell = row.getLastCellNum();
		System.out.println("last cell number : " + last_cell);   // last_cell_number = 2
	
		
		System.out.println();
		
		for(int i=0; i<=last_row; i++)
		{
			for (int j = 0; j<last_cell; j++)
			{
				String output = sheet.getRow(i).getCell(j).getStringCellValue();
				//double numeric =	sheet.getRow(i).getCell(j).getNumericCellValue();
								
				System.out.print(output + ", ");
	
			}
			System.out.println();
		}
		
	
	}

}
