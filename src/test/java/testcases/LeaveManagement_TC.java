package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.DashboardPage;
import pageobjects.LeaveManagementPage;
import pageobjects.LoginPage;
import utilities.BaseClass;
import utilities.ConfigPropertiesClass;

public class LeaveManagement_TC extends BaseClass {
	@Test(groups = "Regression")
	public void verifyLogin() {
		getDriver().get(ConfigPropertiesClass.getProperty("appURL"));
		LoginPage myPage = new LoginPage(getDriver());
		myPage.setTxtEmail(ConfigPropertiesClass.getProperty("userName2"));
		myPage.setPassword(ConfigPropertiesClass.getProperty("password2"));
		myPage.loginBtn();
	}
	
	@Test(priority = 1,groups = "Regression")

	public void applyLeave() throws InterruptedException  {

		DashboardPage myDbPage = new DashboardPage(getDriver());
		myDbPage.leavemngmnt();

		
		LeaveManagementPage myLeavePage = new LeaveManagementPage(getDriver());

		myLeavePage.applyleave();
		myLeavePage.btnLop();
		myLeavePage.fromDate("2804");

		myLeavePage.toDate("2804");
		myLeavePage.subjectTxt("babluneelms_leave");
		myLeavePage.reasonTxt("sickleave");
		myLeavePage.leaveBtn();
		Thread.sleep(2000);
		myLeavePage.submitBtn();
		Thread.sleep(2000);
		captureScreen("leavesubmission");

		
		
	}

}
