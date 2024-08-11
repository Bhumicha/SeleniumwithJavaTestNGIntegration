import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

/*
@BeforeMethod: This will be executed before every @test annotated method.
@BeforeClass: This will be executed before first @Test method execution. It will be executed one only time throughout the test case.
@BeforeTest: This will be executed before the first @Test annotated method. It can be executed multiple times before the test case.
@BeforeSuite: It will run only once, before all tests in the suite are executed.
@BeforeGroups: This method will run before the first test run of that specific group.

 */
public class OrangeHRMTest {
    public static WebDriver driver= new ChromeDriver();

    @BeforeSuite
    void openApp()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }
    @AfterSuite
    void TearDown()
    {
        driver.close();
    }

    @Test (priority = 1)
    void testLogo() throws InterruptedException {
        Thread.sleep(3000);
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println("Logo is displayed: " + status);
    }
    @Test (priority = 2)
    void login() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        System.out.println("Logged in successfully");

    }
}
