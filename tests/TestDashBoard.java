package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objs.DashBoard;
import objs.CLogin;


public class TestDashBoard {
	
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
	public void testShiftPlan() {
	
		DashBoard.shiftPlan(driver);
		sacekaj();
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://jelenagreen.humanity.com/app/schedule/employee/week/overview/overview/8%2c5%2c2021/";
		Assert.assertEquals(currentUrl, expectedUrl);
		
	}
	@Test (priority =3)
	public void testClock() {
		
		DashBoard.clock(driver);
		sacekaj();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://jelenagreen.humanity.com/app/timeclock/";
		Assert.assertEquals(currentUrl, expectedUrl);
	}
	@Test(priority =4)
	public void testLeave() {

	DashBoard.leave(driver);
	sacekaj();
	String currentUrl = driver.getCurrentUrl();
	String expectedUrl = "https://jelenagreen.humanity.com/app/requests/vacation/";
	Assert.assertEquals(currentUrl, expectedUrl);
	}
	
	@Test(priority =5)
	public void testTraining() {
		
		DashBoard.training(driver);
		sacekaj();
		
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://jelenagreen.humanity.com/app/training/";
		Assert.assertEquals(currentUrl, expectedUrl);
	}
	
	@Test(priority=6)
	public void testStaff() {
		
		DashBoard.staff(driver);
		sacekaj();
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://jelenagreen.humanity.com/app/staff/list/load/true/";
		Assert.assertEquals(currentUrl, expectedUrl);
		
	}
	@Test (priority =9)
	public void testAvailabillity() {
		
		DashBoard.availabillity(driver);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://jelenagreen.humanity.com/fe/availability/#/requests/week/2021-06-06/1";
		Assert.assertEquals(currentUrl, expectedUrl);
		
	}
	@Test(priority =7)
	public void testPayroll() {
		
		DashBoard.payroll(driver);
		sacekaj();
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://jelenagreen.humanity.com/app/payroll/scheduled-hours/";
		Assert.assertEquals(currentUrl, expectedUrl);
	}
	@Test(priority =8)
	public void testReports() {
		
		driver.navigate().to(DashBoard.URL);
		sacekaj();
		DashBoard.reports(driver);
		sacekaj();
		
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://jelenagreen.humanity.com/app/reports/dashboard/";
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
