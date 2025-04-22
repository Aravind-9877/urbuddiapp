package testcases;


import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.AddEmployeePage;
import pageobjects.DashboardPage;

public class AddEmployees_TC extends BaseClass{
	@Test(priority = 1,groups = "Regression")
	public void addEmployees() throws InterruptedException {

		
		DashboardPage myDbPage = new DashboardPage(getDriver());
		
		myDbPage.employees();
		Faker faker = new Faker();

			AddEmployeePage myaddemp  = new AddEmployeePage(getDriver());
			myaddemp.addEmployee();
			myaddemp.firstNameTxt(faker.name().firstName());
			myaddemp.lastNameTxt(faker.name().lastName());
			myaddemp.employeIdTxt(faker.number().digits(6));
			myaddemp.emailTxt(faker.name().firstName()+faker.name().lastName()+"@gmail.com");
			myaddemp.dobEle(faker.date().toString()+"1604");
			myaddemp.joiningDateEle(faker.date().toString()+"2025");
			myaddemp.passwordTxt(faker.name().firstName()+"@12");
			myaddemp.roleDrpdwn("Employee");
			myaddemp.qualfctnDrpdwn("B.Tech");
			myaddemp.bloodGroupDrpdwn(faker.name().bloodGroup());
			myaddemp.drpdwnGender("Male");
			myaddemp.reportingTodwn("leadautomation@gmail.com");
			myaddemp.certifictnChckbx();
			myaddemp.txtDept("Testing");
			myaddemp.txtDesgntn("Testing");
			myaddemp.txtMobilNo(faker.phoneNumber().subscriberNumber(10));
			myaddemp.txtLoctn(faker.address().country());
		    myaddemp.btnAdd();
			Thread.sleep(2000);
		  //  myaddemp.setCheckemail();

			
		
		
		
				
			
		
	}
	
	
		
}
