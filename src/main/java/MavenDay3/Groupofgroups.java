package MavenDay3;
import org.testng.annotations.Test;

public class Groupofgroups {

    @Test(groups = {"windows"})
    public void testWindowsLogin() {
        System.out.println("Running Windows");
    }

    @Test(groups = {"linux"})
    public void testLinuxUpload() {
        System.out.println("Running Linux");
    }

    @Test(groups = {"Mac"})
    public void testWindowsCheckout() {
        System.out.println("Running Mac");
    }
}
