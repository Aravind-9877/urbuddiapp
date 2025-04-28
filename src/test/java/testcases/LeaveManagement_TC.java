package testcases;

import org.testng.annotations.Test;
import pageobjects.DashboardPage;
import pageobjects.LeaveManagementPage;
import pageobjects.LoginPage;
import utilities.BaseClass;

public class LeaveManagement_TC extends BaseClass {
	@Test(groups = "Regression")
	public void verifylogin() {
		LoginPage mypage = new LoginPage(getDriver());
		mypage.setTxtEmail(p.getProperty("userName2"));
		mypage.setPassword(p.getProperty("password2"));
		mypage.loginBtn();
	}
	
	@Test(priority = 1,groups = "Regression")

	public void applyLeave() throws InterruptedException  {

		DashboardPage myDbPage = new DashboardPage(getDriver());
		myDbPage.leavemngmnt();

		
		LeaveManagementPage mylvepage = new LeaveManagementPage(getDriver());
		
		mylvepage.applyleave();
		mylvepage.btnLop();
		mylvepage.fromDate("2804");

		mylvepage.toDate("2804");
		mylvepage.subjectTxt("babluneelms_leave");
		mylvepage.reasonTxt("sickleave");
		mylvepage.leaveBtn();
		Thread.sleep(2000);
		mylvepage.submitBtn();
		Thread.sleep(2000);
		captureScreen("leavesubmission");
		
		
	}

}
