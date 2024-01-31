package starttPractice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dummyflights.com/");
		
		driver.findElement(By.xpath("//input[@id='flight-departure-date']")).click();
		//WebElement monthyear=driver.findElement(By.xpath("(//th[@class='month'])[1]"));
		
		String dt="3";
		//String mn="05";
		String mnyr="May 2024";
		//String yr="2024";
		
		while(true)
		{
			String monthyear= driver.findElement(By.xpath("(//th[@class='month'])")).getText();
			
			if(monthyear.equals(mnyr))
			{
				break;
			}
			driver.findElement(By.xpath("(//th[@class='month'])[1]//following-sibling::th")).click();
		}
		
		
		List<WebElement> alldates=driver.findElements(By.xpath("(//table[@class='table-condensed'])[1]//td"));
		
		for(WebElement date:alldates)
		{
			if(date.getText().equals(dt))
			{
				date.click();
				break;
			}
		}
		 driver.findElement(By.xpath("(//input[@id='flight-return-date'])")).click();
		 
		 String returnmonth="Jun 2024";
		 String returndate="4";
		 
		 while(true)
		 {
			 String text= driver.findElement(By.xpath("(//th[@class='month'])[4]")).getText();
			
			 
			 if(text.equals(returnmonth))
			 {
				 break;
			 }
			 driver.findElement(By.xpath("//div[@class='calendar-table']//th[3]")).click();
			 
		 }
		 
		List<WebElement> date2=driver.findElements(By.xpath("(//table[@class='table-condensed'])[4]//td"));
		 
		for(WebElement date:date2)
		{
			if(date.getText().equals(returndate))
			{
				date.click();
				break;
				
			}
		}
	}
}

