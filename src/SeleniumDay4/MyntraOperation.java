package SeleniumDay4;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.List;
//import java.util.ArrayList;
public class MyntraOperation 
{

	public static void main(String[] args)
			throws IOException, InterruptedException
	{
		Properties props = new Properties();
	    FileInputStream fis = new FileInputStream("Config.properties");
	        props.load(fis);        
	        String myntra = props.getProperty("myntra.user"); 
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	        driver.get("https://www.myntra.com/"); 
	        driver.get("https://www.myntra.com/login?referer=https%3A%2F%2Fwww.myntra.com%2F");
	       
	        driver.findElement(By.cssSelector("input[type='tel']")).sendKeys(myntra);
	        driver.findElement(By.className("consentCheckbox")).click();
	        driver.findElement(By.className("submitBottomOption")).click();
	}

}
