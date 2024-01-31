package revision;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\RUPESH\\eclipse-workspace\\NewSelinium\\target\\home.png");
		FileUtils.copyFile(src, target);
	}

}
