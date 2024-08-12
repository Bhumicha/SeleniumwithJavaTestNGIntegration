package ExtentsReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class ExtentReportManagerUtilityClass extends OrangeHRMTests implements ITestListener {
    static public ExtentReports extent;


    public static ExtentReports getReportObject() {
        String path = System.getProperty("user.dir")+"/reports/reports.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Automation Tests");
        reporter.config().setDocumentTitle("Automation Report");
        reporter.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        extent.setSystemInfo("Computer name", "localhost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester Name", "Bhumika Shrestha");
        extent.setSystemInfo("OS", "Windows 11");

        return extent;

    }

@Override
public void onTestStart(ITestResult result) {
    test = extent.createTest(result.getMethod().getMethodName());
}

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test case passsed is: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
//        test.fail(result.getThrowable());
        test.log(Status.FAIL, "Test case Failed is: "+ result.getName());
        test.log(Status.FAIL, "Test case Failed cause is: "+ result.getThrowable());
    }
    @Override
    public void onTestSkipped(ITestResult result)
    {
        test.log(Status.SKIP,"test case Skipped is: " +result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
    //    public static ExtentSparkReporter sparkReporter;
//    public static ExtentReports extent;
//    public static ExtentTest test;
//
//    public void onStart(ITestListener context)
//    {
//        sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir"+"/reports/myReport.html"));
//        sparkReporter.config().setDocumentTitle("Automation Report");
//        sparkReporter.config().setReportName("Functional Testing");
//        sparkReporter.config().setTheme(Theme.DARK);
//
//        extent=new ExtentReports();
//        extent.attachReporter(sparkReporter);
//
//        extent.setSystemInfo("Computer name", "localhost");
//        extent.setSystemInfo("Environment", "QA");
//        extent.setSystemInfo("Tester Name", "Bhumika Shrestha");
//        extent.setSystemInfo("OS", "Windows 11");
//    }
//
//    public void onTestSuccess(ITestResult result)
//    {
//        test=extent.createTest(result.getName());
//        test.log(Status.PASS, "Test case passsed is: " + result.getName());
//    }
//    public void onTestFailure(ITestResult result)
//    {
//        test.fail(result.getThrowable());
//    }
//    public void onTestSkipped(ITestResult result)
//    {
//        test=extent.createTest(result.getName());
//        test.log(Status.SKIP,"test case Skipped is: " +result.getName());
//    }
//    public void onFinish(ITestResult context)
//    {
//        extent.flush();
//    }

}
