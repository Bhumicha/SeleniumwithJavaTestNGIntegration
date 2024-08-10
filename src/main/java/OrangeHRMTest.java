import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class OrangeHRMTest {
    public static WebDriver driver= new ChromeDriver();

    @BeforeTest
    void openApp()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }
    @AfterTest
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

    }
}
