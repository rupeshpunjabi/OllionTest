package starttPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsvsscriptExecutor {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.google.com/");
		
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.get("https://www.amazon.com/");
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		// scroll down by pixel
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)","");
		
		// scroll till element is present
		WebElement germany=driver.findElement(By.xpath("//td[text()='Germany']"));
		
		js.executeScript("arguments[0].scrollIntoView();",germany);
		
		//scroll down till end of the page
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("returnwindow.pageYOffset;"));
		
		
		
		
	}
}
