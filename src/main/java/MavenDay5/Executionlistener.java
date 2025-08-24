package MavenDay5;
import org.testng.IExecutionListener;
public class Executionlistener implements IExecutionListener{
	@Override
    public void onExecutionStart() {
        System.out.println("TestNG is commencing execution");
    }

    @Override
    public void onExecutionFinish() {
        System.out.println("TestNG is finished execution");
    }
}
