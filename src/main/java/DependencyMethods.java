import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
    @Test (priority = 1)
    void openapp()
    {
        Assert.assertTrue(false);
    }
    //creating dependency on this
    @Test (priority = 2,  dependsOnMethods={"openapp"})
    void login()
    {
        Assert.assertTrue(true);
    }
    @Test (priority = 3, dependsOnMethods = {"login"})
    void search()
    {
        Assert.assertTrue(true);
    }
    @Test (priority = 4)
    void advsearch()
    {
        Assert.assertTrue(true);
    }
}
