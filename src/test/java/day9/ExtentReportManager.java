package day9;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{
	
	public ExtentSparkReporter sparkReporter; //UI of the report
	public ExtentReports extent; //populate common info on the report
	
	public ExtentTest test; //CREATING THE TEST CASE  ENTRIES  IN THE REPORT  AND UPDATE THE STATUS  OF THE TEST METHODS
	
	public void onStart(ITestContext context)
	{
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/REPORTS/reports.html");
		
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional Test");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
	}
	
	public void onTestSuccess(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Test is passsed is "+result.getName());
	}
	public void onTestFailure(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test is Failed is "+result.getName());
		test.log(Status.FAIL, "Test is Cause is "+result.getThrowable());
	}
	public void onTestSkipped(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test is Skipped is "+result.getName());
//		test.log(Status.FAIL, "Test is Cause is "+result.getThrowable());
	}
	
	public void onFinish(ITestContext context)
	{
		extent.flush();
	}
	
	
	
	
	

}
