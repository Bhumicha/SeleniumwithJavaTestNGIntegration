import org.testng.annotations.Test;
/*
   1. open app
   2. login
   3. logout
    */
/*
TestNg execute test methods based on alphabetical order.
@Test (priority=num) controls order of execution.
Priorities can be random numbers.
If priorities are same then again execute methods in alphabetical order.
Negative values are allowed in priority (-1 0 1)
 */
public class FirstTestCase
{
   @Test (priority = 3)
   void openApp()
    {
        System.out.println("Opening application");
    }
    @Test (priority = 2)
    void login()
    {
        System.out.println("Login to application");
    }
    @Test (priority = 1)
    void logout()
    {
        System.out.println("Logout from application");
    }
}
