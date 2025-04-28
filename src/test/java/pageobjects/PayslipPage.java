package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PayslipPage extends BasePage{
	
	public PayslipPage(WebDriver driver) {
	super(driver);

}

@FindBy(xpath  ="//select[@class='selectElement'][1]")
	WebElement selectMonthDropdown;

	@FindBy(xpath = "//select[@class='selectElement'][2]")
	WebElement selectYearDropdown;
	
	
	public void setSelectMonth(String value){
		selectMonthDropdown.click();
		Select mySlct = new Select(selectMonthDropdown);
		mySlct.selectByValue(value);

	}
	public void setSelectYear(String year){
		selectYearDropdown.click();
		Select mysclct = new Select(selectYearDropdown);
		mysclct.selectByValue(year);
	}
	
	
}
