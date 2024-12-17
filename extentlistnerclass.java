package todaylistner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentlistnerclass implements ITestListener {
	
	
		ExtentSparkReporter htmlReporter;
		ExtentReports reports;
		ExtentTest test;
		
		public void configureReport() {
			htmlReporter=new ExtentSparkReporter("C:\\Users\\Mohsin QA\\Desktop\\Seleniumautomation framework\\testlistner\\test-output");
	           reports=new ExtentReports();
	           reports.attachReporter(htmlReporter);
	       //    machine information
	       /////Configration to change  look and feel 
	           reports.setSystemInfo("Machine", "testpc1");
	   		reports.setSystemInfo("window", "window10");
	   		reports.setSystemInfo("user", "MohsinQA");
	   		reports.setSystemInfo("window", "window10");
	   		reports.setSystemInfo("Browser", "chrome");
	   	/////Configration to change  look and feel 
			htmlReporter.config().setDocumentTitle("extentreport.html");
			htmlReporter.config().setReportName("This is my first Report");
			htmlReporter.config().setTheme(Theme.DARK);
			
		
		}
	public void onstart(ITestContext Result) {
		configureReport();
		System.out.println("on start method invoked");
	}
	public void onfinish(ITestContext Result) {
		
		System.out.println("on finished method invoked");
		reports.flush();
	}
	public void ontestfailure(ITestResult Result) {
		
		System.out.println("Name of test method failed:"+Result.getName());
		test=reports.createTest(Result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Nmae od the field test case is "+"Fail",ExtentColor.RED));
	}
 public void ontestskipped(ITestResult Result) {
		
		System.out.println("Name of test method skipped:"+Result.getName());
		test=reports.createTest(Result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Nmae od the skipped test case is "+"skip",ExtentColor.YELLOW));
	}
 public void ontestpass(ITestResult Result) {
		
		System.out.println("Name of test method failed:"+Result.getName());
		test=reports.createTest(Result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name od the pass test case is "+"green",ExtentColor.GREEN));
	}
	public void OnTestSkipped(ITestResult Result) {
		System.out.println("Name of method skipped :"+Result.getName());
	}
	public void OnTestStart(ITestResult Result) {
		System.out.println("Name of test method started :"+Result.getName());
	}
	public void OnTestsuccess(ITestResult Result) {
		System.out.println("Name of test method method successfully  :"+Result.getName());
	}
	public void ontestFailedButwithinsuccesspercentage(ITestResult Result) {
		
	}
}
