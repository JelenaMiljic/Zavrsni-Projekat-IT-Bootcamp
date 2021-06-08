package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objs.CLogin;
import objs.Profile;

public class TestProfile {

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
		sacekaj();
		
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://jelenagreen.humanity.com/app/dashboard/";
		Assert.assertEquals(currentUrl, expectedUrl);
	}
	
	
	@Test (priority =2) 
	public void testEditProfile() {
		
		Profile.prof(driver);
		sacekaj();
		Profile.profile(driver);
		sacekaj();
		Profile.editDetails(driver);
		sacekaj();
		Profile.lastName(driver, "Matic");
		sacekaj();
		Profile.nickName(driver, "Jeca");
		sacekaj();
		Profile.adress(driver, "Ulica Borska");
		sacekaj();
		Profile.city(driver, "Beograd");
		sacekaj();
		Profile.gender(driver, "Female");
		sacekaj();
		Profile.photo(driver, "C:\\photo\\pl.jpg");
		sacekaj();
		Profile.submit(driver);
		sacekaj();
		
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://jelenagreen.humanity.com/app/staff/edit/6357694/";
		Assert.assertEquals(currentUrl, expectedUrl);
	}
	
	@Test(priority = 3)
	public void testProfile() {
		
		Profile.prof(driver);
		sacekaj();
		Profile.profile(driver);
		sacekaj();
		Profile.notifications(driver);
		sacekaj();
		Profile.mobilePush(driver);
		sacekaj();
		Profile.saveNotification(driver);
		sacekaj();
		
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://jelenagreen.humanity.com/app/staff/notifications/";
		Assert.assertEquals(currentUrl, expectedUrl);
		
	}
	
	
	
	
	public static void sacekaj() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
