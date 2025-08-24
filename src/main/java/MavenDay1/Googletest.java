package MavenDay1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Googletest 
{
	 WebDriver driver;
	    @BeforeClass
	    public void setUp() {
	        // Open Chrome browser
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com");
	    }
	    @Test
	    public void verifyTitle() {
	        // Expected title
	        String expectedTitle = "Google";
	        // Actual title
	        String actualTitle = driver.getTitle();
	        
	        // Assertion
	        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");
	    }
	    @Test
	    public void verifySearchBoxDisplayed() {
	        // Locate search box
	        WebElement searchBox = driver.findElement(By.name("q"));

	        // Assertion
	        Assert.assertTrue(searchBox.isDisplayed(), "Search box is not displayed!");
	    }
	    @AfterClass
	    public void tearDown() {
	        // Close browser
	        driver.quit();
	    }
}

   


