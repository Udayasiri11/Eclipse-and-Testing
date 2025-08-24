package SeleniumDay4;
//import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;

//import java.util.Properties;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;
public class Printpage 
{
	public static void main(String[] args)
			throws IOException, InterruptedException
	{
		/*Properties props = new Properties();
        FileInputStream fis = new FileInputStream("Config.properties");
        props.load(fis);*/
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://github.com/");          
        PrintOptions printOptions = new PrintOptions();
        //printOptions.setOrientation(PrintOptions.Orientation.PORTRAIT);
        printOptions.setOrientation(PrintOptions.Orientation.LANDSCAPE);
        PrintOptions.Orientation currentOrientation = printOptions.getOrientation();
        System.out.println("Current Orientation: " + currentOrientation);
        printOptions.setPageRanges("1-5");
        String[] current_range=printOptions.getPageRanges();
        System.out.println(Arrays.toString(current_range));
        Thread.sleep(50000);
        driver.quit();
    }
}



