package starttPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

			public static void main(String[] args) {
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://testautomationpractice.blogspot.com/");
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    WebElement	alert1= driver.findElement(By.xpath("//button[text()='Alert']"));
				
			    alert1.click();
				
		
				Alert al= driver.switchTo().alert();
				System.out.println(al.getText());
				al.accept();
				
				driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
				
				Alert al2= driver.switchTo().alert();
				System.out.println(al2.getText());
				al2.dismiss();
				
				driver.findElement(By.xpath("//button[text()='Prompt']")).click();
				
				Alert al3=driver.switchTo().alert();
				System.out.println(al3.getText());
				al3.sendKeys("Rupesh Punjabi");
				al3.accept();
				
				String actualtext= driver.findElement(By.xpath("//p[@id='demo']")).getText();
				System.out.println(actualtext);
				String ourtext="Hello Rupesh Punjabi! How are you today?";
				
				if(actualtext.equals(ourtext))
				{
					System.out.println("test passed");
				}
				else
				{
					System.out.println("test failed");
				}
			}
}
