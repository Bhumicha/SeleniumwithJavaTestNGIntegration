package ExtentsReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners
public class OrangeHRMTests {
    public ExtentReports extent = ExtentReportManagerUtilityClass.getReportObject();
    public ExtentTest test;

    WebDriver driver;
    @BeforeClass
    void setup() throws InterruptedException {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @Test(priority = 1)
    void testLogo() throws InterruptedException {
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(status, true);
        Thread.sleep(3000);

    }

    @Test (priority = 2)
    void testURL()
    {
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test (priority = 3)
    void testHomePageTitle()
    {
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }
    @Test (priority = 4)
    void testFail()
    {
        Assert.assertEquals(driver.getTitle(), "OrangeHRMS");
    }
    @AfterClass
    void teardown()
    {
        driver.close();
    }
}
