package starttPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	
	public static void main(String[] args) {
		
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				String mainwindow=driver.getWindowHandle();
				driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("java");
				
				driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
				
				List<WebElement>javalist= driver.findElements(By.xpath("//a[contains(text(),'Java')]"));
				
				for(WebElement li: javalist)
				{
					String text= li.getText();
					System.out.println(text);
					
					li.click();
					
					
				}
				driver.switchTo().window(mainwindow);
				
				Set<String> winids= driver.getWindowHandles();
				
							
				for(String wi:winids)
				{
					String titlename= driver.switchTo().window(wi).getTitle();
					System.out.println(titlename);
					
					if(titlename.equals("Java version history - Wikipedia")|| titlename.equals("Automation Testing Practice"))
					{
						driver.close();
					}
				}
				
				
				
				
				
				
				
				
				
				
				
					
	}				
}
