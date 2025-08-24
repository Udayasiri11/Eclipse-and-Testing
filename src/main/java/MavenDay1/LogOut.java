package MavenDay1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOut {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();

	        driver.get("https://parabank.parasoft.com/parabank/index.htm");

	        // Login
	        driver.findElement(By.name("username")).sendKeys("Udaya");
	        Thread.sleep(3000);
	        driver.findElement(By.name("password")).sendKeys("siri");
	        Thread.sleep(3000);
	        driver.findElement(By.cssSelector("input[value='Log In']")).click();

	        // Logout
	        driver.findElement(By.linkText("Log Out")).click();
	        Thread.sleep(3000);

	        // Validation
	        boolean loginBox = driver.findElement(By.name("username")).isDisplayed();
	        System.out.println("Logout successful: " + loginBox);
	        driver.quit();

		// TODO Auto-generated method stub

	}

}
