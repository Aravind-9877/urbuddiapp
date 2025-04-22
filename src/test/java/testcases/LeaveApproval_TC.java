package testcases;

import org.testng.annotations.Test;
import pageobjects.DashboardPage;
import pageobjects.LeaveApprovalPage;

public class LeaveApproval_TC extends BaseClass {
	
	
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


