package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OllionTestTest {
  @Test
  public void Test1() {
	  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act=new Actions(driver);
		
		driver.get("https://stackoverflow.com/");
		//driver.switchTo().alert().accept();
		WebElement cookies= driver.findElement(By.xpath("//button[text()='Accept all cookies']"));
		cookies.click();
		
		WebElement toppbar= driver.findElement(By.xpath("(//div[@class='s-topbar--container']//a)[1]"));
		toppbar.click();
		
		WebElement users= driver.findElement(By.xpath("//span[text()='Users']"));
		users.click();
		
		WebElement editors=driver.findElement(By.xpath("//a[contains(text(),' Editors')]"));
		editors.click();
		
		
		WebElement page2=driver.findElement(By.xpath("//a[@title='Go to page 2']"));
		act.moveToElement(page2);
		
		page2.click();
		
		System.out.println("following are the details of user name which has the max number of edits count on the second page: ");
		
		String username=driver.findElement(By.xpath("//div[@class='user-details']//a")).getText();
		System.out.println("User name is: "+username);
		
		WebElement location=driver.findElement(By.xpath("//span[@class='user-location']"));
		if(location.getText()==null)
		{
			System.out.println("No location given");
		}
		else 
		{
		System.out.println("location is: "+location.getText());
		}
		
		WebElement edits=driver.findElement(By.xpath("//div[@class='user-tags']"));
		System.out.println("max edit count is: "+ edits.getText());
		
		 driver.close();
	}

  }

