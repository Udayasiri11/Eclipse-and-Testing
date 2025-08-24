package MavenDay3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Chrome {
	 /*@Test
	    public void openGoogle() {
	        // Open Chrome
	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.get("https://www.google.com");

	        System.out.println("Page Title: " + driver.getTitle());

	        driver.quit();
	 }*/
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		System.out.println("Launching browser.....");
		driver=new ChromeDriver();
	}
		@Test
		public void testgoogleTitile()
		{
			driver.get("https://www.google.com");
			String title=driver.getTitle();
			System.out.println("Page Title is : " + title);
		}
		@AfterClass
		public void tearDown()
		{
			System.out.println("Closing browser.....");
			driver.quit();
		}

}
