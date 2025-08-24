package MavenDay1;
//import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Patient 
{
	public static void main(String[] args) 
			throws InterruptedException 
	{
		  String phone = "8790419639";
		  
		  WebDriver driver = new ChromeDriver();
		  
		    driver.manage().window().maximize();

		  
		    driver.get("https://www.fortishealthcare.com/doctors?location=all");
		    driver.findElement(By.id("locations")).click();
		    driver.findElement(By.xpath("//option[@data-attr='298+462']")).click();
		   
		    driver.findElement(By.xpath("//*[@id=\'block-fortis-content\']/div/div/div/ul/li[1]/div[2]/a[2]")).click();
		    Thread.sleep(4000);
		    driver.findElement(By.xpath("//*[@id=\'slot-booking\']/div/div[2]/div[2]/div/div/div/div[4]/div/div")).click();
		    driver.findElement(By.xpath("//*[@id=\'slot-booking\']/div/div[3]/div/div[2]/ul/li[7]")).click();
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//*[@id=\'slot-booking\']/div/div[4]/button")).click();
		    driver.findElement(By.xpath("//*[@id='slot-booking']/div/div[5]/div/div/div/div[2]/input")).sendKeys(phone);
		    
		     
		    driver.findElement(By.xpath("//*[@id='slot-booking']/div/div[5]/div/div/button")).click();
		    Thread.sleep(20000);
		    driver.findElement(By.xpath("//*[@id='slot-booking']/div/div[5]/div/div/button")).click();

	}
}
