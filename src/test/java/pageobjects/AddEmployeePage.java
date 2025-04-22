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
	WebElement addEmployeBtn;
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
	@FindBy(xpath="//div[@class='ag-cell ag-cell-not-inline-editing ag-cell-normal-height ag-cell-value ag-cell-focus']")
	WebElement check;
	public void addEmployee() {
		addEmployeBtn.click();
	}
	
	public void firstNametxt(String firstName) {
		txtFirstName.sendKeys(firstName);
	}
	public void lastNametxt(String lastName) {
		txtLastName.sendKeys(lastName);
	}
	public void employeidtxt(String employeid) {
		txtEmployeeId.sendKeys(employeid);
	}
	public void emailtxt(String email) {
		String  em=txtEmail.getText();
		txtEmail.sendKeys(email);
		
	}
	public void dobele(String dobdate) {
		dob.sendKeys(dobdate);
	}
	public void joiningdteele(String joindate) {
		joiningdDate.sendKeys(joindate);
	}
	public void passwordtxt(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void roledrpdwn(String value) {
		Select myslct = new Select(drpdwnRole);
		myslct.selectByValue(value);	
	}
	public void qualfctndrpdwn(String value) {
		Select myslct = new Select(drpdwnQualifications);
		myslct.selectByValue(value);
	}
	public void drpdwngndr(String value) {
		Select myslct = new Select(drpdwnGender);
		myslct.selectByValue(value);
	}
	public void bloodgrpdrpdwn(String value) {
		Select myslct = new Select(drpdwnBloodGroup);
		myslct.selectByValue(value);
	}
	public void reportingtopdwn(String value) {
		Select myslct = new Select(drpdwnReportingTo);
		myslct.selectByValue(value);
	
	}
	
	public void txtDept(String dept){
		txtDeparment.sendKeys(dept);
	}
	public void txtdesgntn(String dsgntn) {
		txtDesignation.sendKeys(dsgntn);
	}
	public void txtmobilno(String mobilno) {
		txtMobileNo.sendKeys(mobilno);
		
	}
	public void txtloctn(String loc) {
		txtLocation.sendKeys(loc);
		
	}
	public void certifictnchckbx() {
		chckbxCertifications.click();
		chckbxDegree.click();
	}
	public void btnAdd() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",addBtn);
		addBtn.click();;

	}
	public void setCheckemail() {
		String em = txtEmail.getText();
		checkemail.sendKeys(em);
		String ele = check.getText();
	}
	
	
}
