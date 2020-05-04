package alltests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

    //This belongs to ITestListener and will execute before starting of Test  set/batch
    public void onStart(ITestContext arg) {
        System.out.println("Starts Test execution " + arg.getName());
    }

    //This belongs to ITestListener and will execute after starting of Test  set/batch
    public void onFinish(ITestContext arg) {
        System.out.println("Finish Test execution " + arg.getName());
    }

    //This belongs to ITestListener and will execute before the main test start i.e @Test
    public void onTestStart(ITestResult arg) {
        System.out.println("Starts Test " + arg.getName());
    }

    //This belongs to ITestListener and will execute when a test is skipped
    public void onTestSkipped(ITestResult arg) {
        System.out.println("Skipped Test " + arg.getName());
    }

    //This belongs to ITestListener and will execute when a test is passed
    public void onTestSuccess(ITestResult arg) {
        System.out.println("Passed Test " + arg.getName());
    }

    //This belongs to ITestListener and will execute when a test is failed
    public void onTestFailure(ITestResult arg) {
        System.out.println("Failed Test " + arg.getName());
    }
}
