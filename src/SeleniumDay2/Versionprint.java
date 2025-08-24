package SeleniumDay2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Versionprint {

	public static void main(String[] args)
			throws InterruptedException
	{
		// TODO Auto-generated method stub
        WebDriver driver = new FirefoxDriver();
        Thread.sleep(5000);
        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
        // Browser name
        String browserName = caps.getBrowserName();
        // Browser version
        String browserVersion = caps.getBrowserVersion();
        System.out.println("Browser Name: " + browserName);
        System.out.println("Browser Version: " + browserVersion);
        driver.quit();
	}
}
