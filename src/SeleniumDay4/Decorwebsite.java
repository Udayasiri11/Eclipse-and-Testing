package SeleniumDay4;
import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class Decorwebsite 
{
	public static void main(String[] args)
			 throws InterruptedException
	{
		
		Scanner in = new Scanner(System.in);
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 
		driver.get("https://360homedecor.uk/book-appointment");
 
		WebElement brand = driver.findElement(By.id("choose_branch"));
		brand.click();
		Select dropdown = new Select(brand);
		List<WebElement> brandOptions = dropdown.getOptions();
		System.out.println("Available Branches: ");
		for (WebElement option : brandOptions) {
			System.out.println(option.getText());
		}
 
		System.out.print("Enter branch value to select: ");
		String brandChoice = in.nextLine();
		dropdown.selectByValue(brandChoice);
 
		Thread.sleep(1500);
 
		WebElement style = driver.findElement(By.id("choose_style"));
		style.click();
		Select dropdown1 = new Select(style);
		dropdown1.selectByValue("mediterranean");
 
		Thread.sleep(1500);
 
		driver.findElement(By.id("first_name")).sendKeys("Siri");
		Thread.sleep(1500);
 
		driver.findElement(By.id("last_name")).sendKeys("Siri");
		Thread.sleep(1500);
 
		driver.findElement(By.id("apt_city")).sendKeys("Hyderabad");
		Thread.sleep(1500);
 
		driver.findElement(By.name("phone_number")).sendKeys("8790419639");
		Thread.sleep(1500);
 
		driver.findElement(By.id("email")).sendKeys("udayasiri2002@gmail.com");
		Thread.sleep(1500);
 
		File uploadFile = new File("C:/Users/2002d/Downloads/image.png");
		driver.findElement(By.cssSelector("#layoutFiles")).sendKeys(uploadFile.getAbsolutePath());
		Thread.sleep(1500);
 
		driver.findElement(By.cssSelector("#privacyPolicy")).isSelected();
		Thread.sleep(1500);
 
		driver.findElement(By.cssSelector("#appointment_form > div.col-12.text-center > button")).click();
 
		Thread.sleep(5000);
 
		in.close();
		driver.quit();
	}
}
 