package starttPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		List<WebElement>days= driver.findElements(By.xpath("//input[@class='form-check-input'][@type='checkbox']"));
		
		// how to select and deselect all checkboxes
		for(WebElement dy:days)
		{
			dy.click();
			System.out.println(dy.getText());
		}for(WebElement dy:days)
		{
			dy.click();
			System.out.println(dy.getText());
		}
	}
}
