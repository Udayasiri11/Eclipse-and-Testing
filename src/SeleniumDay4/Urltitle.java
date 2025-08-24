package SeleniumDay4;
//import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
//import java.util.Properties;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.print.PrintOptions;
public class Urltitle 
{
	public static void main(String[] args) 
			throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://github.com/");     
        String Url=driver.getCurrentUrl();
        String title=driver.getTitle();
        String windowHandle = driver.getWindowHandle();
        System.out.println("The url of the page: " + Url);
        System.out.println("The title of the page is: " + title); 
        System.out.println("The window handle is: " + windowHandle);
        Thread.sleep(5000);
        driver.quit();
	}

}
