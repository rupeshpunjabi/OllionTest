package starttPractice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
		public static void main(String[] args){
		
			
			WebDriver driver= new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//declaring explicit wait
			
			WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
					
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			//Thread.sleep(5000);
			
			WebElement username= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
			username.sendKeys("Admin");
			
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']"))).sendKeys("admmin123");
			//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				
			
			FluentWait wait=new FluentWait(driver);
			wait.withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(5))
			.ignoring(NoSuchElementException.class);
		
			WebElement login=(WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
				
			login.click();	
			}
}
