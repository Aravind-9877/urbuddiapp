package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LeaveApprovalPage extends BasePage {
	
	public LeaveApprovalPage(WebDriver driver) {
		
		super(driver);
		
		
	}
	
	@FindBy(xpath="//button[text()='Requests']")
	WebElement btnRequests;
	@FindBy(xpath="//button[text()='Approve']")
	WebElement btnApprove;
	@FindBy(xpath = "//div[@ref='eViewport'][@class='ag-body-horizontal-scroll-viewport']")
	WebElement slidersL;
	
	
	
	
	public void requestsbtn() {
		btnRequests.click();
	}
	
	public void approvebtn() {
		Actions myact = new Actions(driver);
		myact.moveToElement(btnApprove).perform();
		btnApprove.click();
		
	}
	public void slslider() {
		
		
		Actions myact = new Actions(driver);
		myact.clickAndHold(slidersL).moveByOffset(300, 0).release().perform();
		
	}
}
