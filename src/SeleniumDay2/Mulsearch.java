package SeleniumDay2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Mulsearch {
	public static void main(String[] args)
		throws InterruptedException
		{
	        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\udaya siri\\OneDrive\\Documents\\chromedriver-win64[1]\\chromedriver-win64\\chromedriver.exe");	 
	        WebDriver driver = new ChromeDriver();        
	        driver.manage().window().maximize();
	  
	        System.out.println("Let's Go");
	       
	        driver.get("https://www.google.com");
	        Thread.sleep(2000);
	        
	        //driver.switchTo().newWindow(WindowType.TAB);
	        driver.get("https://www.facebook.com");
	        Thread.sleep(2000);
	        
	        driver.navigate().back();
	        
	        driver.navigate().forward();
	        
	        //driver.switchTo().newWindow(WindowType.TAB); 
	        driver.get("https://www.youtube.com");
	        Thread.sleep(5000);
	        
	        //driver.switchTo().newWindow(WindowType.TAB);
	        driver.get("https://www.bing.com");
	        Thread.sleep(5000);
	        
	        driver.close(); //for closing current tab
	        driver.quit();  //for closing all at a time
	}
}


