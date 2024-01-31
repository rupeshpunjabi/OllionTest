package starttPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPractice {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		
		driver.switchTo().frame(iframe);
		
		WebElement search= driver.findElement(By.xpath("//body[@id='tinymce']"));
		search.clear();
		search.sendKeys("hi my name is rupesh");
		
		/*Actions act=new Actions(driver);
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		driver.findElement(By.xpath("//button[@title='Bold']")).click();
	//	act.sendKeys(Keys.BACK_SPACE);
		*/
		
	}

}
