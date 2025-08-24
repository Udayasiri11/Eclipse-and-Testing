package SeleniumDay1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele {

	public static void main(String[] args) 
	{
		// Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\udaya siri\\OneDrive\\Documents\\chromedriver-win64[1]\\chromedriver-win64\\chromedriver.exe");

        // Create ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Print title
      System.out.println("Page Title: " + driver.getTitle());

        // Close browser
       // driver.quit();
        
        driver.close();
    }
}
