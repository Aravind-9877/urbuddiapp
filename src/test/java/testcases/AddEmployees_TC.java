package testcases;


import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pageobjects.AddEmployeePage;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;
import utilities.BaseClass;

public class AddEmployees_TC extends BaseClass {
    @Test(groups = "Regression")
    public void verifylogin() {
        LoginPage mypage = new LoginPage(getDriver());
        mypage.setTxtEmail(p.getProperty("userName"));
        mypage.setPassword(p.getProperty("password"));
        mypage.loginBtn();
    }

    @Test(priority = 1, groups = "Regression")
    public void addEmployees() throws InterruptedException {


        DashboardPage myDbPage = new DashboardPage(getDriver());

        myDbPage.employees();
        Faker faker = new Faker();

        AddEmployeePage myaddemp = new AddEmployeePage(getDriver());
        myaddemp.addEmployee();
        myaddemp.setFirstName(faker.name().firstName());
        myaddemp.setLastName(faker.name().lastName());
        myaddemp.setEmployeeId(faker.number().digits(6));
        myaddemp.setEmail(faker.name().firstName() + faker.name().lastName() + "@gmail.com");
        myaddemp.setDob(faker.date().toString() + "1604");
        myaddemp.setJoiningDate(faker.date().toString() + "2025");
        myaddemp.setPassword(faker.name().firstName() + "@12");
        myaddemp.selectRole("Employee");
        myaddemp.selectQualification("B.Tech");
        myaddemp.selectBloodGroup(faker.name().bloodGroup());
        myaddemp.selectGender("Male");
        myaddemp.selectReportingTo("leadautomation@gmail.com");
        myaddemp.clickCertificationCeckbox();
        myaddemp.setDepartment("Testing");
        myaddemp.setTxtDesignation("Testing");
        myaddemp.setMobilNo(faker.phoneNumber().subscriberNumber(10));
        myaddemp.setLocation(faker.address().country());
        myaddemp.clickAddButton();
        Thread.sleep(2000);
        Thread.sleep(2000);
        captureScreen("sucessfuladdingemp");


    }


}
