package MavenDay1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookAppointment
{
	public static void main(String[] args)
			throws InterruptedException 
	{
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();

	        driver.get("https://parabank.parasoft.com/parabank/index.htm");
	        driver.findElement(By.name("username")).sendKeys("Udaya");
	        driver.findElement(By.name("password")).sendKeys("siri");
	        driver.findElement(By.cssSelector("input[value='Log In']")).click();
	        
	        // Go to Bill 
	        driver.findElement(By.linkText("Bill Pay")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.name("payee.name")).sendKeys("Dr. Spandana");
	        Thread.sleep(3000);
	        driver.findElement(By.name("payee.address.street")).sendKeys("123 Clinic Road");
	        Thread.sleep(3000);
	        driver.findElement(By.name("payee.address.city")).sendKeys("Hyderabad");
	        Thread.sleep(3000);
	        driver.findElement(By.name("payee.address.state")).sendKeys("TG");
	        Thread.sleep(3000);
	        driver.findElement(By.name("payee.address.zipCode")).sendKeys("500001");
	        Thread.sleep(3000);
	        driver.findElement(By.name("payee.phoneNumber")).sendKeys("8790419639");
	        Thread.sleep(3000);
	        driver.findElement(By.name("payee.accountNumber")).sendKeys("12345");
	        Thread.sleep(3000);
	        driver.findElement(By.name("verifyAccount")).sendKeys("12345");
	        Thread.sleep(3000);
	        driver.findElement(By.name("amount")).sendKeys("500");
	        Thread.sleep(3000);
	        driver.findElement(By.cssSelector("input[value='Send Payment']")).click();
	        
	        Thread.sleep(3000);
	        System.out.println("Appointment (Bill Payment) booked successfully!");
	        driver.quit();
	}

}
