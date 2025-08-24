package MavenDay1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmTransaction {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();

	        driver.get("https://parabank.parasoft.com/parabank/index.htm");

	        driver.findElement(By.name("username")).sendKeys("Udaya");
	        driver.findElement(By.name("password")).sendKeys("siri");
	        driver.findElement(By.cssSelector("input[value='Log In']")).click();

	        driver.findElement(By.linkText("Transfer Funds")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.id("amount")).sendKeys("100");
	        Thread.sleep(3000);
	        driver.findElement(By.cssSelector("input[value='Transfer']")).click();
	        
	        String msg = driver.findElement(By.cssSelector("#rightPanel > div > div > h1")).getText();
	        System.out.println("Transaction Result: " + msg);
	        driver.quit();


		// TODO Auto-generated method stub

	}

}
