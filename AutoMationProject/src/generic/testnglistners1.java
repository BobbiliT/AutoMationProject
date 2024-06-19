package generic;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class testnglistners1 implements ITestListener{

	baseclass bb = new baseclass();
	public void onTestStart(ITestResult result) {
		System.out.println("Start of test cases and its details are : " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success of test cases and its details are : " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testmethodname = result.getName();
		bb.takescreenshot(testmethodname);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skip of test cases and its details are : " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Failure of test cases and its details are : " + result.getName());
	}
}
