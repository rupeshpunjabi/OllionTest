package starttPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("rupesh");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("punjabi");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		String acttitle="Facebook – log in or sign up";
		
		if(title.equals(acttitle))
		{
			System.out.println("title is correct");
		}
		else
		{
			System.out.println("incorrect title");
		}
	}

}
