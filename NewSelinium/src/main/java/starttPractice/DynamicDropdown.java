package starttPractice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("java");
			Thread.sleep(3000);
			
			List<WebElement> javalist= driver.findElements(By.xpath("//div[@class='wM6W7d']//span"));
			
			System.out.println("number of options : "+javalist.size());
			
			/*for(WebElement element: javalist)
			{
				String list=element.getText();
				
				System.out.println(list);
				
				if(list.equals("javascript"))
				{
					element.click();
					break;
					
				}
			}*/
			for(int i=0; i<javalist.size();i++)
			{
			String list=javalist.get(i).getText();
			System.out.println(list);
			
			if(list.equals("javascript"))
			{
				javalist.get(i).click();
				break;
			}
			}
			
			
			
		
	}
}
