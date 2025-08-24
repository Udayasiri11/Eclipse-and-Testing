package MavenDay2;
import java.io.FileInputStream;
//import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import java.util.List;
import java.util.ArrayList;

public class Amazontestng
{
	 WebDriver driver;
	    Properties props = new Properties();
	    String email;
	    String password;

	    @BeforeClass
	    public void setup() {
	        try {
	            //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	            FileInputStream fis = new FileInputStream("Config.properties");
	            props.load(fis);
	            driver = new ChromeDriver();
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	            email = props.getProperty("amazon.email");
	            password = props.getProperty("amazon.password");
	        } catch (Exception e) {
	            System.out.println("Error in setup: " + e.getMessage());
	        }
	    }
	
	    
	    @Test(priority = 1)
	    public void testAmazonLogin() {
	        driver.get("https://www.amazon.in");
	        driver.findElement(By.id("nav-link-accountList")).click();
	        driver.findElement(By.id("ap_email_login")).sendKeys(email);
	        driver.findElement(By.id("continue")).click();
	        driver.findElement(By.id("ap_password")).sendKeys(password);
	        driver.findElement(By.id("signInSubmit")).click();
	    }

	    @Test(priority = 2)
	    public void testAmazonSearchAndAddToCart() throws InterruptedException {
	        List<String> products = new ArrayList<>();
	        products.add("laptop");
	        products.add("headphones");
	        products.add("wireless mouse");

	        for (String product : products) {
	            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	            searchBox.clear();
	            searchBox.sendKeys(product);
	            driver.findElement(By.id("nav-search-submit-button")).click();
	            //Thread.sleep(3000);
	            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#a-autoid-3-announce")));
	            //driver.findElement(By.cssSelector("#a-autoid-3-announce")).click();
	            		element.click();
	            Thread.sleep(10000);
	        }
	      
	    }
	    @AfterClass
	    public void tearDown() {
	    	
	        //driver.quit();
	    }
}
	




