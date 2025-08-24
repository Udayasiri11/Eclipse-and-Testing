package MavenDay4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
	 private static final Logger obj = LogManager.getLogger(Log.class);
	    WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        obj.info("Launching Chrome browser");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        obj.info("Navigating to Amazon");
	        driver.get("https://www.amazon.in/");
	    }

	    @Test
	    public void loginTest() {
	        try {
	            obj.info("Clicking on Sign in button");
	            driver.findElement(By.id("nav-link-accountList")).click();

	            obj.info("Entering email/phone");
	            WebElement email = driver.findElement(By.id("ap_email_login"));
	            email.sendKeys("udayasiri2002@gmail.com");  
	            driver.findElement(By.id("continue")).click();
	            
	            obj.debug("Entering password");
	            WebElement password = driver.findElement(By.id("ap_password"));
	            password.sendKeys("Siri@2002");      
	            driver.findElement(By.id("signInSubmit")).click();

	            obj.debug("Login attempted successfully");
	        } catch (Exception e) {
	            obj.error("Login failed! Error: " + e.getMessage());
	        }
	    }

	    @AfterClass
	    public void tearDown() {
	        obj.info("Closing browser");
	        driver.quit();
	    }
}
