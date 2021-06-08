package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objs.CLogin;
import objs.Settings;

public class TestSettings {
	
private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chdriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test (priority =1)
	public void testLogin() {
		driver.navigate().to(CLogin.URL);
		driver.manage().window().maximize();
		sacekaj();
		CLogin.inputUsername(driver, "zeleni@green.com");
		CLogin.inputPassword(driver, "yeleni85");
		CLogin.pressLogin(driver);
		sacekaj();
		
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://jelenagreen.humanity.com/app/dashboard/";
		Assert.assertEquals(currentUrl, expectedUrl);
	}
	 
	
	@Test (priority =2)
	public static void testDisableBtns() {
		
		Settings.settings(driver);
		sacekaj();
		Settings.disableViaEmail(driver);
		sacekaj();
		Settings.disableSMS(driver);
		sacekaj();
		Settings.disableMobile(driver);
		sacekaj();
		Settings.disableTraining(driver);
		sacekaj();
		Settings.disableReports(driver);
		sacekaj();
		Settings.disableProfileEdit(driver);
		sacekaj();
		Settings.disableStaffGalery(driver);
		sacekaj();
		Settings.disableContactDetails(driver);
		sacekaj();
		Settings.disableNow(driver);
		sacekaj();
		Settings.disableMessages(driver);
		sacekaj();
		Settings.disableComments(driver);
		sacekaj();
		Settings.disableModule(driver);
		sacekaj();
		Settings.saveSettings(driver);
		sacekaj();
		driver.navigate().refresh();
	

		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://jelenagreen.humanity.com/app/admin/settings/";
		Assert.assertEquals(currentUrl, expectedUrl);
	}
	
	@Test (priority =3)
	public void testChangeLanguage() {

		Settings.settings(driver);
		sacekaj();
		Settings.changeLanguage(driver, "Serbian (machine)");
		sacekaj();
		Settings.saveSettings(driver);
		sacekaj();
		
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://jelenagreen.humanity.com/app/admin/settings/";
		Assert.assertEquals(currentUrl, expectedUrl);
	}
	
	
	public static void sacekaj() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
