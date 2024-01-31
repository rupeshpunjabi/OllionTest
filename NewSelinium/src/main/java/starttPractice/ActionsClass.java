package starttPractice;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions act=new Actions(driver);
		
		WebElement bank= driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement bankplace=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Thread.sleep(5000);
		
		act.dragAndDrop(bank, bankplace).perform();
		
		WebElement amount= driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement amountplace=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		act.dragAndDrop(amount, amountplace).perform();
		
		WebElement sales=driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement salesplace=driver.findElement(By.xpath("//li[@class='placeholder'])[3]"));
		
		act.dragAndDrop(sales, salesplace).perform();
		
		WebElement salesamt=driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement salesamtplace=driver.findElement(By.xpath("//li[@class='placeholder'])[4]"));
		
		act.dragAndDrop(salesamt, salesamtplace).perform();
		
		//WebElement logo=driver.findElement(By.xpath(""));
		//System.out.println(logo.getLocation());
		//driver.manage().window().fullscreen();
		
		// To set window size
		//org.openqa.selenium.Point po=new org.openqa.selenium.Point(100,100);
		//driver.manage().window().setPosition(po);
	
		
	}
}
