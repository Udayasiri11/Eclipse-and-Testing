package MavenDay2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class BlazeDemotestng {
	WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://blazedemo.com/");
    }

    @Test(dataProvider = "cityPairs")
    public void bookFlight(String fromCity, String toCity) throws Exception {

        Thread selectCities = new Thread(() -> {
            WebElement fromDropdown = driver.findElement(By.name("fromPort"));
            fromDropdown.sendKeys(fromCity);
            WebElement toDropdown = driver.findElement(By.name("toPort"));
            toDropdown.sendKeys(toCity);
            driver.findElement(By.cssSelector("input[type='submit']")).click();
        });
        selectCities.start();
        selectCities.join(); 
        Thread.sleep(2000); 

    
        Thread selectFlight = new Thread(() -> {
            driver.findElement(By.cssSelector("input[type='submit']")).click();
        });
        selectFlight.start();
        selectFlight.join();
        Thread.sleep(2000);
 
        Thread fillDetails = new Thread(() -> {
            driver.findElement(By.id("inputName")).sendKeys("Udayasiri");
            driver.findElement(By.id("address")).sendKeys("123 Automation Lane");
            driver.findElement(By.id("city")).sendKeys("Hyderabad");
            driver.findElement(By.id("state")).sendKeys("TG");
            driver.findElement(By.id("zipCode")).sendKeys("500043");
            driver.findElement(By.id("creditCardNumber")).sendKeys("4111111111111111");
            driver.findElement(By.id("nameOnCard")).sendKeys("Udayasiri");
            driver.findElement(By.cssSelector("input[type='submit']")).click();
        });
        fillDetails.start();
        fillDetails.join();
        Thread.sleep(3000);

        Thread validateConfirmation = new Thread(() -> {
            WebElement confirmation = driver.findElement(By.tagName("h1"));
            Assert.assertEquals(confirmation.getText(), "Thank you for your purchase today!");
        });
        validateConfirmation.start();
        validateConfirmation.join();
    }

    @DataProvider(name = "cityPairs")
    public Object[][] getCityPairs() {
        return new Object[][] {
            {"Boston", "London"},
            {"Philadelphia", "Paris"},
            {"San Diego", "Rome"}
        };
    }

    @AfterMethod
    public void tearDown() {
            driver.quit();
    }
}



