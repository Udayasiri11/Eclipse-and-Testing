package SeleniumDay3;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ResumeUpload 
{

	public static void main(String[] args)
			throws InterruptedException 
	{
		 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\udaya siri\\OneDrive\\Documents\\chromedriver-win64[1]\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();	        
	        driver.get("https://login.naukri.com/nLogin/Login.php");
	        driver.findElement(By.id("usernameField")).sendKeys("udayasiri2002@gmail.com");
	        driver.findElement(By.id("passwordField")).sendKeys("Siri@2002");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();	            
	        Thread.sleep(5000);
	        driver.get("https://www.naukri.com/mnjuser/profile");	                       
	        Thread.sleep(5000);	  
	        File resumeFile = new File("C:\\Users\\udaya siri\\OneDrive\\Desktop\\Siri resume and certifi\\Resume\\Siri upated resume (2) (2).pdf");   
	        //WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"resume360\"]"));
	        //WebElement fileInput = driver.findElement(By.id("attachCV"));  
	        WebElement fileInput = driver.findElement(By.className("fileUpload")); 
	        fileInput.sendKeys(resumeFile.getAbsolutePath());
	        Thread.sleep(50000);            
	        driver.quit();
	 }
}

