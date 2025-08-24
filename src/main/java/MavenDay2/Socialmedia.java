package MavenDay2;
import java.io.FileInputStream;
import java.io.IOException;
//import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;  
public class Socialmedia 

{
	WebDriver driver;
    Properties props = new Properties();
    String user;
    String password;

    @BeforeClass
    public void setup() throws IOException {
            FileInputStream fis = new FileInputStream("Config.properties");
            props.load(fis);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            user = props.getProperty("instasele.user");
            password = props.getProperty("instasele.password");
        }
    @Test(priority = 1)
    public void InstaLogin() throws InterruptedException {
        driver.get("https://www.instagram.com/");
        driver.findElement(By.name("username")).sendKeys(user);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(5000);
    }
}

    	  