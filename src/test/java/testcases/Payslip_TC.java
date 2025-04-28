package testcases;

import org.testng.annotations.Test;
import pageobjects.DashboardPage;
import pageobjects.PayslipPage;
import utilities.BaseClass;

public class Payslip_TC extends BaseClass {
	
	@Test(priority = 1,groups ="Regression")
	public void payslip() {
	
	DashboardPage mypdg = new DashboardPage(getDriver());
	  mypdg.payslp();

		PayslipPage mypage=new PayslipPage(getDriver());

		mypage.setSelectMonth("01");
		mypage.setSelectYear("2025");
		captureScreen("payslip");


	
	
	}
	
	

}
