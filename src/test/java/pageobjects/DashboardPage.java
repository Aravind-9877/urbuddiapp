package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{
	
	
	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//p[text()='Employees'][@class='mt-4']")
	WebElement employeestab;
	@FindBy(xpath="//p[text()='Leave Management']")
	WebElement leavemangmnttab;
	@FindBy(xpath="//p[text()='Payslip']")
	WebElement paysliptab;
	@FindBy(xpath="//p[text()='Resource Tracking']")
	WebElement resourcetrackingtab;
	@FindBy(xpath="//p[text()='Reimbursement']")
	WebElement rembursmnttab;
	@FindBy(xpath="//p[text()='Expenditure']")
	WebElement expdntretab;
	@FindBy(xpath="//p[text()='Policies']")
	WebElement plcistab;
	@FindBy(xpath="//p[text()='Your Profile']")
	WebElement urprfletab;
	@FindBy(xpath="//p[text()='Leave Overview']")
	WebElement lveovrviewtab;
	@FindBy(xpath="//p[text()='Logout']")
	WebElement logouttab;
	
	public void employees() {
		
		employeestab.click();
		
	}
	public void leavemngmnt() {
		leavemangmnttab.click();
		
	}
	public void payslp() {
		paysliptab.click();
	}
	public void rsourcetrackng() {
		resourcetrackingtab.click();
	}
	public void rembursmnt() {
		rembursmnttab.click();
	}
	
	public void expndture() {
		
		expdntretab.click();
	}
	public void policies()
	{
		plcistab.click();	
		
	}
	public void urprfle() {
		
		urprfletab.click();
	}
	public void leaveovrvw() {
		lveovrviewtab.click();
	}
	public void logout() {
		logouttab.click();
		
	}
	
	
	
	
	
	
	
	
	
}

		
		
		
		
		
		
		
		
		
		
		