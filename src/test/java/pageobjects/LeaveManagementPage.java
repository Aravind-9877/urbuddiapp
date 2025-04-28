package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LeaveManagementPage extends BasePage {
	
	
	 public LeaveManagementPage(WebDriver driver){
		 super(driver);
	 }
	
	 @FindBy(xpath="//button[contains(text(),'Apply Leave')]")
	 WebElement btnApplyLeave;
	 @FindBy(xpath="//div[@class='modal-content']//div[2]//div//button[2]")
	 WebElement lopWarningBtn;
	 
	 @FindBy(xpath = "//input[@id='fromDate']")
	 WebElement fromDate;
	 
	 @FindBy(xpath="//input[@id='toDate']")
	 WebElement toDate;
	 @FindBy(xpath="//input[@name='subject']")
	 WebElement txtSubject;
	 @FindBy(xpath = "//textarea[@name='reason']")
	 WebElement txtReason;
	 @FindBy(xpath="//select[@name='lead']")
	 WebElement dropdownLead;
	 @FindBy(xpath="//input[@id='leave']")
	 WebElement rdBtnleave;
	 @FindBy(xpath="//button[@type='submit']")
	 WebElement btnSubmit;
	 

	 
	 
	 public void applyleave() {
		 btnApplyLeave.click();
		 
	 }
	 public void fromDate(String frmdte) {
		 fromDate.sendKeys(frmdte);
	 }
	 public void toDate(String todte) {
		 toDate.sendKeys(todte);
	 }
	 public void subjectTxt(String subject) {
		 txtSubject.sendKeys(subject);
	 }
	 public void reasonTxt(String reason) {
		 txtReason.sendKeys(reason);
	 }
	 public void leadDrpdwn() {
		 System.out.println(dropdownLead.getText());
	 }
	 public void leaveBtn() {
		 rdBtnleave.click();
	 }
	 public void submitBtn() {
		 Actions myact = new Actions(driver);
		 myact.moveToElement(btnSubmit);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();",btnSubmit);
		 btnSubmit.click();
	 }
	  public void btnLop() throws InterruptedException   {
		  try {


		  lopWarningBtn.click();
			}
		  catch(Exception e) {
			  Thread.sleep(2000);
			  lopWarningBtn.click();
		  }
		  
	  }
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

