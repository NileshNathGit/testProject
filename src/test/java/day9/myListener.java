package day9;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class myListener implements ITestListener {
 
	 public void onStart(ITestResult result) {
		    // not implemented
		  
		  System.out.println("test method started");
		  }
	  public void onTestStart(ITestResult result) {
		    // not implemented
		  
		  System.out.println("test method started");
		  }
	  
	 public void onTestSuccess(ITestResult result) {
		    // not implemented
		  System.out.println("test method Success");
		  }
	   public void onTestFailure(ITestResult result) {
		    // not implemented
		  System.out.println("Test failed");
		  }
}
