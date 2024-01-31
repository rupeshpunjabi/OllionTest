package starttPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshot {
	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.com/");
		//WebElement image= driver.findElement(By.xpath("//img[@alt='Cyber Monday starts now. Shop Cyber Monday deals now']"));
		
		//File src=image.getScreenshotAs(OutputType.FILE);
		//File target=new File("C:\\Users\\RUPESH\\eclipse-workspace\\NewSelinium\\Screenshot\\iamge1.pnj");
		
		org.openqa.selenium.TakesScreenshot ts=(org.openqa.selenium.TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\\\Users\\\\RUPESH\\\\eclipse-workspace\\\\NewSelinium\\\\Screenshot\\\\iamge2.pnj");
		FileUtils.copyFile(src, target);

	}
}
