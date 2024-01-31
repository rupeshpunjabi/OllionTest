package starttPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWithoutSelectTag {

		public static void main(String[] args) {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
			
			driver.findElement(By.xpath("//button[@type='button'][@class]")).click();
			
			//find total number of opt]ions 
		    List<WebElement>dropdown=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label")); 
		    System.out.println(dropdown.size());
		    
		    // print total number of options
		    for(WebElement printoption: dropdown)
		    {
		    	System.out.println(printoption.getText());
		    }
		    
		    //printing all elements using for loop
		    for(int i=0;i<14;i++)
		    {
		    	System.out.println(dropdown.get(i).getText());
		    }
		    
		    //click to all element
		    
		    for(WebElement clic: dropdown)
		    {
		    	clic.click();
		    }
		
		//to click on specific option or element
		    
		    for(int i=0; i<dropdown.size(); i++)
		    {
		    	if(dropdown.get(i).equals("Java"))
		    	{
		    	dropdown.get(i).click();
		    	break;
		    	}
		    }
		 // by using for-each loop
		    
		    for(WebElement clic: dropdown)
		    {
		    	String st=clic.getText();
		    	if(st.equals("Java") || st.equals("Python"))
		    	{
		    		clic.click();
		    	}
		    }
		
		}
}
