package starttPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		//System.out.println(driver.getPageSource());
		
		//System.out.println(driver.getWindowHandle());
		
		WebElement services=driver.findElement(By.xpath("//div[text()='Services']"));
		//services.click();
		
		Set<String> windowids=driver.getWindowHandles();
		
		for(String wind: windowids)
		{
			System.out.println(wind);
		}
		WebElement search=driver.findElement(By.xpath("//span[text()='Search jobs here']//following::button//span"));
		boolean sr=search.isDisplayed();
		System.out.println(search.isEnabled());
		System.out.println(search.isSelected());
		System.out.println(sr);
		
		driver.quit();
		
		//driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
	}

}
