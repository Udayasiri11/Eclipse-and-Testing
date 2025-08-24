package SeleniumDay3;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args)
	throws InterruptedException
		{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udaya siri\\OneDrive\\Documents\\chromedriver-win64[1]\\chromedriver-win64\\chromedriver.exe");	 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		try
		{
			driver.get("http://the-internet.herokuapp.com/upload ");
			File uploadFile=new File("C:\\Users\\hp\\OneDrive\\Desktop\\Wipro\\SeleniumDemo\\To-be-victorious-in-life-Yogananda-Paramahansa.pdf");
			WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
			fileInput.sendKeys(uploadFile.getAbsolutePath());
			driver.findElement(By.id("file-submit")).click();
			String resultText= driver.findElement(By.id("upload-files")).getText();
			
			System.out.println("Uploaded: " +resultText);
			Thread.sleep(500000);
		}
		finally
		{
			driver.quit();
		}			
	}
}
