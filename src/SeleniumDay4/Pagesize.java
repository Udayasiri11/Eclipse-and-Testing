package SeleniumDay4;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
public class Pagesize
{
	public static void main(String[] args)
			throws InterruptedException, IOException
	{
		  WebDriver driver = new ChromeDriver();        
	      driver.get("https://www.google.com");
	      driver.manage().window().maximize();

	       
	      Dimension size = driver.manage().window().getSize();
	      System.out.println("Window Size - Width: " + size.getWidth() + " , Height: " + size.getHeight());

	      driver.manage().window().setSize(new Dimension(800, 600));
	      System.out.println(" Window size set to 800x600");
	      Thread.sleep(10000);

	      Point position = driver.manage().window().getPosition();
	      System.out.println("Window Position - X: " + position.getX() + " , Y: " + position.getY());

	      driver.manage().window().setPosition(new Point(200, 150));
	      System.out.println("Window moved to X=200, Y=150");
	      Thread.sleep(10000);
	        
	      driver.manage().window().minimize();
	      System.out.println("Window minimized");
	      Thread.sleep(10000);
	        
	      driver.manage().window().fullscreen();
	      System.out.println("Window fullscreen");
	      Thread.sleep(10000);
	      driver.quit();
	}
}
