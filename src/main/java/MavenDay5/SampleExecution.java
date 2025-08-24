package MavenDay5;
import org.testng.IExecutionListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Executionlistener.class)
public class SampleExecution {
	 @Test
	    public void testMethod1() {
		 System.out.println("Test1");
		 
	 }
	 @Test
public void testMethod2() {
	 System.out.println("Test2");
		 
	 }

}
