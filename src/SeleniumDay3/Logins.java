package SeleniumDay3;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Logins 
{
	public static void main(String[] args)
			throws IOException, InterruptedException
	{
		Properties props = new Properties();
        FileInputStream fis = new FileInputStream("Config.properties");
        props.load(fis);

        //String gmailEmail = props.getProperty("gmail.email");
        //String gmailPass = props.getProperty("gmail.password");

        //String fbEmail = props.getProperty("facebook.email");
        //String fbPass = props.getProperty("facebook.password");

        //String instaUser = props.getProperty("instagram.user");
        //String instaPass = props.getProperty("instagram.password");

        //String yahooEmail = props.getProperty("yahoo.email");
        //String yahooPass = props.getProperty("yahoo.password");

        String amazonEmail = props.getProperty("amazon.email");
        String amazonPass = props.getProperty("amazon.password");

        String chromeDriverPath = props.getProperty("chromedriver.path");
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Gmail Login
        /*driver.get("https://accounts.google.com/signin/v2/identifier?service=mail");
        driver.findElement(By.id("identifierId")).sendKeys(gmailEmail);
        driver.findElement(By.id("identifierNext")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("Passwd")).sendKeys(gmailPass);
        driver.findElement(By.id("passwordNext")).click();
        Thread.sleep(3000);

        //Facebook Login
        /*driver.get("https://www.facebook.com/login");
        driver.findElement(By.id("email")).sendKeys(fbEmail);
        driver.findElement(By.id("pass")).sendKeys(fbPass);
        driver.findElement(By.name("login")).click();
        Thread.sleep(3000);*/

        //Instagram Login
        /*driver.get("https://www.instagram.com/accounts/login/");
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys(instaUser);
        driver.findElement(By.name("password")).sendKeys(instaPass);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(5000);

        //Yahoo Login
        /*driver.get("https://login.yahoo.com/");
        driver.findElement(By.id("login-username")).sendKeys(yahooEmail);
        driver.findElement(By.id("login-signin")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("login-passwd")).sendKeys(yahooPass);
        driver.findElement(By.id("login-signin")).click();
        Thread.sleep(3000);*/

        //Amazon Login
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dmsndeskabkin-21%26ref%3Dnav_signin%26adgrpid%3D1318316051640309%26hvadid%3D82395019828275%26hvnetw%3Do%26hvqmt%3De%26hvbmt%3Dbe%26hvdev%3Dc%26hvlocint%3D%26hvlocphy%3D156075%26hvtargid%3Dkwd-82395637438085%3Aloc-90%26hydadcr%3D5652_2377259%26mcid%3Db983ec7c37413e6ab8b5124ff4bfc77b&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.findElement(By.id("ap_email")).sendKeys(amazonEmail);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ap_password")).sendKeys(amazonPass);
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(50000);
        
        driver.quit();

	}

}
