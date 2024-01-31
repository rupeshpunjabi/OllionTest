package starttPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CollectionsSort {
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\RUPESH\\eclipse-workspace\\Selenium_practice\\Binary\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String window=driver.getWindowHandle();
		System.out.println(window);
		
		WebElement CreateNewAccount= driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		CreateNewAccount.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
		//day.click();
		
		Select birthday=new Select(day);
		birthday.selectByIndex(2);
		
		WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
		
		Select birthmonth= new Select(month);
		birthmonth.selectByVisibleText("May");
		
		WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		
		Select birthyear= new Select(year);
		//birthyear.selectByValue("1994");
		// sorting year
		
		List<WebElement> options= birthyear.getOptions();
		ArrayList orignal= new ArrayList();
		ArrayList templist= new ArrayList();
		
			for(WebElement option:options)
		{
			orignal.add(option.getText());
			templist.add(option.getText());
		}
		Collections.sort(templist);
		
		System.out.println("Before Sorting: "+orignal);
		System.out.println("After sorting: "+templist);
		
		if(orignal.equals(templist))
		{
			System.out.println("it is sorted");
		}
		else
		{
			System.out.println("it is unsorted");
		}
		driver.close();
		
	}
	}

