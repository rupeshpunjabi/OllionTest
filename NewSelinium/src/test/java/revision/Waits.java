package revision;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Waits {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		FluentWait mywait=new FluentWait(driver);
		mywait.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		
		WebElement bestsellers=(WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='nav-xshop']//a[3]")));
		bestsellers.click();
	
	
	}
	

}
