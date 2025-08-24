package SeleniumDay3;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Gmaillogin {
	public static void main(String[] args)
			throws IOException, InterruptedException
	{
		Properties props = new Properties();
        FileInputStream fis = new FileInputStream("Config.properties");
        props.load(fis);      
        String gmailEmail = props.getProperty("gmail.email");
        String gmailPass = props.getProperty("gmail.password");      
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail");
        driver.findElement(By.id("identifierId")).sendKeys(gmailEmail);
        driver.findElement(By.id("identifierNext")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("Passwd")).sendKeys(gmailPass);
        driver.findElement(By.id("passwordNext")).click();
        Thread.sleep(3000);     
        driver.quit();
	}
}
