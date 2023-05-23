package test_runner;

import Base.ExtentReportUtil;
import com.aventstack.extentreports.gherkin.model.Feature;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import static Base.BaseUtil.features;

public class NGTestListener implements ITestListener {

    ExtentReportUtil extentReportUtil = new ExtentReportUtil();

    @Override
    public void onTestStart(ITestResult iTestResult) {
        Reporter.log("On test start");
        System.out.println("On test start");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        Reporter.log("On test Success");
        System.out.println("On test Sucess");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Reporter.log("On test Failure");
        System.out.println("On test failure");

//        try{
//            extentReportUtil.ExtentReportScreenshot();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        Reporter.log("On test Skipped");
        System.out.println("On test skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        Reporter.log("On test Percentage");
        System.out.println("On test percentage");
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        Reporter.log("On start");
        System.out.println("On start");

        extentReportUtil.ExtentReport();

        //ToDo: Feature - Hard coding the feature name
        ExtentReportUtil.features = extentReportUtil.extent.createTest(Feature.class, "LoginFeature");

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("On finish");
        //extentReportUtil.FlushReport();
    }
}
