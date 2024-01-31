package starttPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement>links=driver.findElements(By.xpath("//a"));
		
		System.out.println(links.size());
		int brokenlinks=0;
		for (WebElement li:links)
		{
			//System.out.println(li.getText())
			
			String hrefvalue=li.getAttribute("href"); 
			System.out.println(hrefvalue);
			
			// prerequisite fr checking broken link that given link is empty or not
			if(hrefvalue==(null) || hrefvalue.isEmpty())
			{
				System.out.println("blank text");
				continue;
			}
			
			// checking whether link is broken or not
			
			URL linkurl=new URL(hrefvalue);
			
			HttpURLConnection con=(HttpURLConnection) linkurl.openConnection();
			con.connect();
			
			if(con.getResponseCode()>=400)
			{
				System.out.println("given link is broken: "+ hrefvalue);
				brokenlinks++;
			}
			else 
			{
				System.out.println("link is not broken: "+hrefvalue);
			}
		}
		System.out.println(brokenlinks);
	}
}
