package MavenDay4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class Factories {
	WebDriver driver;
	//@Test
	String url;
	public Factories(String url) {
		this.url=url;
	}
 
@BeforeClass
public void setup()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}
@Test
public void HealthSetup()
{
	driver.get(url);	
	
}
@AfterClass
public void quit() {
	driver.quit();
}
 
}

