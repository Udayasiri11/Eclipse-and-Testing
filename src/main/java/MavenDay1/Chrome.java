package MavenDay1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Chrome
{
	public static void main(String[] args)	
	{
		// Auto-download and setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        String pageSource = driver.getPageSource();
        if(pageSource.contains("[show-background-image] #backgroundImage"))
        {
        	System.out.println("True");
        }
        else
        {
        	System.out.println("False");
        }
        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("My browser handle: "+ driver.getWindowHandle());
        driver.quit();
	}
}
