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
			myaddemp.firstNametxt(faker.name().firstName());
			myaddemp.lastNametxt(faker.name().lastName());
			myaddemp.employeidtxt(faker.number().digits(6));
			myaddemp.emailtxt(faker.name().firstName()+faker.name().lastName()+"@gmail.com");
			myaddemp.dobele(faker.date().toString()+"1604");
			myaddemp.joiningdteele(faker.date().toString()+"2025");
			myaddemp.passwordtxt(faker.name().firstName()+"@12");
			myaddemp.roledrpdwn("Employee");
			myaddemp.qualfctndrpdwn("B.Tech");
			myaddemp.bloodgrpdrpdwn(faker.name().bloodGroup());
			myaddemp.drpdwngndr("Male");
			myaddemp.reportingtopdwn("leadautomation@gmail.com");
			myaddemp.certifictnchckbx();
			myaddemp.txtDept("Testing");
			myaddemp.txtdesgntn("Testing");
			myaddemp.txtmobilno(faker.phoneNumber().subscriberNumber(10));
			myaddemp.txtloctn(faker.address().country());
		    myaddemp.btnAdd();
			Thread.sleep(2000);
		  //  myaddemp.setCheckemail();

			
		
		
		
				
			
		
	}
	
	
		
}
