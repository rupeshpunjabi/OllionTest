package revision;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class BrokenlinkRevise {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		//WebElement badgateway=driver.findElement(By.xpath("//a[text()='Errorcode 502']"));
		
		//js.executeScript("arguments[0].scrollIntoView;",badgateway);
		
		List<WebElement>links= driver.findElements(By.xpath("//a"));
		
		System.out.println(links.size());
		
		int brokenlinks=0;
		for(WebElement li:links)
		{
			String hrefattribute= li.getAttribute("href");
			
			if(hrefattribute.isEmpty() || hrefattribute==null)
			{
				System.out.println("blank attribute");
				continue;
			}
			
			URL linkurl=new URL(hrefattribute);
			
			HttpURLConnection connect=(HttpURLConnection) linkurl.openConnection();
			connect.connect();
			
			if(connect.getResponseCode()>=400)
			{
				//System.out.println("givenlink is broken");
				brokenlinks++;
			
			}
		
			else
			{
				System.out.println("links is not broken");
			}
			
		}
		System.out.println(brokenlinks);
	}

}
