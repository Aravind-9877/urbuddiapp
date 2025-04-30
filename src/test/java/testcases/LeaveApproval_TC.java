package testcases;

import org.testng.annotations.Test;
import pageobjects.DashboardPage;
import pageobjects.LeaveApprovalPage;
import pageobjects.LoginPage;
import utilities.BaseClass;
import utilities.ConfigPropertiesClass;

public class LeaveApproval_TC extends BaseClass {

	@Test(groups = "Regression")
	public void verifylogin() {
		getDriver().get(ConfigPropertiesClass.getProperty("appURL"));
		LoginPage mypage = new LoginPage(getDriver());
		mypage.setTxtEmail(ConfigPropertiesClass.getProperty("userName3"));
		mypage.setPassword(ConfigPropertiesClass.getProperty("password3"));
		mypage.loginBtn();
	}
	@Test(priority = 1,groups = "Regression")
	public void leaveApproval() {


		DashboardPage mydb = new DashboardPage(getDriver());
		mydb.leavemngmnt();
		
		LeaveApprovalPage mylveappage = new LeaveApprovalPage(getDriver());
		mylveappage.requestsbtn();
		mylveappage.slslider();
		mylveappage.approvebtn();
		
		
	}
	    
	

}


