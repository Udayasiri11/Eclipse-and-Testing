package MavenDay3;
import org.testng.annotations.Test;

public class Exclude {

    @Test(groups = {"windows"})
    public void testWindowsLogin() {
        System.out.println("Running Windows");
    }

    @Test(groups = {"linux"})
    public void testLinuxUpload() {
        System.out.println("Running Linux");
    }

    @Test(groups = {"Mac1"})
    public void testWindowsCheckout1() {
        System.out.println("Running Mac1");
    }
    @Test(groups = {"Mac2"})
    public void testWindowsCheckout2() {
        System.out.println("Running Mac2");
    }
}


