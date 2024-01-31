

package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class FirstTest {
	
	WebDriver driver; 
  
	@BeforeMethod
	void openurl()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("this is method one");
	}
	@Test(priority = 2)
	void login()
	{
		System.out.println("login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jaishrikrishna");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("rupeshpunjabi");
	}
	@AfterMethod
	void close()
	{
		//driver.close
		System.out.println("you can close the method");
	}
	
}
