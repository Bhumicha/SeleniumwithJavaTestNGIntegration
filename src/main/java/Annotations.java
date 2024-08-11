import org.testng.annotations.*;

public class Annotations {
    /*
@BeforeMethod: This will be executed before every @test annotated method.
@BeforeClass: This will be executed before first @Test method execution. It will be executed one only time throughout the test case.
@BeforeTest: This will be executed before the first @Test annotated method. It can be executed multiple times before the test case.
@BeforeSuite: It will run only once, before all tests in the suite are executed.
@BeforeGroups: This method will run before the first test run of that specific group.
 */
    @BeforeMethod
    void login()
    {
        System.out.println("This is login");
    }
    @AfterMethod
    void logout()
    {
        System.out.println("This is logout");
    }
    @Test(priority = 1)
    void search()
    {
        System.out.println("This is search");
    }
    @Test (priority = 2)
    void advSearch()
    {
        System.out.println("This is advanced search");
    }
}
