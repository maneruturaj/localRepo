package Selenium_Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_sheet
{

	public static void main(String[] args) throws InterruptedException,IOException
	{
		String path ="C:\\Users\\Ruturaj Mane\\Desktop\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		
		Workbook book =	WorkbookFactory.create(file);
				Sheet sheet=book.getSheet("Ruturaj");
				
			int lastrow	=sheet.getLastRowNum();
	
			//System.out.println(lastrow);
			
			Row row =sheet.getRow(lastrow);
			
			int lastcell=row.getLastCellNum();
			
			System.out.println("get last cell number"+lastcell);
			System.out.println("get last row"+lastrow);
			
			System.out.println();
			
			for(int i=0;i<lastrow;i++)
			{
				for(int j=0;j<lastcell;j++)
				{
					String output = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(output +" , ");
				}
				System.out.println();
			}
		
	}

}
