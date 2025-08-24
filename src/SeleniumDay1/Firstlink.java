package SeleniumDay1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Firstlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.name("q")).submit();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); 
        // 60 seconds to give time for you to solve CAPTCHA

        // Wait until the first result link is clickable AFTER CAPTCHA
        WebElement firstLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div#search a")));
        firstLink.click();
        //driver.quit();
	}
}