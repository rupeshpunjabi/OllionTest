package starttPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

				// file-->Workbook-->Sheet-->Rows-->Cell

public class ExelRead {
	public static void main(String[] args) throws IOException {
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("http://www.deadlinkcity.com/");
		FileInputStream file=new FileInputStream("C:\\Users\\RUPESH\\OneDrive\\Desktop\\Test.xlss");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1"); //workbook.getSheetAt(0);

		int totalrows= sheet.getLastRowNum();
		int totalcell=sheet.getRow(1).getLastCellNum();
		
		System.out.println(totalrows);
		System.out.println(totalcell);
		
		for(int r=0; r<=totalrows;r++)
		{
			XSSFRow row= sheet.getRow(r);
			
			for (int c=1; c<totalcell;c++)
			{
				//String text= row.getCell(c).toString();
		     XSSFCell ce=row.getCell(c);
		     String text= ce.toString();
		     System.out.print(text+"      ");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}
}
