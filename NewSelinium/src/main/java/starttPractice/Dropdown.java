package starttPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) {
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/\");");
			driver.manage().window().maximize();
			
		WebElement country=	driver.findElement(By.xpath("//select[@id='country-list']"));
		
		Select sel=new Select(country);
		//sel.selectByVisibleText("India");
		sel.selectByIndex(3);
		//sel.selectByValue("3");
		
		List<WebElement>seloptions= sel.getOptions();
		System.out.println(seloptions.size());
		
		for(WebElement opt: seloptions)
		{
			System.out.println(opt.getText());
		}
		
		//to print all values from select class
		for(int i=0;i<seloptions.size();i++)
		{
			System.out.println(seloptions.get(i).getText());
		}
		
		// to print first three values of select class
		for(int i=0;i<3;i++)
		{
			System.out.println(seloptions.get(i).getText());
		}
		
	}
}
