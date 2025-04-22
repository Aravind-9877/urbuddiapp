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
		mylvepage.btnlop();
		mylvepage.fromdate("1404");
		mylvepage.todate("1404");
		mylvepage.subjecttxt("babluneelms_leave");
		mylvepage.reasontxt("sickleave");
		mylvepage.lverdbtn();
		Thread.sleep(2000);
		mylvepage.submitbtn();
		
		
		
	}

}
