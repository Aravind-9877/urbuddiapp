package testcases;

import utilities.ConfigPropertiesClass;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pageobjects.AddEmployeePage;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;
import utilities.BaseClass;

public class AddEmployees_TC extends BaseClass {
    @Test(groups = "Regression")
    public void verifyLogin() {

        getDriver().get(ConfigPropertiesClass.getProperty("appURL"));
        LoginPage myPage = new LoginPage(getDriver());
        myPage.setTxtEmail(ConfigPropertiesClass.getProperty("userName"));
        myPage.setPassword(ConfigPropertiesClass.getProperty("password"));
        myPage.loginBtn();
    }

    @Test(priority = 1, groups = "Regression")
    public void addEmployees() throws InterruptedException {


        DashboardPage myDbPage = new DashboardPage(getDriver());

        myDbPage.employees();
        Faker faker = new Faker();

        AddEmployeePage myAddEmp = new AddEmployeePage(getDriver());
        myAddEmp.addEmployee();
        myAddEmp.setFirstName(faker.name().firstName());
        myAddEmp.setLastName(faker.name().lastName());
        myAddEmp.setEmployeeId(faker.number().digits(6));
        myAddEmp.setEmail(faker.name().firstName() + faker.name().lastName() + "@gmail.com");
        myAddEmp.setDob(faker.date().toString() + "1604");
        myAddEmp.setJoiningDate(faker.date().toString() + "2025");
        myAddEmp.setPassword(faker.name().firstName() + "@12");
        myAddEmp.selectRole("Employee");
        myAddEmp.selectQualification("B.Tech");
        myAddEmp.selectBloodGroup(faker.name().bloodGroup());
        myAddEmp.selectGender("Male");
        myAddEmp.selectReportingTo("leadautomation@gmail.com");
        myAddEmp.clickCertificationCeckbox();
        myAddEmp.setDepartment("Testing");
        myAddEmp.setTxtDesignation("Testing");
        myAddEmp.setMobilNo(faker.phoneNumber().subscriberNumber(10));
        myAddEmp.setLocation(faker.address().country());
        myAddEmp.clickAddButton();
        Thread.sleep(2000);
        Thread.sleep(2000);
        captureScreen("sucessfuladdingemp");


    }


}
