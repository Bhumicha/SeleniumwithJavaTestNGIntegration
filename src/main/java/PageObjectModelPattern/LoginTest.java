package PageObjectModelPattern;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;
    @BeforeClass
    void setUp()
    {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }
    @Test
    void testLogin()
    {
        LoginPage lp=new LoginPage(driver);
        lp.setUserName("Admin");
        lp.setPassword("admin123");
        lp.clickLogin();
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }
    @AfterClass
    void tearDown()
    {
        driver.close();
    }
}
