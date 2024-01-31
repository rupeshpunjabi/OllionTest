package starttPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
			public static void main(String[] args) {
				
				
				WebDriver driver=new ChromeDriver();
				driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				// 1) Find total number of rows 
				// 2) find total number of colums
				// 3) read specific row and column data
				// 4) read data from all rows and column
				// 5) print book names whose author is amit
				// 6) find sum of prices of all books
				
				// 1) find total number of rows
				
			int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
			System.out.println("total number of rows are : "+rows);
			
			// 2) find total number of colums
			
			int col= driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
			System.out.println("number of columns are : "+ col);
				
			// 3) read column data
			
			List<WebElement> coldata=driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
			
			for(WebElement data: coldata)
			{
				System.out.println(data.getText()+"\t");	
			}
			// read specific row and column data
			
			String value= driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[3]")).getText();
			System.out.println(value);
				
			// read data from all rows and columns
			
		//	List<WebElement> table= driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
			//List<WebElement> column=driver.findElements(By.xpath("//table[@name='BookTable']//tr//td"));
			
			for(int r=2; r<=rows; r++)
			{
				for(int c=1; c<=col; c++)
				{
					String text= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
					System.out.print(text+"\t");
				}
				System.out.println();           
			}
			// print book names whose author is amit
				
			for(int r=2; r<=rows; r++)
			{
				String author= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			//	System.out.println(author);
				
				if (author.equals("Amit"))
				{
					String bookname= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
					System.out.println(bookname);
				}
			}
			// find sum of price of all books
			
			int sum=0;
			for(int r=2; r<=rows; r++)
			{
				String cost= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				sum=sum+Integer.parseInt(cost);
				
			}
			System.out.println("sum of all books is : "+sum);
				
				
				
				
			}
}
