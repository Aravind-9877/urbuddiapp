package testcases;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageobjects.DashboardPage;
import pageobjects.LeaveManagementPage;

public class LeaveManagement_TC extends BaseClass {
	
	@Test(priority = 1,groups = "Regression")

	public void applyLeave() throws InterruptedException  {

		DashboardPage myDbPage = new DashboardPage(getDriver());
		myDbPage.leavemngmnt();

		
		LeaveManagementPage mylvepage = new LeaveManagementPage(getDriver());
		
		mylvepage.applyleave();
		mylvepage.btnLop();
		mylvepage.fromDate("1404");
		mylvepage.toDate("1404");
		mylvepage.subjectTxt("babluneelms_leave");
		mylvepage.reasonTxt("sickleave");
		mylvepage.leaveBtn();
		Thread.sleep(2000);
		mylvepage.submitBtn();
		
		
		
	}

}
