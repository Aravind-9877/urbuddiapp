package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.awt.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportManager implements ITestListener {

    public ExtentSparkReporter sparkReporter;
    public ExtentReports extent;
    public ExtentTest test;

String repName;
public void onStart(ITestContext testContext){

    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    repName ="Test-Report-"+timeStamp+".html";
    sparkReporter = new ExtentSparkReporter(".\\reports\\"+repName);//specify the location of the report

    sparkReporter.config().setDocumentTitle("UrBuddi Automation Report");
    sparkReporter.config().setReportName("Functional test");
    sparkReporter.config().setTheme(Theme.DARK);

extent=new ExtentReports();
extent.attachReporter(sparkReporter);
extent.setSystemInfo("Application","Urbuddi");

String os = testContext.getCurrentXmlTest().getParameter("os");
extent.setSystemInfo("Operating",os);

}
    public void onTestSuccess(ITestResult result){



    test = extent.createTest(result.getTestClass().getName());
    test.assignCategory(result.getMethod().getGroups());
    test.log(Status.PASS,result.getName()+"got successfully executed");
}
    public void onTestFailure(ITestResult result){



        test = extent.createTest(result.getTestClass().getName());
        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.FAIL,result.getName()+"got failed");
        test.log(Status.INFO,result.getThrowable().getMessage());


        try{

            String imgpath = new BaseClass().captureScreen(result.getName());
            test.addScreenCaptureFromPath(imgpath);

        }
        catch(Exception e1){
            e1.printStackTrace();

        }
    }
public void onTestSkipped(ITestResult result){
    test = extent.createTest(result.getTestClass().getName());
    test.assignCategory(result.getMethod().getGroups());
    test.log(Status.SKIP,result.getName()+"got skipped");
    test.log(Status.INFO,result.getThrowable().getMessage());

}
public void onFinish(ITestContext testContext){
extent.flush();

String pathOfExtentReport = System.getProperty("user.dir")+"\\reports\\"+repName;
File extentReport = new File(pathOfExtentReport);
try{
    Desktop.getDesktop().browse(extentReport.toURI());


}
catch(Exception e){
    e.printStackTrace();


}

    // ✅ Send email with the report attached
    String subject = "Test Automation Execution Report";
    String body = "Test Execution completed.\n\n Hi Team, \n\nPlease find the attached Report.\n\nTestCaseSummary:\n"
            + "Passed ✅: " + testContext.getPassedTests().size() + "\n"
            + "Failed ❌: " + testContext.getFailedTests().size() + "\n"
            + "Skipped ⚠: " + testContext.getSkippedTests().size();

    // Send the email
    EmailUtility.sendEmail(subject, body, pathOfExtentReport);


}

}
