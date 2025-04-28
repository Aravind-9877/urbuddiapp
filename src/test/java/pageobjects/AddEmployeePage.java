package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddEmployeePage extends BasePage{
	
	public  AddEmployeePage(WebDriver driver) {
		super(driver);
	}
	
	
	
	@FindBy(xpath = "//button[text()='Add Employee']")
	WebElement addEmployeeButton;
	@FindBy(xpath = "//input[@name='firstName']")
	WebElement txtFirstName;
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement txtLastName;
	@FindBy(xpath = "//input[@name='id']")
	WebElement txtEmployeeId;
	@FindBy(xpath = "//input[@name='email']")
	WebElement txtEmail;
	@FindBy(xpath = "//input[@name='password']")
	WebElement txtPassword;
	@FindBy(xpath = "//input[@name='department']")
	WebElement txtDeparment;
	@FindBy(xpath = "//input[@name='designation']")
	WebElement txtDesignation;
	@FindBy(xpath = "//input[@name='mobileNumber']")
	WebElement txtMobileNo;
	@FindBy(xpath = "//input[@name='location']")
	WebElement txtLocation;
	@FindBy(xpath = "//select[@id='role']")
	WebElement drpdwnRole;
	@FindBy(xpath = "//select[@id='qualifications']")
	WebElement drpdwnQualifications;
	@FindBy(xpath = "//select[@id='gender']")
	WebElement drpdwnGender;
	@FindBy(xpath = "//select[@id='bloodGroup']")
	WebElement drpdwnBloodGroup;
	@FindBy(xpath = "//select[@id='reportingTo']")
	WebElement drpdwnReportingTo;
	@FindBy(xpath="//button[text()='Certificates ']")
	WebElement chckbxCertifications;
	@FindBy(xpath = "//input[@name='Degree']")
	WebElement chckbxDegree;
	@FindBy(xpath = "//input[@name='dob']")
	WebElement dob;
	@FindBy(xpath = "//input[@name='joiningDate']")
	WebElement joiningdDate;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement addBtn;
	@FindBy(xpath="//input[@id='ag-39-input']")
	WebElement checkemail;
	@FindBy(xpath="//input[@id='ag-213-input']")
	WebElement check;
	public void addEmployee() {
		addEmployeeButton.click();
	}
	
	public void setFirstName(String firstName) {
		txtFirstName.sendKeys(firstName);
	}
	public void setLastName(String lastName) {
		txtLastName.sendKeys(lastName);
	}
	public void setEmployeeId(String employeid) {
		txtEmployeeId.sendKeys(employeid);
	}
	public void setEmail(String email) {
		String  em=txtEmail.getText();
		txtEmail.sendKeys(email);
		
	}
	public void setDob(String dobdate) {
		dob.sendKeys(dobdate);
	}
	public void setJoiningDate(String joindate) {
		joiningdDate.sendKeys(joindate);
	}
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void selectRole(String value) {
		Select myslct = new Select(drpdwnRole);
		myslct.selectByValue(value);
	}
	public void selectQualification(String value) {
		Select myslct = new Select(drpdwnQualifications);
		myslct.selectByValue(value);
	}
	public void selectGender(String value) {
		Select myslct = new Select(drpdwnGender);
		myslct.selectByValue(value);
	}
	public void selectBloodGroup(String value) {
		Select myslct = new Select(drpdwnBloodGroup);
		myslct.selectByValue(value);
	}
	public void selectReportingTo(String value) {
		Select myslct = new Select(drpdwnReportingTo);
		myslct.selectByValue(value);
	
	}
	
	public void setDepartment(String dept){
		txtDeparment.sendKeys(dept);
	}
	public void setTxtDesignation(String dsgntn) {
		txtDesignation.sendKeys(dsgntn);
	}
	public void setMobilNo(String mobilno) {
		txtMobileNo.sendKeys(mobilno);
		
	}
	public void setLocation(String loc) {
		txtLocation.sendKeys(loc);
		
	}
	public void clickCertificationCeckbox() {
		chckbxCertifications.click();
		chckbxDegree.click();
	}
	public void clickAddButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",addBtn);
		addBtn.click();;

	}
	public void setCheckemail() {
		String em = txtEmail.getText();
		checkemail.sendKeys(em);

	}
	
	
}
