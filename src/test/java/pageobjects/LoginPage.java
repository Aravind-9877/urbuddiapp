package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
		
	}
	
	@FindBy(xpath ="//input[@id='userEmail']")
			WebElement txtEmail;
	@FindBy(xpath="//input[@id='userPassword']")
	WebElement txtPassword;
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnLogin;
	
	public void setTxtEmail(String email) {
		txtEmail.sendKeys(email);
		
	}
   public void setPassword(String password) {
	   txtPassword.sendKeys(password);
   }
   public void loginBtn() {
	   btnLogin.click();
   }
   
   
   
}
