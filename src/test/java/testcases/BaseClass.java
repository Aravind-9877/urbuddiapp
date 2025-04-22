package testcases;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import pageobjects.LoginPage;

public class BaseClass {

	private static ThreadLocal<WebDriver> tlocal = new ThreadLocal<>();
	public Properties p;

	public WebDriver getDriver() {
		return tlocal.get();
	}

	@BeforeClass(groups = "Regression")
	@Parameters({"os", "browser"})
	public void setup(String os, String browser) throws IOException {
		// Load config.properties file
		FileReader file = new FileReader("./src/test/resources/config.properties");
		p = new Properties();
		p.load(file);

		WebDriver driver = null;

		// Browser setup
		switch (browser.toLowerCase()) {
			case "chrome":
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				driver = new ChromeDriver(options);
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			default:
				System.out.println("Invalid browser name");
				return;
		}

		// Store driver in ThreadLocal
		tlocal.set(driver);

		// Common driver setup
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().manage().window().maximize();
		getDriver().get(p.getProperty("appURL"));
	}

	@Test(groups = "Regression")
	public void verifylogin() {
		LoginPage mypage = new LoginPage(getDriver());
		mypage.setTxtEmail(p.getProperty("userName"));
		mypage.setPassword(p.getProperty("password"));
		mypage.loginbtn();
	}

	@AfterClass(groups = "Regression")
	public void teardown() {
		if (getDriver() != null) {
			getDriver().quit();
			tlocal.remove();
		}
	}

	public String captureScreen(String tName) {
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) getDriver();
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		String dir = System.getProperty("user.dir") + "\\screenshots\\";
		new File(dir).mkdirs(); // Ensure directory exists

		String filePath = dir + tName + "_" + timeStamp + ".png";
		File targetFile = new File(filePath);
		sourceFile.renameTo(targetFile);

		return filePath;
	}
}
