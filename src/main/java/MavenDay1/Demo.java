package MavenDay1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
			driver.findElement(By.id("firstName")).sendKeys("Udaya");
			driver.findElement(By.id("lastName")).sendKeys("siri");
			driver.findElement(By.id("userEmail")).sendKeys("udayasiri2002@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'genterWrapper\']/div[2]/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userNumber")).sendKeys("1234567890");
			Thread.sleep(2000);
			driver.findElement(By.id("dateOfBirthInput")).click();
			driver.findElement(By.className("react-datepicker__month-select")).click();
			driver.findElement(By.xpath("//option[text()='April']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.className("react-datepicker__year-select")).click();
			
			driver.findElement(By.xpath("//option[text()='2003']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[4]")).click();
            WebElement subject=driver.findElement(By.id("subjectsInput"));
			
			subject.sendKeys("English");
			subject.sendKeys(Keys.DOWN, Keys.ENTER);
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div[1]/label")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\udaya siri\\OneDrive\\Pictures");
			Thread.sleep(2000);
			
			
			
			driver.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("Nellore");
			WebElement state= driver.findElement(By.id("react-select-3-input"));
			
			state.sendKeys("NCR");
			state.sendKeys(Keys.DOWN, Keys.ENTER);
			
			WebElement city= driver.findElement(By.id("react-select-4-input"));
			
			city.sendKeys("Noida");
			city.sendKeys(Keys.DOWN, Keys.ENTER);
			driver.findElement(By.xpath("//button[@id='submit']")).click();
	 }
}
